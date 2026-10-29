package E8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p089i8.AbstractC1444s;
import p089i8.D;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends j {
    private static final p219v8.l d(final String str) {
        return str.length() == 0 ? new p219v8.l() { // from class: E8.k
            @Override // p219v8.l
            public final Object f(Object obj) {
                return m.e((String) obj);
            }
        } : new p219v8.l() { // from class: E8.l
            @Override // p219v8.l
            public final Object f(Object obj) {
                return m.f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String line) {
        kotlin.jvm.internal.n.h(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String line) {
        kotlin.jvm.internal.n.h(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!b.c(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    public static final String h(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(newIndent, "newIndent");
        List listM0 = w.m0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (!w.f0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) AbstractC1444s.e0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM0.size());
        p219v8.l lVarD = d(newIndent);
        int iM = AbstractC1444s.m(listM0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iM) && w.f0(str3)) {
                str3 = null;
            } else {
                String strO0 = y.O0(str3, iIntValue);
                if (strO0 != null && (str2 = (String) lVarD.f(strO0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) D.X(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(newIndent, "newIndent");
        kotlin.jvm.internal.n.h(marginPrefix, "marginPrefix");
        if (w.f0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM0 = w.m0(str);
        int length = str.length() + (newIndent.length() * listM0.size());
        p219v8.l lVarD = d(newIndent);
        int iM = AbstractC1444s.m(listM0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM) && w.f0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!b.c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (t.L(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        kotlin.jvm.internal.n.f(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) lVarD.f(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) D.X(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String marginPrefix) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(marginPrefix, "marginPrefix");
        return i(str, "", marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
