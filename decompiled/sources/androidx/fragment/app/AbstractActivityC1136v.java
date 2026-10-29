package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.view.InterfaceC1081m;
import androidx.core.view.InterfaceC1084p;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1136v extends p010b.j implements q0.a.c {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f13242O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f13243P;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final C1139y f13240M = C1139y.b(new a());

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final C1165z f13241N = new C1165z(this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    boolean f13244Q = true;

    /* JADX INFO: renamed from: androidx.fragment.app.v$a */
    class a extends A implements p171r0.b, p171r0.c, p161q0.m, p161q0.n, f0, p010b.w, p030d.f, p082i1.f, N, InterfaceC1081m {
        public a() {
            super(AbstractActivityC1136v.this);
        }

        public void A() {
            AbstractActivityC1136v.this.g0();
        }

        @Override // androidx.fragment.app.A
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1136v q() {
            return AbstractActivityC1136v.this;
        }

        @Override // p161q0.n
        public void C(B0.a aVar) {
            AbstractActivityC1136v.this.C(aVar);
        }

        @Override // androidx.core.view.InterfaceC1081m
        public void D(InterfaceC1084p interfaceC1084p) {
            AbstractActivityC1136v.this.D(interfaceC1084p);
        }

        @Override // androidx.fragment.app.N
        public void a(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            AbstractActivityC1136v.this.s0(abstractComponentCallbacksC1132q);
        }

        @Override // androidx.fragment.app.AbstractC1138x
        public View c(int i10) {
            return AbstractActivityC1136v.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC1138x
        public boolean d() {
            Window window = AbstractActivityC1136v.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p010b.w
        public p010b.v f() {
            return AbstractActivityC1136v.this.f();
        }

        @Override // androidx.core.view.InterfaceC1081m
        public void g(InterfaceC1084p interfaceC1084p) {
            AbstractActivityC1136v.this.g(interfaceC1084p);
        }

        @Override // androidx.lifecycle.InterfaceC1163x
        public AbstractC1157q getLifecycle() {
            return AbstractActivityC1136v.this.f13241N;
        }

        @Override // p082i1.f
        public p082i1.d getSavedStateRegistry() {
            return AbstractActivityC1136v.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.f0
        public e0 getViewModelStore() {
            return AbstractActivityC1136v.this.getViewModelStore();
        }

        @Override // p161q0.m
        public void i(B0.a aVar) {
            AbstractActivityC1136v.this.i(aVar);
        }

        @Override // p171r0.b
        public void l(B0.a aVar) {
            AbstractActivityC1136v.this.l(aVar);
        }

        @Override // p161q0.m
        public void m(B0.a aVar) {
            AbstractActivityC1136v.this.m(aVar);
        }

        @Override // p030d.f
        public p030d.e n() {
            return AbstractActivityC1136v.this.n();
        }

        @Override // p171r0.b
        public void o(B0.a aVar) {
            AbstractActivityC1136v.this.o(aVar);
        }

        @Override // androidx.fragment.app.A
        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1136v.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // p171r0.c
        public void r(B0.a aVar) {
            AbstractActivityC1136v.this.r(aVar);
        }

        @Override // p171r0.c
        public void s(B0.a aVar) {
            AbstractActivityC1136v.this.s(aVar);
        }

        @Override // androidx.fragment.app.A
        public LayoutInflater t() {
            return AbstractActivityC1136v.this.getLayoutInflater().cloneInContext(AbstractActivityC1136v.this);
        }

        @Override // p161q0.n
        public void v(B0.a aVar) {
            AbstractActivityC1136v.this.v(aVar);
        }

        @Override // androidx.fragment.app.A
        public boolean w(String str) {
            return p161q0.a.k(AbstractActivityC1136v.this, str);
        }

        @Override // androidx.fragment.app.A
        public void z() {
            A();
        }
    }

    public AbstractActivityC1136v() {
        p0();
    }

    public static /* synthetic */ Bundle l0(AbstractActivityC1136v abstractActivityC1136v) {
        abstractActivityC1136v.q0();
        abstractActivityC1136v.f13241N.i(AbstractC1157q.a.ON_STOP);
        return new Bundle();
    }

    private void p0() {
        getSavedStateRegistry().h("android:support:lifecycle", new i1.d.c() { // from class: androidx.fragment.app.r
            @Override // i1.d.c
            public final Bundle saveState() {
                return AbstractActivityC1136v.l0(this.f13236a);
            }
        });
        o(new B0.a() { // from class: androidx.fragment.app.s
            @Override // B0.a
            public final void accept(Object obj) {
                this.f13237a.f13240M.m();
            }
        });
        b0(new B0.a() { // from class: androidx.fragment.app.t
            @Override // B0.a
            public final void accept(Object obj) {
                this.f13238a.f13240M.m();
            }
        });
        a0(new p020c.b() { // from class: androidx.fragment.app.u
            @Override // p020c.b
            public final void a(Context context) {
                this.f13239a.f13240M.a(null);
            }
        });
    }

    private static boolean r0(J j9, AbstractC1157q.b bVar) {
        boolean zR0 = false;
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : j9.x0()) {
            if (abstractComponentCallbacksC1132q != null) {
                if (abstractComponentCallbacksC1132q.getHost() != null) {
                    zR0 |= r0(abstractComponentCallbacksC1132q.getChildFragmentManager(), bVar);
                }
                W w9 = abstractComponentCallbacksC1132q.mViewLifecycleOwner;
                if (w9 != null && w9.getLifecycle().b().e(AbstractC1157q.b.STARTED)) {
                    abstractComponentCallbacksC1132q.mViewLifecycleOwner.g(bVar);
                    zR0 = true;
                }
                if (abstractComponentCallbacksC1132q.mLifecycleRegistry.b().e(AbstractC1157q.b.STARTED)) {
                    abstractComponentCallbacksC1132q.mLifecycleRegistry.n(bVar);
                    zR0 = true;
                }
            }
        }
        return zR0;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (I(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f13242O);
            printWriter.print(" mResumed=");
            printWriter.print(this.f13243P);
            printWriter.print(" mStopped=");
            printWriter.print(this.f13244Q);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f13240M.l().Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // q0.a.c
    public final void e(int i10) {
    }

    final View n0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f13240M.n(view, str, context, attributeSet);
    }

    public J o0() {
        return this.f13240M.l();
    }

    @Override // p010b.j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f13240M.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13241N.i(AbstractC1157q.a.ON_CREATE);
        this.f13240M.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewN0 = n0(view, str, context, attributeSet);
        return viewN0 == null ? super.onCreateView(view, str, context, attributeSet) : viewN0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f13240M.f();
        this.f13241N.i(AbstractC1157q.a.ON_DESTROY);
    }

    @Override // p010b.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f13240M.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f13243P = false;
        this.f13240M.g();
        this.f13241N.i(AbstractC1157q.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        t0();
    }

    @Override // p010b.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f13240M.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f13240M.m();
        super.onResume();
        this.f13243P = true;
        this.f13240M.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f13240M.m();
        super.onStart();
        this.f13244Q = false;
        if (!this.f13242O) {
            this.f13242O = true;
            this.f13240M.c();
        }
        this.f13240M.k();
        this.f13241N.i(AbstractC1157q.a.ON_START);
        this.f13240M.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f13240M.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f13244Q = true;
        q0();
        this.f13240M.j();
        this.f13241N.i(AbstractC1157q.a.ON_STOP);
    }

    void q0() {
        while (r0(o0(), AbstractC1157q.b.CREATED)) {
        }
    }

    public void s0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
    }

    protected void t0() {
        this.f13241N.i(AbstractC1157q.a.ON_RESUME);
        this.f13240M.h();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewN0 = n0(null, str, context, attributeSet);
        return viewN0 == null ? super.onCreateView(str, context, attributeSet) : viewN0;
    }
}
