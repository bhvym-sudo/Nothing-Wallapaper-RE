package D5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.A;
import p089i8.L;

/* JADX INFO: loaded from: classes.dex */
public class v extends w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f921v = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public v(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    static /* synthetic */ Object D(v vVar, View view, String str, Object obj, p129m8.e eVar) throws JSONException {
        switch (str) {
            case "setTextColor_with_color_state_list":
                vVar.K(view, str, obj);
                return A.f21846a;
            case "setEllipsize":
                vVar.I(view, str, obj);
                return A.f21846a;
            case "setCompoundDrawablesWithIntrinsicBounds":
                vVar.H(view, str, obj);
                return A.f21846a;
            case "setCompoundDrawables":
                vVar.E(view, str, obj);
                return A.f21846a;
            case "setTypeface":
                vVar.M(view, str, obj);
                return A.f21846a;
            case "setCompoundDrawablesRelativeWithIntrinsicBounds":
                vVar.G(view, str, obj);
                return A.f21846a;
            case "setCompoundDrawablesRelative":
                vVar.F(view, str, obj);
                return A.f21846a;
            case "setTextSize_with_unit":
                vVar.L(view, obj);
                return A.f21846a;
            case "setTextColor_with_res_id":
                vVar.J(view, str, obj);
                return A.f21846a;
            default:
                if (str.equals("setTextColor_with_color_state_list")) {
                    vVar.K(view, str, obj);
                    return A.f21846a;
                }
                Object objP = super.p(view, str, obj, eVar);
                if (objP == p139n8.b.e()) {
                    return objP;
                }
                return A.f21846a;
        }
    }

    private final void E(View view, String str, Object obj) throws JSONException {
        Object objB;
        JSONArray jSONArray;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            if (obj instanceof JSONArray) {
                jSONArray = (JSONArray) obj;
            } else {
                jSONArray = obj instanceof String ? new JSONArray((String) obj) : null;
            }
            objB = p079h8.q.b(jSONArray);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = null;
        }
        JSONArray jSONArray2 = (JSONArray) objB;
        if (jSONArray2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = B8.h.q(0, jSONArray2.length()).iterator();
            while (it.hasNext()) {
                Object obj2 = jSONArray2.get(((L) it).a());
                if (obj2 instanceof Integer) {
                    Number number = (Number) obj2;
                    if (number.intValue() > 0) {
                        Resources resources = view.getResources();
                        kotlin.jvm.internal.n.g(resources, "getResources(...)");
                        arrayList.add(p206u5.d.a(resources, number.intValue(), null));
                    }
                }
                arrayList.add(null);
            }
            if (view instanceof TextView) {
                ((TextView) view).setCompoundDrawables((Drawable) arrayList.get(0), (Drawable) arrayList.get(1), (Drawable) arrayList.get(2), (Drawable) arrayList.get(3));
            }
            G5.c.b("SimulatedTextView", "set textview CompoundDrawables key = " + str + ", value = " + obj + ", drawableIds = " + arrayList);
        }
    }

    private final void I(View view, String str, Object obj) {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(obj instanceof Integer ? I5.i.f3122a.a(((Number) obj).intValue()) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        TextUtils.TruncateAt truncateAt = (TextUtils.TruncateAt) (p079h8.q.f(objB) ? null : objB);
        if (truncateAt != null) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                textView.setEllipsize(truncateAt);
                if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
                    textView.setSelected(true);
                }
            }
            G5.c.b("SimulatedTextView", "set textview setEllipsize key = " + str + ", value = " + obj + ", parsed value = " + truncateAt);
        }
    }

    private final void L(View view, Object obj) {
        Object objB;
        JSONArray jSONArrayF;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            if ((view instanceof TextView) && (jSONArrayF = p206u5.a.f(obj)) != null && jSONArrayF.length() == 2) {
                int iIntValue = ((Number) p206u5.b.b(jSONArrayF, 0, 0)).intValue();
                Object obj2 = jSONArrayF.get(1);
                kotlin.jvm.internal.n.g(obj2, "get(...)");
                Object objB2 = E5.c.b(obj2);
                if (objB2 != null) {
                    float fD = p206u5.a.d(objB2);
                    ((TextView) view).setTextSize(iIntValue, fD);
                    G5.c.b("SimulatedTextView", "set textSize with unit success, unit = " + iIntValue + ", value = " + fD);
                }
            }
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.e("SimulatedTextView", "Set text size with unit error.", thD);
        }
    }

    private final void M(View view, String str, Object obj) {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            if (view instanceof TextView) {
                String string = obj.toString();
                E5.g gVar = E5.g.f1305a;
                boolean zA = gVar.a(string);
                boolean zC = E5.g.c(gVar, null, 1, null);
                if (!zA || zC) {
                    ((TextView) view).setTypeface(I5.j.f3123a.a(string));
                } else {
                    ((TextView) view).setTypeface(Typeface.DEFAULT);
                }
                if (G5.c.f1948a.f()) {
                    G5.c.b("SimulatedTextView", "set typeface success, type = " + obj + ", key = " + str + ", isNDotStyle = " + zA + ", isSupportNDot = " + zC);
                }
            }
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.e("SimulatedTextView", "set typeface success, type = " + obj + ", key = " + str, thD);
        }
    }

    public final void F(View target, String key, Object value) {
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            JSONArray jSONArrayF = p206u5.a.f(value);
            A a10 = null;
            if (jSONArrayF != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = B8.h.q(0, jSONArrayF.length()).iterator();
                while (it.hasNext()) {
                    Object obj = jSONArrayF.get(((L) it).a());
                    if (!(obj instanceof Integer) || ((Number) obj).intValue() <= 0) {
                        arrayList.add(null);
                    } else {
                        Resources resources = target.getResources();
                        kotlin.jvm.internal.n.g(resources, "getResources(...)");
                        arrayList.add(p206u5.d.a(resources, ((Number) obj).intValue(), null));
                    }
                }
                if (target instanceof TextView) {
                    ((TextView) target).setCompoundDrawablesRelative((Drawable) arrayList.get(0), (Drawable) arrayList.get(1), (Drawable) arrayList.get(2), (Drawable) arrayList.get(3));
                }
                G5.c.b("SimulatedTextView", "set textview setCompoundDrawablesRelative key = " + key + ", value = " + value + ", drawableIds = " + arrayList);
                a10 = A.f21846a;
            }
            p079h8.q.b(a10);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    public final void G(View target, String key, Object value) {
        A a10;
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            JSONArray jSONArrayF = p206u5.a.f(value);
            if (jSONArrayF != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = B8.h.q(0, jSONArrayF.length()).iterator();
                while (it.hasNext()) {
                    Object obj = jSONArrayF.get(((L) it).a());
                    if (!(obj instanceof Integer) || ((Number) obj).intValue() <= 0) {
                        arrayList.add(0);
                    } else {
                        arrayList.add(obj);
                    }
                }
                if (target instanceof TextView) {
                    ((TextView) target).setCompoundDrawablesRelativeWithIntrinsicBounds(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue(), ((Number) arrayList.get(3)).intValue());
                }
                G5.c.b("SimulatedTextView", "set textview setCompoundDrawablesRelativeWithIntrinsicBounds key = " + key + ", value = " + value + ", drawableIds = " + arrayList);
                a10 = A.f21846a;
            } else {
                a10 = null;
            }
            p079h8.q.b(a10);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    public final void H(View target, String key, Object value) {
        A a10;
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            JSONArray jSONArrayF = p206u5.a.f(value);
            if (jSONArrayF != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = B8.h.q(0, jSONArrayF.length()).iterator();
                while (it.hasNext()) {
                    Object obj = jSONArrayF.get(((L) it).a());
                    if (!(obj instanceof Integer) || ((Number) obj).intValue() <= 0) {
                        arrayList.add(0);
                    } else {
                        arrayList.add(obj);
                    }
                }
                if (target instanceof TextView) {
                    ((TextView) target).setCompoundDrawablesWithIntrinsicBounds(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue(), ((Number) arrayList.get(3)).intValue());
                }
                G5.c.b("SimulatedTextView", "set textview compoundDrawablesWithIntrinsicBounds key = " + key + ", value = " + value + ", drawableIds = " + arrayList);
                a10 = A.f21846a;
            } else {
                a10 = null;
            }
            p079h8.q.b(a10);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    public final void J(View target, String key, Object value) {
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            if (target instanceof TextView) {
                int color = ((TextView) target).getResources().getColor(p206u5.a.e(value), null);
                ((TextView) target).setTextColor(color);
                G5.c.b("SimulatedTextView", "set text color with res id  key = " + key + ", value = " + value + ", colorInt = " + color);
            }
            p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            p079h8.q.b(p079h8.r.a(th));
        }
    }

    public final void K(View target, String key, Object value) {
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        ColorStateList colorStateListG = g(value, target);
        if (colorStateListG != null) {
            if (target instanceof TextView) {
                ((TextView) target).setTextColor(colorStateListG);
            }
            G5.c.b("SimulatedTextView", "set text color with colorStateList key = " + key + ", value = " + value + ", stateList = " + colorStateListG);
        }
    }

    @Override // D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        return D(this, view, str, obj, eVar);
    }
}
