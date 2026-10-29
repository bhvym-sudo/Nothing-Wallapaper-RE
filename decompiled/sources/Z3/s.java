package Z3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class s extends r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f9471r;

    s(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f9471r = bArr;
    }

    @Override // Z3.r
    final byte[] e() {
        return this.f9471r;
    }
}
