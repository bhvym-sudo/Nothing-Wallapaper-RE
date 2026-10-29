package E5;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1289a = new c();

    private c() {
    }

    public static final Class a(Object value) {
        n.h(value, "value");
        if (n.d(value, JSONObject.NULL)) {
            return null;
        }
        if (value instanceof Integer) {
            return Integer.TYPE;
        }
        if (value instanceof Boolean) {
            return Boolean.TYPE;
        }
        if (value instanceof Short) {
            return Short.TYPE;
        }
        if (value instanceof Float) {
            return Float.TYPE;
        }
        if (value instanceof Long) {
            return Long.TYPE;
        }
        if (value instanceof Double) {
            return Double.TYPE;
        }
        if (value instanceof Byte) {
            return Byte.TYPE;
        }
        if (value instanceof String) {
            return I5.c.f3098a.r(((Number) p206u5.c.c(new JSONObject((String) value), "param_type", -1)).intValue());
        }
        if (value instanceof Uri) {
            return Uri.class;
        }
        if (value instanceof Drawable) {
            return Drawable.class;
        }
        return value instanceof JSONObject ? I5.c.f3098a.r(((Number) p206u5.c.c((JSONObject) value, "param_type", -1)).intValue()) : value.getClass();
    }

    public static final Object b(Object value) {
        n.h(value, "value");
        if (n.d(value, JSONObject.NULL)) {
            return null;
        }
        if (value instanceof JSONObject) {
            return p206u5.c.d((JSONObject) value, "param_value");
        }
        return value instanceof String ? p206u5.c.d(new JSONObject((String) value), "param_value") : value;
    }
}
