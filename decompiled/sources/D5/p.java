package D5;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f831x = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p226w5.j f832w;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f833q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f834r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f835s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f836t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f837u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f838v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f840x;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f838v = obj;
            this.f840x |= Integer.MIN_VALUE;
            return p.this.J(null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        int f841A;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f842q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f843r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f844s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f845t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f846u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f847v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f848w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f849x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f850y;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f850y = obj;
            this.f841A |= Integer.MIN_VALUE;
            return p.this.B(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(JSONObject jSONObject, p226w5.j actionHandler) {
        super(jSONObject);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f832w = actionHandler;
    }

    private final int G(JSONObject jSONObject) {
        return ((Number) p206u5.c.c(jSONObject, H5.h.f2543a.a(), 0)).intValue();
    }

    private final h H(JSONObject jSONObject) {
        return new h(new JSONObject(jSONObject.getString("setItemChanged")), this.f832w);
    }

    private final void I(RecyclerView recyclerView, int i10) {
        int i11 = 1073741823 % i10;
        recyclerView.scrollToPosition(i11 != 0 ? 1073741823 - i11 : 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:30:0x00f2->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:1: B:21:0x00ab->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(View view, Object obj, p129m8.e eVar) throws JSONException {
        b bVar;
        LinearLayoutManager gridLayoutManager;
        p pVar;
        Iterator<String> it;
        b bVar2;
        JSONObject jSONObject;
        View view2;
        p pVar2;
        Iterator<String> it2;
        b bVar3;
        JSONObject jSONObject2;
        String next;
        Object obj2;
        String next2;
        Object obj3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f840x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f840x = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj4 = bVar.f838v;
        Object objE = p139n8.b.e();
        int i11 = bVar.f840x;
        if (i11 == 0) {
            p079h8.r.b(obj4);
            JSONObject jSONObjectG = p206u5.a.g(obj);
            if (jSONObjectG != null) {
                int iIntValue = ((Number) p206u5.c.c(jSONObjectG, H5.g.f2542a.a(), kotlin.coroutines.jvm.internal.b.c(-1))).intValue();
                I5.b.a aVar = I5.b.f3078a;
                if (iIntValue == aVar.e()) {
                    gridLayoutManager = new LinearLayoutManager(view.getContext());
                    Iterator<String> itKeys = jSONObjectG.keys();
                    kotlin.jvm.internal.n.g(itKeys, "keys(...)");
                    pVar2 = this;
                    it2 = itKeys;
                    bVar3 = bVar;
                    jSONObject2 = jSONObjectG;
                    view2 = view;
                    while (it2.hasNext()) {
                        next = it2.next();
                        obj2 = jSONObject2.get(next);
                        kotlin.jvm.internal.n.e(next);
                        kotlin.jvm.internal.n.e(obj2);
                        bVar3.f833q = pVar2;
                        bVar3.f834r = view2;
                        bVar3.f835s = jSONObject2;
                        bVar3.f836t = gridLayoutManager;
                        bVar3.f837u = it2;
                        bVar3.f840x = 1;
                        if (pVar2.l(gridLayoutManager, next, obj2, bVar3) == objE) {
                            return objE;
                        }
                    }
                    view = view2;
                } else if (iIntValue == aVar.d()) {
                    gridLayoutManager = new GridLayoutManager(view.getContext(), 1);
                    Iterator<String> itKeys2 = jSONObjectG.keys();
                    kotlin.jvm.internal.n.g(itKeys2, "keys(...)");
                    pVar = this;
                    it = itKeys2;
                    bVar2 = bVar;
                    jSONObject = jSONObjectG;
                    view2 = view;
                    while (it.hasNext()) {
                        next2 = it.next();
                        obj3 = jSONObject.get(next2);
                        kotlin.jvm.internal.n.e(next2);
                        kotlin.jvm.internal.n.e(obj3);
                        bVar2.f833q = pVar;
                        bVar2.f834r = view2;
                        bVar2.f835s = jSONObject;
                        bVar2.f836t = gridLayoutManager;
                        bVar2.f837u = it;
                        bVar2.f840x = 2;
                        if (pVar.l(gridLayoutManager, next2, obj3, bVar2) == objE) {
                            return objE;
                        }
                    }
                    view = view2;
                } else {
                    gridLayoutManager = null;
                }
                if (view instanceof RecyclerView) {
                    ((RecyclerView) view).setLayoutManager(gridLayoutManager);
                }
            }
        } else if (i11 == 1) {
            it2 = (Iterator) bVar.f837u;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) bVar.f836t;
            JSONObject jSONObject3 = (JSONObject) bVar.f835s;
            View view3 = (View) bVar.f834r;
            p pVar3 = (p) bVar.f833q;
            p079h8.r.b(obj4);
            b bVar4 = bVar;
            jSONObject2 = jSONObject3;
            view2 = view3;
            bVar3 = bVar4;
            gridLayoutManager = linearLayoutManager;
            pVar2 = pVar3;
            while (it2.hasNext()) {
                next = it2.next();
                obj2 = jSONObject2.get(next);
                kotlin.jvm.internal.n.e(next);
                kotlin.jvm.internal.n.e(obj2);
                bVar3.f833q = pVar2;
                bVar3.f834r = view2;
                bVar3.f835s = jSONObject2;
                bVar3.f836t = gridLayoutManager;
                bVar3.f837u = it2;
                bVar3.f840x = 1;
                if (pVar2.l(gridLayoutManager, next, obj2, bVar3) == objE) {
                    return objE;
                }
            }
            view = view2;
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).setLayoutManager(gridLayoutManager);
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) bVar.f837u;
            GridLayoutManager gridLayoutManager2 = (GridLayoutManager) bVar.f836t;
            JSONObject jSONObject4 = (JSONObject) bVar.f835s;
            View view4 = (View) bVar.f834r;
            p pVar4 = (p) bVar.f833q;
            p079h8.r.b(obj4);
            b bVar5 = bVar;
            jSONObject = jSONObject4;
            view2 = view4;
            bVar2 = bVar5;
            gridLayoutManager = gridLayoutManager2;
            pVar = pVar4;
            while (it.hasNext()) {
                next2 = it.next();
                obj3 = jSONObject.get(next2);
                kotlin.jvm.internal.n.e(next2);
                kotlin.jvm.internal.n.e(obj3);
                bVar2.f833q = pVar;
                bVar2.f834r = view2;
                bVar2.f835s = jSONObject;
                bVar2.f836t = gridLayoutManager;
                bVar2.f837u = it;
                bVar2.f840x = 2;
                if (pVar.l(gridLayoutManager, next2, obj3, bVar2) == objE) {
                    return objE;
                }
            }
            view = view2;
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).setLayoutManager(gridLayoutManager);
            }
        }
        return A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0161  */
    /* JADX WARN: Code duplicated, block: B:47:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x019d -> B:63:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01cb -> B:62:0x01d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // D5.w
    public java.lang.Object B(android.view.View r20, android.view.ViewGroup r21, p226w5.f r22, p216v5.a r23, p226w5.n r24, p129m8.e r25) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.p.B(android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
    }

    @Override // D5.x, D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) throws JSONException {
        if (kotlin.jvm.internal.n.d(str, "setLayoutManager")) {
            Object objJ = J(view, obj, eVar);
            return objJ == p139n8.b.e() ? objJ : A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }
}
