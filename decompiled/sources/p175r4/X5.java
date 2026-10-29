package p175r4;

import p025c4.AbstractC1201o;

/* JADX INFO: loaded from: classes.dex */
public final class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V5 f26343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f26344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f26345c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f26346d = null;

    /* synthetic */ X5(U5 u9, W5 w9) {
        this.f26343a = u9.f26270a;
        this.f26344b = u9.f26271b;
    }

    public final V5 a() {
        return this.f26343a;
    }

    public final Integer b() {
        return this.f26344b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X5)) {
            return false;
        }
        X5 x9 = (X5) obj;
        return AbstractC1201o.a(this.f26343a, x9.f26343a) && AbstractC1201o.a(this.f26344b, x9.f26344b) && AbstractC1201o.a(null, null) && AbstractC1201o.a(null, null);
    }

    public final int hashCode() {
        return AbstractC1201o.b(this.f26343a, this.f26344b, null, null);
    }
}
