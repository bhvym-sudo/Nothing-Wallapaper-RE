package D5;

import android.app.PendingIntent;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.nothing.cardwidget.battery.BatteryConfig;
import java.util.ArrayList;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f730y = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p226w5.j f731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p216v5.a f732x;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f733q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f734r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f735s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f737u;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f735s = obj;
            this.f737u |= Integer.MIN_VALUE;
            return c.this.L(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JSONObject jSONObject, p226w5.j actionHandler) {
        super(jSONObject);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f731w = actionHandler;
    }

    private final PendingIntent H(View view, String str) {
        Intent intent = new Intent();
        intent.setAction("com.nothing.action.BATTERY_DETAIL");
        intent.setPackage(BatteryConfig.DEFAULT_PACKAGE_NAME);
        intent.putExtra("device_address", str);
        Object tag = view.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        intent.putExtra("widget_id", num != null ? num.intValue() : -1);
        PendingIntent activity = PendingIntent.getActivity(view.getContext(), 1, intent, 201326592);
        kotlin.jvm.internal.n.g(activity, "getActivity(...)");
        return activity;
    }

    private final Object I(View view, p129m8.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Consumer consumer = new Consumer() { // from class: D5.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.J(this.f729a, (p079h8.o) obj);
            }
        };
        arrayList.add(Consumer.class);
        arrayList2.add(consumer);
        Object objM = m(arrayList, arrayList2, "setClickEventConsumer", view, eVar);
        return objM == p139n8.b.e() ? objM : A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(c this$0, p079h8.o it) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(it, "it");
        this$0.K((View) it.c(), (String) it.d());
    }

    private final void K(View view, String str) {
        PendingIntent pendingIntentH = H(view, str);
        p216v5.a aVar = this.f732x;
        if (aVar != null) {
            aVar.onCardInteraction(view, pendingIntentH, p216v5.b.f28528a.a(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b6, code lost:
    
        if (r1.I(r2, r5) == r6) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(android.view.View r33, p129m8.e r34) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.c.L(android.view.View, m8.e):java.lang.Object");
    }

    @Override // D5.w
    public Object B(View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        this.f732x = aVar;
        Object objB = super.B(view, viewGroup, fVar, aVar, nVar, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    @Override // D5.x, D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        if (kotlin.jvm.internal.n.d(str, "setBatteryInfo")) {
            Object objL = L(view, eVar);
            return objL == p139n8.b.e() ? objL : A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }
}
