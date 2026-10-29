package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f13259k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f13260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p120m.b f13261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f13262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f13264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f13265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f13269j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (C.this.f13260a) {
                obj = C.this.f13265f;
                C.this.f13265f = C.f13259k;
            }
            C.this.n(obj);
        }
    }

    private class b extends d {
        b(I i10) {
            super(i10);
        }

        @Override // androidx.lifecycle.C.d
        boolean e() {
            return true;
        }
    }

    class c extends d implements InterfaceC1160u {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final InterfaceC1163x f13272u;

        c(InterfaceC1163x interfaceC1163x, I i10) {
            super(i10);
            this.f13272u = interfaceC1163x;
        }

        @Override // androidx.lifecycle.C.d
        void c() {
            this.f13272u.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.C.d
        boolean d(InterfaceC1163x interfaceC1163x) {
            return this.f13272u == interfaceC1163x;
        }

        @Override // androidx.lifecycle.C.d
        boolean e() {
            return this.f13272u.getLifecycle().b().e(AbstractC1157q.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
            AbstractC1157q.b bVarB = this.f13272u.getLifecycle().b();
            if (bVarB == AbstractC1157q.b.DESTROYED) {
                C.this.m(this.f13274q);
                return;
            }
            AbstractC1157q.b bVar = null;
            while (bVar != bVarB) {
                a(e());
                bVar = bVarB;
                bVarB = this.f13272u.getLifecycle().b();
            }
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final I f13274q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f13275r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f13276s = -1;

        d(I i10) {
            this.f13274q = i10;
        }

        void a(boolean z9) {
            if (z9 == this.f13275r) {
                return;
            }
            this.f13275r = z9;
            C.this.b(z9 ? 1 : -1);
            if (this.f13275r) {
                C.this.d(this);
            }
        }

        void c() {
        }

        boolean d(InterfaceC1163x interfaceC1163x) {
            return false;
        }

        abstract boolean e();
    }

    public C(Object obj) {
        this.f13260a = new Object();
        this.f13261b = new p120m.b();
        this.f13262c = 0;
        this.f13265f = f13259k;
        this.f13269j = new a();
        this.f13264e = obj;
        this.f13266g = 0;
    }

    static void a(String str) {
        if (p110l.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(d dVar) {
        if (dVar.f13275r) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f13276s;
            int i11 = this.f13266g;
            if (i10 >= i11) {
                return;
            }
            dVar.f13276s = i11;
            dVar.f13274q.b(this.f13264e);
        }
    }

    void b(int i10) {
        int i11 = this.f13262c;
        this.f13262c = i10 + i11;
        if (this.f13263d) {
            return;
        }
        this.f13263d = true;
        while (true) {
            try {
                int i12 = this.f13262c;
                if (i11 == i12) {
                    this.f13263d = false;
                    return;
                }
                boolean z9 = i11 == 0 && i12 > 0;
                boolean z10 = i11 > 0 && i12 == 0;
                if (z9) {
                    j();
                } else if (z10) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f13263d = false;
                throw th;
            }
        }
    }

    void d(d dVar) {
        if (this.f13267h) {
            this.f13268i = true;
            return;
        }
        this.f13267h = true;
        do {
            this.f13268i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                m.b.d dVarE = this.f13261b.e();
                while (dVarE.hasNext()) {
                    c((d) ((Map.Entry) dVarE.next()).getValue());
                    if (this.f13268i) {
                        break;
                    }
                }
            }
        } while (this.f13268i);
        this.f13267h = false;
    }

    public Object e() {
        Object obj = this.f13264e;
        if (obj != f13259k) {
            return obj;
        }
        return null;
    }

    public boolean f() {
        return this.f13262c > 0;
    }

    public boolean g() {
        return this.f13261b.size() > 0;
    }

    public void h(InterfaceC1163x interfaceC1163x, I i10) {
        a("observe");
        if (interfaceC1163x.getLifecycle().b() == AbstractC1157q.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1163x, i10);
        d dVar = (d) this.f13261b.j(i10, cVar);
        if (dVar != null && !dVar.d(interfaceC1163x)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC1163x.getLifecycle().a(cVar);
    }

    public void i(I i10) {
        a("observeForever");
        b bVar = new b(i10);
        d dVar = (d) this.f13261b.j(i10, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(Object obj) {
        boolean z9;
        synchronized (this.f13260a) {
            z9 = this.f13265f == f13259k;
            this.f13265f = obj;
        }
        if (z9) {
            p110l.c.g().c(this.f13269j);
        }
    }

    public void m(I i10) {
        a("removeObserver");
        d dVar = (d) this.f13261b.m(i10);
        if (dVar == null) {
            return;
        }
        dVar.c();
        dVar.a(false);
    }

    protected void n(Object obj) {
        a("setValue");
        this.f13266g++;
        this.f13264e = obj;
        d(null);
    }

    public C() {
        this.f13260a = new Object();
        this.f13261b = new p120m.b();
        this.f13262c = 0;
        Object obj = f13259k;
        this.f13265f = obj;
        this.f13269j = new a();
        this.f13264e = obj;
        this.f13266g = -1;
    }
}
