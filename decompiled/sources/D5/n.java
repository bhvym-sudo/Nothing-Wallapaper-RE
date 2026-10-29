package D5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f816y = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p226w5.j f817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p216v5.a f818x;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f819q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f820r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f822t;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f820r = obj;
            this.f822t |= Integer.MIN_VALUE;
            return n.this.J(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f823q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f824r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f825s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f826t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f827u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f829w;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f827u = obj;
            this.f829w |= Integer.MIN_VALUE;
            return n.this.M(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(JSONObject jSONObject, p226w5.j actionHandler) {
        super(jSONObject);
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f817w = actionHandler;
    }

    private final void I(View view, PendingIntent pendingIntent, String str) {
        p216v5.a aVar = this.f818x;
        if ((aVar != null ? aVar.onCardInteraction(view, pendingIntent, p216v5.b.f28528a.a(view)) : false) || str == null) {
            return;
        }
        Context context = view.getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        N(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J(View view, p129m8.e eVar) {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f822t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f822t = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f820r;
        Object objE = p139n8.b.e();
        int i11 = bVar.f822t;
        if (i11 == 0) {
            p079h8.r.b(obj);
            JSONObject jSONObjectI = i();
            if (jSONObjectI != null) {
                String strE = p206u5.c.e(jSONObjectI, "music_name");
                if (strE == null) {
                    strE = "";
                }
                Object bVar2 = new N5.b(strE, p206u5.c.e(jSONObjectI, "artist_name"), p206u5.c.e(jSONObjectI, "album_name"), null, null, ((Number) p206u5.c.c(jSONObjectI, "music_duration", kotlin.coroutines.jvm.internal.b.c(0))).intValue(), p206u5.c.e(jSONObjectI, "music_package_name"), null, (byte) 0, null, null, null, 3968, null);
                G5.c.b("SimulatedMediaPlayerContainerView", "setAllMusicMeta: " + bVar2);
                bVar.f819q = bVar2;
                bVar.f822t = 1;
                if (l(view, "setMusicMetaData", bVar2, bVar) == objE) {
                    return objE;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
        }
        return A.f21846a;
    }

    private final Object K(View view, p129m8.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Consumer consumer = new Consumer() { // from class: D5.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                n.L(this.f815a, (p079h8.u) obj);
            }
        };
        arrayList.add(Consumer.class);
        arrayList2.add(consumer);
        Object objM = m(arrayList, arrayList2, "setOpenAppListener", view, eVar);
        return objM == p139n8.b.e() ? objM : A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(n this$0, p079h8.u it) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(it, "it");
        this$0.I((View) it.d(), (PendingIntent) it.e(), (String) it.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (super.p(r6, r7, r8, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(android.view.View r6, java.lang.String r7, java.lang.Object r8, p129m8.e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof D5.n.c
            if (r0 == 0) goto L13
            r0 = r9
            D5.n$c r0 = (D5.n.c) r0
            int r1 = r0.f829w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f829w = r1
            goto L18
        L13:
            D5.n$c r0 = new D5.n$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f827u
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f829w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p079h8.r.b(r9)
            goto L75
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r8 = r0.f826t
            java.lang.Object r5 = r0.f825s
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.f824r
            r6 = r5
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r5 = r0.f823q
            D5.n r5 = (D5.n) r5
            p079h8.r.b(r9)
            goto L63
        L48:
            p079h8.r.b(r9)
            java.lang.String r9 = "SimulatedMediaPlayerContainerView"
            java.lang.String r2 = "setWidgetId>>>"
            G5.c.b(r9, r2)
            r0.f823q = r5
            r0.f824r = r6
            r0.f825s = r7
            r0.f826t = r8
            r0.f829w = r4
            java.lang.Object r9 = r5.K(r6, r0)
            if (r9 != r1) goto L63
            goto L74
        L63:
            r9 = 0
            r0.f823q = r9
            r0.f824r = r9
            r0.f825s = r9
            r0.f826t = r9
            r0.f829w = r3
            java.lang.Object r5 = super.p(r6, r7, r8, r0)
            if (r5 != r1) goto L75
        L74:
            return r1
        L75:
            h8.A r5 = p079h8.A.f21846a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.n.M(android.view.View, java.lang.String, java.lang.Object, m8.e):java.lang.Object");
    }

    private final void N(Context context, String str) {
        Object objB;
        A a10;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
                context.startActivity(launchIntentForPackage);
                a10 = A.f21846a;
            } else {
                a10 = null;
            }
            objB = p079h8.q.b(a10);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.d(objB) != null) {
            Log.e("SimulatedMediaPlayerContainerView", "doStartApplicationWithPackageName error: " + str);
        }
    }

    @Override // D5.w
    public Object B(View view, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        this.f818x = aVar;
        Object objB = super.B(view, viewGroup, fVar, aVar, nVar, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r4.equals("music_name") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r4.equals("album_name") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r4.equals("music_duration") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r4.equals("artist_name") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        return p079h8.A.f21846a;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // D5.x, D5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(android.view.View r3, java.lang.String r4, java.lang.Object r5, p129m8.e r6) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "performApply key: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SimulatedMediaPlayerContainerView"
            G5.c.b(r1, r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1937323901: goto L6f;
                case -1157911954: goto L66;
                case -846372261: goto L5d;
                case -780184475: goto L54;
                case 590119169: goto L3d;
                case 717626046: goto L26;
                default: goto L25;
            }
        L25:
            goto L77
        L26:
            java.lang.String r0 = "music_package_name"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L2f
            goto L77
        L2f:
            java.lang.Object r2 = r2.J(r3, r6)
            java.lang.Object r3 = p139n8.b.e()
            if (r2 != r3) goto L3a
            return r2
        L3a:
            h8.A r2 = p079h8.A.f21846a
            return r2
        L3d:
            java.lang.String r0 = "setWidgetId"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L46
            goto L77
        L46:
            java.lang.Object r2 = r2.M(r3, r4, r5, r6)
            java.lang.Object r3 = p139n8.b.e()
            if (r2 != r3) goto L51
            return r2
        L51:
            h8.A r2 = p079h8.A.f21846a
            return r2
        L54:
            java.lang.String r0 = "music_name"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L85
            goto L77
        L5d:
            java.lang.String r0 = "album_name"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L85
            goto L77
        L66:
            java.lang.String r0 = "music_duration"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L85
            goto L77
        L6f:
            java.lang.String r0 = "artist_name"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L85
        L77:
            java.lang.Object r2 = super.p(r3, r4, r5, r6)
            java.lang.Object r3 = p139n8.b.e()
            if (r2 != r3) goto L82
            return r2
        L82:
            h8.A r2 = p079h8.A.f21846a
            return r2
        L85:
            h8.A r2 = p079h8.A.f21846a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.n.p(android.view.View, java.lang.String, java.lang.Object, m8.e):java.lang.Object");
    }
}
