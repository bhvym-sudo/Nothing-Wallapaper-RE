package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1139y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f13253a;

    private C1139y(A a10) {
        this.f13253a = a10;
    }

    public static C1139y b(A a10) {
        return new C1139y((A) B0.i.f(a10, "callbacks == null"));
    }

    public void a(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        J j9 = this.f13253a.j();
        A a10 = this.f13253a;
        j9.n(a10, a10, abstractComponentCallbacksC1132q);
    }

    public void c() {
        this.f13253a.j().z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f13253a.j().C(menuItem);
    }

    public void e() {
        this.f13253a.j().D();
    }

    public void f() {
        this.f13253a.j().F();
    }

    public void g() {
        this.f13253a.j().O();
    }

    public void h() {
        this.f13253a.j().S();
    }

    public void i() {
        this.f13253a.j().T();
    }

    public void j() {
        this.f13253a.j().V();
    }

    public boolean k() {
        return this.f13253a.j().c0(true);
    }

    public J l() {
        return this.f13253a.j();
    }

    public void m() {
        this.f13253a.j().X0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f13253a.j().z0().onCreateView(view, str, context, attributeSet);
    }
}
