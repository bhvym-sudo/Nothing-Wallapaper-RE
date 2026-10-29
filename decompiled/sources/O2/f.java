package O2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5774b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f5775c = "key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f5776d = "value";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5777a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final f a(JSONArray jsonArray) throws JSONException {
            kotlin.jvm.internal.n.h(jsonArray, "jsonArray");
            f fVar = new f(null, 1, 0 == true ? 1 : 0);
            int length = jsonArray.length() - 1;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    JSONObject jSONObject = jsonArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        String string = jSONObject.getString(f.f5775c);
                        kotlin.jvm.internal.n.g(string, "getString(...)");
                        fVar.g(string, (float) jSONObject.getDouble(f.f5776d));
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            return fVar;
        }

        public final JSONArray b(f style) throws JSONException {
            kotlin.jvm.internal.n.h(style, "style");
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : style.f5777a.entrySet()) {
                String str = (String) entry.getKey();
                float fFloatValue = ((Number) entry.getValue()).floatValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f.f5775c, str);
                jSONObject.put(f.f5776d, Float.valueOf(fFloatValue));
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        }

        private a() {
        }
    }

    public f(p219v8.l initialize) {
        kotlin.jvm.internal.n.h(initialize, "initialize");
        this.f5777a = new LinkedHashMap();
        initialize.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A b(f fVar) {
        kotlin.jvm.internal.n.h(fVar, "<this>");
        return A.f21846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return kotlin.jvm.internal.n.d(this.f5777a, ((f) obj).f5777a);
        }
        return false;
    }

    public final Float f(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        return (Float) this.f5777a.get(key);
    }

    public final void g(String key, float f10) {
        kotlin.jvm.internal.n.h(key, "key");
        this.f5777a.put(key, Float.valueOf(f10));
    }

    public /* synthetic */ f(p219v8.l lVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? new p219v8.l() { // from class: O2.e
            @Override // p219v8.l
            public final Object f(Object obj) {
                return f.b((f) obj);
            }
        } : lVar);
    }
}
