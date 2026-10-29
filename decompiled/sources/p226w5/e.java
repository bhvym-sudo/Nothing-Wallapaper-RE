package p226w5;

import F8.AbstractC0814h;
import F8.L;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p079h8.i;
import p079h8.o;
import p079h8.q;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f29475i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p226w5.g f29480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f29481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p079h8.h f29482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f29483h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final View f29484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final View f29485b;

            public a(View view, View view2) {
                this.f29484a = view;
                this.f29485b = view2;
            }

            public final View a() {
                return this.f29484a;
            }

            public final View b() {
                return this.f29485b;
            }
        }

        /* JADX INFO: renamed from: w5.e$b$b, reason: collision with other inner class name */
        public static final class C0721b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final View f29486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final View f29487b;

            public C0721b(View view, View view2) {
                this.f29486a = view;
                this.f29487b = view2;
            }

            public final View a() {
                return this.f29486a;
            }

            public final View b() {
                return this.f29487b;
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29488q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29489r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29490s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29491t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29492u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29493v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29494w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f29495x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f29497z;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29495x = obj;
            this.f29497z |= Integer.MIN_VALUE;
            return e.this.o(null, null, null, null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29498q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29499r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29500s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29501t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29502u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29503v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29504w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f29505x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f29507z;

        d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29505x = obj;
            this.f29507z |= Integer.MIN_VALUE;
            return e.this.p(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: w5.e$e, reason: collision with other inner class name */
    static final class C0722e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f29508q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f29510s;

        C0722e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29508q = obj;
            this.f29510s |= Integer.MIN_VALUE;
            return e.this.r(null, null, null, null, null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29511q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29512r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29513s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29514t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29515u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29516v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29517w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f29518x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f29520z;

        f(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29518x = obj;
            this.f29520z |= Integer.MIN_VALUE;
            return e.this.s(null, null, null, null, null, null, this);
        }
    }

    static final class g extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29521q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29522r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f29523s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ n f29525u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Context f29526v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29527w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ p226w5.f f29528x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ p216v5.a f29529y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n nVar, Context context, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f29525u = nVar;
            this.f29526v = context;
            this.f29527w = viewGroup;
            this.f29528x = fVar;
            this.f29529y = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new g(this.f29525u, this.f29526v, this.f29527w, this.f29528x, this.f29529y, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            int i10;
            int i11;
            View view;
            Object objE = p139n8.b.e();
            int i12 = this.f29523s;
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = this.f29521q;
                    r.b(obj);
                    gVar = this;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f29521q;
                    view = (View) this.f29522r;
                    r.b(obj);
                    gVar = this;
                }
                gVar.f29525u.a(i11);
                return new o(view, (View) obj);
            }
            r.b(obj);
            if (e.this.f29479d != 1) {
                G5.c.d("CardInfoParser", "performParse method should only run for the normal style card.");
                return new o(null, null);
            }
            int iD = this.f29525u.d();
            this.f29525u.a(1);
            e eVar = e.this;
            Context context = this.f29526v;
            ViewGroup viewGroup = this.f29527w;
            p226w5.f fVar = this.f29528x;
            p216v5.a aVar = this.f29529y;
            n nVar = this.f29525u;
            this.f29521q = iD;
            this.f29523s = 1;
            Object objP = eVar.p(context, viewGroup, fVar, aVar, nVar, this);
            gVar = this;
            if (objP != objE) {
                i10 = iD;
                obj = objP;
            }
            return objE;
            View view2 = (View) obj;
            gVar.f29525u.a(2);
            e eVar2 = e.this;
            Context context2 = gVar.f29526v;
            ViewGroup viewGroup2 = gVar.f29527w;
            p226w5.f fVar2 = gVar.f29528x;
            p216v5.a aVar2 = gVar.f29529y;
            n nVar2 = gVar.f29525u;
            gVar.f29522r = view2;
            gVar.f29521q = i10;
            gVar.f29523s = 2;
            obj = eVar2.w(context2, viewGroup2, fVar2, aVar2, nVar2, gVar);
            if (obj != objE) {
                i11 = i10;
                view = view2;
                gVar.f29525u.a(i11);
                return new o(view, (View) obj);
            }
            return objE;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        int f29530A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f29531B;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f29533D;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29534q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29535r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29536s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29537t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29538u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29539v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29540w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f29541x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f29542y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f29543z;

        h(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29531B = obj;
            this.f29533D |= Integer.MIN_VALUE;
            return e.this.u(null, null, null, null, null, null, this);
        }
    }

    public e(Context hostContext, int i10, String str, boolean z9, int i11) {
        n.h(hostContext, "hostContext");
        this.f29476a = hostContext;
        this.f29477b = i10;
        this.f29478c = z9;
        this.f29479d = i11;
        ArrayList arrayList = new ArrayList();
        this.f29481f = arrayList;
        this.f29482g = i.b(new p219v8.a() { // from class: w5.d
            @Override // p219v8.a
            public final Object invoke() {
                return e.k(this.f29474q);
            }
        });
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            this.f29480e = new p226w5.g(p206u5.c.b(jSONObject, "config_info"));
            arrayList.add(new x(p206u5.c.a(jSONObject, "view_info"), q()));
            arrayList.add(new p226w5.a(p206u5.c.a(jSONObject, "action_info"), q()));
            arrayList.add(new p226w5.c(p206u5.c.a(jSONObject, "anim_info"), q()));
            arrayList.add(new p226w5.h(p206u5.c.a(jSONObject, "custom_info"), q()));
            arrayList.add(new i(p206u5.c.b(jSONObject, "extra_info")));
            arrayList.add(new w(p206u5.c.b(jSONObject, "schedule_info"), q()));
            if (jSONObject.has("simple_card_info") && z9) {
                this.f29483h = n(jSONObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p226w5.b k(e this$0) {
        n.h(this$0, "this$0");
        return new p226w5.b(this$0);
    }

    private final boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectB = p206u5.c.b(jSONObject, "schedule_info");
        boolean zHas = jSONObjectB != null ? jSONObjectB.has(str2) : false;
        String strE = p206u5.c.e(jSONObject, "simple_card_info");
        return zHas || (strE != null && l(strE, str2));
    }

    private final e n(JSONObject jSONObject) {
        return new e(this.f29476a, this.f29477b, p206u5.c.e(jSONObject, "simple_card_info"), false, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object o(Context context, View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) {
        c cVar;
        View view2;
        p226w5.f fVar2;
        p216v5.a aVar2;
        n nVar2;
        Iterator it;
        Context context2;
        ViewGroup viewGroup2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i10 = cVar.f29497z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f29497z = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f29495x;
        Object objE = p139n8.b.e();
        int i11 = cVar.f29497z;
        if (i11 == 0) {
            r.b(obj);
            view2 = view;
            fVar2 = fVar;
            aVar2 = aVar;
            nVar2 = nVar;
            it = this.f29481f.iterator();
            context2 = context;
            viewGroup2 = viewGroup;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) cVar.f29494w;
            n nVar3 = (n) cVar.f29493v;
            aVar2 = (p216v5.a) cVar.f29492u;
            p226w5.f fVar3 = (p226w5.f) cVar.f29491t;
            ViewGroup viewGroup3 = (ViewGroup) cVar.f29490s;
            View view3 = (View) cVar.f29489r;
            Context context3 = (Context) cVar.f29488q;
            r.b(obj);
            nVar2 = nVar3;
            fVar2 = fVar3;
            view2 = view3;
            viewGroup2 = viewGroup3;
            it = it2;
            context2 = context3;
        }
        while (it.hasNext()) {
            o oVar = (o) it.next();
            cVar.f29488q = context2;
            cVar.f29489r = view2;
            cVar.f29490s = viewGroup2;
            cVar.f29491t = fVar2;
            cVar.f29492u = aVar2;
            cVar.f29493v = nVar2;
            cVar.f29494w = it;
            cVar.f29497z = 1;
            Context context4 = context2;
            View view4 = view2;
            ViewGroup viewGroup4 = viewGroup2;
            p226w5.f fVar4 = fVar2;
            p216v5.a aVar3 = aVar2;
            n nVar4 = nVar2;
            c cVar2 = cVar;
            if (oVar.a(context4, view4, viewGroup4, fVar4, aVar3, nVar4, cVar2) == objE) {
                return objE;
            }
            context2 = context4;
            view2 = view4;
            viewGroup2 = viewGroup4;
            fVar2 = fVar4;
            aVar2 = aVar3;
            nVar2 = nVar4;
            cVar = cVar2;
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3 A[LOOP:0: B:24:0x00bd->B:29:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object p(Context context, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) {
        d dVar;
        Context context2;
        ViewGroup viewGroup2;
        p226w5.f fVar2;
        p216v5.a aVar2;
        n nVar2;
        e eVar2;
        n nVar3;
        View view;
        p216v5.a aVar3;
        p226w5.f fVar3;
        ViewGroup viewGroup3;
        Context context3;
        Iterator it;
        o oVar;
        d dVar2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i10 = dVar.f29507z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f29507z = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar3 = dVar;
        Object obj = dVar3.f29505x;
        Object objE = p139n8.b.e();
        int i11 = dVar3.f29507z;
        if (i11 == 0) {
            r.b(obj);
            dVar3.f29498q = this;
            dVar3.f29499r = context;
            dVar3.f29500s = viewGroup;
            dVar3.f29501t = fVar;
            dVar3.f29502u = aVar;
            dVar3.f29503v = nVar;
            dVar3.f29507z = 1;
            Object objR = r(context, viewGroup, fVar, aVar, nVar, dVar3);
            if (objR != objE) {
                context2 = context;
                viewGroup2 = viewGroup;
                fVar2 = fVar;
                aVar2 = aVar;
                nVar2 = nVar;
                obj = objR;
                eVar2 = this;
            }
            return objE;
        }
        if (i11 == 1) {
            nVar2 = (n) dVar3.f29503v;
            aVar2 = (p216v5.a) dVar3.f29502u;
            fVar2 = (p226w5.f) dVar3.f29501t;
            viewGroup2 = (ViewGroup) dVar3.f29500s;
            context2 = (Context) dVar3.f29499r;
            eVar2 = (e) dVar3.f29498q;
            r.b(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) dVar3.f29504w;
            View view2 = (View) dVar3.f29503v;
            n nVar4 = (n) dVar3.f29502u;
            p216v5.a aVar4 = (p216v5.a) dVar3.f29501t;
            p226w5.f fVar4 = (p226w5.f) dVar3.f29500s;
            ViewGroup viewGroup4 = (ViewGroup) dVar3.f29499r;
            context3 = (Context) dVar3.f29498q;
            r.b(obj);
            view = view2;
            nVar3 = nVar4;
            aVar3 = aVar4;
            fVar3 = fVar4;
            viewGroup3 = viewGroup4;
        }
        while (it.hasNext()) {
            oVar = (o) it.next();
            dVar3.f29498q = context3;
            dVar3.f29499r = viewGroup3;
            dVar3.f29500s = fVar3;
            dVar3.f29501t = aVar3;
            dVar3.f29502u = nVar3;
            dVar3.f29503v = view;
            dVar3.f29504w = it;
            dVar3.f29507z = 2;
            dVar2 = dVar3;
            if (oVar.b(context3, view, viewGroup3, fVar3, aVar3, nVar3, dVar2) == objE) {
                return objE;
            }
            dVar3 = dVar2;
        }
        return view;
        View view3 = (View) obj;
        if (view3 == null) {
            return view3;
        }
        nVar3 = nVar2;
        view = view3;
        aVar3 = aVar2;
        fVar3 = fVar2;
        viewGroup3 = viewGroup2;
        context3 = context2;
        it = eVar2.f29481f.iterator();
        while (it.hasNext()) {
            oVar = (o) it.next();
            dVar3.f29498q = context3;
            dVar3.f29499r = viewGroup3;
            dVar3.f29500s = fVar3;
            dVar3.f29501t = aVar3;
            dVar3.f29502u = nVar3;
            dVar3.f29503v = view;
            dVar3.f29504w = it;
            dVar3.f29507z = 2;
            dVar2 = dVar3;
            if (oVar.b(context3, view, viewGroup3, fVar3, aVar3, nVar3, dVar2) == objE) {
                return objE;
            }
            dVar3 = dVar2;
        }
        return view;
    }

    private final j q() {
        return (j) this.f29482g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object r(Context context, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) {
        C0722e c0722e;
        Object objB;
        p226w5.g gVar;
        if (eVar instanceof C0722e) {
            c0722e = (C0722e) eVar;
            int i10 = c0722e.f29510s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0722e.f29510s = i10 - Integer.MIN_VALUE;
            } else {
                c0722e = new C0722e(eVar);
            }
        } else {
            c0722e = new C0722e(eVar);
        }
        C0722e c0722e2 = c0722e;
        Object objB2 = c0722e2.f29508q;
        Object objE = p139n8.b.e();
        int i11 = c0722e2.f29510s;
        try {
            if (i11 == 0) {
                r.b(objB2);
                q.a aVar2 = q.f21862r;
                p226w5.g gVar2 = this.f29480e;
                if (gVar2 == null) {
                    n.r("configParser");
                    gVar = null;
                } else {
                    gVar = gVar2;
                }
                c0722e2.f29510s = 1;
                objB2 = gVar.b(context, null, viewGroup, fVar, aVar, nVar, c0722e2);
                if (objB2 == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objB2);
            }
            objB = q.b((View) objB2);
        } catch (Throwable th) {
            q.a aVar3 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            G5.c.e("CardInfoParser", "Inflate card view error.", thD);
        }
        if (q.f(objB)) {
            return null;
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(Context context, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) {
        if (2 != this.f29479d) {
            G5.c.d("CardInfoParser", "performParseSimpleCard method should only run for the simple style card.");
            return null;
        }
        e eVar2 = this.f29483h;
        if (eVar2 != null) {
            return eVar2.p(context, viewGroup, fVar, aVar, nVar, eVar);
        }
        return null;
    }

    @Override // p226w5.l
    public String a() {
        p226w5.g gVar = this.f29480e;
        if (gVar == null) {
            n.r("configParser");
            gVar = null;
        }
        String strC = gVar.c();
        return strC == null ? "" : strC;
    }

    @Override // p226w5.l
    public Context b() {
        return this.f29476a;
    }

    @Override // p226w5.l
    public int c() {
        return this.f29477b;
    }

    @Override // p226w5.l
    public String d() {
        p226w5.g gVar = this.f29480e;
        if (gVar == null) {
            n.r("configParser");
            gVar = null;
        }
        String strD = gVar.d();
        return strD == null ? "" : strD;
    }

    public final boolean m(String str) {
        return l(str, "update_period_minute");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object s(Context context, View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) {
        f fVar2;
        Object objB;
        View view2;
        p226w5.f fVar3;
        p216v5.a aVar2;
        n nVar2;
        Iterator it;
        Context context2;
        ViewGroup viewGroup2;
        if (eVar instanceof f) {
            fVar2 = (f) eVar;
            int i10 = fVar2.f29520z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f29520z = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(eVar);
            }
        } else {
            fVar2 = new f(eVar);
        }
        Object obj = fVar2.f29518x;
        Object objE = p139n8.b.e();
        int i11 = fVar2.f29520z;
        try {
            if (i11 == 0) {
                r.b(obj);
                q.a aVar3 = q.f21862r;
                view2 = view;
                fVar3 = fVar;
                aVar2 = aVar;
                nVar2 = nVar;
                it = this.f29481f.iterator();
                context2 = context;
                viewGroup2 = viewGroup;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it2 = (Iterator) fVar2.f29517w;
                n nVar3 = (n) fVar2.f29516v;
                aVar2 = (p216v5.a) fVar2.f29515u;
                p226w5.f fVar4 = (p226w5.f) fVar2.f29514t;
                ViewGroup viewGroup3 = (ViewGroup) fVar2.f29513s;
                View view3 = (View) fVar2.f29512r;
                Context context3 = (Context) fVar2.f29511q;
                r.b(obj);
                nVar2 = nVar3;
                fVar3 = fVar4;
                view2 = view3;
                viewGroup2 = viewGroup3;
                it = it2;
                context2 = context3;
            }
            while (it.hasNext()) {
                o oVar = (o) it.next();
                fVar2.f29511q = context2;
                fVar2.f29512r = view2;
                fVar2.f29513s = viewGroup2;
                fVar2.f29514t = fVar3;
                fVar2.f29515u = aVar2;
                fVar2.f29516v = nVar2;
                fVar2.f29517w = it;
                fVar2.f29520z = 1;
                Context context4 = context2;
                View view4 = view2;
                ViewGroup viewGroup4 = viewGroup2;
                p226w5.f fVar5 = fVar3;
                p216v5.a aVar4 = aVar2;
                n nVar4 = nVar2;
                f fVar6 = fVar2;
                if (oVar.b(context4, view4, viewGroup4, fVar5, aVar4, nVar4, fVar6) == objE) {
                    return objE;
                }
                context2 = context4;
                view2 = view4;
                viewGroup2 = viewGroup4;
                fVar3 = fVar5;
                aVar2 = aVar4;
                nVar2 = nVar4;
                fVar2 = fVar6;
            }
            objB = q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar5 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            G5.c.e("CardInfoParser", "Partly parse simple card error: ", thD);
        }
        return A.f21846a;
    }

    public final o t(Context context, ViewGroup hostView, p226w5.f fVar, p216v5.a handler, n infoCollector) {
        n.h(context, "context");
        n.h(hostView, "hostView");
        n.h(handler, "handler");
        n.h(infoCollector, "infoCollector");
        return (o) AbstractC0814h.b(null, new g(infoCollector, context, hostView, fVar, handler, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0150  */
    /* JADX WARN: Code duplicated, block: B:33:0x0186  */
    /* JADX WARN: Code duplicated, block: B:35:0x019c  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x0217  */
    /* JADX WARN: Code duplicated, block: B:46:0x0224  */
    /* JADX WARN: Code duplicated, block: B:50:0x0259  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0254, code lost:
    
        if (r1.o(r15, r4, r14, r13, r12, r23, r6) == r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x027e, code lost:
    
        if (r8.invoke(r0, r6) == r7) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(android.content.Context r18, android.view.ViewGroup r19, p226w5.f r20, p216v5.a r21, p226w5.n r22, p219v8.p r23, p129m8.e r24) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p226w5.e.u(android.content.Context, android.view.ViewGroup, w5.f, v5.a, w5.n, v8.p, m8.e):java.lang.Object");
    }

    public final Object v(String str, Context context, View view, View view2, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) {
        if (str != null) {
            Object objA = new v(str, q(), E8.i.S(str, "simple_card_info", false, 2, null) ? n(new JSONObject(str)) : null).a(context, view, view2, viewGroup, fVar, aVar, nVar, eVar);
            if (objA == p139n8.b.e()) {
                return objA;
            }
        }
        return A.f21846a;
    }

    public /* synthetic */ e(Context context, int i10, String str, boolean z9, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, i10, str, (i12 & 8) != 0 ? false : z9, (i12 & 16) != 0 ? 1 : i11);
    }
}
