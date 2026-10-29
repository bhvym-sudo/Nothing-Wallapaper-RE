package p001a0;

import U.i;
import p011b0.j;
import p111l0.o;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f9590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f9592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f9593d;

    public g(j jVar, int i10, o oVar, i iVar) {
        this.f9590a = jVar;
        this.f9591b = i10;
        this.f9592c = oVar;
        this.f9593d = iVar;
    }

    public final i a() {
        return this.f9593d;
    }

    public final int b() {
        return this.f9591b;
    }

    public final j c() {
        return this.f9590a;
    }

    public final o d() {
        return this.f9592c;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f9590a + ", depth=" + this.f9591b + ", viewportBoundsInWindow=" + this.f9592c + ", coordinates=" + this.f9593d + ')';
    }
}
