package com.nothing.wallpaper.picker.edit.crop.view;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.nothing.wallpaper.common.log.c;
import com.nothing.wallpaper.picker.edit.crop.view.EditSubsamplingScaleImageView;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p087i6.q;
import p167q6.b;
import p219v8.a;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class EditSubsamplingScaleImageView extends SubsamplingScaleImageView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f18530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f18531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f18532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p f18533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Insets f18535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final h f18536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18537x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditSubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        this.f18530q = new b(this);
        this.f18536w = i.b(new a() { // from class: n7.a
            @Override // p219v8.a
            public final Object invoke() {
                return EditSubsamplingScaleImageView.d(this.f23281q);
            }
        });
        this.f18537x = true;
    }

    private final void c(Float f10, PointF pointF) {
        G6.b.j(f10 != null ? f10.floatValue() : getScale(), new Point(getWidth(), getHeight()), new Point(getSWidth(), getSHeight()), pointF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point d(EditSubsamplingScaleImageView editSubsamplingScaleImageView) {
        Context context = editSubsamplingScaleImageView.getContext();
        n.g(context, "getContext(...)");
        return q.d(context);
    }

    private final Point getScreenSize() {
        return (Point) this.f18536w.getValue();
    }

    public final boolean b(MotionEvent event) {
        n.h(event, "event");
        Insets insets = this.f18535v;
        if (insets == null) {
            return false;
        }
        int action = event.getAction();
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        return (action == 0 || action == 5 || action == 261) && (rawX <= insets.left || rawX >= getScreenSize().x - insets.right || rawY <= insets.top || rawY >= getScreenSize().y - insets.bottom);
    }

    public final boolean getCanHandleTouchEvent() {
        return this.f18537x;
    }

    public final a getOnStartTouchListener() {
        return this.f18531r;
    }

    public final a getOnStateEndListener() {
        return this.f18532s;
    }

    public final p getOnStatePreEndListener() {
        return this.f18533t;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        n.h(insets, "insets");
        this.f18535v = insets.getInsets(WindowInsets.Type.systemGestures());
        return super.onApplyWindowInsets(insets);
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
    protected void onFlingEnd(int i10) {
        super.onFlingEnd(i10);
        this.f18530q.a("onFlingEnd: endType " + i10);
        this.f18534u = false;
        if (i10 != 2) {
            this.f18530q.a("notify onStateEnd.");
            a aVar = this.f18532s;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
    protected void onFlingStart(PointF endCenter) {
        n.h(endCenter, "endCenter");
        super.onFlingStart(endCenter);
        this.f18530q.a("onFlingStart, and notify onStatePreEndListener: scale=null,center=" + endCenter);
        this.f18534u = true;
        c(null, endCenter);
        p pVar = this.f18533t;
        if (pVar != null) {
            pVar.invoke(null, endCenter);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int action;
        n.h(event, "event");
        if (!this.f18537x) {
            return false;
        }
        if (b(event)) {
            c.c("onTouchEvent is navigation area, ignored");
            return false;
        }
        a aVar = this.f18531r;
        if (aVar != null) {
            aVar.invoke();
        }
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && ((action = event.getAction()) == 1 || action == 3)) {
            this.f18530q.a("motion end and notify onTouchEnd.");
            if (!this.f18534u) {
                this.f18530q.a("notify onStateEnd.");
                a aVar2 = this.f18532s;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        }
        return zOnTouchEvent;
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
    protected void onZoomEnd(int i10) {
        super.onZoomEnd(i10);
        this.f18530q.a("onZoomEnd type " + i10 + ".");
        this.f18534u = false;
        if (i10 != 2) {
            this.f18530q.a("notify onStateEnd.");
            a aVar = this.f18532s;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
    protected void onZoomStart(float f10, PointF sCenter) {
        n.h(sCenter, "sCenter");
        super.onZoomStart(f10, sCenter);
        this.f18530q.a("onZoomStart, and notify onStatePreEndListener: scale=" + f10 + ",center=" + sCenter);
        this.f18534u = true;
        c(Float.valueOf(f10), sCenter);
        p pVar = this.f18533t;
        if (pVar != null) {
            pVar.invoke(Float.valueOf(f10), sCenter);
        }
    }

    public final void setCanHandleTouchEvent(boolean z9) {
        this.f18537x = z9;
    }

    public final void setOnStartTouchListener(a aVar) {
        this.f18531r = aVar;
    }

    public final void setOnStateEndListener(a aVar) {
        this.f18532s = aVar;
    }

    public final void setOnStatePreEndListener(p pVar) {
        this.f18533t = pVar;
    }
}
