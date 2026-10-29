package e9;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class s implements z {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final OutputStream f20290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C f20291r;

    public s(OutputStream out, C timeout) {
        kotlin.jvm.internal.n.h(out, "out");
        kotlin.jvm.internal.n.h(timeout, "timeout");
        this.f20290q = out;
        this.f20291r = timeout;
    }

    @Override // e9.z
    public void Z(C1350e source, long j9) throws IOException {
        kotlin.jvm.internal.n.h(source, "source");
        AbstractC1347b.b(source.X0(), 0L, j9);
        while (j9 > 0) {
            this.f20291r.f();
            w wVar = source.f20257q;
            kotlin.jvm.internal.n.e(wVar);
            int iMin = (int) Math.min(j9, wVar.f20309c - wVar.f20308b);
            this.f20290q.write(wVar.f20307a, wVar.f20308b, iMin);
            wVar.f20308b += iMin;
            long j10 = iMin;
            j9 -= j10;
            source.W0(source.X0() - j10);
            if (wVar.f20308b == wVar.f20309c) {
                source.f20257q = wVar.b();
                x.b(wVar);
            }
        }
    }

    @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20290q.close();
    }

    @Override // e9.z
    public C e() {
        return this.f20291r;
    }

    @Override // e9.z, java.io.Flushable
    public void flush() throws IOException {
        this.f20290q.flush();
    }

    public String toString() {
        return "sink(" + this.f20290q + ')';
    }
}
