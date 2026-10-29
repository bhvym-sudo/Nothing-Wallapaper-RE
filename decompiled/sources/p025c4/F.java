package p025c4;

import Z3.e;
import android.content.Context;
import android.util.SparseIntArray;
import p005a4.a;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f15059a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f15060b;

    public F(e eVar) {
        AbstractC1202p.i(eVar);
        this.f15060b = eVar;
    }

    public final int a(Context context, int i10) {
        return this.f15059a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC1202p.i(context);
        AbstractC1202p.i(fVar);
        int iG = 0;
        if (!fVar.k()) {
            return 0;
        }
        int iL = fVar.l();
        int iA = a(context, iL);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f15059a.size()) {
                iG = -1;
                break;
            }
            int iKeyAt = this.f15059a.keyAt(i10);
            if (iKeyAt > iL && this.f15059a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iG == -1) {
            iG = this.f15060b.g(context, iL);
        }
        this.f15059a.put(iL, iG);
        return iG;
    }

    public final void c() {
        this.f15059a.clear();
    }
}
