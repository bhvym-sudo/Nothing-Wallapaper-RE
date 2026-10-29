package D5;

import F8.AbstractC0816i;
import F8.L;
import F8.M;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g implements p226w5.k, L {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f802H = new a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ L f803E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Integer f804F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Boolean f805G;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f806q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f808s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f809t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f810u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, String str, Object obj, p129m8.e eVar) {
            super(1, eVar);
            this.f808s = view;
            this.f809t = str;
            this.f810u = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return l.this.new b(this.f808s, this.f809t, this.f810u, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f806q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                l lVar = l.this;
                View view = this.f808s;
                String str = this.f809t;
                Object obj2 = this.f810u;
                this.f806q = 1;
                if (l.super.p(view, str, obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((b) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f811q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f813s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f814t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object obj, p129m8.e eVar) {
            super(2, eVar);
            this.f813s = str;
            this.f814t = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return l.this.new c(this.f813s, this.f814t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f811q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                View viewJ = l.this.j();
                if (viewJ != null) {
                    l lVar = l.this;
                    String str = this.f813s;
                    Object obj2 = this.f814t;
                    this.f811q = 1;
                    if (lVar.l(viewJ, str, obj2, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(JSONObject jSONObject, p226w5.j actionHandler, p226w5.n infoCollector) {
        super(jSONObject, actionHandler, infoCollector);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        kotlin.jvm.internal.n.h(infoCollector, "infoCollector");
        this.f803E = M.b();
        this.f804F = jSONObject != null ? Integer.valueOf(jSONObject.optInt("startStrategy")) : null;
        this.f805G = jSONObject != null ? (Boolean) p206u5.c.c(jSONObject, "playOnce", Boolean.FALSE) : null;
    }

    private final Object R(View view, String str, Object obj, p129m8.e eVar) {
        Object objE;
        if (!(view instanceof LottieAnimationView)) {
            return A.f21846a;
        }
        Integer num = this.f804F;
        return ((num != null && num.intValue() == 2 && ((LottieAnimationView) view).isAnimating()) || (objE = e(new b(view, str, obj, null), eVar)) != p139n8.b.e()) ? A.f21846a : objE;
    }

    private final void S(String str, Object obj) {
        AbstractC0816i.d(this, null, null, new c(str, obj, null), 3, null);
    }

    static /* synthetic */ void T(l lVar, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = JSONObject.NULL;
        }
        lVar.S(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(Throwable th) {
        G5.c.d("SimulatedLottieAnimationView", "LottieAnimationView parse error: " + th);
    }

    private final void V(View view, Object obj) {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            kotlin.jvm.internal.n.f(view, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
            Resources resources = ((LottieAnimationView) view).getResources();
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlin.Int");
            final int color = resources.getColor(((Integer) obj).intValue(), null);
            JSONObject jSONObjectI = i();
            String str = jSONObjectI != null ? (String) p206u5.c.c(jSONObjectI, "keyPath", "") : null;
            lottieAnimationView.addValueCallback((str == null || str.length() == 0) ? new KeyPath("**") : new KeyPath(str, "**"), LottieProperty.COLOR_FILTER, (SimpleLottieValueCallback<ColorFilter>) new SimpleLottieValueCallback() { // from class: D5.k
                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    return l.W(color, lottieFrameInfo);
                }
            });
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.d("SimulatedLottieAnimationView", "setPorterDuffColorFilter error: " + thD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorFilter W(int i10, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override // D5.g, p226w5.k
    public void a() {
        T(this, "resumeAnimation", null, 2, null);
    }

    @Override // D5.g, p226w5.k
    public void b() {
        if (kotlin.jvm.internal.n.d(this.f805G, Boolean.FALSE)) {
            T(this, "cancelAnimation", null, 2, null);
            S("setProgress", Float.valueOf(0.0f));
        }
    }

    @Override // D5.g, p226w5.k
    public void cancel() {
        T(this, "cancelAnimation", null, 2, null);
        S("setProgress", Float.valueOf(0.0f));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r4.equals("cancelAnimation") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r4.equals("resumeAnimation") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r4.equals("playAnimation") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r4.equals("pauseAnimation") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r2 = R(r3, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r2 != p139n8.b.e()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        return p079h8.A.f21846a;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // D5.g, D5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(android.view.View r3, java.lang.String r4, java.lang.Object r5, p129m8.e r6) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.airbnb.lottie.LottieAnimationView
            if (r0 == 0) goto Lf
            r0 = r3
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            D5.j r1 = new D5.j
            r1.<init>()
            r0.setFailureListener(r1)
        Lf:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1296995794: goto L41;
                case 868223664: goto L38;
                case 1236882903: goto L2f;
                case 1379317290: goto L26;
                case 1955812570: goto L17;
                default: goto L16;
            }
        L16:
            goto L57
        L17:
            java.lang.String r0 = "setPorterDuffColorFilter"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L20
            goto L57
        L20:
            r2.V(r3, r5)
            h8.A r2 = p079h8.A.f21846a
            return r2
        L26:
            java.lang.String r0 = "cancelAnimation"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L49
            goto L57
        L2f:
            java.lang.String r0 = "resumeAnimation"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L49
            goto L57
        L38:
            java.lang.String r0 = "playAnimation"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L49
            goto L57
        L41:
            java.lang.String r0 = "pauseAnimation"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
        L49:
            java.lang.Object r2 = r2.R(r3, r4, r5, r6)
            java.lang.Object r3 = p139n8.b.e()
            if (r2 != r3) goto L54
            return r2
        L54:
            h8.A r2 = p079h8.A.f21846a
            return r2
        L57:
            java.lang.Object r2 = super.p(r3, r4, r5, r6)
            java.lang.Object r3 = p139n8.b.e()
            if (r2 != r3) goto L62
            return r2
        L62:
            h8.A r2 = p079h8.A.f21846a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.l.p(android.view.View, java.lang.String, java.lang.Object, m8.e):java.lang.Object");
    }

    @Override // D5.g, p226w5.k
    public void pause() {
        T(this, "pauseAnimation", null, 2, null);
    }

    @Override // D5.g, p226w5.k
    public void registerAnimListener() {
    }

    @Override // D5.g, p226w5.k
    public void start() {
        if (kotlin.jvm.internal.n.d(this.f805G, Boolean.FALSE)) {
            View viewJ = j();
            LottieAnimationView lottieAnimationView = viewJ instanceof LottieAnimationView ? (LottieAnimationView) viewJ : null;
            if (lottieAnimationView == null || lottieAnimationView.isAnimating()) {
                return;
            }
            T(this, "playAnimation", null, 2, null);
        }
    }

    @Override // D5.g, p226w5.k
    public void unregisterAnimListener() {
    }

    @Override // F8.L
    public p129m8.i w0() {
        return this.f803E.w0();
    }
}
