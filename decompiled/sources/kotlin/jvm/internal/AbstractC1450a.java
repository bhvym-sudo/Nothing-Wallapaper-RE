package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1450a implements j, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Object f22783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Class f22784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f22785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f22786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f22787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f22788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f22789w;

    public AbstractC1450a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, AbstractC1453d.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1450a)) {
            return false;
        }
        AbstractC1450a abstractC1450a = (AbstractC1450a) obj;
        return this.f22787u == abstractC1450a.f22787u && this.f22788v == abstractC1450a.f22788v && this.f22789w == abstractC1450a.f22789w && n.d(this.f22783q, abstractC1450a.f22783q) && n.d(this.f22784r, abstractC1450a.f22784r) && this.f22785s.equals(abstractC1450a.f22785s) && this.f22786t.equals(abstractC1450a.f22786t);
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.f22788v;
    }

    public int hashCode() {
        Object obj = this.f22783q;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f22784r;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f22785s.hashCode()) * 31) + this.f22786t.hashCode()) * 31) + (this.f22787u ? 1231 : 1237)) * 31) + this.f22788v) * 31) + this.f22789w;
    }

    public String toString() {
        return F.h(this);
    }

    public AbstractC1450a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f22783q = obj;
        this.f22784r = cls;
        this.f22785s = str;
        this.f22786t = str2;
        this.f22787u = (i11 & 1) == 1;
        this.f22788v = i10;
        this.f22789w = i11 >> 1;
    }
}
