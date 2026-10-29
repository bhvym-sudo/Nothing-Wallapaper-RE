package E6;

import C6.e;
import C6.h;
import E8.i;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: E6.a$a, reason: collision with other inner class name */
    public static class C0050a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0051a f1306b = new C0051a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f1307a;

        /* JADX INFO: renamed from: E6.a$a$a, reason: collision with other inner class name */
        public static final class C0051a {
            public /* synthetic */ C0051a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final C0050a a(String str) throws JSONException {
                n.h(str, "str");
                if (i.f0(str)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("id");
                n.e(string);
                e eVarA = h.a(string);
                String strOptString = jSONObject.optString("params");
                n.e(strOptString);
                return eVarA.b(strOptString);
            }

            private C0051a() {
            }
        }

        public C0050a(e effect) {
            n.h(effect, "effect");
            this.f1307a = effect;
        }

        public final String a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f1307a.a());
            String strC = c();
            if (strC != null) {
                jSONObject.put("params", strC);
            }
            String string = jSONObject.toString();
            n.g(string, "toString(...)");
            return string;
        }

        public final e b() {
            return this.f1307a;
        }

        protected final String c() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!n.d(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            n.f(obj, "null cannot be cast to non-null type com.nothing.wallpaper.effects.effecter.Effecter.Params");
            return n.d(this.f1307a, ((C0050a) obj).f1307a);
        }

        public int hashCode() {
            return this.f1307a.hashCode();
        }
    }

    Bitmap a(Bitmap bitmap, Bitmap bitmap2, C0050a c0050a);
}
