package p206u5;

import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Code duplicated, block: B:5:0x0019  */
    public static final JSONArray a(JSONObject jSONObject, String key) {
        Object objB;
        JSONArray jSONArray;
        n.h(jSONObject, "<this>");
        n.h(key, "key");
        try {
            q.a aVar = q.f21862r;
            Object objD = d(jSONObject, key);
            Object obj = JSONObject.NULL;
            if (n.d(objD, obj)) {
                jSONArray = null;
            } else if (objD instanceof JSONArray) {
                jSONArray = (JSONArray) objD;
            } else if (!(objD instanceof String) || n.d(obj.toString(), objD)) {
                jSONArray = null;
            } else {
                jSONArray = new JSONArray((String) objD);
            }
            objB = q.b(jSONArray);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return (JSONArray) (q.f(objB) ? null : objB);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0019  */
    public static final JSONObject b(JSONObject jSONObject, String key) {
        Object objB;
        JSONObject jSONObject2;
        n.h(jSONObject, "<this>");
        n.h(key, "key");
        try {
            q.a aVar = q.f21862r;
            Object objD = d(jSONObject, key);
            Object obj = JSONObject.NULL;
            if (n.d(objD, obj)) {
                jSONObject2 = null;
            } else if (objD instanceof JSONObject) {
                jSONObject2 = (JSONObject) objD;
            } else if (!(objD instanceof String) || n.d(obj.toString(), objD)) {
                jSONObject2 = null;
            } else {
                jSONObject2 = new JSONObject((String) objD);
            }
            objB = q.b(jSONObject2);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return (JSONObject) (q.f(objB) ? null : objB);
    }

    public static final Object c(JSONObject jSONObject, String key, Object obj) {
        Object objB;
        n.h(jSONObject, "<this>");
        n.h(key, "key");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(jSONObject.get(key));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return q.f(objB) ? obj : objB;
    }

    public static final Object d(JSONObject jSONObject, String key) {
        Object objB;
        n.h(jSONObject, "<this>");
        n.h(key, "key");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(jSONObject.get(key));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        if (q.f(objB)) {
            return null;
        }
        return objB;
    }

    public static final String e(JSONObject jSONObject, String key) {
        Object objB;
        n.h(jSONObject, "<this>");
        n.h(key, "key");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(jSONObject.getString(key));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        if (q.f(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
