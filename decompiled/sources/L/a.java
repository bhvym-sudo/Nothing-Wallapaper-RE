package L;

import I.B;
import androidx.collection.F;
import androidx.collection.O;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f4199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f4200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private F f4201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private F f4202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4203e;

    public final boolean i(c cVar) {
        if (!this.f4203e) {
            B.a("Only add dependencies during a tracking");
        }
        F f10 = this.f4201c;
        if (f10 != null) {
            n.e(f10);
            f10.h(cVar);
        } else if (this.f4199a != null) {
            F fA = O.a();
            c cVar2 = this.f4199a;
            n.e(cVar2);
            fA.h(cVar2);
            fA.h(cVar);
            this.f4201c = fA;
            this.f4199a = null;
        } else {
            this.f4199a = cVar;
        }
        F f11 = this.f4202d;
        if (f11 != null) {
            n.e(f11);
            return !f11.x(cVar);
        }
        if (this.f4200b != cVar) {
            return true;
        }
        this.f4200b = null;
        return false;
    }
}
