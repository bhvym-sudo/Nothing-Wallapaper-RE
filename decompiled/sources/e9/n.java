package e9;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class n implements B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InputStream f20284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C f20285r;

    public n(InputStream input, C timeout) {
        kotlin.jvm.internal.n.h(input, "input");
        kotlin.jvm.internal.n.h(timeout, "timeout");
        this.f20284q = input;
        this.f20285r = timeout;
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20284q.close();
    }

    @Override // e9.B
    public C e() {
        return this.f20285r;
    }

    @Override // e9.B
    public long e1(C1350e sink, long j9) throws IOException {
        kotlin.jvm.internal.n.h(sink, "sink");
        if (j9 == 0) {
            return 0L;
        }
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        try {
            this.f20285r.f();
            w wVarH1 = sink.h1(1);
            int i10 = this.f20284q.read(wVarH1.f20307a, wVarH1.f20309c, (int) Math.min(j9, 8192 - wVarH1.f20309c));
            if (i10 != -1) {
                wVarH1.f20309c += i10;
                long j10 = i10;
                sink.W0(sink.X0() + j10);
                return j10;
            }
            if (wVarH1.f20308b != wVarH1.f20309c) {
                return -1L;
            }
            sink.f20257q = wVarH1.b();
            x.b(wVarH1);
            return -1L;
        } catch (AssertionError e10) {
            if (o.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public String toString() {
        return "source(" + this.f20284q + ')';
    }
}
