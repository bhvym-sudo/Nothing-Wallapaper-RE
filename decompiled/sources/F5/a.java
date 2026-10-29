package F5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0066a f1635e = new C0066a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f1636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C8.e f1637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PackageManager f1638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1639d;

    /* JADX INFO: renamed from: F5.a$a, reason: collision with other inner class name */
    public static final class C0066a {
        public /* synthetic */ C0066a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0066a() {
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.l implements p219v8.l {
        b(Object obj) {
            super(1, obj, a.class, "onServiceBind", "onServiceBind(Lcom/nothing/cardservice/ICardWidgetService;)V", 0);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            g((q) obj);
            return A.f21846a;
        }

        public final void g(q qVar) {
            ((a) this.receiver).a(qVar);
        }
    }

    public a(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f1637b = new b(this);
        this.f1638c = context.getPackageManager();
        f();
    }

    private final void f() {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            List<PackageManager.Property> listQueryServiceProperty = this.f1638c.queryServiceProperty("com.nothing.cardservice.service.api_level");
            kotlin.jvm.internal.n.g(listQueryServiceProperty, "queryServiceProperty(...)");
            objB = p079h8.q.b(Integer.valueOf(!listQueryServiceProperty.isEmpty() ? listQueryServiceProperty.get(0).getInteger() : 0));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.d(objB) != null) {
            objB = 0;
        }
        int iIntValue = ((Number) objB).intValue();
        this.f1639d = iIntValue;
        G5.c.f1948a.g("Host queried service apiLevel = " + iIntValue);
    }

    @Override // F5.j.b
    public void a(q qVar) {
        IBinder iBinderAsBinder;
        this.f1636a = qVar;
        e();
        G5.c.f1948a.h("Host", "onServiceBind service = " + this.f1636a + ", isAlive = " + ((qVar == null || (iBinderAsBinder = qVar.asBinder()) == null) ? null : Boolean.valueOf(iBinderAsBinder.isBinderAlive())));
    }

    public final void b() {
        j jVar = j.f1647a;
        if (jVar.u((p219v8.l) this.f1637b) && this.f1636a == null) {
            G5.c.f1948a.g("AbsServiceHost cardService is null, assign to it!!");
            this.f1636a = jVar.x();
        }
    }

    public final q c() {
        return this.f1636a;
    }

    protected final int d() {
        return this.f1639d;
    }

    public void e() {
    }

    public void g() {
        this.f1636a = null;
    }

    @Override // F5.j.b
    public void onServiceUnbind() {
        g();
    }
}
