package p206u5;

import B8.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.q;
import p079h8.r;
import p089i8.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final JSONObject a(JSONArray jSONArray, int i10) {
        Object objB;
        JSONObject jSONObject;
        n.h(jSONArray, "<this>");
        try {
            q.a aVar = q.f21862r;
            Object objC = c(jSONArray, i10);
            if (objC instanceof JSONObject) {
                jSONObject = (JSONObject) objC;
            } else {
                jSONObject = objC instanceof String ? new JSONObject((String) objC) : null;
            }
            objB = q.b(jSONObject);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return (JSONObject) (q.f(objB) ? null : objB);
    }

    public static final Object b(JSONArray jSONArray, int i10, Object obj) {
        Object objB;
        n.h(jSONArray, "<this>");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(jSONArray.get(i10));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return q.f(objB) ? obj : objB;
    }

    public static final Object c(JSONArray jSONArray, int i10) {
        Object objB;
        n.h(jSONArray, "<this>");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(jSONArray.get(i10));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        if (q.f(objB)) {
            return null;
        }
        return objB;
    }

    public static final float[] d(JSONArray jSONArray) {
        n.h(jSONArray, "<this>");
        float[] fArr = new float[jSONArray.length()];
        Iterator it = h.q(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int iA = ((L) it).a();
            Object objC = c(jSONArray, iA);
            fArr[iA] = objC != null ? a.d(objC) : 0.0f;
        }
        return fArr;
    }

    public static final int[] e(JSONArray jSONArray) {
        n.h(jSONArray, "<this>");
        int[] iArr = new int[jSONArray.length()];
        Iterator it = h.q(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int iA = ((L) it).a();
            Object objC = c(jSONArray, iA);
            iArr[iA] = objC != null ? a.e(objC) : 0;
        }
        return iArr;
    }

    public static final List f(JSONArray jSONArray) {
        String string;
        n.h(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = h.q(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            Object objC = c(jSONArray, ((L) it).a());
            if (objC != null && (string = objC.toString()) != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }
}
