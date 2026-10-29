package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C1022b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static c f10102q = new c(new d());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f10103r = -100;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static p231x0.h f10104s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static p231x0.h f10105t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Boolean f10106u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f10107v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final C1022b f10108w = new C1022b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Object f10109x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Object f10110y = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Object f10111q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Queue f10112r = new ArrayDeque();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final Executor f10113s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Runnable f10114t;

        c(Executor executor) {
            this.f10113s = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.f10111q) {
                try {
                    Runnable runnable = (Runnable) this.f10112r.poll();
                    this.f10114t = runnable;
                    if (runnable != null) {
                        this.f10113s.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f10111q) {
                try {
                    this.f10112r.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.c.a(this.f10115q, runnable);
                        }
                    });
                    if (this.f10114t == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    f() {
    }

    static void C(f fVar) {
        synchronized (f10109x) {
            D(fVar);
        }
    }

    private static void D(f fVar) {
        synchronized (f10109x) {
            try {
                Iterator it = f10108w.iterator();
                while (it.hasNext()) {
                    f fVar2 = (f) ((WeakReference) it.next()).get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void M(Context context) {
        ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
        if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
            if (k().e()) {
                String strA = p161q0.d.a(context);
                Object systemService = context.getSystemService("locale");
                if (systemService != null) {
                    b.b(systemService, a.a(strA));
                }
            }
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    static void N(final Context context) {
        if (t(context) && !f10107v) {
            f10102q.execute(new Runnable() { // from class: androidx.appcompat.app.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.c(context);
                }
            });
        }
    }

    public static /* synthetic */ void c(Context context) {
        M(context);
        f10107v = true;
    }

    static void d(f fVar) {
        synchronized (f10109x) {
            D(fVar);
            f10108w.add(new WeakReference(fVar));
        }
    }

    public static f h(Activity activity, androidx.appcompat.app.d dVar) {
        return new h(activity, dVar);
    }

    public static f i(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new h(dialog, dVar);
    }

    public static p231x0.h k() {
        Object objO = o();
        return objO != null ? p231x0.h.h(b.a(objO)) : p231x0.h.d();
    }

    public static int m() {
        return f10103r;
    }

    static Object o() {
        Context contextL;
        Iterator it = f10108w.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && (contextL = fVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    static boolean t(Context context) {
        if (f10106u == null) {
            try {
                Bundle bundle = m.a(context).metaData;
                if (bundle != null) {
                    f10106u = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f10106u = Boolean.FALSE;
            }
        }
        return f10106u.booleanValue();
    }

    public abstract void A();

    public abstract void B();

    public abstract boolean E(int i10);

    public abstract void F(int i10);

    public abstract void G(View view);

    public abstract void H(View view, ViewGroup.LayoutParams layoutParams);

    public void I(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void J(Toolbar toolbar);

    public abstract void K(int i10);

    public abstract void L(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i10);

    public abstract Context l();

    public abstract int n();

    public abstract MenuInflater p();

    public abstract androidx.appcompat.app.a q();

    public abstract void r();

    public abstract void s();

    public abstract void u(Configuration configuration);

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
