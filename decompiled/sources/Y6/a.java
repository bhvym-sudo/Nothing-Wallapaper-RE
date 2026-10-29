package Y6;

import P8.B;
import P8.D;
import P8.w;
import android.content.Context;
import kotlin.jvm.internal.n;
import p087i6.l;
import p087i6.r;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9374a;

    public a(Context context) {
        n.h(context, "context");
        this.f9374a = l.f22204a.b(context);
    }

    @Override // P8.w
    public D a(w.a chain) {
        n.h(chain, "chain");
        B b10 = chain.b();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strB = r.b(this.f9374a + strValueOf);
        if (strB == null) {
            strB = "";
        }
        return chain.a(b10.h().a("Accept", "application/json;charset=utf-8").a("timestamp", strValueOf).a("auth", strB).b());
    }
}
