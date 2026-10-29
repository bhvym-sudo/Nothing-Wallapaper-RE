package p232x1;

import L2.p;
import O6.b;
import android.text.TextUtils;
import android.util.Log;
import com.nothing.wallpaper.NTPickerApplication;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;
import p222w1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map f29704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f29707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29709f;

    protected g(String str, Map map, boolean z9, int i10, Integer num, int i11) {
        this.f29705b = str;
        this.f29706c = z9;
        this.f29709f = i10;
        this.f29707d = num;
        this.f29708e = i11;
        this.f29704a = Collections.unmodifiableMap(k(map));
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getValue() != null;
    }

    private Map k(Map map) {
        return (Map) map.entrySet().stream().filter(new Predicate() { // from class: x1.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g.a((Map.Entry) obj);
            }
        }).collect(Collectors.toMap(new Function() { // from class: x1.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }
        }, new Function() { // from class: x1.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getValue();
            }
        }));
    }

    private void l(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashSet hashSet = new HashSet();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (jSONObject.isNull(next)) {
                hashSet.add(next);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
    }

    public int b() {
        return this.f29708e;
    }

    public JSONObject c(boolean z9) {
        JSONObject jSONObject;
        if (i()) {
            jSONObject = new JSONObject();
        } else {
            JSONObject jSONObject2 = new JSONObject(this.f29704a);
            l(jSONObject2);
            jSONObject = jSONObject2;
        }
        if (z9) {
            try {
                jSONObject.put("_applied_timestamp", System.currentTimeMillis());
                return jSONObject;
            } catch (JSONException unused) {
                Log.e("ColorOption", "Couldn't add timestamp to serialized themebundle");
            }
        }
        return jSONObject;
    }

    public String d() {
        return c(false).toString();
    }

    public abstract String e();

    public Integer f() {
        return this.f29707d;
    }

    public String g() {
        return this.f29705b;
    }

    public boolean h(a aVar) {
        c cVar = (c) aVar;
        String strP = cVar.p();
        if (TextUtils.isEmpty(strP)) {
            strP = p.a(1);
        }
        boolean zEquals = TextUtils.equals(p.a(f()), strP);
        if (this.f29706c) {
            String strS = cVar.s();
            return (TextUtils.isEmpty(strS) || "{}".equals(strS) || cVar.o().isEmpty() || !(strS.contains("android.theme.customization.system_palette") || strS.contains("android.theme.customization.accent_color"))) && zEquals;
        }
        Map mapO = cVar.o();
        String strM = cVar.m();
        return (TextUtils.isEmpty(strM) || e().equals(strM)) && zEquals && this.f29704a.equals(mapO) && (7 != f().intValue() || !b.d(NTPickerApplication.c()) || cVar.n() == b());
    }

    boolean i() {
        return this.f29706c;
    }

    public boolean j(g gVar) {
        if (gVar == null || !Objects.equals(this.f29707d, gVar.f())) {
            return false;
        }
        String strD = d();
        if (this.f29706c || TextUtils.isEmpty(strD) || "{}".equals(strD)) {
            String strD2 = gVar.d();
            return gVar.i() || TextUtils.isEmpty(strD2) || "{}".equals(strD2);
        }
        if (7 != this.f29707d.intValue() || this.f29708e == gVar.b()) {
            return this.f29704a.equals(gVar.f29704a);
        }
        return false;
    }
}
