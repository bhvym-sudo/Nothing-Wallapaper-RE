package com.nothing.launcher.card;

import android.content.Context;
import android.graphics.Rect;
import android.util.FloatProperty;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends l {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f18150p0 = new b(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Interpolator f18151q0 = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final FloatProperty f18152r0 = new a();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final p219v8.l f18153m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final ImageView f18154n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f18155o0;

    public static final class a extends FloatProperty {
        a() {
            super("deleteIconAlpha");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(s view) {
            kotlin.jvm.internal.n.h(view, "view");
            return Float.valueOf(view.f18154n0.getAlpha());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(s view, float f10) {
            kotlin.jvm.internal.n.h(view, "view");
            view.setDeleteIconAlpha(f10);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, p219v8.l lVar) {
        super(context);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18153m0 = lVar;
        View viewInflate = LayoutInflater.from(context).inflate(com.android.launcher3.s.f15695a, (ViewGroup) this, false);
        kotlin.jvm.internal.n.f(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        this.f18154n0 = imageView;
        this.f18155o0 = true;
        setClipToPadding(false);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.launcher.card.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.v0(this.f18148q, view);
            }
        });
        setDeleteIconAlpha(getActivityContext().Q() ? 1.0f : 0.0f);
        addView(imageView);
    }

    public static void u0(s sVar) {
        p219v8.l lVar = sVar.f18153m0;
        if (lVar != null) {
            lVar.f(Integer.valueOf(sVar.getAppWidgetId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(final s sVar, View view) {
        sVar.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(f18151q0).withEndAction(new Runnable() { // from class: com.nothing.launcher.card.r
            @Override // java.lang.Runnable
            public final void run() {
                s.u0(this.f18149q);
            }
        }).start();
    }

    private final boolean x0(MotionEvent motionEvent) {
        return new Rect(this.f18154n0.getLeft(), this.f18154n0.getTop(), this.f18154n0.getRight(), this.f18154n0.getBottom()).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean zN;
        kotlin.jvm.internal.n.h(ev, "ev");
        if (ev.getActionMasked() == 0) {
            F5.m appWidgetInfo = getAppWidgetInfo();
            if (appWidgetInfo != null) {
                F5.l.a aVar = F5.l.f1669g;
                Context context = getContext();
                kotlin.jvm.internal.n.g(context, "getContext(...)");
                zN = aVar.a(context).n(getAppWidgetId(), appWidgetInfo.b());
            } else {
                zN = true;
            }
            this.f18155o0 = zN;
        }
        if (x0(ev) || !this.f18155o0) {
            return super.onInterceptTouchEvent(ev);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        kotlin.jvm.internal.n.h(child, "child");
        if (!kotlin.jvm.internal.n.d(child, this.f18154n0)) {
            child.setImportantForAccessibility(4);
        }
        super.onViewAdded(child);
    }

    public final void setDeleteIconAlpha(float f10) {
        if (this.f18154n0.getAlpha() == f10) {
            return;
        }
        this.f18154n0.setAlpha(f10);
        this.f18154n0.setVisibility((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
    }
}
