package p165q4;

/* JADX INFO: renamed from: q4.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1655y3 implements InterfaceC1533h {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f24996q;

    EnumC1655y3(int i10) {
        this.f24996q = i10;
    }

    @Override // p165q4.InterfaceC1533h
    public final int zza() {
        return this.f24996q;
    }
}
