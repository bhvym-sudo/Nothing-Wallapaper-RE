package K;

import H.m;
import H.n;
import I.AbstractC0867k;
import I.AbstractC0874s;
import I.v;

/* JADX INFO: loaded from: classes.dex */
public interface f extends p111l0.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3980g = a.f3981a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3981a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f3982b = AbstractC0867k.f2708a.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f3983c = v.f2759a.a();

        private a() {
        }

        public final int a() {
            return f3982b;
        }

        public final int b() {
            return f3983c;
        }
    }

    static /* synthetic */ void K(f fVar, long j9, long j10, long j11, float f10, g gVar, AbstractC0874s abstractC0874s, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i11 & 2) != 0 ? H.g.f2287b.c() : j10;
        fVar.O(j9, jC, (i11 & 4) != 0 ? fVar.x(fVar.b(), jC) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f3984a : gVar, (i11 & 32) != 0 ? null : abstractC0874s, (i11 & 64) != 0 ? f3980g.a() : i10);
    }

    private default long x(long j9, long j10) {
        return n.a(m.f(j9) - H.g.k(j10), m.e(j9) - H.g.l(j10));
    }

    d E();

    void O(long j9, long j10, long j11, float f10, g gVar, AbstractC0874s abstractC0874s, int i10);

    default long b() {
        return E().b();
    }
}
