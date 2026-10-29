package D5;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f830v = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public o(JSONObject jSONObject) {
        super(jSONObject);
    }

    private final void D(View view, String str, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (colorStateListG != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setIndeterminateTintList(colorStateListG);
            }
            G5.c.b("SimulatedProgressBar", "setProgress background tint list " + str + ", value = " + obj + ", colorStateList = " + colorStateListG);
        }
    }

    private final void E(View view, String str, Object obj) {
        BlendMode blendModeN = n(obj);
        if (blendModeN != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setProgressBackgroundTintBlendMode(blendModeN);
            }
            G5.c.b("SimulatedProgressBar", "set progress tint blend mode key = " + str + ", value = " + obj + ", mode = " + blendModeN);
        }
    }

    private final void F(View view, String str, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (colorStateListG != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setProgressBackgroundTintList(colorStateListG);
            }
            G5.c.b("SimulatedProgressBar", "setProgress background tint list " + str + ", value = " + obj + ", colorStateList = " + colorStateListG);
        }
    }

    private final void G(View view, String str, Object obj) {
        Drawable drawableH = h(view, obj);
        if (drawableH != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setProgressDrawable(drawableH);
            }
            G5.c.b("SimulatedProgressBar", "set progress drawable, key = " + str + ", value = " + obj + ", drawable = " + drawableH);
        }
    }

    private final void H(View view, String str, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (colorStateListG != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setProgressTintList(colorStateListG);
            }
            G5.c.b("SimulatedProgressBar", "setProgress tint list " + str + ", value = " + obj + ", colorStateList = " + colorStateListG);
        }
    }

    private final void I(View view, String str, Object obj) {
        PorterDuff.Mode modeO = o(obj);
        if (modeO != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setProgressTintMode(modeO);
            }
            G5.c.b("SimulatedProgressBar", "set progress tint mode key = " + str + ", value = " + obj + ", mode = " + modeO);
        }
    }

    private final void J(View view, String str, Object obj) {
        BlendMode blendModeN = n(obj);
        if (blendModeN != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setSecondaryProgressTintBlendMode(blendModeN);
            }
            G5.c.b("SimulatedProgressBar", "set second progress tint blend mode key = " + str + ", value = " + obj + ", mode = " + blendModeN);
        }
    }

    private final void K(View view, String str, Object obj) {
        ColorStateList colorStateListG = g(obj, view);
        if (colorStateListG != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setSecondaryProgressTintList(colorStateListG);
            }
            G5.c.b("SimulatedProgressBar", "set second progress tint list key = " + str + ", value = " + obj + ", mode = " + colorStateListG);
        }
    }

    private final void L(View view, String str, Object obj) {
        PorterDuff.Mode modeO = o(obj);
        if (modeO != null) {
            if (view instanceof ProgressBar) {
                ((ProgressBar) view).setSecondaryProgressTintMode(modeO);
            }
            G5.c.b("SimulatedProgressBar", "set second progress tint mode key = " + str + ", value = " + obj + ", mode = " + modeO);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        switch (str) {
            case "setSecondaryProgressTintBlendMode":
                J(view, str, obj);
                return A.f21846a;
            case "setSecondaryProgressTintList":
                K(view, str, obj);
                return A.f21846a;
            case "setSecondaryProgressTintMode":
                L(view, str, obj);
                return A.f21846a;
            case "setProgressTintList":
                H(view, str, obj);
                return A.f21846a;
            case "setProgressTintMode":
                I(view, str, obj);
                return A.f21846a;
            case "setProgressBackgroundTintBlendMode":
                E(view, str, obj);
                return A.f21846a;
            case "setProgressDrawable":
                G(view, str, obj);
                return A.f21846a;
            case "setProgressBackgroundTintList":
                F(view, str, obj);
                return A.f21846a;
            case "setIndeterminateTintList":
                D(view, str, obj);
                return A.f21846a;
            default:
                if (str.equals("setSecondaryProgressTintBlendMode")) {
                    J(view, str, obj);
                    return A.f21846a;
                }
                Object objP = super.p(view, str, obj, eVar);
                if (objP == p139n8.b.e()) {
                    return objP;
                }
                return A.f21846a;
        }
    }
}
