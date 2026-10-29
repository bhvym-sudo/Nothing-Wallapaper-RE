package e9;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public interface g extends B, ReadableByteChannel {
    byte[] C0(long j9);

    boolean D();

    int M0(r rVar);

    String O(long j9);

    long R(h hVar);

    g S0();

    void Y0(long j9);

    C1350e d();

    long d1();

    InputStream f1();

    long g0(z zVar);

    String h0(Charset charset);

    C1350e l();

    long m0(h hVar);

    h n(long j9);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j9);

    boolean u0(long j9);

    String z0();
}
