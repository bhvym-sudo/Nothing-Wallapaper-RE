package p031d0;

import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p101k0.c;
import p101k0.d;
import p101k0.f;
import p101k0.i;
import p101k0.l;
import p101k0.m;
import p111l0.u;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f19327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19329f;

    public /* synthetic */ g(int i10, int i11, long j9, l lVar, h hVar, f fVar, int i12, int i13, m mVar, AbstractC1457h abstractC1457h) {
        this(i10, i11, j9, lVar, hVar, fVar, i12, i13, mVar);
    }

    public final long a() {
        return this.f19326c;
    }

    public final int b() {
        return this.f19324a;
    }

    public final int c() {
        return this.f19325b;
    }

    public final l d() {
        return this.f19327d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!p101k0.g.e(this.f19324a, gVar.f19324a) || !i.e(this.f19325b, gVar.f19325b) || !u.e(this.f19326c, gVar.f19326c) || !n.d(this.f19327d, gVar.f19327d)) {
            return false;
        }
        gVar.getClass();
        if (!n.d(null, null)) {
            return false;
        }
        gVar.getClass();
        if (!n.d(null, null) || !d.c(this.f19328e, gVar.f19328e) || !c.c(this.f19329f, gVar.f19329f)) {
            return false;
        }
        gVar.getClass();
        return n.d(null, null);
    }

    public int hashCode() {
        int iF = ((((p101k0.g.f(this.f19324a) * 31) + i.f(this.f19325b)) * 31) + u.i(this.f19326c)) * 31;
        l lVar = this.f19327d;
        return (((((iF + (lVar != null ? lVar.hashCode() : 0)) * 29791) + d.g(this.f19328e)) * 31) + c.d(this.f19329f)) * 31;
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) p101k0.g.g(this.f19324a)) + ", textDirection=" + ((Object) i.g(this.f19325b)) + ", lineHeight=" + ((Object) u.j(this.f19326c)) + ", textIndent=" + this.f19327d + ", platformStyle=" + ((Object) null) + ", lineHeightStyle=" + ((Object) null) + ", lineBreak=" + ((Object) d.h(this.f19328e)) + ", hyphens=" + ((Object) c.e(this.f19329f)) + ", textMotion=" + ((Object) null) + ')';
    }

    private g(int i10, int i11, long j9, l lVar, h hVar, f fVar, int i12, int i13, m mVar) {
        this.f19324a = i10;
        this.f19325b = i11;
        this.f19326c = j9;
        this.f19327d = lVar;
        this.f19328e = i12;
        this.f19329f = i13;
        if (u.e(j9, u.f22843b.a()) || u.h(j9) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + u.h(j9) + ')').toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(int i10, int i11, long j9, l lVar, h hVar, f fVar, int i12, int i13, m mVar, int i14, AbstractC1457h abstractC1457h) {
        int iA = (i14 & 1) != 0 ? p101k0.g.f22648b.a() : i10;
        int iA2 = (i14 & 2) != 0 ? i.f22662b.a() : i11;
        long jA = (i14 & 4) != 0 ? u.f22843b.a() : j9;
        l lVar2 = (i14 & 8) != 0 ? null : lVar;
        h hVar2 = (i14 & 16) != 0 ? null : hVar;
        f fVar2 = (i14 & 32) != 0 ? null : fVar;
        int iA3 = (i14 & 64) != 0 ? d.f22628a.a() : i12;
        int iA4 = (i14 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? c.f22624a.a() : i13;
        this(iA, iA2, jA, lVar2, hVar2, fVar2, iA3, iA4, (i14 & 256) == 0 ? mVar : null, null);
    }
}
