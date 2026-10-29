package p015b4;

import p005a4.a;
import p025c4.AbstractC1201o;

/* JADX INFO: renamed from: b4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1182b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f14900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.d f14901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14902d;

    private C1182b(a aVar, a.d dVar, String str) {
        this.f14900b = aVar;
        this.f14901c = dVar;
        this.f14902d = str;
        this.f14899a = AbstractC1201o.b(aVar, dVar, str);
    }

    public static C1182b a(a aVar, a.d dVar, String str) {
        return new C1182b(aVar, dVar, str);
    }

    public final String b() {
        return this.f14900b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1182b)) {
            return false;
        }
        C1182b c1182b = (C1182b) obj;
        return AbstractC1201o.a(this.f14900b, c1182b.f14900b) && AbstractC1201o.a(this.f14901c, c1182b.f14901c) && AbstractC1201o.a(this.f14902d, c1182b.f14902d);
    }

    public final int hashCode() {
        return this.f14899a;
    }
}
