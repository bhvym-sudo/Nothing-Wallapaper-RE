package e9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g f20280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Inflater f20281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20283t;

    public m(g source, Inflater inflater) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(inflater, "inflater");
        this.f20280q = source;
        this.f20281r = inflater;
    }

    private final void f() {
        int i10 = this.f20282s;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f20281r.getRemaining();
        this.f20282s -= remaining;
        this.f20280q.skip(remaining);
    }

    public final long a(C1350e sink, long j9) throws IOException {
        kotlin.jvm.internal.n.h(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (this.f20283t) {
            throw new IllegalStateException("closed");
        }
        if (j9 == 0) {
            return 0L;
        }
        try {
            w wVarH1 = sink.h1(1);
            int iMin = (int) Math.min(j9, 8192 - wVarH1.f20309c);
            b();
            int iInflate = this.f20281r.inflate(wVarH1.f20307a, wVarH1.f20309c, iMin);
            f();
            if (iInflate > 0) {
                wVarH1.f20309c += iInflate;
                long j10 = iInflate;
                sink.W0(sink.X0() + j10);
                return j10;
            }
            if (wVarH1.f20308b == wVarH1.f20309c) {
                sink.f20257q = wVarH1.b();
                x.b(wVarH1);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f20281r.needsInput()) {
            return false;
        }
        if (this.f20280q.D()) {
            return true;
        }
        w wVar = this.f20280q.d().f20257q;
        kotlin.jvm.internal.n.e(wVar);
        int i10 = wVar.f20309c;
        int i11 = wVar.f20308b;
        int i12 = i10 - i11;
        this.f20282s = i12;
        this.f20281r.setInput(wVar.f20307a, i11, i12);
        return false;
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f20283t) {
            return;
        }
        this.f20281r.end();
        this.f20283t = true;
        this.f20280q.close();
    }

    @Override // e9.B
    public C e() {
        return this.f20280q.e();
    }

    @Override // e9.B
    public long e1(C1350e sink, long j9) throws IOException {
        kotlin.jvm.internal.n.h(sink, "sink");
        do {
            long jA = a(sink, j9);
            if (jA > 0) {
                return jA;
            }
            if (this.f20281r.finished() || this.f20281r.needsDictionary()) {
                return -1L;
            }
        } while (!this.f20280q.D());
        throw new EOFException("source exhausted prematurely");
    }
}
