package com.nothing.cardwidget.mediaplayer.view;

import F8.AbstractC0816i;
import F8.L;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.RoundCornersFrameLayout;
import com.nothing.cardwidget.mediaplayer.entity.MusicPlaybackState;
import com.nothing.cardwidget.mediaplayer.utils.BitmapUtil;
import com.nothing.cardwidget.mediaplayer.utils.DisplayConfig;
import com.nothing.cardwidget.mediaplayer.utils.DisplayUtil;
import com.nothing.cardwidget.mediaplayer.utils.MusicDataHelper;
import com.nothing.cardwidget.util.UiUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPagerAdapter extends RecyclerView.Adapter<MediaItemViewHolder> {
    private static final int ANIM_PLAY_PAUSE_FADE_OUT = 1001;
    private static final long DURATION_PLAY_ALBUM_COVER_FADE = 350;
    private static final long DURATION_PLAY_PAUSE_FADE_IN = 250;
    private static final long DURATION_PLAY_PAUSE_FADE_OUT = 250;
    private static final long DURATION_PLAY_PAUSE_HOLD = 450;
    private static final int PAGE_COUNT = 2;
    private static final String TAG = "ViewPagerAdapter";
    private final AnimationHandle animHandler;
    private final Context context;
    private MediaItemViewHolder firstPageViewHolder;
    private boolean isAttachToWindow;
    private final Map<Integer, Icon> latestAlbumIconMap;
    private Handler mainHandler;
    private N5.b musicData;
    private boolean musicViewVisible;
    private final O8.a mutex;
    private Consumer<p079h8.u> openAppConsumer;
    private ObjectAnimator playPauseFadeInAnimation;
    private ObjectAnimator playPauseFadeOutAnimation;
    private final p219v8.l playStateCallback;
    private MediaItemViewHolder secondPageViewHolder;
    private float uiRatio;
    private final ViewPager2 viewPager2;
    private int widgetId;
    public static final Companion Companion = new Companion(null);
    private static final PathInterpolator INTERPOLATOR_PLAY_PAUSE_FADE = new PathInterpolator(0.9f, 0.01f, 0.13f, 1.0f);
    private static final PathInterpolator INTERPOLATOR_ALBUM_COVER_FADE = new PathInterpolator(0.9f, 0.01f, 0.13f, 1.0f);

    public final class AnimationHandle extends Handler {
        final /* synthetic */ ViewPagerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationHandle(ViewPagerAdapter viewPagerAdapter, Looper _looper) {
            super(_looper);
            kotlin.jvm.internal.n.h(_looper, "_looper");
            this.this$0 = viewPagerAdapter;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            kotlin.jvm.internal.n.h(msg, "msg");
            if (msg.what == ViewPagerAdapter.ANIM_PLAY_PAUSE_FADE_OUT) {
                Object obj = msg.obj;
                final View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    ViewPagerAdapter viewPagerAdapter = this.this$0;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                    objectAnimatorOfFloat.setDuration(250L);
                    objectAnimatorOfFloat.setInterpolator(ViewPagerAdapter.INTERPOLATOR_PLAY_PAUSE_FADE);
                    objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$AnimationHandle$handleMessage$1$1$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animation) {
                            kotlin.jvm.internal.n.h(animation, "animation");
                            view.setVisibility(8);
                        }
                    });
                    objectAnimatorOfFloat.start();
                    viewPagerAdapter.playPauseFadeOutAnimation = objectAnimatorOfFloat;
                }
            }
        }

        public final void sendFadeOutMsg(View target, long j9) {
            kotlin.jvm.internal.n.h(target, "target");
            Message messageObtain = Message.obtain();
            messageObtain.what = ViewPagerAdapter.ANIM_PLAY_PAUSE_FADE_OUT;
            messageObtain.obj = target;
            sendMessageDelayed(messageObtain, j9);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public final class FirstPageViewHolder extends MediaItemViewHolder {
        private ImageView albumCover0;
        private ImageView albumCover1;
        private ImageView albumCoverDefault;
        private boolean isPlaying;
        private LottieAnimationView musicWaveformAnim;
        private FrameLayout playPauseCoverLayout;
        private ImageView playPauseIcon;
        private int playState;
        final /* synthetic */ ViewPagerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstPageViewHolder(ViewPagerAdapter viewPagerAdapter, View itemView) {
            super(viewPagerAdapter, itemView);
            kotlin.jvm.internal.n.h(itemView, "itemView");
            this.this$0 = viewPagerAdapter;
            this.albumCoverDefault = (ImageView) itemView.findViewById(R.id.music_album_cover_default);
            this.albumCover0 = (ImageView) itemView.findViewById(R.id.music_album_cover_state_0);
            this.albumCover1 = (ImageView) itemView.findViewById(R.id.music_album_cover_state_1);
            this.musicWaveformAnim = (LottieAnimationView) itemView.findViewById(R.id.music_waveform);
            this.playPauseIcon = (ImageView) itemView.findViewById(R.id.play_pause_icon);
            this.playPauseCoverLayout = (FrameLayout) itemView.findViewById(R.id.play_pause_cover_layout);
            itemView.setTag(this);
            LottieAnimationView lottieAnimationView = this.musicWaveformAnim;
            UiUtil uiUtil = UiUtil.INSTANCE;
            Context context = lottieAnimationView.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            lottieAnimationView.setAnimation(uiUtil.isDarkTheme(context) ? R.raw.music_waveform_play_dark : R.raw.music_waveform_play_light);
            lottieAnimationView.setRepeatCount(-1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAlbumArtClick$lambda$2(FirstPageViewHolder this$0, ViewPagerAdapter this$1, View view) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(this$1, "this$1");
            onAlbumArtClick$onClick(this$0, this$1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAlbumArtClick$lambda$3(FirstPageViewHolder this$0, ViewPagerAdapter this$1, View view) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(this$1, "this$1");
            onAlbumArtClick$onClick(this$0, this$1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAlbumArtClick$lambda$4(FirstPageViewHolder this$0, ViewPagerAdapter this$1, View view) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(this$1, "this$1");
            onAlbumArtClick$onClick(this$0, this$1);
        }

        private static final void onAlbumArtClick$onClick(FirstPageViewHolder firstPageViewHolder, ViewPagerAdapter viewPagerAdapter) {
            if (firstPageViewHolder.playPauseCoverLayout.getVisibility() == 0) {
                return;
            }
            MusicPlaybackState.Companion companion = MusicPlaybackState.Companion;
            if (!companion.isConnected(firstPageViewHolder.playState)) {
                firstPageViewHolder.openApp(viewPagerAdapter.getContext(), viewPagerAdapter.musicData, true);
                return;
            }
            firstPageViewHolder.playPauseIcon.setImageDrawable(companion.isPlaying(firstPageViewHolder.playState) ? p060g.a.b(viewPagerAdapter.getContext(), R.drawable.music_first_item_pause_icon) : p060g.a.b(viewPagerAdapter.getContext(), R.drawable.music_first_item_play_icon));
            FrameLayout frameLayout = firstPageViewHolder.playPauseCoverLayout;
            frameLayout.setVisibility(0);
            viewPagerAdapter.startPlayPauseCoverAnimation(frameLayout);
            viewPagerAdapter.getPlayStateCallback().f(Boolean.valueOf(!firstPageViewHolder.isPlaying));
        }

        private final void playWaveformAnim(boolean z9) {
            if (this.this$0.isAttachToWindow) {
                boolean z10 = this.this$0.musicViewVisible && this.isPlaying;
                LottieAnimationView lottieAnimationView = this.musicWaveformAnim;
                if (z10 && !lottieAnimationView.isAnimating()) {
                    lottieAnimationView.playAnimation();
                } else if (!z10 && lottieAnimationView.isAnimating()) {
                    lottieAnimationView.pauseAnimation();
                    lottieAnimationView.setProgress(0.0f);
                }
                if (z9) {
                    tintWaveFormColor(this.albumCover0.getDrawable());
                }
            }
        }

        static /* synthetic */ void playWaveformAnim$default(FirstPageViewHolder firstPageViewHolder, boolean z9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = true;
            }
            firstPageViewHolder.playWaveformAnim(z9);
        }

        private final void runAlbumCoverAnimation(N5.b bVar, boolean z9) {
            Log.d(ViewPagerAdapter.TAG, "runAlbumCoverAnimation");
            if (!this.this$0.hasAlbumIcon(bVar)) {
                MusicDataHelper.INSTANCE.markMusicFlag(this.this$0.widgetId, bVar);
                this.albumCoverDefault.setVisibility(0);
                this.albumCover0.setVisibility(8);
                this.albumCover0.setImageDrawable(null);
                this.albumCover1.setVisibility(8);
                this.albumCover1.setImageDrawable(null);
                tintWaveFormColor(null);
                return;
            }
            this.albumCoverDefault.setVisibility(8);
            if (this.this$0.isEqualLastMusic(bVar) || z9) {
                MusicDataHelper.INSTANCE.markMusicFlag(this.this$0.widgetId, bVar);
                final ImageView imageView = this.albumCover0;
                ViewPagerAdapter viewPagerAdapter = this.this$0;
                imageView.setVisibility(0);
                viewPagerAdapter.loadAlbumDrawable(imageView, bVar, R.drawable.music_album_cover_icon_default, new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.s
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return ViewPagerAdapter.FirstPageViewHolder.runAlbumCoverAnimation$lambda$22$lambda$21(imageView, this, (Drawable) obj);
                    }
                });
                return;
            }
            MusicDataHelper.INSTANCE.markMusicFlag(this.this$0.widgetId, bVar);
            ImageView imageView2 = this.albumCover1;
            Drawable drawable = this.albumCover0.getDrawable();
            if (drawable != null) {
                imageView2.setImageDrawable(drawable);
                imageView2.setVisibility(0);
            }
            final ImageView imageView3 = this.albumCover0;
            this.this$0.loadAlbumDrawable(imageView3, bVar, R.drawable.music_album_cover_icon_default, new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.r
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return ViewPagerAdapter.FirstPageViewHolder.runAlbumCoverAnimation$lambda$19$lambda$18(imageView3, this, (Drawable) obj);
                }
            });
            imageView3.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.albumCover1, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.albumCover0, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(ViewPagerAdapter.INTERPOLATOR_ALBUM_COVER_FADE);
            animatorSet.setDuration(ViewPagerAdapter.DURATION_PLAY_ALBUM_COVER_FADE);
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$FirstPageViewHolder$runAlbumCoverAnimation$3$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    kotlin.jvm.internal.n.h(animation, "animation");
                    this.this$0.albumCover1.setVisibility(8);
                    this.this$0.albumCover0.setVisibility(0);
                }
            });
            animatorSet.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A runAlbumCoverAnimation$lambda$19$lambda$18(ImageView this_with, FirstPageViewHolder this$0, Drawable it) {
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(it, "it");
            this_with.setImageDrawable(it);
            this$0.tintWaveFormColor(it);
            return p079h8.A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A runAlbumCoverAnimation$lambda$22$lambda$21(ImageView this_with, FirstPageViewHolder this$0, Drawable it) {
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(it, "it");
            this_with.setImageDrawable(it);
            this$0.tintWaveFormColor(it);
            return p079h8.A.f21846a;
        }

        private final void tintWaveFormColor(final Drawable drawable) {
            final int color = this.this$0.getContext().getResources().getColor(R.color.color_music_waveform_default, null);
            this.this$0.viewPager2.post(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.p
                @Override // java.lang.Runnable
                public final void run() {
                    ViewPagerAdapter.FirstPageViewHolder.tintWaveFormColor$lambda$15(drawable, this, color);
                }
            });
        }

        private static final int tintWaveFormColor$getTintColor(FirstPageViewHolder firstPageViewHolder, int i10, p022c1.b bVar) {
            c1.b.e eVarG = bVar.g();
            if (eVarG == null && (eVarG = bVar.h()) == null && (eVarG = bVar.f()) == null) {
                eVarG = bVar.l();
            }
            return eVarG != null ? eVarG.b() : i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void tintWaveFormColor$lambda$15(Drawable drawable, final FirstPageViewHolder this$0, final int i10) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            if (drawable != null) {
                if ((drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null) != null) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    p022c1.b.b(bitmap).h(0, Math.max(bitmap.getHeight() - 126, 0), Math.min(137, bitmap.getWidth()), bitmap.getHeight()).a().c(new c1.b.d() { // from class: com.nothing.cardwidget.mediaplayer.view.q
                        @Override // c1.b.d
                        public final void a(p022c1.b bVar) {
                            ViewPagerAdapter.FirstPageViewHolder.tintWaveFormColor$lambda$15$lambda$14$lambda$13$lambda$12(this.f18066a, i10, bVar);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void tintWaveFormColor$lambda$15$lambda$14$lambda$13$lambda$12(FirstPageViewHolder this$0, int i10, p022c1.b bVar) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            if (bVar == null) {
                return;
            }
            final int iTintWaveFormColor$getTintColor = tintWaveFormColor$getTintColor(this$0, i10, bVar);
            this$0.musicWaveformAnim.addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, (SimpleLottieValueCallback<ColorFilter>) new SimpleLottieValueCallback() { // from class: com.nothing.cardwidget.mediaplayer.view.w
                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    return ViewPagerAdapter.FirstPageViewHolder.tintWaveFormColor$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10(iTintWaveFormColor$getTintColor, lottieFrameInfo);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ColorFilter tintWaveFormColor$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10(int i10, LottieFrameInfo lottieFrameInfo) {
            return new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void bind(N5.b bVar) {
            updateMusicMetaData(bVar, true);
            onAlbumArtClick();
            updateDisplayRatio(this.this$0.uiRatio);
        }

        public final void cancelWaveFormAnimation() {
            this.musicWaveformAnim.cancelAnimation();
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void onAlbumArtClick() {
            ImageView imageView = this.albumCoverDefault;
            final ViewPagerAdapter viewPagerAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPagerAdapter.FirstPageViewHolder.onAlbumArtClick$lambda$2(this.f18072q, viewPagerAdapter, view);
                }
            });
            ImageView imageView2 = this.albumCover0;
            final ViewPagerAdapter viewPagerAdapter2 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPagerAdapter.FirstPageViewHolder.onAlbumArtClick$lambda$3(this.f18074q, viewPagerAdapter2, view);
                }
            });
            ImageView imageView3 = this.albumCover1;
            final ViewPagerAdapter viewPagerAdapter3 = this.this$0;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPagerAdapter.FirstPageViewHolder.onAlbumArtClick$lambda$4(this.f18076q, viewPagerAdapter3, view);
                }
            });
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void onVisibilityChanged() {
            playWaveformAnim(false);
        }

        public final void resumeWaveFormAnimation() {
            playWaveformAnim$default(this, false, 1, null);
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void updateDisplayRatio(float f10) {
            LottieAnimationView lottieAnimationView = this.musicWaveformAnim;
            int iB = p239x8.a.b(126 * f10);
            DisplayUtil displayUtil = DisplayUtil.INSTANCE;
            displayUtil.setViewSize(lottieAnimationView, Integer.valueOf(iB), Integer.valueOf(iB));
            int iB2 = p239x8.a.b(11 * f10);
            displayUtil.setViewMargin(lottieAnimationView, DisplayUtil.MARGIN_START, iB2);
            displayUtil.setViewMargin(lottieAnimationView, DisplayUtil.MARGIN_BOTTOM, iB2);
            displayUtil.setViewSize(this.albumCoverDefault, Integer.valueOf(p239x8.a.b(DisplayConfig.Common.STANDARD_MUSIC_DEFAULT_ICON_WIDTH * f10)), Integer.valueOf(p239x8.a.b(DisplayConfig.Common.STANDARD_MUSIC_DEFAULT_ICON_HEIGHT * f10)));
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void updateMusicMetaData(N5.b bVar, boolean z9) {
            if (bVar != null) {
                runAlbumCoverAnimation(bVar, z9);
            }
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void updatePlayBackState(int i10) {
            Log.d(ViewPagerAdapter.TAG, "updatePlayBackState playState: " + i10);
            this.playState = i10;
            this.isPlaying = MusicPlaybackState.Companion.isPlaying(i10);
            playWaveformAnim$default(this, false, 1, null);
        }
    }

    public abstract class MediaItemViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ ViewPagerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaItemViewHolder(ViewPagerAdapter viewPagerAdapter, View itemView) {
            super(itemView);
            kotlin.jvm.internal.n.h(itemView, "itemView");
            this.this$0 = viewPagerAdapter;
        }

        private final void doStartApplicationWithPackageName(Context context, String str) {
            Object objB;
            p079h8.A a10;
            if (str != null) {
                try {
                    h8.q.a aVar = p079h8.q.f21862r;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.setFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        a10 = p079h8.A.f21846a;
                    } else {
                        a10 = null;
                    }
                    objB = p079h8.q.b(a10);
                } catch (Throwable th) {
                    h8.q.a aVar2 = p079h8.q.f21862r;
                    objB = p079h8.q.b(p079h8.r.a(th));
                }
                Throwable thD = p079h8.q.d(objB);
                if (thD != null) {
                    Log.e(ViewPagerAdapter.TAG, "doStartApplicationWithPackageName error: " + thD);
                }
                p079h8.q.a(objB);
            }
        }

        private final void trackMediaPlayerOnOpenApp(Context context, int i10, N5.b bVar) {
            if (bVar != null) {
                O5.i iVar = O5.i.f5904a;
                String strK = bVar.k();
                String strH = bVar.h();
                String str = strH == null ? "" : strH;
                String strF = bVar.f();
                String str2 = strF == null ? "" : strF;
                String strL = bVar.l();
                iVar.c(context, i10, 8, strK, str, str2, strL == null ? "" : strL);
            }
        }

        public static /* synthetic */ void updateMusicMetaData$default(MediaItemViewHolder mediaItemViewHolder, N5.b bVar, boolean z9, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMusicMetaData");
            }
            if ((i10 & 2) != 0) {
                z9 = false;
            }
            mediaItemViewHolder.updateMusicMetaData(bVar, z9);
        }

        public abstract void bind(N5.b bVar);

        public abstract void onAlbumArtClick();

        public void onVisibilityChanged() {
        }

        public final void openApp(Context context, N5.b bVar, boolean z9) {
            kotlin.jvm.internal.n.h(context, "context");
            if (!z9) {
                if ((bVar != null ? bVar.i() : null) != null) {
                    trackMediaPlayerOnOpenApp(context, this.this$0.widgetId, bVar);
                    Consumer consumer = this.this$0.openAppConsumer;
                    if (consumer == null) {
                        doStartApplicationWithPackageName(context, bVar.l());
                        return;
                    }
                    ViewPager2 viewPager2 = this.this$0.viewPager2;
                    PendingIntent pendingIntentI = bVar.i();
                    kotlin.jvm.internal.n.e(pendingIntentI);
                    consumer.accept(new p079h8.u(viewPager2, pendingIntentI, bVar.l()));
                    return;
                }
            }
            doStartApplicationWithPackageName(context, bVar != null ? bVar.l() : null);
        }

        public abstract void updateDisplayRatio(float f10);

        public abstract void updateMusicMetaData(N5.b bVar, boolean z9);

        public abstract void updatePlayBackState(int i10);
    }

    public final class SecondPageViewHolder extends MediaItemViewHolder {
        private RoundCornersFrameLayout albumIconLayout;
        private ImageView albumSmallIcon;
        private ImageView appIcon;
        private TextView artistAndAlbumName;
        private int currentProgress;
        private boolean isPlaying;
        private TextView musicName;
        private LinearLayout musicNameLayout;
        private ImageView playPauseCover;
        private int playState;
        private ProgressBar progressBar;
        final /* synthetic */ ViewPagerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondPageViewHolder(ViewPagerAdapter viewPagerAdapter, View itemView) {
            super(viewPagerAdapter, itemView);
            kotlin.jvm.internal.n.h(itemView, "itemView");
            this.this$0 = viewPagerAdapter;
            this.albumIconLayout = (RoundCornersFrameLayout) itemView.findViewById(R.id.music_album_small_icon_layout);
            this.playPauseCover = (ImageView) itemView.findViewById(R.id.play_pause_cover);
            this.albumSmallIcon = (ImageView) itemView.findViewById(R.id.music_album_small_icon);
            this.appIcon = (ImageView) itemView.findViewById(R.id.second_music_app_icon);
            this.musicNameLayout = (LinearLayout) itemView.findViewById(R.id.music_name_layout);
            this.musicName = (TextView) itemView.findViewById(R.id.music_name);
            this.artistAndAlbumName = (TextView) itemView.findViewById(R.id.artist_album_name);
            this.progressBar = (ProgressBar) itemView.findViewById(R.id.music_position_bar);
            itemView.setTag(this);
            viewPagerAdapter.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.SecondPageViewHolder.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i10) {
                    if (i10 == 1) {
                        SecondPageViewHolder.this.musicNameLayout.setFocusableInTouchMode(true);
                        SecondPageViewHolder.this.musicName.setFocusableInTouchMode(true);
                    }
                }
            });
        }

        private final void bindViewData(N5.b bVar) {
            updateMusicMetaData(bVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAlbumArtClick$lambda$1(SecondPageViewHolder this$0, ViewPagerAdapter this$1, View view) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(this$1, "this$1");
            if (this$0.playPauseCover.getVisibility() == 0) {
                return;
            }
            if (!MusicPlaybackState.Companion.isConnected(this$0.playState)) {
                this$0.openApp(this$1.getContext(), this$1.musicData, true);
                return;
            }
            ImageView imageView = this$0.playPauseCover;
            imageView.setImageDrawable(this$0.isPlaying ? p060g.a.b(imageView.getContext(), R.drawable.music_pause_small_icon) : p060g.a.b(imageView.getContext(), R.drawable.music_play_small_icon));
            imageView.setVisibility(0);
            this$1.startPlayPauseCoverAnimation(imageView);
            this$1.getPlayStateCallback().f(Boolean.valueOf(!this$0.isPlaying));
        }

        private final void setArtistAndAlbumName(N5.b bVar) {
            final TextView textView = this.artistAndAlbumName;
            String str = "";
            if (!TextUtils.isEmpty(bVar.h()) || !TextUtils.isEmpty(bVar.f())) {
                if (bVar.h() == null || bVar.f() == null) {
                    String strH = bVar.h();
                    if (strH == null) {
                        String strF = bVar.f();
                        if (strF != null) {
                            str = strF;
                        }
                    } else {
                        str = strH;
                    }
                } else {
                    str = bVar.h() + "-" + bVar.f();
                }
            }
            textView.setText(str);
            textView.post(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.B
                @Override // java.lang.Runnable
                public final void run() {
                    ViewPagerAdapter.SecondPageViewHolder.setArtistAndAlbumName$lambda$19$lambda$18(textView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setArtistAndAlbumName$lambda$19$lambda$18(TextView this_with) {
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            this_with.setSelected(true);
        }

        @SuppressLint({"ResourceType"})
        private final void tintAppIconColor(Bitmap bitmap, p219v8.l lVar) {
            lVar.f(BitmapUtil.INSTANCE.colorizeBitmap(bitmap, this.this$0.getContext().getResources().getColor(R.color.color_app_icon_default, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateMusicMetaData$lambda$11$lambda$10(TextView this_with) {
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            this_with.setSelected(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateMusicMetaData$lambda$7$lambda$5(final ImageView this_with, SecondPageViewHolder this$0, Drawable drawable) {
            Bitmap bitmapDrawableToBitmap$default;
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            kotlin.jvm.internal.n.h(this$0, "this$0");
            this_with.setImageDrawable(drawable);
            if (drawable == null || (bitmapDrawableToBitmap$default = BitmapUtil.drawableToBitmap$default(BitmapUtil.INSTANCE, drawable, 0, 0, 6, null)) == null) {
                return;
            }
            this$0.tintAppIconColor(bitmapDrawableToBitmap$default, new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.C
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return ViewPagerAdapter.SecondPageViewHolder.updateMusicMetaData$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2(this_with, (Bitmap) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A updateMusicMetaData$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2(ImageView this_with, Bitmap covertBitmap) {
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            kotlin.jvm.internal.n.h(covertBitmap, "covertBitmap");
            this_with.setImageBitmap(covertBitmap);
            return p079h8.A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateMusicMetaData$lambda$7$lambda$6(SecondPageViewHolder this$0, ImageView this_with, ViewPagerAdapter this$1, View view) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            kotlin.jvm.internal.n.h(this$1, "this$1");
            boolean zIsConnected = MusicPlaybackState.Companion.isConnected(this$0.playState);
            Context context = this_with.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            this$0.openApp(context, this$1.musicData, !zIsConnected);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A updateMusicMetaData$lambda$9$lambda$8(ImageView this_with, Drawable it) {
            kotlin.jvm.internal.n.h(this_with, "$this_with");
            kotlin.jvm.internal.n.h(it, "it");
            this_with.setImageDrawable(it);
            return p079h8.A.f21846a;
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void bind(N5.b bVar) {
            bindViewData(bVar);
            onAlbumArtClick();
            updateDisplayRatio(this.this$0.uiRatio);
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void onAlbumArtClick() {
            ImageView imageView = this.albumSmallIcon;
            final ViewPagerAdapter viewPagerAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPagerAdapter.SecondPageViewHolder.onAlbumArtClick$lambda$1(this.f18044q, viewPagerAdapter, view);
                }
            });
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void onVisibilityChanged() {
            if (this.this$0.musicViewVisible) {
                this.progressBar.setProgress(this.currentProgress, true);
            }
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void updateDisplayRatio(float f10) {
            Log.d(ViewPagerAdapter.TAG, "updateDisplayRatio second page ratio: " + f10);
            RoundCornersFrameLayout roundCornersFrameLayout = this.albumIconLayout;
            int iB = p239x8.a.b(((float) DisplayConfig.SecondPage.STANDARD_ALBUM_SMALL_ICON_SIZE) * f10);
            DisplayUtil displayUtil = DisplayUtil.INSTANCE;
            displayUtil.setViewSize(roundCornersFrameLayout, Integer.valueOf(iB), Integer.valueOf(iB));
            float f11 = 42 * f10;
            displayUtil.setViewMargin(roundCornersFrameLayout, DisplayUtil.MARGIN_START, p239x8.a.b(f11));
            displayUtil.setViewMargin(roundCornersFrameLayout, DisplayUtil.MARGIN_TOP, p239x8.a.b(f11));
            ImageView imageView = this.appIcon;
            int iB2 = p239x8.a.b(126 * f10);
            displayUtil.setViewSize(imageView, Integer.valueOf(iB2), Integer.valueOf(iB2));
            int iB3 = p239x8.a.b(26 * f10);
            displayUtil.setViewPadding(imageView, Integer.valueOf(iB3), Integer.valueOf(iB3), Integer.valueOf(iB3), Integer.valueOf(iB3));
            int iB4 = p239x8.a.b(11 * f10);
            displayUtil.setViewMargin(imageView, DisplayUtil.MARGIN_TOP, iB4);
            displayUtil.setViewMargin(imageView, DisplayUtil.MARGIN_END, iB4);
            LinearLayout linearLayout = this.musicNameLayout;
            float f12 = 32 * f10;
            int iB5 = p239x8.a.b(f12);
            int iB6 = p239x8.a.b(f11);
            displayUtil.setViewMargin(linearLayout, DisplayUtil.MARGIN_TOP, iB5);
            displayUtil.setViewMargin(linearLayout, DisplayUtil.MARGIN_START, iB6);
            displayUtil.setViewMargin(linearLayout, DisplayUtil.MARGIN_END, iB6);
            this.musicName.setTextSize(0, f11);
            this.artistAndAlbumName.setTextSize(0, 37 * f10);
            ProgressBar progressBar = this.progressBar;
            int iB7 = p239x8.a.b(f12);
            int iB8 = p239x8.a.b(f11);
            displayUtil.setViewMargin(progressBar, DisplayUtil.MARGIN_TOP, iB7);
            displayUtil.setViewMargin(progressBar, DisplayUtil.MARGIN_START, iB8);
            displayUtil.setViewMargin(progressBar, DisplayUtil.MARGIN_END, iB8);
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void updateMusicMetaData(N5.b bVar, boolean z9) {
            if (bVar == null) {
                return;
            }
            final ImageView imageView = this.appIcon;
            final ViewPagerAdapter viewPagerAdapter = this.this$0;
            if (bVar.g() != null) {
                imageView.setVisibility(0);
                Icon iconG = bVar.g();
                if (iconG != null) {
                    iconG.loadDrawableAsync(imageView.getContext(), new Icon.OnDrawableLoadedListener() { // from class: com.nothing.cardwidget.mediaplayer.view.x
                        @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                        public final void onDrawableLoaded(Drawable drawable) {
                            ViewPagerAdapter.SecondPageViewHolder.updateMusicMetaData$lambda$7$lambda$5(imageView, this, drawable);
                        }
                    }, viewPagerAdapter.mainHandler);
                }
            } else {
                imageView.setVisibility(8);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPagerAdapter.SecondPageViewHolder.updateMusicMetaData$lambda$7$lambda$6(this.f18081q, imageView, viewPagerAdapter, view);
                }
            });
            final ImageView imageView2 = this.albumSmallIcon;
            this.this$0.loadAlbumDrawable(imageView2, bVar, R.drawable.album_cover_small_icon, new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.z
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return ViewPagerAdapter.SecondPageViewHolder.updateMusicMetaData$lambda$9$lambda$8(imageView2, (Drawable) obj);
                }
            });
            final TextView textView = this.musicName;
            textView.setText(bVar.k());
            textView.post(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.A
                @Override // java.lang.Runnable
                public final void run() {
                    ViewPagerAdapter.SecondPageViewHolder.updateMusicMetaData$lambda$11$lambda$10(textView);
                }
            });
            setArtistAndAlbumName(bVar);
        }

        public final void updateMusicPosition(int i10) {
            this.currentProgress = i10;
            if (this.this$0.musicViewVisible) {
                this.progressBar.setProgress(i10, true);
            }
        }

        @Override // com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.MediaItemViewHolder
        public void updatePlayBackState(int i10) {
            Log.d(ViewPagerAdapter.TAG, "updatePlayBackState playState: " + i10);
            this.isPlaying = MusicPlaybackState.Companion.isPlaying(i10);
            this.playState = i10;
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$getDesiredAlbumIcon$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter", f = "ViewPagerAdapter.kt", l = {848, 819}, m = "getDesiredAlbumIcon")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(p129m8.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewPagerAdapter.this.getDesiredAlbumIcon(null, this);
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$getHighResolutionAlbumIcon$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter", f = "ViewPagerAdapter.kt", l = {830}, m = "getHighResolutionAlbumIcon")
    static final class C12361 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C12361(p129m8.e<? super C12361> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewPagerAdapter.this.getHighResolutionAlbumIcon(null, this);
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1", f = "ViewPagerAdapter.kt", l = {690, 695, 697}, m = "invokeSuspend")
    static final class C12371 extends kotlin.coroutines.jvm.internal.l implements p219v8.p {
        final /* synthetic */ N5.b $data;
        final /* synthetic */ int $defaultRes;
        final /* synthetic */ p219v8.l $listener;
        final /* synthetic */ ImageView $this_loadAlbumDrawable;
        int label;
        final /* synthetic */ ViewPagerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12371(N5.b bVar, ImageView imageView, ViewPagerAdapter viewPagerAdapter, p219v8.l lVar, int i10, p129m8.e<? super C12371> eVar) {
            super(2, eVar);
            this.$data = bVar;
            this.$this_loadAlbumDrawable = imageView;
            this.this$0 = viewPagerAdapter;
            this.$listener = lVar;
            this.$defaultRes = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(p219v8.l lVar, Drawable drawable) {
            kotlin.jvm.internal.n.e(drawable);
            lVar.f(drawable);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e<p079h8.A> create(Object obj, p129m8.e<?> eVar) {
            return new C12371(this.$data, this.$this_loadAlbumDrawable, this.this$0, this.$listener, this.$defaultRes, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e<? super p079h8.A> eVar) {
            return ((C12371) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0063  */
        /* JADX WARN: Code duplicated, block: B:25:0x007a  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        
            if (F8.AbstractC0812g.g(r4, r5, r8) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r8.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                p079h8.r.b(r9)
                goto L90
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1f:
                p079h8.r.b(r9)
                goto L5f
            L23:
                p079h8.r.b(r9)
                goto L52
            L27:
                p079h8.r.b(r9)
                N5.b r9 = r8.$data
                android.graphics.drawable.Icon r9 = r9.a()
                if (r9 == 0) goto L52
                android.widget.ImageView r1 = r8.$this_loadAlbumDrawable
                android.content.Context r1 = r1.getContext()
                android.graphics.drawable.Drawable r9 = r9.loadDrawable(r1)
                if (r9 == 0) goto L52
                v8.l r1 = r8.$listener
                F8.H0 r6 = F8.C0803b0.c()
                com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1$1$1 r7 = new com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1$1$1
                r7.<init>(r1, r9, r2)
                r8.label = r5
                java.lang.Object r9 = F8.AbstractC0812g.g(r6, r7, r8)
                if (r9 != r0) goto L52
                goto L8f
            L52:
                com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter r9 = r8.this$0
                N5.b r1 = r8.$data
                r8.label = r4
                java.lang.Object r9 = com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.access$getDesiredAlbumIcon(r9, r1, r8)
                if (r9 != r0) goto L5f
                goto L8f
            L5f:
                android.graphics.drawable.Icon r9 = (android.graphics.drawable.Icon) r9
                if (r9 == 0) goto L7a
                android.widget.ImageView r0 = r8.$this_loadAlbumDrawable
                android.content.Context r0 = r0.getContext()
                v8.l r1 = r8.$listener
                com.nothing.cardwidget.mediaplayer.view.E r2 = new com.nothing.cardwidget.mediaplayer.view.E
                r2.<init>()
                com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter r8 = r8.this$0
                android.os.Handler r8 = com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.access$getMainHandler$p(r8)
                r9.loadDrawableAsync(r0, r2, r8)
                goto L90
            L7a:
                android.widget.ImageView r9 = r8.$this_loadAlbumDrawable
                int r1 = r8.$defaultRes
                F8.H0 r4 = F8.C0803b0.c()
                com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1$3$1 r5 = new com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1$3$1
                r5.<init>(r9, r1, r2)
                r8.label = r3
                java.lang.Object r8 = F8.AbstractC0812g.g(r4, r5, r8)
                if (r8 != r0) goto L90
            L8f:
                return r0
            L90:
                h8.A r8 = p079h8.A.f21846a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter.C12371.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ViewPagerAdapter(Context context, ViewPager2 viewPager2, p219v8.l playStateCallback) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(viewPager2, "viewPager2");
        kotlin.jvm.internal.n.h(playStateCallback, "playStateCallback");
        this.context = context;
        this.viewPager2 = viewPager2;
        this.playStateCallback = playStateCallback;
        this.uiRatio = 1.0f;
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.n.g(mainLooper, "getMainLooper(...)");
        this.animHandler = new AnimationHandle(this, mainLooper);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.widgetId = -1;
        this.latestAlbumIconMap = Collections.synchronizedMap(new LinkedHashMap());
        this.mutex = O8.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x009b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0037, B:29:0x0097, B:31:0x009b), top: B:46:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:35:0x00a6, B:37:0x00aa, B:23:0x006c, B:25:0x007f), top: B:44:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getDesiredAlbumIcon(N5.b bVar, p129m8.e<? super Icon> eVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        O8.a aVar;
        Icon icon;
        ViewPagerAdapter viewPagerAdapter;
        O8.a aVar2;
        Icon icon2;
        Icon iconA;
        if (eVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) eVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(eVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(eVar);
        }
        Object obj = anonymousClass1.result;
        Object objE = p139n8.b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                p079h8.r.b(obj);
                aVar = this.mutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = bVar;
                anonymousClass1.L$2 = aVar;
                anonymousClass1.label = 1;
                if (aVar.c(null, anonymousClass1) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (O8.a) anonymousClass1.L$2;
                bVar = (N5.b) anonymousClass1.L$1;
                viewPagerAdapter = (ViewPagerAdapter) anonymousClass1.L$0;
                try {
                    p079h8.r.b(obj);
                    iconA = (Icon) obj;
                    if (iconA == null) {
                        iconA = bVar.a();
                    }
                    icon = iconA;
                    aVar = aVar2;
                    this = viewPagerAdapter;
                    icon2 = icon;
                    if (icon2 != null) {
                        Map<Integer, Icon> latestAlbumIconMap = this.latestAlbumIconMap;
                        kotlin.jvm.internal.n.g(latestAlbumIconMap, "latestAlbumIconMap");
                        latestAlbumIconMap.put(kotlin.coroutines.jvm.internal.b.c(bVar.e()), icon2);
                    } else {
                        icon2 = null;
                    }
                    aVar.b(null);
                    return icon2;
                } catch (Throwable th) {
                    th = th;
                    aVar2.b(null);
                    throw th;
                }
            }
            O8.a aVar3 = (O8.a) anonymousClass1.L$2;
            bVar = (N5.b) anonymousClass1.L$1;
            ViewPagerAdapter viewPagerAdapter2 = (ViewPagerAdapter) anonymousClass1.L$0;
            p079h8.r.b(obj);
            aVar = aVar3;
            this = viewPagerAdapter2;
            Map<Integer, Icon> latestAlbumIconMap2 = this.latestAlbumIconMap;
            kotlin.jvm.internal.n.g(latestAlbumIconMap2, "latestAlbumIconMap");
            icon = latestAlbumIconMap2.get(kotlin.coroutines.jvm.internal.b.c(bVar.e()));
            if (icon == null) {
                this.latestAlbumIconMap.clear();
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = bVar;
                anonymousClass1.L$2 = aVar;
                anonymousClass1.label = 2;
                Object highResolutionAlbumIcon = this.getHighResolutionAlbumIcon(bVar, anonymousClass1);
                if (highResolutionAlbumIcon != objE) {
                    viewPagerAdapter = this;
                    aVar2 = aVar;
                    obj = highResolutionAlbumIcon;
                    iconA = (Icon) obj;
                    if (iconA == null) {
                        iconA = bVar.a();
                    }
                    icon = iconA;
                    aVar = aVar2;
                    this = viewPagerAdapter;
                }
                return objE;
            }
            icon2 = icon;
            if (icon2 != null) {
                Map<Integer, Icon> latestAlbumIconMap3 = this.latestAlbumIconMap;
                kotlin.jvm.internal.n.g(latestAlbumIconMap3, "latestAlbumIconMap");
                latestAlbumIconMap3.put(kotlin.coroutines.jvm.internal.b.c(bVar.e()), icon2);
            } else {
                icon2 = null;
            }
            aVar.b(null);
            return icon2;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHighResolutionAlbumIcon(N5.b bVar, p129m8.e<? super Icon> eVar) {
        C12361 c12361;
        if (eVar instanceof C12361) {
            c12361 = (C12361) eVar;
            int i10 = c12361.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c12361.label = i10 - Integer.MIN_VALUE;
            } else {
                c12361 = new C12361(eVar);
            }
        } else {
            c12361 = new C12361(eVar);
        }
        Object availableBitmap = c12361.result;
        Object objE = p139n8.b.e();
        int i11 = c12361.label;
        if (i11 == 0) {
            p079h8.r.b(availableBitmap);
            List<String> listO = AbstractC1444s.o(bVar.b(), bVar.c(), bVar.d());
            BitmapUtil bitmapUtil = BitmapUtil.INSTANCE;
            Context context = this.context;
            c12361.label = 1;
            availableBitmap = bitmapUtil.getAvailableBitmap(context, listO, c12361);
            if (availableBitmap == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(availableBitmap);
        }
        Bitmap bitmap = (Bitmap) availableBitmap;
        if (bitmap != null) {
            return Icon.createWithBitmap(bitmap);
        }
        return null;
    }

    private final MediaItemViewHolder getViewHolder(int i10) {
        View childAt = this.viewPager2.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        View childAt2 = viewGroup != null ? viewGroup.getChildAt(i10) : null;
        Object tag = childAt2 != null ? childAt2.getTag() : null;
        MediaItemViewHolder mediaItemViewHolder = tag instanceof MediaItemViewHolder ? (MediaItemViewHolder) tag : null;
        if (mediaItemViewHolder == null) {
            Log.e(TAG, "getViewHolder == null, position: " + i10);
            p079h8.A a10 = p079h8.A.f21846a;
        }
        return mediaItemViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasAlbumIcon(N5.b bVar) {
        return (bVar.a() == null && bVar.b() == null && bVar.c() == null && bVar.d() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEqualLastMusic(N5.b bVar) {
        return kotlin.jvm.internal.n.d(bVar.j(), MusicDataHelper.INSTANCE.getMusicFlag(this.widgetId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAlbumDrawable(ImageView imageView, N5.b bVar, int i10, p219v8.l lVar) {
        AbstractC0816i.d(O5.g.j(), null, null, new C12371(bVar, imageView, this, lVar, i10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObjectAnimator startPlayPauseCoverAnimation(final View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(INTERPOLATOR_PLAY_PAUSE_FADE);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$startPlayPauseCoverAnimation$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.n.h(animation, "animation");
                this.this$0.animHandler.sendFadeOutMsg(view, 450L);
            }
        });
        objectAnimatorOfFloat.start();
        this.playPauseFadeInAnimation = objectAnimatorOfFloat;
        return objectAnimatorOfFloat;
    }

    private final MediaItemViewHolder viewHolderItem1() {
        MediaItemViewHolder mediaItemViewHolder = this.firstPageViewHolder;
        if (mediaItemViewHolder != null) {
            return mediaItemViewHolder;
        }
        MediaItemViewHolder viewHolder = getViewHolder(0);
        this.firstPageViewHolder = viewHolder;
        return viewHolder;
    }

    private final MediaItemViewHolder viewHolderItem2() {
        MediaItemViewHolder mediaItemViewHolder = this.secondPageViewHolder;
        if (mediaItemViewHolder != null) {
            return mediaItemViewHolder;
        }
        MediaItemViewHolder viewHolder = getViewHolder(1);
        this.secondPageViewHolder = viewHolder;
        return viewHolder;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return i10;
    }

    public final p219v8.l getPlayStateCallback() {
        return this.playStateCallback;
    }

    public final void onAttached() {
        this.isAttachToWindow = true;
        MediaItemViewHolder mediaItemViewHolderViewHolderItem1 = viewHolderItem1();
        FirstPageViewHolder firstPageViewHolder = mediaItemViewHolderViewHolderItem1 instanceof FirstPageViewHolder ? (FirstPageViewHolder) mediaItemViewHolderViewHolderItem1 : null;
        if (firstPageViewHolder != null) {
            firstPageViewHolder.resumeWaveFormAnimation();
        }
    }

    public final void onDetached() {
        this.isAttachToWindow = false;
        MediaItemViewHolder mediaItemViewHolderViewHolderItem1 = viewHolderItem1();
        FirstPageViewHolder firstPageViewHolder = mediaItemViewHolderViewHolderItem1 instanceof FirstPageViewHolder ? (FirstPageViewHolder) mediaItemViewHolderViewHolderItem1 : null;
        if (firstPageViewHolder != null) {
            firstPageViewHolder.cancelWaveFormAnimation();
        }
    }

    public final void onVisibilityChanged(boolean z9) {
        this.musicViewVisible = z9;
        MediaItemViewHolder mediaItemViewHolderViewHolderItem1 = viewHolderItem1();
        if (mediaItemViewHolderViewHolderItem1 != null) {
            mediaItemViewHolderViewHolderItem1.onVisibilityChanged();
        }
        MediaItemViewHolder mediaItemViewHolderViewHolderItem2 = viewHolderItem2();
        if (mediaItemViewHolderViewHolderItem2 != null) {
            mediaItemViewHolderViewHolderItem2.onVisibilityChanged();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setMusicMetaData(N5.b data) {
        kotlin.jvm.internal.n.h(data, "data");
        this.musicData = data;
        notifyDataSetChanged();
    }

    public final void setOpenAppListener(Consumer<p079h8.u> consumer) {
        kotlin.jvm.internal.n.h(consumer, "consumer");
        this.openAppConsumer = consumer;
    }

    public final void setWidgetId(int i10) {
        this.widgetId = i10;
    }

    public final void updateDisplayRatio(float f10) {
        this.uiRatio = f10;
    }

    public final void updateMusicMetaData(N5.b data) {
        kotlin.jvm.internal.n.h(data, "data");
        this.musicData = data;
        MediaItemViewHolder mediaItemViewHolderViewHolderItem1 = viewHolderItem1();
        if (mediaItemViewHolderViewHolderItem1 != null) {
            MediaItemViewHolder.updateMusicMetaData$default(mediaItemViewHolderViewHolderItem1, data, false, 2, null);
        }
        MediaItemViewHolder mediaItemViewHolderViewHolderItem2 = viewHolderItem2();
        if (mediaItemViewHolderViewHolderItem2 != null) {
            MediaItemViewHolder.updateMusicMetaData$default(mediaItemViewHolderViewHolderItem2, data, false, 2, null);
        }
    }

    public final void updateMusicPosition(int i10) {
        MediaItemViewHolder mediaItemViewHolderViewHolderItem2 = viewHolderItem2();
        SecondPageViewHolder secondPageViewHolder = mediaItemViewHolderViewHolderItem2 instanceof SecondPageViewHolder ? (SecondPageViewHolder) mediaItemViewHolderViewHolderItem2 : null;
        if (secondPageViewHolder != null) {
            secondPageViewHolder.updateMusicPosition(i10);
        }
    }

    public final void updatePlayBackState(int i10) {
        MediaItemViewHolder mediaItemViewHolderViewHolderItem1 = viewHolderItem1();
        if (mediaItemViewHolderViewHolderItem1 != null) {
            mediaItemViewHolderViewHolderItem1.updatePlayBackState(i10);
        }
        MediaItemViewHolder mediaItemViewHolderViewHolderItem2 = viewHolderItem2();
        if (mediaItemViewHolderViewHolderItem2 != null) {
            mediaItemViewHolderViewHolderItem2.updatePlayBackState(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MediaItemViewHolder viewHolder, int i10) {
        kotlin.jvm.internal.n.h(viewHolder, "viewHolder");
        viewHolder.bind(this.musicData);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MediaItemViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        if (i10 == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.mediaplayer_first_item, parent, false);
            kotlin.jvm.internal.n.e(viewInflate);
            return new FirstPageViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.mediaplayer_second_item, parent, false);
        kotlin.jvm.internal.n.e(viewInflate2);
        return new SecondPageViewHolder(this, viewInflate2);
    }
}
