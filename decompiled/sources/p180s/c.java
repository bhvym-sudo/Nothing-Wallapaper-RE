package p180s;

import p170r.AbstractC1696o;
import p170r.E0;
import p170r.InterfaceC1678f;
import p170r.O0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f27590a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f27591b = new g();

    public final void a() {
        this.f27591b.m();
        this.f27590a.m();
    }

    public final void b() {
        if (!this.f27591b.u()) {
            AbstractC1696o.r("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f27591b.w(this.f27590a);
    }

    public final void c(InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
        if (!this.f27591b.t()) {
            AbstractC1696o.r("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f27590a.r(interfaceC1678f, o9, e10);
    }

    public final boolean d() {
        return this.f27590a.t();
    }
}
