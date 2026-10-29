package e9;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f20298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1350e f20299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20300s;

    public u(z sink) {
        kotlin.jvm.internal.n.h(sink, "sink");
        this.f20298q = sink;
        this.f20299r = new C1350e();
    }

    @Override // e9.f
    public f F(int i10) {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.F(i10);
        return a();
    }

    @Override // e9.f
    public f G0(byte[] source) {
        kotlin.jvm.internal.n.h(source, "source");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.G0(source);
        return a();
    }

    @Override // e9.z
    public void Z(C1350e source, long j9) {
        kotlin.jvm.internal.n.h(source, "source");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.Z(source, j9);
        a();
    }

    @Override // e9.f
    public f Z0(long j9) {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.Z0(j9);
        return a();
    }

    public f a() {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        long jI = this.f20299r.I();
        if (jI > 0) {
            this.f20298q.Z(this.f20299r, jI);
        }
        return this;
    }

    @Override // e9.f
    public OutputStream b1() {
        return new a();
    }

    @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f20300s) {
            return;
        }
        if (this.f20299r.X0() > 0) {
            z zVar = this.f20298q;
            C1350e c1350e = this.f20299r;
            zVar.Z(c1350e, c1350e.X0());
        }
        th = null;
        try {
            this.f20298q.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f20300s = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // e9.f
    public C1350e d() {
        return this.f20299r;
    }

    @Override // e9.f
    public f d0(String string) {
        kotlin.jvm.internal.n.h(string, "string");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.d0(string);
        return a();
    }

    @Override // e9.z
    public C e() {
        return this.f20298q.e();
    }

    @Override // e9.f, e9.z, java.io.Flushable
    public void flush() {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        if (this.f20299r.X0() > 0) {
            z zVar = this.f20298q;
            C1350e c1350e = this.f20299r;
            zVar.Z(c1350e, c1350e.X0());
        }
        this.f20298q.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20300s;
    }

    @Override // e9.f
    public f k0(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.n.h(source, "source");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.k0(source, i10, i11);
        return a();
    }

    @Override // e9.f
    public f o0(String string, int i10, int i11) {
        kotlin.jvm.internal.n.h(string, "string");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.o0(string, i10, i11);
        return a();
    }

    @Override // e9.f
    public f r0(long j9) {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.r0(j9);
        return a();
    }

    @Override // e9.f
    public f s(int i10) {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.s(i10);
        return a();
    }

    @Override // e9.f
    public f s0(h byteString) {
        kotlin.jvm.internal.n.h(byteString, "byteString");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.s0(byteString);
        return a();
    }

    public String toString() {
        return "buffer(" + this.f20298q + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.n.h(source, "source");
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f20299r.write(source);
        a();
        return iWrite;
    }

    @Override // e9.f
    public f x(int i10) {
        if (this.f20300s) {
            throw new IllegalStateException("closed");
        }
        this.f20299r.x(i10);
        return a();
    }

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            u.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            u uVar = u.this;
            if (uVar.f20300s) {
                return;
            }
            uVar.flush();
        }

        public String toString() {
            return u.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            u uVar = u.this;
            if (uVar.f20300s) {
                throw new IOException("closed");
            }
            uVar.f20299r.F((byte) i10);
            u.this.a();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            kotlin.jvm.internal.n.h(data, "data");
            u uVar = u.this;
            if (!uVar.f20300s) {
                uVar.f20299r.k0(data, i10, i11);
                u.this.a();
                return;
            }
            throw new IOException("closed");
        }
    }
}
