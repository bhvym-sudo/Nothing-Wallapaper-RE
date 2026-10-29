package Q2;

import android.os.SystemProperties;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f6806a = "appliedTimestamp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f6807b = N.i(p079h8.v.a("com.android.systemui.clocks.bignum", AbstractC1444s.e(new O2.s("ANALOG_CLOCK_BIGNUM", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.calligraphy", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_CALLIGRAPHY", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.flex", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_FLEX", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.growth", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_GROWTH", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.handwritten", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_HANDWRITTEN", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.inflate", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_INFLATE", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.metro", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_METRO", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.numoverlap", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_NUMBEROVERLAP", false, null, false, 14, null))), p079h8.v.a("com.android.systemui.clocks.weather", AbstractC1444s.e(new O2.s("DIGITAL_CLOCK_WEATHER", false, null, false, 14, null))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f6808c;

    static {
        f6808c = kotlin.jvm.internal.n.d("Community Edition", SystemProperties.get("ro.phone.shell.persist_color")) && kotlin.jvm.internal.n.d("Asteroids", SystemProperties.get("ro.product.device"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(ConcurrentHashMap concurrentHashMap, Object obj, Object obj2, p219v8.l lVar) {
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(obj, obj2);
        if (objPutIfAbsent == null) {
            lVar.f(obj2);
        }
        return objPutIfAbsent == null ? obj2 : objPutIfAbsent;
    }
}
