package D5;

import android.view.View;
import android.widget.Chronometer;
import com.nothing.cardwidget.BlinkChronometer;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONObject;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class d extends v {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f738w = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public d(JSONObject jSONObject) {
        super(jSONObject);
    }

    private final void N(View view, Object obj) {
        if (view instanceof Chronometer) {
            ((Chronometer) view).setBase(p206u5.a.h(obj));
            G5.c.f1948a.h("SimulatedChronometer", "setBase value: " + obj);
        }
    }

    private final void O(View view, Object obj) {
        if (view instanceof Chronometer) {
            ((Chronometer) view).setFormat(obj.toString());
            G5.c.f1948a.h("SimulatedChronometer", "setFormat value: " + obj);
        }
    }

    private final void P(View view, Object obj) {
        if (view instanceof Chronometer) {
            Chronometer chronometer = (Chronometer) view;
            if (p206u5.a.e(obj) != 0) {
                chronometer.start();
            } else {
                chronometer.stop();
            }
            G5.c.f1948a.h("SimulatedChronometer", "setStarted value: " + obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    @Override // D5.v, D5.w
    public Object p(View view, String str, Object obj, p129m8.e eVar) {
        Object objP;
        int iHashCode = str.hashCode();
        if (iHashCode == 212619001) {
            if (str.equals(BlinkChronometer.METHOD_SET_FORMAT)) {
                O(view, obj);
                return A.f21846a;
            }
            objP = super.p(view, str, obj, eVar);
            if (objP == p139n8.b.e()) {
                return objP;
            }
            return A.f21846a;
        }
        if (iHashCode == 1076480447) {
            if (str.equals("setStarted")) {
                P(view, obj);
                return A.f21846a;
            }
            objP = super.p(view, str, obj, eVar);
            if (objP == p139n8.b.e()) {
                return objP;
            }
            return A.f21846a;
        }
        if (iHashCode == 1984443987 && str.equals(BlinkChronometer.METHOD_SET_BASE)) {
            N(view, obj);
            return A.f21846a;
        }
        objP = super.p(view, str, obj, eVar);
        if (objP == p139n8.b.e()) {
            return objP;
        }
        return A.f21846a;
    }
}
