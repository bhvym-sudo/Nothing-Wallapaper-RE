package T8;

import com.airbnb.lottie.utils.Utils;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final String b(long j9) {
        String str;
        if (j9 <= -999500000) {
            str = ((j9 - ((long) 500000000)) / ((long) Utils.SECOND_IN_NANOS)) + " s ";
        } else if (j9 <= -999500) {
            str = ((j9 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j9 <= 0) {
            str = ((j9 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j9 < 999500) {
            str = ((j9 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j9 < 999500000) {
            str = ((j9 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j9 + ((long) 500000000)) / ((long) Utils.SECOND_IN_NANOS)) + " s ";
        }
        H h10 = H.f22782a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        n.g(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger loggerA = e.f7737h.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        H h10 = H.f22782a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        n.g(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.b());
        loggerA.fine(sb.toString());
    }
}
