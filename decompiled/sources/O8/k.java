package O8;

import K8.A;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
final class k extends A {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f5959u;

    public k(long j9, k kVar, int i10) {
        super(j9, kVar, i10);
        this.f5959u = new AtomicReferenceArray(j.f5958f);
    }

    @Override // K8.A
    public int r() {
        return j.f5958f;
    }

    @Override // K8.A
    public void s(int i10, Throwable th, p129m8.i iVar) {
        v().set(i10, j.f5957e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f4140s + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f5959u;
    }
}
