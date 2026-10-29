package B5;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f378b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f379c = new ArrayList();

    public a(JSONArray jSONArray) {
        this.f377a = jSONArray;
    }

    public final ArrayList a() {
        return this.f378b;
    }

    public final ArrayList b() {
        return this.f379c;
    }

    public final void c(Context context) {
        n.h(context, "context");
        JSONArray jSONArray = this.f377a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectA = p206u5.b.a(jSONArray, i10);
                if (jSONObjectA != null) {
                    int iIntValue = ((Number) p206u5.c.c(jSONObjectA, "param_type", -1)).intValue();
                    Object objD = p206u5.c.d(jSONObjectA, "param_value");
                    I5.c.a aVar = I5.c.f3098a;
                    Class clsR = aVar.r(iIntValue);
                    Object objS = aVar.s(context, iIntValue, objD);
                    this.f378b.add(clsR);
                    this.f379c.add(objS);
                }
            }
        }
    }
}
