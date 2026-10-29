package J1;

import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p089i8.N;
import p129m8.e;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3507e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.a f3508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f3509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J1.a f3510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D3.b f3511d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(p219v8.a isActivated, l setActivated, J1.a interactor) {
        n.h(isActivated, "isActivated");
        n.h(setActivated, "setActivated");
        n.h(interactor, "interactor");
        this.f3508a = isActivated;
        this.f3509b = setActivated;
        this.f3510c = interactor;
        this.f3511d = D3.b.a.f714a;
    }

    private final E3.a c(Boolean bool) {
        Map mapC = N.c();
        mapC.put("is_activated", String.valueOf(bool != null ? bool.booleanValue() : ((Boolean) this.f3508a.invoke()).booleanValue()));
        return new E3.a(N.b(mapC));
    }

    static /* synthetic */ E3.a d(b bVar, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        return bVar.c(bool);
    }

    @Override // D3.a
    public Object a(E3.a aVar, e eVar) {
        String str = (String) aVar.a().get("is_activated");
        boolean z9 = false;
        if (str != null && Boolean.parseBoolean(str)) {
            z9 = true;
        }
        this.f3509b.f(kotlin.coroutines.jvm.internal.b.a(z9));
        this.f3510c.c(z9);
        return A.f21846a;
    }

    @Override // D3.a
    public Object b(D3.b bVar, e eVar) {
        this.f3511d = bVar;
        return d(this, null, 1, null);
    }

    public final void e(boolean z9) {
        this.f3511d.a(c(Boolean.valueOf(z9)));
    }
}
