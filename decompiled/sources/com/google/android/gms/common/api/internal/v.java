package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import p015b4.C1182b;
import p025c4.AbstractC1189c;
import p025c4.C1191e;
import p025c4.C1200n;
import p025c4.C1203q;
import p215v4.InterfaceC1994e;

/* JADX INFO: loaded from: classes.dex */
final class v implements InterfaceC1994e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1225b f16315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1182b f16317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f16319e;

    v(C1225b c1225b, int i10, C1182b c1182b, long j9, long j10, String str, String str2) {
        this.f16315a = c1225b;
        this.f16316b = i10;
        this.f16317c = c1182b;
        this.f16318d = j9;
        this.f16319e = j10;
    }

    static v b(C1225b c1225b, int i10, C1182b c1182b) {
        boolean zD;
        if (!c1225b.f()) {
            return null;
        }
        p025c4.r rVarA = C1203q.b().a();
        if (rVarA == null) {
            zD = true;
        } else {
            if (!rVarA.c()) {
                return null;
            }
            zD = rVarA.d();
            q qVarW = c1225b.w(c1182b);
            if (qVarW != null) {
                if (!(qVarW.u() instanceof AbstractC1189c)) {
                    return null;
                }
                AbstractC1189c abstractC1189c = (AbstractC1189c) qVarW.u();
                if (abstractC1189c.I() && !abstractC1189c.d()) {
                    C1191e c1191eC = c(qVarW, abstractC1189c, i10);
                    if (c1191eC == null) {
                        return null;
                    }
                    qVarW.F();
                    zD = c1191eC.e();
                }
            }
        }
        return new v(c1225b, i10, c1182b, zD ? System.currentTimeMillis() : 0L, zD ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C1191e c(q qVar, AbstractC1189c abstractC1189c, int i10) {
        int[] iArrB;
        int[] iArrC;
        C1191e c1191eG = abstractC1189c.G();
        if (c1191eG == null || !c1191eG.d() || ((iArrB = c1191eG.b()) != null ? !p085i4.a.a(iArrB, i10) : !((iArrC = c1191eG.c()) == null || !p085i4.a.a(iArrC, i10))) || qVar.s() >= c1191eG.a()) {
            return null;
        }
        return c1191eG;
    }

    @Override // p215v4.InterfaceC1994e
    public final void a(p215v4.k kVar) {
        q qVarW;
        int iE;
        int i10;
        int i11;
        int iA;
        long j9;
        long j10;
        if (this.f16315a.f()) {
            p025c4.r rVarA = C1203q.b().a();
            if ((rVarA == null || rVarA.c()) && (qVarW = this.f16315a.w(this.f16317c)) != null && (qVarW.u() instanceof AbstractC1189c)) {
                AbstractC1189c abstractC1189c = (AbstractC1189c) qVarW.u();
                int i12 = 0;
                boolean zD = this.f16318d > 0;
                int iY = abstractC1189c.y();
                if (rVarA != null) {
                    zD &= rVarA.d();
                    int iA2 = rVarA.a();
                    int iB = rVarA.b();
                    iE = rVarA.e();
                    if (abstractC1189c.I() && !abstractC1189c.d()) {
                        C1191e c1191eC = c(qVarW, abstractC1189c, this.f16316b);
                        if (c1191eC == null) {
                            return;
                        }
                        boolean z9 = c1191eC.e() && this.f16318d > 0;
                        iB = c1191eC.a();
                        zD = z9;
                    }
                    i11 = iA2;
                    i10 = iB;
                } else {
                    iE = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C1225b c1225b = this.f16315a;
                int iElapsedRealtime = -1;
                if (kVar.l()) {
                    iA = 0;
                } else {
                    if (kVar.j()) {
                        i12 = 100;
                    } else {
                        Exception excH = kVar.h();
                        if (excH instanceof p005a4.b) {
                            Status statusA = ((p005a4.b) excH).a();
                            int iB2 = statusA.b();
                            Z3.a aVarA = statusA.a();
                            iA = aVarA == null ? -1 : aVarA.a();
                            i12 = iB2;
                        } else {
                            i12 = 101;
                        }
                    }
                    iA = -1;
                }
                if (zD) {
                    long j11 = this.f16318d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f16319e);
                    j9 = j11;
                    j10 = jCurrentTimeMillis;
                } else {
                    j9 = 0;
                    j10 = 0;
                }
                c1225b.G(new C1200n(this.f16316b, i12, iA, j9, j10, null, null, iY, iElapsedRealtime), iE, i11, i10);
            }
        }
    }
}
