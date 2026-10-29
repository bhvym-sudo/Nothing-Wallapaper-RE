package p097j6;

import java.util.Arrays;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final String a(long j9) {
        if (j9 <= 0) {
            return "0 B";
        }
        double d10 = j9;
        int iLog10 = (int) (Math.log10(d10) / Math.log10(1024.0d));
        H h10 = H.f22782a;
        String str = String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d10 / Math.pow(1024.0d, iLog10)), new String[]{"B", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"}[iLog10]}, 2));
        n.g(str, "format(...)");
        return str;
    }
}
