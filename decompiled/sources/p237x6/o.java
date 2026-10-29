package p237x6;

import E8.i;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f30069a = new p() { // from class: x6.n
        @Override // p219v8.p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(o.b((String) obj, (String) obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String group, String key) {
        n.h(group, "group");
        n.h(key, "key");
        return i.A(key, group, false, 2, null);
    }

    public static final String c(String key) {
        n.h(key, "key");
        return (String) AbstractC1444s.c0(i.D0(key, new String[]{"_"}, false, 0, 6, null));
    }

    public static final String d(String str, String group) {
        n.h(group, "group");
        if (str == null) {
            String strJoin = TextUtils.join("_", AbstractC1444s.h("origin", group));
            n.e(strJoin);
            return strJoin;
        }
        if (i.f0(str)) {
            throw new IllegalArgumentException("get effect key with blank effect id.");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        n.g(lowerCase, "toLowerCase(...)");
        String strJoin2 = TextUtils.join("_", AbstractC1444s.h("effect", lowerCase, group));
        n.e(strJoin2);
        return strJoin2;
    }

    public static final p e() {
        return f30069a;
    }
}
