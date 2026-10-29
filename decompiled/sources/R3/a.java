package R3;

import M3.m;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c f7073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m f7074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final K3.h f7075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final M3.h f7076t;

    private a(c cVar, m mVar, K3.h hVar, M3.h hVar2) {
        this.f7073q = cVar;
        this.f7074r = mVar;
        this.f7075s = hVar;
        this.f7076t = hVar2;
    }

    public static Runnable a(c cVar, m mVar, K3.h hVar, M3.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    @Override // java.lang.Runnable
    public void run() {
        c.c(this.f7073q, this.f7074r, this.f7075s, this.f7076t);
    }
}
