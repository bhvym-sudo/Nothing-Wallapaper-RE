package p226w5;

import B8.h;
import D5.f;
import D5.g;
import D5.i;
import D5.l;
import D5.o;
import D5.p;
import D5.s;
import D5.t;
import D5.u;
import D5.v;
import D5.w;
import D5.y;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.r;
import p089i8.L;
import p129m8.e;
import p206u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class x implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29639c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f29640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f29641b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        int f29642A;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29643q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29644r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29645s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29646t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29647u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29648v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29649w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f29650x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f29651y;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29651y = obj;
            this.f29642A |= Integer.MIN_VALUE;
            return x.this.b(null, null, null, null, null, null, this);
        }
    }

    public x(JSONArray jSONArray, j actionHandler) {
        n.h(actionHandler, "actionHandler");
        this.f29640a = jSONArray;
        this.f29641b = actionHandler;
    }

    @Override // p226w5.o
    public Object a(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        return o.a.a(this, context, view, viewGroup, fVar, aVar, nVar, eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x020e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:73:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p226w5.o
    public Object b(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        b bVar;
        f fVar2;
        p216v5.a aVar2;
        n nVar2;
        JSONArray jSONArray;
        x xVar;
        View view2;
        Iterator it;
        ViewGroup viewGroup2;
        w wVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f29642A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f29642A = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f29651y;
        Object objE = p139n8.b.e();
        int i11 = bVar.f29642A;
        if (i11 == 0) {
            r.b(obj);
            JSONArray jSONArray2 = this.f29640a;
            if (jSONArray2 != null && view != null) {
                Iterator it2 = h.q(0, jSONArray2.length()).iterator();
                fVar2 = fVar;
                aVar2 = aVar;
                nVar2 = nVar;
                jSONArray = jSONArray2;
                xVar = this;
                view2 = view;
                it = it2;
                viewGroup2 = viewGroup;
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) bVar.f29650x;
        JSONArray jSONArray3 = (JSONArray) bVar.f29649w;
        n nVar3 = (n) bVar.f29648v;
        aVar2 = (p216v5.a) bVar.f29647u;
        f fVar3 = (f) bVar.f29646t;
        ViewGroup viewGroup3 = (ViewGroup) bVar.f29645s;
        View view3 = (View) bVar.f29644r;
        x xVar2 = (x) bVar.f29643q;
        r.b(obj);
        view2 = view3;
        jSONArray = jSONArray3;
        viewGroup2 = viewGroup3;
        nVar2 = nVar3;
        fVar2 = fVar3;
        xVar = xVar2;
        while (it.hasNext()) {
            Object objC = p206u5.b.c(jSONArray, ((L) it).a());
            JSONObject jSONObjectG = objC != null ? p206u5.a.g(objC) : null;
            String strE = jSONObjectG != null ? c.e(jSONObjectG, "view_type") : null;
            if (strE != null) {
                switch (strE) {
                    case "text_clock":
                        wVar = new v(jSONObjectG);
                        break;
                    case "sticker_view":
                        wVar = new u(jSONObjectG);
                        break;
                    case "viewPager":
                        wVar = new y(jSONObjectG, xVar.f29641b);
                        break;
                    case "view_group":
                        wVar = new D5.x(jSONObjectG);
                        break;
                    case "image_view":
                        wVar = new g(jSONObjectG, xVar.f29641b, nVar2);
                        break;
                    case "remote_service_view":
                        wVar = new s(jSONObjectG);
                        break;
                    case "flash_text":
                    case "nt_text_clock":
                    case "aod_text_clock":
                    case "textview":
                        wVar = new v(jSONObjectG);
                        break;
                    case "Chronometer":
                        wVar = new D5.d(jSONObjectG);
                        break;
                    case "recyclerview":
                        wVar = new p(jSONObjectG, xVar.f29641b);
                        break;
                    case "analog_clock":
                        wVar = new D5.a(jSONObjectG);
                        break;
                    case "view":
                        wVar = new w(jSONObjectG);
                        break;
                    case "media_player_container_view":
                        wVar = new D5.n(jSONObjectG, xVar.f29641b);
                        break;
                    case "battery_container_view":
                        wVar = new D5.c(jSONObjectG, xVar.f29641b);
                        break;
                    case "lottie_animation_view":
                        wVar = new l(jSONObjectG, xVar.f29641b, nVar2);
                        break;
                    case "aod_analog_clock":
                        wVar = new D5.a(jSONObjectG);
                        break;
                    case "progress_bar":
                        wVar = new o(jSONObjectG);
                        break;
                    case "listView":
                        wVar = new i(jSONObjectG, xVar.f29641b);
                        break;
                    case "constraint_layout":
                        wVar = new f(jSONObjectG);
                        break;
                    case "compound_button":
                        wVar = new D5.e(jSONObjectG);
                        break;
                    case "round_corners_framelayout":
                        wVar = new t(jSONObjectG);
                        break;
                    default:
                        wVar = new w(jSONObjectG);
                        break;
                }
            } else {
                wVar = new w(jSONObjectG);
            }
            bVar.f29643q = xVar;
            bVar.f29644r = view2;
            bVar.f29645s = viewGroup2;
            bVar.f29646t = fVar2;
            bVar.f29647u = aVar2;
            bVar.f29648v = nVar2;
            bVar.f29649w = jSONArray;
            bVar.f29650x = it;
            bVar.f29642A = 1;
            View view4 = view2;
            ViewGroup viewGroup4 = viewGroup2;
            f fVar4 = fVar2;
            p216v5.a aVar3 = aVar2;
            n nVar4 = nVar2;
            b bVar2 = bVar;
            if (wVar.B(view4, viewGroup4, fVar4, aVar3, nVar4, bVar2) == objE) {
                return objE;
            }
            view2 = view4;
            fVar2 = fVar4;
            nVar2 = nVar4;
            viewGroup2 = viewGroup4;
            aVar2 = aVar3;
            bVar = bVar2;
        }
        return null;
    }
}
