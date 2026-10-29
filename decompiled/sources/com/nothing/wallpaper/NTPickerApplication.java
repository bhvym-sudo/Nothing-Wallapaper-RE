package com.nothing.wallpaper;

import A6.b;
import android.app.Application;
import com.nothing.wallpaper.common.log.FileLog;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.I;
import p087i6.o;

/* JADX INFO: loaded from: classes2.dex */
public final class NTPickerApplication extends Application {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f18424q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Application f18425r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final void c(Application application) {
            NTPickerApplication.f18425r = application;
        }

        private final void d(Application application) {
            c.l(application);
            FileLog.setDir(application.getFilesDir(), o.f22207a.a(application) ? "main" : "blur");
        }

        public final Application a() {
            Application application = NTPickerApplication.f18425r;
            n.e(application);
            return application;
        }

        public final void b(Application app) {
            n.h(app, "app");
            d(app);
            c(app);
            I.b(new K6.c());
            b.f230a.i(app);
            if (o.f22207a.a(app)) {
                p247y6.a.f30334a.b(app);
                L6.b.f4804a.h(app);
            }
        }

        private a() {
        }
    }

    public static final Application c() {
        return f18424q.a();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        c.k("NTPickerApplication", "onCreate");
        f18424q.b(this);
    }
}
