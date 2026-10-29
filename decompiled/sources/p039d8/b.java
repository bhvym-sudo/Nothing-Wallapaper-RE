package p039d8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import p009a8.e;
import p029c8.c;
import p049e8.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return eVar.f9961a.f9954b - eVar2.f9961a.f9954b;
        }
    }

    private static int a(int i10) {
        if (i10 <= 50 || i10 >= 100) {
            return i10 > 100 ? i10 - 50 : i10;
        }
        return 50;
    }

    public static String b(p019b8.a aVar) {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.object();
            jSONStringer.key("Metadata").object().key("Created").value(aVar.f14984a.f14987b).key("Description").value(aVar.f14984a.f14988c).key("Version").value(aVar.f14984a.f14986a).endObject();
            jSONStringer.key("Pattern").array();
            for (e eVar : aVar.f14985b) {
                jSONStringer.object();
                jSONStringer.key("Event").object().key("Type").value(eVar.f9961a.f9953a).key("RelativeTime").value(eVar.f9961a.f9954b);
                if ("continuous".equals(eVar.f9961a.f9953a)) {
                    jSONStringer.key("Duration").value(eVar.f9961a.f9955c);
                }
                jSONStringer.key("Parameters").object().key("Frequency").value(eVar.f9961a.f9957e.f9959b).key("Intensity").value(eVar.f9961a.f9957e.f9958a);
                if ("continuous".equals(eVar.f9961a.f9953a)) {
                    jSONStringer.key("Curve").array();
                    for (p009a8.a aVar2 : eVar.f9961a.f9957e.f9960c) {
                        jSONStringer.object().key("Frequency").value(aVar2.f9952c).key("Intensity").value(aVar2.f9951b).key("Time").value(aVar2.f9950a).endObject();
                    }
                    jSONStringer.endArray();
                }
                jSONStringer.endObject().endObject().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String c(p029c8.a aVar) {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.object();
            jSONStringer.key("Metadata").object().key("Created").value(aVar.f15243a.f15246b).key("Description").value(aVar.f15243a.f15247c).key("Version").value(aVar.f15243a.f15245a).endObject();
            jSONStringer.key("PatternList").array();
            for (c cVar : aVar.f15244b) {
                jSONStringer.object().key("AbsoluteTime").value(cVar.f15248a).key("Pattern").array();
                for (e eVar : cVar.f15249b) {
                    jSONStringer.object();
                    jSONStringer.key("Event").object().key("Index").value(eVar.f9961a.f9956d).key("RelativeTime").value(eVar.f9961a.f9954b).key("Type").value(eVar.f9961a.f9953a);
                    if ("continuous".equals(eVar.f9961a.f9953a)) {
                        jSONStringer.key("Duration").value(eVar.f9961a.f9955c);
                    }
                    jSONStringer.key("Parameters").object().key("Frequency").value(eVar.f9961a.f9957e.f9959b).key("Intensity").value(eVar.f9961a.f9957e.f9958a);
                    if ("continuous".equals(eVar.f9961a.f9953a)) {
                        jSONStringer.key("Curve").array();
                        for (p009a8.a aVar2 : eVar.f9961a.f9957e.f9960c) {
                            jSONStringer.object().key("Frequency").value(aVar2.f9952c).key("Intensity").value(aVar2.f9951b).key("Time").value(aVar2.f9950a).endObject();
                        }
                        jSONStringer.endArray();
                    }
                    jSONStringer.endObject().endObject().endObject();
                }
                jSONStringer.endArray().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String d(c cVar, boolean z9) {
        p029c8.a aVar = new p029c8.a();
        aVar.f15243a = new p029c8.b();
        ArrayList arrayList = new ArrayList();
        aVar.f15244b = arrayList;
        if (z9) {
            c cVar2 = new c();
            cVar2.f15248a = 0;
            cVar2.f15249b = cVar.f15249b;
            aVar.f15244b.add(cVar2);
        } else {
            arrayList.add(cVar);
        }
        return c(aVar);
    }

    public static String e(String str) {
        p019b8.a aVarM;
        ArrayList arrayList;
        try {
            aVarM = m(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            aVarM = null;
        }
        if (aVarM == null || (arrayList = aVarM.f14985b) == null || arrayList.size() == 0) {
            d.a.d("HEFileUtils", " , convertHe10ToHe20, invalid HE1.0 string!");
            return "";
        }
        p029c8.a aVar = new p029c8.a();
        aVar.f15243a = new p029c8.b();
        aVar.f15244b = new ArrayList();
        c cVar = new c();
        cVar.f15249b = aVarM.f14985b;
        cVar.f15248a = 0;
        aVar.f15244b.add(cVar);
        return c(aVar);
    }

    public static String f(String str, int i10, int i11, int i12) {
        int i13;
        double d10;
        int i14;
        double d11;
        double d12;
        int i15;
        String str2;
        d.a.a("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, deltaFreq:" + i11 + ", deltaIntensity:" + i10 + ", majorCoreVersion:" + i12);
        if (i11 == 0 && (255 == i10 || 256 == i10)) {
            str2 = "overwriteBaseFrequencyAndIntensityOfHe20String, do nothing!";
        } else {
            double d13 = 0.0d;
            double d14 = (255 == i10 || 256 == i10) ? 0.0d : (((double) i10) - 255.5d) / 255.5d;
            double d15 = ((double) i11) / 100.0d;
            d.a.a("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, freqRatio:" + d15 + ", intensityRatio:" + d14);
            p029c8.a aVarP = p(str);
            if (d.d(aVarP)) {
                Iterator it = aVarP.f15244b.iterator();
                while (it.hasNext()) {
                    for (e eVar : ((c) it.next()).f15249b) {
                        if ("transient".equals(eVar.f9961a.f9953a)) {
                            p009a8.d dVar = eVar.f9961a.f9957e;
                            int i16 = dVar.f9959b;
                            if (i16 == 0 && dVar.f9958a == 0) {
                                d.a.a("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, ignore placeholder event!");
                            } else {
                                if (i12 >= 24) {
                                    i15 = (int) (d15 >= d13 ? ((double) i16) + (((double) (150 - i16)) * d15) : ((double) i16) + (((double) (i16 + 50)) * d15));
                                } else {
                                    d13 = d13;
                                    if (d15 >= d13) {
                                        d12 = i16;
                                        i16 = 100 - i16;
                                    } else {
                                        d12 = i16;
                                    }
                                    i15 = (int) (d12 + (((double) i16) * d15));
                                }
                                dVar.f9959b = i15;
                            }
                        } else {
                            d13 = d13;
                            if ("continuous".equals(eVar.f9961a.f9953a)) {
                                p009a8.d dVar2 = eVar.f9961a.f9957e;
                                if (d15 >= d13) {
                                    int i17 = dVar2.f9959b;
                                    d10 = i17;
                                    i13 = 100 - i17;
                                } else {
                                    i13 = dVar2.f9959b;
                                    d10 = i13;
                                }
                                dVar2.f9959b = (int) (d10 + (((double) i13) * d15));
                            }
                        }
                        p009a8.d dVar3 = eVar.f9961a.f9957e;
                        if (d14 >= d13) {
                            int i18 = dVar3.f9958a;
                            d11 = i18;
                            i14 = 100 - i18;
                        } else {
                            i14 = dVar3.f9958a;
                            d11 = i14;
                        }
                        dVar3.f9958a = (int) (d11 + (((double) i14) * d14));
                        d13 = d13;
                    }
                }
                String strC = c(aVarP);
                d.a.a("HEFileUtils", "overwriteBaseFrequencyAndIntensityOfHe20String, result:" + strC);
                return strC;
            }
            str2 = "overwriteBaseFrequencyAndIntensityOfHe20String, do nothing as invalid he20String";
        }
        d.a.a("HEFileUtils", str2);
        return str;
    }

    public static String g(String str, boolean z9) {
        String str2;
        if (z9) {
            str = s(str);
        }
        String strU = u(str);
        if (strU == null || strU.length() == 0) {
            str2 = "convertHE20ToHE10, null after trim";
        } else {
            p029c8.a aVarP = p(strU);
            if (p009a8.c.b(aVarP)) {
                Iterator it = ((c) aVarP.f15244b.get(0)).f15249b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).f9961a.f9954b += ((c) aVarP.f15244b.get(0)).f15248a;
                }
                p019b8.a aVar = new p019b8.a();
                aVar.f14984a = new p019b8.b();
                ArrayList<e> arrayList = ((c) aVarP.f15244b.get(0)).f15249b;
                aVar.f14985b = arrayList;
                for (e eVar : arrayList) {
                    p009a8.b bVar = eVar.f9961a;
                    if (bVar != null && "continuous".equals(bVar.f9953a)) {
                        p009a8.d dVar = eVar.f9961a.f9957e;
                        if (-1 == dVar.f9959b) {
                            dVar.f9959b = 56;
                            Iterator it2 = dVar.f9960c.iterator();
                            while (it2.hasNext()) {
                                ((p009a8.a) it2.next()).f9952c = 0;
                            }
                        }
                    }
                }
                String strB = b(aVar);
                d.a.a("HEFileUtils", "convertHE20ToHE10 result:" + strB);
                return strB;
            }
            str2 = "convertHE20ToHE10, empty HeRoot";
        }
        d.a.b("HEFileUtils", str2);
        return null;
    }

    private static ArrayList h(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        int size = arrayList.size();
        d.a.a("HEFileUtils", "trimTo4p size:" + size);
        if (size > 0 && size <= 4) {
            return arrayList;
        }
        p009a8.a aVar = new p009a8.a();
        int i10 = size - 2;
        int i11 = i10 / 2;
        for (int i12 = 1; i12 <= i11; i12++) {
            aVar.f9950a += ((p009a8.a) arrayList.get(i12)).f9950a;
            aVar.f9951b += ((p009a8.a) arrayList.get(i12)).f9951b;
            aVar.f9952c += ((p009a8.a) arrayList.get(i12)).f9952c;
        }
        aVar.f9950a /= i11;
        double d10 = aVar.f9951b / ((double) i11);
        aVar.f9951b = d10;
        aVar.f9951b = Math.round(d10 * 10.0d) / 10.0d;
        aVar.f9952c /= i11;
        p009a8.a aVar2 = new p009a8.a();
        for (int i13 = i11 + 1; i13 <= i10; i13++) {
            aVar2.f9950a += ((p009a8.a) arrayList.get(i13)).f9950a;
            aVar2.f9951b += ((p009a8.a) arrayList.get(i13)).f9951b;
            aVar2.f9952c += ((p009a8.a) arrayList.get(i13)).f9952c;
        }
        int i14 = i10 - i11;
        aVar2.f9950a /= i14;
        double d11 = aVar2.f9951b / ((double) i14);
        aVar2.f9951b = d11;
        aVar2.f9951b = Math.round(d11 * 10.0d) / 10.0d;
        aVar2.f9952c /= i14;
        d.a.a("HEFileUtils", "trimTo4p size:" + arrayList.size());
        arrayList.subList(1, size - 1).clear();
        arrayList.add(1, aVar);
        arrayList.add(2, aVar2);
        return arrayList;
    }

    public static void i(String str, ArrayList arrayList, ArrayList arrayList2) {
        boolean z9;
        int i10;
        p009a8.b bVar;
        double d10;
        int iK;
        if (str == null || str.length() == 0 || arrayList == null || arrayList2 == null) {
            d.a.b("HEFileUtils", "convertHE10StringToWaveformParams(), invalid parameters.");
            return;
        }
        boolean z10 = true;
        p009a8.c cVarR = r(str, 1);
        if (!p009a8.c.b(cVarR)) {
            d.a.d("HEFileUtils", "convertHE10StringToGoogleWaveform, invalid heRoot!");
            return;
        }
        if (1 != cVarR.a()) {
            d.a.d("HEFileUtils", "convertHE10StringToGoogleWaveform, invalid HE version:" + cVarR.a());
            return;
        }
        arrayList.clear();
        arrayList2.clear();
        long jLongValue = 0;
        arrayList.add(new Long(0L));
        int i11 = 0;
        arrayList2.add(0);
        for (e eVar : ((p019b8.a) cVarR).f14985b) {
            if (eVar == null || (bVar = eVar.f9961a) == null || bVar.f9957e == null) {
                z9 = z10;
                i10 = i11;
            } else {
                if ("transient".equals(bVar.f9953a)) {
                    int i12 = eVar.f9961a.f9954b;
                    z9 = z10;
                    i10 = i11;
                    if (i12 > jLongValue) {
                        d10 = 255.0d;
                        arrayList.add(Long.valueOf(new Long(i12).longValue() - jLongValue));
                        arrayList2.add(Integer.valueOf(i10));
                        jLongValue += ((Long) arrayList.get(arrayList.size() - 1)).longValue();
                    } else {
                        d10 = 255.0d;
                    }
                    p009a8.d dVar = eVar.f9961a.f9957e;
                    arrayList.add(new Long(l(dVar.f9958a, dVar.f9959b)));
                    iK = eVar.f9961a.f9957e.f9958a;
                } else {
                    z9 = z10;
                    i10 = i11;
                    d10 = 255.0d;
                    if ("continuous".equals(eVar.f9961a.f9953a)) {
                        ArrayList arrayList3 = eVar.f9961a.f9957e.f9960c;
                        if (arrayList3 != null && 4 == arrayList3.size()) {
                            int i13 = eVar.f9961a.f9954b;
                            if (i13 > jLongValue) {
                                arrayList.add(Long.valueOf(new Long(i13).longValue() - jLongValue));
                                arrayList2.add(Integer.valueOf(i10));
                                jLongValue += ((Long) arrayList.get(arrayList.size() - 1)).longValue();
                            }
                            arrayList.add(new Long(a(eVar.f9961a.f9955c)));
                            p009a8.d dVar2 = eVar.f9961a.f9957e;
                            iK = k(dVar2.f9958a, dVar2.f9959b);
                        }
                    } else {
                        d.a.b("HEFileUtils", "unknown type!");
                    }
                }
                arrayList2.add(Integer.valueOf((int) (((((double) iK) * 1.0d) / 100.0d) * d10)));
                jLongValue += ((Long) arrayList.get(arrayList.size() - 1)).longValue();
            }
            i11 = i10;
            z10 = z9;
        }
        if (d.d()) {
            Iterator it = arrayList.iterator();
            String str2 = "";
            String str3 = "";
            while (it.hasNext()) {
                str3 = str3 + ((Long) it.next()).toString() + ",";
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                str2 = str2 + ((Integer) it2.next()).toString() + ",";
            }
            d.a.a("HEFileUtils", "timings size:" + arrayList.size() + ",amplitudes size:" + arrayList2.size() + "\n timings:" + str3 + "\n amplitudes:" + str2);
        }
    }

    public static int[] j(String str, int i10, int i11, int i12, int i13, int i14, boolean z9) {
        p019b8.a aVar;
        char c10;
        int i15;
        Integer num;
        StringBuilder sb;
        Integer numValueOf;
        int i16 = i11;
        ArrayList arrayList = new ArrayList();
        Integer num2 = 4096;
        int i17 = 24;
        int i18 = 16;
        int i19 = 1;
        try {
            if (i10 != 1) {
                if (i10 != 2 || 24 > i16) {
                    return null;
                }
                p029c8.a aVarP = p(str);
                ArrayList arrayList2 = aVarP.f15244b;
                if (arrayList2 != null && arrayList2.size() > 0 && ((c) aVarP.f15244b.get(0)).f15249b != null && ((c) aVarP.f15244b.get(0)).f15249b.size() > 0) {
                    int size = aVarP.f15244b.size();
                    if (size > 4) {
                        d.a.d("HEFileUtils", "convertHEStringToIntArray, HE20 with more than 4 pattern!");
                    }
                    arrayList.add(2);
                    arrayList.add(2);
                    arrayList.add(Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i14));
                    arrayList.add(Integer.valueOf((65535 & size) | ((size << 16) & (-65536))));
                    Iterator it = aVarP.f15244b.iterator();
                    int i20 = 0;
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        int i21 = i20 + 1;
                        arrayList.add(Integer.valueOf(i20));
                        arrayList.add(Integer.valueOf(cVar.f15248a));
                        int size2 = cVar.f15249b.size() <= i18 ? cVar.f15249b.size() : i18;
                        arrayList.add(Integer.valueOf(size2));
                        int i22 = 0;
                        while (i22 < size2) {
                            e eVar = (e) cVar.f15249b.get(i22);
                            if ("transient".equals(eVar.f9961a.f9953a)) {
                                arrayList.add(4097);
                                arrayList.add(5);
                                int i23 = eVar.f9961a.f9956d;
                                if (z9) {
                                    i23 = i23 == 0 ? 0 : i19 == i23 ? 2 : i19;
                                }
                                arrayList.add(Integer.valueOf(i23));
                                arrayList.add(Integer.valueOf(eVar.f9961a.f9954b));
                                arrayList.add(Integer.valueOf(eVar.f9961a.f9957e.f9958a));
                                arrayList.add(Integer.valueOf(eVar.f9961a.f9957e.f9959b));
                                arrayList.add(Integer.valueOf(eVar.f9961a.f9955c));
                            } else {
                                if ("continuous".equals(eVar.f9961a.f9953a)) {
                                    int size3 = eVar.f9961a.f9957e.f9960c.size();
                                    if (4 > size3 || 16 < size3) {
                                        sb = new StringBuilder();
                                        sb.append("convertHEStringToIntArray, curvePointCount:");
                                        sb.append(size3);
                                    } else {
                                        arrayList.add(num2);
                                        arrayList.add(Integer.valueOf((size3 * 3) + 6));
                                        int i24 = eVar.f9961a.f9956d;
                                        if (z9) {
                                            i24 = i24 == 0 ? 0 : 1 == i24 ? 2 : 1;
                                        }
                                        arrayList.add(Integer.valueOf(i24));
                                        arrayList.add(Integer.valueOf(eVar.f9961a.f9954b));
                                        arrayList.add(Integer.valueOf(eVar.f9961a.f9957e.f9958a));
                                        if (i16 > 32 || i12 > 16) {
                                            numValueOf = Integer.valueOf(eVar.f9961a.f9957e.f9959b);
                                        } else {
                                            int i25 = eVar.f9961a.f9957e.f9959b;
                                            if (-1 == i25) {
                                                i25 = 56;
                                            }
                                            numValueOf = Integer.valueOf(i25);
                                        }
                                        arrayList.add(numValueOf);
                                        arrayList.add(Integer.valueOf(eVar.f9961a.f9955c));
                                        arrayList.add(Integer.valueOf(size3));
                                        for (p009a8.a aVar2 : eVar.f9961a.f9957e.f9960c) {
                                            arrayList.add(Integer.valueOf(aVar2.f9950a));
                                            int i26 = size2;
                                            int i27 = i22;
                                            arrayList.add(Integer.valueOf((int) (aVar2.f9951b * 100.0d)));
                                            int i28 = (i16 > 32 || i12 > 16 || -1 != eVar.f9961a.f9957e.f9959b) ? aVar2.f9952c : 0;
                                            arrayList.add(Integer.valueOf(i28));
                                            size2 = i26;
                                            i22 = i27;
                                        }
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    sb.append("convertHEStringToIntArray, skip unknown type:");
                                    sb.append(eVar.f9961a.f9953a);
                                }
                                d.a.d("HEFileUtils", sb.toString());
                                i22++;
                                it = it;
                                size2 = size2;
                                i18 = 16;
                                i19 = 1;
                            }
                            size2 = size2;
                            i22 = i22;
                            i22++;
                            it = it;
                            size2 = size2;
                            i18 = 16;
                            i19 = 1;
                        }
                        i20 = i21;
                    }
                }
                d.a.d("HEFileUtils", "convertHEStringToIntArray, empty HE20!");
                return null;
            }
            p019b8.a aVarM = m(str);
            ArrayList arrayList3 = aVarM.f14985b;
            if (arrayList3 == null && arrayList3.size() <= 0) {
                d.a.d("HEFileUtils", "convertHEStringToIntArray, empty HE10!");
                return null;
            }
            char c11 = 3;
            arrayList.add(24 > i16 ? 1 : 3);
            int size4 = aVarM.f14985b.size() <= 16 ? aVarM.f14985b.size() : 16;
            int i29 = 0;
            while (i29 < size4) {
                e eVar2 = (e) aVarM.f14985b.get(i29);
                if ("transient".equals(eVar2.f9961a.f9953a)) {
                    arrayList.add(4097);
                    arrayList.add(Integer.valueOf(eVar2.f9961a.f9954b));
                    arrayList.add(Integer.valueOf(eVar2.f9961a.f9957e.f9958a));
                    arrayList.add(Integer.valueOf(eVar2.f9961a.f9957e.f9959b));
                    arrayList.add(Integer.valueOf(eVar2.f9961a.f9955c));
                    if (i17 > i16) {
                        for (int i30 = 0; i30 < 12; i30++) {
                            arrayList.add(0);
                        }
                    } else {
                        arrayList.add(0);
                        arrayList.add(0);
                        for (int i31 = 0; i31 < 48; i31++) {
                            arrayList.add(0);
                        }
                    }
                    aVar = aVarM;
                    c10 = c11;
                } else {
                    if ("continuous".equals(eVar2.f9961a.f9953a)) {
                        int size5 = eVar2.f9961a.f9957e.f9960c.size();
                        c10 = c11;
                        if (i17 <= i16 || 4 == size5) {
                            if (i17 > i16 || (4 <= size5 && 16 >= size5)) {
                                arrayList.add(num2);
                                arrayList.add(Integer.valueOf(eVar2.f9961a.f9954b));
                                arrayList.add(Integer.valueOf(eVar2.f9961a.f9957e.f9958a));
                                int i32 = eVar2.f9961a.f9957e.f9959b;
                                if (-1 == i32) {
                                    i32 = 56;
                                }
                                arrayList.add(Integer.valueOf(i32));
                                arrayList.add(Integer.valueOf(eVar2.f9961a.f9955c));
                                if (24 > i16) {
                                    for (p009a8.a aVar3 : eVar2.f9961a.f9957e.f9960c) {
                                        arrayList.add(Integer.valueOf(aVar3.f9950a));
                                        p019b8.a aVar4 = aVarM;
                                        arrayList.add(Integer.valueOf((int) (aVar3.f9951b * 100.0d)));
                                        arrayList.add(Integer.valueOf(-1 == eVar2.f9961a.f9957e.f9959b ? 0 : aVar3.f9952c));
                                        aVarM = aVar4;
                                    }
                                } else {
                                    aVar = aVarM;
                                    arrayList.add(Integer.valueOf(size5));
                                    for (p009a8.a aVar5 : eVar2.f9961a.f9957e.f9960c) {
                                        arrayList.add(Integer.valueOf(aVar5.f9950a));
                                        int i33 = i29;
                                        Integer num3 = num2;
                                        arrayList.add(Integer.valueOf((int) (aVar5.f9951b * 100.0d)));
                                        arrayList.add(Integer.valueOf(-1 == eVar2.f9961a.f9957e.f9959b ? 0 : aVar5.f9952c));
                                        num2 = num3;
                                        i29 = i33;
                                    }
                                    i15 = i29;
                                    num = num2;
                                    for (int i34 = 0; i34 < (16 - size5) * 3; i34++) {
                                        arrayList.add(0);
                                    }
                                }
                            }
                        }
                        aVar = aVarM;
                    } else {
                        aVar = aVarM;
                        c10 = c11;
                        i15 = i29;
                        num = num2;
                        d.a.d("HEFileUtils", "convertHEStringToIntArray, skip unknown type:" + eVar2.f9961a.f9953a);
                    }
                    i29 = i15 + 1;
                    i17 = 24;
                    aVarM = aVar;
                    i16 = i11;
                    num2 = num;
                    c11 = c10;
                }
                i15 = i29;
                num = num2;
                i29 = i15 + 1;
                i17 = 24;
                aVarM = aVar;
                i16 = i11;
                num2 = num;
                c11 = c10;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i35 = 0; i35 < arrayList.size(); i35++) {
            iArr[i35] = ((Integer) arrayList.get(i35)).intValue();
        }
        return iArr;
    }

    private static int k(int i10, int i11) {
        if (-1 != i11) {
            if (30 > i11) {
                return 0;
            }
            if (100 >= i11) {
                return i10;
            }
        }
        return 100;
    }

    private static int l(int i10, int i11) {
        if (i11 < 41 || i11 > 68) {
            if (i10 <= 0 || i10 >= 50) {
                return (i10 < 50 || i10 > 100) ? 0 : 15;
            }
            return 10;
        }
        if (i10 > 0 && i10 < 50) {
            return 15;
        }
        if (i10 < 50 || i10 >= 75) {
            return (i10 < 75 || i10 > 100) ? 0 : 30;
        }
        return 20;
    }

    public static p019b8.a m(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            p019b8.a aVar = new p019b8.a();
            aVar.f14984a = new p019b8.b();
            aVar.f14985b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("Pattern");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i10);
                e eVar = new e();
                eVar.f9961a = new p009a8.b();
                JSONObject jSONObject3 = jSONObject2.getJSONObject("Event");
                eVar.f9961a.f9953a = jSONObject3.getString("Type");
                if ("continuous".equals(eVar.f9961a.f9953a)) {
                    eVar.f9961a.f9955c = jSONObject3.getInt("Duration");
                }
                eVar.f9961a.f9954b = jSONObject3.getInt("RelativeTime");
                JSONObject jSONObject4 = jSONObject3.getJSONObject("Parameters");
                eVar.f9961a.f9957e = new p009a8.d();
                eVar.f9961a.f9957e.f9959b = jSONObject4.getInt("Frequency");
                eVar.f9961a.f9957e.f9958a = jSONObject4.getInt("Intensity");
                eVar.f9961a.f9957e.f9960c = new ArrayList();
                if ("continuous".equals(eVar.f9961a.f9953a)) {
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("Curve");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        JSONObject jSONObject5 = (JSONObject) jSONArray2.get(i11);
                        p009a8.a aVar2 = new p009a8.a();
                        aVar2.f9952c = jSONObject5.getInt("Frequency");
                        aVar2.f9951b = jSONObject5.getDouble("Intensity");
                        aVar2.f9950a = jSONObject5.getInt("Time");
                        eVar.f9961a.f9957e.f9960c.add(aVar2);
                    }
                }
                aVar.f14985b.add(eVar);
            }
            return aVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String n(String str, int i10) {
        p029c8.a aVarP;
        ArrayList arrayList;
        int iIndexOf;
        int iIndexOf2;
        if (i10 == 0) {
            return str;
        }
        try {
            aVarP = p(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            aVarP = null;
        }
        if (aVarP == null || (arrayList = aVarP.f15244b) == null || arrayList.size() == 0) {
            d.a.d("HEFileUtils", "  generatePartialHe20String, source HE invalid!");
            return "";
        }
        Iterator it = aVarP.f15244b.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                iIndexOf2 = -1;
                break;
            }
            c cVar = (c) it.next();
            ArrayList<e> arrayList2 = cVar.f15249b;
            if (arrayList2 != null) {
                for (e eVar : arrayList2) {
                    p009a8.b bVar = eVar.f9961a;
                    if (bVar != null && bVar.f9954b + cVar.f15248a >= i10) {
                        iIndexOf = cVar.f15249b.indexOf(eVar);
                        iIndexOf2 = aVarP.f15244b.indexOf(cVar);
                        break loop0;
                    }
                }
            }
        }
        if (iIndexOf2 < 0 || iIndexOf < 0) {
            return "";
        }
        aVarP.f15244b.subList(0, iIndexOf2).clear();
        ((c) aVarP.f15244b.get(0)).f15249b.subList(0, iIndexOf).clear();
        d.a.a("HEFileUtils", "  generatePartialHe20String, targetPatternListItemIndex:" + iIndexOf2 + ",targetPatterItemIndex:" + iIndexOf + ", PatternList size:" + aVarP.f15244b.size() + ",Pattern size:" + ((c) aVarP.f15244b.get(0)).f15249b.size());
        for (c cVar2 : aVarP.f15244b) {
            ArrayList arrayList3 = cVar2.f15249b;
            if (arrayList3 != null) {
                int i11 = cVar2.f15248a;
                if (i11 < i10) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        p009a8.b bVar2 = ((e) it2.next()).f9961a;
                        if (bVar2 != null) {
                            bVar2.f9954b = (bVar2.f9954b + cVar2.f15248a) - i10;
                        }
                    }
                    cVar2.f15248a = 0;
                } else {
                    cVar2.f15248a = i11 - i10;
                }
            }
        }
        if (iIndexOf == 0 && ((c) aVarP.f15244b.get(0)).f15248a != 0) {
            c cVar3 = new c();
            cVar3.f15248a = 0;
            cVar3.f15249b = new ArrayList();
            p009a8.b bVar3 = new p009a8.b();
            p009a8.d dVar = new p009a8.d();
            bVar3.f9957e = dVar;
            dVar.f9958a = 0;
            dVar.f9959b = 0;
            bVar3.f9953a = "transient";
            e eVar2 = new e();
            eVar2.f9961a = bVar3;
            cVar3.f15249b.add(eVar2);
            aVarP.f15244b.add(0, cVar3);
        }
        return c(aVarP);
    }

    public static int o(String str, int i10) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        p009a8.c cVarR = r(str, i10);
        if (d.d(cVarR)) {
            return cVarR.c();
        }
        return 0;
    }

    public static p029c8.a p(String str) {
        p029c8.a aVar;
        p029c8.a aVar2 = null;
        if (2 != q(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            p029c8.a aVar3 = new p029c8.a();
            aVar3.f15243a = new p029c8.b();
            aVar3.f15244b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("PatternList");
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i10);
                c cVar = new c();
                cVar.f15248a = jSONObject2.getInt("AbsoluteTime");
                cVar.f15249b = new ArrayList();
                JSONArray jSONArray2 = jSONObject2.getJSONArray("Pattern");
                int i11 = 0;
                while (i11 < jSONArray2.length()) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i11);
                    e eVar = new e();
                    eVar.f9961a = new p009a8.b();
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("Event");
                    eVar.f9961a.f9953a = jSONObject4.getString("Type");
                    if ("continuous".equals(eVar.f9961a.f9953a)) {
                        eVar.f9961a.f9955c = jSONObject4.getInt("Duration");
                    } else if ("transient".equals(eVar.f9961a.f9953a)) {
                        eVar.f9961a.f9955c = 48;
                    }
                    eVar.f9961a.f9954b = jSONObject4.getInt("RelativeTime");
                    eVar.f9961a.f9956d = jSONObject4.getInt("Index");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("Parameters");
                    eVar.f9961a.f9957e = new p009a8.d();
                    eVar.f9961a.f9957e.f9959b = jSONObject5.getInt("Frequency");
                    eVar.f9961a.f9957e.f9958a = jSONObject5.getInt("Intensity");
                    eVar.f9961a.f9957e.f9960c = new ArrayList();
                    if ("continuous".equals(eVar.f9961a.f9953a)) {
                        JSONArray jSONArray3 = jSONObject5.getJSONArray("Curve");
                        int i12 = 0;
                        while (i12 < jSONArray3.length()) {
                            JSONObject jSONObject6 = (JSONObject) jSONArray3.get(i12);
                            p009a8.a aVar4 = new p009a8.a();
                            aVar = aVar2;
                            try {
                                aVar4.f9952c = jSONObject6.getInt("Frequency");
                                aVar4.f9951b = jSONObject6.getDouble("Intensity");
                                aVar4.f9950a = jSONObject6.getInt("Time");
                                eVar.f9961a.f9957e.f9960c.add(aVar4);
                                i12++;
                                i10 = i10;
                                aVar2 = aVar;
                            } catch (Exception e10) {
                                e = e10;
                                e.printStackTrace();
                                return aVar;
                            }
                        }
                    }
                    cVar.f15249b.add(eVar);
                    i11++;
                    i10 = i10;
                    aVar2 = aVar2;
                }
                p029c8.a aVar5 = aVar2;
                int i13 = i10;
                aVar3.f15244b.add(cVar);
                i10 = i13 + 1;
                aVar2 = aVar5;
            }
            return aVar3;
        } catch (Exception e11) {
            e = e11;
            aVar = aVar2;
        }
    }

    public static int q(String str) {
        try {
            return new JSONObject(str).getJSONObject("Metadata").getInt("Version");
        } catch (Exception e10) {
            d.a.b("HEFileUtils", "getHeVersion ERROR, heString:" + str);
            e10.printStackTrace();
            return 0;
        }
    }

    public static p009a8.c r(String str, int i10) {
        d.a.a("HEFileUtils", "getHeRootFromHeString, HE version:" + i10);
        if (i10 == 1) {
            try {
                return m(str);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        if (i10 != 2) {
            return null;
        }
        try {
            return p(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static String s(String str) {
        p029c8.a aVarP;
        try {
            aVarP = p(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            aVarP = null;
        }
        if (!d.d(aVarP)) {
            d.a.d("HEFileUtils", " , trim16pTo4p, invalid HE2.0 string!");
            return "";
        }
        Iterator it = aVarP.f15244b.iterator();
        while (it.hasNext()) {
            for (e eVar : ((c) it.next()).f15249b) {
                p009a8.d dVar = eVar.f9961a.f9957e;
                dVar.f9960c = h(dVar.f9960c);
                if (eVar.f9961a.f9953a.equals("transient")) {
                    p009a8.d dVar2 = eVar.f9961a.f9957e;
                    int i10 = dVar2.f9959b;
                    if (i10 < 0) {
                        dVar2.f9959b = 0;
                    } else if (i10 > 100) {
                        dVar2.f9959b = 100;
                    }
                }
            }
        }
        return c(aVarP);
    }

    public static String t(String str, int i10) {
        try {
            p029c8.a aVarP = p(str);
            for (int i11 = 0; i11 < aVarP.f15244b.size(); i11++) {
                for (int i12 = 0; i12 < ((c) aVarP.f15244b.get(i11)).f15249b.size(); i12++) {
                    if (((c) aVarP.f15244b.get(i11)).f15248a <= i10 && ((c) aVarP.f15244b.get(i11)).f15248a + ((e) ((c) aVarP.f15244b.get(i11)).f15249b.get(i12)).f9961a.f9954b >= i10) {
                        p029c8.a aVar = new p029c8.a();
                        aVar.f15243a = new p029c8.b();
                        aVar.f15244b = new ArrayList();
                        c cVar = new c();
                        cVar.f15248a = 0;
                        ArrayList arrayList = new ArrayList();
                        cVar.f15249b = arrayList;
                        arrayList.addAll(((c) aVarP.f15244b.get(i11)).f15249b.subList(i12, ((c) aVarP.f15244b.get(i11)).f15249b.size()));
                        Iterator it = cVar.f15249b.iterator();
                        while (it.hasNext()) {
                            p009a8.b bVar = ((e) it.next()).f9961a;
                            bVar.f9954b = (bVar.f9954b + ((c) aVarP.f15244b.get(i11)).f15248a) - i10;
                        }
                        aVar.f15244b.add(cVar);
                        return c(aVar);
                    }
                    if (((c) aVarP.f15244b.get(i11)).f15248a > i10) {
                        p029c8.a aVar2 = new p029c8.a();
                        aVar2.f15243a = new p029c8.b();
                        aVar2.f15244b = new ArrayList();
                        c cVar2 = new c();
                        cVar2.f15248a = 0;
                        cVar2.f15249b = new ArrayList();
                        p009a8.b bVar2 = new p009a8.b();
                        p009a8.d dVar = new p009a8.d();
                        bVar2.f9957e = dVar;
                        dVar.f9958a = 0;
                        dVar.f9959b = 0;
                        bVar2.f9953a = "transient";
                        e eVar = new e();
                        eVar.f9961a = bVar2;
                        cVar2.f15249b.add(eVar);
                        aVar2.f15244b.add(cVar2);
                        return c(aVar2);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String u(String str) throws Throwable {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2 = "transient";
        d.b("trimOverlapEvent_in.he", str);
        p029c8.a aVarP = p(str);
        if (!d.d(aVarP)) {
            return str;
        }
        try {
            for (c cVar : aVarP.f15244b) {
                ArrayList arrayList = cVar.f15249b;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        c10 = 2;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (2 == ((e) it.next()).f9961a.f9956d) {
                            it.remove();
                        }
                    }
                    int i14 = 1;
                    if (1 != cVar.f15249b.size()) {
                        Collections.sort(cVar.f15249b, new a());
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = 1;
                        while (i16 <= cVar.f15249b.size() - i14 && i17 <= cVar.f15249b.size() - i14) {
                            p009a8.b bVar = ((e) cVar.f15249b.get(i16)).f9961a;
                            p009a8.b bVar2 = ((e) cVar.f15249b.get(i17)).f9961a;
                            int i18 = str2.equals(bVar.f9953a) ? 48 : bVar.f9955c;
                            int i19 = str2.equals(bVar2.f9953a) ? 48 : bVar2.f9955c;
                            if (bVar2.f9954b < bVar.f9954b + i18) {
                                if (!"continuous".equals(bVar2.f9953a) || (i11 = bVar2.f9954b + i19) <= (i12 = bVar.f9954b + i18) || (i13 = i11 - i12) <= 48) {
                                    i10 = i15;
                                    bVar2.f9956d = -1;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    p009a8.a aVar = new p009a8.a();
                                    aVar.f9950a = i15;
                                    aVar.f9951b = 0.0d;
                                    aVar.f9952c = i15;
                                    p009a8.a aVar2 = new p009a8.a();
                                    aVar2.f9950a = i13 / 3;
                                    aVar2.f9951b = 1.0d;
                                    aVar2.f9952c = i15;
                                    p009a8.a aVar3 = new p009a8.a();
                                    aVar3.f9950a = (i13 / 3) * 2;
                                    aVar3.f9951b = 1.0d;
                                    i10 = 0;
                                    aVar3.f9952c = 0;
                                    p009a8.a aVar4 = new p009a8.a();
                                    aVar4.f9950a = i13;
                                    aVar4.f9951b = 0.0d;
                                    aVar4.f9952c = 0;
                                    arrayList2.add(aVar);
                                    arrayList2.add(aVar2);
                                    arrayList2.add(aVar3);
                                    arrayList2.add(aVar4);
                                    bVar2.f9955c = i13;
                                    bVar2.f9954b = bVar.f9954b + i18;
                                    bVar2.f9957e.f9960c = arrayList2;
                                    i16 = i17;
                                }
                                i17++;
                                i15 = i10;
                                c10 = c10;
                                str2 = str2;
                                i14 = 1;
                            } else {
                                i16 = i17;
                                i14 = 1;
                                i17++;
                                str2 = str2;
                            }
                        }
                        String str3 = str2;
                        Iterator it2 = cVar.f15249b.iterator();
                        while (it2.hasNext()) {
                            if (((e) it2.next()).f9961a.f9956d < 0) {
                                it2.remove();
                            }
                        }
                        str2 = str3;
                    }
                }
            }
            String strC = c(aVarP);
            d.b("trimOverlapEvent_out.he", strC);
            return strC;
        } catch (Throwable th) {
            d.a.b("HEFileUtils", "trimOverlapEvent " + th.toString());
            return str;
        }
    }
}
