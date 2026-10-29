package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1016m extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f11103b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11104a;

    public C1016m(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        J jV = J.v(context, attributeSet, p050f.j.f20589Y1, i10, i11);
        int i12 = p050f.j.f20598a2;
        if (jV.s(i12)) {
            b(jV.a(i12, false));
        }
        setBackgroundDrawable(jV.g(p050f.j.f20593Z1));
        jV.x();
    }

    private void b(boolean z9) {
        if (f11103b) {
            this.f11104a = z9;
        } else {
            androidx.core.widget.k.a(this, z9);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f11103b && this.f11104a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f11103b && this.f11104a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f11103b && this.f11104a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
