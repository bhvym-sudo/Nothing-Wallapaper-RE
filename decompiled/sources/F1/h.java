package F1;

import F8.AbstractC0812g;
import F8.I;
import F8.L;
import android.app.UiModeManager;
import android.content.Context;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.N;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class h implements D3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f1524e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f1525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f1526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f1527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D3.b f1528d;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f1530r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ UiModeManager f1531s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(UiModeManager uiModeManager, p129m8.e eVar) {
            super(2, eVar);
            this.f1531s = uiModeManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f1531s, eVar);
            aVar.f1530r = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f1529q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f1531s.setNightModeActivated(this.f1530r);
            return A.f21846a;
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1532q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f1534s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f1534s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return h.this.new c(this.f1534s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1532q;
            if (i10 == 0) {
                r.b(obj);
                p pVar = h.this.f1527c;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(this.f1534s);
                this.f1532q = 1;
                if (pVar.invoke(boolA, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(final Context context, UiModeManager manager, I backgroundDispatcher) {
        this(backgroundDispatcher, new p219v8.a() { // from class: F1.g
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(h.d(context));
            }
        }, new a(manager, null));
        n.h(context, "context");
        n.h(manager, "manager");
        n.h(backgroundDispatcher, "backgroundDispatcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Context context) {
        return (context.getApplicationContext().getResources().getConfiguration().uiMode & 32) != 0;
    }

    private final E3.a f(boolean z9) {
        Map mapC = N.c();
        mapC.put("is_activated", String.valueOf(z9));
        return new E3.a(N.b(mapC));
    }

    @Override // D3.a
    public Object a(E3.a aVar, p129m8.e eVar) {
        String str = (String) aVar.a().get("is_activated");
        boolean z9 = false;
        if (str != null && Boolean.parseBoolean(str)) {
            z9 = true;
        }
        Object objG = AbstractC0812g.g(this.f1525a, new c(z9, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    @Override // D3.a
    public Object b(D3.b bVar, p129m8.e eVar) {
        this.f1528d = bVar;
        return f(((Boolean) this.f1526b.invoke()).booleanValue());
    }

    public final void g(boolean z9) {
        this.f1528d.a(f(z9));
    }

    public h(I backgroundDispatcher, p219v8.a isActive, p setActive) {
        n.h(backgroundDispatcher, "backgroundDispatcher");
        n.h(isActive, "isActive");
        n.h(setActive, "setActive");
        this.f1528d = D3.b.a.f714a;
        this.f1525a = backgroundDispatcher;
        this.f1526b = isActive;
        this.f1527c = setActive;
    }
}
