package p246y5;

import I5.h;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.nothing.cardparser.exception.OutOfTypeParserException;
import com.nothing.cardwidget.BlinkChronometer;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p226w5.f;
import p226w5.j;
import p226w5.k;
import p226w5.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p, k {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f30293B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final C0748b f30294A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f30295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f30296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f30297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f30298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Integer f30299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Boolean f30300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f30301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f30302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile ObjectAnimator f30303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f30304z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y5.b$b, reason: collision with other inner class name */
    public static final class C0748b implements Animator.AnimatorListener {
        C0748b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            n.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            b.this.f().h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            n.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            b.this.f().e();
        }
    }

    static final class c extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30306q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p226w5.n f30307r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f30308s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p226w5.n nVar, b bVar, e eVar) {
            super(1, eVar);
            this.f30307r = nVar;
            this.f30308s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(e eVar) {
            return new c(this.f30307r, this.f30308s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30306q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f30307r.c(this.f30308s.g(), this.f30308s);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(e eVar) {
            return ((c) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class d extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30309q;

        d(e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(e eVar) {
            return b.this.new d(eVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0052  */
        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ObjectAnimator objectAnimatorH;
            p139n8.b.e();
            if (this.f30309q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            String str = b.this.f30304z;
            if (str == null) {
                objectAnimatorH = b.this.h();
                if (objectAnimatorH != null) {
                    objectAnimatorH.start();
                }
            } else {
                int iHashCode = str.hashCode();
                if (iHashCode != -1367724422) {
                    if (iHashCode != -934426579) {
                        if (iHashCode == 106440182 && str.equals(BlinkChronometer.METHOD_PAUSE)) {
                            b.this.pause();
                        } else {
                            objectAnimatorH = b.this.h();
                            if (objectAnimatorH != null) {
                                objectAnimatorH.start();
                            }
                        }
                    } else if (str.equals("resume")) {
                        b.this.a();
                    } else {
                        objectAnimatorH = b.this.h();
                        if (objectAnimatorH != null) {
                            objectAnimatorH.start();
                        }
                    }
                } else if (str.equals("cancel")) {
                    b.this.cancel();
                } else {
                    objectAnimatorH = b.this.h();
                    if (objectAnimatorH != null) {
                        objectAnimatorH.start();
                    }
                }
            }
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(e eVar) {
            return ((d) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public b(JSONObject jSONObject, j actionHandler) {
        n.h(actionHandler, "actionHandler");
        this.f30295q = jSONObject;
        this.f30296r = actionHandler;
        this.f30297s = jSONObject != null ? ((Number) p206u5.c.c(jSONObject, H5.b.f2538a.b(), -1)).intValue() : -1;
        this.f30298t = jSONObject != null ? ((Number) p206u5.c.c(jSONObject, "id", -1)).intValue() : -1;
        this.f30299u = jSONObject != null ? Integer.valueOf(jSONObject.optInt("startStrategy")) : null;
        this.f30300v = jSONObject != null ? (Boolean) p206u5.c.c(jSONObject, "playOnce", Boolean.FALSE) : null;
        boolean z9 = false;
        if (jSONObject != null && jSONObject.optBoolean("setAnimationCallback", false)) {
            z9 = true;
        }
        this.f30301w = z9;
        this.f30294A = new C0748b();
    }

    private final void i(String str) {
        this.f30304z = str;
    }

    private final void j(Object obj) {
        float fD = p206u5.a.d(obj);
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setCurrentFraction(fD);
        }
    }

    private final void k(Object obj) {
        long jH = p206u5.a.h(obj);
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setCurrentPlayTime(jH);
        }
    }

    private final void l(Object obj) {
        long jH = p206u5.a.h(obj);
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setDuration(jH);
        }
    }

    private final void m(Object obj) {
        h.a aVar = h.f3121a;
        n.f(obj, "null cannot be cast to non-null type kotlin.Int");
        Interpolator interpolatorA = aVar.a(((Integer) obj).intValue());
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(interpolatorA);
        }
    }

    private final void n(Object obj) {
        int iE = p206u5.a.e(obj);
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setRepeatCount(iE);
        }
    }

    private final void o(Object obj) {
        int iE = p206u5.a.e(obj);
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(iE);
        }
    }

    private final void p(Object obj) {
        long jH = p206u5.a.h(obj);
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.setStartDelay(jH);
        }
    }

    @Override // p226w5.k
    public void a() {
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.resume();
        }
    }

    @Override // p226w5.k
    public void b() {
        ObjectAnimator objectAnimator;
        if (!n.d(this.f30300v, Boolean.FALSE) || (objectAnimator = this.f30303y) == null) {
            return;
        }
        objectAnimator.end();
    }

    @Override // p226w5.k
    public void cancel() {
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ObjectAnimator d(View contentView, p226w5.n nVar) throws JSONException {
        View viewFindViewById;
        n.h(contentView, "contentView");
        int i10 = this.f30297s;
        if (-1 != i10 && (viewFindViewById = contentView.findViewById(i10)) != null) {
            JSONObject jSONObject = this.f30295q;
            n.e(jSONObject);
            String strE = p206u5.c.e(jSONObject, "method");
            JSONArray jSONArrayA = p206u5.c.a(this.f30295q, "values");
            String strE2 = p206u5.c.e(this.f30295q, "propertyName");
            if (strE == null || jSONArrayA == null || strE2 == null) {
                G5.c.d("SimulatedAnimator", "Can not found animator args info.");
            } else {
                ObjectAnimator objectAnimatorOfFloat = null;
                switch (strE) {
                    case "ofFloat":
                        float[] fArrD = p206u5.b.d(jSONArrayA);
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, strE2, Arrays.copyOf(fArrD, fArrD.length));
                        break;
                    case "ofArgb":
                        int[] iArrE = p206u5.b.e(jSONArrayA);
                        objectAnimatorOfFloat = ObjectAnimator.ofArgb(viewFindViewById, strE2, Arrays.copyOf(iArrE, iArrE.length));
                        break;
                    case "ofInt":
                        int[] iArrE2 = p206u5.b.e(jSONArrayA);
                        objectAnimatorOfFloat = ObjectAnimator.ofInt(viewFindViewById, strE2, Arrays.copyOf(iArrE2, iArrE2.length));
                        break;
                    case "ofControl":
                        k kVarB = nVar != null ? nVar.b(this.f30298t) : null;
                        b bVar = kVarB instanceof b ? (b) kVarB : null;
                        if (bVar != null) {
                            objectAnimatorOfFloat = bVar.f30303y;
                        }
                        break;
                    default:
                        if (strE.equals("ofFloat")) {
                            float[] fArrD2 = p206u5.b.d(jSONArrayA);
                            objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, strE2, Arrays.copyOf(fArrD2, fArrD2.length));
                            break;
                        }
                        throw new OutOfTypeParserException("Can not parse the animator method type. Method = " + strE, null, 2, null);
                }
                this.f30303y = objectAnimatorOfFloat;
                Iterator<String> itKeys = this.f30295q.keys();
                n.g(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = this.f30295q.get(next);
                    if (next != null) {
                        switch (next.hashCode()) {
                            case -1367724422:
                                if (!next.equals("cancel")) {
                                }
                                break;
                            case -1122142141:
                                if (!next.equals("setStartDelay")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    p(obj);
                                }
                                break;
                            case -934426579:
                                if (!next.equals("resume")) {
                                }
                                break;
                            case -840485262:
                                if (!next.equals("setRepeatCount")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    n(obj);
                                }
                                break;
                            case -2692074:
                                if (!next.equals("setDuration")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    l(obj);
                                }
                                break;
                            case 106440182:
                                if (!next.equals(BlinkChronometer.METHOD_PAUSE)) {
                                }
                                break;
                            case 293968888:
                                if (!next.equals("setCurrentPlayTime")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    k(obj);
                                }
                                break;
                            case 338548297:
                                if (!next.equals("setInterpolator")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    m(obj);
                                }
                                break;
                            case 1056425433:
                                if (!next.equals("setCurrentFraction")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    j(obj);
                                }
                                break;
                            case 1635752928:
                                if (!next.equals("setRepeatMode")) {
                                    continue;
                                } else {
                                    n.e(obj);
                                    o(obj);
                                }
                                break;
                            default:
                                continue;
                        }
                        i(next);
                    }
                }
                registerAnimListener();
            }
        }
        return this.f30303y;
    }

    public Object e(p219v8.l lVar, e eVar) {
        return p.a.a(this, lVar, eVar);
    }

    public final j f() {
        return this.f30296r;
    }

    public final int g() {
        return this.f30298t;
    }

    public final ObjectAnimator h() {
        return this.f30303y;
    }

    @Override // p226w5.k
    public void pause() {
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    public Object q(View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, p226w5.n nVar, e eVar) throws JSONException {
        d(view, nVar);
        Object objE = e(new c(nVar, this, null), eVar);
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    public final Object r(e eVar) {
        Object objE;
        ObjectAnimator objectAnimator;
        Integer num = this.f30299u;
        return ((num != null && num.intValue() == 2 && (objectAnimator = this.f30303y) != null && objectAnimator.isRunning()) || (objE = e(new d(null), eVar)) != p139n8.b.e()) ? A.f21846a : objE;
    }

    @Override // p226w5.k
    public void registerAnimListener() {
        if (!this.f30301w || this.f30302x) {
            return;
        }
        this.f30302x = true;
        ObjectAnimator objectAnimator = this.f30303y;
        if (objectAnimator != null) {
            objectAnimator.addListener(this.f30294A);
        }
    }

    @Override // p226w5.k
    public void start() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (!n.d(this.f30300v, Boolean.FALSE) || (objectAnimator = this.f30303y) == null || objectAnimator.isRunning() || (objectAnimator2 = this.f30303y) == null) {
            return;
        }
        objectAnimator2.start();
    }

    @Override // p226w5.k
    public void unregisterAnimListener() {
        if (this.f30301w && this.f30302x) {
            this.f30302x = false;
            ObjectAnimator objectAnimator = this.f30303y;
            if (objectAnimator != null) {
                objectAnimator.removeListener(this.f30294A);
            }
        }
    }
}
