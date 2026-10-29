package D5;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class s extends w {
    public s(JSONObject jSONObject) {
        super(jSONObject);
    }

    private final void D(View view, Object obj) {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            B5.c cVar = new B5.c(p206u5.a.g(obj));
            Context context = view.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            Intent intentA = cVar.a(context);
            E5.f.a(view).a("setRemoteServiceIntent", Intent.class).b(view, intentA);
            G5.c.b("Host", "Call invoke method = setRemoteServiceIntent, value = " + intentA);
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.d("Host", "Invoke setRemoteServiceIntent error. msg = " + thD);
        }
    }

    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        if (kotlin.jvm.internal.n.d(str, "set_remote_view_service")) {
            D(view, obj);
            return A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }
}
