package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1159t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1159t f13459a = new C1159t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f13460b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    public static final class a extends AbstractC1150j {
        @Override // androidx.lifecycle.AbstractC1150j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.h(activity, "activity");
            O.f13331r.b(activity);
        }
    }

    private C1159t() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        if (f13460b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
