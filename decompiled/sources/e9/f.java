package e9;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends z, WritableByteChannel {
    f F(int i10);

    f G0(byte[] bArr);

    f Z0(long j9);

    OutputStream b1();

    C1350e d();

    f d0(String str);

    @Override // e9.z, java.io.Flushable
    void flush();

    f k0(byte[] bArr, int i10, int i11);

    f o0(String str, int i10, int i11);

    f r0(long j9);

    f s(int i10);

    f s0(h hVar);

    f x(int i10);
}
