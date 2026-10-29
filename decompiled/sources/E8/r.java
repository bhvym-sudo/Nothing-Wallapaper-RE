package E8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends q {
    public static Double n(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        try {
            if (h.f1472b.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float o(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        try {
            if (h.f1472b.a(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
