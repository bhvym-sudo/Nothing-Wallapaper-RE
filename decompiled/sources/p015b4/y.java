package p015b4;

import p205u4.l;

/* JADX INFO: loaded from: classes.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ l f14917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ A f14918r;

    y(A a10, l lVar) {
        this.f14918r = a10;
        this.f14917q = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A.Z(this.f14918r, this.f14917q);
    }
}
