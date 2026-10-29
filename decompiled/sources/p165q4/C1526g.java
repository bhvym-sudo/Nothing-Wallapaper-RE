package p165q4;

import java.io.OutputStream;

/* JADX INFO: renamed from: q4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1526g extends OutputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f24533q = 0;

    C1526g() {
    }

    final long a() {
        return this.f24533q;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f24533q++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f24533q += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f24533q += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
