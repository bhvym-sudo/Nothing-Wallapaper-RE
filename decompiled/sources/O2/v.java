package O2;

import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5811e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f5812f = "clockId";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f5813g = "seedColor";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f5814h = "metadata";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f5815i = "axes";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f5817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f5818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f5819d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final v a(JSONObject json) {
            kotlin.jvm.internal.n.h(json, "json");
            String string = !json.isNull(v.f5812f) ? json.getString(v.f5812f) : null;
            Integer numValueOf = !json.isNull(v.f5813g) ? Integer.valueOf(json.getInt(v.f5813g)) : null;
            JSONArray jSONArrayOptJSONArray = json.optJSONArray(v.f5815i);
            f fVarA = jSONArrayOptJSONArray != null ? f.f5774b.a(jSONArrayOptJSONArray) : null;
            if (fVarA == null) {
                fVarA = new f(null, 1, null);
            }
            v vVar = new v(string, numValueOf, fVarA);
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(v.f5814h);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            vVar.k(jSONObjectOptJSONObject);
            return vVar;
        }

        public final JSONObject b(v setting) throws JSONException {
            kotlin.jvm.internal.n.h(setting, "setting");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(v.f5812f, setting.h());
            jSONObject.put(v.f5813g, setting.j());
            jSONObject.put(v.f5814h, setting.i());
            jSONObject.put(v.f5815i, f.f5774b.b(setting.g()));
            return jSONObject;
        }

        private a() {
        }
    }

    public v(String str, Integer num, f axes) {
        kotlin.jvm.internal.n.h(axes, "axes");
        this.f5816a = str;
        this.f5817b = num;
        this.f5818c = axes;
        this.f5819d = new JSONObject();
    }

    public static /* synthetic */ v f(v vVar, String str, Integer num, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vVar.f5816a;
        }
        if ((i10 & 2) != 0) {
            num = vVar.f5817b;
        }
        if ((i10 & 4) != 0) {
            fVar = vVar.f5818c;
        }
        return vVar.e(str, num, fVar);
    }

    public final v e(String str, Integer num, f axes) {
        kotlin.jvm.internal.n.h(axes, "axes");
        return new v(str, num, axes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.n.d(this.f5816a, vVar.f5816a) && kotlin.jvm.internal.n.d(this.f5817b, vVar.f5817b) && kotlin.jvm.internal.n.d(this.f5818c, vVar.f5818c);
    }

    public final f g() {
        return this.f5818c;
    }

    public final String h() {
        return this.f5816a;
    }

    public int hashCode() {
        String str = this.f5816a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5817b;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.f5818c.hashCode();
    }

    public final JSONObject i() {
        return this.f5819d;
    }

    public final Integer j() {
        return this.f5817b;
    }

    public final void k(JSONObject jSONObject) {
        kotlin.jvm.internal.n.h(jSONObject, "<set-?>");
        this.f5819d = jSONObject;
    }

    public String toString() {
        return "ClockSettings(clockId=" + this.f5816a + ", seedColor=" + this.f5817b + ", axes=" + this.f5818c + ")";
    }

    public /* synthetic */ v(String str, Integer num, f fVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? new f(null, 1, null) : fVar);
    }
}
