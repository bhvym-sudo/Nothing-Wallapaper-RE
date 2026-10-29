package Q;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.r f6563a = new androidx.collection.r(0, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f6564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f6566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6567d;

        public /* synthetic */ a(long j9, long j10, boolean z9, int i10, AbstractC1457h abstractC1457h) {
            this(j9, j10, z9, i10);
        }

        public final boolean a() {
            return this.f6566c;
        }

        public final long b() {
            return this.f6565b;
        }

        public final long c() {
            return this.f6564a;
        }

        private a(long j9, long j10, boolean z9, int i10) {
            this.f6564a = j9;
            this.f6565b = j10;
            this.f6566c = z9;
            this.f6567d = i10;
        }
    }

    public final void a() {
        this.f6563a.c();
    }

    public final e b(v vVar, B b10) {
        long jC;
        boolean zA;
        long jT;
        androidx.collection.r rVar = new androidx.collection.r(vVar.b().size());
        List listB = vVar.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) listB.get(i10);
            a aVar = (a) this.f6563a.h(wVar.d());
            if (aVar == null) {
                zA = false;
                jC = wVar.k();
                jT = wVar.f();
            } else {
                jC = aVar.c();
                zA = aVar.a();
                jT = b10.t(aVar.b());
            }
            rVar.l(wVar.d(), new t(wVar.d(), wVar.k(), wVar.f(), wVar.b(), wVar.h(), jC, jT, zA, false, wVar.j(), wVar.c(), wVar.i(), wVar.e(), null));
            if (wVar.b()) {
                this.f6563a.l(wVar.d(), new a(wVar.k(), wVar.g(), wVar.b(), wVar.j(), null));
            } else {
                this.f6563a.m(wVar.d());
            }
        }
        return new e(rVar, vVar);
    }
}
