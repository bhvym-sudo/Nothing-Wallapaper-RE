package D5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.A;
import p089i8.AbstractC1444s;
import p089i8.L;

/* JADX INFO: loaded from: classes.dex */
public final class y extends x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f952x = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p226w5.j f953w;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        int f954A;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f955q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f956r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f957s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f958t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f959u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f960v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f961w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f962x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f963y;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f963y = obj;
            this.f954A |= Integer.MIN_VALUE;
            return y.this.V(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(JSONObject jSONObject, p226w5.j actionHandler) {
        super(jSONObject);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f953w = actionHandler;
    }

    private final List G(JSONObject jSONObject, String str) {
        h hVar;
        JSONArray jSONArrayA = p206u5.c.a(jSONObject, str);
        if (jSONArrayA != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = B8.h.q(0, jSONArrayA.length()).iterator();
            while (it.hasNext()) {
                Object objC = p206u5.b.c(jSONArrayA, ((L) it).a());
                if (objC instanceof JSONObject) {
                    hVar = new h((JSONObject) objC, this.f953w);
                } else {
                    hVar = objC instanceof String ? new h(new JSONObject((String) objC), this.f953w) : null;
                }
                arrayList.add(hVar);
            }
            List listP = AbstractC1444s.P(arrayList);
            if (listP != null) {
                return listP;
            }
        }
        return AbstractC1444s.l();
    }

    private final int H(JSONObject jSONObject) {
        return ((Number) p206u5.c.c(jSONObject, H5.k.f2546a.c(), 0)).intValue();
    }

    private final h I(JSONObject jSONObject) {
        return new h(new JSONObject(jSONObject.getString("setItemChanged")), this.f953w);
    }

    private final int J(int i10, int i11) {
        if (i11 == 0 || i11 == 1) {
            return i10;
        }
        int i12 = 1073741823 % i11;
        return (i12 != 0 ? 1073741823 - i12 : 1073741823) + i10;
    }

    private final boolean K(JSONObject jSONObject) {
        return ((Boolean) p206u5.c.c(jSONObject, "smoothScroll", Boolean.FALSE)).booleanValue();
    }

    private final int L(JSONObject jSONObject) {
        return ((Number) p206u5.c.c(jSONObject, "setCurrentItem", 0)).intValue();
    }

    private final Object M(View view, String str, View view2, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        ViewPager2 viewPager2;
        JSONObject jSONObjectI = i();
        kotlin.jvm.internal.n.e(jSONObjectI);
        JSONArray jSONArrayA = p206u5.c.a(jSONObjectI, str);
        if (!(view instanceof ViewPager2) || jSONArrayA == null) {
            return A.f21846a;
        }
        List listG = G(i(), str);
        boolean zS = S(i(), listG);
        boolean z9 = L(i()) > 0;
        Context context = view2.getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        r rVar = new r(context, AbstractC1444s.u0(listG), viewGroup, fVar, aVar, nVar, zS, (ViewGroup) view);
        ViewPager2 viewPager3 = (ViewPager2) view;
        viewPager3.setAdapter(rVar);
        if (!zS || z9) {
            viewPager2 = viewPager3;
        } else {
            U(this, viewPager3, listG.size(), false, 0, 8, null);
            viewPager2 = viewPager3;
        }
        Object objS = rVar.s(viewPager2.getCurrentItem(), eVar);
        return objS == p139n8.b.e() ? objS : A.f21846a;
    }

    private final void N(ViewPager2 viewPager2, JSONObject jSONObject) {
        H5.k.a aVar = H5.k.f2546a;
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString(aVar.b()));
        int iIntValue = ((Number) p206u5.c.c(jSONObject2, aVar.d(), -1)).intValue();
        if (iIntValue >= 0) {
            JSONArray jSONArray = new JSONArray(jSONObject2.getString(aVar.a()));
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            r rVar = adapter instanceof r ? (r) adapter : null;
            if (rVar == null) {
                return;
            }
            int iR = rVar.r();
            if (rVar.q()) {
                iIntValue = J(iIntValue, iR);
            }
            Iterator it = B8.h.q(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = p206u5.b.a(jSONArray, ((L) it).a());
                if (jSONObjectA != null) {
                    rVar.x(iIntValue, new h(jSONObjectA, this.f953w));
                    iIntValue++;
                }
            }
        }
    }

    private final void O(ViewPager2 viewPager2, JSONObject jSONObject) {
        int iL = L(jSONObject);
        boolean zK = K(jSONObject);
        List listG = G(jSONObject, "adapter_data");
        if (S(jSONObject, listG)) {
            T(viewPager2, listG.size(), zK, iL);
        } else {
            viewPager2.setCurrentItem(iL, zK);
        }
    }

    private final void P(ViewPager2 viewPager2, JSONObject jSONObject) {
        int iL = L(jSONObject);
        boolean zK = K(jSONObject);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        r rVar = adapter instanceof r ? (r) adapter : null;
        if (rVar == null) {
            return;
        }
        boolean z9 = p206u5.c.d(jSONObject, "isCyclePlay") != null;
        int iR = rVar.r();
        if (!z9 ? !(!rVar.q() || iR <= 1) : !(!((Boolean) p206u5.c.c(jSONObject, "isCyclePlay", Boolean.FALSE)).booleanValue() || iR <= 1)) {
            viewPager2.setCurrentItem(iL, zK);
        } else {
            T(viewPager2, iR, zK, iL);
        }
    }

    private final void Q(ViewPager2 viewPager2, JSONObject jSONObject) {
        int iH = H(jSONObject);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        r rVar = adapter instanceof r ? (r) adapter : null;
        if (rVar == null) {
            return;
        }
        int iR = rVar.r();
        if (rVar.q()) {
            iH = J(iH, iR);
        }
        h hVarI = I(jSONObject);
        RecyclerView.Adapter adapter2 = viewPager2.getAdapter();
        r rVar2 = adapter2 instanceof r ? (r) adapter2 : null;
        if (rVar2 != null) {
            rVar2.x(iH, hVarI);
        }
    }

    private final boolean R(JSONObject jSONObject) {
        return (p206u5.c.d(jSONObject, "setCurrentItem") == null && p206u5.c.d(jSONObject, H5.k.f2546a.b()) == null) ? false : true;
    }

    private final boolean S(JSONObject jSONObject, List list) {
        return ((Boolean) p206u5.c.c(jSONObject, "isCyclePlay", Boolean.FALSE)).booleanValue() && list.size() > 1;
    }

    private final void T(ViewPager2 viewPager2, int i10, boolean z9, int i11) {
        if (i10 == 0 || i10 == 1) {
            return;
        }
        viewPager2.setCurrentItem(J(i11, i10), z9);
    }

    static /* synthetic */ void U(y yVar, ViewPager2 viewPager2, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        yVar.T(viewPager2, i10, z9, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object V(android.view.View r20, android.view.View r21, android.view.ViewGroup r22, p226w5.f r23, p216v5.a r24, p226w5.n r25, p129m8.e r26) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.y.V(android.view.View, android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
    }

    @Override // D5.w
    public Object B(View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        View viewFindViewById;
        Object objV;
        return (-1 == k() || (viewFindViewById = view.findViewById(k())) == null || (objV = V(viewFindViewById, view, viewGroup, fVar, aVar, nVar, eVar)) != p139n8.b.e()) ? A.f21846a : objV;
    }
}
