package p086i5;

import java.util.concurrent.Executor;
import p036d5.l;
import p056f5.a;
import p066g5.c;
import p076h5.e;
import p175r4.C1784f9;
import p175r4.C1817i9;
import p175r4.C1905r6;
import p175r4.EnumC1866n6;
import p175r4.EnumC1886p6;
import p175r4.EnumC1896q6;
import p175r4.O7;
import p215v4.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c implements p076h5.d {
    d(e eVar, j jVar, Executor executor, C1784f9 c1784f9) {
        super(jVar, executor);
        C1905r6 c1905r6 = new C1905r6();
        c1905r6.e(EnumC1866n6.TYPE_THIN);
        O7 o9 = new O7();
        o9.c(eVar.a());
        o9.b(EnumC1886p6.NO_ERROR);
        c1905r6.g(o9.d());
        c1784f9.d(C1817i9.f(c1905r6, 1), EnumC1896q6.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE);
    }

    @Override // p005a4.f
    public final Z3.c[] a() {
        return new Z3.c[]{l.f19615z};
    }

    @Override // p076h5.d
    public final k p0(a aVar) {
        return super.f(aVar);
    }
}
