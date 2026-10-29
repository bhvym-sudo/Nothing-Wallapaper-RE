package p226w5;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import F8.L;
import G5.c;
import O5.g;
import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f29444a;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29445q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f29447s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Bundle f29448t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Bundle bundle, e eVar) {
            super(2, eVar);
            this.f29447s = str;
            this.f29448t = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return b.this.new a(this.f29447s, this.f29448t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p139n8.b.e();
            if (this.f29445q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            String strA = b.this.f29444a.a();
            int iC = b.this.f29444a.c();
            b bVar = b.this;
            String str = this.f29447s;
            Bundle bundle = this.f29448t;
            try {
                q.a aVar = q.f21862r;
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = bVar.f29444a.b().getApplicationContext().getContentResolver().acquireUnstableContentProviderClient(strA);
                Bundle bundle2 = null;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(strA, str, String.valueOf(iC), bundle);
                        p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, null);
                        bundle2 = bundleCall;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, th);
                            throw th2;
                        }
                    }
                }
                objB = q.b(bundle2);
            } catch (Throwable th3) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th3));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                c.d("Parse", "CallRemoteProvider error: " + thD);
            }
            c.b("Parse", "callRemoteProvider, authority = " + strA + ", method = " + this.f29447s + ", widgetId = " + iC);
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: w5.b$b, reason: collision with other inner class name */
    static final class C0720b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29449q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ B5.e f29450r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f29451s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f29452t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p216v5.a f29453u;

        /* JADX INFO: renamed from: w5.b$b$a */
        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f29454q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ B5.e f29455r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p216v5.a f29456s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ View f29457t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ PendingIntent f29458u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ b f29459v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B5.e eVar, p216v5.a aVar, View view, PendingIntent pendingIntent, b bVar, e eVar2) {
                super(2, eVar2);
                this.f29455r = eVar;
                this.f29456s = aVar;
                this.f29457t = view;
                this.f29458u = pendingIntent;
                this.f29459v = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f29455r, this.f29456s, this.f29457t, this.f29458u, this.f29459v, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                p139n8.b.e();
                if (this.f29454q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                if (this.f29455r.e()) {
                    p216v5.a aVar = this.f29456s;
                    View view = this.f29457t;
                    kotlin.coroutines.jvm.internal.b.a(aVar.onCardInteraction(view, this.f29458u, p216v5.b.f28528a.a(view)));
                } else {
                    b bVar = this.f29459v;
                    PendingIntent pendingIntent = this.f29458u;
                    try {
                        q.a aVar2 = q.f21862r;
                        bVar.f29444a.b().startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
                        objB = q.b(A.f21846a);
                    } catch (Throwable th) {
                        q.a aVar3 = q.f21862r;
                        objB = q.b(r.a(th));
                    }
                    Throwable thD = q.d(objB);
                    if (thD != null) {
                        c.e("Parse", "ActionResponsive startIntentSender1 fail: ", thD);
                    }
                    q.a(objB);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0720b(B5.e eVar, b bVar, View view, p216v5.a aVar, e eVar2) {
            super(2, eVar2);
            this.f29450r = eVar;
            this.f29451s = bVar;
            this.f29452t = view;
            this.f29453u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0720b(this.f29450r, this.f29451s, this.f29452t, this.f29453u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0720b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f29449q;
            if (i10 == 0) {
                r.b(obj);
                PendingIntent pendingIntentB = this.f29450r.b(this.f29451s.f29444a);
                c.f1948a.h("Parse", "Handle pendingIntent1, intentSender: " + (pendingIntentB != null ? pendingIntentB.getIntentSender() : null));
                if (pendingIntentB != null) {
                    PendingIntent pendingIntent = this.f29452t.isAttachedToWindow() ? pendingIntentB : null;
                    if (pendingIntent != null) {
                        B5.e eVar = this.f29450r;
                        p216v5.a aVar = this.f29453u;
                        View view = this.f29452t;
                        b bVar = this.f29451s;
                        H0 h0N1 = C0803b0.c().n1();
                        a aVar2 = new a(eVar, aVar, view, pendingIntent, bVar, null);
                        this.f29449q = 1;
                        if (AbstractC0812g.g(h0N1, aVar2, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    public b(l configProvider) {
        n.h(configProvider, "configProvider");
        this.f29444a = configProvider;
    }

    private final void n(String str, Bundle bundle) {
        AbstractC0816i.d(g.j(), null, null, new a(str, bundle, null), 3, null);
    }

    private final boolean o(View view, B5.e eVar, p216v5.a aVar) {
        B5.e eVar2;
        Object objB;
        if (!eVar.c()) {
            return false;
        }
        if (eVar.f()) {
            L lJ = g.j();
            C0720b c0720b = new C0720b(eVar, this, view, aVar, null);
            eVar2 = eVar;
            AbstractC0816i.d(lJ, null, null, c0720b, 3, null);
        } else {
            eVar2 = eVar;
            PendingIntent pendingIntentA = eVar2.a(this.f29444a.b());
            if (pendingIntentA != null) {
                c.f1948a.h("Parse", "Handle pendingIntent2, intentSender: " + pendingIntentA.getIntentSender());
                if (eVar2.e()) {
                    aVar.onCardInteraction(view, pendingIntentA, p216v5.b.f28528a.a(view));
                } else {
                    try {
                        q.a aVar2 = q.f21862r;
                        this.f29444a.b().startIntentSender(pendingIntentA.getIntentSender(), null, 0, 0, 0);
                        objB = q.b(A.f21846a);
                    } catch (Throwable th) {
                        q.a aVar3 = q.f21862r;
                        objB = q.b(r.a(th));
                    }
                    Throwable thD = q.d(objB);
                    if (thD != null) {
                        c.e("Parse", "ActionResponsive startIntentSender2 fail: ", thD);
                    }
                    q.a(objB);
                }
            }
        }
        return !eVar2.d();
    }

    @Override // p226w5.j
    public void a(View view, int i10, B5.e info, p216v5.a handler) {
        n.h(view, "view");
        n.h(info, "info");
        n.h(handler, "handler");
        if (o(view, info, handler)) {
            return;
        }
        Bundle bundleG = info.g();
        bundleG.putInt("view_id", view.getId());
        bundleG.putInt("position", i10);
        bundleG.putInt("api_level", 13);
        n("actionListItemClick", bundleG);
    }

    @Override // p226w5.j
    public void b(View view, String method, B5.e info, p216v5.a handler) {
        n.h(view, "view");
        n.h(method, "method");
        n.h(info, "info");
        n.h(handler, "handler");
        if (o(view, info, handler)) {
            return;
        }
        Bundle bundleG = info.g();
        bundleG.putString("callback_method", method);
        bundleG.putInt("api_level", 13);
        n("actionCustom", bundleG);
    }

    @Override // p226w5.j
    public void c(View view, boolean z9, B5.e info, p216v5.a handler) {
        n.h(view, "view");
        n.h(info, "info");
        n.h(handler, "handler");
        if (o(view, info, handler)) {
            return;
        }
        Bundle bundleG = info.g();
        bundleG.putInt("view_id", view.getId());
        bundleG.putBoolean("is_checked", z9);
        bundleG.putInt("api_level", 13);
        n("actionCheckChange", bundleG);
    }

    @Override // p226w5.j
    public void d(String event, Bundle bundle) {
        n.h(event, "event");
        Bundle bundle2 = new Bundle();
        bundle2.putString("callback_method", "configBroadcastReceive");
        bundle2.putString("broadcast_event", event);
        bundle2.putInt("api_level", 13);
        n("configBroadcastReceive", bundle2);
    }

    @Override // p226w5.j
    public void e() {
        Bundle bundle = new Bundle();
        bundle.putInt("api_level", 13);
        n("animationStart", bundle);
    }

    @Override // p226w5.j
    public void f(View view, int i10, B5.e info) {
        n.h(view, "view");
        n.h(info, "info");
        Bundle bundleG = info.g();
        bundleG.putInt("view_id", view.getId());
        bundleG.putInt("position", i10);
        bundleG.putInt("api_level", 13);
        n("actionPageSelected", bundleG);
    }

    @Override // p226w5.j
    public boolean g(View view, B5.e info, p216v5.a handler) {
        n.h(view, "view");
        n.h(info, "info");
        n.h(handler, "handler");
        if (o(view, info, handler)) {
            return true;
        }
        Bundle bundleG = info.g();
        bundleG.putInt("view_id", view.getId());
        bundleG.putInt("api_level", 13);
        n("actionLongClick", bundleG);
        return true;
    }

    @Override // p226w5.j
    public void h() {
        Bundle bundle = new Bundle();
        bundle.putInt("api_level", 13);
        n("animationEnd", bundle);
    }

    @Override // p226w5.j
    public void i(String method, Bundle bundle) {
        n.h(method, "method");
        Bundle bundle2 = new Bundle();
        bundle2.putString("callback_method", method);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putInt("api_level", 13);
        n("actionRefresh", bundle2);
    }

    @Override // p226w5.j
    public boolean j(View view, int i10, B5.e info, p216v5.a handler) {
        n.h(view, "view");
        n.h(info, "info");
        n.h(handler, "handler");
        if (o(view, info, handler)) {
            return true;
        }
        Bundle bundleG = info.g();
        bundleG.putInt("view_id", view.getId());
        bundleG.putInt("position", i10);
        bundleG.putInt("api_level", 13);
        n("actionListItemLongClick", bundleG);
        return true;
    }

    @Override // p226w5.j
    public void k(View view, B5.e info, p216v5.a handler) {
        n.h(view, "view");
        n.h(info, "info");
        n.h(handler, "handler");
        if (o(view, info, handler)) {
            return;
        }
        Bundle bundleG = info.g();
        bundleG.putInt("view_id", view.getId());
        bundleG.putInt("api_level", 13);
        n("actionClick", bundleG);
    }

    @Override // p226w5.j
    public void l(String grantUri) {
        Object objB;
        n.h(grantUri, "grantUri");
        try {
            q.a aVar = q.f21862r;
            Bundle bundle = new Bundle();
            bundle.putString("check_uri", grantUri);
            bundle.putInt("mode_flags", 1);
            String strD = this.f29444a.d();
            if (strD.length() > 0) {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f29444a.b().getApplicationContext().getContentResolver().acquireUnstableContentProviderClient(strD);
                Bundle bundle2 = null;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("check_grant_permission", null, bundle);
                        p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, null);
                        bundle2 = bundleCall;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, th);
                            throw th2;
                        }
                    }
                }
                if (bundle2 != null && !bundle2.getBoolean("grant_result")) {
                    c.f1948a.l("Parse", "grantRemotePermissionIfNeed result: " + bundle2 + ", uri: " + grantUri);
                }
            }
            objB = q.b(A.f21846a);
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th3));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.d("Parse", "grantRemotePermissionIfNeed error: " + thD.getMessage());
        }
    }
}
