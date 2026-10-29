package E8;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends x {
    public static final String O0(String str, int i10) {
        kotlin.jvm.internal.n.h(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(B8.h.i(i10, str.length()));
            kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char P0(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(w.X(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String Q0(String str, int i10) {
        kotlin.jvm.internal.n.h(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, B8.h.i(i10, str.length()));
            kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
