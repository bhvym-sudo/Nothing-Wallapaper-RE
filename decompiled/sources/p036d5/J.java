package p036d5;

import java.io.Closeable;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
final class J implements Closeable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ n f19570q;

    /* synthetic */ J(n nVar, I i10) {
        this.f19570q = nVar;
        AbstractC1202p.l(((Thread) nVar.f19621d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19570q.f19621d.set(null);
        this.f19570q.d();
    }
}
