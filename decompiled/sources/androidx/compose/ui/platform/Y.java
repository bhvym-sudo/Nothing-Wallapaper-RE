package androidx.compose.ui.platform;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f22782a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.n.g(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }
}
