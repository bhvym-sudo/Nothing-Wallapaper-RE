package com.nothing.wallpaper.common.log;

import I8.A;
import I8.O;
import I8.Q;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f18435a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f18436b = "nt_log_capture";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Uri f18437c = Settings.System.getUriFor("nt_log_capture");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final A f18438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final O f18439e;

    public static final class a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f18440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(null);
            this.f18440a = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9, Uri uri) {
            c.b(Settings.System.getInt(this.f18440a.getContentResolver(), c.f18436b, 0) == 1);
        }
    }

    static {
        A a10 = Q.a(Boolean.FALSE);
        f18438d = a10;
        f18439e = a10;
    }

    private c() {
    }

    public static final void b(boolean z9) {
        f18438d.setValue(Boolean.valueOf(z9));
    }

    public static final void c(String message) {
        n.h(message, "message");
        if (f18435a.m() || Log.isLoggable("NTWallpaper", 3)) {
            Log.d("NTWallpaper", message);
        }
    }

    public static final void d(String tag, String message) {
        n.h(tag, "tag");
        n.h(message, "message");
        if (f18435a.m() || Log.isLoggable("NTWallpaper", 3)) {
            Log.d(tag, message);
        }
    }

    public static final void e(String message) {
        n.h(message, "message");
        Log.e("NTWallpaper", message);
    }

    public static final void f(String tag, String message) {
        n.h(tag, "tag");
        n.h(message, "message");
        Log.e(tag, message);
    }

    public static final void g(String tag, String message, Throwable e10) {
        n.h(tag, "tag");
        n.h(message, "message");
        n.h(e10, "e");
        if (f18435a.m() || Log.isLoggable("NTWallpaper", 6)) {
            Log.e(tag, message, e10);
        }
    }

    public static final void h(String str, Throwable e10) {
        n.h(e10, "e");
        if (f18435a.m() || Log.isLoggable("NTWallpaper", 6)) {
            Log.e("NTWallpaper", str, e10);
        }
    }

    public static final void j(String message) {
        n.h(message, "message");
        Log.i("NTWallpaper", message);
    }

    public static final void k(String tag, String message) {
        n.h(tag, "tag");
        n.h(message, "message");
        Log.i(tag, message);
    }

    public static final void l(Context context) {
        n.h(context, "context");
        f18438d.setValue(Boolean.valueOf(Settings.System.getInt(context.getContentResolver(), f18436b, 0) == 1));
        context.getContentResolver().registerContentObserver(f18437c, false, new a(context));
    }

    public static final void n(String tag, String message) {
        n.h(tag, "tag");
        n.h(message, "message");
        if (f18435a.m() || Log.isLoggable("NTWallpaper", 2)) {
            Log.v(tag, message);
        }
    }

    public static final void o(String tag, String message) {
        n.h(tag, "tag");
        n.h(message, "message");
        if (f18435a.m() || Log.isLoggable("NTWallpaper", 5)) {
            Log.w(tag, message);
        }
    }

    public final O i() {
        return f18439e;
    }

    public final boolean m() {
        return ((Boolean) f18438d.getValue()).booleanValue();
    }
}
