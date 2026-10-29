package D5;

import F8.AbstractC0812g;
import F8.C0803b0;
import F8.H0;
import F8.L;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.nothing.cardwidget.BlinkChronometer;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public class g extends w implements p226w5.k {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f742D = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f743A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f744B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final b f745C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p226w5.j f746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p226w5.n f747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AnimatedVectorDrawable f749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f750z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Animatable2.AnimationCallback {
        b() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            g.this.F().h();
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            g.this.F().e();
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f752q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f754s;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f752q = obj;
            this.f754s |= Integer.MIN_VALUE;
            return g.this.M(null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f755q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f757s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f758t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Uri f759u;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f760q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ View f761r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Uri f762s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, Uri uri, p129m8.e eVar) {
                super(2, eVar);
                this.f761r = view;
                this.f762s = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f761r, this.f762s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f760q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return Glide.with(((ImageView) this.f761r).getContext().getApplicationContext()).load(this.f762s).placeholder(((ImageView) this.f761r).getDrawable()).into((ImageView) this.f761r);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, View view, Uri uri, p129m8.e eVar) {
            super(2, eVar);
            this.f757s = obj;
            this.f758t = view;
            this.f759u = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new d(this.f757s, this.f758t, this.f759u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f755q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return obj;
            }
            p079h8.r.b(obj);
            g.this.G(this.f757s);
            H0 h0C = C0803b0.c();
            a aVar = new a(this.f758t, this.f759u, null);
            this.f755q = 1;
            Object objG = AbstractC0812g.g(h0C, aVar, this);
            return objG == objE ? objE : objG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JSONObject jSONObject, p226w5.j actionHandler, p226w5.n collector) {
        super(jSONObject);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        kotlin.jvm.internal.n.h(collector, "collector");
        this.f746v = actionHandler;
        this.f747w = collector;
        this.f748x = jSONObject != null ? jSONObject.optBoolean("loadImageSync", false) : false;
        this.f750z = true;
        this.f745C = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Object obj) {
        if (obj instanceof String) {
            this.f746v.l((String) obj);
        }
    }

    private final boolean H(Uri uri) {
        return kotlin.jvm.internal.n.d(uri.getHost(), "com.nothing.systemui.qs.widget");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    static /* synthetic */ Object I(g gVar, View view, String str, Object obj, p129m8.e eVar) {
        switch (str) {
            case "setAnimatedVectorDrawable":
                gVar.J(view, obj);
                return A.f21846a;
            case "setScaleType":
                Object objN = gVar.N(view, str, obj, eVar);
                return objN == p139n8.b.e() ? objN : A.f21846a;
            case "setImageTintBlendMode":
                gVar.K(view, str, obj);
                return A.f21846a;
            case "setImageTintList":
                gVar.L(view, obj);
                return A.f21846a;
            case "setImageURI":
                Object objM = gVar.M(view, str, obj, eVar);
                return objM == p139n8.b.e() ? objM : A.f21846a;
            default:
                if (str.equals("setAnimatedVectorDrawable")) {
                    gVar.J(view, obj);
                    return A.f21846a;
                }
                Object objP = super.p(view, str, obj, eVar);
                if (objP == p139n8.b.e()) {
                    return objP;
                }
                return A.f21846a;
        }
    }

    private final void J(View view, Object obj) {
        if ((view instanceof ImageView) && (obj instanceof String)) {
            JSONObject jSONObject = new JSONObject((String) obj);
            this.f750z = jSONObject.optBoolean("playOnce", true);
            this.f743A = jSONObject.optBoolean("setAnimationCallback", false);
            ImageView imageView = (ImageView) view;
            imageView.setImageResource(jSONObject.optInt("drawableRes"));
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof AnimatedVectorDrawable) {
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                this.f749y = animatedVectorDrawable;
                int iOptInt = jSONObject.optInt("setTint");
                if (iOptInt != 0) {
                    animatedVectorDrawable.setTint(p171r0.a.b(imageView.getContext(), iOptInt));
                }
                if (this.f743A) {
                    registerAnimListener();
                    this.f747w.c(17953, this);
                }
                if (kotlin.jvm.internal.n.d(jSONObject.optString("state"), BlinkChronometer.METHOD_STOP)) {
                    animatedVectorDrawable.stop();
                } else {
                    animatedVectorDrawable.start();
                }
            }
        }
    }

    private final void K(View view, String str, Object obj) {
        BlendMode blendModeN = n(obj);
        if (view instanceof ImageView) {
            ((ImageView) view).setImageTintBlendMode(blendModeN);
        }
        G5.c.b("SimulatedImageView", "set image view tint blend mode success, target = " + view + ", key = " + str + ", value = " + obj);
    }

    private final void L(View view, Object obj) {
        Object objB;
        ColorStateList colorStateListG;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            if ((obj instanceof Integer) && (colorStateListG = g(obj, view)) != null && (view instanceof ImageView)) {
                ((ImageView) view).setImageTintList(colorStateListG);
            }
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.d("SimulatedImageView", "ImageView setImageTintList error: " + thD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r0 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (l(r12, r13, r9, r15) == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(android.view.View r12, java.lang.String r13, java.lang.Object r14, p129m8.e r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof D5.g.c
            if (r0 == 0) goto L14
            r0 = r15
            D5.g$c r0 = (D5.g.c) r0
            int r1 = r0.f754s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f754s = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            D5.g$c r0 = new D5.g$c
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.f752q
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r15.f754s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p079h8.r.b(r0)
            goto L95
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            p079h8.r.b(r0)
            goto La5
        L3c:
            p079h8.r.b(r0)
            r2 = 0
            h8.q$a r0 = p079h8.q.f21862r     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r14 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L50
            r0 = r14
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4e
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            goto L56
        L50:
            r0 = r2
        L51:
            java.lang.Object r0 = p079h8.q.b(r0)     // Catch: java.lang.Throwable -> L4e
            goto L60
        L56:
            h8.q$a r5 = p079h8.q.f21862r
            java.lang.Object r0 = p079h8.r.a(r0)
            java.lang.Object r0 = p079h8.q.b(r0)
        L60:
            boolean r5 = p079h8.q.f(r0)
            if (r5 == 0) goto L67
            goto L68
        L67:
            r2 = r0
        L68:
            r9 = r2
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto La5
            boolean r0 = r12 instanceof android.widget.ImageView
            if (r0 == 0) goto La5
            boolean r0 = r11.f748x
            if (r0 != 0) goto L7b
            boolean r0 = r11.H(r9)
            if (r0 == 0) goto L7f
        L7b:
            r6 = r11
            r8 = r12
            r7 = r14
            goto L99
        L7f:
            F8.I r13 = F8.C0803b0.b()
            D5.g$d r5 = new D5.g$d
            r10 = 0
            r6 = r11
            r8 = r12
            r7 = r14
            r5.<init>(r7, r8, r9, r10)
            r15.f754s = r3
            java.lang.Object r0 = F8.AbstractC0812g.g(r13, r5, r15)
            if (r0 != r1) goto L95
            goto La4
        L95:
            kotlin.jvm.internal.n.e(r0)
            goto La5
        L99:
            r6.G(r7)
            r15.f754s = r4
            java.lang.Object r11 = r6.l(r8, r13, r9, r15)
            if (r11 != r1) goto La5
        La4:
            return r1
        La5:
            h8.A r11 = p079h8.A.f21846a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.g.M(android.view.View, java.lang.String, java.lang.Object, m8.e):java.lang.Object");
    }

    private final Object N(View view, String str, Object obj, p129m8.e eVar) {
        Object objB;
        Object objL;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(obj instanceof Integer ? I5.g.f3120a.a(((Number) obj).intValue()) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        ImageView.ScaleType scaleType = (ImageView.ScaleType) (p079h8.q.f(objB) ? null : objB);
        return (scaleType == null || (objL = l(view, str, scaleType, eVar)) != p139n8.b.e()) ? A.f21846a : objL;
    }

    public final p226w5.j F() {
        return this.f746v;
    }

    @Override // p226w5.k
    public void a() {
    }

    @Override // p226w5.k
    public void b() {
        AnimatedVectorDrawable animatedVectorDrawable;
        if (this.f750z || (animatedVectorDrawable = this.f749y) == null) {
            return;
        }
        animatedVectorDrawable.stop();
    }

    @Override // p226w5.k
    public void cancel() {
        AnimatedVectorDrawable animatedVectorDrawable = this.f749y;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.stop();
        }
    }

    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        return I(this, view, str, obj, eVar);
    }

    @Override // p226w5.k
    public void pause() {
    }

    @Override // p226w5.k
    public void registerAnimListener() {
        if (!this.f743A || this.f744B) {
            return;
        }
        this.f744B = true;
        AnimatedVectorDrawable animatedVectorDrawable = this.f749y;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.registerAnimationCallback(this.f745C);
        }
    }

    @Override // p226w5.k
    public void start() {
        AnimatedVectorDrawable animatedVectorDrawable;
        if (this.f750z || (animatedVectorDrawable = this.f749y) == null) {
            return;
        }
        animatedVectorDrawable.start();
    }

    @Override // p226w5.k
    public void unregisterAnimListener() {
        if (this.f743A && this.f744B) {
            this.f744B = false;
            AnimatedVectorDrawable animatedVectorDrawable = this.f749y;
            if (animatedVectorDrawable != null) {
                animatedVectorDrawable.unregisterAnimationCallback(this.f745C);
            }
        }
    }
}
