package com.nothing.cardwidget.mediaplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import com.nothing.cardwidget.NTPageIndicatorDot;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.mediaplayer.IMediaController;
import com.nothing.cardwidget.mediaplayer.IMediaMetaDataChanged;
import com.nothing.cardwidget.mediaplayer.entity.PlaybackStateAction;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaPlayerPagerView extends HorizontalScrollReboundView implements IMediaMetaDataChanged {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MediaPlayerPagerView";
    private final AttributeSet attrs;
    private IMediaController controller;
    private NTPageIndicatorDot pageIndicator;
    private ViewPagerAdapter pagerAdapter;
    private float uiRatio;
    private ViewPager2 viewpager2;
    private Integer widgetId;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPlayerPagerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A onFinishInflate$lambda$1$lambda$0(MediaPlayerPagerView this_run, boolean z9) {
        kotlin.jvm.internal.n.h(this_run, "$this_run");
        IMediaController iMediaController = this_run.controller;
        if (iMediaController != null) {
            iMediaController.onPlayStateSwitch(z9);
        }
        return p079h8.A.f21846a;
    }

    private final void setSwitchVibration(byte b10) {
        if (b10 == -128) {
            supportSlideLeft(true);
            supportSlideRight(true);
            return;
        }
        PlaybackStateAction.Companion companion = PlaybackStateAction.Companion;
        boolean zSupportSlideNext = companion.supportSlideNext(b10);
        boolean zSupportSlidePrevious = companion.supportSlidePrevious(b10);
        supportSlideLeft(zSupportSlideNext);
        supportSlideRight(zSupportSlidePrevious);
    }

    public final void addMediaController(IMediaController controller) {
        kotlin.jvm.internal.n.h(controller, "controller");
        this.controller = controller;
    }

    public final void disableHScroll(boolean z9) {
        super.disableHorizontalScroll(z9);
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final int getCurrentPage() {
        ViewPager2 viewPager2 = this.viewpager2;
        if (viewPager2 == null) {
            kotlin.jvm.internal.n.r("viewpager2");
            viewPager2 = null;
        }
        return viewPager2.getCurrentItem();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.onAttached();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.onDetached();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = R.id.media_player_viewpager2;
        this.viewpager2 = (ViewPager2) findViewById(i10);
        NTPageIndicatorDot nTPageIndicatorDot = (NTPageIndicatorDot) findViewById(R.id.media_player_indicator);
        this.pageIndicator = nTPageIndicatorDot;
        ViewPager2 viewPager2 = null;
        if (nTPageIndicatorDot == null) {
            kotlin.jvm.internal.n.r("pageIndicator");
            nTPageIndicatorDot = null;
        }
        nTPageIndicatorDot.setPageListener(i10);
        ViewPager2 viewPager3 = this.viewpager2;
        if (viewPager3 == null) {
            kotlin.jvm.internal.n.r("viewpager2");
            viewPager3 = null;
        }
        if (viewPager3.getAdapter() == null) {
            Context context = getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            ViewPager2 viewPager4 = this.viewpager2;
            if (viewPager4 == null) {
                kotlin.jvm.internal.n.r("viewpager2");
                viewPager4 = null;
            }
            this.pagerAdapter = new ViewPagerAdapter(context, viewPager4, new p219v8.l() { // from class: com.nothing.cardwidget.mediaplayer.view.o
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return MediaPlayerPagerView.onFinishInflate$lambda$1$lambda$0(this.f18062q, ((Boolean) obj).booleanValue());
                }
            });
            ViewPager2 viewPager5 = this.viewpager2;
            if (viewPager5 == null) {
                kotlin.jvm.internal.n.r("viewpager2");
                viewPager5 = null;
            }
            ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
            if (viewPagerAdapter == null) {
                kotlin.jvm.internal.n.r("pagerAdapter");
                viewPagerAdapter = null;
            }
            viewPager5.setAdapter(viewPagerAdapter);
            ViewPager2 viewPager6 = this.viewpager2;
            if (viewPager6 == null) {
                kotlin.jvm.internal.n.r("viewpager2");
            } else {
                viewPager2 = viewPager6;
            }
            viewPager2.setOffscreenPageLimit(1);
            p079h8.A a10 = p079h8.A.f21846a;
        }
    }

    public final void onMediaPlayerVisibilityChanged(boolean z9) {
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.onVisibilityChanged(z9);
    }

    @Override // com.nothing.cardwidget.mediaplayer.view.HorizontalScrollReboundView
    public void onSlidingSwitch(boolean z9) {
        super.onSlidingSwitch(z9);
        IMediaController iMediaController = this.controller;
        if (iMediaController != null) {
            iMediaController.onMusicSwitch(z9);
        }
    }

    public final void registerOnPageChangeCallback(ViewPager2.OnPageChangeCallback callback) {
        kotlin.jvm.internal.n.h(callback, "callback");
        ViewPager2 viewPager2 = this.viewpager2;
        if (viewPager2 == null) {
            kotlin.jvm.internal.n.r("viewpager2");
            viewPager2 = null;
        }
        viewPager2.registerOnPageChangeCallback(callback);
    }

    public final void setOpenAppListener(Consumer<p079h8.u> consumer) {
        kotlin.jvm.internal.n.h(consumer, "consumer");
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.setOpenAppListener(consumer);
    }

    public final void setWidgetId(int i10) {
        this.widgetId = Integer.valueOf(i10);
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.setWidgetId(i10);
    }

    public final void updateDisplayRatio(float f10) {
        super.setDisplayRatio(f10);
        this.uiRatio = f10;
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.updateDisplayRatio(f10);
    }

    @Override // com.nothing.cardwidget.mediaplayer.IMediaMetaDataChanged
    public void updateMusicMetaData(N5.b data, boolean z9) {
        kotlin.jvm.internal.n.h(data, "data");
        ViewPagerAdapter viewPagerAdapter = null;
        if (z9) {
            ViewPagerAdapter viewPagerAdapter2 = this.pagerAdapter;
            if (viewPagerAdapter2 == null) {
                kotlin.jvm.internal.n.r("pagerAdapter");
            } else {
                viewPagerAdapter = viewPagerAdapter2;
            }
            viewPagerAdapter.setMusicMetaData(data);
        } else {
            ViewPagerAdapter viewPagerAdapter3 = this.pagerAdapter;
            if (viewPagerAdapter3 == null) {
                kotlin.jvm.internal.n.r("pagerAdapter");
            } else {
                viewPagerAdapter = viewPagerAdapter3;
            }
            viewPagerAdapter.updateMusicMetaData(data);
        }
        setSwitchVibration(data.m());
    }

    @Override // com.nothing.cardwidget.mediaplayer.IMediaMetaDataChanged
    public void updateMusicPosition(int i10) {
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.updateMusicPosition(i10);
    }

    @Override // com.nothing.cardwidget.mediaplayer.IMediaMetaDataChanged
    public void updatePlayBackState(int i10) {
        ViewPagerAdapter viewPagerAdapter = this.pagerAdapter;
        if (viewPagerAdapter == null) {
            kotlin.jvm.internal.n.r("pagerAdapter");
            viewPagerAdapter = null;
        }
        viewPagerAdapter.updatePlayBackState(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPlayerPagerView(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
    }

    public /* synthetic */ MediaPlayerPagerView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerPagerView(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
        this.attrs = attrs;
        this.uiRatio = 1.0f;
    }
}
