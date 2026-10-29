package p170r;

import B.b;
import java.util.Iterator;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
final class Z0 implements b, Iterable, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final L0 f25420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f25421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final P f25422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Y0 f25423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f25424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Iterable f25425v = this;

    public Z0(L0 l9, int i10, P p9, Y0 y9) {
        this.f25420q = l9;
        this.f25421r = i10;
        this.f25422s = p9;
        this.f25423t = y9;
        this.f25424u = Integer.valueOf(p9.c());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new X0(this.f25420q, this.f25421r, this.f25422s, this.f25423t);
    }
}
