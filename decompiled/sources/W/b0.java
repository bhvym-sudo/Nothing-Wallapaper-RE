package W;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8553c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f8554d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.b f8555a = new p190t.b(new B[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B[] f8556b;

    public static final class a {

        /* JADX INFO: renamed from: W.b0$a$a, reason: collision with other inner class name */
        private static final class C0303a implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0303a f8557a = new C0303a();

            private C0303a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(B b10, B b11) {
                int i10 = kotlin.jvm.internal.n.i(b11.A(), b10.A());
                return i10 != 0 ? i10 : kotlin.jvm.internal.n.i(b10.hashCode(), b11.hashCode());
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final void b(B b10) {
        b10.q();
        int i10 = 0;
        b10.h1(false);
        p190t.b bVarF0 = b10.f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            do {
                b((B) objArrO[i10]);
                i10++;
            } while (i10 < iP);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        B[] bArr;
        this.f8555a.B(a.C0303a.f8557a);
        int iP = this.f8555a.p();
        B[] bArr2 = this.f8556b;
        if (bArr2 == null || bArr2.length < iP) {
            bArr = bArr2;
            bArr = new B[Math.max(16, this.f8555a.p())];
        }
        bArr = bArr2;
        this.f8556b = null;
        for (int i10 = 0; i10 < iP; i10++) {
            bArr[i10] = this.f8555a.o()[i10];
        }
        this.f8555a.j();
        while (true) {
            iP--;
            if (-1 >= iP) {
                this.f8556b = bArr;
                return;
            }
            B b10 = bArr[iP];
            kotlin.jvm.internal.n.e(b10);
            if (b10.U()) {
                b(b10);
            }
        }
    }

    public final boolean c() {
        return this.f8555a.s();
    }

    public final void d(B b10) {
        this.f8555a.b(b10);
        b10.h1(true);
    }

    public final void e(B b10) {
        this.f8555a.j();
        this.f8555a.b(b10);
        b10.h1(true);
    }

    public final void f(B b10) {
        this.f8555a.u(b10);
    }
}
