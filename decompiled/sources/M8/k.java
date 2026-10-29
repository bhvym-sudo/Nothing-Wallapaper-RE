package M8;

import F8.I;
import K8.AbstractC0919l;

/* JADX INFO: loaded from: classes2.dex */
final class k extends I {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f5170s = new k();

    private k() {
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        c.f5154y.m1(runnable, true, false);
    }

    @Override // F8.I
    public void h1(p129m8.i iVar, Runnable runnable) {
        c.f5154y.m1(runnable, true, true);
    }

    @Override // F8.I
    public I j1(int i10, String str) {
        AbstractC0919l.a(i10);
        return i10 >= j.f5167d ? AbstractC0919l.b(this, str) : super.j1(i10, str);
    }

    @Override // F8.I
    public String toString() {
        return "Dispatchers.IO";
    }
}
