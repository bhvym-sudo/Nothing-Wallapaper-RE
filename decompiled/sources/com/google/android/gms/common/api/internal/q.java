package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C1021a;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p015b4.C1182b;
import p025c4.AbstractC1201o;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public final class q implements a4.e.a, a4.e.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ C1225b f16292C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a4.a.f f16294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1182b f16295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f16296t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f16299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p015b4.A f16300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f16301y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Queue f16293q = new LinkedList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f16297u = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Map f16298v = new HashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f16302z = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Z3.a f16290A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f16291B = 0;

    public q(C1225b c1225b, p005a4.d dVar) {
        this.f16292C = c1225b;
        a4.a.f fVarN = dVar.n(c1225b.f16249p.getLooper(), this);
        this.f16294r = fVarN;
        this.f16295s = dVar.j();
        this.f16296t = new j();
        this.f16299w = dVar.m();
        if (fVarN.o()) {
            this.f16300x = dVar.o(c1225b.f16240g, c1225b.f16249p);
        } else {
            this.f16300x = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(q qVar, r rVar) {
        if (qVar.f16302z.contains(rVar) && !qVar.f16301y) {
            if (qVar.f16294r.g()) {
                qVar.i();
            } else {
                qVar.D();
            }
        }
    }

    static /* bridge */ /* synthetic */ void B(q qVar, r rVar) {
        Z3.c[] cVarArrG;
        if (qVar.f16302z.remove(rVar)) {
            qVar.f16292C.f16249p.removeMessages(15, rVar);
            qVar.f16292C.f16249p.removeMessages(16, rVar);
            Z3.c cVar = rVar.f16304b;
            ArrayList arrayList = new ArrayList(qVar.f16293q.size());
            for (E e10 : qVar.f16293q) {
                if ((e10 instanceof p015b4.r) && (cVarArrG = ((p015b4.r) e10).g(qVar)) != null && p085i4.a.b(cVarArrG, cVar)) {
                    arrayList.add(e10);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e11 = (E) arrayList.get(i10);
                qVar.f16293q.remove(e11);
                e11.b(new p005a4.h(cVar));
            }
        }
    }

    private final Z3.c d(Z3.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            Z3.c[] cVarArrM = this.f16294r.m();
            if (cVarArrM == null) {
                cVarArrM = new Z3.c[0];
            }
            C1021a c1021a = new C1021a(cVarArrM.length);
            for (Z3.c cVar : cVarArrM) {
                c1021a.put(cVar.a(), Long.valueOf(cVar.b()));
            }
            for (Z3.c cVar2 : cVarArr) {
                Long l9 = (Long) c1021a.get(cVar2.a());
                if (l9 == null || l9.longValue() < cVar2.b()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void f(Z3.a aVar) {
        Iterator it = this.f16297u.iterator();
        if (!it.hasNext()) {
            this.f16297u.clear();
            return;
        }
        androidx.appcompat.app.o.a(it.next());
        if (AbstractC1201o.a(aVar, Z3.a.f9441u)) {
            this.f16294r.e();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Status status) {
        AbstractC1202p.d(this.f16292C.f16249p);
        h(status, null, false);
    }

    private final void h(Status status, Exception exc, boolean z9) {
        AbstractC1202p.d(this.f16292C.f16249p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f16293q.iterator();
        while (it.hasNext()) {
            E e10 = (E) it.next();
            if (!z9 || e10.f16213a == 2) {
                if (status != null) {
                    e10.a(status);
                } else {
                    e10.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f16293q);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            E e10 = (E) arrayList.get(i10);
            if (!this.f16294r.g()) {
                return;
            }
            if (o(e10)) {
                this.f16293q.remove(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        C();
        f(Z3.a.f9441u);
        n();
        Iterator it = this.f16298v.values().iterator();
        while (it.hasNext()) {
            p015b4.t tVar = (p015b4.t) it.next();
            if (d(tVar.f14912a.c()) != null) {
                it.remove();
            } else {
                try {
                    tVar.f14912a.d(this.f16294r, new p215v4.l());
                } catch (DeadObjectException unused) {
                    c(3);
                    this.f16294r.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        i();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i10) {
        C();
        this.f16301y = true;
        this.f16296t.c(i10, this.f16294r.n());
        C1225b c1225b = this.f16292C;
        c1225b.f16249p.sendMessageDelayed(Message.obtain(c1225b.f16249p, 9, this.f16295s), this.f16292C.f16234a);
        C1225b c1225b2 = this.f16292C;
        c1225b2.f16249p.sendMessageDelayed(Message.obtain(c1225b2.f16249p, 11, this.f16295s), this.f16292C.f16235b);
        this.f16292C.f16242i.c();
        Iterator it = this.f16298v.values().iterator();
        while (it.hasNext()) {
            ((p015b4.t) it.next()).f14914c.run();
        }
    }

    private final void l() {
        this.f16292C.f16249p.removeMessages(12, this.f16295s);
        C1225b c1225b = this.f16292C;
        c1225b.f16249p.sendMessageDelayed(c1225b.f16249p.obtainMessage(12, this.f16295s), this.f16292C.f16236c);
    }

    private final void m(E e10) {
        e10.d(this.f16296t, L());
        try {
            e10.c(this);
        } catch (DeadObjectException unused) {
            c(1);
            this.f16294r.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        if (this.f16301y) {
            this.f16292C.f16249p.removeMessages(11, this.f16295s);
            this.f16292C.f16249p.removeMessages(9, this.f16295s);
            this.f16301y = false;
        }
    }

    private final boolean o(E e10) {
        if (!(e10 instanceof p015b4.r)) {
            m(e10);
            return true;
        }
        p015b4.r rVar = (p015b4.r) e10;
        Z3.c cVarD = d(rVar.g(this));
        if (cVarD == null) {
            m(e10);
            return true;
        }
        Log.w("GoogleApiManager", this.f16294r.getClass().getName() + " could not execute call because it requires feature (" + cVarD.a() + ", " + cVarD.b() + ").");
        if (!this.f16292C.f16250q || !rVar.f(this)) {
            rVar.b(new p005a4.h(cVarD));
            return true;
        }
        r rVar2 = new r(this.f16295s, cVarD, null);
        int iIndexOf = this.f16302z.indexOf(rVar2);
        if (iIndexOf >= 0) {
            r rVar3 = (r) this.f16302z.get(iIndexOf);
            this.f16292C.f16249p.removeMessages(15, rVar3);
            C1225b c1225b = this.f16292C;
            c1225b.f16249p.sendMessageDelayed(Message.obtain(c1225b.f16249p, 15, rVar3), this.f16292C.f16234a);
            return false;
        }
        this.f16302z.add(rVar2);
        C1225b c1225b2 = this.f16292C;
        c1225b2.f16249p.sendMessageDelayed(Message.obtain(c1225b2.f16249p, 15, rVar2), this.f16292C.f16234a);
        C1225b c1225b3 = this.f16292C;
        c1225b3.f16249p.sendMessageDelayed(Message.obtain(c1225b3.f16249p, 16, rVar2), this.f16292C.f16235b);
        Z3.a aVar = new Z3.a(2, null);
        if (p(aVar)) {
            return false;
        }
        this.f16292C.g(aVar, this.f16299w);
        return false;
    }

    private final boolean p(Z3.a aVar) {
        synchronized (C1225b.f16232t) {
            try {
                C1225b c1225b = this.f16292C;
                if (c1225b.f16246m == null || !c1225b.f16247n.contains(this.f16295s)) {
                    return false;
                }
                this.f16292C.f16246m.s(aVar, this.f16299w);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean q(boolean z9) {
        AbstractC1202p.d(this.f16292C.f16249p);
        if (!this.f16294r.g() || this.f16298v.size() != 0) {
            return false;
        }
        if (!this.f16296t.e()) {
            this.f16294r.c("Timing out service connection.");
            return true;
        }
        if (z9) {
            l();
        }
        return false;
    }

    public final void C() {
        AbstractC1202p.d(this.f16292C.f16249p);
        this.f16290A = null;
    }

    public final void D() {
        AbstractC1202p.d(this.f16292C.f16249p);
        if (this.f16294r.g() || this.f16294r.d()) {
            return;
        }
        try {
            C1225b c1225b = this.f16292C;
            int iB = c1225b.f16242i.b(c1225b.f16240g, this.f16294r);
            if (iB == 0) {
                C1225b c1225b2 = this.f16292C;
                a4.a.f fVar = this.f16294r;
                t tVar = new t(c1225b2, fVar, this.f16295s);
                if (fVar.o()) {
                    ((p015b4.A) AbstractC1202p.i(this.f16300x)).a0(tVar);
                }
                try {
                    this.f16294r.a(tVar);
                    return;
                } catch (SecurityException e10) {
                    G(new Z3.a(10), e10);
                    return;
                }
            }
            Z3.a aVar = new Z3.a(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f16294r.getClass().getName() + " is not available: " + aVar.toString());
            G(aVar, null);
        } catch (IllegalStateException e11) {
            G(new Z3.a(10), e11);
        }
    }

    public final void E(E e10) {
        AbstractC1202p.d(this.f16292C.f16249p);
        if (this.f16294r.g()) {
            if (o(e10)) {
                l();
                return;
            } else {
                this.f16293q.add(e10);
                return;
            }
        }
        this.f16293q.add(e10);
        Z3.a aVar = this.f16290A;
        if (aVar == null || !aVar.d()) {
            D();
        } else {
            G(this.f16290A, null);
        }
    }

    final void F() {
        this.f16291B++;
    }

    public final void G(Z3.a aVar, Exception exc) {
        AbstractC1202p.d(this.f16292C.f16249p);
        p015b4.A a10 = this.f16300x;
        if (a10 != null) {
            a10.b0();
        }
        C();
        this.f16292C.f16242i.c();
        f(aVar);
        if ((this.f16294r instanceof p045e4.e) && aVar.a() != 24) {
            this.f16292C.f16237d = true;
            C1225b c1225b = this.f16292C;
            c1225b.f16249p.sendMessageDelayed(c1225b.f16249p.obtainMessage(19), 300000L);
        }
        if (aVar.a() == 4) {
            g(C1225b.f16231s);
            return;
        }
        if (this.f16293q.isEmpty()) {
            this.f16290A = aVar;
            return;
        }
        if (exc != null) {
            AbstractC1202p.d(this.f16292C.f16249p);
            h(null, exc, false);
            return;
        }
        if (!this.f16292C.f16250q) {
            g(C1225b.h(this.f16295s, aVar));
            return;
        }
        h(C1225b.h(this.f16295s, aVar), null, true);
        if (this.f16293q.isEmpty() || p(aVar) || this.f16292C.g(aVar, this.f16299w)) {
            return;
        }
        if (aVar.a() == 18) {
            this.f16301y = true;
        }
        if (!this.f16301y) {
            g(C1225b.h(this.f16295s, aVar));
        } else {
            C1225b c1225b2 = this.f16292C;
            c1225b2.f16249p.sendMessageDelayed(Message.obtain(c1225b2.f16249p, 9, this.f16295s), this.f16292C.f16234a);
        }
    }

    public final void H(Z3.a aVar) {
        AbstractC1202p.d(this.f16292C.f16249p);
        a4.a.f fVar = this.f16294r;
        fVar.c("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(aVar));
        G(aVar, null);
    }

    public final void I() {
        AbstractC1202p.d(this.f16292C.f16249p);
        if (this.f16301y) {
            D();
        }
    }

    public final void J() {
        AbstractC1202p.d(this.f16292C.f16249p);
        g(C1225b.f16230r);
        this.f16296t.d();
        for (C1226c.a aVar : (C1226c.a[]) this.f16298v.keySet().toArray(new C1226c.a[0])) {
            E(new D(aVar, new p215v4.l()));
        }
        f(new Z3.a(4));
        if (this.f16294r.g()) {
            this.f16294r.j(new p(this));
        }
    }

    public final void K() {
        AbstractC1202p.d(this.f16292C.f16249p);
        if (this.f16301y) {
            n();
            C1225b c1225b = this.f16292C;
            g(c1225b.f16241h.f(c1225b.f16240g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f16294r.c("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f16294r.o();
    }

    @Override // p015b4.h
    public final void a(Z3.a aVar) {
        G(aVar, null);
    }

    public final boolean b() {
        return q(true);
    }

    @Override // p015b4.InterfaceC1183c
    public final void c(int i10) {
        if (Looper.myLooper() == this.f16292C.f16249p.getLooper()) {
            k(i10);
        } else {
            this.f16292C.f16249p.post(new n(this, i10));
        }
    }

    @Override // p015b4.InterfaceC1183c
    public final void e(Bundle bundle) {
        if (Looper.myLooper() == this.f16292C.f16249p.getLooper()) {
            j();
        } else {
            this.f16292C.f16249p.post(new m(this));
        }
    }

    public final int r() {
        return this.f16299w;
    }

    final int s() {
        return this.f16291B;
    }

    public final a4.a.f u() {
        return this.f16294r;
    }

    public final Map w() {
        return this.f16298v;
    }
}
