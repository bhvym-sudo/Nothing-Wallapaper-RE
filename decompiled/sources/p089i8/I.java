package p089i8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22254b;

    public I(int i10, Object obj) {
        this.f22253a = i10;
        this.f22254b = obj;
    }

    public final int a() {
        return this.f22253a;
    }

    public final Object b() {
        return this.f22254b;
    }

    public final int c() {
        return this.f22253a;
    }

    public final Object d() {
        return this.f22254b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return this.f22253a == i10.f22253a && n.d(this.f22254b, i10.f22254b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f22253a) * 31;
        Object obj = this.f22254b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f22253a + ", value=" + this.f22254b + ')';
    }
}
