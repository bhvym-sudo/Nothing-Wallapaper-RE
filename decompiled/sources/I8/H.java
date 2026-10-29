package I8;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends J8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3163a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p129m8.e f3164b;

    @Override // J8.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(F f10) {
        if (this.f3163a >= 0) {
            return false;
        }
        this.f3163a = f10.a0();
        return true;
    }

    @Override // J8.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p129m8.e[] b(F f10) {
        long j9 = this.f3163a;
        this.f3163a = -1L;
        this.f3164b = null;
        return f10.Z(j9);
    }
}
