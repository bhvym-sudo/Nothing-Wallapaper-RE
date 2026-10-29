package D5;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f763f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p226w5.j f765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicInteger f768e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f769q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f770r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f771s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f772t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f773u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f774v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f775w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f776x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f778z;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f776x = obj;
            this.f778z |= Integer.MIN_VALUE;
            return h.this.a(null, null, null, null, null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f779q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f780r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f781s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f782t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f784v;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f782t = obj;
            this.f784v |= Integer.MIN_VALUE;
            return h.this.g(null, null, null, null, null, this);
        }
    }

    public h(JSONObject infoJson, p226w5.j actionHandler) {
        kotlin.jvm.internal.n.h(infoJson, "infoJson");
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f764a = infoJson;
        this.f765b = actionHandler;
        this.f766c = ((Number) p206u5.c.c(infoJson, "layout_id", -1)).intValue();
        this.f768e = new AtomicInteger(-1);
    }

    private final View b(Context context) {
        TextView textView = new TextView(context);
        textView.setText(O5.a.f5888a.c("gadget_host_error_inflating"));
        textView.setBackgroundColor(Color.argb(127, 0, 0, 0));
        return textView;
    }

    private final Object l(Context context, View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        Object objB = new p226w5.a(p206u5.c.a(this.f764a, "action_info"), this.f765b).b(context, view, viewGroup, fVar, aVar, nVar, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    private final Object m(Context context, View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        Object objB = new p226w5.c(p206u5.c.a(this.f764a, "anim_info"), this.f765b).b(context, view, viewGroup, fVar, aVar, nVar, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    private final Object n(Context context, View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        Object objB = new p226w5.h(p206u5.c.a(this.f764a, "custom_info"), this.f765b).b(context, view, viewGroup, fVar, aVar, nVar, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    private final Object o(Context context, View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        Object objB = new p226w5.x(p206u5.c.a(this.f764a, "view_info"), this.f765b).b(context, view, viewGroup, fVar, aVar, nVar, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fe A[PHI: r8 r9 r10 r11 r12 r13 r14
      0x00fe: PHI (r8v3 'this' D5.h) = (r8v2 'this' D5.h), (r8v19 'this' D5.h) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r9v3 android.content.Context) = (r9v2 android.content.Context), (r9v11 android.content.Context) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r10v3 android.view.View) = (r10v2 android.view.View), (r10v11 android.view.View) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r11v3 android.view.ViewGroup) = (r11v2 android.view.ViewGroup), (r11v9 android.view.ViewGroup) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r12v3 w5.f) = (r12v2 w5.f), (r12v11 w5.f) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r13v3 v5.a) = (r13v2 v5.a), (r13v11 v5.a) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r14v3 w5.n) = (r14v2 w5.n), (r14v11 w5.n) binds: [B:28:0x00fb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        if (r8.n(r9, r10, r11, r12, r13, r14, r15) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r9, android.view.View r10, android.view.ViewGroup r11, p226w5.f r12, p216v5.a r13, p226w5.n r14, p129m8.e r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.h.a(android.content.Context, android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
    }

    public final int c() {
        return this.f766c;
    }

    public final View d() {
        View view = this.f767d;
        if (view == null || view.isAttachedToWindow()) {
            return null;
        }
        return this.f767d;
    }

    public final boolean e() {
        return this.f768e.get() == -1;
    }

    public final View f(Context context, ViewGroup rootParent) {
        Object objB;
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(rootParent, "rootParent");
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(rootParent.getContext()).cloneInContext(context);
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(layoutInflaterCloneInContext.inflate(this.f766c, rootParent, false));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.e("Host", "SimulateItemView inflate view error", thD);
        }
        Context context2 = rootParent.getContext();
        kotlin.jvm.internal.n.g(context2, "getContext(...)");
        View viewB = b(context2);
        if (p079h8.q.f(objB)) {
            objB = viewB;
        }
        return (View) objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(Context context, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        c cVar;
        h hVar;
        Throwable th;
        h hVar2;
        View view;
        Object objB;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i10 = cVar.f784v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f784v = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f782t;
        Object objE = p139n8.b.e();
        int i11 = cVar2.f784v;
        if (i11 == 0) {
            p079h8.r.b(obj);
            LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(viewGroup.getContext()).cloneInContext(context);
            try {
                h8.q.a aVar2 = p079h8.q.f21862r;
                View viewInflate = layoutInflaterCloneInContext.inflate(this.f766c, viewGroup, false);
                kotlin.jvm.internal.n.e(viewInflate);
                cVar2.f779q = this;
                cVar2.f780r = viewGroup;
                cVar2.f781s = viewInflate;
                cVar2.f784v = 1;
                hVar = this;
                try {
                    if (hVar.a(context, viewInflate, viewGroup, fVar, aVar, nVar, cVar2) == objE) {
                        return objE;
                    }
                    hVar2 = hVar;
                    view = viewInflate;
                    viewGroup = viewGroup;
                } catch (Throwable th2) {
                    th = th2;
                    viewGroup = viewGroup;
                    h8.q.a aVar3 = p079h8.q.f21862r;
                    objB = p079h8.q.b(p079h8.r.a(th));
                    hVar2 = hVar;
                }
            } catch (Throwable th3) {
                hVar = this;
                th = th3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            view = (View) cVar2.f781s;
            viewGroup = (ViewGroup) cVar2.f780r;
            hVar2 = (h) cVar2.f779q;
            try {
                p079h8.r.b(obj);
            } catch (Throwable th4) {
                th = th4;
                hVar = hVar2;
                h8.q.a aVar4 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
                hVar2 = hVar;
            }
        }
        objB = p079h8.q.b(view);
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.e("Host", "SimulateItemView inflate view error", thD);
        }
        Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.n.g(context2, "getContext(...)");
        return p079h8.q.f(objB) ? hVar2.b(context2) : objB;
    }

    public final boolean h() {
        return this.f768e.get() == 2;
    }

    public final void i() {
        this.f768e.set(2);
    }

    public final void j() {
        this.f768e.set(0);
    }

    public final void k() {
        this.f768e.set(1);
    }

    public final void p() {
        this.f767d = null;
        this.f768e.set(-1);
    }

    public final void q(View view) {
        this.f767d = view;
    }
}
