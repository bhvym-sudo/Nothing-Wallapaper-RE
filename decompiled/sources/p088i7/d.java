package p088i7;

import F2.AbstractC0797d;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.lifecycle.AbstractC1142b;
import androidx.lifecycle.Q;
import androidx.lifecycle.b0;
import com.nothing.wallpaper.NTPickerApplication;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.H;
import p074h3.I;
import p079h8.r;
import p129m8.e;
import p219v8.p;
import p232x1.g;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC1142b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f22224i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f22225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f22226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f22227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0880f f22228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0554d f22229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f22230h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22231q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22232r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f22233s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22234t;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return d.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0074  */
        /* JADX WARN: Code duplicated, block: B:23:0x0086  */
        /* JADX WARN: Code duplicated, block: B:37:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x0098 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
        
            if (r8 == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        
            if (r4.e(r5, r7) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:32:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r7.f22234t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f22233s
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.f22232r
                i7.d r3 = (p088i7.d) r3
                java.lang.Object r4 = r7.f22231q
                V1.a r4 = (V1.a) r4
                p079h8.r.b(r8)
                goto Lac
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L27:
                java.lang.Object r1 = r7.f22231q
                V1.a r1 = (V1.a) r1
                p079h8.r.b(r8)
                goto L5a
            L2f:
                p079h8.r.b(r8)
                h3.H r8 = p074h3.I.a()
                java.lang.String r1 = "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"
                kotlin.jvm.internal.n.f(r8, r1)
                K1.p r8 = (K1.p) r8
                i7.d r1 = p088i7.d.this
                android.app.Application r1 = r1.e()
                g3.v r4 = r8.i()
                V1.a r1 = r8.f0(r1, r4)
                I8.f r8 = r1.b()
                r7.f22231q = r1
                r7.f22234t = r3
                java.lang.Object r8 = I8.AbstractC0882h.z(r8, r7)
                if (r8 != r0) goto L5a
                goto Lab
            L5a:
                java.util.Map r8 = (java.util.Map) r8
                if (r8 == 0) goto Lbf
                java.util.Collection r8 = r8.values()
                if (r8 == 0) goto Lbf
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                i7.d r3 = p088i7.d.this
                java.util.Iterator r8 = r8.iterator()
                r4 = r1
                r1 = r8
            L6e:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto Lbf
                java.lang.Object r8 = r1.next()
                java.util.List r8 = (java.util.List) r8
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
            L80:
                boolean r5 = r8.hasNext()
                if (r5 == 0) goto L98
                java.lang.Object r5 = r8.next()
                r6 = r5
                W1.a r6 = (W1.a) r6
                x1.g r6 = r6.a()
                boolean r6 = p088i7.d.j(r3, r6)
                if (r6 == 0) goto L80
                goto L99
            L98:
                r5 = 0
            L99:
                W1.a r5 = (W1.a) r5
                if (r5 == 0) goto L6e
                r7.f22231q = r4
                r7.f22232r = r3
                r7.f22233s = r1
                r7.f22234t = r2
                java.lang.Object r8 = r4.e(r5, r7)
                if (r8 != r0) goto Lac
            Lab:
                return r0
            Lac:
                android.app.Application r8 = p088i7.d.h(r3)
                boolean r8 = O6.b.c(r8)
                if (r8 == 0) goto L6e
                android.app.Application r8 = p088i7.d.h(r3)
                r5 = 0
                O6.b.g(r8, r5)
                goto L6e
            Lbf:
                h8.A r7 = p079h8.A.f21846a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22236q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f22238s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z9, e eVar) {
            super(2, eVar);
            this.f22238s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return d.this.new c(this.f22238s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            p139n8.b.e();
            if (this.f22236q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            ContentProviderClient contentProviderClientAcquireContentProviderClient = d.this.f22225c.getContentResolver().acquireContentProviderClient(Uri.parse("content://com.nothing.launcher.share"));
            if (contentProviderClientAcquireContentProviderClient != null) {
                boolean z9 = this.f22238s;
                try {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("reset_workspace_keep", z9);
                    contentProviderClientAcquireContentProviderClient.call("reset_workspace", "", bundle);
                    p079h8.A a10 = p079h8.A.f21846a;
                    p199t8.a.a(contentProviderClientAcquireContentProviderClient, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientAcquireContentProviderClient, th);
                        throw th2;
                    }
                }
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: i7.d$d, reason: collision with other inner class name */
    public static final class C0554d extends BroadcastReceiver {
        C0554d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uri data;
            n.h(context, "context");
            if (n.d("com.nothing.launcher", (intent == null || (data = intent.getData()) == null) ? null : data.getSchemeSpecificPart())) {
                d.this.f22227e.setValue(Boolean.valueOf(d.this.q()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Application application, Q savedStateHandle) {
        super(application);
        n.h(application, "application");
        n.h(savedStateHandle, "savedStateHandle");
        this.f22225c = application;
        this.f22226d = savedStateHandle;
        A a10 = I8.Q.a(Boolean.valueOf(q()));
        this.f22227e = a10;
        this.f22228f = AbstractC0882h.b(a10);
        this.f22229g = new C0554d();
    }

    private final void k() {
        AbstractC0816i.d(b0.a(this), null, null, new b(null), 3, null);
    }

    private final void l(boolean z9) {
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new c(z9, null), 2, null);
    }

    private final boolean m() {
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        K1.p pVar = (K1.p) hA;
        return !o(pVar.f0(e(), pVar.i()).c().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(g gVar) {
        Integer numF = gVar.f();
        return (numF == null || numF.intValue() != 7 || gVar.b() == 100) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(d dVar, Context context) {
        if (dVar.f22230h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        intentFilter.addDataSchemeSpecificPart("com.nothing.launcher", 0);
        context.getApplicationContext().registerReceiver(dVar.f22229g, intentFilter);
        dVar.f22230h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(d dVar, Context context) {
        if (dVar.f22230h) {
            context.getApplicationContext().unregisterReceiver(dVar.f22229g);
        }
        dVar.f22230h = false;
    }

    public final InterfaceC0880f n() {
        return this.f22228f;
    }

    public final Boolean p() {
        return (Boolean) this.f22226d.d("key_show_dialog");
    }

    public final boolean q() {
        try {
            ApplicationInfo applicationInfo = NTPickerApplication.f18424q.a().getPackageManager().getApplicationInfo("com.nothing.launcher", Optimizer.OPTIMIZATION_GRAPH_WRAP);
            n.g(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.metaData.getBoolean("com.nothing.launcher.support.reset");
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.h("NTResetToolbarButtonBinder", e10);
            return false;
        }
    }

    public final void r(final Context context) {
        n.h(context, "context");
        AbstractC0797d.f1556d.execute(new Runnable() { // from class: i7.c
            @Override // java.lang.Runnable
            public final void run() {
                d.s(this.f22222q, context);
            }
        });
    }

    public final void t(boolean z9) {
        l(z9);
        if (m()) {
            k();
        }
    }

    public final void u(Boolean bool) {
        this.f22226d.i("key_show_dialog", bool);
    }

    public final void v(final Context context) {
        n.h(context, "context");
        AbstractC0797d.f1556d.execute(new Runnable() { // from class: i7.b
            @Override // java.lang.Runnable
            public final void run() {
                d.w(this.f22220q, context);
            }
        });
    }
}
