package C6;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import p237x6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f648e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E6.a.C0050a f651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f652d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final g a(String str) throws JSONException {
            if (str == null || E8.i.f0(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("image");
            String strOptString = jSONObject.optString("scope");
            String strOptString2 = jSONObject.optString("param");
            n.e(string);
            j jVarA = j.f661e.a(strOptString);
            E6.a.C0050a.C0051a c0051a = E6.a.C0050a.f1306b;
            n.e(strOptString2);
            return new g(string, jVarA, c0051a.a(strOptString2));
        }

        private a() {
        }
    }

    public g(String image, j jVar, E6.a.C0050a c0050a) {
        n.h(image, "image");
        this.f649a = image;
        this.f650b = jVar;
        this.f651c = c0050a;
    }

    @Override // p237x6.p
    public void a() {
        p pVar = this.f652d;
        if (pVar != null) {
            pVar.a();
        }
        this.f652d = null;
    }

    @Override // p237x6.p
    public void b(List list) {
        p pVar = this.f652d;
        if (pVar != null) {
            pVar.b(list);
        }
        this.f652d = null;
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("image", this.f649a);
        j jVar = this.f650b;
        if (jVar != null) {
            jSONObject.put("scope", jVar.a());
        }
        E6.a.C0050a c0050a = this.f651c;
        if (c0050a != null) {
            jSONObject.put("param", c0050a.a());
        }
        String string = jSONObject.toString();
        n.g(string, "toString(...)");
        return string;
    }

    public final String d() {
        return this.f649a;
    }

    public final E6.a.C0050a e() {
        return this.f651c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        return n.d(c(), ((g) obj).c());
    }

    public final j f() {
        return this.f650b;
    }

    public final void g(p pVar) {
        this.f652d = pVar;
    }

    public int hashCode() {
        int iHashCode = this.f649a.hashCode() * 31;
        j jVar = this.f650b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        E6.a.C0050a c0050a = this.f651c;
        return iHashCode2 + (c0050a != null ? c0050a.hashCode() : 0);
    }

    public String toString() {
        return "EffectInfo(image=" + this.f649a + ", scope=" + this.f650b + ", params=" + this.f651c + ")";
    }
}
