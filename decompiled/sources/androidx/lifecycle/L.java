package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC1163x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f13286y = new b(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final L f13287z = new L();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13289r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f13292u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f13290s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13291t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1165z f13293v = new C1165z(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f13294w = new Runnable() { // from class: androidx.lifecycle.K
        @Override // java.lang.Runnable
        public final void run() {
            L.i(this.f13285q);
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final O.a f13295x = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13296a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.n.h(activity, "activity");
            kotlin.jvm.internal.n.h(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final InterfaceC1163x a() {
            return L.f13287z;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            L.f13287z.h(context);
        }

        private b() {
        }
    }

    public static final class c extends AbstractC1150j {

        public static final class a extends AbstractC1150j {
            final /* synthetic */ L this$0;

            a(L l9) {
                this.this$0 = l9;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.n.h(activity, "activity");
                this.this$0.d();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.n.h(activity, "activity");
                this.this$0.e();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1150j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.h(activity, "activity");
        }

        @Override // androidx.lifecycle.AbstractC1150j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.n.h(activity, "activity");
            L.this.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.h(activity, "activity");
            a.a(activity, new a(L.this));
        }

        @Override // androidx.lifecycle.AbstractC1150j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.n.h(activity, "activity");
            L.this.g();
        }
    }

    public static final class d implements O.a {
        d() {
        }

        @Override // androidx.lifecycle.O.a
        public void a() {
        }

        @Override // androidx.lifecycle.O.a
        public void b() {
            L.this.d();
        }

        @Override // androidx.lifecycle.O.a
        public void onStart() {
            L.this.e();
        }
    }

    private L() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(L this$0) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public final void c() {
        int i10 = this.f13289r - 1;
        this.f13289r = i10;
        if (i10 == 0) {
            Handler handler = this.f13292u;
            kotlin.jvm.internal.n.e(handler);
            handler.postDelayed(this.f13294w, 700L);
        }
    }

    public final void d() {
        int i10 = this.f13289r + 1;
        this.f13289r = i10;
        if (i10 == 1) {
            if (this.f13290s) {
                this.f13293v.i(AbstractC1157q.a.ON_RESUME);
                this.f13290s = false;
            } else {
                Handler handler = this.f13292u;
                kotlin.jvm.internal.n.e(handler);
                handler.removeCallbacks(this.f13294w);
            }
        }
    }

    public final void e() {
        int i10 = this.f13288q + 1;
        this.f13288q = i10;
        if (i10 == 1 && this.f13291t) {
            this.f13293v.i(AbstractC1157q.a.ON_START);
            this.f13291t = false;
        }
    }

    public final void g() {
        this.f13288q--;
        k();
    }

    @Override // androidx.lifecycle.InterfaceC1163x
    public AbstractC1157q getLifecycle() {
        return this.f13293v;
    }

    public final void h(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f13292u = new Handler();
        this.f13293v.i(AbstractC1157q.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f13289r == 0) {
            this.f13290s = true;
            this.f13293v.i(AbstractC1157q.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f13288q == 0 && this.f13290s) {
            this.f13293v.i(AbstractC1157q.a.ON_STOP);
            this.f13291t = true;
        }
    }
}
