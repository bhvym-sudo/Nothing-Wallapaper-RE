package p034d3;

import F8.AbstractC0814h;
import F8.C0803b0;
import F8.L;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.I;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0520a f19546c = new C0520a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private R2.a f19547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f19548b;

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    public static final class C0520a {
        public /* synthetic */ C0520a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final a a() {
            return I.a().C();
        }

        private C0520a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19549q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f19551s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, p129m8.e eVar) {
            super(2, eVar);
            this.f19551s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new b(this.f19551s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f19549q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            R2.a aVarD = a.this.d(this.f19551s);
            this.f19549q = 1;
            Object objC = aVarD.c(this);
            return objC == objE ? objE : objC;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19552q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f19554s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, p129m8.e eVar) {
            super(2, eVar);
            this.f19554s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new c(this.f19554s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f19552q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            R2.a aVarD = a.this.d(this.f19554s);
            this.f19552q = 1;
            Object objC = aVarD.c(this);
            return objC == objE ? objE : objC;
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19555q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f19557s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, p129m8.e eVar) {
            super(2, eVar);
            this.f19557s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new d(this.f19557s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f19555q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            a aVar = a.this;
            Context context = this.f19557s;
            this.f19555q = 1;
            Object objO = aVar.o(context, this);
            return objO == objE ? objE : objO;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f19558q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f19560s;

        e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19558q = obj;
            this.f19560s |= Integer.MIN_VALUE;
            return a.this.o(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R2.a d(Context context) {
        R2.a aVar = this.f19547a;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        R2.b bVar = new R2.b(applicationContext, C0803b0.b());
        this.f19547a = bVar;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Context context, p129m8.e eVar) {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f19560s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f19560s = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f19558q;
        Object objE = p139n8.b.e();
        int i11 = eVar2.f19560s;
        try {
            if (i11 == 0) {
                r.b(objC);
                R2.a aVarD = d(context);
                eVar2.f19560s = 1;
                objC = aVarD.c(eVar2);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objC);
            }
            return (List) objC;
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.g("BaseFlags", "queryFlag error", e10);
            return AbstractC1444s.l();
        }
    }

    public List c(Context context) {
        n.h(context, "context");
        List list = this.f19548b;
        if (list != null) {
            return list;
        }
        List list2 = (List) AbstractC0814h.b(null, new b(context, null), 1, null);
        this.f19548b = list2;
        return list2;
    }

    public abstract boolean e(Context context);

    public boolean f() {
        return P2.c.a();
    }

    public abstract boolean g(Context context);

    public boolean h(Context context) {
        n.h(context, "context");
        Object obj = null;
        for (Object obj2 : (Iterable) AbstractC0814h.b(null, new c(context, null), 1, null)) {
            if (n.d(((R2.a.b) obj2).a(), "wallpaper_fullscreen_preview")) {
                obj = obj2;
                break;
            }
        }
        R2.a.b bVar = (R2.a.b) obj;
        return bVar != null && bVar.b();
    }

    public boolean i(Context context) {
        Object next;
        n.h(context, "context");
        Iterator it = c(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!n.d(((R2.a.b) next).a(), "is_custom_lock_screen_quick_affordances_feature_enabled"));
        R2.a.b bVar = (R2.a.b) next;
        return bVar != null && bVar.b();
    }

    public final boolean j(Context context) {
        n.h(context, "context");
        Object obj = null;
        for (Object obj2 : (Iterable) AbstractC0814h.b(null, new d(context, null), 1, null)) {
            if (n.d(((R2.a.b) obj2).a(), "is_monochromatic_theme_enabled")) {
                obj = obj2;
                break;
            }
        }
        R2.a.b bVar = (R2.a.b) obj;
        return bVar != null && bVar.b();
    }

    public boolean k() {
        return P2.c.b();
    }

    public abstract boolean l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();
}
