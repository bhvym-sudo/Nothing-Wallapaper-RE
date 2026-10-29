package B5;

import B8.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p089i8.L;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f381b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f382a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public c(JSONObject jSONObject) {
        this.f382a = jSONObject;
    }

    public final Intent a(Context context) {
        n.h(context, "context");
        JSONObject jSONObject = this.f382a;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("action");
        String strE = p206u5.c.e(this.f382a, "uri");
        String strOptString = this.f382a.optString("package");
        int iIntValue = ((Number) p206u5.c.c(this.f382a, "flag", 335544320)).intValue();
        String strE2 = p206u5.c.e(this.f382a, "className");
        Bundle bundleA = new b(p206u5.c.b(this.f382a, "bundle")).a();
        JSONArray jSONArrayA = p206u5.c.a(this.f382a, "category");
        Intent intent = strE == null ? new Intent(string) : new Intent(string, Uri.parse(strE));
        if (!TextUtils.isEmpty(strOptString)) {
            intent.setPackage(strOptString);
            if (strE2 != null) {
                intent.setComponent(new ComponentName(strOptString, strE2));
            }
        }
        if (bundleA != null) {
            intent.putExtras(bundleA);
        }
        if (jSONArrayA != null) {
            Iterator it = h.q(0, jSONArrayA.length()).iterator();
            while (it.hasNext()) {
                Object objC = p206u5.b.c(jSONArrayA, ((L) it).a());
                if (objC instanceof String) {
                    intent.addCategory((String) objC);
                }
            }
        }
        intent.setFlags(iIntValue);
        return intent;
    }
}
