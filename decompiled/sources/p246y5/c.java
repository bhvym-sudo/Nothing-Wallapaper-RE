package p246y5;

import B8.h;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.nothing.cardwidget.BlinkChronometer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p089i8.L;
import p226w5.j;
import p226w5.k;
import p226w5.n;
import p226w5.p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p, k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f30311C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f30312A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final C0749c f30313B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f30314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f30315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AnimatorSet f30316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f30317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Integer f30318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Boolean f30319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f30320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map f30321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private n f30322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f30323z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONArray f30324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f30325b;

        public b(c cVar, JSONArray buildJson) {
            kotlin.jvm.internal.n.h(buildJson, "buildJson");
            this.f30325b = cVar;
            this.f30324a = buildJson;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void a() throws JSONException {
            String next;
            JSONArray jSONArray = this.f30324a;
            c cVar = this.f30325b;
            Iterator it = h.q(0, jSONArray.length()).iterator();
            AnimatorSet.Builder builderPlay = null;
            while (it.hasNext()) {
                JSONObject jSONObjectA = p206u5.b.a(jSONArray, ((L) it).a());
                if (jSONObjectA != null && (next = jSONObjectA.keys().next()) != null) {
                    switch (next.hashCode()) {
                        case -1392885889:
                            if (next.equals("before") && builderPlay != null) {
                                builderPlay.before((Animator) cVar.f30321x.get(Integer.valueOf(jSONObjectA.getInt(next))));
                            }
                            break;
                        case 3386882:
                            if (next.equals("node")) {
                                builderPlay = cVar.k().play((Animator) cVar.f30321x.get(Integer.valueOf(jSONObjectA.getInt(next))));
                            }
                            break;
                        case 3649734:
                            if (next.equals("with") && builderPlay != null) {
                                builderPlay.with((Animator) cVar.f30321x.get(Integer.valueOf(jSONObjectA.getInt(next))));
                            }
                            break;
                        case 92734940:
                            if (next.equals("after") && builderPlay != null) {
                                builderPlay.after((Animator) cVar.f30321x.get(Integer.valueOf(jSONObjectA.getInt(next))));
                            }
                            break;
                        case 555175264:
                            if (next.equals("after_delay")) {
                                Object obj = jSONObjectA.get(next);
                                kotlin.jvm.internal.n.g(obj, "get(...)");
                                long jH = p206u5.a.h(obj);
                                if (builderPlay != null) {
                                    builderPlay.after(jH);
                                }
                            }
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y5.c$c, reason: collision with other inner class name */
    public static final class C0749c implements Animator.AnimatorListener {
        C0749c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            c.this.j().h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            c.this.j().e();
        }
    }

    static final class d extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30327q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n f30328r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f30329s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, c cVar, p129m8.e eVar) {
            super(1, eVar);
            this.f30328r = nVar;
            this.f30329s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return new d(this.f30328r, this.f30329s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30327q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f30328r.c(this.f30329s.f30317t, this.f30329s);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((d) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class e extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30330q;

        e(p129m8.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return c.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30330q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            c cVar = c.this;
            cVar.h(cVar.f30320w);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((e) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class f extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30332q;

        f(p129m8.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return c.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30332q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            c.this.k().start();
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((f) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public c(JSONObject jSONObject, j actionHandler) {
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f30314q = jSONObject;
        this.f30315r = actionHandler;
        this.f30316s = new AnimatorSet();
        this.f30317t = jSONObject != null ? ((Number) p206u5.c.c(jSONObject, "id", -1)).intValue() : -1;
        this.f30318u = jSONObject != null ? Integer.valueOf(jSONObject.optInt("startStrategy")) : null;
        this.f30319v = jSONObject != null ? (Boolean) p206u5.c.c(jSONObject, "playOnce", Boolean.FALSE) : null;
        this.f30320w = jSONObject != null ? p206u5.c.e(jSONObject, "setControl") : null;
        this.f30321x = new LinkedHashMap();
        boolean z9 = false;
        if (jSONObject != null && jSONObject.optBoolean("setAnimationCallback", false)) {
            z9 = true;
        }
        this.f30323z = z9;
        this.f30313B = new C0749c();
    }

    private final void g(View view) throws JSONException {
        n(view);
        p();
        o();
        l();
        m();
        registerAnimListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h(String str) {
        n nVar = this.f30322y;
        k kVarB = nVar != null ? nVar.b(this.f30317t) : null;
        c cVar = kVarB instanceof c ? (c) kVarB : null;
        if (cVar != null) {
            Integer num = this.f30318u;
            if (num != null && num.intValue() == 2 && cVar.f30316s.isRunning()) {
                return;
            }
            switch (str.hashCode()) {
                case -1367724422:
                    if (str.equals("cancel")) {
                        cVar.f30316s.cancel();
                        break;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        cVar.f30316s.resume();
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals(BlinkChronometer.METHOD_PAUSE)) {
                        cVar.f30316s.pause();
                        break;
                    }
                    break;
                case 109757538:
                    if (str.equals(BlinkChronometer.METHOD_START)) {
                        cVar.f30316s.start();
                        break;
                    }
                    break;
                case 1099846370:
                    if (str.equals("reverse")) {
                        cVar.f30316s.reverse();
                        break;
                    }
                    break;
            }
        }
    }

    private final void l() throws JSONException {
        JSONArray jSONArrayA;
        JSONObject jSONObject = this.f30314q;
        if (jSONObject == null || (jSONArrayA = p206u5.c.a(jSONObject, "builder_info")) == null) {
            return;
        }
        new b(this, jSONArrayA).a();
    }

    private final void m() {
        Object objD;
        Object objD2;
        JSONObject jSONObject = this.f30314q;
        Integer numValueOf = (jSONObject == null || (objD2 = p206u5.c.d(jSONObject, "setInterpolator")) == null) ? null : Integer.valueOf(p206u5.a.e(objD2));
        this.f30316s.setInterpolator(numValueOf == null ? new LinearInterpolator() : I5.h.f3121a.a(numValueOf.intValue()));
        JSONObject jSONObject2 = this.f30314q;
        this.f30316s.setDuration((jSONObject2 == null || (objD = p206u5.c.d(jSONObject2, "setDuration")) == null) ? 2000L : p206u5.a.h(objD));
    }

    private final void n(View view) {
        JSONArray jSONArrayA;
        p246y5.b bVar;
        ObjectAnimator objectAnimatorD;
        JSONObject jSONObject = this.f30314q;
        if (jSONObject != null && (jSONArrayA = p206u5.c.a(jSONObject, "animators")) != null) {
            Iterator it = h.q(0, jSONArrayA.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = p206u5.b.a(jSONArrayA, ((L) it).a());
                if (jSONObjectA != null && (objectAnimatorD = (bVar = new p246y5.b(jSONObjectA, this.f30315r)).d(view, null)) != null) {
                    this.f30321x.put(Integer.valueOf(bVar.g()), objectAnimatorD);
                }
            }
        }
        G5.c.b("SimulatedAnimatorSet", "Animators parsed, available object animators size =" + this.f30321x.size());
    }

    private final void o() {
        JSONArray jSONArrayA;
        JSONObject jSONObject = this.f30314q;
        if (jSONObject == null || (jSONArrayA = p206u5.c.a(jSONObject, "playSequentially")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = h.q(0, jSONArrayA.length()).iterator();
        while (it.hasNext()) {
            Object objC = p206u5.b.c(jSONArrayA, ((L) it).a());
            arrayList.add(objC instanceof Integer ? (ObjectAnimator) this.f30321x.get(objC) : null);
        }
        List<Animator> listP = AbstractC1444s.P(arrayList);
        if (listP != null) {
            this.f30316s.playSequentially(listP);
        }
    }

    private final void p() {
        JSONArray jSONArrayA;
        JSONObject jSONObject = this.f30314q;
        if (jSONObject == null || (jSONArrayA = p206u5.c.a(jSONObject, "playTogether")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = h.q(0, jSONArrayA.length()).iterator();
        while (it.hasNext()) {
            Object objC = p206u5.b.c(jSONArrayA, ((L) it).a());
            arrayList.add(objC instanceof Integer ? (ObjectAnimator) this.f30321x.get(objC) : null);
        }
        List listP = AbstractC1444s.P(arrayList);
        if (listP != null) {
            this.f30316s.playTogether(listP);
        }
    }

    @Override // p226w5.k
    public void a() {
        this.f30316s.resume();
    }

    @Override // p226w5.k
    public void b() {
        if (kotlin.jvm.internal.n.d(this.f30319v, Boolean.FALSE)) {
            this.f30316s.end();
        }
    }

    @Override // p226w5.k
    public void cancel() {
        this.f30316s.cancel();
    }

    public Object i(p219v8.l lVar, p129m8.e eVar) {
        return p.a.a(this, lVar, eVar);
    }

    public final j j() {
        return this.f30315r;
    }

    public final AnimatorSet k() {
        return this.f30316s;
    }

    @Override // p226w5.k
    public void pause() {
        this.f30316s.pause();
    }

    public Object q(View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, n nVar, p129m8.e eVar) throws JSONException {
        this.f30322y = nVar;
        g(view);
        Object objI = i(new d(nVar, this, null), eVar);
        return objI == p139n8.b.e() ? objI : A.f21846a;
    }

    public final Object r(p129m8.e eVar) {
        if (this.f30320w != null) {
            Object objI = i(new e(null), eVar);
            return objI == p139n8.b.e() ? objI : A.f21846a;
        }
        Object objI2 = i(new f(null), eVar);
        return objI2 == p139n8.b.e() ? objI2 : A.f21846a;
    }

    @Override // p226w5.k
    public void registerAnimListener() {
        if (!this.f30323z || this.f30312A) {
            return;
        }
        this.f30312A = true;
        this.f30316s.addListener(this.f30313B);
    }

    @Override // p226w5.k
    public void start() {
        if (!kotlin.jvm.internal.n.d(this.f30319v, Boolean.FALSE) || this.f30316s.isRunning()) {
            return;
        }
        String str = this.f30320w;
        if (str != null) {
            h(str);
        } else {
            this.f30316s.start();
        }
    }

    @Override // p226w5.k
    public void unregisterAnimListener() {
        if (this.f30323z && this.f30312A) {
            this.f30312A = false;
            this.f30316s.removeListener(this.f30313B);
        }
    }
}
