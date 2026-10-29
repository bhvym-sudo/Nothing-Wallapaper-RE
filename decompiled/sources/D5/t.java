package D5;

import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x {
    public t(JSONObject jSONObject) {
        super(jSONObject);
    }

    private final Object F(View view, String str, Object obj, p129m8.e eVar) {
        Object objP;
        return ((view instanceof FrameLayout) && (objP = super.p(view, str, obj, eVar)) == p139n8.b.e()) ? objP : A.f21846a;
    }

    @Override // D5.x, D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        if (kotlin.jvm.internal.n.d(str, "setCornersRadius")) {
            Object objF = F(view, str, obj, eVar);
            return objF == p139n8.b.e() ? objF : A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }
}
