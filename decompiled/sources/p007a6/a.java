package p007a6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p017b6.b;
import p017b6.f;
import p017b6.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static boolean a(String str) {
        Class clsA = b.a("com.nothing.NtFeaturesUtils");
        Field fieldA = f.a(clsA, str, Integer.TYPE);
        if (fieldA == null) {
            return false;
        }
        int iIntValue = ((Integer) f.b(fieldA, null)).intValue();
        Method methodA = g.a(clsA, "isSupport", int[].class);
        if (methodA != null) {
            return ((Boolean) g.b(methodA, null, new int[]{iIntValue})).booleanValue();
        }
        return false;
    }
}
