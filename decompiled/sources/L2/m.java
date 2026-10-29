package L2;

import android.app.WallpaperColors;
import android.graphics.Color;
import com.android.internal.graphics.ColorUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p106k5.a f4610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f4611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f4612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f4613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f4614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f4615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f4616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p116l5.b f4617k;

    public m(int i10, boolean z9, int i11, double d10) {
        p106k5.a eVar;
        this.f4607a = i10;
        this.f4608b = z9;
        this.f4609c = i11;
        p116l5.b bVarB = p116l5.b.b(i10);
        this.f4617k = bVarB;
        if (i10 == 0 || (i11 != 6 && bVarB.c() < 5.0d)) {
            i10 = -14979341;
        }
        p116l5.b bVarB2 = p116l5.b.b(i10);
        switch (i11) {
            case 0:
                eVar = new p136n5.e(bVarB2, z9, d10);
                break;
            case 1:
                eVar = new p136n5.g(bVarB2, z9, d10);
                break;
            case 2:
                eVar = new p136n5.h(bVarB2, z9, d10);
                break;
            case 3:
                eVar = new p136n5.b(bVarB2, z9, d10);
                break;
            case 4:
                eVar = new p136n5.f(bVarB2, z9, d10);
                break;
            case 5:
                eVar = new p136n5.c(bVarB2, z9, d10);
                break;
            case 6:
                eVar = new p136n5.a(bVarB2, z9, d10);
                break;
            case 7:
                eVar = new p136n5.d(bVarB2, z9, d10);
                break;
            case 8:
                eVar = new n(bVarB2, z9, d10);
                break;
            case 9:
                eVar = new o(bVarB2, z9, d10);
                break;
            default:
                throw new IllegalArgumentException("Unknown style: " + i11);
        }
        this.f4610d = eVar;
        this.f4611e = new t(eVar.f22724f);
        this.f4612f = new t(eVar.f22725g);
        this.f4613g = new t(eVar.f22726h);
        this.f4614h = new t(eVar.f22727i);
        this.f4615i = new t(eVar.f22728j);
        this.f4616j = new t(eVar.f22729k);
    }

    public static /* synthetic */ Double a(Map map, List list, Map.Entry entry) {
        int iRound = (int) Math.round(((p116l5.b) map.get(entry.getKey())).d());
        double dDoubleValue = 0.0d;
        for (int i10 = iRound - 15; i10 <= iRound + 15; i10++) {
            dDoubleValue += ((Double) list.get(u(i10))).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static /* synthetic */ boolean c(boolean z9, Integer num) {
        return !z9 || p116l5.b.b(num.intValue()).c() >= 5.0d;
    }

    public static /* synthetic */ boolean d(Map map, Map.Entry entry) {
        return ((p116l5.b) entry.getValue()).c() >= 5.0d && ((Double) map.get(entry.getKey())).doubleValue() > 0.01d;
    }

    public static /* synthetic */ boolean f(Map map, int i10, int i11, Integer num) {
        return p(((p116l5.b) map.get(Integer.valueOf(i10))).d(), ((p116l5.b) map.get(num)).d()) < ((double) i11);
    }

    public static /* synthetic */ AbstractMap.SimpleEntry h(Map map, Map.Entry entry) {
        return new AbstractMap.SimpleEntry((Integer) entry.getKey(), Double.valueOf(s((p116l5.b) entry.getValue(), ((Double) map.get(entry.getKey())).doubleValue())));
    }

    public static List m(WallpaperColors wallpaperColors) {
        return n(wallpaperColors, true);
    }

    public static List n(WallpaperColors wallpaperColors, final boolean z9) {
        final double dSum = wallpaperColors.getAllColors().values().stream().mapToInt(new ToIntFunction() { // from class: L2.a
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Integer) obj).intValue();
            }
        }).sum();
        if (dSum == 0.0d) {
            List list = (List) wallpaperColors.getMainColors().stream().map(new Function() { // from class: L2.h
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((Color) obj).toArgb());
                }
            }).distinct().filter(new Predicate() { // from class: L2.i
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return m.c(z9, (Integer) obj);
                }
            }).collect(Collectors.toList());
            return list.isEmpty() ? List.of(-14979341) : list;
        }
        Map map = (Map) wallpaperColors.getAllColors().entrySet().stream().collect(Collectors.toMap(new Function() { // from class: L2.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) ((Map.Entry) obj).getKey();
            }
        }, new Function() { // from class: L2.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((Integer) ((Map.Entry) obj).getValue()).doubleValue() / dSum);
            }
        }));
        final Map map2 = (Map) wallpaperColors.getAllColors().entrySet().stream().collect(Collectors.toMap(new Function() { // from class: L2.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) ((Map.Entry) obj).getKey();
            }
        }, new Function() { // from class: L2.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return p116l5.b.b(((Integer) ((Map.Entry) obj).getKey()).intValue());
            }
        }));
        final List listQ = q(map2, map, z9);
        final Map map3 = (Map) wallpaperColors.getAllColors().entrySet().stream().collect(Collectors.toMap(new Function() { // from class: L2.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) ((Map.Entry) obj).getKey();
            }
        }, new Function() { // from class: L2.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m.a(map2, listQ, (Map.Entry) obj);
            }
        }));
        List list2 = (List) (z9 ? (Map) map2.entrySet().stream().filter(new Predicate() { // from class: L2.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return m.d(map3, (Map.Entry) obj);
            }
        }).collect(Collectors.toMap(new Function() { // from class: L2.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) ((Map.Entry) obj).getKey();
            }
        }, new Function() { // from class: L2.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (p116l5.b) ((Map.Entry) obj).getValue();
            }
        })) : map2).entrySet().stream().map(new Function() { // from class: L2.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m.h(map3, (Map.Entry) obj);
            }
        }).sorted(Map.Entry.comparingByValue().reversed()).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        for (final int i10 = 90; i10 >= 15; i10--) {
            arrayList.clear();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) ((Map.Entry) it.next()).getKey();
                final int iIntValue = num.intValue();
                if (!arrayList.stream().anyMatch(new Predicate() { // from class: L2.g
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return m.f(map2, iIntValue, i10, (Integer) obj);
                    }
                })) {
                    arrayList.add(num);
                    if (arrayList.size() >= 4) {
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(-14979341);
        }
        return arrayList;
    }

    private static double p(double d10, double d11) {
        double dAbs = Math.abs(d10 - d11);
        return dAbs > 180.0d ? 360.0d - dAbs : dAbs;
    }

    private static List q(Map map, Map map2, boolean z9) {
        ArrayList arrayList = new ArrayList(Collections.nCopies(360, Double.valueOf(0.0d)));
        for (Map.Entry entry : map2.entrySet()) {
            double dDoubleValue = ((Double) entry.getValue()).doubleValue();
            p116l5.b bVar = (p116l5.b) map.get(entry.getKey());
            int iRound = ((int) Math.round(bVar.d())) % 360;
            if (!z9 || bVar.c() > 5.0d) {
                arrayList.set(iRound, Double.valueOf(((Double) arrayList.get(iRound)).doubleValue() + dDoubleValue));
            }
        }
        return arrayList;
    }

    private static String r(String str, List list) {
        return str + "\n" + ((String) list.stream().map(new Function() { // from class: L2.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m.t(((Integer) obj).intValue());
            }
        }).collect(Collectors.joining("\n")));
    }

    private static double s(p116l5.b bVar, double d10) {
        double dC;
        double d11;
        double d12 = d10 * 70.0d;
        if (bVar.c() < 48.0d) {
            dC = bVar.c() - 48.0d;
            d11 = 0.1d;
        } else {
            dC = bVar.c() - 48.0d;
            d11 = 0.3d;
        }
        return (dC * d11) + d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i10) {
        p116l5.b bVarB = p116l5.b.b(i10);
        StringBuilder sb = new StringBuilder();
        sb.append("H");
        sb.append(String.format("%4s", Long.valueOf(Math.round(bVarB.d()))));
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("C");
        sb2.append(String.format("%4s", Long.valueOf(Math.round(bVarB.c()))));
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("T");
        sb3.append(String.format("%4s", Long.valueOf(Math.round(bVarB.e()))));
        return string + string2 + sb3.toString() + " = #" + Integer.toHexString(i10 & 16777215).toUpperCase();
    }

    private static int u(int i10) {
        if (i10 < 0) {
            return (i10 % 360) + 360;
        }
        return i10 >= 360 ? i10 % 360 : i10;
    }

    public t i() {
        return this.f4611e;
    }

    public t j() {
        return this.f4612f;
    }

    public t k() {
        return this.f4613g;
    }

    public int l() {
        return ColorUtils.setAlphaComponent(this.f4608b ? this.f4611e.f() : this.f4611e.j(), 255);
    }

    public int o() {
        return this.f4609c;
    }

    public String toString() {
        return "ColorScheme {\n  seed color: " + t(this.f4607a) + "\n  style: " + this.f4609c + "\n  palettes: \n  " + r("PRIMARY", this.f4611e.f4622b) + "\n  " + r("SECONDARY", this.f4612f.f4622b) + "\n  " + r("TERTIARY", this.f4613g.f4622b) + "\n  " + r("NEUTRAL", this.f4614h.f4622b) + "\n  " + r("NEUTRAL VARIANT", this.f4615i.f4622b) + "\n}";
    }

    public m(int i10, boolean z9) {
        this(i10, z9, 1);
    }

    public m(int i10, boolean z9, int i11) {
        this(i10, z9, i11, 0.0d);
    }
}
