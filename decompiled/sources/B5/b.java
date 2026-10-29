package B5;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f380a;

    public b(JSONObject jSONObject) {
        this.f380a = jSONObject;
    }

    public final Bundle a() {
        JSONObject jSONObject = this.f380a;
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        n.g(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            H5.e.a aVar = H5.e.f2540a;
            if (!n.d(next, aVar.a())) {
                JSONObject jSONObject2 = this.f380a;
                n.e(next);
                Object objD = p206u5.c.d(jSONObject2, next);
                if (objD instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objD).booleanValue());
                } else if (objD instanceof Integer) {
                    bundle.putInt(next, ((Number) objD).intValue());
                } else {
                    boolean z9 = objD instanceof String;
                    if (z9 || (objD instanceof JSONObject)) {
                        JSONObject jSONObject3 = z9 ? new JSONObject((String) objD) : (JSONObject) objD;
                        int i10 = jSONObject3.getInt(aVar.a());
                        I5.b.a aVar2 = I5.b.f3078a;
                        if (i10 == aVar2.f()) {
                            int i11 = jSONObject3.getInt("param_type");
                            Object obj = jSONObject3.get("param_value");
                            I5.c.a aVar3 = I5.c.f3098a;
                            if (i11 == aVar3.b()) {
                                n.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
                                bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (i11 == aVar3.c()) {
                                n.e(obj);
                                bundle.putByte(next, p206u5.a.a(obj));
                            } else if (i11 == aVar3.o() || i11 == aVar3.d()) {
                                bundle.putCharSequence(next, obj.toString());
                            } else if (i11 == aVar3.f()) {
                                n.e(obj);
                                bundle.putDouble(next, p206u5.a.c(obj));
                            } else if (i11 == aVar3.h()) {
                                n.e(obj);
                                bundle.putFloat(next, p206u5.a.d(obj));
                            } else if (i11 == aVar3.k()) {
                                n.e(obj);
                                bundle.putLong(next, p206u5.a.h(obj));
                            } else if (i11 == aVar3.n()) {
                                n.e(obj);
                                bundle.putShort(next, p206u5.a.i(obj));
                            }
                        } else if (i10 == aVar2.c()) {
                            bundle.putBundle(next, new b(jSONObject3).a());
                        }
                    }
                }
            }
        }
        return bundle;
    }
}
