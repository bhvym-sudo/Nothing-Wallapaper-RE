package p025c4;

import Z3.a;
import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
abstract class L extends T {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f15071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1189c f15072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected L(AbstractC1189c abstractC1189c, int i10, Bundle bundle) {
        super(abstractC1189c, Boolean.TRUE);
        this.f15072f = abstractC1189c;
        this.f15070d = i10;
        this.f15071e = bundle;
    }

    @Override // p025c4.T
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f15070d != 0) {
            this.f15072f.g0(1, null);
            Bundle bundle = this.f15071e;
            f(new a(this.f15070d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f15072f.g0(1, null);
            f(new a(8, null));
        }
    }

    @Override // p025c4.T
    protected final void b() {
    }

    protected abstract void f(a aVar);

    protected abstract boolean g();
}
