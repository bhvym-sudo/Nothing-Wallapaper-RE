package p031d0;

import I.AbstractC0868l;
import I.N;
import I.r;
import K.g;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC1457h;
import p051f0.m;
import p051f0.n;
import p051f0.o;
import p071h0.e;
import p101k0.a;
import p101k0.h;
import p101k0.j;
import p111l0.u;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f19400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f19402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f19405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p101k0.k f19406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f19407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f19408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f19409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final N f19410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f19411l;

    public /* synthetic */ k(long j9, long j10, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j11, a aVar, p101k0.k kVar, e eVar, long j12, h hVar, N n9, i iVar, g gVar2, AbstractC1457h abstractC1457h) {
        this(j9, j10, oVar, mVar, nVar, gVar, str, j11, aVar, kVar, eVar, j12, hVar, n9, iVar, gVar2);
    }

    public static /* synthetic */ k b(k kVar, long j9, long j10, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j11, a aVar, p101k0.k kVar2, e eVar, long j12, h hVar, N n9, i iVar, g gVar2, int i10, Object obj) {
        m mVar2;
        n nVar2;
        p051f0.g gVar3;
        i iVar2;
        long jG = (i10 & 1) != 0 ? kVar.g() : j9;
        long j13 = (i10 & 2) != 0 ? kVar.f19401b : j10;
        o oVar2 = (i10 & 4) != 0 ? kVar.f19402c : oVar;
        if ((i10 & 8) != 0) {
            kVar.getClass();
            mVar2 = null;
        } else {
            mVar2 = mVar;
        }
        if ((i10 & 16) != 0) {
            kVar.getClass();
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 32) != 0) {
            kVar.getClass();
            gVar3 = null;
        } else {
            gVar3 = gVar;
        }
        String str2 = (i10 & 64) != 0 ? kVar.f19403d : str;
        long j14 = (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? kVar.f19404e : j11;
        a aVar2 = (i10 & 256) != 0 ? kVar.f19405f : aVar;
        p101k0.k kVar3 = (i10 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? kVar.f19406g : kVar2;
        e eVar2 = (i10 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? kVar.f19407h : eVar;
        long j15 = jG;
        long j16 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? kVar.f19408i : j12;
        h hVar2 = (i10 & 4096) != 0 ? kVar.f19409j : hVar;
        N n10 = (i10 & 8192) != 0 ? kVar.f19410k : n9;
        h hVar3 = hVar2;
        if ((i10 & 16384) != 0) {
            kVar.getClass();
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        return kVar.a(j15, j13, oVar2, mVar2, nVar2, gVar3, str2, j14, aVar2, kVar3, eVar2, j16, hVar3, n10, iVar2, (i10 & 32768) != 0 ? kVar.f19411l : gVar2);
    }

    public final k a(long j9, long j10, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j11, a aVar, p101k0.k kVar, e eVar, long j12, h hVar, N n9, i iVar, g gVar2) {
        return new k(r.l(j9, g()) ? this.f19400a : j.f22670a.a(j9), j10, oVar, mVar, nVar, gVar, str, j11, aVar, kVar, eVar, j12, hVar, n9, iVar, gVar2, (AbstractC1457h) null);
    }

    public final float c() {
        return this.f19400a.b();
    }

    public final long d() {
        return this.f19408i;
    }

    public final a e() {
        return this.f19405f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s(kVar) && t(kVar);
    }

    public final AbstractC0868l f() {
        this.f19400a.a();
        return null;
    }

    public final long g() {
        return this.f19400a.c();
    }

    public final p051f0.g h() {
        return null;
    }

    public int hashCode() {
        int iR = r.r(g());
        f();
        int iHashCode = ((((iR * 961) + Float.hashCode(c())) * 31) + u.i(this.f19401b)) * 31;
        o oVar = this.f19402c;
        int iHashCode2 = (iHashCode + (oVar != null ? oVar.hashCode() : 0)) * 923521;
        String str = this.f19403d;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + u.i(this.f19404e)) * 31;
        a aVar = this.f19405f;
        int iD = (iHashCode3 + (aVar != null ? a.d(aVar.f()) : 0)) * 31;
        p101k0.k kVar = this.f19406g;
        int iHashCode4 = (iD + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e eVar = this.f19407h;
        int iHashCode5 = (((iHashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31) + r.r(this.f19408i)) * 31;
        h hVar = this.f19409j;
        int iHashCode6 = (iHashCode5 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        N n9 = this.f19410k;
        int iHashCode7 = (iHashCode6 + (n9 != null ? n9.hashCode() : 0)) * 961;
        g gVar = this.f19411l;
        return iHashCode7 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String i() {
        return this.f19403d;
    }

    public final long j() {
        return this.f19401b;
    }

    public final m k() {
        return null;
    }

    public final n l() {
        return null;
    }

    public final o m() {
        return this.f19402c;
    }

    public final long n() {
        return this.f19404e;
    }

    public final e o() {
        return this.f19407h;
    }

    public final N p() {
        return this.f19410k;
    }

    public final h q() {
        return this.f19409j;
    }

    public final p101k0.k r() {
        return this.f19406g;
    }

    public final boolean s(k kVar) {
        if (this == kVar) {
            return true;
        }
        return u.e(this.f19401b, kVar.f19401b) && kotlin.jvm.internal.n.d(this.f19402c, kVar.f19402c) && kotlin.jvm.internal.n.d(null, null) && kotlin.jvm.internal.n.d(null, null) && kotlin.jvm.internal.n.d(null, null) && kotlin.jvm.internal.n.d(this.f19403d, kVar.f19403d) && u.e(this.f19404e, kVar.f19404e) && kotlin.jvm.internal.n.d(this.f19405f, kVar.f19405f) && kotlin.jvm.internal.n.d(this.f19406g, kVar.f19406g) && kotlin.jvm.internal.n.d(this.f19407h, kVar.f19407h) && r.l(this.f19408i, kVar.f19408i) && kotlin.jvm.internal.n.d(null, null);
    }

    public final boolean t(k kVar) {
        return kotlin.jvm.internal.n.d(this.f19400a, kVar.f19400a) && kotlin.jvm.internal.n.d(this.f19409j, kVar.f19409j) && kotlin.jvm.internal.n.d(this.f19410k, kVar.f19410k) && kotlin.jvm.internal.n.d(this.f19411l, kVar.f19411l);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpanStyle(color=");
        sb.append((Object) r.s(g()));
        sb.append(", brush=");
        f();
        sb.append((Object) null);
        sb.append(", alpha=");
        sb.append(c());
        sb.append(", fontSize=");
        sb.append((Object) u.j(this.f19401b));
        sb.append(", fontWeight=");
        sb.append(this.f19402c);
        sb.append(", fontStyle=");
        sb.append((Object) null);
        sb.append(", fontSynthesis=");
        sb.append((Object) null);
        sb.append(", fontFamily=");
        sb.append((Object) null);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f19403d);
        sb.append(", letterSpacing=");
        sb.append((Object) u.j(this.f19404e));
        sb.append(", baselineShift=");
        sb.append(this.f19405f);
        sb.append(", textGeometricTransform=");
        sb.append(this.f19406g);
        sb.append(", localeList=");
        sb.append(this.f19407h);
        sb.append(", background=");
        sb.append((Object) r.s(this.f19408i));
        sb.append(", textDecoration=");
        sb.append(this.f19409j);
        sb.append(", shadow=");
        sb.append(this.f19410k);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", drawStyle=");
        sb.append(this.f19411l);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ k(j jVar, long j9, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j10, a aVar, p101k0.k kVar, e eVar, long j11, h hVar, N n9, i iVar, g gVar2, AbstractC1457h abstractC1457h) {
        this(jVar, j9, oVar, mVar, nVar, gVar, str, j10, aVar, kVar, eVar, j11, hVar, n9, iVar, gVar2);
    }

    private k(j jVar, long j9, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j10, a aVar, p101k0.k kVar, e eVar, long j11, h hVar, N n9, i iVar, g gVar2) {
        this.f19400a = jVar;
        this.f19401b = j9;
        this.f19402c = oVar;
        this.f19403d = str;
        this.f19404e = j10;
        this.f19405f = aVar;
        this.f19406g = kVar;
        this.f19407h = eVar;
        this.f19408i = j11;
        this.f19409j = hVar;
        this.f19410k = n9;
        this.f19411l = gVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(long j9, long j10, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j11, a aVar, p101k0.k kVar, e eVar, long j12, h hVar, N n9, i iVar, g gVar2, int i10, AbstractC1457h abstractC1457h) {
        long jE = (i10 & 1) != 0 ? r.f2740b.e() : j9;
        long jA = (i10 & 2) != 0 ? u.f22843b.a() : j10;
        o oVar2 = (i10 & 4) != 0 ? null : oVar;
        m mVar2 = (i10 & 8) != 0 ? null : mVar;
        n nVar2 = (i10 & 16) != 0 ? null : nVar;
        p051f0.g gVar3 = (i10 & 32) != 0 ? null : gVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jA2 = (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? u.f22843b.a() : j11;
        a aVar2 = (i10 & 256) != 0 ? null : aVar;
        p101k0.k kVar2 = (i10 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : kVar;
        e eVar2 = (i10 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? null : eVar;
        long jE2 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? r.f2740b.e() : j12;
        h hVar2 = (i10 & 4096) != 0 ? null : hVar;
        long j13 = jE;
        N n10 = (i10 & 8192) != 0 ? null : n9;
        i iVar2 = (i10 & 16384) != 0 ? null : iVar;
        long j14 = jA;
        o oVar3 = oVar2;
        h hVar3 = hVar2;
        m mVar3 = mVar2;
        n nVar3 = nVar2;
        p051f0.g gVar4 = gVar3;
        String str3 = str2;
        long j15 = jA2;
        a aVar3 = aVar2;
        p101k0.k kVar3 = kVar2;
        e eVar3 = eVar2;
        long j16 = jE2;
        this(j13, j14, oVar3, mVar3, nVar3, gVar4, str3, j15, aVar3, kVar3, eVar3, j16, hVar3, n10, iVar2, (i10 & 32768) != 0 ? null : gVar2, (AbstractC1457h) null);
    }

    private k(long j9, long j10, o oVar, m mVar, n nVar, p051f0.g gVar, String str, long j11, a aVar, p101k0.k kVar, e eVar, long j12, h hVar, N n9, i iVar, g gVar2) {
        this(j.f22670a.a(j9), j10, oVar, mVar, nVar, gVar, str, j11, aVar, kVar, eVar, j12, hVar, n9, iVar, gVar2, (AbstractC1457h) null);
    }
}
