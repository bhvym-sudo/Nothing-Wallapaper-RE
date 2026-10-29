package D5;

import F8.L;
import android.content.Context;
import android.view.View;
import com.nothing.cardservice.ShareStickerInfo;
import com.nothing.cardservice.sharewidget.sticker.StickerView;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f912v = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f913q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f914r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f915s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f917u;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f915s = obj;
            this.f917u |= Integer.MIN_VALUE;
            return u.this.E(null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f918q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ View f919r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ShareStickerInfo f920s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, ShareStickerInfo shareStickerInfo, p129m8.e eVar) {
            super(2, eVar);
            this.f919r = view;
            this.f920s = shareStickerInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f919r, this.f920s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f918q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            F5.l.a aVar = F5.l.f1669g;
            Context context = ((StickerView) this.f919r).getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            return aVar.a(context).k(this.f920s.getStickName());
        }
    }

    public u(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r8.setStickerInfo((android.net.Uri) r7, r9, r0) == r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(android.view.View r8, java.lang.Object r9, p129m8.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof D5.u.b
            if (r0 == 0) goto L13
            r0 = r10
            D5.u$b r0 = (D5.u.b) r0
            int r1 = r0.f917u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f917u = r1
            goto L18
        L13:
            D5.u$b r0 = new D5.u$b
            r0.<init>(r10)
        L18:
            java.lang.Object r7 = r0.f915s
            java.lang.Object r10 = p139n8.b.e()
            int r1 = r0.f917u
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L45
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            p079h8.r.b(r7)
            goto L9a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r8 = r0.f914r
            com.nothing.cardservice.ShareStickerInfo r8 = (com.nothing.cardservice.ShareStickerInfo) r8
            java.lang.Object r9 = r0.f913q
            android.view.View r9 = (android.view.View) r9
            p079h8.r.b(r7)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L89
        L45:
            p079h8.r.b(r7)
            G5.c r7 = G5.c.f1948a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "setSticker value = "
            r1.append(r5)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "SimulatedTextView"
            r7.h(r5, r1)
            boolean r7 = r8 instanceof com.nothing.cardservice.sharewidget.sticker.StickerView
            if (r7 == 0) goto L9a
            com.nothing.cardservice.ShareStickerInfo$a r7 = com.nothing.cardservice.ShareStickerInfo.Companion
            java.lang.String r9 = r9.toString()
            com.nothing.cardservice.ShareStickerInfo r7 = r7.a(r9)
            if (r7 == 0) goto L9a
            F8.I r9 = F8.C0803b0.b()
            D5.u$c r1 = new D5.u$c
            r1.<init>(r8, r7, r4)
            r0.f913q = r8
            r0.f914r = r7
            r0.f917u = r3
            java.lang.Object r9 = F8.AbstractC0812g.g(r9, r1, r0)
            if (r9 != r10) goto L86
            goto L99
        L86:
            r6 = r9
            r9 = r7
            r7 = r6
        L89:
            android.net.Uri r7 = (android.net.Uri) r7
            com.nothing.cardservice.sharewidget.sticker.StickerView r8 = (com.nothing.cardservice.sharewidget.sticker.StickerView) r8
            r0.f913q = r4
            r0.f914r = r4
            r0.f917u = r2
            java.lang.Object r7 = r8.setStickerInfo(r7, r9, r0)
            if (r7 != r10) goto L9a
        L99:
            return r10
        L9a:
            h8.A r7 = p079h8.A.f21846a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.u.E(android.view.View, java.lang.Object, m8.e):java.lang.Object");
    }

    private final void F(View view, Object obj) {
        G5.c.f1948a.h("SimulatedTextView", "isStickerHidden value = " + obj);
        if (view instanceof StickerView) {
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                ((StickerView) view).setStickerVisible(bool.booleanValue());
            }
        }
    }

    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        if (kotlin.jvm.internal.n.d(str, "set_sticker")) {
            Object objE = E(view, obj, eVar);
            return objE == p139n8.b.e() ? objE : A.f21846a;
        }
        if (kotlin.jvm.internal.n.d(str, "setStickerVisible")) {
            F(view, obj);
            return A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }
}
