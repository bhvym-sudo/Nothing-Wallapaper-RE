package com.nothing.launcher.card;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements com.android.launcher3.dragndrop.a.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.android.launcher3.views.f f18109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f18110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final m f18111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f18112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p f18113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p219v8.a f18114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p219v8.a f18115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f18116x;

    public h(com.android.launcher3.views.f activityContext, View view) {
        kotlin.jvm.internal.n.h(activityContext, "activityContext");
        kotlin.jvm.internal.n.h(view, "view");
        this.f18109q = activityContext;
        this.f18110r = view;
        Object tag = view.getTag();
        kotlin.jvm.internal.n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PendingAddCardInfo");
        this.f18111s = (m) tag;
        this.f18112t = new Handler(Looper.getMainLooper());
        this.f18113u = activityContext.R();
        this.f18116x = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p219v8.a aVar) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p219v8.a aVar) {
        aVar.invoke();
    }

    private final void i() {
        final p pVar = this.f18113u;
        if (pVar == null) {
            return;
        }
        m mVar = this.f18111s;
        Context context = this.f18110r.getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        final Bundle bundleO = mVar.o(context);
        if (this.f18111s.p().b()) {
            this.f18111s.q(bundleO);
            return;
        }
        final j jVarN = this.f18111s.n();
        this.f18114v = new p219v8.a() { // from class: com.nothing.launcher.card.d
            @Override // p219v8.a
            public final Object invoke() {
                return h.l(this.f18101q, pVar, jVarN, bundleO);
            }
        };
        this.f18115w = new p219v8.a() { // from class: com.nothing.launcher.card.e
            @Override // p219v8.a
            public final Object invoke() {
                return h.j(this.f18105q, pVar);
            }
        };
        Handler handler = this.f18112t;
        final p219v8.a aVar = this.f18114v;
        kotlin.jvm.internal.n.e(aVar);
        handler.post(new Runnable() { // from class: com.nothing.launcher.card.f
            @Override // java.lang.Runnable
            public final void run() {
                h.k(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j(h hVar, p pVar) {
        if (hVar.f18116x > -1) {
            Context context = hVar.f18110r.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            com.nothing.cardhost.g gVarC = com.nothing.cardhost.f.C(pVar, context, hVar.f18116x, hVar.f18111s.n(), false, null, 24, null);
            hVar.f18111s.f18138I = gVarC;
            hVar.f18116x = -1;
            gVarC.setVisibility(4);
            int[] iArrE = hVar.f18109q.M().E(hVar.f18111s);
            kotlin.jvm.internal.n.g(iArrE, "estimateItemSize(...)");
            com.android.launcher3.views.g.c cVar = new com.android.launcher3.views.g.c(iArrE[0], iArrE[1]);
            cVar.f15754a = 0;
            cVar.f15755b = 0;
            cVar.f15756c = true;
            gVarC.setLayoutParams(cVar);
            hVar.f18109q.J().addView(gVarC);
            hVar.f18110r.setTag(hVar.f18111s);
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p219v8.a aVar) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A l(h hVar, p pVar, j jVar, Bundle bundle) {
        final p219v8.a aVar;
        int iW = pVar.w();
        hVar.f18116x = iW;
        if (pVar.y(iW, jVar, bundle) && (aVar = hVar.f18115w) != null) {
            hVar.f18112t.post(new Runnable() { // from class: com.nothing.launcher.card.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.m(aVar);
                }
            });
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(p219v8.a aVar) {
        aVar.invoke();
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void n(com.android.launcher3.h.a aVar, p253z2.e eVar) {
        i();
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void t() {
        this.f18109q.p().A(this);
        final p219v8.a aVar = this.f18114v;
        if (aVar != null) {
            this.f18112t.removeCallbacks(new Runnable() { // from class: com.nothing.launcher.card.b
                @Override // java.lang.Runnable
                public final void run() {
                    h.g(aVar);
                }
            });
        }
        final p219v8.a aVar2 = this.f18115w;
        if (aVar2 != null) {
            this.f18112t.removeCallbacks(new Runnable() { // from class: com.nothing.launcher.card.c
                @Override // java.lang.Runnable
                public final void run() {
                    h.h(aVar2);
                }
            });
        }
        int i10 = this.f18116x;
        if (i10 != -1) {
            p pVar = this.f18113u;
            if (pVar != null) {
                pVar.D(i10);
            }
            this.f18116x = -1;
        }
        com.nothing.cardhost.g gVar = this.f18111s.f18138I;
        if (gVar != null) {
            this.f18109q.J().removeView(gVar);
            p pVar2 = this.f18113u;
            if (pVar2 != null) {
                pVar2.D(gVar.getAppWidgetId());
            }
        }
        this.f18111s.f18138I = null;
    }
}
