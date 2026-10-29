package I5;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    NONE("none"),
    AIRPLANE_MODE_CHANGED("android.intent.action.AIRPLANE_MODE"),
    HEADSET_PLUG("android.intent.action.HEADSET_PLUG"),
    BATTERY_LOW("android.intent.action.BATTERY_LOW"),
    DATE_CHANGED("android.intent.action.DATE_CHANGED"),
    TIME_CHANGED("android.intent.action.TIME_SET"),
    TIME_TICK("android.intent.action.TIME_TICK"),
    TIMEZONE_CHANGE("android.intent.action.TIMEZONE_CHANGED"),
    DEVICE_STORAGE_LOW("android.intent.action.DEVICE_STORAGE_LOW"),
    USER_UNLOCKED("android.intent.action.USER_UNLOCKED"),
    SCREEN_ON("android.intent.action.SCREEN_ON"),
    POWER_CONNECTED("android.intent.action.ACTION_POWER_CONNECTED"),
    SCREEN_OFF("android.intent.action.SCREEN_OFF"),
    USER_PRESENT("android.intent.action.USER_PRESENT");


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ p149o8.a f3067H = p149o8.b.a(d());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0103a f3068r = new C0103a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f3077q;

    /* JADX INFO: renamed from: I5.a$a, reason: collision with other inner class name */
    public static final class C0103a {
        public /* synthetic */ C0103a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0103a() {
        }
    }

    a(String str) {
        this.f3077q = str;
    }

    public final String e() {
        return this.f3077q;
    }
}
