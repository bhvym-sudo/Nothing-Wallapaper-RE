package p025c4;

import android.util.Log;

/* JADX INFO: renamed from: c4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1195i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15192b;

    public C1195i(String str, String str2) {
        AbstractC1202p.j(str, "log tag cannot be null");
        AbstractC1202p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15191a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f15192b = null;
        } else {
            this.f15192b = str2;
        }
    }

    private final String g(String str) {
        String str2 = this.f15192b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f15191a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }
}
