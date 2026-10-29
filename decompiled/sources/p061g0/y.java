package p061g0;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.o;
import p031d0.j;
import p031d0.n;
import p089i8.AbstractC1444s;
import p219v8.l;
import p219v8.p;
import p250z.e;
import p250z.f;
import p250z.g;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20992d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f20993e = f.a(a.f20997r, b.f20998r);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p031d0.a f20994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f20995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f20996c;

    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f20997r = new a();

        a() {
            super(2);
        }

        public final Object a(g gVar, y yVar) {
            return AbstractC1444s.h(j.y(yVar.a(), j.h(), gVar), j.y(n.b(yVar.c()), j.m(n.f19416b), gVar));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            androidx.appcompat.app.o.a(obj);
            return a(null, (y) obj2);
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f20998r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y f(Object obj) {
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            e eVarH = j.h();
            Boolean bool = Boolean.FALSE;
            n nVar = null;
            p031d0.a aVar = ((!kotlin.jvm.internal.n.d(obj2, bool) || (eVarH instanceof p031d0.f)) && obj2 != null) ? (p031d0.a) eVarH.b(obj2) : null;
            kotlin.jvm.internal.n.e(aVar);
            Object obj3 = list.get(1);
            e eVarM = j.m(n.f19416b);
            if ((!kotlin.jvm.internal.n.d(obj3, bool) || (eVarM instanceof p031d0.f)) && obj3 != null) {
                nVar = (n) eVarM.b(obj3);
            }
            kotlin.jvm.internal.n.e(nVar);
            return new y(aVar, nVar.m(), (n) null, 4, (AbstractC1457h) null);
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ y(p031d0.a aVar, long j9, n nVar, AbstractC1457h abstractC1457h) {
        this(aVar, j9, nVar);
    }

    public final p031d0.a a() {
        return this.f20994a;
    }

    public final n b() {
        return this.f20996c;
    }

    public final long c() {
        return this.f20995b;
    }

    public final String d() {
        return this.f20994a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return n.e(this.f20995b, yVar.f20995b) && kotlin.jvm.internal.n.d(this.f20996c, yVar.f20996c) && kotlin.jvm.internal.n.d(this.f20994a, yVar.f20994a);
    }

    public int hashCode() {
        int iHashCode = ((this.f20994a.hashCode() * 31) + n.k(this.f20995b)) * 31;
        n nVar = this.f20996c;
        return iHashCode + (nVar != null ? n.k(nVar.m()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f20994a) + "', selection=" + ((Object) n.l(this.f20995b)) + ", composition=" + this.f20996c + ')';
    }

    public /* synthetic */ y(String str, long j9, n nVar, AbstractC1457h abstractC1457h) {
        this(str, j9, nVar);
    }

    private y(p031d0.a aVar, long j9, n nVar) {
        this.f20994a = aVar;
        this.f20995b = p031d0.o.c(j9, 0, d().length());
        this.f20996c = nVar != null ? n.b(p031d0.o.c(nVar.m(), 0, d().length())) : null;
    }

    public /* synthetic */ y(p031d0.a aVar, long j9, n nVar, int i10, AbstractC1457h abstractC1457h) {
        this(aVar, (i10 & 2) != 0 ? n.f19416b.a() : j9, (i10 & 4) != 0 ? null : nVar, (AbstractC1457h) null);
    }

    public /* synthetic */ y(String str, long j9, n nVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? n.f19416b.a() : j9, (i10 & 4) != 0 ? null : nVar, (AbstractC1457h) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private y(String str, long j9, n nVar) {
        AbstractC1457h abstractC1457h = null;
        this(new p031d0.a(str, null, null, 6, abstractC1457h), j9, nVar, abstractC1457h);
    }
}
