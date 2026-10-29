package D5;

import F8.AbstractC0814h;
import F8.L;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f785x = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p226w5.j f786w;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final class b extends BaseAdapter {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Context f787q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f788r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f789s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ViewGroup f790t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final p226w5.f f791u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final p216v5.a f792v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final p226w5.n f793w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f794x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Set f795y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ i f796z;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f797q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ h f798r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f799s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ViewGroup f800t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, b bVar, ViewGroup viewGroup, p129m8.e eVar) {
                super(2, eVar);
                this.f798r = hVar;
                this.f799s = bVar;
                this.f800t = viewGroup;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f798r, this.f799s, this.f800t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f797q;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    return obj;
                }
                p079h8.r.b(obj);
                h hVar = this.f798r;
                Context context = this.f799s.f787q;
                ViewGroup viewGroup = this.f800t;
                p226w5.f fVar = this.f799s.f791u;
                p216v5.a aVar = this.f799s.f792v;
                p226w5.n nVar = this.f799s.f793w;
                this.f797q = 1;
                Object objG = hVar.g(context, viewGroup, fVar, aVar, nVar, this);
                return objG == objE ? objE : objG;
            }
        }

        public b(i iVar, Context contentContext, List itemInfo, int i10, ViewGroup rootParent, p226w5.f fVar, p216v5.a handler, p226w5.n animController, boolean z9) {
            kotlin.jvm.internal.n.h(contentContext, "contentContext");
            kotlin.jvm.internal.n.h(itemInfo, "itemInfo");
            kotlin.jvm.internal.n.h(rootParent, "rootParent");
            kotlin.jvm.internal.n.h(handler, "handler");
            kotlin.jvm.internal.n.h(animController, "animController");
            this.f796z = iVar;
            this.f787q = contentContext;
            this.f788r = itemInfo;
            this.f789s = i10;
            this.f790t = rootParent;
            this.f791u = fVar;
            this.f792v = handler;
            this.f793w = animController;
            this.f794x = z9;
            this.f795y = e();
        }

        private final Set e() {
            List list = this.f788r;
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((h) it.next()).c()));
            }
            return AbstractC1444s.w0(arrayList);
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h getItem(int i10) {
            if (this.f794x) {
                i10 %= this.f788r.size();
            }
            return (h) this.f788r.get(i10);
        }

        public final int g() {
            return this.f789s;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f794x ? SubsamplingScaleImageView.TILE_SIZE_AUTO : this.f788r.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            if (i10 < getCount()) {
                return AbstractC1444s.W(this.f795y, Integer.valueOf(getItem(i10).c()));
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup parent) {
            kotlin.jvm.internal.n.h(parent, "parent");
            return (View) AbstractC0814h.b(null, new a(getItem(i10), this, parent, null), 1, null);
        }

        public final void h(int i10, h simulatedItemView) {
            kotlin.jvm.internal.n.h(simulatedItemView, "simulatedItemView");
            this.f788r.set(i10, simulatedItemView);
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return false;
        }

        public final void i(boolean z9) {
            this.f794x = z9;
        }

        public final void j(List data) {
            kotlin.jvm.internal.n.h(data, "data");
            this.f788r = AbstractC1444s.u0(data);
            this.f795y = e();
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(JSONObject jSONObject, p226w5.j actionHandler) {
        super(jSONObject);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f786w = actionHandler;
    }

    private final int F(JSONObject jSONObject) {
        return ((Number) p206u5.c.c(jSONObject, H5.f.f2541a.a(), -1)).intValue();
    }

    private final h G(JSONObject jSONObject) {
        return new h(new JSONObject(jSONObject.getString("setItemChanged")), this.f786w);
    }

    private final void H(AbsListView absListView, int i10) {
        int i11 = 1073741823 % i10;
        absListView.setSelection(i11 != 0 ? 1073741823 - i11 : 1073741823);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    @Override // D5.w
    public Object B(View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        View viewFindViewById;
        List list;
        h hVar;
        if (-1 != k() && (viewFindViewById = view.findViewById(k())) != null) {
            JSONObject jSONObjectI = i();
            kotlin.jvm.internal.n.e(jSONObjectI);
            Iterator<String> itKeys = jSONObjectI.keys();
            kotlin.jvm.internal.n.g(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (kotlin.jvm.internal.n.d(next, H5.f.f2541a.b())) {
                    if (viewFindViewById instanceof ListView) {
                        int iF = F(i());
                        h hVarG = G(i());
                        ListAdapter adapter = ((ListView) viewFindViewById).getAdapter();
                        if ((adapter instanceof b) && iF != -1) {
                            ((b) adapter).h(iF, hVarG);
                        }
                    }
                } else if (kotlin.jvm.internal.n.d(next, "adapter_data")) {
                    JSONArray jSONArrayA = p206u5.c.a(i(), "adapter_data");
                    if (jSONArrayA == null) {
                        return A.f21846a;
                    }
                    int iIntValue = ((Number) p206u5.c.c(i(), "viewTypeCount", kotlin.coroutines.jvm.internal.b.c(0))).intValue();
                    if ((viewFindViewById instanceof AbsListView) && iIntValue > 0) {
                        AbsListView absListView = (AbsListView) viewFindViewById;
                        ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = B8.h.q(0, jSONArrayA.length()).iterator();
                        while (it.hasNext()) {
                            Object objC = p206u5.b.c(jSONArrayA, ((p089i8.L) it).a());
                            if (objC instanceof JSONObject) {
                                hVar = new h((JSONObject) objC, this.f786w);
                            } else {
                                hVar = objC instanceof String ? new h(new JSONObject((String) objC), this.f786w) : null;
                            }
                            arrayList.add(hVar);
                        }
                        List listU0 = AbstractC1444s.u0(AbstractC1444s.P(arrayList));
                        boolean z9 = ((Boolean) p206u5.c.c(i(), "isCyclePlay", kotlin.coroutines.jvm.internal.b.a(false))).booleanValue() && listU0.size() > 1;
                        if (listAdapter instanceof b) {
                            b bVar = (b) listAdapter;
                            if (iIntValue <= bVar.g()) {
                                bVar.i(z9);
                                bVar.j(listU0);
                                list = listU0;
                            } else {
                                list = listU0;
                                Context context = view.getContext();
                                kotlin.jvm.internal.n.g(context, "getContext(...)");
                                absListView.setAdapter((ListAdapter) new b(this, context, list, iIntValue, viewGroup, fVar, aVar, nVar, z9));
                            }
                        } else {
                            list = listU0;
                            Context context2 = view.getContext();
                            kotlin.jvm.internal.n.g(context2, "getContext(...)");
                            absListView.setAdapter((ListAdapter) new b(this, context2, list, iIntValue, viewGroup, fVar, aVar, nVar, z9));
                        }
                        if (z9) {
                            H(absListView, list.size());
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return A.f21846a;
    }
}
