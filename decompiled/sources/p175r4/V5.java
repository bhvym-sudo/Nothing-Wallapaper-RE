package p175r4;

/* JADX INFO: loaded from: classes.dex */
public enum V5 implements InterfaceC1764e0 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f26305q;

    V5(int i10) {
        this.f26305q = i10;
    }

    @Override // p175r4.InterfaceC1764e0
    public final int zza() {
        return this.f26305q;
    }
}
