package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1224a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final ComponentCallbacks2C1224a f16225u = new ComponentCallbacks2C1224a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f16226q = new AtomicBoolean();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f16227r = new AtomicBoolean();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f16228s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16229t = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0455a {
        void a(boolean z9);
    }

    private ComponentCallbacks2C1224a() {
    }

    public static ComponentCallbacks2C1224a b() {
        return f16225u;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1224a componentCallbacks2C1224a = f16225u;
        synchronized (componentCallbacks2C1224a) {
            try {
                if (!componentCallbacks2C1224a.f16229t) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1224a);
                    application.registerComponentCallbacks(componentCallbacks2C1224a);
                    componentCallbacks2C1224a.f16229t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z9) {
        synchronized (f16225u) {
            try {
                Iterator it = this.f16228s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0455a) it.next()).a(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0455a interfaceC0455a) {
        synchronized (f16225u) {
            this.f16228s.add(interfaceC0455a);
        }
    }

    public boolean d() {
        return this.f16226q.get();
    }

    public boolean e(boolean z9) {
        if (!this.f16227r.get()) {
            if (!p085i4.g.a()) {
                return z9;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f16227r.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f16226q.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f16226q.compareAndSet(true, false);
        this.f16227r.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f16226q.compareAndSet(true, false);
        this.f16227r.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f16226q.compareAndSet(false, true)) {
            this.f16227r.set(true);
            f(true);
        }
    }
}
