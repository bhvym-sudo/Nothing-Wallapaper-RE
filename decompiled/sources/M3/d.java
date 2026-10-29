package M3;

import T3.C;
import T3.C0952f;
import T3.C0953g;
import T3.C0954h;
import T3.I;
import T3.InterfaceC0949c;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class d extends s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private p069g8.a f4954A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p069g8.a f4955B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p069g8.a f4956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p069g8.a f4957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p069g8.a f4958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p069g8.a f4959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p069g8.a f4960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p069g8.a f4961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p069g8.a f4962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p069g8.a f4963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p069g8.a f4964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p069g8.a f4965z;

    private static final class b implements s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f4966a;

        private b() {
        }

        @Override // M3.s.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f4966a = (Context) O3.d.b(context);
            return this;
        }

        @Override // M3.s.a
        public s build() {
            O3.d.a(this.f4966a, Context.class);
            return new d(this.f4966a);
        }
    }

    public static s.a f() {
        return new b();
    }

    private void g(Context context) {
        this.f4956q = O3.a.a(j.a());
        O3.b bVarA = O3.c.a(context);
        this.f4957r = bVarA;
        N3.j jVarA = N3.j.a(bVarA, V3.c.a(), V3.d.a());
        this.f4958s = jVarA;
        this.f4959t = O3.a.a(N3.l.a(this.f4957r, jVarA));
        this.f4960u = I.a(this.f4957r, C0952f.a(), C0953g.a());
        this.f4961v = O3.a.a(C.a(V3.c.a(), V3.d.a(), C0954h.a(), this.f4960u));
        R3.g gVarB = R3.g.b(V3.c.a());
        this.f4962w = gVarB;
        R3.i iVarA = R3.i.a(this.f4957r, this.f4961v, gVarB, V3.d.a());
        this.f4963x = iVarA;
        p069g8.a aVar = this.f4956q;
        p069g8.a aVar2 = this.f4959t;
        p069g8.a aVar3 = this.f4961v;
        this.f4964y = R3.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        p069g8.a aVar4 = this.f4957r;
        p069g8.a aVar5 = this.f4959t;
        p069g8.a aVar6 = this.f4961v;
        this.f4965z = S3.k.a(aVar4, aVar5, aVar6, this.f4963x, this.f4956q, aVar6, V3.c.a());
        p069g8.a aVar7 = this.f4956q;
        p069g8.a aVar8 = this.f4961v;
        this.f4954A = S3.o.a(aVar7, aVar8, this.f4963x, aVar8);
        this.f4955B = O3.a.a(t.a(V3.c.a(), V3.d.a(), this.f4964y, this.f4965z, this.f4954A));
    }

    @Override // M3.s
    InterfaceC0949c a() {
        return (InterfaceC0949c) this.f4961v.get();
    }

    @Override // M3.s
    r b() {
        return (r) this.f4955B.get();
    }

    private d(Context context) {
        g(context);
    }
}
