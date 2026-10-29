package H2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p079h8.v;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2356a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f2357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f2358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f2359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f2360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f2361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f2362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f2363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f2364i;

    static {
        a aVar = new a("wght", 1.0f, 400.0f, 1000.0f, 10.0f);
        f2357b = aVar;
        a aVar2 = new a("wdth", 25.0f, 100.0f, 151.0f, 1.0f);
        f2358c = aVar2;
        a aVar3 = new a("slnt", 0.0f, 0.0f, -10.0f, 0.1f);
        f2359d = aVar3;
        a aVar4 = new a("ROND", 0.0f, 0.0f, 100.0f, 1.0f);
        f2360e = aVar4;
        a aVar5 = new a("GRAD", 0.0f, 0.0f, 100.0f, 1.0f);
        f2361f = aVar5;
        a aVar6 = new a("opsz", 6.0f, 18.0f, 144.0f, 1.0f);
        f2362g = aVar6;
        a aVar7 = new a("ITAL", 0.0f, 0.0f, 1.0f, 0.1f);
        f2363h = aVar7;
        List<a> listN = AbstractC1444s.n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(listN, 10));
        for (a aVar8 : listN) {
            String lowerCase = aVar8.e().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.n.g(lowerCase, "toLowerCase(...)");
            arrayList.add(v.a(lowerCase, aVar8));
        }
        f2364i = N.n(arrayList);
    }

    private g() {
    }

    public static final a d() {
        return f2357b;
    }

    public final a a(String axis) {
        kotlin.jvm.internal.n.h(axis, "axis");
        Map map = f2364i;
        String lowerCase = axis.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.n.g(lowerCase, "toLowerCase(...)");
        return (a) map.get(lowerCase);
    }

    public final a b() {
        return f2360e;
    }

    public final a c() {
        return f2359d;
    }

    public final a e() {
        return f2358c;
    }
}
