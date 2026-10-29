package p175r4;

/* JADX INFO: renamed from: r4.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1720a0 implements InterfaceC1786g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1775f0 f26407b;

    C1720a0(int i10, EnumC1775f0 enumC1775f0) {
        this.f26406a = i10;
        this.f26407b = enumC1775f0;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1786g0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1786g0)) {
            return false;
        }
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) obj;
        return this.f26406a == interfaceC1786g0.zza() && this.f26407b.equals(interfaceC1786g0.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f26406a ^ 14552422) + (this.f26407b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f26406a + "intEncoding=" + this.f26407b + ')';
    }

    @Override // p175r4.InterfaceC1786g0
    public final int zza() {
        return this.f26406a;
    }

    @Override // p175r4.InterfaceC1786g0
    public final EnumC1775f0 zzb() {
        return this.f26407b;
    }
}
