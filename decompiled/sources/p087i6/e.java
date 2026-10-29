package p087i6;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.provider.Settings;
import java.util.Locale;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f22188a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f22189b = i.b(new a() { // from class: i6.c
        @Override // p219v8.a
        public final Object invoke() {
            return e.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f22190c = i.b(new a() { // from class: i6.d
        @Override // p219v8.a
        public final Object invoke() {
            return e.c();
        }
    });

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c() {
        String str = SystemProperties.get("ro.phone.shell.color", "black");
        n.g(str, "get(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d() {
        return Build.MODEL;
    }

    public static final String g(Context context) {
        n.h(context, "context");
        String string = Settings.Global.getString(context.getContentResolver(), "device_unique_code");
        if (string != null && string.length() != 0) {
            return string;
        }
        String strA = r.a();
        Settings.Global.putString(context.getContentResolver(), "device_unique_code", strA);
        return strA;
    }

    public static final String h(Context context) {
        n.h(context, "context");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        n.e(locale);
        return i(locale);
    }

    public static final String i(Locale locale) {
        String str;
        n.h(locale, "locale");
        String script = locale.getScript();
        if (script == null || script.length() == 0) {
            str = locale.getLanguage() + "-" + locale.getCountry();
        } else {
            str = locale.getLanguage() + "-" + locale.getCountry() + "-" + locale.getScript();
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        n.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final boolean j() {
        return p007a6.a.a("NTF_ADJUSTABLE_KEYGUARD_CLOCK");
    }

    public static final boolean k(Context context) {
        n.h(context, "context");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return n.d("en", locale.getLanguage());
    }

    public static final boolean l() {
        return p007a6.a.a("NTF_PJ_ME") || p007a6.a.a("NTF_PONG");
    }

    public static final boolean m() {
        return p007a6.a.a("NTF_TETRIS");
    }

    public static final boolean n() {
        return n.d(Build.DEVICE, "Spacewar");
    }

    public final String e() {
        return (String) f22190c.getValue();
    }

    public final String f() {
        Object value = f22189b.getValue();
        n.g(value, "getValue(...)");
        return (String) value;
    }
}
