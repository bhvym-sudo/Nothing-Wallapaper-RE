package U8;

import P8.C0935a;
import P8.F;
import P8.r;
import P8.v;
import P8.z;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f8011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0935a f8012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f8013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f8014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.b f8015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f8016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private F f8020j;

    public d(g connectionPool, C0935a address, e call, r eventListener) {
        n.h(connectionPool, "connectionPool");
        n.h(address, "address");
        n.h(call, "call");
        n.h(eventListener, "eventListener");
        this.f8011a = connectionPool;
        this.f8012b = address;
        this.f8013c = call;
        this.f8014d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final f b(int i10, int i11, int i12, int i13, boolean z9) throws IOException {
        List listA;
        f fVar;
        Socket socketA;
        if (this.f8013c.f()) {
            throw new IOException("Canceled");
        }
        f fVarO = this.f8013c.o();
        if (fVarO != null) {
            synchronized (fVarO) {
                try {
                    socketA = (fVarO.q() || !g(fVarO.A().a().l())) ? this.f8013c.A() : null;
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f8013c.o() != null) {
                if (socketA == null) {
                    return fVarO;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketA != null) {
                Q8.d.n(socketA);
            }
            this.f8014d.k(this.f8013c, fVarO);
        }
        this.f8017g = 0;
        this.f8018h = 0;
        this.f8019i = 0;
        if (this.f8011a.a(this.f8012b, this.f8013c, null, false)) {
            f fVarO2 = this.f8013c.o();
            n.e(fVarO2);
            this.f8014d.j(this.f8013c, fVarO2);
            return fVarO2;
        }
        F fC = this.f8020j;
        try {
            if (fC == null) {
                j.b bVar = this.f8015e;
                if (bVar != null) {
                    n.e(bVar);
                    if (bVar.b()) {
                        j.b bVar2 = this.f8015e;
                        n.e(bVar2);
                        fC = bVar2.c();
                    }
                    fVar = new f(this.f8011a, fC);
                    this.f8013c.D(fVar);
                    fVar.g(i10, i11, i12, i13, z9, this.f8013c, this.f8014d);
                    this.f8013c.D(null);
                    this.f8013c.n().v().a(fVar.A());
                    if (this.f8011a.a(this.f8012b, this.f8013c, listA, true)) {
                        f fVarO3 = this.f8013c.o();
                        n.e(fVarO3);
                        this.f8020j = fC;
                        Q8.d.n(fVar.E());
                        this.f8014d.j(this.f8013c, fVarO3);
                        return fVarO3;
                    }
                    synchronized (fVar) {
                        this.f8011a.e(fVar);
                        this.f8013c.e(fVar);
                        A a11 = A.f21846a;
                    }
                    this.f8014d.j(this.f8013c, fVar);
                    return fVar;
                }
                j jVar = this.f8016f;
                if (jVar == null) {
                    jVar = new j(this.f8012b, this.f8013c.n().v(), this.f8013c, this.f8014d);
                    this.f8016f = jVar;
                }
                j.b bVarC = jVar.c();
                this.f8015e = bVarC;
                listA = bVarC.a();
                if (this.f8013c.f()) {
                    throw new IOException("Canceled");
                }
                if (this.f8011a.a(this.f8012b, this.f8013c, listA, false)) {
                    f fVarO4 = this.f8013c.o();
                    n.e(fVarO4);
                    this.f8014d.j(this.f8013c, fVarO4);
                    return fVarO4;
                }
                fC = bVarC.c();
                fVar = new f(this.f8011a, fC);
                this.f8013c.D(fVar);
                fVar.g(i10, i11, i12, i13, z9, this.f8013c, this.f8014d);
                this.f8013c.D(null);
                this.f8013c.n().v().a(fVar.A());
                if (this.f8011a.a(this.f8012b, this.f8013c, listA, true)) {
                    f fVarO5 = this.f8013c.o();
                    n.e(fVarO5);
                    this.f8020j = fC;
                    Q8.d.n(fVar.E());
                    this.f8014d.j(this.f8013c, fVarO5);
                    return fVarO5;
                }
                synchronized (fVar) {
                    this.f8011a.e(fVar);
                    this.f8013c.e(fVar);
                    A a12 = A.f21846a;
                    this.f8014d.j(this.f8013c, fVar);
                    return fVar;
                }
            }
            n.e(fC);
            this.f8020j = null;
            fVar.g(i10, i11, i12, i13, z9, this.f8013c, this.f8014d);
            this.f8013c.D(null);
            this.f8013c.n().v().a(fVar.A());
            if (this.f8011a.a(this.f8012b, this.f8013c, listA, true)) {
                f fVarO6 = this.f8013c.o();
                n.e(fVarO6);
                this.f8020j = fC;
                Q8.d.n(fVar.E());
                this.f8014d.j(this.f8013c, fVarO6);
                return fVarO6;
            }
            synchronized (fVar) {
                this.f8011a.e(fVar);
                this.f8013c.e(fVar);
                A a13 = A.f21846a;
                this.f8014d.j(this.f8013c, fVar);
                return fVar;
            }
        } catch (Throwable th2) {
            this.f8013c.D(null);
            throw th2;
        }
        listA = null;
        fVar = new f(this.f8011a, fC);
        this.f8013c.D(fVar);
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z9, boolean z10) throws IOException {
        while (true) {
            f fVarB = b(i10, i11, i12, i13, z9);
            if (fVarB.v(z10)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f8020j == null) {
                j.b bVar = this.f8015e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f8016f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final F f() {
        f fVarO;
        if (this.f8017g > 1 || this.f8018h > 1 || this.f8019i > 0 || (fVarO = this.f8013c.o()) == null) {
            return null;
        }
        synchronized (fVarO) {
            if (fVarO.r() != 0) {
                return null;
            }
            if (Q8.d.j(fVarO.A().a().l(), this.f8012b.l())) {
                return fVarO.A();
            }
            return null;
        }
    }

    public final V8.d a(z client, V8.g chain) {
        d dVar;
        n.h(client, "client");
        n.h(chain, "chain");
        try {
            dVar = this;
            try {
                return dVar.c(chain.g(), chain.i(), chain.k(), client.A(), client.H(), !n.d(chain.j().g(), "GET")).x(client, chain);
            } catch (i e10) {
                e = e10;
                i iVar = e;
                dVar.h(iVar.c());
                throw iVar;
            } catch (IOException e11) {
                e = e11;
                IOException iOException = e;
                dVar.h(iOException);
                throw new i(iOException);
            }
        } catch (i e12) {
            e = e12;
            dVar = this;
        } catch (IOException e13) {
            e = e13;
            dVar = this;
        }
    }

    public final C0935a d() {
        return this.f8012b;
    }

    public final boolean e() {
        j jVar;
        if (this.f8017g == 0 && this.f8018h == 0 && this.f8019i == 0) {
            return false;
        }
        if (this.f8020j != null) {
            return true;
        }
        F f10 = f();
        if (f10 != null) {
            this.f8020j = f10;
            return true;
        }
        j.b bVar = this.f8015e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f8016f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(v url) {
        n.h(url, "url");
        v vVarL = this.f8012b.l();
        return url.n() == vVarL.n() && n.d(url.i(), vVarL.i());
    }

    public final void h(IOException e10) {
        n.h(e10, "e");
        this.f8020j = null;
        if ((e10 instanceof X8.n) && ((X8.n) e10).f9223q == X8.b.REFUSED_STREAM) {
            this.f8017g++;
        } else if (e10 instanceof X8.a) {
            this.f8018h++;
        } else {
            this.f8019i++;
        }
    }
}
