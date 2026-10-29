package D5;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.nothing.cardwidget.mediaplayer.utils.DisplayUtil;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public class w implements p226w5.p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f922u = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p226w5.n f926t;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f927q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f928r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f929s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f930t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f931u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f932v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f933w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f935y;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f933w = obj;
            this.f935y |= Integer.MIN_VALUE;
            return w.this.d(null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f936q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p246y5.a f938s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f939t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p246y5.a aVar, View view, p129m8.e eVar) {
            super(1, eVar);
            this.f938s = aVar;
            this.f939t = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return w.this.new c(this.f938s, this.f939t, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f936q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            p226w5.n nVarF = w.this.f();
            if (nVarF != null) {
                nVarF.c(w.this.k(), this.f938s);
            }
            this.f938s.c(this.f939t);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((c) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class d extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f940a;

        d(Object obj) {
            this.f940a = obj;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
            kotlin.jvm.internal.n.h(host, "host");
            kotlin.jvm.internal.n.h(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            Object objB = E5.c.b(this.f940a);
            if (objB instanceof String) {
                info.setText((CharSequence) objB);
            }
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f941q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f942r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f943s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f944t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f945u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f947w;

        e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f945u = obj;
            this.f947w |= Integer.MIN_VALUE;
            return w.C(w.this, null, null, null, null, null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f948q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p226w5.n f949r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ w f950s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p226w5.n nVar, w wVar, p129m8.e eVar) {
            super(1, eVar);
            this.f949r = nVar;
            this.f950s = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return new f(this.f949r, this.f950s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f948q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            this.f949r.c(this.f950s.k(), (p226w5.k) this.f950s);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((f) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public w(JSONObject jSONObject) {
        this.f923q = jSONObject;
        this.f924r = jSONObject != null ? ((Number) p206u5.c.c(jSONObject, H5.j.f2545a.b(), -1)).intValue() : -1;
    }

    private final void A(View view, String str, Object obj) {
        Integer numR;
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        if (kotlin.jvm.internal.n.d(str2, "wrap_content")) {
            numR = -2;
        } else {
            numR = kotlin.jvm.internal.n.d(str2, "match_parent") ? -1 : E8.i.r(str2);
        }
        if (numR != null) {
            int iIntValue = numR.intValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (kotlin.jvm.internal.n.d(str, "layout_width")) {
                    layoutParams.width = iIntValue;
                } else if (kotlin.jvm.internal.n.d(str, "layout_height")) {
                    layoutParams.height = iIntValue;
                }
                view.setLayoutParams(layoutParams);
                G5.c.b("SimulatedView", "set view size = " + str + ", value = " + obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r4.e(r5, r6) == r8) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object C(D5.w r4, android.view.View r5, android.view.ViewGroup r6, p226w5.f r7, p216v5.a r8, p226w5.n r9, p129m8.e r10) throws org.json.JSONException {
        /*
            boolean r6 = r10 instanceof D5.w.e
            if (r6 == 0) goto L13
            r6 = r10
            D5.w$e r6 = (D5.w.e) r6
            int r7 = r6.f947w
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7 & r8
            if (r0 == 0) goto L13
            int r7 = r7 - r8
            r6.f947w = r7
            goto L18
        L13:
            D5.w$e r6 = new D5.w$e
            r6.<init>(r10)
        L18:
            java.lang.Object r7 = r6.f945u
            java.lang.Object r8 = p139n8.b.e()
            int r10 = r6.f947w
            r0 = 2
            r1 = 1
            if (r10 == 0) goto L4c
            if (r10 == r1) goto L35
            if (r10 != r0) goto L2d
            p079h8.r.b(r7)
            goto Lb7
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            java.lang.Object r4 = r6.f944t
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r6.f943s
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r9 = r6.f942r
            w5.n r9 = (p226w5.n) r9
            java.lang.Object r10 = r6.f941q
            D5.w r10 = (D5.w) r10
            p079h8.r.b(r7)
            r7 = r6
            r6 = r5
            r5 = r10
            goto L71
        L4c:
            p079h8.r.b(r7)
            int r7 = r4.f924r
            r10 = -1
            if (r10 == r7) goto Lba
            r4.f926t = r9
            android.view.View r5 = r5.findViewById(r7)
            r4.f925s = r5
            if (r5 == 0) goto L9c
            org.json.JSONObject r7 = r4.f923q
            kotlin.jvm.internal.n.e(r7)
            java.util.Iterator r7 = r7.keys()
            java.lang.String r10 = "keys(...)"
            kotlin.jvm.internal.n.g(r7, r10)
            r3 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r3
        L71:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L9a
            java.lang.Object r10 = r4.next()
            java.lang.String r10 = (java.lang.String) r10
            org.json.JSONObject r2 = r5.f923q
            java.lang.Object r2 = r2.get(r10)
            kotlin.jvm.internal.n.e(r10)
            kotlin.jvm.internal.n.e(r2)
            r7.f941q = r5
            r7.f942r = r9
            r7.f943s = r6
            r7.f944t = r4
            r7.f947w = r1
            java.lang.Object r10 = r5.p(r6, r10, r2, r7)
            if (r10 != r8) goto L71
            goto Lb6
        L9a:
            r4 = r5
            r6 = r7
        L9c:
            boolean r5 = r4 instanceof p226w5.k
            if (r5 == 0) goto Lba
            D5.w$f r5 = new D5.w$f
            r7 = 0
            r5.<init>(r9, r4, r7)
            r6.f941q = r7
            r6.f942r = r7
            r6.f943s = r7
            r6.f944t = r7
            r6.f947w = r0
            java.lang.Object r4 = r4.e(r5, r6)
            if (r4 != r8) goto Lb7
        Lb6:
            return r8
        Lb7:
            h8.A r4 = p079h8.A.f21846a
            return r4
        Lba:
            h8.A r4 = p079h8.A.f21846a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.w.C(D5.w, android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bf -> B:30:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object d(android.view.View r12, java.lang.Object r13, p129m8.e r14) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.w.d(android.view.View, java.lang.Object, m8.e):java.lang.Object");
    }

    static /* synthetic */ Object q(w wVar, View view, String str, Object obj, p129m8.e eVar) {
        H5.j.a aVar = H5.j.f2545a;
        if (!kotlin.jvm.internal.n.d(str, aVar.b()) && !kotlin.jvm.internal.n.d(str, "view_type") && !kotlin.jvm.internal.n.d(str, aVar.a())) {
            if (kotlin.jvm.internal.n.d(str, "layout_width") || kotlin.jvm.internal.n.d(str, "layout_height")) {
                wVar.A(view, str, obj);
            } else if (kotlin.jvm.internal.n.d(str, "paddingTop") || kotlin.jvm.internal.n.d(str, "paddingLeft") || kotlin.jvm.internal.n.d(str, "paddingRight") || kotlin.jvm.internal.n.d(str, "paddingBottom")) {
                wVar.z(view, str, obj);
            } else if (kotlin.jvm.internal.n.d(str, DisplayUtil.MARGIN_START) || kotlin.jvm.internal.n.d(str, DisplayUtil.MARGIN_LEFT) || kotlin.jvm.internal.n.d(str, DisplayUtil.MARGIN_TOP) || kotlin.jvm.internal.n.d(str, DisplayUtil.MARGIN_RIGHT) || kotlin.jvm.internal.n.d(str, DisplayUtil.MARGIN_BOTTOM) || kotlin.jvm.internal.n.d(str, DisplayUtil.MARGIN_END)) {
                wVar.y(view, str, obj);
            } else {
                if (kotlin.jvm.internal.n.d(str, "setStateListAnimator")) {
                    Object objX = wVar.x(view, str, obj, eVar);
                    return objX == p139n8.b.e() ? objX : A.f21846a;
                }
                if (kotlin.jvm.internal.n.d(str, "setBackgroundTintList")) {
                    wVar.t(view, str, obj);
                } else if (kotlin.jvm.internal.n.d(str, "setBackgroundTintBlendMode")) {
                    wVar.s(view, str, obj);
                } else if (kotlin.jvm.internal.n.d(str, "setForegroundTintList")) {
                    wVar.w(view, str, obj);
                } else if (kotlin.jvm.internal.n.d(str, "setForegroundTintBlendMode")) {
                    wVar.v(view, str, obj);
                } else {
                    if (kotlin.jvm.internal.n.d(str, "setAnimationDrawable")) {
                        Object objR = wVar.r(view, str, obj, eVar);
                        return objR == p139n8.b.e() ? objR : A.f21846a;
                    }
                    if (kotlin.jvm.internal.n.d(str, "setContentDescription")) {
                        wVar.u(view, obj);
                    } else if (!kotlin.jvm.internal.n.d(str, "tag") && !kotlin.jvm.internal.n.d(str, "setUpdateTimeStamp")) {
                        if (kotlin.jvm.internal.n.d(str, "invoke")) {
                            Object objD = wVar.d(view, obj, eVar);
                            return objD == p139n8.b.e() ? objD : A.f21846a;
                        }
                        Object objL = wVar.l(view, str, obj, eVar);
                        return objL == p139n8.b.e() ? objL : A.f21846a;
                    }
                }
            }
        }
        return A.f21846a;
    }

    private final Object r(View view, String str, Object obj, p129m8.e eVar) {
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlin.String");
        p246y5.a aVar = new p246y5.a(new JSONObject((String) obj));
        G5.c.b("SimulatedView", "setAnimationDrawable key = " + str + ", value = " + obj + ", mode = " + this);
        Object objE = e(new c(aVar, view, null), eVar);
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    private final void s(View view, String str, Object obj) {
        BlendMode blendModeN = n(obj);
        if (blendModeN != null) {
            view.setBackgroundTintBlendMode(blendModeN);
            G5.c.b("SimulatedView", "set background tint blend mode key = " + str + ", value = " + obj + ", mode = " + blendModeN);
        }
    }

    private final void t(View view, String str, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (colorStateListG != null) {
            view.setBackgroundTintList(colorStateListG);
            G5.c.b("SimulatedView", "set background tint list key = " + str + ", value = " + obj + ", colorState = " + colorStateListG);
        }
    }

    private final void u(View view, Object obj) {
        view.setAccessibilityDelegate(new d(obj));
    }

    private final void v(View view, String str, Object obj) {
        BlendMode blendModeN = n(obj);
        if (blendModeN != null) {
            view.setForegroundTintBlendMode(blendModeN);
            G5.c.b("SimulatedView", "set foreground tint blend mode key = " + str + ", value = " + obj + ", mode = " + blendModeN);
        }
    }

    private final void w(View view, String str, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (colorStateListG != null) {
            view.setForegroundTintList(colorStateListG);
            G5.c.b("SimulatedView", "set foreground tint list key = " + str + ", value = " + obj + ", colorState = " + colorStateListG);
        }
    }

    private final Object x(View view, String str, Object obj, p129m8.e eVar) {
        Object objB;
        Object objL;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            Context context = view.getContext();
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlin.Int");
            objB = p079h8.q.b(AnimatorInflater.loadStateListAnimator(context, ((Integer) obj).intValue()));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = null;
        }
        StateListAnimator stateListAnimator = (StateListAnimator) objB;
        return (stateListAnimator == null || (objL = l(view, str, stateListAnimator, eVar)) != p139n8.b.e()) ? A.f21846a : objL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void y(View view, String str, Object obj) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((obj instanceof Integer) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            switch (str.hashCode()) {
                case -954397320:
                    if (str.equals(DisplayUtil.MARGIN_END)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((Number) obj).intValue());
                    }
                    break;
                case -954382862:
                    if (str.equals(DisplayUtil.MARGIN_TOP)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((Number) obj).intValue();
                    }
                    break;
                case 148567150:
                    if (str.equals(DisplayUtil.MARGIN_BOTTOM)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((Number) obj).intValue();
                    }
                    break;
                case 478654218:
                    if (str.equals(DisplayUtil.MARGIN_LEFT)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((Number) obj).intValue();
                    }
                    break;
                case 1959039865:
                    if (str.equals(DisplayUtil.MARGIN_RIGHT)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((Number) obj).intValue();
                    }
                    break;
                case 1960285631:
                    if (str.equals(DisplayUtil.MARGIN_START)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((Number) obj).intValue());
                    }
                    break;
            }
            view.setLayoutParams(layoutParams);
            G5.c.b("SimulatedView", "set view margin = " + str + ", value = " + obj);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void z(View view, String str, Object obj) {
        if (obj instanceof Integer) {
            switch (str.hashCode()) {
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        view.setPadding(((Number) obj).intValue(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        view.setPadding(view.getPaddingLeft(), ((Number) obj).intValue(), view.getPaddingRight(), view.getPaddingBottom());
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((Number) obj).intValue());
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), ((Number) obj).intValue(), view.getPaddingBottom());
                    }
                    break;
            }
            G5.c.b("SimulatedView", "set view padding = " + str + ", value = " + obj);
        }
    }

    public Object B(View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        return C(this, view, viewGroup, fVar, aVar, nVar, eVar);
    }

    public Object e(p219v8.l lVar, p129m8.e eVar) {
        return w5.p.a.a(this, lVar, eVar);
    }

    public final p226w5.n f() {
        return this.f926t;
    }

    public final ColorStateList g(Object value, View target) {
        Object objB;
        kotlin.jvm.internal.n.h(value, "value");
        kotlin.jvm.internal.n.h(target, "target");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(value instanceof Integer ? target.getResources().getColorStateList(((Number) value).intValue(), null) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        return (ColorStateList) (p079h8.q.f(objB) ? null : objB);
    }

    public final Drawable h(View target, Object value) {
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(value, "value");
        if (value instanceof Integer) {
            Number number = (Number) value;
            if (number.intValue() > 0) {
                Resources resources = target.getResources();
                kotlin.jvm.internal.n.g(resources, "getResources(...)");
                return p206u5.d.a(resources, number.intValue(), null);
            }
        }
        return null;
    }

    public final JSONObject i() {
        return this.f923q;
    }

    public final View j() {
        return this.f925s;
    }

    public final int k() {
        return this.f924r;
    }

    public final Object l(Object obj, String str, Object obj2, p129m8.e eVar) {
        List listE;
        List listE2;
        Class clsA = E5.c.a(obj2);
        Object objB = E5.c.b(obj2);
        Object objB2 = objB != null ? p206u5.a.b(objB, clsA) : null;
        boolean z9 = clsA == null || objB2 == null;
        if (z9) {
            listE = AbstractC1444s.l();
        } else {
            kotlin.jvm.internal.n.e(clsA);
            listE = AbstractC1444s.e(clsA);
        }
        List list = listE;
        if (z9) {
            listE2 = AbstractC1444s.l();
        } else {
            kotlin.jvm.internal.n.e(objB2);
            listE2 = AbstractC1444s.e(objB2);
        }
        Object objM = m(list, listE2, str, obj, eVar);
        return objM == p139n8.b.e() ? objM : A.f21846a;
    }

    public Object m(List list, List list2, String str, Object obj, p129m8.e eVar) {
        return w5.p.a.b(this, list, list2, str, obj, eVar);
    }

    public final BlendMode n(Object value) {
        Object objB;
        kotlin.jvm.internal.n.h(value, "value");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(value instanceof Integer ? I5.d.f3117a.a(((Number) value).intValue()) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        return (BlendMode) (p079h8.q.f(objB) ? null : objB);
    }

    public final PorterDuff.Mode o(Object value) {
        Object objB;
        kotlin.jvm.internal.n.h(value, "value");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(value instanceof Integer ? I5.e.f3118a.a(((Number) value).intValue()) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        return (PorterDuff.Mode) (p079h8.q.f(objB) ? null : objB);
    }

    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        return q(this, view, str, obj, eVar);
    }
}
