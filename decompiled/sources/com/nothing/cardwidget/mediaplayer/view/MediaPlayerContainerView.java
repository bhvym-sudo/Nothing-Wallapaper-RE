package com.nothing.cardwidget.mediaplayer.view;

import F8.AbstractC0816i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.RemoteServiceView;
import com.nothing.cardwidget.mediaplayer.IMediaController;
import com.nothing.cardwidget.mediaplayer.entity.MusicControlEvent;
import com.nothing.cardwidget.mediaplayer.entity.MusicPlaybackState;
import com.nothing.cardwidget.mediaplayer.entity.MusicPlayingPosition;
import com.nothing.cardwidget.mediaplayer.entity.PlaybackStateAction;
import com.nothing.cardwidget.mediaplayer.utils.ContextExtKt;
import com.nothing.cardwidget.mediaplayer.utils.MusicDataHelper;
import com.nothing.cardwidget.pedometer.Constants;
import com.nothing.cardwidget.util.ToastUtil;
import com.nothing.cardwidget.util.UiUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaPlayerContainerView extends RemoteServiceView implements IMediaController, P5.b {
    public static final Companion Companion = new Companion(null);
    private static final long DURATION_COVER_FADE_OUT = 150;
    private static final long DURATION_MEDIA_PLAYER_FADE_IN = 250;
    private static final long DURATION_STANDBY_STATE = 3000;
    private static final int EVENT_INIT_ACTIVE = 1;
    private static final int EVENT_INIT_ALBUM = 2;
    private static final int EVENT_IN_ACTIVE = 0;
    private static final int EVENT_RE_ACTIVE = 3;
    private static final String KEY_IS_WIDGET_ID_ENABLED = "is_widget_id_enabled";
    private static final String KEY_MUSIC_CONTROL_EVENT = "music_control_event";
    private static final String KEY_SET_ENABLED_WIDGET_ID = "set_enabled_widget_id";
    private static final int MSG_ANIM_STATE_SWITCH = 1001;
    private static final long RELEASE_DELAY_TIME = 100;
    private static final float SWITCH_ICON_DISABLE_ALPHA = 0.3f;
    private static final String TAG = "MediaPlayerContainer";
    private AnimStateHandler animHandler;
    private final PathInterpolator animInterpolator;
    private View.OnClickListener authGuideClickListener;
    private TextView authorizeGuideCover;
    private boolean cardContainerVisible;
    private Float containerCornerRadius;
    private float displayRatio;
    private String guideNotifAuth;
    private boolean isAppExist;
    private AtomicBoolean isDetached;
    private AtomicBoolean isPkgReceiverRegister;
    private MediaPlayerPagerView mediaPlayerView;
    private boolean mediaPlayerViewVisible;
    private String openMusicTip;
    private final MediaPlayerContainerView$packageRemovedReceiver$1 packageRemovedReceiver;
    private Future<?> registerTask;
    private final C8.e releaseAction;
    private LottieAnimationView startUpCover;
    private Integer widgetId;

    public static final class AnimStateHandler extends Handler {
        private p219v8.l _stateChangeCallBack;
        private StartUpState curStartUpState;
        private WeakReference<LottieAnimationView> mStartUpCover;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StartUpState.values().length];
                try {
                    iArr[StartUpState.IDLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StartUpState.FORWARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StartUpState.STANDBY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StartUpState.REVERSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StartUpState.FINISH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimStateHandler(LottieAnimationView startUpCover, Looper looper) {
            super(looper);
            kotlin.jvm.internal.n.h(startUpCover, "startUpCover");
            kotlin.jvm.internal.n.h(looper, "looper");
            this.mStartUpCover = new WeakReference<>(startUpCover);
            this.curStartUpState = StartUpState.IDLE;
            this._stateChangeCallBack = new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.n
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return MediaPlayerContainerView.AnimStateHandler._stateChangeCallBack$lambda$0((MediaPlayerContainerView.StartUpState) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A _stateChangeCallBack$lambda$0(StartUpState it) {
            kotlin.jvm.internal.n.h(it, "it");
            return p079h8.A.f21846a;
        }

        public final StartUpState getCurStartUpState() {
            return this.curStartUpState;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            final LottieAnimationView lottieAnimationView;
            kotlin.jvm.internal.n.h(msg, "msg");
            if (msg.what != MediaPlayerContainerView.MSG_ANIM_STATE_SWITCH || (lottieAnimationView = this.mStartUpCover.get()) == null) {
                return;
            }
            Object obj = msg.obj;
            if (obj == StartUpState.FORWARD) {
                if (lottieAnimationView.getSpeed() < 0.0f) {
                    lottieAnimationView.reverseAnimationSpeed();
                }
                lottieAnimationView.setProgress(0.0f);
            } else {
                if (obj == StartUpState.STANDBY) {
                    sendStartUpStateMessage(StartUpState.REVERSE, MediaPlayerContainerView.DURATION_STANDBY_STATE);
                    return;
                }
                StartUpState startUpState = StartUpState.REVERSE;
                if (obj != startUpState) {
                    if (obj == StartUpState.FINISH || obj == StartUpState.IDLE) {
                        removeCallbacksAndMessages(null);
                        if (lottieAnimationView.getSpeed() < 0.0f) {
                            lottieAnimationView.reverseAnimationSpeed();
                        }
                        lottieAnimationView.setProgress(0.0f);
                        return;
                    }
                    return;
                }
                this.curStartUpState = startUpState;
                lottieAnimationView.setProgress(1.0f);
                if (lottieAnimationView.getSpeed() > 0.0f) {
                    lottieAnimationView.reverseAnimationSpeed();
                }
            }
            lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView$AnimStateHandler$handleMessage$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    kotlin.jvm.internal.n.h(animation, "animation");
                    if (this.this$0.getCurStartUpState() == MediaPlayerContainerView.StartUpState.FORWARD) {
                        MediaPlayerContainerView.AnimStateHandler animStateHandler = this.this$0;
                        animStateHandler.sendStartUpStateMessage(animStateHandler.switchNextState(), 0L);
                    } else if (this.this$0.getCurStartUpState() == MediaPlayerContainerView.StartUpState.REVERSE) {
                        this.this$0.switchNextState();
                        if (lottieAnimationView.getSpeed() < 0.0f) {
                            lottieAnimationView.reverseAnimationSpeed();
                        }
                    }
                }
            });
            lottieAnimationView.playAnimation();
        }

        public final void nextStateCallBack(p219v8.l callback) {
            kotlin.jvm.internal.n.h(callback, "callback");
            this._stateChangeCallBack = callback;
        }

        public final void sendStartUpStateMessage(StartUpState state, long j9) {
            kotlin.jvm.internal.n.h(state, "state");
            Message messageObtain = Message.obtain();
            messageObtain.what = MediaPlayerContainerView.MSG_ANIM_STATE_SWITCH;
            messageObtain.obj = state;
            Log.d(MediaPlayerContainerView.TAG, "sendStartUpStateMessage curStartUpState: " + this.curStartUpState.name());
            sendMessageDelayed(messageObtain, j9);
        }

        public final void setCurStartUpState(StartUpState startUpState) {
            kotlin.jvm.internal.n.h(startUpState, "<set-?>");
            this.curStartUpState = startUpState;
        }

        public final StartUpState switchNextState() {
            StartUpState startUpState;
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.curStartUpState.ordinal()];
            if (i10 == 1) {
                startUpState = StartUpState.FORWARD;
            } else if (i10 == 2) {
                startUpState = StartUpState.STANDBY;
            } else if (i10 == 3) {
                startUpState = StartUpState.REVERSE;
            } else {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new p079h8.m();
                    }
                    throw new IllegalStateException("AnimStateHandler can't switchNextState to FINIFH.");
                }
                startUpState = StartUpState.IDLE;
            }
            this.curStartUpState = startUpState;
            this._stateChangeCallBack.f(startUpState);
            return startUpState;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public enum StartUpState {
        IDLE,
        FORWARD,
        STANDBY,
        REVERSE,
        FINISH;

        private static final /* synthetic */ p149o8.a $ENTRIES = p149o8.b.a(values());

        public static p149o8.a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StartUpState.values().length];
            try {
                iArr[StartUpState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StartUpState.STANDBY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPlayerContainerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A _init_$lambda$1(MediaPlayerContainerView this$0, StartUpState it) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(it, "it");
        if (it == StartUpState.IDLE) {
            this$0.trackMediaOnClick(3);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCachedData() {
        p079h8.u cachedData = MusicDataHelper.INSTANCE.getCachedData();
        Bundle bundle = (Bundle) cachedData.a();
        Bundle bundle2 = (Bundle) cachedData.b();
        Bundle bundle3 = (Bundle) cachedData.c();
        if (bundle != null) {
            onDataChanged(bundle);
        }
        if (bundle2 != null) {
            onDataChanged(bundle2);
        }
        if (bundle3 != null) {
            onDataChanged(bundle3);
        }
    }

    private final IntentFilter getPkgInstallIntentFilter() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    private final void getRemoteResource(AttributeSet attributeSet, Context context) {
        setWillNotDraw(false);
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attributeSet, N.i(p079h8.v.a(Integer.valueOf(c0120a.c(context, "openMusicTip")), Integer.valueOf(R.attr.openMusicTip)), p079h8.v.a(Integer.valueOf(c0120a.c(context, "guideNotifAuth")), Integer.valueOf(R.attr.guideNotifAuth)), p079h8.v.a(Integer.valueOf(c0120a.c(context, "containerCornerRadius")), Integer.valueOf(R.attr.containerCornerRadius)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.openMusicTip) {
                this.openMusicTip = J5.a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue());
            } else if (iIntValue == R.attr.guideNotifAuth) {
                this.guideNotifAuth = J5.a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue());
            } else if (iIntValue == R.attr.containerCornerRadius) {
                this.containerCornerRadius = Float.valueOf(J5.a.f3535a.h(context, attributeSet, ((Number) entry.getValue()).intValue(), -1.0f));
            }
        }
    }

    private final void initView(View view) {
        this.mediaPlayerView = (MediaPlayerPagerView) view.findViewById(R.id.media_player_pager_view);
        this.authorizeGuideCover = (TextView) view.findViewById(R.id.authorize_guide_cover);
        this.startUpCover = (LottieAnimationView) view.findViewById(R.id.startup_cover);
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        MediaPlayerPagerView mediaPlayerPagerView2 = null;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.addMediaController(this);
        TextView textView = this.authorizeGuideCover;
        if (textView == null) {
            kotlin.jvm.internal.n.r("authorizeGuideCover");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MediaPlayerContainerView.initView$lambda$16(this.f18052q, view2);
            }
        });
        LottieAnimationView lottieAnimationView = this.startUpCover;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.n.r("startUpCover");
            lottieAnimationView = null;
        }
        UiUtil uiUtil = UiUtil.INSTANCE;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        lottieAnimationView.setAnimation(uiUtil.isDarkTheme(context) ? R.raw.music_enter_initial_state_dark : R.raw.music_enter_initial_state_light);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView.initView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaPlayerContainerView.this.applyCachedData();
                MediaPlayerContainerView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        MediaPlayerPagerView mediaPlayerPagerView3 = this.mediaPlayerView;
        if (mediaPlayerPagerView3 == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
        } else {
            mediaPlayerPagerView2 = mediaPlayerPagerView3;
        }
        mediaPlayerPagerView2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView.initView.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                MediaPlayerContainerView mediaPlayerContainerView = MediaPlayerContainerView.this;
                Bundle bundle = new Bundle();
                MediaPlayerContainerView mediaPlayerContainerView2 = MediaPlayerContainerView.this;
                bundle.putString(Constants.KEY_METHOD_NAME, Constants.METHOD_PAGE_SELECTED);
                bundle.putInt(Constants.KEY_SELECTED_POSITION, i10);
                Integer num = mediaPlayerContainerView2.widgetId;
                bundle.putInt(Constants.KEY_WIDGET_ID, num != null ? num.intValue() : -1);
                mediaPlayerContainerView.callRemoteService(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$16(MediaPlayerContainerView this$0, View view) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.authGuideClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final boolean isMusicAppExist() {
        String appName = MusicDataHelper.INSTANCE.getAppName();
        boolean z9 = false;
        if (appName != null) {
            Context context = getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            if (ContextExtKt.isAppExist(context, appName)) {
                z9 = true;
            }
        }
        this.isAppExist = z9;
        return z9;
    }

    private final boolean isStartUpAnimationRunning() {
        AnimStateHandler animStateHandler = this.animHandler;
        AnimStateHandler animStateHandler2 = null;
        if (animStateHandler == null) {
            kotlin.jvm.internal.n.r("animHandler");
            animStateHandler = null;
        }
        if (animStateHandler.getCurStartUpState().compareTo(StartUpState.IDLE) <= 0) {
            return false;
        }
        AnimStateHandler animStateHandler3 = this.animHandler;
        if (animStateHandler3 == null) {
            kotlin.jvm.internal.n.r("animHandler");
        } else {
            animStateHandler2 = animStateHandler3;
        }
        return animStateHandler2.getCurStartUpState().compareTo(StartUpState.FINISH) < 0;
    }

    private final boolean isWidgetAvailable(int i10) {
        Integer num = this.widgetId;
        return (num != null ? isWidgetEnabled(num.intValue()) : false) && !MusicPlaybackState.Companion.needNotificationAuth(i10);
    }

    private final boolean isWidgetEnabled(final int i10) {
        Boolean boolIsWidgetEnabled = MusicDataHelper.INSTANCE.isWidgetEnabled(i10);
        if (boolIsWidgetEnabled != null) {
            return boolIsWidgetEnabled.booleanValue();
        }
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_IS_WIDGET_ID_ENABLED, i10);
        forceCallRemoteService(bundle, new B0.a() { // from class: com.nothing.cardwidget.mediaplayer.view.c
            @Override // B0.a
            public final void accept(Object obj) {
                MediaPlayerContainerView.isWidgetEnabled$lambda$50$lambda$49(i10, this, (Bundle) obj);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isWidgetEnabled$lambda$50$lambda$49(int i10, MediaPlayerContainerView this$0, Bundle bundle) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        boolean z9 = bundle != null ? bundle.getBoolean(KEY_IS_WIDGET_ID_ENABLED) : false;
        Log.d(TAG, "CallRemote isWidgetEnabled: " + z9);
        MusicDataHelper musicDataHelper = MusicDataHelper.INSTANCE;
        musicDataHelper.setWidgetEnabled(i10, z9);
        Integer playbackState = musicDataHelper.getPlaybackState();
        if (playbackState != null) {
            this$0.updateStartUpViewState(playbackState.intValue());
        }
    }

    private final void notifyMediaPlayerVisibilityChanged() {
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.onMediaPlayerVisibilityChanged(this.cardContainerVisible && this.mediaPlayerViewVisible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$4(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$7$lambda$6(MediaPlayerContainerView this_runCatching) {
        kotlin.jvm.internal.n.h(this_runCatching, "$this_runCatching");
        if (this_runCatching.isDetached.get()) {
            return;
        }
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            this_runCatching.getContext().registerReceiver(this_runCatching.packageRemovedReceiver, this_runCatching.getPkgInstallIntentFilter(), 4);
            this_runCatching.isPkgReceiverRegister.set(true);
            p079h8.q.b(p079h8.A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    private final void onClickStartUpView(final int i10, final p219v8.a aVar) {
        LottieAnimationView lottieAnimationView = this.startUpCover;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.n.r("startUpCover");
            lottieAnimationView = null;
        }
        lottieAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.mediaplayer.view.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPlayerContainerView.onClickStartUpView$lambda$40(i10, this, aVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickStartUpView$lambda$40(int i10, MediaPlayerContainerView this$0, p219v8.a confirmPlay, View view) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(confirmPlay, "$confirmPlay");
        if (MusicPlaybackState.Companion.needEnableMusicService(i10) || !this$0.isMusicAppExist()) {
            String str = this$0.openMusicTip;
            if (str != null) {
                ToastUtil toastUtil = ToastUtil.INSTANCE;
                Context applicationContext = this$0.getContext().getApplicationContext();
                kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
                toastUtil.showToast(applicationContext, str);
            }
            this$0.trackMediaOnClick(0);
            return;
        }
        AnimStateHandler animStateHandler = this$0.animHandler;
        AnimStateHandler animStateHandler2 = null;
        if (animStateHandler == null) {
            kotlin.jvm.internal.n.r("animHandler");
            animStateHandler = null;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[animStateHandler.getCurStartUpState().ordinal()];
        if (i11 == 1) {
            AnimStateHandler animStateHandler3 = this$0.animHandler;
            if (animStateHandler3 == null) {
                kotlin.jvm.internal.n.r("animHandler");
                animStateHandler3 = null;
            }
            AnimStateHandler animStateHandler4 = this$0.animHandler;
            if (animStateHandler4 == null) {
                kotlin.jvm.internal.n.r("animHandler");
            } else {
                animStateHandler2 = animStateHandler4;
            }
            animStateHandler3.sendStartUpStateMessage(animStateHandler2.switchNextState(), 0L);
            this$0.trackMediaOnClick(1);
            return;
        }
        if (i11 != 2) {
            return;
        }
        AnimStateHandler animStateHandler5 = this$0.animHandler;
        if (animStateHandler5 == null) {
            kotlin.jvm.internal.n.r("animHandler");
            animStateHandler5 = null;
        }
        StartUpState startUpState = StartUpState.FINISH;
        animStateHandler5.setCurStartUpState(startUpState);
        AnimStateHandler animStateHandler6 = this$0.animHandler;
        if (animStateHandler6 == null) {
            kotlin.jvm.internal.n.r("animHandler");
        } else {
            animStateHandler2 = animStateHandler6;
        }
        animStateHandler2.sendStartUpStateMessage(startUpState, 0L);
        confirmPlay.invoke();
        this$0.trackMediaOnClick(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDetachedFromWindow$lambda$8(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    private final void onMediaPlayerViewShown() {
        this.mediaPlayerViewVisible = true;
        notifyMediaPlayerVisibilityChanged();
    }

    private final void recordEnabledWidget() {
        Integer num = this.widgetId;
        if (num != null) {
            int iIntValue = num.intValue();
            MusicDataHelper.INSTANCE.setWidgetEnabled(iIntValue, true);
            AbstractC0816i.d(O5.g.j(), null, null, new MediaPlayerContainerView$recordEnabledWidget$1$1(iIntValue, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        Object objB;
        Future<?> future = this.registerTask;
        if (future != null) {
            future.cancel(true);
        }
        if (this.isPkgReceiverRegister.get()) {
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                objB = p079h8.q.b(Executors.newCachedThreadPool().submit(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaPlayerContainerView.release$lambda$11$lambda$10(this.f18058q);
                    }
                }));
            } catch (Throwable th) {
                h8.q.a aVar2 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
            }
            Throwable thD = p079h8.q.d(objB);
            if (thD != null) {
                Log.e(TAG, "onDetachedFromWindow error: " + thD.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$11$lambda$10(MediaPlayerContainerView this_runCatching) {
        kotlin.jvm.internal.n.h(this_runCatching, "$this_runCatching");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            this_runCatching.getContext().unregisterReceiver(this_runCatching.packageRemovedReceiver);
            p079h8.q.b(p079h8.A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    private final void showAuthorizationGuideView() {
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        TextView textView = null;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.disableHScroll(true);
        MediaPlayerPagerView mediaPlayerPagerView2 = this.mediaPlayerView;
        if (mediaPlayerPagerView2 == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView2 = null;
        }
        mediaPlayerPagerView2.setVisibility(4);
        LottieAnimationView lottieAnimationView = this.startUpCover;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.n.r("startUpCover");
            lottieAnimationView = null;
        }
        lottieAnimationView.setVisibility(8);
        TextView textView2 = this.authorizeGuideCover;
        if (textView2 == null) {
            kotlin.jvm.internal.n.r("authorizeGuideCover");
        } else {
            textView = textView2;
        }
        textView.setVisibility(0);
        textView.setText(this.guideNotifAuth);
    }

    private final void showMediaPlayerViewPager(int i10, boolean z9) {
        onMediaPlayerViewShown();
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        MediaPlayerPagerView mediaPlayerPagerView2 = null;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.disableHScroll(!MusicPlaybackState.Companion.isConnected(i10));
        if (!z9) {
            TextView textView = this.authorizeGuideCover;
            if (textView == null) {
                kotlin.jvm.internal.n.r("authorizeGuideCover");
                textView = null;
            }
            textView.setVisibility(8);
            LottieAnimationView lottieAnimationView = this.startUpCover;
            if (lottieAnimationView == null) {
                kotlin.jvm.internal.n.r("startUpCover");
                lottieAnimationView = null;
            }
            lottieAnimationView.setVisibility(8);
            MediaPlayerPagerView mediaPlayerPagerView3 = this.mediaPlayerView;
            if (mediaPlayerPagerView3 == null) {
                kotlin.jvm.internal.n.r("mediaPlayerView");
            } else {
                mediaPlayerPagerView2 = mediaPlayerPagerView3;
            }
            mediaPlayerPagerView2.setVisibility(0);
            return;
        }
        LottieAnimationView lottieAnimationView2 = this.startUpCover;
        if (lottieAnimationView2 == null) {
            kotlin.jvm.internal.n.r("startUpCover");
            lottieAnimationView2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(lottieAnimationView2, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(DURATION_COVER_FADE_OUT);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView$showMediaPlayerViewPager$startUpCoverFadeOut$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.n.h(animation, "animation");
                LottieAnimationView lottieAnimationView3 = this.this$0.startUpCover;
                if (lottieAnimationView3 == null) {
                    kotlin.jvm.internal.n.r("startUpCover");
                    lottieAnimationView3 = null;
                }
                lottieAnimationView3.setVisibility(8);
            }
        });
        MediaPlayerPagerView mediaPlayerPagerView4 = this.mediaPlayerView;
        if (mediaPlayerPagerView4 == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
        } else {
            mediaPlayerPagerView2 = mediaPlayerPagerView4;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mediaPlayerPagerView2, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(DURATION_MEDIA_PLAYER_FADE_IN);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.setInterpolator(this.animInterpolator);
        animatorSet.start();
    }

    private final void showStartUpView(int i10, p219v8.a aVar) {
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        AnimStateHandler animStateHandler = null;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.disableHScroll(true);
        TextView textView = this.authorizeGuideCover;
        if (textView == null) {
            kotlin.jvm.internal.n.r("authorizeGuideCover");
            textView = null;
        }
        textView.setVisibility(8);
        MediaPlayerPagerView mediaPlayerPagerView2 = this.mediaPlayerView;
        if (mediaPlayerPagerView2 == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView2 = null;
        }
        mediaPlayerPagerView2.setVisibility(4);
        LottieAnimationView lottieAnimationView = this.startUpCover;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.n.r("startUpCover");
            lottieAnimationView = null;
        }
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setAlpha(1.0f);
        onClickStartUpView(i10, aVar);
        if (isStartUpAnimationRunning()) {
            return;
        }
        AnimStateHandler animStateHandler2 = this.animHandler;
        if (animStateHandler2 == null) {
            kotlin.jvm.internal.n.r("animHandler");
            animStateHandler2 = null;
        }
        StartUpState startUpState = StartUpState.IDLE;
        animStateHandler2.sendStartUpStateMessage(startUpState, 0L);
        AnimStateHandler animStateHandler3 = this.animHandler;
        if (animStateHandler3 == null) {
            kotlin.jvm.internal.n.r("animHandler");
        } else {
            animStateHandler = animStateHandler3;
        }
        animStateHandler.setCurStartUpState(startUpState);
    }

    private final void trackMediaOnClick(int i10) {
        String strL;
        String strF;
        String strH;
        String strK;
        MusicDataHelper musicDataHelper = MusicDataHelper.INSTANCE;
        Bundle bundle = (Bundle) musicDataHelper.getCachedData().d();
        N5.a musicData = bundle != null ? musicDataHelper.parseMusicData(bundle) : null;
        N5.b bVar = musicData instanceof N5.b ? (N5.b) musicData : null;
        O5.i iVar = O5.i.f5904a;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        Integer num = this.widgetId;
        iVar.c(context, num != null ? num.intValue() : -1, i10, (bVar == null || (strK = bVar.k()) == null) ? "" : strK, (bVar == null || (strH = bVar.h()) == null) ? "" : strH, (bVar == null || (strF = bVar.f()) == null) ? "" : strF, (bVar == null || (strL = bVar.l()) == null) ? "" : strL);
    }

    private final void updateDisplayRatio(float f10) {
        TextView textView = this.authorizeGuideCover;
        if (textView == null) {
            kotlin.jvm.internal.n.r("authorizeGuideCover");
            textView = null;
        }
        textView.setTextSize(0, 53 * f10);
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        Drawable background = mediaPlayerPagerView.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if (layerDrawable != null) {
            int iB = p239x8.a.b(81 * f10);
            int iFindIndexByLayerId = layerDrawable.findIndexByLayerId(R.id.media_play_previous_icon);
            int iFindIndexByLayerId2 = layerDrawable.findIndexByLayerId(R.id.media_play_next_icon);
            layerDrawable.setLayerInsetStart(iFindIndexByLayerId, iB);
            layerDrawable.setLayerInsetEnd(iFindIndexByLayerId2, iB);
        }
    }

    private final void updateMusicPlayingState(int i10) {
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.updatePlayBackState(i10);
        updateStartUpViewState(i10);
    }

    private final void updatePlayStateIfNotAvailable(Bundle bundle) {
        N5.a musicData = MusicDataHelper.INSTANCE.parseMusicData(bundle);
        if (musicData instanceof MusicPlaybackState) {
            updateMusicPlayingState(((MusicPlaybackState) musicData).getState());
        }
    }

    private final void updateStartUpViewState(int i10, p219v8.a aVar) {
        Integer num = this.widgetId;
        boolean zIsWidgetEnabled = num != null ? isWidgetEnabled(num.intValue()) : false;
        Log.d(TAG, "updateStartUpViewState isEnabledWidget: " + zIsWidgetEnabled + ", widgetId: " + this.widgetId + ", state: " + i10);
        if (MusicPlaybackState.Companion.needNotificationAuth(i10)) {
            this.mediaPlayerViewVisible = false;
            showAuthorizationGuideView();
        } else if (zIsWidgetEnabled && isMusicAppExist()) {
            showMediaPlayerViewPager(i10, false);
        } else {
            this.mediaPlayerViewVisible = false;
            showStartUpView(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A updateStartUpViewState$lambda$44(MediaPlayerContainerView this$0, int i10) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        this$0.recordEnabledWidget();
        this$0.applyCachedData();
        this$0.showMediaPlayerViewPager(i10, true);
        return p079h8.A.f21846a;
    }

    private final void updateSwitchIconByAction(byte b10) {
        p219v8.p pVar = new p219v8.p() { // from class: com.nothing.cardwidget.mediaplayer.view.h
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return MediaPlayerContainerView.updateSwitchIconByAction$lambda$20(this.f18053q, ((Integer) obj).intValue(), ((Float) obj2).floatValue());
            }
        };
        p219v8.p pVar2 = new p219v8.p() { // from class: com.nothing.cardwidget.mediaplayer.view.i
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return MediaPlayerContainerView.updateSwitchIconByAction$lambda$22(this.f18054q, ((Integer) obj).intValue(), ((Float) obj2).floatValue());
            }
        };
        int color = getContext().getApplicationContext().getResources().getColor(R.color.color_media_switch_icon, null);
        Float fValueOf = Float.valueOf(1.0f);
        if (b10 == -128) {
            pVar.invoke(Integer.valueOf(color), fValueOf);
            pVar2.invoke(Integer.valueOf(color), fValueOf);
            return;
        }
        PlaybackStateAction.Companion companion = PlaybackStateAction.Companion;
        if (companion.supportSlidePrevious(b10)) {
            pVar.invoke(Integer.valueOf(color), fValueOf);
        } else {
            pVar.invoke(Integer.valueOf(color), Float.valueOf(SWITCH_ICON_DISABLE_ALPHA));
        }
        if (companion.supportSlideNext(b10)) {
            pVar2.invoke(Integer.valueOf(color), fValueOf);
        } else {
            pVar2.invoke(Integer.valueOf(color), Float.valueOf(SWITCH_ICON_DISABLE_ALPHA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A updateSwitchIconByAction$lambda$20(MediaPlayerContainerView this$0, int i10, float f10) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        MediaPlayerPagerView mediaPlayerPagerView = this$0.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        Drawable background = mediaPlayerPagerView.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.media_play_previous_icon) : null;
        if (drawableFindDrawableByLayerId != null) {
            int iX = p191t0.a.x(i10, (int) (f10 * 255));
            Drawable drawableR = p201u0.a.r(drawableFindDrawableByLayerId);
            kotlin.jvm.internal.n.g(drawableR, "wrap(...)");
            p201u0.a.n(drawableR, iX);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A updateSwitchIconByAction$lambda$22(MediaPlayerContainerView this$0, int i10, float f10) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        MediaPlayerPagerView mediaPlayerPagerView = this$0.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        Drawable background = mediaPlayerPagerView.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.media_play_next_icon) : null;
        if (drawableFindDrawableByLayerId != null) {
            int iX = p191t0.a.x(i10, (int) (f10 * 255));
            Drawable drawableR = p201u0.a.r(drawableFindDrawableByLayerId);
            kotlin.jvm.internal.n.g(drawableR, "wrap(...)");
            p201u0.a.n(drawableR, iX);
        }
        return p079h8.A.f21846a;
    }

    @Override // P5.b
    public void onAllWidgetViewRemoved() {
        MusicDataHelper.INSTANCE.clearCachedData();
    }

    @Override // com.nothing.cardwidget.RemoteServiceView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Context context;
        super.onAttachedToWindow();
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null && (context = view.getContext()) != null) {
            setBackground(p060g.a.b(context, R.drawable.color_media_container_bg));
        }
        this.isDetached.set(false);
        final C8.e eVar = this.releaseAction;
        removeCallbacks(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.e
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerContainerView.onAttachedToWindow$lambda$4(eVar);
            }
        });
        if (this.isPkgReceiverRegister.get()) {
            return;
        }
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            this.registerTask = Executors.newCachedThreadPool().submit(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.f
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerContainerView.onAttachedToWindow$lambda$7$lambda$6(this.f18051q);
                }
            });
            p079h8.q.b(p079h8.A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    @Override // com.nothing.cardwidget.RemoteServiceView, com.nothing.commBase.deferred.IDeferringObserver
    public void onCardVisibilityChanged(boolean z9) {
        super.onCardVisibilityChanged(z9);
        Log.d(TAG, "onCardVisibilityChanged: " + z9);
        this.cardContainerVisible = z9;
        notifyMediaPlayerVisibilityChanged();
    }

    @Override // com.nothing.cardwidget.RemoteServiceView
    public void onDataChanged(Bundle data) {
        kotlin.jvm.internal.n.h(data, "data");
        MusicDataHelper musicDataHelper = MusicDataHelper.INSTANCE;
        musicDataHelper.cacheData(data);
        Integer playbackState = musicDataHelper.getPlaybackState();
        if (playbackState != null && !isWidgetAvailable(playbackState.intValue())) {
            updatePlayStateIfNotAvailable(data);
            return;
        }
        N5.a musicData = musicDataHelper.parseMusicData(data);
        if (!(musicData instanceof N5.b)) {
            if (musicData instanceof MusicPlaybackState) {
                updateMusicPlayingState(((MusicPlaybackState) musicData).getState());
                return;
            } else if (musicData instanceof MusicPlayingPosition) {
                setMusicPlayingPosition(((MusicPlayingPosition) musicData).getPlayingPosition());
                return;
            } else {
                Log.e(TAG, "Unsupported data type.");
                return;
            }
        }
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        N5.b bVar = (N5.b) musicData;
        mediaPlayerPagerView.updateMusicMetaData(bVar, false);
        updateSwitchIconByAction(bVar.m());
        if (this.isAppExist) {
            return;
        }
        this.isAppExist = isMusicAppExist();
        Integer playbackState2 = musicDataHelper.getPlaybackState();
        if (playbackState2 != null) {
            updateStartUpViewState(playbackState2.intValue());
        }
    }

    @Override // com.nothing.cardwidget.RemoteServiceView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isDetached.set(true);
        final C8.e eVar = this.releaseAction;
        postDelayed(new Runnable() { // from class: com.nothing.cardwidget.mediaplayer.view.k
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerContainerView.onDetachedFromWindow$lambda$8(eVar);
            }
        }, RELEASE_DELAY_TIME);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        super.onDraw(canvas);
        Float f10 = this.containerCornerRadius;
        if (f10 != null) {
            if (f10.floatValue() <= 0.0f) {
                f10 = null;
            }
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fFloatValue, fFloatValue, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    @Override // com.nothing.cardwidget.mediaplayer.IMediaController
    public void onMusicSwitch(boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_MUSIC_CONTROL_EVENT, (z9 ? MusicControlEvent.PREVIOUS : MusicControlEvent.NEXT).getEvent());
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        bundle.putInt(Constants.KEY_SELECTED_POSITION, mediaPlayerPagerView.getCurrentPage());
        Integer num = this.widgetId;
        bundle.putInt(Constants.KEY_WIDGET_ID, num != null ? num.intValue() : -1);
        AbstractC0816i.d(O5.g.j(), null, null, new MediaPlayerContainerView$onMusicSwitch$2$1(this, bundle, null), 3, null);
    }

    @Override // com.nothing.cardwidget.mediaplayer.IMediaController
    public void onPlayStateSwitch(boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_MUSIC_CONTROL_EVENT, (z9 ? MusicControlEvent.PLAY : MusicControlEvent.PAUSE).getEvent());
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        bundle.putInt(Constants.KEY_SELECTED_POSITION, mediaPlayerPagerView.getCurrentPage());
        Integer num = this.widgetId;
        bundle.putInt(Constants.KEY_WIDGET_ID, num != null ? num.intValue() : -1);
        AbstractC0816i.d(O5.g.j(), null, null, new MediaPlayerContainerView$onPlayStateSwitch$2$1(this, bundle, null), 3, null);
    }

    @Override // P5.b
    public void onWidgetViewRemoved(int i10) {
    }

    public final void setDisplayRatio(float f10) {
        this.displayRatio = f10;
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.updateDisplayRatio(this.displayRatio);
        updateDisplayRatio(f10);
    }

    public final void setMusicMetaData(N5.b data) {
        kotlin.jvm.internal.n.h(data, "data");
        MusicDataHelper musicDataHelper = MusicDataHelper.INSTANCE;
        Bundle bundle = (Bundle) musicDataHelper.getCachedData().d();
        MediaPlayerPagerView mediaPlayerPagerView = null;
        N5.a musicData = bundle != null ? musicDataHelper.parseMusicData(bundle) : null;
        N5.b bVar = musicData instanceof N5.b ? (N5.b) musicData : null;
        if (bVar != null) {
            data = bVar;
        }
        MediaPlayerPagerView mediaPlayerPagerView2 = this.mediaPlayerView;
        if (mediaPlayerPagerView2 == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
        } else {
            mediaPlayerPagerView = mediaPlayerPagerView2;
        }
        mediaPlayerPagerView.updateMusicMetaData(data, false);
    }

    public final void setMusicPlayingPosition(int i10) {
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.updateMusicPosition(i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public final void setMusicPlayingState(int i10) {
        Integer numValueOf;
        MusicDataHelper musicDataHelper = MusicDataHelper.INSTANCE;
        Bundle bundle = (Bundle) musicDataHelper.getCachedData().e();
        MediaPlayerPagerView mediaPlayerPagerView = null;
        if (bundle != null) {
            N5.a musicData = musicDataHelper.parseMusicData(bundle);
            MusicPlaybackState musicPlaybackState = musicData instanceof MusicPlaybackState ? (MusicPlaybackState) musicData : null;
            if (musicPlaybackState != null) {
                numValueOf = Integer.valueOf(musicPlaybackState.getState());
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i10 = numValueOf.intValue();
        }
        MediaPlayerPagerView mediaPlayerPagerView2 = this.mediaPlayerView;
        if (mediaPlayerPagerView2 == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
        } else {
            mediaPlayerPagerView = mediaPlayerPagerView2;
        }
        mediaPlayerPagerView.updatePlayBackState(i10);
        updateStartUpViewState(i10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.authGuideClickListener = onClickListener;
    }

    public final void setOpenAppListener(Consumer<p079h8.u> consumer) {
        kotlin.jvm.internal.n.h(consumer, "consumer");
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.setOpenAppListener(consumer);
    }

    public final void setWidgetId(int i10) {
        this.widgetId = Integer.valueOf(i10);
        MediaPlayerPagerView mediaPlayerPagerView = this.mediaPlayerView;
        if (mediaPlayerPagerView == null) {
            kotlin.jvm.internal.n.r("mediaPlayerView");
            mediaPlayerPagerView = null;
        }
        mediaPlayerPagerView.setWidgetId(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPlayerContainerView(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
    }

    public /* synthetic */ MediaPlayerContainerView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView$packageRemovedReceiver$1] */
    public MediaPlayerContainerView(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
        this.animInterpolator = new PathInterpolator(0.9f, 0.01f, 0.13f, 1.0f);
        this.releaseAction = new MediaPlayerContainerView$releaseAction$1(this);
        this.cardContainerVisible = true;
        this.displayRatio = 1.0f;
        this.isAppExist = true;
        this.isPkgReceiverRegister = new AtomicBoolean(false);
        this.isDetached = new AtomicBoolean(false);
        this.packageRemovedReceiver = new BroadcastReceiver() { // from class: com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView$packageRemovedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Integer playbackState;
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != 525384130) {
                        if (iHashCode != 1544582882 || !action.equals("android.intent.action.PACKAGE_ADDED")) {
                            return;
                        }
                    } else if (!action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        return;
                    }
                    Uri data = intent.getData();
                    String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
                    if (schemeSpecificPart != null) {
                        MusicDataHelper musicDataHelper = MusicDataHelper.INSTANCE;
                        if (!kotlin.jvm.internal.n.d(musicDataHelper.getAppName(), schemeSpecificPart) || (playbackState = musicDataHelper.getPlaybackState()) == null) {
                            return;
                        }
                        this.this$0.updateStartUpViewState(playbackState.intValue());
                    }
                }
            }
        };
        getRemoteResource(attrs, context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.mediaplayer_widget_container, (ViewGroup) this, true);
        kotlin.jvm.internal.n.e(viewInflate);
        initView(viewInflate);
        LottieAnimationView lottieAnimationView = this.startUpCover;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.n.r("startUpCover");
            lottieAnimationView = null;
        }
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.n.g(mainLooper, "getMainLooper(...)");
        AnimStateHandler animStateHandler = new AnimStateHandler(lottieAnimationView, mainLooper);
        this.animHandler = animStateHandler;
        animStateHandler.nextStateCallBack(new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.d
            @Override // p219v8.l
            public final Object f(Object obj) {
                return MediaPlayerContainerView._init_$lambda$1(this.f18049q, (MediaPlayerContainerView.StartUpState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStartUpViewState(final int i10) {
        updateStartUpViewState(i10, new p219v8.a() { // from class: com.nothing.cardwidget.mediaplayer.view.j
            @Override // p219v8.a
            public final Object invoke() {
                return MediaPlayerContainerView.updateStartUpViewState$lambda$44(this.f18055q, i10);
            }
        });
    }
}
