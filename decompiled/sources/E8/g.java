package E8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f1469r = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Pattern f1470q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public g(Pattern nativePattern) {
        kotlin.jvm.internal.n.h(nativePattern, "nativePattern");
        this.f1470q = nativePattern;
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.n.h(input, "input");
        return this.f1470q.matcher(input).matches();
    }

    public final String b(CharSequence input, String replacement) {
        kotlin.jvm.internal.n.h(input, "input");
        kotlin.jvm.internal.n.h(replacement, "replacement");
        String strReplaceAll = this.f1470q.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.n.g(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final List c(CharSequence input, int i10) {
        kotlin.jvm.internal.n.h(input, "input");
        w.y0(i10);
        Matcher matcher = this.f1470q.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC1444s.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? B8.h.i(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f1470q.toString();
        kotlin.jvm.internal.n.g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(String pattern) {
        kotlin.jvm.internal.n.h(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.n.g(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
