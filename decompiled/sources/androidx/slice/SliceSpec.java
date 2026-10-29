package androidx.slice;

/* JADX INFO: loaded from: classes.dex */
public final class SliceSpec implements p192t1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f13699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f13700b;

    public SliceSpec() {
    }

    public int a() {
        return this.f13700b;
    }

    public String b() {
        return this.f13699a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SliceSpec)) {
            return false;
        }
        SliceSpec sliceSpec = (SliceSpec) obj;
        return this.f13699a.equals(sliceSpec.f13699a) && this.f13700b == sliceSpec.f13700b;
    }

    public int hashCode() {
        return this.f13699a.hashCode() + this.f13700b;
    }

    public String toString() {
        return String.format("SliceSpec{%s,%d}", this.f13699a, Integer.valueOf(this.f13700b));
    }

    public SliceSpec(String str, int i10) {
        this.f13699a = str;
        this.f13700b = i10;
    }
}
