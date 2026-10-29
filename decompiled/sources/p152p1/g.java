package p152p1;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.n;
import p142o1.i;

/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SQLiteProgram f23689q;

    public g(SQLiteProgram delegate) {
        n.h(delegate, "delegate");
        this.f23689q = delegate;
    }

    @Override // p142o1.i
    public void C(int i10, double d10) {
        this.f23689q.bindDouble(i10, d10);
    }

    @Override // p142o1.i
    public void P(int i10, long j9) {
        this.f23689q.bindLong(i10, j9);
    }

    @Override // p142o1.i
    public void a0(int i10, byte[] value) {
        n.h(value, "value");
        this.f23689q.bindBlob(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23689q.close();
    }

    @Override // p142o1.i
    public void r(int i10, String value) {
        n.h(value, "value");
        this.f23689q.bindString(i10, value);
    }

    @Override // p142o1.i
    public void x0(int i10) {
        this.f23689q.bindNull(i10);
    }
}
