package p206u5;

import E8.i;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte a(Object obj) {
        Byte bP;
        n.h(obj, "<this>");
        if (obj instanceof Byte) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof Float) {
            return (byte) ((Number) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return (byte) ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return (byte) ((Number) obj).longValue();
        }
        if (obj instanceof Double) {
            return (byte) ((Number) obj).doubleValue();
        }
        if (obj instanceof Short) {
            return (byte) ((Number) obj).shortValue();
        }
        if (!(obj instanceof String) || (bP = i.p((String) obj)) == null) {
            return (byte) 0;
        }
        return bP.byteValue();
    }

    public static final Object b(Object obj, Class cls) {
        n.h(obj, "<this>");
        if (n.d(cls, Float.TYPE)) {
            return Float.valueOf(d(obj));
        }
        if (n.d(cls, Double.TYPE)) {
            return Double.valueOf(c(obj));
        }
        if (n.d(cls, Short.TYPE)) {
            return Short.valueOf(i(obj));
        }
        if (n.d(cls, Integer.TYPE)) {
            return Integer.valueOf(e(obj));
        }
        if (n.d(cls, Byte.TYPE)) {
            return Byte.valueOf(a(obj));
        }
        return n.d(cls, Long.TYPE) ? Long.valueOf(h(obj)) : obj;
    }

    public static final double c(Object obj) {
        Double dN;
        n.h(obj, "<this>");
        if (obj instanceof Byte) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Short) {
            return ((Number) obj).shortValue();
        }
        if (!(obj instanceof String) || (dN = i.n((String) obj)) == null) {
            return 0.0d;
        }
        return dN.doubleValue();
    }

    public static final float d(Object obj) {
        Float fO;
        n.h(obj, "<this>");
        if (obj instanceof Byte) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Double) {
            return (float) ((Number) obj).doubleValue();
        }
        if (obj instanceof Short) {
            return ((Number) obj).shortValue();
        }
        if (!(obj instanceof String) || (fO = i.o((String) obj)) == null) {
            return 0.0f;
        }
        return fO.floatValue();
    }

    public static final int e(Object obj) {
        Integer numR;
        n.h(obj, "<this>");
        if (obj instanceof Byte) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof Float) {
            return (int) ((Number) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Number) obj).longValue();
        }
        if (obj instanceof Double) {
            return (int) ((Number) obj).doubleValue();
        }
        if (obj instanceof Short) {
            return ((Number) obj).shortValue();
        }
        if (!(obj instanceof String) || (numR = i.r((String) obj)) == null) {
            return 0;
        }
        return numR.intValue();
    }

    public static final JSONArray f(Object obj) {
        n.h(obj, "<this>");
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            return new JSONArray((String) obj);
        }
        return null;
    }

    public static final JSONObject g(Object obj) {
        n.h(obj, "<this>");
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            return new JSONObject((String) obj);
        }
        return null;
    }

    public static final long h(Object obj) {
        Long lT;
        n.h(obj, "<this>");
        if (obj instanceof Byte) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof Float) {
            return (long) ((Number) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Double) {
            return (long) ((Number) obj).doubleValue();
        }
        if (obj instanceof Short) {
            return ((Number) obj).shortValue();
        }
        if (!(obj instanceof String) || (lT = i.t((String) obj)) == null) {
            return 0L;
        }
        return lT.longValue();
    }

    public static final short i(Object obj) {
        Short shV;
        n.h(obj, "<this>");
        if (obj instanceof Byte) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof Float) {
            return (short) ((Number) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return (short) ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return (short) ((Number) obj).longValue();
        }
        if (obj instanceof Double) {
            return (short) ((Number) obj).doubleValue();
        }
        if (obj instanceof Short) {
            return ((Number) obj).shortValue();
        }
        if (!(obj instanceof String) || (shV = i.v((String) obj)) == null) {
            return (short) 0;
        }
        return shV.shortValue();
    }
}
