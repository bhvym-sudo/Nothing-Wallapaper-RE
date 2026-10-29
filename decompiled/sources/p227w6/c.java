package p227w6;

import C6.j;
import E8.i;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29660c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f29661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E6.a.C0050a f29662b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a(String str) {
            n.h(str, "str");
            if (i.f0(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                j jVarA = j.f661e.a(jSONObject.getString("scope"));
                if (jVarA == null) {
                    return null;
                }
                String strOptString = jSONObject.optString("params");
                return new c(jVarA, (strOptString == null || i.f0(strOptString)) ? null : E6.a.C0050a.f1306b.a(strOptString));
            } catch (JSONException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public c(j scope, E6.a.C0050a c0050a) {
        n.h(scope, "scope");
        this.f29661a = scope;
        this.f29662b = c0050a;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", this.f29661a.a());
        E6.a.C0050a c0050a = this.f29662b;
        if (c0050a != null) {
            jSONObject.put("params", c0050a.a());
        }
        String string = jSONObject.toString();
        n.g(string, "toString(...)");
        return string;
    }

    public final E6.a.C0050a b() {
        return this.f29662b;
    }

    public final j c() {
        return this.f29661a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.d(this.f29661a, cVar.f29661a) && n.d(this.f29662b, cVar.f29662b);
    }

    public int hashCode() {
        int iHashCode = this.f29661a.hashCode() * 31;
        E6.a.C0050a c0050a = this.f29662b;
        return iHashCode + (c0050a == null ? 0 : c0050a.hashCode());
    }

    public String toString() {
        return "Request(scope=" + this.f29661a + ", params=" + this.f29662b + ")";
    }
}
