package P8;

import e9.C1350e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E implements Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f6124r = new b(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Reader f6125q;

    public static final class a extends Reader {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final e9.g f6126q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Charset f6127r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f6128s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Reader f6129t;

        public a(e9.g source, Charset charset) {
            kotlin.jvm.internal.n.h(source, "source");
            kotlin.jvm.internal.n.h(charset, "charset");
            this.f6126q = source;
            this.f6127r = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            p079h8.A a10;
            this.f6128s = true;
            Reader reader = this.f6129t;
            if (reader != null) {
                reader.close();
                a10 = p079h8.A.f21846a;
            } else {
                a10 = null;
            }
            if (a10 == null) {
                this.f6126q.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            kotlin.jvm.internal.n.h(cbuf, "cbuf");
            if (this.f6128s) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f6129t;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f6126q.f1(), Q8.d.I(this.f6126q, this.f6127r));
                this.f6129t = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    public static final class b {

        public static final class a extends E {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ x f6130s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f6131t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ e9.g f6132u;

            a(x xVar, long j9, e9.g gVar) {
                this.f6130s = xVar;
                this.f6131t = j9;
                this.f6132u = gVar;
            }

            @Override // P8.E
            public long f() {
                return this.f6131t;
            }

            @Override // P8.E
            public x g() {
                return this.f6130s;
            }

            @Override // P8.E
            public e9.g u() {
                return this.f6132u;
            }
        }

        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ E d(b bVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.c(bArr, xVar);
        }

        public final E a(x xVar, long j9, e9.g content) {
            kotlin.jvm.internal.n.h(content, "content");
            return b(content, xVar, j9);
        }

        public final E b(e9.g gVar, x xVar, long j9) {
            kotlin.jvm.internal.n.h(gVar, "<this>");
            return new a(xVar, j9, gVar);
        }

        public final E c(byte[] bArr, x xVar) {
            kotlin.jvm.internal.n.h(bArr, "<this>");
            return b(new C1350e().G0(bArr), xVar, bArr.length);
        }

        private b() {
        }
    }

    private final Charset b() {
        Charset charsetC;
        x xVarG = g();
        return (xVarG == null || (charsetC = xVarG.c(E8.d.f1445b)) == null) ? E8.d.f1445b : charsetC;
    }

    public static final E j(x xVar, long j9, e9.g gVar) {
        return f6124r.a(xVar, j9, gVar);
    }

    public final Reader a() {
        Reader reader = this.f6125q;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(u(), b());
        this.f6125q = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Q8.d.m(u());
    }

    public abstract long f();

    public abstract x g();

    public abstract e9.g u();
}
