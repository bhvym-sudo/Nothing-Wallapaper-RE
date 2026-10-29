package D5;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f740w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final E8.g f741x = new E8.g("\\d+(\\.\\d+)?f");

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public f(JSONObject jSONObject) {
        super(jSONObject);
    }

    private final void F(ViewGroup.LayoutParams layoutParams, String str, Object obj) {
        if (obj instanceof Float) {
            float f10 = 360;
            float fFloatValue = ((Number) obj).floatValue() % f10;
            if (fFloatValue < 0.0f) {
                fFloatValue = (f10 - fFloatValue) % f10;
            }
            K(layoutParams, str, Float.valueOf(fFloatValue));
        }
    }

    private final void G(Object obj, JSONArray jSONArray) throws JSONException {
        Object objB;
        if (jSONArray.length() < 1) {
            return;
        }
        Object obj2 = jSONArray.get(0);
        if (obj2 instanceof String) {
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 1; i10 < length; i10++) {
                    Object element = jSONArray.get(i10);
                    if (!(element instanceof String)) {
                        if (element instanceof JSONArray) {
                            if (((JSONArray) element).length() >= 1) {
                                Object obj3 = ((JSONArray) element).get(0);
                                I5.c.a aVar2 = I5.c.f3098a;
                                if (kotlin.jvm.internal.n.d(obj3, Integer.valueOf(aVar2.j()))) {
                                    element = J((JSONArray) element);
                                } else if (kotlin.jvm.internal.n.d(obj3, Integer.valueOf(aVar2.h()))) {
                                    element = I((JSONArray) element);
                                }
                            }
                        }
                    } else if (f741x.a((CharSequence) element)) {
                        element = Float.valueOf(p206u5.a.d(element));
                    }
                    kotlin.jvm.internal.n.g(element, "element");
                    Class clsA = E5.c.a(element);
                    if (clsA != null) {
                        arrayList.add(clsA);
                        arrayList2.add(E5.c.b(element));
                    }
                }
                Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                Object[] array = arrayList2.toArray(new Object[0]);
                objB = p079h8.q.b(E5.f.a(obj).a((String) obj2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)).b(obj, Arrays.copyOf(array, array.length)));
            } catch (Throwable th) {
                h8.q.a aVar3 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
            }
            Throwable thD = p079h8.q.d(objB);
            if (thD != null) {
                G5.c.d("SimulatedConstraintLayout", "invoke method = " + obj2 + " error. msg = " + thD);
            }
        }
    }

    private final void H(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (obj instanceof String) {
            E5.f.b("androidx.constraintlayout.widget.ConstraintSet").a("parseDimensionRatioString", layoutParams.getClass(), String.class).b(null, layoutParams, obj);
        }
    }

    private final float[] I(JSONArray jSONArray) {
        float[] fArr = new float[jSONArray.length() - 1];
        int length = jSONArray.length();
        for (int i10 = 1; i10 < length; i10++) {
            fArr[i10 - 1] = (float) jSONArray.getDouble(i10);
        }
        return fArr;
    }

    private final int[] J(JSONArray jSONArray) {
        int[] iArr = new int[jSONArray.length() - 1];
        int length = jSONArray.length();
        for (int i10 = 1; i10 < length; i10++) {
            iArr[i10 - 1] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    private final void K(ViewGroup.LayoutParams layoutParams, String str, Object obj) {
        if (obj instanceof Float) {
            E5.f.b("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams").c(str).b(layoutParams, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            E5.f.b("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams").c(str).a(layoutParams, ((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            E5.f.b("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams").c(str).c(layoutParams, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            E5.f.b("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams").c(str).d(layoutParams, obj);
        }
    }

    private final Object L(View view, String str, Object obj, p129m8.e eVar) throws JSONException {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(obj instanceof JSONArray ? (JSONArray) obj : obj instanceof String ? new JSONArray((String) obj) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        JSONArray jSONArray = (JSONArray) (p079h8.q.f(objB) ? null : objB);
        if (jSONArray != null) {
            Object objA = E5.f.b("androidx.constraintlayout.widget.ConstraintSet").b(new Class[0]).a(new Object[0]);
            if (objA != null) {
                E5.f.a(objA).a("clone", view.getClass()).b(objA, view);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = jSONArray.get(i10);
                    if (obj2 instanceof JSONArray) {
                        G(objA, (JSONArray) obj2);
                    }
                }
                E5.f.a(objA).a(str, view.getClass()).b(objA, view);
            }
        }
        return A.f21846a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void M(View view, Object obj) throws JSONException {
        Object objB;
        ViewGroup.LayoutParams layoutParams;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(obj instanceof JSONObject ? (JSONObject) obj : obj instanceof String ? new JSONObject((String) obj) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        JSONObject jSONObject = (JSONObject) (p079h8.q.f(objB) ? null : objB);
        if (jSONObject == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.n.g(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = jSONObject.get(next);
            if (next != null) {
                switch (next.hashCode()) {
                    case -2080378006:
                        if (next.equals("matchConstraintPercentHeight")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    case -1490390787:
                        if (next.equals("horizontalBias")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    case -1443688516:
                        if (next.equals("horizontalWeight")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    case -353852018:
                        if (next.equals("verticalWeight")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    case -249535931:
                        if (next.equals("dimensionRatio")) {
                            kotlin.jvm.internal.n.e(obj2);
                            H(layoutParams, obj2);
                        }
                        break;
                    case -94351901:
                        if (next.equals("circleAngle")) {
                            kotlin.jvm.internal.n.e(obj2);
                            F(layoutParams, next, obj2);
                        }
                        break;
                    case -36744369:
                        if (next.equals("verticalBias")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    case 1747973923:
                        if (next.equals("matchConstraintPercentWidth")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    case 2020715945:
                        if (next.equals("guidePercent")) {
                            kotlin.jvm.internal.n.e(obj2);
                            K(layoutParams, next, Float.valueOf(p206u5.a.d(obj2)));
                        }
                        break;
                    default:
                        break;
                }
            }
            kotlin.jvm.internal.n.e(next);
            kotlin.jvm.internal.n.e(obj2);
            K(layoutParams, next, obj2);
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // D5.x, D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) throws JSONException {
        if (kotlin.jvm.internal.n.d(str, "applyTo")) {
            Object objL = L(view, str, obj, eVar);
            return objL == p139n8.b.e() ? objL : A.f21846a;
        }
        if (kotlin.jvm.internal.n.d(str, "setLayoutParams")) {
            M(view, obj);
            return A.f21846a;
        }
        Object objP = super.p(view, str, obj, eVar);
        return objP == p139n8.b.e() ? objP : A.f21846a;
    }
}
