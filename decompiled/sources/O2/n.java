package O2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5787h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f5789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5794g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final List a(List list, f axisStyle) {
            n nVarB;
            kotlin.jvm.internal.n.h(list, "<this>");
            kotlin.jvm.internal.n.h(axisStyle, "axisStyle");
            List<n> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
            for (n nVar : list2) {
                Float f10 = axisStyle.f(nVar.c());
                if (f10 != null && (nVarB = n.b(nVar, null, null, 0.0f, 0.0f, f10.floatValue(), null, null, 111, null)) != null) {
                    nVar = nVarB;
                }
                arrayList.add(nVar);
            }
            return AbstractC1444s.r0(arrayList);
        }

        private a() {
        }
    }

    public n(String key, c type, float f10, float f11, float f12, String name, String description) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(type, "type");
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(description, "description");
        this.f5788a = key;
        this.f5789b = type;
        this.f5790c = f10;
        this.f5791d = f11;
        this.f5792e = f12;
        this.f5793f = name;
        this.f5794g = description;
    }

    public static /* synthetic */ n b(n nVar, String str, c cVar, float f10, float f11, float f12, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nVar.f5788a;
        }
        if ((i10 & 2) != 0) {
            cVar = nVar.f5789b;
        }
        if ((i10 & 4) != 0) {
            f10 = nVar.f5790c;
        }
        if ((i10 & 8) != 0) {
            f11 = nVar.f5791d;
        }
        if ((i10 & 16) != 0) {
            f12 = nVar.f5792e;
        }
        if ((i10 & 32) != 0) {
            str2 = nVar.f5793f;
        }
        if ((i10 & 64) != 0) {
            str3 = nVar.f5794g;
        }
        String str4 = str2;
        String str5 = str3;
        float f13 = f12;
        float f14 = f10;
        return nVar.a(str, cVar, f14, f11, f13, str4, str5);
    }

    public final n a(String key, c type, float f10, float f11, float f12, String name, String description) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(type, "type");
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(description, "description");
        return new n(key, type, f10, f11, f12, name, description);
    }

    public final String c() {
        return this.f5788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.n.d(this.f5788a, nVar.f5788a) && this.f5789b == nVar.f5789b && Float.compare(this.f5790c, nVar.f5790c) == 0 && Float.compare(this.f5791d, nVar.f5791d) == 0 && Float.compare(this.f5792e, nVar.f5792e) == 0 && kotlin.jvm.internal.n.d(this.f5793f, nVar.f5793f) && kotlin.jvm.internal.n.d(this.f5794g, nVar.f5794g);
    }

    public int hashCode() {
        return (((((((((((this.f5788a.hashCode() * 31) + this.f5789b.hashCode()) * 31) + Float.hashCode(this.f5790c)) * 31) + Float.hashCode(this.f5791d)) * 31) + Float.hashCode(this.f5792e)) * 31) + this.f5793f.hashCode()) * 31) + this.f5794g.hashCode();
    }

    public String toString() {
        return "ClockFontAxis(key=" + this.f5788a + ", type=" + this.f5789b + ", maxValue=" + this.f5790c + ", minValue=" + this.f5791d + ", currentValue=" + this.f5792e + ", name=" + this.f5793f + ", description=" + this.f5794g + ")";
    }
}
