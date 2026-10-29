package D5;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public class x extends w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f951v = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public x(JSONObject jSONObject) {
        super(jSONObject);
    }

    static /* synthetic */ Object D(x xVar, View view, String str, Object obj, p129m8.e eVar) {
        if (kotlin.jvm.internal.n.d(str, "setLayoutAnimation")) {
            Object objE = xVar.E(view, str, obj, eVar);
            return objE == p139n8.b.e() ? objE : A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }

    private final Object E(View view, String str, Object obj, p129m8.e eVar) {
        Object objB;
        Object objL;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b((!(obj instanceof Integer) || ((Number) obj).intValue() <= 0) ? null : AnimationUtils.loadLayoutAnimation(view.getContext(), ((Number) obj).intValue()));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        LayoutAnimationController layoutAnimationController = (LayoutAnimationController) (p079h8.q.f(objB) ? null : objB);
        return (layoutAnimationController == null || (objL = l(view, str, layoutAnimationController, eVar)) != p139n8.b.e()) ? A.f21846a : objL;
    }

    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        return D(this, view, str, obj, eVar);
    }
}
