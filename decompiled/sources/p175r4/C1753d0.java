package p175r4;

import java.io.OutputStream;

/* JADX INFO: renamed from: r4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1753d0 extends OutputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26602q = 0;

    C1753d0() {
    }

    final long a() {
        return this.f26602q;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f26602q++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f26602q += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f26602q += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
