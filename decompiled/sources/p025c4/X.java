package p025c4;

import Z3.a;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class X extends L {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1189c f15088g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC1189c abstractC1189c, int i10, Bundle bundle) {
        super(abstractC1189c, i10, null);
        this.f15088g = abstractC1189c;
    }

    @Override // p025c4.L
    protected final void f(a aVar) {
        if (this.f15088g.s() && AbstractC1189c.f0(this.f15088g)) {
            AbstractC1189c.b0(this.f15088g, 16);
        } else {
            this.f15088g.f15100F.c(aVar);
            this.f15088g.K(aVar);
        }
    }

    @Override // p025c4.L
    protected final boolean g() {
        this.f15088g.f15100F.c(a.f9441u);
        return true;
    }
}
