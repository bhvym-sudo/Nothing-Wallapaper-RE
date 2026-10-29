package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f12456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f12458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12459d;

    d0(P p9, String str, Object[] objArr) {
        this.f12456a = p9;
        this.f12457b = str;
        this.f12458c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f12459d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f12459d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean a() {
        return (this.f12459d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public P b() {
        return this.f12456a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public a0 c() {
        int i10 = this.f12459d;
        if ((i10 & 1) != 0) {
            return a0.PROTO2;
        }
        return (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    Object[] d() {
        return this.f12458c;
    }

    String e() {
        return this.f12457b;
    }
}
