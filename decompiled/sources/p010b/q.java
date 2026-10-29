package p010b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.n;
import p082i1.d;
import p082i1.e;
import p082i1.f;
import p082i1.g;

/* JADX INFO: loaded from: classes.dex */
public class q extends Dialog implements InterfaceC1163x, w, f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C1165z f14510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f14511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final v f14512s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i10) {
        super(context, i10);
        n.h(context, "context");
        this.f14511r = e.f21903d.a(this);
        this.f14512s = new v(new Runnable() { // from class: b.p
            @Override // java.lang.Runnable
            public final void run() {
                q.d(this.f14509q);
            }
        });
    }

    private final C1165z b() {
        C1165z c1165z = this.f14510q;
        if (c1165z != null) {
            return c1165z;
        }
        C1165z c1165z2 = new C1165z(this);
        this.f14510q = c1165z2;
        return c1165z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(q qVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n.h(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        n.e(window);
        View decorView = window.getDecorView();
        n.g(decorView, "window!!.decorView");
        g0.b(decorView, this);
        Window window2 = getWindow();
        n.e(window2);
        View decorView2 = window2.getDecorView();
        n.g(decorView2, "window!!.decorView");
        z.a(decorView2, this);
        Window window3 = getWindow();
        n.e(window3);
        View decorView3 = window3.getDecorView();
        n.g(decorView3, "window!!.decorView");
        g.b(decorView3, this);
    }

    @Override // p010b.w
    public final v f() {
        return this.f14512s;
    }

    @Override // androidx.lifecycle.InterfaceC1163x
    public AbstractC1157q getLifecycle() {
        return b();
    }

    @Override // p082i1.f
    public d getSavedStateRegistry() {
        return this.f14511r.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f14512s.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v vVar = this.f14512s;
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        n.g(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        vVar.o(onBackInvokedDispatcher);
        this.f14511r.d(bundle);
        b().i(AbstractC1157q.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        n.g(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f14511r.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(AbstractC1157q.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(AbstractC1157q.a.ON_DESTROY);
        this.f14510q = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        n.h(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n.h(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
