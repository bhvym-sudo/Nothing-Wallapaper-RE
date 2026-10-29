package F5;

import java.util.Map;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1640a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f1641b = N.i(v.a("getInstalledCardWithLevel", 1), v.a("partlyUpdateWidget", 2), v.a("newPartlyUpdate", 3), v.a("clearLiveDemoData", 4), v.a("midnightAlarm", 5), v.a("getGroupWidgetViewInfoByCardId", 6), v.a("isThemeColorModeEnabled", 6));

    private b() {
    }

    public final boolean a(String apiName, int i10) {
        kotlin.jvm.internal.n.h(apiName, "apiName");
        Integer num = (Integer) f1641b.get(apiName);
        return (num != null ? num.intValue() : 0) <= i10;
    }
}
