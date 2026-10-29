package M8;

import F8.P;

/* JADX INFO: loaded from: classes2.dex */
final class i extends h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f5163s;

    public i(Runnable runnable, long j9, boolean z9) {
        super(j9, z9);
        this.f5163s = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5163s.run();
    }

    public String toString() {
        return "Task[" + P.a(this.f5163s) + '@' + P.b(this.f5163s) + ", " + this.f5161q + ", " + j.c(this.f5162r) + ']';
    }
}
