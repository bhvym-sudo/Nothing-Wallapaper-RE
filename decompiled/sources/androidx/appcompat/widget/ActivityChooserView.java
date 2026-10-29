package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AbstractC1070b;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f10650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ImageView f10651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final FrameLayout f10652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    AbstractC1070b f10653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f10654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private z f10655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    PopupWindow.OnDismissListener f10656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f10657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10658y;

    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int[] f10659q = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            J jU = J.u(context, attributeSet, f10659q);
            setBackgroundDrawable(jU.g(0));
            jU.x();
        }
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f10654u);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().a();
    }

    public AbstractC1007d getDataModel() {
        throw null;
    }

    z getListPopupWindow() {
        if (this.f10655v == null) {
            z zVar = new z(getContext());
            this.f10655v = zVar;
            zVar.p(null);
            this.f10655v.D(this);
            this.f10655v.J(true);
            this.f10655v.L(null);
            this.f10655v.K(null);
        }
        return this.f10655v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        this.f10650q.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View view = this.f10650q;
        if (this.f10652s.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), BasicMeasure.EXACTLY);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(AbstractC1007d abstractC1007d) {
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f10658y = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f10651r.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f10651r.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f10657x = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f10656w = onDismissListener;
    }

    public void setProvider(AbstractC1070b abstractC1070b) {
        this.f10653t = abstractC1070b;
    }
}
