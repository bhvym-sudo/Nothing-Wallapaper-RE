package com.nothing.cardservice.sharewidget.sticker;

import B8.h;
import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import F8.M;
import F8.T0;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.nothing.cardservice.ShareStickerInfo;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class StickerView extends FrameLayout {
    public static final a Companion = new a(null);
    private static final int STICKER_DEFAULT_SIZE = 101;
    private static final String TAG = "CustomStickerView";
    private static final float VIEW_DEFAULT_SIZE = 335.0f;
    private Context context;
    private double edgingWidth;
    private final L ioScope;
    private ImageView stickerIcon;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17998q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Uri f17999r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ShareStickerInfo f18000s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ StickerView f18001t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, ShareStickerInfo shareStickerInfo, StickerView stickerView, e eVar) {
            super(2, eVar);
            this.f17999r = uri;
            this.f18000s = shareStickerInfo;
            this.f18001t = stickerView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f17999r, this.f18000s, this.f18001t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17998q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            G5.c.f1948a.h(StickerView.TAG, "setSticker uri = " + this.f17999r + ", stickerInfo:" + this.f18000s.getJsonStr());
            Uri uri = this.f17999r;
            if (uri == null) {
                return null;
            }
            StickerView stickerView = this.f18001t;
            ShareStickerInfo shareStickerInfo = this.f18000s;
            stickerView.setViewEdgingWidth(shareStickerInfo.getPaddingGap());
            stickerView.setSticker(uri, shareStickerInfo.getPercentX(), shareStickerInfo.getPercentY());
            return A.f21846a;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18002q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f18004s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, e eVar) {
            super(2, eVar);
            this.f18004s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return StickerView.this.new c(this.f18004s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f18002q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            com.nothing.cardservice.sharewidget.sticker.a aVar = com.nothing.cardservice.sharewidget.sticker.a.f18005a;
            Context context = StickerView.this.context;
            if (context == null) {
                n.r("context");
                context = null;
            }
            aVar.a(context, this.f18004s);
            return A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context) {
        super(context);
        n.h(context, "context");
        this.ioScope = M.a(C0803b0.b().z(T0.b(null, 1, null)));
        init(context);
    }

    private final void changeMarginByPercentXY(ImageView imageView, float f10, float f11, int i10, int i11, int i12, int i13, int i14) {
        Number numberValueOf;
        Number numberValueOf2;
        float f12 = (i12 - i10) * f10;
        float f13 = i14;
        if (f12 < f13) {
            numberValueOf = Integer.valueOf(i14);
        } else {
            int i15 = (i12 - i14) - i10;
            numberValueOf = f12 > ((float) i15) ? Integer.valueOf(i15) : Float.valueOf(f12);
        }
        float f14 = (i13 - i11) * f11;
        if (f14 < f13) {
            numberValueOf2 = Integer.valueOf(i14);
        } else {
            int i16 = (i13 - i14) - i11;
            numberValueOf2 = f14 > ((float) i16) ? Integer.valueOf(i16) : Float.valueOf(f14);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        n.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i10;
        layoutParams2.height = i11;
        G5.c.f1948a.h(TAG, "wjw changeMarginByPercentXY, layoutParams:" + layoutParams2 + ", marginStart:" + numberValueOf + ", marginEnd:" + numberValueOf2 + ", percentX:" + f10 + ",percentY:" + f11 + ", stickWidth:" + i10 + ",containerWidth:" + i12 + ",borderWidth:" + i14);
        G5.b bVar = G5.b.f1947a;
        Context context = this.context;
        if (context == null) {
            n.r("context");
            context = null;
        }
        layoutParams2.gravity = bVar.a(context) ? 8388611 : 8388613;
        layoutParams2.setMargins(numberValueOf.intValue(), numberValueOf2.intValue(), 0, 0);
        imageView.setLayoutParams(layoutParams2);
    }

    private final void changeStickerPosition(float f10, float f11) {
        float fH = h.h(h.e(f10, 0.0f), 1.0f);
        float fH2 = h.h(h.e(f11, 0.0f), 1.0f);
        int iB = p239x8.a.b((getWidth() / VIEW_DEFAULT_SIZE) * 101);
        ImageView imageView = this.stickerIcon;
        if (imageView == null) {
            n.r("stickerIcon");
            imageView = null;
        }
        changeMarginByPercentXY(imageView, fH, fH2, iB, iB, getWidth(), getHeight(), (int) this.edgingWidth);
    }

    private final void init(Context context) {
        this.context = context;
        ImageView imageView = new ImageView(context);
        this.stickerIcon = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        View view = this.stickerIcon;
        if (view == null) {
            n.r("stickerIcon");
            view = null;
        }
        addView(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSticker(final Uri uri, final float f10, final float f11) {
        Log.d("Share", "setSticker percentX: " + f10 + ", percentY: " + f11);
        post(new Runnable() { // from class: com.nothing.cardservice.sharewidget.sticker.c
            @Override // java.lang.Runnable
            public final void run() {
                StickerView.setSticker$lambda$4(this.f18009q, f10, f11, uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSticker$lambda$4(StickerView this$0, float f10, float f11, Uri uri) {
        n.h(this$0, "this$0");
        this$0.changeStickerPosition(f10, f11);
        if (uri != null) {
            this$0.setStickerUri(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStickerPosition$lambda$2(StickerView this$0, float f10, float f11) {
        n.h(this$0, "this$0");
        this$0.changeStickerPosition(f10, f11);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        ImageView imageView = this.stickerIcon;
        if (imageView == null) {
            n.r("stickerIcon");
            imageView = null;
        }
        bringChildToFront(imageView);
    }

    public final void setStickerImage(int i10) {
        Log.d(TAG, "setStickerImage resId: " + i10);
        ImageView imageView = this.stickerIcon;
        if (imageView == null) {
            n.r("stickerIcon");
            imageView = null;
        }
        imageView.setImageResource(i10);
    }

    public final Object setStickerInfo(Uri uri, ShareStickerInfo shareStickerInfo, e<? super A> eVar) {
        return AbstractC0812g.g(C0803b0.c(), new b(uri, shareStickerInfo, this, null), eVar);
    }

    public final void setStickerPosition(final float f10, final float f11) {
        Log.d("Share", "setStickerPosition percentX: " + f10 + ", percentY: " + f11);
        post(new Runnable() { // from class: com.nothing.cardservice.sharewidget.sticker.b
            @Override // java.lang.Runnable
            public final void run() {
                StickerView.setStickerPosition$lambda$2(this.f18006q, f10, f11);
            }
        });
    }

    public final void setStickerUri(Uri uri) {
        G5.c.f1948a.h(TAG, "setStickerUri uri = " + uri + "}");
        if (uri != null) {
            Context context = this.context;
            ImageView imageView = null;
            if (context == null) {
                n.r("context");
                context = null;
            }
            RequestBuilder requestBuilderOverride = Glide.with(context.getApplicationContext()).load(uri).override(101, 101);
            ImageView imageView2 = this.stickerIcon;
            if (imageView2 == null) {
                n.r("stickerIcon");
            } else {
                imageView = imageView2;
            }
            requestBuilderOverride.into(imageView);
        }
    }

    public final void setStickerVisible(boolean z9) {
        G5.c.f1948a.h(TAG, "setStickerVisible visible = " + z9);
        ImageView imageView = this.stickerIcon;
        if (imageView == null) {
            n.r("stickerIcon");
            imageView = null;
        }
        imageView.setVisibility(z9 ? 0 : 8);
    }

    public final void setViewEdgingWidth(double d10) {
        this.edgingWidth = d10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        this.ioScope = M.a(C0803b0.b().z(T0.b(null, 1, null)));
        init(context);
    }

    public final void setStickerUri(String uri) {
        n.h(uri, "uri");
        AbstractC0816i.d(this.ioScope, null, null, new c(uri, null), 3, null);
    }
}
