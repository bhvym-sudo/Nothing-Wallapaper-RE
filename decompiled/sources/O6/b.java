package O6;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p087i6.e;
import p232x1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5921a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f5922b = i.b(new p219v8.a() { // from class: O6.a
        @Override // p219v8.a
        public final Object invoke() {
            return Boolean.valueOf(b.f());
        }
    });

    private b() {
    }

    public static final boolean b(Context context) {
        n.h(context, "context");
        return d(context) && c.t(context);
    }

    public static final boolean c(Context context) {
        n.h(context, "context");
        return Settings.System.getInt(context.getContentResolver(), "theme_bauhaus_enable", 0) == 1;
    }

    public static final boolean d(Context context) {
        n.h(context, "context");
        return e() && Settings.System.getInt(context.getContentResolver(), "theme_bauhaus_unlocked", 0) == 1;
    }

    public static final boolean e() {
        return ((Boolean) f5922b.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return n.d(e.f22188a.e(), "special edition");
    }

    public static final void g(Context context, boolean z9) {
        n.h(context, "context");
        Settings.System.putInt(context.getContentResolver(), "theme_bauhaus_enable", z9 ? 1 : 0);
    }

    public static final void h(Context context, boolean z9) {
        n.h(context, "context");
        Settings.System.putInt(context.getContentResolver(), "theme_bauhaus_unlocked", z9 ? 1 : 0);
    }
}
