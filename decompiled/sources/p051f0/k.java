package p051f0;

import F8.InterfaceC0846x0;
import F8.J;
import F8.L;
import F8.M;
import F8.T0;
import kotlin.jvm.internal.AbstractC1457h;
import p081i0.d;
import p129m8.i;
import p129m8.j;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20742c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20743d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l f20744e = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final J f20745f = new b(J.f1817d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f20746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L f20747b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends p129m8.a implements J {
        public b(J.a aVar) {
            super(aVar);
        }

        @Override // F8.J
        public void b0(i iVar, Throwable th) {
        }
    }

    public k(e eVar, i iVar) {
        this.f20746a = eVar;
        this.f20747b = M.a(f20745f.z(d.a()).z(iVar).z(T0.a((InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e))));
    }

    public z a(x xVar, s sVar, l lVar, l lVar2) {
        xVar.c();
        return null;
    }

    public /* synthetic */ k(e eVar, i iVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? new e() : eVar, (i10 & 2) != 0 ? j.f23252q : iVar);
    }
}
