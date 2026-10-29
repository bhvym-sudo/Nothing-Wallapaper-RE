package com.nothing.cardhost;

import F5.o;
import F5.p;
import F5.q;
import F5.r;
import F5.t;
import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.I;
import F8.L;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends F5.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f17847x = new b(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final W0.b f17848y = new W0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f17849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f17851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f17852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseArray f17853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f17854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p216v5.a f17855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f17856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f17857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f17861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f17862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f17863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p079h8.h f17864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d f17865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f17866w;

    public static final class a extends p.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final WeakReference f17867q;

        public a(WeakReference weakHandler) {
            n.h(weakHandler, "weakHandler");
            this.f17867q = weakHandler;
        }

        @Override // F5.p
        public void H(int i10, o oVar) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(1, i10, 0, oVar)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void I(int i10, F5.m mVar) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(2, i10, 0, mVar)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void N(int i10, int i11, boolean z9) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(8, i10, i11, Boolean.valueOf(z9))) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void R(int i10) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(12, Integer.valueOf(i10))) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void g(int i10) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(4, Integer.valueOf(i10))) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void j(int i10, r rVar) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(6, i10, 0, rVar)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void k(int i10, int i11, o oVar) {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(3, i10, i11, oVar)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void o(String pkgName) {
            Message messageObtainMessage;
            n.h(pkgName, "pkgName");
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(10, pkgName)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void q(String bundleId) {
            Message messageObtainMessage;
            n.h(bundleId, "bundleId");
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(11, bundleId)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void s(String shareId, r shareInfo, Bundle bundle) {
            Message messageObtainMessage;
            n.h(shareId, "shareId");
            n.h(shareInfo, "shareInfo");
            G5.c.f1948a.h("Share", "createShareWidget shareInfo = " + shareInfo);
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(5, shareInfo)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // F5.p
        public void x() {
            Message messageObtainMessage;
            Handler handler = (Handler) this.f17867q.get();
            if (handler == null || (messageObtainMessage = handler.obtainMessage(7)) == null) {
                return;
            }
            messageObtainMessage.sendToTarget();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    private final class c implements p216v5.c {
        public c() {
        }

        @Override // p216v5.c
        public void a(boolean z9) {
            if (z9) {
                f.this.K().a();
            }
        }

        @Override // p216v5.c
        public void b(int i10) {
            f.this.b();
            q qVarC = f.this.c();
            if (qVarC != null) {
                try {
                    G5.c.b("Host", "Host checkShareLinkExpired widgetId = " + i10);
                    qVarC.u(i10);
                } catch (RemoteException e10) {
                    G5.c.d("Host", "widget service dead?: " + e10);
                }
            }
        }

        @Override // p216v5.c
        public Uri c(String creator, String receiver) {
            n.h(creator, "creator");
            n.h(receiver, "receiver");
            f.this.b();
            q qVarC = f.this.c();
            if (qVarC == null) {
                return null;
            }
            try {
                return qVarC.F(creator, receiver, f.this.f17851h);
            } catch (RemoteException e10) {
                G5.c.d("Host", "widget service dead?: " + e10);
                return null;
            }
        }
    }

    public final class d implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f17869q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final p219v8.a f17870r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final p219v8.a f17871s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f17872t;

        public d(f fVar, boolean z9, p219v8.a firstTask, p219v8.a secondTask) {
            n.h(firstTask, "firstTask");
            n.h(secondTask, "secondTask");
            this.f17872t = fVar;
            this.f17869q = z9;
            this.f17870r = firstTask;
            this.f17871s = secondTask;
        }

        public final void a(boolean z9) {
            this.f17869q = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17869q) {
                this.f17871s.invoke();
            } else {
                this.f17870r.invoke();
            }
        }
    }

    public final class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p186s5.a f17873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f17874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f fVar, Looper looper) {
            super(looper);
            n.h(looper, "looper");
            this.f17874b = fVar;
        }

        public final void a() {
            if (this.f17873a == null || hasMessages(9)) {
                return;
            }
            sendEmptyMessageDelayed(9, 600L);
        }

        public final void b() {
            this.f17873a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            n.h(msg, "msg");
            switch (msg.what) {
                case 1:
                    this.f17874b.s0(msg.arg1, (o) msg.obj);
                    break;
                case 2:
                    this.f17874b.Z(msg.arg1, (F5.m) msg.obj);
                    break;
                case 3:
                    this.f17874b.v0(msg.arg1, msg.arg2, (o) msg.obj);
                    break;
                case 4:
                    Object obj = msg.obj;
                    n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                    this.f17874b.E(((Integer) obj).intValue());
                    break;
                case 5:
                    f fVar = this.f17874b;
                    Object obj2 = msg.obj;
                    n.f(obj2, "null cannot be cast to non-null type com.nothing.cardservice.ShareWidgetInfo");
                    fVar.e0((r) obj2);
                    break;
                case 6:
                    f fVar2 = this.f17874b;
                    int i10 = msg.arg1;
                    Object obj3 = msg.obj;
                    n.f(obj3, "null cannot be cast to non-null type com.nothing.cardservice.ShareWidgetInfo");
                    fVar2.q0(i10, (r) obj3);
                    break;
                case 7:
                    this.f17874b.Q();
                    break;
                case 8:
                    this.f17873a = new p186s5.a(msg.arg1, msg.arg2);
                    Object obj4 = msg.obj;
                    n.f(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj4).booleanValue()) {
                        a();
                    }
                    break;
                case 9:
                    p186s5.a aVar = this.f17873a;
                    if (aVar != null) {
                        this.f17874b.m0(aVar.b(), aVar.a());
                    }
                    break;
                case 10:
                    f fVar3 = this.f17874b;
                    Object obj5 = msg.obj;
                    n.f(obj5, "null cannot be cast to non-null type kotlin.String");
                    fVar3.R((String) obj5);
                    break;
                case 11:
                    f fVar4 = this.f17874b;
                    Object obj6 = msg.obj;
                    n.f(obj6, "null cannot be cast to non-null type kotlin.String");
                    fVar4.T((String) obj6);
                    break;
                case 12:
                    f fVar5 = this.f17874b;
                    Object obj7 = msg.obj;
                    n.f(obj7, "null cannot be cast to non-null type kotlin.Int");
                    fVar5.V(((Integer) obj7).intValue());
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardhost.f$f, reason: collision with other inner class name */
    static final class C0476f extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f17875q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f17876r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f17877s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f17878t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f17879u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f17880v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ E f17882x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f17883y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ com.nothing.cardhost.g f17884z;

        /* JADX INFO: renamed from: com.nothing.cardhost.f$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17885q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ q f17886r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f17887s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, int i10, p129m8.e eVar) {
                super(2, eVar);
                this.f17886r = qVar;
                this.f17887s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f17886r, this.f17887s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f17885q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return this.f17886r.V(this.f17887s);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0476f(E e10, int i10, com.nothing.cardhost.g gVar, p129m8.e eVar) {
            super(2, eVar);
            this.f17882x = e10;
            this.f17883y = i10;
            this.f17884z = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return f.this.new C0476f(this.f17882x, this.f17883y, this.f17884z, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0476f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            E e10;
            com.nothing.cardhost.g gVar;
            E e11;
            int i10;
            f fVar;
            Object objE = p139n8.b.e();
            int i11 = this.f17880v;
            boolean z9 = true;
            try {
                if (i11 == 0) {
                    p079h8.r.b(obj);
                    q qVarC = f.this.c();
                    if (qVarC != null) {
                        e10 = this.f17882x;
                        int i12 = this.f17883y;
                        gVar = this.f17884z;
                        f fVar2 = f.this;
                        I iB = C0803b0.b();
                        a aVar = new a(qVarC, i12, null);
                        this.f17875q = e10;
                        this.f17876r = gVar;
                        this.f17877s = fVar2;
                        this.f17878t = e10;
                        this.f17879u = i12;
                        this.f17880v = 1;
                        obj = AbstractC0812g.g(iB, aVar, this);
                        if (obj == objE) {
                            return objE;
                        }
                        e11 = e10;
                        i10 = i12;
                        fVar = fVar2;
                    }
                    return A.f21846a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f17879u;
                e10 = (E) this.f17878t;
                fVar = (f) this.f17877s;
                gVar = (com.nothing.cardhost.g) this.f17876r;
                e11 = (E) this.f17875q;
                p079h8.r.b(obj);
                e10.f22779q = obj;
                G5.c cVar = G5.c.f1948a;
                o oVar = (o) e11.f22779q;
                if ((oVar != null ? oVar.g() : null) != null) {
                    z9 = false;
                }
                cVar.h("Host", "Host createView viewInfoJson from db == null?(" + z9 + "), widgetId = " + i10);
                boolean zN = gVar.N();
                cVar.h("Host", "isHostViewHasBeenUpdated = " + zN + ", widgetId = " + i10);
                if (!zN) {
                    o oVar2 = (o) e11.f22779q;
                    if (oVar2 != null && oVar2.g() != null) {
                        fVar.u0(i10, (o) e11.f22779q);
                    }
                    gVar.n0((o) e11.f22779q);
                }
            } catch (RemoteException e12) {
                G5.c.d("Host", "widget service dead?: " + e12);
            }
            return A.f21846a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17888q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f17890s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ q f17891t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ com.nothing.cardhost.g f17892u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, q qVar, com.nothing.cardhost.g gVar, p129m8.e eVar) {
            super(2, eVar);
            this.f17890s = i10;
            this.f17891t = qVar;
            this.f17892u = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return f.this.new g(this.f17890s, this.f17891t, this.f17892u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17888q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            try {
                p196t5.a.f27936a.a(f.this.f17849f, this.f17890s);
                o oVarL = f.this.L(this.f17890s);
                this.f17891t.C(this.f17890s);
                if (oVarL != null) {
                    f.this.g0(this.f17890s, this.f17892u, oVarL);
                }
            } catch (RemoteException e10) {
                G5.c.d("Host", "widget service dead?: " + e10);
            }
            return A.f21846a;
        }
    }

    public static final class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17893a;

        h() {
        }

        private final void a() {
            SparseArray sparseArray = f.this.f17852i;
            f fVar = f.this;
            synchronized (sparseArray) {
                try {
                    if (fVar.f17858o < fVar.f17852i.size()) {
                        Iterator it = B8.h.q(fVar.f17858o, fVar.f17852i.size()).iterator();
                        while (it.hasNext()) {
                            ((com.nothing.cardhost.g) fVar.f17852i.valueAt(((p089i8.L) it).a())).U();
                        }
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationCancel(animation);
            this.f17893a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            if (!this.f17893a) {
                a();
            }
            f.this.f17858o = 0;
            f.this.f17859p = -1;
            f.this.F();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationStart(animation);
            this.f17893a = false;
            f.this.x();
        }
    }

    public static final class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (f.this.f17852i) {
                try {
                    SparseArray sparseArray = f.this.f17852i;
                    int size = sparseArray.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        sparseArray.keyAt(i10);
                        ((com.nothing.cardhost.g) sparseArray.valueAt(i10)).V();
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17896q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f17898s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f17898s = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return f.this.new j(this.f17898s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((j) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17896q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            q qVarC = f.this.c();
            if (qVarC != null) {
                int i10 = this.f17898s;
                try {
                    G5.c.f1948a.h("Host", "updateSharableWidgetVisible widgetId: " + i10);
                    qVarC.U(AbstractC1444s.e(new t(i10, true)));
                } catch (RemoteException e10) {
                    G5.c.d("Host", "widget service dead?: " + e10);
                }
            }
            return A.f21846a;
        }
    }

    public /* synthetic */ f(Context context, int i10, p216v5.a aVar, int i11, AbstractC1457h abstractC1457h) {
        this(context, i10, (i11 & 4) != 0 ? null : aVar);
    }

    public static /* synthetic */ com.nothing.cardhost.g C(f fVar, Context context, int i10, F5.m mVar, boolean z9, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createView");
        }
        if ((i11 & 8) != 0) {
            z9 = false;
        }
        boolean z10 = z9;
        if ((i11 & 16) != 0) {
            bool = Boolean.FALSE;
        }
        return fVar.B(context, i10, mVar, z10, bool);
    }

    private final o G(int i10) {
        o oVar;
        synchronized (this.f17853j) {
            oVar = (o) this.f17853j.get(i10);
        }
        return oVar;
    }

    private final String I(o oVar) {
        JSONObject jSONObjectG;
        Object objD;
        JSONObject jSONObjectG2;
        String strG = oVar.g();
        if (strG == null || (jSONObjectG = p206u5.a.g(strG)) == null || (objD = p206u5.c.d(jSONObjectG, "config_info")) == null || (jSONObjectG2 = p206u5.a.g(objD)) == null) {
            return null;
        }
        return p206u5.c.e(jSONObjectG2, "package_name");
    }

    private final ValueAnimator J() {
        Object value = this.f17864u.getValue();
        n.g(value, "getValue(...)");
        return (ValueAnimator) value;
    }

    private final void M(r rVar) {
        G5.c cVar = G5.c.f1948a;
        cVar.h("Share", "host receive callbackShareInfoAdd: " + rVar);
        int iB = rVar.b();
        synchronized (this.f17852i) {
            try {
                o oVarG = G(rVar.b());
                if (oVarG != null) {
                    oVarG.m(oVarG.o(rVar));
                } else {
                    oVarG = null;
                }
                cVar.h("Share", "handleShareInfoAdded host receive it.ext2: " + (oVarG != null ? oVarG.d() : null));
                com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) this.f17852i.get(iB);
                if (gVar != null) {
                    gVar.n0(oVarG);
                    A a10 = A.f21846a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b0(rVar);
    }

    private final void N(r rVar) {
        int iB = rVar.b();
        synchronized (this.f17852i) {
            try {
                com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) this.f17852i.get(iB);
                if (gVar != null) {
                    gVar.o0(rVar.a());
                }
                o oVarG = G(iB);
                G5.c.f1948a.g("Host updateAppWidget getCacheViewInfo = " + oVarG);
                if (oVarG != null) {
                    oVarG.m(oVarG.o(rVar));
                    A a10 = A.f21846a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c0(rVar);
    }

    private final void O(r rVar) {
        int iB = rVar.b();
        synchronized (this.f17852i) {
            try {
                G5.c.f1948a.h("Share", "host receive handleShareInfoRemove hostView = " + this.f17852i.get(iB));
                com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) this.f17852i.get(iB);
                if (gVar != null) {
                    gVar.e0();
                }
                o oVarG = G(iB);
                if (oVarG != null) {
                    oVarG.m(null);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        d0(rVar);
    }

    private final p079h8.o P(View view) {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(l.f17996e);
            O5.h hVar = O5.h.f5903a;
            n.e(linearLayout);
            p079h8.o oVarA = hVar.a(linearLayout);
            int iIntValue = ((Number) oVarA.a()).intValue();
            int iIntValue2 = ((Number) oVarA.b()).intValue();
            int right = ((linearLayout.getRight() - linearLayout.getLeft()) / 2) + iIntValue;
            G5.c.f1948a.h("Share", "showWidgetBubble rawLeft = " + iIntValue + ", rawTop = " + iIntValue2 + ", bubbleX = " + right + ", bubbleY:" + iIntValue2 + ", view:" + linearLayout);
            objB = p079h8.q.b(new p079h8.o(Integer.valueOf(right), Integer.valueOf(iIntValue2)));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = null;
        }
        return (p079h8.o) objB;
    }

    public static /* synthetic */ void X(f fVar, boolean z9, long j9, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInterfaceResumed");
        }
        if ((i11 & 1) != 0) {
            z9 = false;
        }
        if ((i11 & 2) != 0) {
            j9 = 1000;
        }
        if ((i11 & 4) != 0) {
            i10 = 30;
        }
        fVar.W(z9, j9, i10);
    }

    private final void a0(int i10) {
        if (this.f17859p != i10) {
            this.f17859p = i10;
            synchronized (this.f17852i) {
                try {
                    if (this.f17858o < this.f17852i.size()) {
                        int iKeyAt = this.f17852i.keyAt(this.f17858o);
                        ((com.nothing.cardhost.g) this.f17852i.valueAt(this.f17858o)).U();
                        int i11 = this.f17858o + 1;
                        this.f17858o = i11;
                        G5.c.f1948a.h("Host", "Call HostView Resume at onUpdate: WidgetId = " + iKeyAt + ",position = " + i11);
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f17858o >= this.f17852i.size()) {
                J().cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int i10, com.nothing.cardhost.g gVar, o oVar) {
        ArrayList arrayList;
        String strI = I(oVar);
        boolean z9 = false;
        if (strI != null) {
            List listH = H(oVar.b(), strI);
            if (listH != null) {
                List list = listH;
                arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((o) it.next()).j()));
                }
            } else {
                arrayList = null;
            }
            List listF0 = arrayList != null ? AbstractC1444s.f0(arrayList, Integer.valueOf(i10)) : null;
            G5.c.f1948a.h("Host", "groupWidgetIds = " + arrayList + ", leftWidgetIds = " + listF0);
            if (listF0 != null && listF0.isEmpty()) {
                z9 = true;
            }
        }
        if (gVar != null) {
            gVar.Q(gVar, i10, z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(f this$0, ValueAnimator animation) {
        n.h(this$0, "this$0");
        n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.a0(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator i0(f this$0) {
        n.h(this$0, "this$0");
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this$0.f17860q);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(f17848y);
        valueAnimatorOfInt.addUpdateListener(this$0.f17863t);
        valueAnimatorOfInt.addListener(this$0.f17862s);
        return valueAnimatorOfInt;
    }

    private final void j0(int i10) {
        synchronized (this.f17853j) {
            this.f17853j.remove(i10);
            A a10 = A.f21846a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A k0(f this$0) {
        n.h(this$0, "this$0");
        synchronized (this$0.f17852i) {
            SparseArray sparseArray = this$0.f17852i;
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                sparseArray.keyAt(i10);
                ((com.nothing.cardhost.g) sparseArray.valueAt(i10)).U();
            }
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A l0(f this$0) {
        n.h(this$0, "this$0");
        if (!this$0.J().isStarted()) {
            this$0.J().setIntValues(0, B8.h.i(B8.h.f(10, this$0.f17852i.size()), this$0.f17860q));
            this$0.J().setDuration(this$0.f17861r);
            this$0.J().start();
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(int i10, int i11) {
        com.nothing.cardhost.g gVar;
        G5.c.f1948a.h("Share", "hostViewCache.size = " + this.f17852i.size() + ", widgetId = " + i10);
        synchronized (this.f17852i) {
            gVar = (com.nothing.cardhost.g) this.f17852i.get(i10);
        }
        if (gVar == null || !gVar.getLastHostVisibility() || n.d(gVar.getCurScreenVisibility(), Boolean.FALSE)) {
            return;
        }
        K().b();
        p079h8.o oVarP = P(gVar);
        if (oVarP != null) {
            f0(i10, i11, ((Number) oVarP.c()).intValue(), ((Number) oVarP.d()).intValue());
        } else {
            new p219v8.a() { // from class: com.nothing.cardhost.e
                @Override // p219v8.a
                public final Object invoke() {
                    return f.n0();
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A n0() {
        G5.c.f1948a.h("Share", "showWidgetBubble icon_layout not found");
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(int i10, r rVar) {
        G5.c.f1948a.h("Share", "--totallyHandleShareInfoChanged--method = " + i10 + ", shareInfo = " + rVar);
        switch (i10) {
            case 7201:
                M(rVar);
                break;
            case 7202:
                N(rVar);
                break;
            case 7203:
                O(rVar);
                break;
        }
    }

    private final void t0(int i10) {
        AbstractC0816i.d(O5.g.j(), null, null, new j(i10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(int i10, o oVar) {
        synchronized (this.f17853j) {
            this.f17853j.put(i10, oVar);
            A a10 = A.f21846a;
        }
    }

    protected void A() {
        synchronized (this.f17852i) {
            try {
                SparseArray sparseArray = this.f17852i;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sparseArray.keyAt(i10);
                    ((com.nothing.cardhost.g) sparseArray.valueAt(i10)).onCardRemoved(-1);
                }
                this.f17852i.clear();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.nothing.cardhost.j.f17984a.a();
    }

    public final com.nothing.cardhost.g B(Context context, int i10, F5.m mVar, boolean z9, Boolean bool) {
        n.h(context, "context");
        b();
        com.nothing.cardhost.g gVarU = U(context, i10, mVar, z9);
        gVarU.setHandler(this.f17855l);
        gVarU.setShareActionHandler(this.f17856m);
        gVarU.h0(i10, mVar);
        synchronized (this.f17852i) {
            this.f17852i.put(i10, gVarU);
            A a10 = A.f21846a;
        }
        E e10 = new E();
        o oVarG = G(i10);
        e10.f22779q = oVarG;
        if (oVarG == null) {
            G5.c.f1948a.h("Host", "Host createView cacheViewInfo == null");
            AbstractC0816i.d(O5.g.k(), null, null, new C0476f(e10, i10, gVarU, null), 3, null);
        } else {
            G5.c.f1948a.h("Host", "Host updateAppWidget using cache info>>>>>");
            gVarU.n0((o) e10.f22779q);
        }
        K().a();
        G5.c.f1948a.h("Host", "persistVisibleShareWidget: " + bool + ", sharable: " + (mVar != null ? Boolean.valueOf(mVar.N()) : null));
        if (n.d(bool, Boolean.TRUE) && mVar != null && mVar.N()) {
            t0(i10);
        }
        return gVarU;
    }

    public void D(int i10) {
        b();
        q qVarC = c();
        if (qVarC != null) {
            synchronized (this.f17852i) {
                try {
                    com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) this.f17852i.get(i10);
                    this.f17852i.remove(i10);
                    if (gVar != null) {
                        gVar.onCardRemoved(i10);
                    }
                    com.nothing.cardhost.j.f17984a.f(i10);
                    j0(i10);
                    AbstractC0816i.d(O5.g.j(), null, null, new g(i10, qVarC, gVar, null), 3, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void E(int i10) {
        synchronized (this.f17852i) {
            this.f17852i.remove(i10);
            A a10 = A.f21846a;
        }
        S(i10);
    }

    public void F() {
    }

    public List H(int i10, String pkgName) {
        n.h(pkgName, "pkgName");
        b();
        q qVarC = c();
        if (qVarC != null) {
            try {
                if (F5.b.f1640a.a("getGroupWidgetViewInfoByCardId", d())) {
                    return qVarC.K(i10, pkgName);
                }
                return null;
            } catch (RemoteException e10) {
                G5.c.d("Host", "widget service dead?: " + e10);
            }
        }
        return null;
    }

    public e K() {
        return this.f17857n;
    }

    public o L(int i10) {
        b();
        q qVarC = c();
        if (qVarC == null) {
            return null;
        }
        try {
            return qVarC.V(i10);
        } catch (RemoteException e10) {
            G5.c.d("Host", "widget service dead?: " + e10);
            return null;
        }
    }

    public void Q() {
    }

    protected void R(String pkgName) {
        n.h(pkgName, "pkgName");
        G5.c.b("Host", "Receive callback widget package updated: pkgName = " + pkgName);
        E5.b.f1285a.d(pkgName);
    }

    public void S(int i10) {
        G5.c.b("Host", "Receive callback app widget removed id = " + i10);
    }

    public void T(String bundleId) {
        n.h(bundleId, "bundleId");
    }

    public abstract com.nothing.cardhost.g U(Context context, int i10, F5.m mVar, boolean z9);

    public void V(int i10) {
        D(i10);
    }

    public void W(boolean z9, long j9, int i10) {
        if (z9) {
            this.f17860q = i10;
            this.f17861r = j9;
        }
        this.f17865v.a(z9);
        K().removeCallbacks(this.f17865v);
        K().removeCallbacks(this.f17866w);
        K().post(this.f17865v);
        K().a();
    }

    public void Y() {
        K().removeCallbacks(this.f17865v);
        K().removeCallbacks(this.f17866w);
        K().post(this.f17866w);
    }

    protected void Z(int i10, F5.m mVar) {
        Object obj;
        String strB = mVar != null ? mVar.b() : null;
        G5.c.b("Host", "Receive callback provider change: widgetId = " + i10 + ", cardName = " + strB + ", serviceApiLevel = " + d());
        synchronized (this.f17852i) {
            obj = this.f17852i.get(i10);
            A a10 = A.f21846a;
        }
        com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) obj;
        if (gVar != null) {
            gVar.f0(mVar);
        }
    }

    public void b0(r shareInfo) {
        n.h(shareInfo, "shareInfo");
    }

    public void c0(r shareInfo) {
        n.h(shareInfo, "shareInfo");
    }

    public void d0(r shareInfo) {
        n.h(shareInfo, "shareInfo");
    }

    @Override // F5.a
    public void e() {
        o0();
    }

    public void e0(r shareWidgetInfo) {
        n.h(shareWidgetInfo, "shareWidgetInfo");
    }

    public void f0(int i10, int i11, int i12, int i13) {
    }

    @Override // F5.a
    public void g() {
        super.g();
        SparseArray sparseArray = this.f17852i;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.keyAt(i10);
            com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) sparseArray.valueAt(i10);
            G5.c.f1948a.h("AsyncServiceBinder", "onCardRemoved hostView = " + gVar);
            gVar.onCardRemoved(-1);
        }
    }

    public void o0() {
        b();
        q qVarC = c();
        if (qVarC != null) {
            try {
                if (this.f17854k == null) {
                    this.f17854k = new a(new WeakReference(K()));
                    A a10 = A.f21846a;
                }
                qVarC.J(this.f17851h, this.f17850g, this.f17854k);
                G5.c.f1948a.h("Host", "start listener successfully.");
            } catch (RemoteException e10) {
                G5.c.d("Host", "widget service dead?: " + e10);
            }
        }
    }

    public void p0() {
        b();
        q qVarC = c();
        if (qVarC != null) {
            try {
                qVarC.n(this.f17851h, this.f17850g, this.f17854k);
            } catch (RemoteException e10) {
                G5.c.d("Host", "widget service dead?: " + e10);
                A a10 = A.f21846a;
            }
        }
        this.f17854k = null;
    }

    public void r0() {
        if (this.f17854k != null) {
            p0();
        }
        F5.j.f1647a.P(this);
        g();
    }

    protected void s0(int i10, o oVar) {
        Object obj;
        Object objB;
        A a10;
        synchronized (this.f17852i) {
            obj = this.f17852i.get(i10);
            u0(i10, oVar);
            A a11 = A.f21846a;
        }
        G5.c.f1948a.h("Host", "Receive callback updateAppWidgetView. appWidgetId = " + i10);
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) obj;
            if (gVar != null) {
                gVar.n0(oVar);
                a10 = A.f21846a;
            } else {
                a10 = null;
            }
            objB = p079h8.q.b(a10);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.e("Host", "Host update appWidget error", thD);
        }
    }

    protected void v0(int i10, int i11, o oVar) {
        Object obj;
        G5.c.f1948a.h("Host", "Receive callback viewDataChanged. widgetId = " + i10);
        if (i11 == 0) {
            synchronized (this.f17852i) {
                obj = this.f17852i.get(i10);
                A a10 = A.f21846a;
            }
            com.nothing.cardhost.g gVar = (com.nothing.cardhost.g) obj;
            if (gVar != null) {
                gVar.p0(oVar);
            }
        }
        u0(i10, oVar);
    }

    public int w() {
        b();
        q qVarC = c();
        if (qVarC == null) {
            return -1;
        }
        try {
            return qVarC.w(this.f17851h, this.f17850g);
        } catch (RemoteException e10) {
            G5.c.d("Host", "widget service dead?: " + e10);
            return -1;
        }
    }

    public void x() {
    }

    public boolean y(int i10, F5.m info, Bundle bundle) {
        n.h(info, "info");
        b();
        q qVarC = c();
        if (qVarC == null) {
            return false;
        }
        try {
            return qVarC.M(i10, info, bundle);
        } catch (RemoteException e10) {
            G5.c.d("Host", "widget service dead?: " + e10);
            return false;
        }
    }

    public void z(Context context) {
        n.h(context, "context");
        F5.j.f1647a.z(context, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10, p216v5.a aVar) {
        super(context);
        n.h(context, "context");
        this.f17849f = context;
        this.f17850g = i10;
        String packageName = context.getPackageName();
        n.g(packageName, "getPackageName(...)");
        this.f17851h = packageName;
        this.f17852i = new SparseArray();
        this.f17853j = new SparseArray();
        this.f17855l = aVar;
        this.f17856m = new c();
        Looper mainLooper = Looper.getMainLooper();
        n.g(mainLooper, "getMainLooper(...)");
        this.f17857n = new e(this, mainLooper);
        this.f17859p = -1;
        this.f17860q = 30;
        this.f17861r = 1000L;
        this.f17862s = new h();
        this.f17863t = new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.cardhost.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.h0(this.f17843a, valueAnimator);
            }
        };
        this.f17864u = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardhost.b
            @Override // p219v8.a
            public final Object invoke() {
                return f.i0(this.f17844q);
            }
        });
        this.f17865v = new d(this, false, new p219v8.a() { // from class: com.nothing.cardhost.c
            @Override // p219v8.a
            public final Object invoke() {
                return f.k0(this.f17845q);
            }
        }, new p219v8.a() { // from class: com.nothing.cardhost.d
            @Override // p219v8.a
            public final Object invoke() {
                return f.l0(this.f17846q);
            }
        });
        this.f17866w = new i();
    }
}
