package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class x extends m {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    int f14222i0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    ArrayList f14220g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f14221h0 = true;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    boolean f14223j0 = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f14224k0 = 0;

    class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f14225a;

        a(m mVar) {
            this.f14225a = mVar;
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void f(m mVar) {
            this.f14225a.l0();
            mVar.h0(this);
        }
    }

    class b extends t {
        b() {
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void i(m mVar) {
            x.this.f14220g0.remove(mVar);
            if (x.this.S()) {
                return;
            }
            x.this.d0(m.i.f14209c, false);
            x xVar = x.this;
            xVar.f14167R = true;
            xVar.d0(m.i.f14208b, false);
        }
    }

    static class c extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        x f14228a;

        c(x xVar) {
            this.f14228a = xVar;
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void a(m mVar) {
            x xVar = this.f14228a;
            if (xVar.f14223j0) {
                return;
            }
            xVar.t0();
            this.f14228a.f14223j0 = true;
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void f(m mVar) {
            x xVar = this.f14228a;
            int i10 = xVar.f14222i0 - 1;
            xVar.f14222i0 = i10;
            if (i10 == 0) {
                xVar.f14223j0 = false;
                xVar.x();
            }
            mVar.h0(this);
        }
    }

    private int B0(long j9) {
        for (int i10 = 1; i10 < this.f14220g0.size(); i10++) {
            if (((m) this.f14220g0.get(i10)).f14177b0 > j9) {
                return i10 - 1;
            }
        }
        return this.f14220g0.size() - 1;
    }

    private void I0() {
        c cVar = new c(this);
        Iterator it = this.f14220g0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).e(cVar);
        }
        this.f14222i0 = this.f14220g0.size();
    }

    private void y0(m mVar) {
        this.f14220g0.add(mVar);
        mVar.f14157H = this;
    }

    public int A0() {
        return this.f14220g0.size();
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public x h0(m.h hVar) {
        return (x) super.h0(hVar);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public x i0(View view) {
        for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
            ((m) this.f14220g0.get(i10)).i0(view);
        }
        return (x) super.i0(view);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public x n0(long j9) {
        ArrayList arrayList;
        super.n0(j9);
        if (this.f14180s >= 0 && (arrayList = this.f14220g0) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m) this.f14220g0.get(i10)).n0(j9);
            }
        }
        return this;
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public x p0(TimeInterpolator timeInterpolator) {
        this.f14224k0 |= 1;
        ArrayList arrayList = this.f14220g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m) this.f14220g0.get(i10)).p0(timeInterpolator);
            }
        }
        return (x) super.p0(timeInterpolator);
    }

    public x G0(int i10) {
        if (i10 == 0) {
            this.f14221h0 = true;
            return this;
        }
        if (i10 == 1) {
            this.f14221h0 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public x s0(long j9) {
        return (x) super.s0(j9);
    }

    @Override // androidx.transition.m
    boolean S() {
        for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
            if (((m) this.f14220g0.get(i10)).S()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.m
    public boolean T() {
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((m) this.f14220g0.get(i10)).T()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.m
    protected void cancel() {
        super.cancel();
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f14220g0.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.m
    public void e0(View view) {
        super.e0(view);
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f14220g0.get(i10)).e0(view);
        }
    }

    @Override // androidx.transition.m
    void g0() {
        this.f14175Z = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
            m mVar = (m) this.f14220g0.get(i10);
            mVar.e(bVar);
            mVar.g0();
            long jP = mVar.P();
            if (this.f14221h0) {
                this.f14175Z = Math.max(this.f14175Z, jP);
            } else {
                long j9 = this.f14175Z;
                mVar.f14177b0 = j9;
                this.f14175Z = j9 + jP;
            }
        }
    }

    @Override // androidx.transition.m
    public void j0(View view) {
        super.j0(view);
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f14220g0.get(i10)).j0(view);
        }
    }

    @Override // androidx.transition.m
    protected void l0() {
        if (this.f14220g0.isEmpty()) {
            t0();
            x();
            return;
        }
        I0();
        if (this.f14221h0) {
            Iterator it = this.f14220g0.iterator();
            while (it.hasNext()) {
                ((m) it.next()).l0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f14220g0.size(); i10++) {
            ((m) this.f14220g0.get(i10 - 1)).e(new a((m) this.f14220g0.get(i10)));
        }
        m mVar = (m) this.f14220g0.get(0);
        if (mVar != null) {
            mVar.l0();
        }
    }

    @Override // androidx.transition.m
    public void m(z zVar) {
        if (V(zVar.f14231b)) {
            for (m mVar : this.f14220g0) {
                if (mVar.V(zVar.f14231b)) {
                    mVar.m(zVar);
                    zVar.f14232c.add(mVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.m
    void m0(long j9, long j10) {
        long j11;
        long jP = P();
        long j12 = 0;
        if (this.f14157H != null) {
            if (j9 < 0 && j10 < 0) {
                return;
            }
            if (j9 > jP && j10 > jP) {
                return;
            }
        }
        boolean z9 = j9 < j10;
        if ((j9 >= 0 && j10 < 0) || (j9 <= jP && j10 > jP)) {
            this.f14167R = false;
            d0(m.i.f14207a, z9);
        }
        if (!this.f14221h0) {
            int iB0 = B0(j10);
            if (j9 >= j10) {
                while (true) {
                    if (iB0 < this.f14220g0.size()) {
                        m mVar = (m) this.f14220g0.get(iB0);
                        long j13 = mVar.f14177b0;
                        j11 = j12;
                        long j14 = j9 - j13;
                        if (j14 < j11) {
                            break;
                        }
                        mVar.m0(j14, j10 - j13);
                        iB0++;
                        j12 = j11;
                    }
                }
            } else {
                j11 = 0;
                while (iB0 >= 0) {
                    m mVar2 = (m) this.f14220g0.get(iB0);
                    long j15 = mVar2.f14177b0;
                    long j16 = j9 - j15;
                    mVar2.m0(j16, j10 - j15);
                    if (j16 >= 0) {
                        break;
                    } else {
                        iB0--;
                    }
                }
            }
            if (this.f14157H != null) {
                if ((j9 > jP || j10 > jP) && (j9 >= 0 || j10 < j11)) {
                    return;
                }
                if (j9 > jP) {
                    this.f14167R = true;
                }
                d0(m.i.f14208b, z9);
            }
        }
        for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
            ((m) this.f14220g0.get(i10)).m0(j9, j10);
        }
        j11 = j12;
        if (this.f14157H != null) {
            if (j9 > jP) {
                return;
            } else {
                return;
            }
            if (j9 > jP) {
                this.f14167R = true;
            }
            d0(m.i.f14208b, z9);
        }
    }

    @Override // androidx.transition.m
    void o(z zVar) {
        super.o(zVar);
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f14220g0.get(i10)).o(zVar);
        }
    }

    @Override // androidx.transition.m
    public void o0(m.e eVar) {
        super.o0(eVar);
        this.f14224k0 |= 8;
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f14220g0.get(i10)).o0(eVar);
        }
    }

    @Override // androidx.transition.m
    public void p(z zVar) {
        if (V(zVar.f14231b)) {
            for (m mVar : this.f14220g0) {
                if (mVar.V(zVar.f14231b)) {
                    mVar.p(zVar);
                    zVar.f14232c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    public void q0(AbstractC1172g abstractC1172g) {
        super.q0(abstractC1172g);
        this.f14224k0 |= 4;
        if (this.f14220g0 != null) {
            for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
                ((m) this.f14220g0.get(i10)).q0(abstractC1172g);
            }
        }
    }

    @Override // androidx.transition.m
    public void r0(v vVar) {
        super.r0(vVar);
        this.f14224k0 |= 2;
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f14220g0.get(i10)).r0(vVar);
        }
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: s */
    public m clone() {
        x xVar = (x) super.clone();
        xVar.f14220g0 = new ArrayList();
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            xVar.y0(((m) this.f14220g0.get(i10)).clone());
        }
        return xVar;
    }

    @Override // androidx.transition.m
    String u0(String str) {
        String strU0 = super.u0(str);
        for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strU0);
            sb.append("\n");
            sb.append(((m) this.f14220g0.get(i10)).u0(str + "  "));
            strU0 = sb.toString();
        }
        return strU0;
    }

    @Override // androidx.transition.m
    void v(ViewGroup viewGroup, A a10, A a11, ArrayList arrayList, ArrayList arrayList2) {
        long jK = K();
        int size = this.f14220g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) this.f14220g0.get(i10);
            if (jK > 0 && (this.f14221h0 || i10 == 0)) {
                long jK2 = mVar.K();
                if (jK2 > 0) {
                    mVar.s0(jK2 + jK);
                } else {
                    mVar.s0(jK);
                }
            }
            mVar.v(viewGroup, a10, a11, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public x e(m.h hVar) {
        return (x) super.e(hVar);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public x i(View view) {
        for (int i10 = 0; i10 < this.f14220g0.size(); i10++) {
            ((m) this.f14220g0.get(i10)).i(view);
        }
        return (x) super.i(view);
    }

    public x x0(m mVar) {
        y0(mVar);
        long j9 = this.f14180s;
        if (j9 >= 0) {
            mVar.n0(j9);
        }
        if ((this.f14224k0 & 1) != 0) {
            mVar.p0(D());
        }
        if ((this.f14224k0 & 2) != 0) {
            mVar.r0(H());
        }
        if ((this.f14224k0 & 4) != 0) {
            mVar.q0(G());
        }
        if ((this.f14224k0 & 8) != 0) {
            mVar.o0(C());
        }
        return this;
    }

    public m z0(int i10) {
        if (i10 < 0 || i10 >= this.f14220g0.size()) {
            return null;
        }
        return (m) this.f14220g0.get(i10);
    }
}
