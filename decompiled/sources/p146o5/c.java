package p146o5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import p116l5.b;
import p156p5.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f23438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f23439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f23440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f23441d;

    public c(b bVar) {
        this.f23438a = bVar;
    }

    private b c() {
        return (b) e().get(0);
    }

    private List d() {
        List list = this.f23440c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            arrayList.add(b.a(d10, this.f23438a.c(), this.f23438a.e()));
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f23440c = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List e() {
        List list = this.f23439b;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(d());
        arrayList.add(this.f23438a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: o5.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f23437a.i((b) obj);
            }
        }, new Comparator() { // from class: o5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f23439b = arrayList;
        return arrayList;
    }

    private Map g() {
        Map map = this.f23441d;
        if (map != null) {
            return map;
        }
        ArrayList<b> arrayList = new ArrayList(d());
        arrayList.add(this.f23438a);
        HashMap map2 = new HashMap();
        for (b bVar : arrayList) {
            map2.put(bVar, Double.valueOf(j(bVar)));
        }
        this.f23441d = map2;
        return map2;
    }

    private b h() {
        return (b) e().get(e().size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double i(b bVar) {
        return (Double) g().get(bVar);
    }

    public static double j(b bVar) {
        double[] dArrH = a.h(bVar.g());
        return ((Math.pow(Math.hypot(dArrH[1], dArrH[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(p156p5.b.e(p156p5.b.e(Math.toDegrees(Math.atan2(dArrH[2], dArrH[1]))) - 50.0d)))) - 0.5d;
    }

    public List b(int i10, int i11) {
        int iRound = (int) Math.round(this.f23438a.d());
        b bVar = (b) d().get(iRound);
        double dF = f(bVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i12 = 0;
        while (i12 < 360) {
            double dF2 = f((b) d().get(p156p5.b.f(iRound + i12)));
            dAbs2 += Math.abs(dF2 - dF);
            i12++;
            dF = dF2;
        }
        double d10 = dAbs2 / ((double) i11);
        double dF3 = f(bVar);
        int i13 = 1;
        while (arrayList.size() < i11) {
            b bVar2 = (b) d().get(p156p5.b.f(iRound + i13));
            double dF4 = f(bVar2);
            dAbs += Math.abs(dF4 - dF3);
            boolean z9 = dAbs >= ((double) arrayList.size()) * d10;
            int i14 = 1;
            while (z9 && arrayList.size() < i11) {
                arrayList.add(bVar2);
                int i15 = i13;
                z9 = dAbs >= ((double) (arrayList.size() + i14)) * d10;
                i14++;
                i13 = i15;
            }
            i13++;
            if (i13 > 360) {
                while (arrayList.size() < i11) {
                    arrayList.add(bVar2);
                }
                break;
            }
            dF3 = dF4;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f23438a);
        int iFloor = (int) Math.floor((((double) i10) - 1.0d) / 2.0d);
        for (int i16 = 1; i16 < iFloor + 1; i16++) {
            int size = 0 - i16;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (b) arrayList.get(size));
        }
        int i17 = i10 - iFloor;
        for (int i18 = 1; i18 < i17; i18++) {
            int size2 = i18;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((b) arrayList.get(size2));
        }
        return arrayList2;
    }

    public double f(b bVar) {
        double dDoubleValue = ((Double) g().get(h())).doubleValue() - ((Double) g().get(c())).doubleValue();
        double dDoubleValue2 = ((Double) g().get(bVar)).doubleValue() - ((Double) g().get(c())).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }
}
