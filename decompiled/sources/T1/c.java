package T1;

import B8.h;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p089i8.L;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7460f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f7464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f7465e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Map a(Resources resources) {
            n.h(resources, "resources");
            String[] stringArray = resources.getStringArray(R.array.clock_color_ids);
            n.g(stringArray, "getStringArray(...)");
            TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(R.array.clock_color_names);
            n.g(typedArrayObtainTypedArray, "obtainTypedArray(...)");
            TypedArray typedArrayObtainTypedArray2 = resources.obtainTypedArray(R.array.clock_colors);
            n.g(typedArrayObtainTypedArray2, "obtainTypedArray(...)");
            TypedArray typedArrayObtainTypedArray3 = resources.obtainTypedArray(R.array.clock_color_tone_min);
            n.g(typedArrayObtainTypedArray3, "obtainTypedArray(...)");
            TypedArray typedArrayObtainTypedArray4 = resources.obtainTypedArray(R.array.clock_color_tone_max);
            n.g(typedArrayObtainTypedArray4, "obtainTypedArray(...)");
            List listC = AbstractC1444s.c();
            Iterator it = AbstractC1439m.F(stringArray).iterator();
            while (it.hasNext()) {
                int iA = ((L) it).a();
                String str = stringArray[iA];
                n.g(str, "get(...)");
                listC.add(new c(str, typedArrayObtainTypedArray.getString(iA), typedArrayObtainTypedArray2.getColor(iA, 0), typedArrayObtainTypedArray3.getInt(iA, 0), typedArrayObtainTypedArray4.getInt(iA, 100)));
            }
            List listA = AbstractC1444s.a(listC);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h.f(N.d(AbstractC1444s.u(listA, 10)), 16));
            for (Object obj : listA) {
                linkedHashMap.put(((c) obj).b(), obj);
            }
            typedArrayObtainTypedArray.recycle();
            typedArrayObtainTypedArray2.recycle();
            typedArrayObtainTypedArray3.recycle();
            typedArrayObtainTypedArray4.recycle();
            return linkedHashMap;
        }

        private a() {
        }
    }

    public c(String colorId, String str, int i10, double d10, double d11) {
        n.h(colorId, "colorId");
        this.f7461a = colorId;
        this.f7462b = str;
        this.f7463c = i10;
        this.f7464d = d10;
        this.f7465e = d11;
    }

    public final int a() {
        return this.f7463c;
    }

    public final String b() {
        return this.f7461a;
    }

    public final String c() {
        return this.f7462b;
    }

    public final double d(int i10) {
        double d10 = this.f7464d;
        return d10 + ((((double) i10) * (this.f7465e - d10)) / ((double) 100));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.d(this.f7461a, cVar.f7461a) && n.d(this.f7462b, cVar.f7462b) && this.f7463c == cVar.f7463c && Double.compare(this.f7464d, cVar.f7464d) == 0 && Double.compare(this.f7465e, cVar.f7465e) == 0;
    }

    public int hashCode() {
        int iHashCode = this.f7461a.hashCode() * 31;
        String str = this.f7462b;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f7463c)) * 31) + Double.hashCode(this.f7464d)) * 31) + Double.hashCode(this.f7465e);
    }

    public String toString() {
        return "ClockColorViewModel(colorId=" + this.f7461a + ", colorName=" + this.f7462b + ", color=" + this.f7463c + ", colorToneMin=" + this.f7464d + ", colorToneMax=" + this.f7465e + ")";
    }
}
