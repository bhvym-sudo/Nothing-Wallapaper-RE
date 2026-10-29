package p256z5;

import B5.e;
import H5.d;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.A;
import p206u5.c;
import p226w5.f;
import p226w5.j;
import p226w5.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f30721u = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f30722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f30723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f30724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f30725t;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(JSONObject jSONObject, j actionResponsive) {
        n.h(actionResponsive, "actionResponsive");
        this.f30722q = jSONObject;
        this.f30723r = actionResponsive;
        this.f30724s = jSONObject != null ? ((Number) c.c(jSONObject, d.f2539a.c(), -1)).intValue() : -1;
        this.f30725t = jSONObject != null ? c.e(jSONObject, "call_method") : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JSONObject jSONObject, b this$0, View target, String method, p216v5.a handler, JSONObject jSONObject2) {
        n.h(this$0, "this$0");
        n.h(target, "$target");
        n.h(method, "$method");
        n.h(handler, "$handler");
        if (jSONObject2 != null) {
            jSONObject = jSONObject2;
        }
        this$0.f30723r.b(target, method, new e(jSONObject), handler);
    }

    public Object b(List list, List list2, String str, Object obj, p129m8.e eVar) {
        return p.a.b(this, list, list2, str, obj, eVar);
    }

    public Object c(View view, ViewGroup viewGroup, f fVar, final p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        final View viewFindViewById;
        b bVar;
        JSONArray jSONArrayA;
        Class clsA;
        int i10 = this.f30724s;
        if (i10 != -1 && this.f30725t != null && (viewFindViewById = view.findViewById(i10)) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONObject jSONObject = this.f30722q;
            final String strE = jSONObject != null ? c.e(jSONObject, "callback_method") : null;
            if (strE != null) {
                JSONObject jSONObject2 = this.f30722q;
                final JSONObject jSONObjectB = jSONObject2 != null ? c.b(jSONObject2, d.f2539a.a()) : null;
                Consumer consumer = new Consumer() { // from class: z5.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        b.d(jSONObjectB, this, viewFindViewById, strE, aVar, (JSONObject) obj);
                    }
                };
                bVar = this;
                arrayList.add(Consumer.class);
                kotlin.coroutines.jvm.internal.b.a(arrayList2.add(consumer));
            } else {
                bVar = this;
            }
            JSONObject jSONObject3 = bVar.f30722q;
            if (jSONObject3 != null && (jSONArrayA = c.a(jSONObject3, d.f2539a.b())) != null) {
                int length = jSONArrayA.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObjectA = p206u5.b.a(jSONArrayA, i11);
                    if (jSONObjectA != null && (clsA = E5.c.a(jSONObjectA)) != null) {
                        arrayList.add(clsA);
                        kotlin.coroutines.jvm.internal.b.a(arrayList2.add(E5.c.b(jSONObjectA)));
                    }
                }
            }
            Object objB = bVar.b(arrayList, arrayList2, bVar.f30725t, viewFindViewById, eVar);
            if (objB == p139n8.b.e()) {
                return objB;
            }
        }
        return A.f21846a;
    }
}
