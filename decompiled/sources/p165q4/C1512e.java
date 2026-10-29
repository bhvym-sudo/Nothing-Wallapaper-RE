package p165q4;

/* JADX INFO: renamed from: q4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1512e implements InterfaceC1547j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1540i f24511b;

    C1512e(int i10, EnumC1540i enumC1540i) {
        this.f24510a = i10;
        this.f24511b = enumC1540i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1547j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1547j)) {
            return false;
        }
        InterfaceC1547j interfaceC1547j = (InterfaceC1547j) obj;
        return this.f24510a == interfaceC1547j.zza() && this.f24511b.equals(interfaceC1547j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f24510a ^ 14552422) + (this.f24511b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f24510a + "intEncoding=" + this.f24511b + ')';
    }

    @Override // p165q4.InterfaceC1547j
    public final int zza() {
        return this.f24510a;
    }

    @Override // p165q4.InterfaceC1547j
    public final EnumC1540i zzb() {
        return this.f24511b;
    }
}
