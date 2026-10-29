package com.nothing.cardparser;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import G5.c;
import O5.g;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.q;
import p139n8.b;
import p216v5.a;
import p226w5.e;
import p226w5.f;
import p226w5.r;
import p226w5.u;

/* JADX INFO: loaded from: classes.dex */
public final class CardView implements ICardView {
    public static final Companion Companion = new Companion(null);
    private static final CardView$Companion$DEFAULT_CARD_INTERACTION_HANDLER$1 DEFAULT_CARD_INTERACTION_HANDLER = new a() { // from class: com.nothing.cardparser.CardView$Companion$DEFAULT_CARD_INTERACTION_HANDLER$1
        @Override // p216v5.a
        public boolean onCardInteraction(View view, PendingIntent pendingIntent, o oVar) {
            n.h(view, "view");
            n.h(pendingIntent, "pendingIntent");
            return CardView.Companion.startPendingIntent(view, pendingIntent, oVar);
        }

        @Override // p216v5.a
        public void onShareInterAction(int i10) {
        }
    };
    private static final String TAG = "CardView";
    private final Context context;
    private final r infoCollector;
    private e infoParser;
    private final int widgetId;
    private final F5.o widgetViewInfo;

    public static final class AsyncParseTask implements CancellationSignal.OnCancelListener {
        private final p226w5.n animPlayController;
        private final CancellationSignal cancelSignal;
        private final f colorResources;
        private final a handler;
        private InterfaceC0846x0 parserJob;
        private final u parserListener;
        private final WeakReference<CardView> weakCardView;
        private final WeakReference<Context> weakContext;
        private final WeakReference<ViewGroup> weakHostView;

        public AsyncParseTask(CardView cardView, Context context, ViewGroup hostView, u parserListener, f fVar, a handler, p226w5.n animPlayController) {
            n.h(cardView, "cardView");
            n.h(context, "context");
            n.h(hostView, "hostView");
            n.h(parserListener, "parserListener");
            n.h(handler, "handler");
            n.h(animPlayController, "animPlayController");
            this.parserListener = parserListener;
            this.colorResources = fVar;
            this.handler = handler;
            this.animPlayController = animPlayController;
            this.cancelSignal = new CancellationSignal();
            this.weakContext = new WeakReference<>(context);
            this.weakCardView = new WeakReference<>(cardView);
            this.weakHostView = new WeakReference<>(hostView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object onParserStateChanged(e.b bVar, p129m8.e<? super A> eVar) {
            Object objG = AbstractC0812g.g(C0803b0.c(), new CardView$AsyncParseTask$onParserStateChanged$2(bVar, this, null), eVar);
            return objG == b.e() ? objG : A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
        
            if (F8.AbstractC0812g.g(r0, r1, r8) == r9) goto L41;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object runParserAsync(p219v8.p r12, p129m8.e<? super p079h8.A> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$1
                if (r0 == 0) goto L14
                r0 = r13
                com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$1 r0 = (com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r8 = r0
                goto L1a
            L14:
                com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$1 r0 = new com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$1
                r0.<init>(r11, r13)
                goto L12
            L1a:
                java.lang.Object r13 = r8.result
                java.lang.Object r9 = p139n8.b.e()
                int r0 = r8.label
                r10 = 2
                r1 = 1
                if (r0 == 0) goto L42
                if (r0 == r1) goto L37
                if (r0 != r10) goto L2f
                p079h8.r.b(r13)
                goto Lbf
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                java.lang.Object r11 = r8.L$0
                com.nothing.cardparser.CardView$AsyncParseTask r11 = (com.nothing.cardparser.CardView.AsyncParseTask) r11
                p079h8.r.b(r13)     // Catch: java.lang.Throwable -> L3f
                goto L8b
            L3f:
                r0 = move-exception
                r12 = r0
                goto L9a
            L42:
                p079h8.r.b(r13)
                java.lang.ref.WeakReference<android.content.Context> r13 = r11.weakContext
                java.lang.Object r13 = r13.get()
                r2 = r13
                android.content.Context r2 = (android.content.Context) r2
                java.lang.ref.WeakReference<android.view.ViewGroup> r13 = r11.weakHostView
                java.lang.Object r13 = r13.get()
                r3 = r13
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                java.lang.ref.WeakReference<com.nothing.cardparser.CardView> r13 = r11.weakCardView
                java.lang.Object r13 = r13.get()
                com.nothing.cardparser.CardView r13 = (com.nothing.cardparser.CardView) r13
                if (r2 == 0) goto Lc2
                if (r3 == 0) goto Lc2
                if (r13 != 0) goto L66
                goto Lc2
            L66:
                h8.q$a r13 = p079h8.q.f21862r     // Catch: java.lang.Throwable -> L3f
                java.lang.ref.WeakReference<com.nothing.cardparser.CardView> r13 = r11.weakCardView     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r13 = r13.get()     // Catch: java.lang.Throwable -> L3f
                com.nothing.cardparser.CardView r13 = (com.nothing.cardparser.CardView) r13     // Catch: java.lang.Throwable -> L3f
                if (r13 == 0) goto L92
                w5.e r13 = com.nothing.cardparser.CardView.access$getInfoParser$p(r13)     // Catch: java.lang.Throwable -> L3f
                if (r13 == 0) goto L92
                w5.f r4 = r11.colorResources     // Catch: java.lang.Throwable -> L3f
                v5.a r5 = r11.handler     // Catch: java.lang.Throwable -> L3f
                w5.n r6 = r11.animPlayController     // Catch: java.lang.Throwable -> L3f
                r8.L$0 = r11     // Catch: java.lang.Throwable -> L3f
                r8.label = r1     // Catch: java.lang.Throwable -> L3f
                r7 = r12
                r1 = r13
                java.lang.Object r12 = r1.u(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3f
                if (r12 != r9) goto L8b
                goto Lbe
            L8b:
                h8.A r12 = p079h8.A.f21846a     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r12 = p079h8.q.b(r12)     // Catch: java.lang.Throwable -> L3f
                goto La4
            L92:
                java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3f
                java.lang.String r13 = "Host view or activity has been null."
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L3f
                throw r12     // Catch: java.lang.Throwable -> L3f
            L9a:
                h8.q$a r13 = p079h8.q.f21862r
                java.lang.Object r12 = p079h8.r.a(r12)
                java.lang.Object r12 = p079h8.q.b(r12)
            La4:
                java.lang.Throwable r13 = p079h8.q.d(r12)
                if (r13 == 0) goto Lbf
                F8.H0 r0 = F8.C0803b0.c()
                com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$3$1 r1 = new com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$3$1
                r2 = 0
                r1.<init>(r11, r13, r2)
                r8.L$0 = r12
                r8.label = r10
                java.lang.Object r11 = F8.AbstractC0812g.g(r0, r1, r8)
                if (r11 != r9) goto Lbf
            Lbe:
                return r9
            Lbf:
                h8.A r11 = p079h8.A.f21846a
                return r11
            Lc2:
                h8.A r11 = p079h8.A.f21846a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nothing.cardparser.CardView.AsyncParseTask.runParserAsync(v8.p, m8.e):java.lang.Object");
        }

        @Override // android.os.CancellationSignal.OnCancelListener
        public void onCancel() {
            InterfaceC0846x0 interfaceC0846x0 = this.parserJob;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
        }

        public final CancellationSignal start() {
            InterfaceC0846x0 interfaceC0846x0;
            InterfaceC0846x0 interfaceC0846x1 = this.parserJob;
            if (interfaceC0846x1 != null && interfaceC0846x1.a() && (interfaceC0846x0 = this.parserJob) != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            this.cancelSignal.setOnCancelListener(this);
            this.parserJob = AbstractC0816i.d(g.j(), null, null, new CardView$AsyncParseTask$start$1(this, null), 3, null);
            return this.cancelSignal;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean startPendingIntent(View view, PendingIntent pendingIntent, o oVar) {
            Object objB;
            n.h(view, "view");
            n.h(pendingIntent, "pendingIntent");
            try {
                q.a aVar = q.f21862r;
                Context context = view.getContext();
                ActivityOptions activityOptions = oVar != null ? (ActivityOptions) oVar.d() : null;
                ActivityOptions pendingIntentBackgroundActivityStartMode = activityOptions != null ? activityOptions.setPendingIntentBackgroundActivityStartMode(1) : null;
                context.startIntentSender(pendingIntent.getIntentSender(), oVar != null ? (Intent) oVar.c() : null, 0, 0, 0, pendingIntentBackgroundActivityStartMode != null ? pendingIntentBackgroundActivityStartMode.toBundle() : null);
                objB = q.b(Boolean.TRUE);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(p079h8.r.a(th));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                c.d(CardView.TAG, "Can not send pending intent for exception = " + thD);
            }
            Boolean bool = Boolean.FALSE;
            if (q.f(objB)) {
                objB = bool;
            }
            return ((Boolean) objB).booleanValue();
        }

        private Companion() {
        }
    }

    public CardView(Context context, int i10, F5.o oVar, boolean z9, int i11) {
        n.h(context, "context");
        this.context = context;
        this.widgetId = i10;
        this.widgetViewInfo = oVar;
        this.infoParser = new e(context, i10, oVar != null ? oVar.g() : null, z9, 0, 16, null);
        this.infoCollector = new r(i11);
    }

    @Override // com.nothing.cardparser.ICardView
    public o apply(Context context, ViewGroup parent, f fVar, a aVar) {
        o oVarT;
        n.h(context, "context");
        n.h(parent, "parent");
        if (aVar == null) {
            aVar = DEFAULT_CARD_INTERACTION_HANDLER;
        }
        a aVar2 = aVar;
        e eVar = this.infoParser;
        return (eVar == null || (oVarT = eVar.t(context, parent, fVar, aVar2, this.infoCollector)) == null) ? new o(null, null) : oVarT;
    }

    @Override // com.nothing.cardparser.ICardView
    public CancellationSignal applyAsync(Context context, ViewGroup hostView, u parserListener, f fVar, a aVar) {
        n.h(context, "context");
        n.h(hostView, "hostView");
        n.h(parserListener, "parserListener");
        if (aVar == null) {
            aVar = DEFAULT_CARD_INTERACTION_HANDLER;
        }
        return new AsyncParseTask(this, context, hostView, parserListener, fVar, aVar, this.infoCollector).start();
    }

    @Override // com.nothing.cardparser.ICardView
    public Object applyViewDataChanged(String str, Context context, View view, View view2, ViewGroup viewGroup, f fVar, a aVar, p129m8.e<? super A> eVar) {
        Object objV;
        a aVar2 = aVar == null ? DEFAULT_CARD_INTERACTION_HANDLER : aVar;
        e eVar2 = this.infoParser;
        return (eVar2 == null || (objV = eVar2.v(str, context, view, view2, viewGroup, fVar, aVar2, this.infoCollector, eVar)) != b.e()) ? A.f21846a : objV;
    }

    @Override // com.nothing.cardparser.ICardView
    public boolean checkHasUpdatePeriodMinute(String viewJson) {
        n.h(viewJson, "viewJson");
        e eVar = this.infoParser;
        if (eVar != null) {
            return eVar.m(viewJson);
        }
        return false;
    }

    @Override // com.nothing.cardparser.ICardView
    public List<String> getBroadcastConfig() {
        return this.infoCollector.i();
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.nothing.cardparser.ICardView
    public Bundle getExtraInfo() {
        return this.infoCollector.j();
    }

    @Override // com.nothing.cardparser.ICardView
    public Integer getPeriodTime() {
        return Integer.valueOf(this.infoCollector.m());
    }

    public final int getWidgetId() {
        return this.widgetId;
    }

    public final F5.o getWidgetViewInfo() {
        return this.widgetViewInfo;
    }

    @Override // com.nothing.cardparser.ICardView
    public void onBroadcastReceive(String action) {
        n.h(action, "action");
        this.infoCollector.o(action);
    }

    @Override // com.nothing.cardparser.ICardView
    public void onCancelAnim() {
        this.infoCollector.p();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onEndAnim() {
        this.infoCollector.q();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onHostConfigChanged(Configuration newConfig) {
        n.h(newConfig, "newConfig");
        this.infoCollector.r(newConfig);
    }

    @Override // com.nothing.cardparser.ICardView
    public void onHostViewPeriodTimeUp() {
        this.infoCollector.s();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onHostViewResume() {
        this.infoCollector.t();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onHostViewStop() {
        this.infoCollector.u();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onPauseAnim() {
        this.infoCollector.v();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onResumeAnim() {
        this.infoCollector.w();
    }

    @Override // com.nothing.cardparser.ICardView
    public void onStartAnim() {
        this.infoCollector.x();
    }

    @Override // com.nothing.cardparser.ICardView
    public void registerAnimListener() {
        this.infoCollector.y();
    }

    @Override // com.nothing.cardparser.ICardView
    public void switchCardStyle(int i10) {
        this.infoCollector.a(i10);
    }

    @Override // com.nothing.cardparser.ICardView
    public void unregisterAnimListener() {
        this.infoCollector.z();
    }

    @Override // com.nothing.cardparser.ICardView
    public void updateViewInfoJson(String str) {
        F5.o oVar;
        if (str == null || (oVar = this.widgetViewInfo) == null) {
            return;
        }
        oVar.n(str);
    }
}
