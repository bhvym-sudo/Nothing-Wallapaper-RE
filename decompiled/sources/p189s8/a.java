package p189s8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final long a(InputStream inputStream, OutputStream out, int i10) throws IOException {
        n.h(inputStream, "<this>");
        n.h(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j9 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j9 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j9;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(inputStream, outputStream, i10);
    }
}
