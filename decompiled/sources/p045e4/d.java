package p045e4;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1230g;
import p005a4.a;
import p015b4.i;
import p025c4.C1204s;
import p025c4.C1207v;
import p025c4.InterfaceC1206u;
import p215v4.k;
import p215v4.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p005a4.d implements InterfaceC1206u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a.g f20180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0351a f20181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f20182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20183n = 0;

    static {
        a.g gVar = new a.g();
        f20180k = gVar;
        c cVar = new c();
        f20181l = cVar;
        f20182m = new a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C1207v c1207v) {
        super(context, f20182m, c1207v, a4.d.a.f9836c);
    }

    @Override // p025c4.InterfaceC1206u
    public final k c(final C1204s c1204s) {
        AbstractC1230g.a aVarA = AbstractC1230g.a();
        aVarA.d(p135n4.d.f23264a);
        aVarA.c(false);
        aVarA.b(new i() { // from class: e4.b
            @Override // p015b4.i
            public final void accept(Object obj, Object obj2) {
                C1204s c1204s2 = c1204s;
                int i10 = d.f20183n;
                ((a) ((e) obj).C()).X(c1204s2);
                ((l) obj2).c(null);
            }
        });
        return f(aVarA.a());
    }
}
