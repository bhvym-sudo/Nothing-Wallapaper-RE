package p226w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p206u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f29619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29620b;

    static final class a extends d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        /* synthetic */ Object f29621A;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f29623C;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29624q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29625r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29626s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29627t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29628u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29629v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29630w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f29631x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f29632y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f29633z;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29621A = obj;
            this.f29623C |= Integer.MIN_VALUE;
            return v.this.a(null, null, null, null, null, null, null, this);
        }
    }

    public v(String str, j actionHandler, e eVar) {
        n.h(actionHandler, "actionHandler");
        this.f29619a = eVar;
        ArrayList arrayList = new ArrayList();
        this.f29620b = arrayList;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            arrayList.add(new x(c.a(jSONObject, "view_info"), actionHandler));
            arrayList.add(new p226w5.a(c.a(jSONObject, "action_info"), actionHandler));
            arrayList.add(new c(c.a(jSONObject, "anim_info"), actionHandler));
            arrayList.add(new h(c.a(jSONObject, "custom_info"), actionHandler));
            arrayList.add(new i(c.b(jSONObject, "extra_info")));
            arrayList.add(new w(c.b(jSONObject, "schedule_info"), actionHandler));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(Context context, View view, View view2, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        a aVar2;
        int iD;
        ViewGroup viewGroup2;
        f fVar2;
        p216v5.a aVar3;
        n nVar2;
        Iterator it;
        Context context2;
        View view3;
        View view4;
        n nVar3;
        int i10;
        n nVar4;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i11 = aVar2.f29623C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f29623C = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object obj = aVar2.f29621A;
        Object objE = b.e();
        int i12 = aVar2.f29623C;
        if (i12 != 0) {
            if (i12 == 1) {
                int i13 = aVar2.f29633z;
                Iterator it2 = (Iterator) aVar2.f29632y;
                n nVar5 = (n) aVar2.f29631x;
                p216v5.a aVar4 = (p216v5.a) aVar2.f29630w;
                fVar2 = (f) aVar2.f29629v;
                ViewGroup viewGroup3 = (ViewGroup) aVar2.f29628u;
                View view5 = (View) aVar2.f29627t;
                View view6 = (View) aVar2.f29626s;
                Context context3 = (Context) aVar2.f29625r;
                v vVar = (v) aVar2.f29624q;
                r.b(obj);
                context2 = context3;
                it = it2;
                view3 = view6;
                nVar2 = nVar5;
                view4 = view5;
                aVar3 = aVar4;
                viewGroup2 = viewGroup3;
                iD = i13;
                this = vVar;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = aVar2.f29633z;
                nVar4 = (n) aVar2.f29624q;
                r.b(obj);
            }
            iD = i10;
            nVar3 = nVar4;
            nVar3.a(iD);
            return A.f21846a;
        }
        r.b(obj);
        iD = nVar.d();
        nVar.a(1);
        viewGroup2 = viewGroup;
        fVar2 = fVar;
        aVar3 = aVar;
        nVar2 = nVar;
        it = this.f29620b.iterator();
        context2 = context;
        view3 = view;
        view4 = view2;
        while (it.hasNext()) {
            o oVar = (o) it.next();
            aVar2.f29624q = this;
            aVar2.f29625r = context2;
            aVar2.f29626s = view3;
            aVar2.f29627t = view4;
            aVar2.f29628u = viewGroup2;
            aVar2.f29629v = fVar2;
            aVar2.f29630w = aVar3;
            aVar2.f29631x = nVar2;
            aVar2.f29632y = it;
            aVar2.f29633z = iD;
            aVar2.f29623C = 1;
            Context context4 = context2;
            View view7 = view3;
            ViewGroup viewGroup4 = viewGroup2;
            f fVar3 = fVar2;
            p216v5.a aVar5 = aVar3;
            n nVar6 = nVar2;
            a aVar6 = aVar2;
            if (oVar.b(context4, view7, viewGroup4, fVar3, aVar5, nVar6, aVar6) == objE) {
                return objE;
            }
            nVar2 = nVar6;
            view3 = view7;
            fVar2 = fVar3;
            context2 = context4;
            viewGroup2 = viewGroup4;
            aVar3 = aVar5;
            aVar2 = aVar6;
        }
        n nVar7 = nVar2;
        a aVar7 = aVar2;
        f fVar4 = fVar2;
        p216v5.a aVar8 = aVar3;
        ViewGroup viewGroup5 = viewGroup2;
        Context context5 = context2;
        nVar7.a(2);
        e eVar2 = this.f29619a;
        if (eVar2 != null) {
            aVar7.f29624q = nVar7;
            aVar7.f29625r = null;
            aVar7.f29626s = null;
            aVar7.f29627t = null;
            aVar7.f29628u = null;
            aVar7.f29629v = null;
            aVar7.f29630w = null;
            aVar7.f29631x = null;
            aVar7.f29632y = null;
            aVar7.f29633z = iD;
            aVar7.f29623C = 2;
            if (eVar2.s(context5, view4, viewGroup5, fVar4, aVar8, nVar7, aVar7) != objE) {
                i10 = iD;
                nVar4 = nVar7;
                iD = i10;
                nVar3 = nVar4;
            }
            return objE;
        }
        nVar3 = nVar7;
        nVar3.a(iD);
        return A.f21846a;
    }
}
