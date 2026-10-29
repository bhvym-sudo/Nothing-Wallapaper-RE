package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC1077i;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f10532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f10536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f10539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f10540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f10542l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z9, int i10) {
        this(context, eVar, view, z9, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f10531a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f10531a.getResources().getDimensionPixelSize(p050f.d.f20372c) ? new b(this.f10531a, this.f10536f, this.f10534d, this.f10535e, this.f10533c) : new l(this.f10531a, this.f10532b, this.f10536f, this.f10534d, this.f10535e, this.f10533c);
        bVar.l(this.f10532b);
        bVar.u(this.f10542l);
        bVar.p(this.f10536f);
        bVar.h(this.f10539i);
        bVar.r(this.f10538h);
        bVar.s(this.f10537g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z9, boolean z10) {
        h hVarC = c();
        hVarC.v(z10);
        if (z9) {
            if ((AbstractC1077i.b(this.f10537g, this.f10536f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f10536f.getWidth();
            }
            hVarC.t(i10);
            hVarC.w(i11);
            int i12 = (int) ((this.f10531a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.b();
    }

    public void b() {
        if (d()) {
            this.f10540j.dismiss();
        }
    }

    public h c() {
        if (this.f10540j == null) {
            this.f10540j = a();
        }
        return this.f10540j;
    }

    public boolean d() {
        h hVar = this.f10540j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f10540j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f10541k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f10536f = view;
    }

    public void g(boolean z9) {
        this.f10538h = z9;
        h hVar = this.f10540j;
        if (hVar != null) {
            hVar.r(z9);
        }
    }

    public void h(int i10) {
        this.f10537g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f10541k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f10539i = aVar;
        h hVar = this.f10540j;
        if (hVar != null) {
            hVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f10536f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f10536f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z9, int i10, int i11) {
        this.f10537g = 8388611;
        this.f10542l = new a();
        this.f10531a = context;
        this.f10532b = eVar;
        this.f10536f = view;
        this.f10533c = z9;
        this.f10534d = i10;
        this.f10535e = i11;
    }
}
