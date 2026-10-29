package p015b4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import p005a4.a;
import p005a4.e;
import p025c4.AbstractC1202p;
import p025c4.C1190d;
import p025c4.J;
import p205u4.d;
import p205u4.l;

/* JADX INFO: loaded from: classes.dex */
public final class A extends d implements e.a, e.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final a.AbstractC0351a f14877x = p195t4.d.f27930c;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f14878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f14879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a.AbstractC0351a f14880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f14881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C1190d f14882u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p195t4.e f14883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private z f14884w;

    public A(Context context, Handler handler, C1190d c1190d) {
        a.AbstractC0351a abstractC0351a = f14877x;
        this.f14878q = context;
        this.f14879r = handler;
        this.f14882u = (C1190d) AbstractC1202p.j(c1190d, "ClientSettings must not be null");
        this.f14881t = c1190d.e();
        this.f14880s = abstractC0351a;
    }

    static /* bridge */ /* synthetic */ void Z(A a10, l lVar) {
        Z3.a aVarA = lVar.a();
        if (aVarA.e()) {
            J j9 = (J) AbstractC1202p.i(lVar.b());
            Z3.a aVarA2 = j9.a();
            if (!aVarA2.e()) {
                String strValueOf = String.valueOf(aVarA2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                a10.f14884w.b(aVarA2);
                a10.f14883v.f();
                return;
            }
            a10.f14884w.a(j9.b(), a10.f14881t);
        } else {
            a10.f14884w.b(aVarA);
        }
        a10.f14883v.f();
    }

    @Override // p015b4.h
    public final void a(Z3.a aVar) {
        this.f14884w.b(aVar);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [a4.a$f, t4.e] */
    public final void a0(z zVar) {
        p195t4.e eVar = this.f14883v;
        if (eVar != null) {
            eVar.f();
        }
        this.f14882u.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0351a abstractC0351a = this.f14880s;
        Context context = this.f14878q;
        Looper looper = this.f14879r.getLooper();
        C1190d c1190d = this.f14882u;
        this.f14883v = abstractC0351a.a(context, looper, c1190d, c1190d.f(), this, this);
        this.f14884w = zVar;
        Set set = this.f14881t;
        if (set == null || set.isEmpty()) {
            this.f14879r.post(new x(this));
        } else {
            this.f14883v.p();
        }
    }

    public final void b0() {
        p195t4.e eVar = this.f14883v;
        if (eVar != null) {
            eVar.f();
        }
    }

    @Override // p015b4.InterfaceC1183c
    public final void c(int i10) {
        this.f14883v.f();
    }

    @Override // p015b4.InterfaceC1183c
    public final void e(Bundle bundle) {
        this.f14883v.h(this);
    }

    @Override // p205u4.f
    public final void f(l lVar) {
        this.f14879r.post(new y(this, lVar));
    }
}
