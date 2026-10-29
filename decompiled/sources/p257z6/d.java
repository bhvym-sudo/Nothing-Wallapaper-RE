package p257z6;

import e9.C1350e;
import e9.i;
import e9.z;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public class d extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f30787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f30788s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z delegate, l onException) {
        super(delegate);
        n.h(delegate, "delegate");
        n.h(onException, "onException");
        this.f30787r = onException;
    }

    @Override // e9.i, e9.z
    public void Z(C1350e source, long j9) throws EOFException {
        n.h(source, "source");
        if (this.f30788s) {
            source.skip(j9);
            return;
        }
        try {
            super.Z(source, j9);
        } catch (IOException e10) {
            this.f30788s = true;
            this.f30787r.f(e10);
        }
    }

    @Override // e9.i, e9.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f30788s) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f30788s = true;
            this.f30787r.f(e10);
        }
    }

    @Override // e9.i, e9.z, java.io.Flushable
    public void flush() {
        if (this.f30788s) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f30788s = true;
            this.f30787r.f(e10);
        }
    }
}
