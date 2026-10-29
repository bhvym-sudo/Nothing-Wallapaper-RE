package com.nothing.cardhost;

import F5.o;
import F8.A0;
import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.K;
import com.nothing.cardparser.CardView;
import com.nothing.cardparser.ICardView;
import com.nothing.cardservice.BaseShareInfo;
import com.nothing.commBase.deferred.DeferringController;
import com.nothing.commBase.deferred.IDeferring;
import com.nothing.commBase.deferred.IDeferringObservable;
import com.nothing.commBase.deferred.IDeferringObserver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p219v8.p;
import p226w5.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends FrameLayout implements com.nothing.cardhost.h, IDeferringObserver, IDeferringObservable {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final b f17899h0 = new b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f17900A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p186s5.e f17901B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f17902C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p226w5.f f17903D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private SparseIntArray f17904E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private CardView f17905F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f17906G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private AtomicBoolean f17907H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private SparseArray f17908I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f17909J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private CancellationSignal f17910K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f17911L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private InterfaceC0846x0 f17912M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private InterfaceC0846x0 f17913N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private InterfaceC0846x0 f17914O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private InterfaceC0846x0 f17915P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.nothing.cardhost.i f17916Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final DeferringController f17917R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private IDeferringObserver f17918S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private P5.a f17919T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private a f17920U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f17921V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Boolean f17922W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p216v5.c f17923a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f17924b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final h f17925c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final e f17926d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final f f17927e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final d f17928f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final n f17929g0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p216v5.a f17930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Context f17933t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17934u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private F5.m f17935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f17936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f17937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17938y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f17939z;

    public static final class a implements O5.b.InterfaceC0194b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f17940a;

        public a(g host) {
            kotlin.jvm.internal.n.h(host, "host");
            this.f17940a = new WeakReference(host);
        }

        @Override // O5.b.InterfaceC0194b
        public void onBroadcastReceive(Intent intent) {
            kotlin.jvm.internal.n.h(intent, "intent");
            g gVar = (g) this.f17940a.get();
            if (gVar != null) {
                String action = intent.getAction();
                if (action == null) {
                    action = "";
                }
                gVar.a0(action);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Rect b(Context context, Rect rect) {
            return new Rect(21, 21, 21, 21);
        }

        private b() {
        }
    }

    private final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CardView f17941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f17943c;

        public c(g gVar, CardView cardView, boolean z9) {
            kotlin.jvm.internal.n.h(cardView, "cardView");
            this.f17943c = gVar;
            this.f17941a = cardView;
            this.f17942b = z9;
        }

        @Override // p226w5.u
        public void a(Throwable th) {
            Throwable th2;
            if (this.f17942b) {
                g gVar = this.f17943c;
                CardView cardView = this.f17941a;
                Context context = gVar.getContext();
                kotlin.jvm.internal.n.g(context, "getContext(...)");
                g gVar2 = this.f17943c;
                gVar.f17910K = ICardView.DefaultImpls.applyAsync$default(cardView, context, gVar2, new c(gVar2, this.f17941a, false), null, null, 16, null);
                th2 = th;
            } else {
                th2 = th;
                g.A(this.f17943c, null, th2, false, 4, null);
            }
            this.f17943c.f17910K = null;
            this.f17943c.S(th2);
            G5.c.d("CardWidgetHostView", "Call back parser content error, e = " + (th2 != null ? th2.getMessage() : null));
        }

        @Override // p226w5.u
        public void b(View view, View view2) {
            u.a.a(this, view, view2);
        }

        @Override // p226w5.u
        public void c(View view, View view2) {
            this.f17943c.f17937x = 1;
            this.f17943c.f17939z = view;
            this.f17943c.f17900A = view2;
            this.f17943c.f17926d0.a(this.f17943c.f17911L == 1 ? view : view2, null);
            this.f17943c.B();
            this.f17943c.f17910K = null;
            g gVar = this.f17943c;
            gVar.T(view, view2, gVar.f17911L);
            G5.c.b("CardWidgetHostView", "Call back content parse successfully");
        }
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private CardView f17944q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f17945r = true;

        d() {
        }

        public static /* synthetic */ void b(d dVar, CardView cardView, boolean z9, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            dVar.a(cardView, z9);
        }

        public final void a(CardView cardView, boolean z9) {
            this.f17944q = cardView;
            this.f17945r = z9;
            g.this.f17917R.runOnDeferringEnd(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.y(this.f17944q, this.f17945r);
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private View f17947q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Throwable f17948r;

        e() {
        }

        public final void a(View view, Throwable th) {
            this.f17947q = view;
            this.f17948r = th;
            g.this.f17917R.runOnDeferringEnd(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.A(g.this, this.f17947q, this.f17948r, false, 4, null);
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private View f17950q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private BaseShareInfo f17951r;

        f() {
        }

        public final void a() {
            p216v5.c shareActionHandler;
            BaseShareInfo baseShareInfo = this.f17951r;
            if (baseShareInfo != null) {
                g gVar = g.this;
                if (baseShareInfo.getShareState() != 1 || (shareActionHandler = gVar.getShareActionHandler()) == null) {
                    return;
                }
                shareActionHandler.b(baseShareInfo.getWidgetId());
            }
        }

        public final void b(View view, BaseShareInfo baseShareInfo) {
            this.f17950q = view;
            this.f17951r = baseShareInfo;
            g.this.f17917R.runOnDeferringEnd(this);
        }

        public final void c() {
            p186s5.e eVar;
            BaseShareInfo baseShareInfo = this.f17951r;
            if (baseShareInfo == null || (eVar = g.this.f17901B) == null) {
                return;
            }
            eVar.p(baseShareInfo);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17950q != null) {
                c();
            }
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardhost.g$g, reason: collision with other inner class name */
    static final class C0477g extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17953q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ CardView f17954r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o f17955s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ g f17956t;

        /* JADX INFO: renamed from: com.nothing.cardhost.g$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17957q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ o f17958r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ CardView f17959s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, CardView cardView, p129m8.e eVar) {
                super(2, eVar);
                this.f17958r = oVar;
                this.f17959s = cardView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f17958r, this.f17959s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String strC;
                p139n8.b.e();
                if (this.f17957q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                o oVar = this.f17958r;
                return kotlin.coroutines.jvm.internal.b.a((oVar == null || (strC = oVar.c()) == null) ? false : this.f17959s.checkHasUpdatePeriodMinute(strC));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0477g(CardView cardView, o oVar, g gVar, p129m8.e eVar) {
            super(2, eVar);
            this.f17954r = cardView;
            this.f17955s = oVar;
            this.f17956t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new C0477g(this.f17954r, this.f17955s, this.f17956t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0477g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            if (r15 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r14.f17953q
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                p079h8.r.b(r15)
                r13 = r14
                goto L74
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L1c:
                p079h8.r.b(r15)
                r13 = r14
                goto L5e
            L21:
                p079h8.r.b(r15)
                com.nothing.cardparser.CardView r5 = r14.f17954r
                F5.o r15 = r14.f17955s
                if (r15 == 0) goto L30
                java.lang.String r15 = r15.c()
                r6 = r15
                goto L31
            L30:
                r6 = r4
            L31:
                com.nothing.cardhost.g r15 = r14.f17956t
                android.content.Context r7 = r15.getContext()
                java.lang.String r15 = "getContext(...)"
                kotlin.jvm.internal.n.g(r7, r15)
                com.nothing.cardhost.g r15 = r14.f17956t
                android.view.View r8 = com.nothing.cardhost.g.q(r15)
                com.nothing.cardhost.g r15 = r14.f17956t
                android.view.View r9 = com.nothing.cardhost.g.s(r15)
                com.nothing.cardhost.g r10 = r14.f17956t
                w5.f r11 = com.nothing.cardhost.g.m(r10)
                com.nothing.cardhost.g r15 = r14.f17956t
                v5.a r12 = r15.getHandler()
                r14.f17953q = r3
                r13 = r14
                java.lang.Object r14 = r5.applyViewDataChanged(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r14 != r0) goto L5e
                goto L73
            L5e:
                F8.I r14 = F8.C0803b0.b()
                com.nothing.cardhost.g$g$a r15 = new com.nothing.cardhost.g$g$a
                F5.o r1 = r13.f17955s
                com.nothing.cardparser.CardView r3 = r13.f17954r
                r15.<init>(r1, r3, r4)
                r13.f17953q = r2
                java.lang.Object r15 = F8.AbstractC0812g.g(r14, r15, r13)
                if (r15 != r0) goto L74
            L73:
                return r0
            L74:
                r14 = r15
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L7e
                r4 = r15
            L7e:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                if (r4 == 0) goto L87
                com.nothing.cardhost.g r14 = r13.f17956t
                r14.j0()
            L87:
                h8.A r14 = p079h8.A.f21846a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nothing.cardhost.g.C0477g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h implements ComponentCallbacks {
        h() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            kotlin.jvm.internal.n.h(newConfig, "newConfig");
            g.this.P(newConfig);
            G5.c.f1948a.h("CardWidgetHostView", "onConfigurationChanged, config = " + newConfig + ", hostView = " + this + "@CardWidgetHostView");
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17961q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ View f17962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f17963s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f17964t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(View view, int i10, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f17962r = view;
            this.f17963s = i10;
            this.f17964t = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new i(this.f17962r, this.f17963s, this.f17964t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17961q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            ((P5.b) this.f17962r).onWidgetViewRemoved(this.f17963s);
            if (this.f17964t) {
                ((P5.b) this.f17962r).onAllWidgetViewRemoved();
            }
            return A.f21846a;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17965q;

        j(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new j(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((j) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17965q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            g gVar = g.this;
            try {
                q.a aVar = q.f21862r;
                gVar.F(gVar);
                q.b(kotlin.coroutines.jvm.internal.b.a(gVar.K(gVar)));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
            return A.f21846a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17967q;

        k(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new k(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((k) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17967q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            CardView cardView = g.this.f17905F;
            if (cardView != null) {
                cardView.onHostViewPeriodTimeUp();
            }
            return A.f21846a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17969q;

        l(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new l(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17969q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            CardView cardView = g.this.f17905F;
            if (cardView != null) {
                cardView.onHostViewResume();
            }
            g.this.f17927e0.a();
            return A.f21846a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17971q;

        m(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new m(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((m) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17971q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            CardView cardView = g.this.f17905F;
            if (cardView != null) {
                cardView.onHostViewStop();
            }
            return A.f21846a;
        }
    }

    public static final class n implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private o f17973q;

        n() {
        }

        public final void a(o oVar) {
            this.f17973q = oVar;
            g.this.f17917R.runOnDeferringEnd(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.D(this.f17973q);
        }
    }

    public /* synthetic */ g(Context context, p216v5.a aVar, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this(context, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? false : z9);
    }

    public static /* synthetic */ void A(g gVar, View view, Throwable th, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyContent");
        }
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        gVar.z(view, th, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        if (this.f17932s) {
            this.f17932s = false;
            H(true);
        }
    }

    private final void C(BaseShareInfo baseShareInfo) {
        if (baseShareInfo == null) {
            return;
        }
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        this.f17901B = new p186s5.e(context, this, this.f17934u, this.f17930q, this.f17923a0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(o oVar) {
        CardView cardView = this.f17905F;
        if (cardView != null) {
            AbstractC0816i.d(O5.g.k(), null, null, new C0477g(cardView, oVar, this, null), 3, null);
            cardView.updateViewInfoJson(oVar != null ? oVar.g() : null);
        }
    }

    private final void E() {
        InterfaceC0846x0 interfaceC0846x0 = this.f17912M;
        if (interfaceC0846x0 != null && interfaceC0846x0.a()) {
            InterfaceC0846x0 interfaceC0846x1 = this.f17912M;
            if (interfaceC0846x1 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
            }
            this.f17912M = null;
        }
        InterfaceC0846x0 interfaceC0846x2 = this.f17913N;
        if (interfaceC0846x2 != null && interfaceC0846x2.a()) {
            InterfaceC0846x0 interfaceC0846x3 = this.f17913N;
            if (interfaceC0846x3 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x3, null, 1, null);
            }
            this.f17913N = null;
        }
        InterfaceC0846x0 interfaceC0846x4 = this.f17914O;
        if (interfaceC0846x4 != null && interfaceC0846x4.a()) {
            InterfaceC0846x0 interfaceC0846x5 = this.f17914O;
            if (interfaceC0846x5 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x5, null, 1, null);
            }
            this.f17914O = null;
        }
        p186s5.e eVar = this.f17901B;
        if (eVar != null) {
            eVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean F(ViewGroup viewGroup) {
        if ((viewGroup instanceof IDeferringObserver) && !(viewGroup instanceof g)) {
            this.f17918S = (IDeferringObserver) viewGroup;
            return true;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f17915P;
        if (interfaceC0846x0 != null) {
            A0.i(interfaceC0846x0);
        }
        for (View view : K.b(viewGroup)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (viewGroup2.getVisibility() == 0 && F(viewGroup2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean K(View view) {
        if ((view instanceof P5.a) && !(view instanceof g)) {
            this.f17919T = (P5.a) view;
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        Iterator it = K.b((ViewGroup) view).iterator();
        while (it.hasNext()) {
            if (K((View) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final int L() {
        return getId() == -1 ? this.f17934u : getId();
    }

    private final void M(CardView cardView) {
        CancellationSignal cancellationSignal = this.f17910K;
        if (cancellationSignal != null) {
            kotlin.jvm.internal.n.e(cancellationSignal);
            cancellationSignal.cancel();
        }
        if (this.f17910K == null) {
            Context context = getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            this.f17910K = cardView.applyAsync(context, this, new c(this, cardView, false), this.f17903D, this.f17930q);
        }
    }

    private final boolean O(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        if (sparseIntArray.size() != sparseIntArray2.size()) {
            return false;
        }
        int size = sparseIntArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (sparseIntArray.keyAt(i10) != sparseIntArray2.keyAt(i10) || sparseIntArray.valueAt(i10) != sparseIntArray2.valueAt(i10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Configuration configuration) {
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                cardView.onHostConfigChanged(configuration);
                return;
            }
            return;
        }
        G5.c.d("Host", "Can not call onHostConfigChanged method for view status = " + i10);
    }

    private final void R(boolean z9) {
        com.nothing.cardhost.j jVar;
        com.nothing.cardhost.i iVarC;
        this.f17921V = z9;
        G(z9);
        H(z9);
        if (!kotlin.jvm.internal.n.d(getContext().getPackageName(), "com.android.systemui")) {
            I(z9);
        }
        if (!z9 || (iVarC = (jVar = com.nothing.cardhost.j.f17984a).c(this.f17934u)) == null) {
            return;
        }
        iVarC.i(jVar.b(), this);
    }

    private final void W() {
        InterfaceC0846x0 interfaceC0846x0;
        int i10 = this.f17937x;
        if (i10 != 1) {
            this.f17932s = true;
            G5.c.d("Host", "Can not call onHostViewResume method for view status = " + i10);
            return;
        }
        InterfaceC0846x0 interfaceC0846x1 = this.f17912M;
        if (interfaceC0846x1 != null && interfaceC0846x1.a() && (interfaceC0846x0 = this.f17912M) != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f17912M = AbstractC0816i.d(O5.g.j(), null, null, new l(null), 3, null);
    }

    private final void X() {
        InterfaceC0846x0 interfaceC0846x0;
        this.f17932s = false;
        int i10 = this.f17937x;
        if (i10 != 1) {
            G5.c.d("Host", "Can not call onHostViewStop method for view status = " + i10);
            return;
        }
        InterfaceC0846x0 interfaceC0846x1 = this.f17913N;
        if (interfaceC0846x1 != null && interfaceC0846x1.a() && (interfaceC0846x0 = this.f17913N) != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f17913N = AbstractC0816i.d(O5.g.j(), null, null, new m(null), 3, null);
    }

    private final void Z() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        saveHierarchyState(sparseArray);
        this.f17917R.runOnDeferringEnd(this.f17928f0);
        restoreHierarchyState(sparseArray);
    }

    private final void c0() {
        CardView cardView;
        List<String> broadcastConfig;
        if (!isAttachedToWindow() || this.f17937x != 1 || (cardView = this.f17905F) == null || (broadcastConfig = cardView.getBroadcastConfig()) == null) {
            return;
        }
        if (broadcastConfig.contains(I5.a.NONE.e())) {
            m0();
            return;
        }
        if (broadcastConfig.isEmpty()) {
            return;
        }
        a aVar = this.f17920U;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f17920U = aVar;
        Context applicationContext = getContext().getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        a aVar2 = this.f17920U;
        kotlin.jvm.internal.n.e(aVar2);
        O5.b.a(applicationContext, aVar2, broadcastConfig);
        G5.c.f1948a.h("CardWidgetHostView", "Add receiver for host = " + this);
    }

    private final void d0() {
        Context context = getContext();
        if (context != null) {
            context.registerComponentCallbacks(this.f17925c0);
        }
    }

    private final void g0() {
        String strH;
        long j9 = this.f17909J;
        SparseArray<Parcelable> sparseArray = this.f17908I;
        if (j9 == -1 && j9 == this.f17906G) {
            this.f17909J = -1L;
            this.f17908I = null;
            try {
                super.dispatchRestoreInstanceState(sparseArray);
            } catch (Exception e10) {
                if (this.f17935v == null) {
                    strH = "null";
                } else {
                    F5.m mVar = this.f17935v;
                    kotlin.jvm.internal.n.e(mVar);
                    strH = mVar.H();
                }
                G5.c.e("Host", "failed to restoreInstanceState for widget id: " + this.f17934u + ", " + strH, e10);
            }
        }
    }

    private final Rect getDefaultPadding() {
        b bVar = f17899h0;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        return bVar.b(context, null);
    }

    private final Context getRemoteTargetContext() {
        Object objB;
        Context context;
        F5.m mVar = this.f17935v;
        String strH = mVar != null ? mVar.H() : null;
        if (kotlin.jvm.internal.n.d(getContext().getPackageName(), strH)) {
            Context context2 = getContext();
            kotlin.jvm.internal.n.e(context2);
            return context2;
        }
        try {
            q.a aVar = q.f21862r;
            if (strH != null) {
                ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(strH, Optimizer.OPTIMIZATION_GRAPH_WRAP);
                kotlin.jvm.internal.n.g(applicationInfo, "getApplicationInfo(...)");
                Context context3 = getContext();
                kotlin.jvm.internal.n.g(context3, "getContext(...)");
                Object objB2 = E5.f.a(context3).a("createApplicationContext", ApplicationInfo.class, Integer.TYPE).b(getContext(), applicationInfo, 4);
                kotlin.jvm.internal.n.f(objB2, "null cannot be cast to non-null type android.content.Context");
                context = (Context) objB2;
            } else {
                context = getContext();
            }
            objB = q.b(context);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Context context4 = getContext();
        if (q.f(objB)) {
            objB = context4;
        }
        kotlin.jvm.internal.n.e(objB);
        return (Context) objB;
    }

    private final void k0() {
        Context context = getContext();
        if (context != null) {
            context.unregisterComponentCallbacks(this.f17925c0);
        }
    }

    private final void m0() {
        a aVar = this.f17920U;
        if (aVar != null) {
            Context context = getContext();
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
                O5.b.d(applicationContext, aVar);
            }
            G5.c.f1948a.h("CardWidgetHostView", "Remove receiver for host = " + aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(CardView cardView, boolean z9) {
        View defaultView;
        this.f17906G = cardView != null ? cardView.getWidgetId() : -1L;
        CancellationSignal cancellationSignal = this.f17910K;
        if (cancellationSignal != null) {
            kotlin.jvm.internal.n.e(cancellationSignal);
            cancellationSignal.cancel();
            this.f17910K = null;
        }
        if (cardView == null) {
            if (this.f17937x == 3) {
                return;
            }
            G5.c.f1948a.h("Host", "cardView == null, using initLayout to inflate");
            defaultView = getDefaultView();
            this.f17937x = 3;
        } else {
            if (z9) {
                M(cardView);
                return;
            }
            Context context = getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            p079h8.o oVarApply = cardView.apply(context, this, this.f17903D, this.f17930q);
            this.f17939z = (View) oVarApply.c();
            defaultView = (View) oVarApply.d();
            this.f17900A = defaultView;
            if (this.f17911L == 1) {
                defaultView = this.f17939z;
            }
            this.f17937x = 1;
            B();
        }
        this.f17926d0.a(defaultView, null);
    }

    public void G(boolean z9) {
        if (z9) {
            i0();
        } else {
            J();
        }
    }

    public void H(boolean z9) {
        if (z9) {
            W();
        } else {
            X();
        }
    }

    public void I(boolean z9) {
        com.nothing.cardhost.i iVar = this.f17916Q;
        if (iVar != null) {
            iVar.k(z9);
        }
    }

    public final void J() {
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                cardView.onEndAnim();
                return;
            }
            return;
        }
        G5.c.d("Host", "Can not control anim for view status = " + i10);
    }

    public final boolean N() {
        return this.f17907H.get();
    }

    public final void Q(View view, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(view, "view");
        if (view instanceof P5.b) {
            AbstractC0816i.d(O5.g.j(), null, null, new i(view, i10, z9, null), 3, null);
        }
        if (view instanceof ViewGroup) {
            Iterator it = K.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                Q((View) it.next(), i10, z9);
            }
        }
    }

    public void S(Throwable th) {
    }

    public void T(View view, View view2, int i10) {
    }

    public void U() {
        Trace.beginSection("HostView:onRootViewResume");
        R(true);
        Trace.endSection();
    }

    public void V() {
        R(false);
    }

    protected void Y(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.nothing.cardhost.h
    public void a() {
        InterfaceC0846x0 interfaceC0846x0;
        int i10 = this.f17937x;
        if (i10 != 1) {
            G5.c.d("Host", "Can not call onHostRefresh method for view status = " + i10);
            return;
        }
        InterfaceC0846x0 interfaceC0846x1 = this.f17914O;
        if (interfaceC0846x1 != null && interfaceC0846x1.a() && (interfaceC0846x0 = this.f17914O) != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f17914O = AbstractC0816i.d(O5.g.j(), null, null, new k(null), 3, null);
    }

    public void a0(String action) {
        kotlin.jvm.internal.n.h(action, "action");
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                cardView.onBroadcastReceive(action);
                return;
            }
            return;
        }
        G5.c.d("Host", "Can not call onBroadcastReceive method for view status = " + i10);
    }

    public final void b0() {
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                cardView.registerAnimListener();
                return;
            }
            return;
        }
        G5.c.d("Host", "Can not registerAnimListeners for view status = " + i10);
    }

    @Override // com.nothing.commBase.deferred.IDeferringObservable
    public void beginDeferring(long j9) {
        IDeferring deferringController;
        this.f17917R.beginDeferring(j9);
        IDeferringObserver iDeferringObserver = this.f17918S;
        if (iDeferringObserver == null || (deferringController = iDeferringObserver.getDeferringController()) == null) {
            return;
        }
        deferringController.beginDeferring(j9);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray container) {
        Object objB;
        kotlin.jvm.internal.n.h(container, "container");
        Parcelable parcelable = (Parcelable) container.get(L());
        SparseArray sparseParcelableArray = null;
        long j9 = -1;
        if (parcelable instanceof Bundle) {
            try {
                q.a aVar = q.f21862r;
                sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("jail");
                objB = q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            if (q.d(objB) != null) {
                G5.c.d("CardWidgetHostView", "HostView dispatchRestoreInstanceState error.");
            }
            j9 = ((Bundle) parcelable).getLong("inflation_id", -1L);
        }
        if (sparseParcelableArray == null) {
            sparseParcelableArray = new SparseArray();
        }
        this.f17908I = sparseParcelableArray;
        this.f17909J = j9;
        g0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray container) {
        kotlin.jvm.internal.n.h(container, "container");
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        super.dispatchSaveInstanceState(sparseArray);
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("jail", sparseArray);
        bundle.putLong("inflation_id", this.f17906G);
        container.put(L(), bundle);
        container.put(L(), bundle);
    }

    public final void e0() {
        p186s5.e eVar = this.f17901B;
        if (eVar != null) {
            eVar.i();
            View childAt = getChildAt(0);
            if (childAt instanceof ViewGroup) {
                ((ViewGroup) childAt).removeView(eVar.j());
            }
            this.f17901B = null;
        }
    }

    @Override // com.nothing.commBase.deferred.IDeferringObservable
    public void endDeferring() {
        IDeferring deferringController;
        this.f17917R.endDeferring();
        IDeferringObserver iDeferringObserver = this.f17918S;
        if (iDeferringObserver == null || (deferringController = iDeferringObserver.getDeferringController()) == null) {
            return;
        }
        deferringController.endDeferring();
    }

    public void f0(F5.m mVar) {
        h0(this.f17934u, mVar);
    }

    public final int getAppWidgetId() {
        return this.f17934u;
    }

    public final F5.m getAppWidgetInfo() {
        return this.f17935v;
    }

    protected final a getBroadcastListener() {
        return this.f17920U;
    }

    public final Boolean getCurScreenVisibility() {
        return this.f17922W;
    }

    protected View getDefaultView() {
        return this.f17935v == null ? getErrorView() : new View(getContext());
    }

    @Override // com.nothing.commBase.deferred.IDeferringObserver
    public IDeferring getDeferringController() {
        return this.f17917R;
    }

    protected View getErrorView() {
        TextView textView = new TextView(getContext());
        textView.setText(O5.a.f5888a.c("gadget_host_error_inflating"));
        textView.setBackgroundColor(Color.argb(127, 0, 0, 0));
        return textView;
    }

    public final Bundle getExtraInfo() {
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                return cardView.getExtraInfo();
            }
            return null;
        }
        G5.c.d("Host", "Can not get card extra info for view status = " + i10);
        return null;
    }

    public final boolean getForceResumed() {
        return this.f17924b0;
    }

    @Override // android.view.View
    public final p216v5.a getHandler() {
        return this.f17930q;
    }

    public final boolean getLastHostVisibility() {
        return this.f17921V;
    }

    public int getPeriodTime() {
        CardView cardView;
        if (this.f17937x != 1 || (cardView = this.f17905F) == null) {
            return -1;
        }
        return cardView.getPeriodTime().intValue();
    }

    public final p216v5.c getShareActionHandler() {
        return this.f17923a0;
    }

    public void h0(int i10, F5.m mVar) {
        this.f17934u = i10;
        this.f17935v = mVar;
        Rect defaultPadding = getDefaultPadding();
        setPadding(defaultPadding.left, defaultPadding.top, defaultPadding.right, defaultPadding.bottom);
        if (mVar != null) {
            Context context = getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            setContentDescription(mVar.g(context));
        }
    }

    public final void i0() {
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                cardView.onStartAnim();
                return;
            }
            return;
        }
        G5.c.d("Host", "Can not control anim for view status = " + i10);
    }

    public void j0() {
        com.nothing.cardhost.i iVar;
        if (this.f17937x != 1) {
            com.nothing.cardhost.i iVar2 = this.f17916Q;
            if (iVar2 != null) {
                iVar2.l(-1);
                return;
            }
            return;
        }
        com.nothing.cardhost.j jVar = com.nothing.cardhost.j.f17984a;
        this.f17916Q = jVar.c(this.f17934u);
        int periodTime = getPeriodTime();
        com.nothing.cardhost.i iVar3 = this.f17916Q;
        if (iVar3 != null) {
            if (iVar3 != null) {
                iVar3.l(periodTime);
            }
            com.nothing.cardhost.i iVar4 = this.f17916Q;
            if (iVar4 != null) {
                iVar4.i(jVar.b(), this);
            }
            if (periodTime == -1) {
                jVar.f(this.f17934u);
            }
        } else if (periodTime != -1) {
            com.nothing.cardhost.i iVar5 = new com.nothing.cardhost.i(getPeriodTime(), jVar.b(), this);
            jVar.d(this.f17934u, iVar5);
            this.f17916Q = iVar5;
        }
        if (!this.f17921V || (iVar = this.f17916Q) == null) {
            return;
        }
        iVar.j();
    }

    public final void l0() {
        int i10 = this.f17937x;
        if (i10 == 1) {
            CardView cardView = this.f17905F;
            if (cardView != null) {
                cardView.unregisterAnimListener();
                return;
            }
            return;
        }
        G5.c.d("Host", "Can not unregisterAnimListeners for view status = " + i10);
    }

    public void n0(o oVar) {
        CardView cardView;
        this.f17907H.set(true);
        if ((oVar != null ? oVar.g() : null) != null) {
            Context context = getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            cardView = new CardView(context, this.f17934u, oVar, this.f17931r, this.f17911L);
        } else {
            cardView = null;
        }
        this.f17905F = cardView;
        d.b(this.f17928f0, cardView, false, 2, null);
    }

    public final void o0(BaseShareInfo shareInfo) {
        kotlin.jvm.internal.n.h(shareInfo, "shareInfo");
        p186s5.e eVar = this.f17901B;
        if (eVar != null) {
            eVar.p(shareInfo);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17921V = true;
        d0();
        c0();
        b0();
    }

    @Override // com.nothing.commBase.deferred.IDeferringObserver
    public void onCardRemoved(int i10) {
        IDeferringObserver iDeferringObserver = this.f17918S;
        if (iDeferringObserver != null) {
            iDeferringObserver.onCardRemoved(i10);
        }
    }

    @Override // com.nothing.commBase.deferred.IDeferringObserver
    public void onCardVisibilityChanged(boolean z9) {
        if (!kotlin.jvm.internal.n.d(this.f17922W, Boolean.valueOf(z9)) || (z9 && this.f17924b0)) {
            this.f17922W = Boolean.valueOf(z9);
            this.f17924b0 = this.f17937x == 0;
            IDeferringObserver iDeferringObserver = this.f17918S;
            if (iDeferringObserver != null) {
                iDeferringObserver.onCardVisibilityChanged(z9);
            }
            if (!z9) {
                X();
                return;
            }
            W();
            p216v5.c cVar = this.f17923a0;
            if (cVar != null) {
                cVar.a(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        k0();
        m0();
        l0();
        E();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        try {
            if (this.f17938y) {
                this.f17938y = false;
                throw new IllegalArgumentException("CurrentView onMeasure error!");
            }
            super.onLayout(z9, i10, i11, i12, i13);
            InterfaceC0846x0 interfaceC0846x0 = this.f17915P;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            this.f17915P = AbstractC0816i.d(O5.g.j(), null, null, new j(null), 3, null);
        } catch (RuntimeException e10) {
            G5.c.e("Host", "Remote provider threw runtime exception, using error view instead", e10);
            removeViewInLayout(this.f17936w);
            View errorView = getErrorView();
            Y(errorView);
            addViewInLayout(errorView, 0, errorView.getLayoutParams());
            measureChild(errorView, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), BasicMeasure.EXACTLY));
            errorView.layout(0, 0, errorView.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), errorView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
            this.f17936w = errorView;
            this.f17937x = 2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        Object objB;
        try {
            q.a aVar = q.f21862r;
            super.onMeasure(i10, i11);
            objB = q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            G5.c.f1948a.c("CardWidgetHostView onMeasure child error: " + thD);
            setMeasuredDimension(i10, i11);
            this.f17938y = true;
        }
    }

    public void p0(o oVar) {
        this.f17929g0.a(oVar);
    }

    protected final void setBroadcastListener(a aVar) {
        this.f17920U = aVar;
    }

    public void setColorResources(SparseIntArray colorMapping) {
        kotlin.jvm.internal.n.h(colorMapping, "colorMapping");
        SparseIntArray sparseIntArray = this.f17904E;
        if (sparseIntArray != null) {
            kotlin.jvm.internal.n.e(sparseIntArray);
            if (O(sparseIntArray, colorMapping)) {
                return;
            }
        }
        this.f17904E = colorMapping.clone();
        w5.f.a aVar = p226w5.f.f29544b;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        SparseIntArray sparseIntArray2 = this.f17904E;
        kotlin.jvm.internal.n.e(sparseIntArray2);
        this.f17903D = aVar.a(context, sparseIntArray2);
        this.f17902C = true;
        this.f17937x = 0;
        Z();
    }

    public final void setCurScreenVisibility(Boolean bool) {
        this.f17922W = bool;
    }

    public final void setForceResumed(boolean z9) {
        this.f17924b0 = z9;
    }

    public final void setHandler(p216v5.a aVar) {
        this.f17930q = aVar;
    }

    public final void setLastHostVisibility(boolean z9) {
        this.f17921V = z9;
    }

    public final void setShareActionHandler(p216v5.c cVar) {
        this.f17923a0 = cVar;
    }

    public final void z(View view, Throwable th, boolean z9) {
        p186s5.e eVar;
        o widgetViewInfo;
        this.f17902C = false;
        CardView cardView = this.f17905F;
        BaseShareInfo baseShareInfoF = (cardView == null || (widgetViewInfo = cardView.getWidgetViewInfo()) == null || !widgetViewInfo.l()) ? null : widgetViewInfo.f();
        if (view == null) {
            if (this.f17937x == 2) {
                return;
            }
            if (th != null) {
                G5.c.e("Host", "Error inflating NTRemoteViews", th);
            }
            view = getErrorView();
            this.f17937x = 2;
        } else if (baseShareInfoF != null) {
            C(baseShareInfoF);
            if (view.getParent() != null) {
                G5.c.d("Host", "shareInfo != null, content has parent: " + view.getParent());
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    p186s5.e eVar2 = this.f17901B;
                    if (eVar2 != null) {
                        ((ViewGroup) parent).removeView(eVar2.j());
                    }
                    ((ViewGroup) parent).removeView(view);
                }
            }
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.addView(view);
            p186s5.e eVar3 = this.f17901B;
            if (eVar3 != null) {
                frameLayout.addView(eVar3.j());
            }
            view = frameLayout;
        }
        Y(view);
        if (view.getParent() != null) {
            G5.c.d("Host", "applyContent v = content has parent: " + view.getParent());
            ViewParent parent2 = view.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        addView(view);
        if (!kotlin.jvm.internal.n.d(this.f17936w, view)) {
            removeView(this.f17936w);
            this.f17936w = view;
        }
        if (this.f17911L == 1 && this.f17937x == 1 && (eVar = this.f17901B) != null) {
            this.f17927e0.b(eVar.j(), baseShareInfoF);
        }
        if (z9) {
            j0();
        }
        c0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, p216v5.a aVar, boolean z9) {
        super(context);
        kotlin.jvm.internal.n.h(context, "context");
        this.f17930q = aVar;
        this.f17931r = z9;
        this.f17906G = -1L;
        this.f17907H = new AtomicBoolean(false);
        this.f17909J = -1L;
        this.f17911L = 1;
        this.f17917R = new DeferringController();
        this.f17925c0 = new h();
        this.f17926d0 = new e();
        this.f17927e0 = new f();
        this.f17928f0 = new d();
        this.f17929g0 = new n();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        kotlin.jvm.internal.n.h(attrs, "attrs");
        Context context = this.f17933t;
        if (context == null) {
            context = getContext();
        }
        kotlin.jvm.internal.n.e(context);
        return new FrameLayout.LayoutParams(context, attrs);
    }
}
