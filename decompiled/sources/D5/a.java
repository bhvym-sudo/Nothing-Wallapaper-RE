package D5;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.view.View;
import android.widget.AnalogClock;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public class a extends w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0035a f728v = new C0035a(null);

    /* JADX INFO: renamed from: D5.a$a, reason: collision with other inner class name */
    public static final class C0035a {
        public /* synthetic */ C0035a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0035a() {
        }
    }

    public a(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    static /* synthetic */ Object D(a aVar, View view, String str, Object obj, p129m8.e eVar) {
        switch (str) {
            case "setSecondHandTintBlendMode":
                aVar.O(view, obj);
                return A.f21846a;
            case "setMinuteHand":
                aVar.K(view, str, obj);
                return A.f21846a;
            case "setHourHandTintBlendMode":
                aVar.I(view, obj);
                return A.f21846a;
            case "setMinuteHandTintList":
                aVar.M(view, obj);
                return A.f21846a;
            case "setTimeZone":
                aVar.Q(view, str, obj);
                return A.f21846a;
            case "setSecondHand":
                aVar.N(view, str, obj);
                return A.f21846a;
            case "setSecondHandTintList":
                aVar.P(view, obj);
                return A.f21846a;
            case "setDialTintBlendMode":
                aVar.F(view, obj);
                return A.f21846a;
            case "setDialTintList":
                aVar.G(view, obj);
                return A.f21846a;
            case "setHourHandTintList":
                aVar.J(view, obj);
                return A.f21846a;
            case "setHourHand":
                aVar.H(view, str, obj);
                return A.f21846a;
            case "setMinuteHandTintBlendMode":
                aVar.L(view, obj);
                return A.f21846a;
            case "setDial":
                aVar.E(view, str, obj);
                return A.f21846a;
            default:
                if (str.equals("setSecondHandTintBlendMode")) {
                    aVar.O(view, obj);
                    return A.f21846a;
                }
                Object objP = super.p(view, str, obj, eVar);
                if (objP == p139n8.b.e()) {
                    return objP;
                }
                return A.f21846a;
        }
    }

    private final void E(View view, String str, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            Icon iconCreateWithResource = Icon.createWithResource(view.getContext(), num.intValue());
            kotlin.jvm.internal.n.g(iconCreateWithResource, "createWithResource(...)");
            if (view instanceof AnalogClock) {
                ((AnalogClock) view).setDial(iconCreateWithResource);
            }
            G5.c.b("SimulatedAnalogClock", "setDial over, target = " + view + ", key = " + str + ", icon = " + iconCreateWithResource);
        }
    }

    private final void F(View view, Object obj) {
        BlendMode blendModeN = n(obj);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setDialTintBlendMode(blendModeN);
        }
    }

    private final void G(View view, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setDialTintList(colorStateListG);
        }
    }

    private final void H(View view, String str, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            Icon iconCreateWithResource = Icon.createWithResource(view.getContext(), num.intValue());
            kotlin.jvm.internal.n.g(iconCreateWithResource, "createWithResource(...)");
            if (view instanceof AnalogClock) {
                ((AnalogClock) view).setHourHand(iconCreateWithResource);
            }
            G5.c.b("SimulatedAnalogClock", "setHourHand over, target = " + view + ", key = " + str + ", icon = " + iconCreateWithResource);
        }
    }

    private final void I(View view, Object obj) {
        BlendMode blendModeN = n(obj);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setHourHandTintBlendMode(blendModeN);
        }
    }

    private final void J(View view, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setHourHandTintList(colorStateListG);
        }
    }

    private final void K(View view, String str, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            Icon iconCreateWithResource = Icon.createWithResource(view.getContext(), num.intValue());
            kotlin.jvm.internal.n.g(iconCreateWithResource, "createWithResource(...)");
            if (view instanceof AnalogClock) {
                ((AnalogClock) view).setMinuteHand(iconCreateWithResource);
            }
            G5.c.b("SimulatedAnalogClock", "setMinuteHand over, target = " + view + ", key = " + str + ", icon = " + iconCreateWithResource);
        }
    }

    private final void L(View view, Object obj) {
        BlendMode blendModeN = n(obj);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setMinuteHandTintBlendMode(blendModeN);
        }
    }

    private final void M(View view, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setMinuteHandTintList(colorStateListG);
        }
    }

    private final void N(View view, String str, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            Icon iconCreateWithResource = Icon.createWithResource(view.getContext(), num.intValue());
            kotlin.jvm.internal.n.g(iconCreateWithResource, "createWithResource(...)");
            if (view instanceof AnalogClock) {
                ((AnalogClock) view).setSecondHand(iconCreateWithResource);
            }
            G5.c.b("SimulatedAnalogClock", "setSecondHand over, target = " + view + ", key = " + str + ", icon = " + iconCreateWithResource);
        }
    }

    private final void O(View view, Object obj) {
        BlendMode blendModeN = n(obj);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setSecondHandTintBlendMode(blendModeN);
        }
    }

    private final void P(View view, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setSecondHandTintList(colorStateListG);
        }
    }

    private final void Q(View view, String str, Object obj) {
        String str2 = kotlin.jvm.internal.n.d(obj, JSONObject.NULL) ? null : (String) obj;
        if (view instanceof AnalogClock) {
            ((AnalogClock) view).setTimeZone(str2);
        }
        G5.c.b("SimulatedAnalogClock", "setTimeZone over, target = " + view + ", key = " + str + ", timeZone = " + str2);
    }

    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        return D(this, view, str, obj, eVar);
    }
}
