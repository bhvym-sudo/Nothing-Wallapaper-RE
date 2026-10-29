package p061g0;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p071h0.e;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20949g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k f20950h = new k(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f20956f;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final k a() {
            return k.f20950h;
        }

        private a() {
        }
    }

    public /* synthetic */ k(boolean z9, int i10, boolean z10, int i11, int i12, s sVar, e eVar, AbstractC1457h abstractC1457h) {
        this(z9, i10, z10, i11, i12, sVar, eVar);
    }

    public final boolean b() {
        return this.f20953c;
    }

    public final int c() {
        return this.f20952b;
    }

    public final int d() {
        return this.f20955e;
    }

    public final int e() {
        return this.f20954d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f20951a != kVar.f20951a || !p.f(this.f20952b, kVar.f20952b) || this.f20953c != kVar.f20953c || !q.k(this.f20954d, kVar.f20954d) || !j.l(this.f20955e, kVar.f20955e)) {
            return false;
        }
        kVar.getClass();
        return n.d(null, null) && n.d(this.f20956f, kVar.f20956f);
    }

    public final s f() {
        return null;
    }

    public final boolean g() {
        return this.f20951a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f20951a) * 31) + p.g(this.f20952b)) * 31) + Boolean.hashCode(this.f20953c)) * 31) + q.l(this.f20954d)) * 31) + j.m(this.f20955e)) * 961) + this.f20956f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f20951a + ", capitalization=" + ((Object) p.h(this.f20952b)) + ", autoCorrect=" + this.f20953c + ", keyboardType=" + ((Object) q.m(this.f20954d)) + ", imeAction=" + ((Object) j.n(this.f20955e)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.f20956f + ')';
    }

    private k(boolean z9, int i10, boolean z10, int i11, int i12, s sVar, e eVar) {
        this.f20951a = z9;
        this.f20952b = i10;
        this.f20953c = z10;
        this.f20954d = i11;
        this.f20955e = i12;
        this.f20956f = eVar;
    }

    public /* synthetic */ k(boolean z9, int i10, boolean z10, int i11, int i12, s sVar, e eVar, int i13, AbstractC1457h abstractC1457h) {
        this((i13 & 1) != 0 ? false : z9, (i13 & 2) != 0 ? p.f20961a.b() : i10, (i13 & 4) != 0 ? true : z10, (i13 & 8) != 0 ? q.f20967a.h() : i11, (i13 & 16) != 0 ? j.f20938b.a() : i12, (i13 & 32) != 0 ? null : sVar, (i13 & 64) != 0 ? e.f21568s.a() : eVar, null);
    }
}
