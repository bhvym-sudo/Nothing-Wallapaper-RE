package com.nothing.blurwallpaper;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f17835a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f17836b = Settings.Secure.getUriFor("camera_double_tap_power_gesture_disabled");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f17837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Context f17838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Handler f17839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f17840f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f17841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17842b;

        public final boolean a() {
            boolean z9 = false;
            if (!h.f17835a.d()) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j9 = jCurrentTimeMillis - this.f17841a;
            this.f17841a = jCurrentTimeMillis;
            if (j9 >= 450) {
                this.f17842b = 1;
            } else {
                this.f17842b++;
            }
            if (j9 < 450 && this.f17842b == 2) {
                z9 = true;
            }
            if (z9) {
                this.f17842b = 1;
            }
            return z9;
        }
    }

    public static final class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9, Uri uri) {
            super.onChange(z9, uri);
            if (n.d(uri, h.f17836b)) {
                h.f17835a.g();
            }
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f17839e = handler;
        f17840f = new b(handler);
    }

    private h() {
    }

    private final boolean e(Resources resources) {
        try {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("config_cameraDoubleTapPowerGestureEnabled", "bool", "android");
            if (identifier != 0) {
                return system.getBoolean(identifier);
            }
            return false;
        } catch (Resources.NotFoundException e10) {
            com.nothing.wallpaper.common.log.c.h("SystemGestureLauncherSettings", e10);
            return false;
        }
    }

    private final void f(Context context) {
        context.getContentResolver().registerContentObserver(f17836b, false, f17840f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public final boolean g() {
        Context context = f17838d;
        Context context2 = null;
        if (context == null) {
            n.r("appContext");
            context = null;
        }
        Resources resources = context.getResources();
        n.g(resources, "getResources(...)");
        boolean zE = e(resources);
        if (zE) {
            try {
                Context context3 = f17838d;
                if (context3 == null) {
                    n.r("appContext");
                } else {
                    context2 = context3;
                }
                if (Settings.Secure.getInt(context2.getContentResolver(), "camera_double_tap_power_gesture_disabled") == 0) {
                    zE = true;
                } else {
                    zE = false;
                }
            } catch (Settings.SettingNotFoundException e10) {
                com.nothing.wallpaper.common.log.c.f("SystemGestureLauncherSettings", String.valueOf(e10.getMessage()));
            }
        } else {
            zE = false;
        }
        f17837c = zE;
        return f17837c;
    }

    public final void c(Context context) {
        n.h(context, "context");
        if (f17838d != null) {
            return;
        }
        f17838d = context.getApplicationContext();
        g();
        Context context2 = f17838d;
        if (context2 == null) {
            n.r("appContext");
            context2 = null;
        }
        f(context2);
    }

    public final boolean d() {
        return f17837c;
    }
}
