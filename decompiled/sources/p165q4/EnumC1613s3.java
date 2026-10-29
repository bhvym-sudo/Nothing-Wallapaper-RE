package p165q4;

/* JADX INFO: renamed from: q4.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1613s3 implements InterfaceC1533h {
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
    private final int f24775q;

    EnumC1613s3(int i10) {
        this.f24775q = i10;
    }

    @Override // p165q4.InterfaceC1533h
    public final int zza() {
        return this.f24775q;
    }
}
