package E5;

import E8.i;
import java.util.Locale;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1305a = new g();

    private g() {
    }

    public static /* synthetic */ boolean c(g gVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = Locale.getDefault().getLanguage();
        }
        return gVar.b(str);
    }

    public final boolean a(String familyName) {
        n.h(familyName, "familyName");
        return i.Q(familyName, "ndot", true);
    }

    public final boolean b(String language) {
        n.h(language, "language");
        return Z5.a.a(language);
    }
}
