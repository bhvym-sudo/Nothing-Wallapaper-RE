package H2;

import android.graphics.fonts.Font;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import android.util.MathUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2347b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f2348c = Log.isLoggable("FontInterpolator", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FontVariationAxis[] f2349d = new FontVariationAxis[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H2.b f2350a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(Font start, Font end) {
            kotlin.jvm.internal.n.h(start, "start");
            kotlin.jvm.internal.n.h(end, "end");
            return start.getTtcIndex() == end.getTtcIndex() && start.getSourceIdentifier() == end.getSourceIdentifier();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(((FontVariationAxis) obj).getTag(), ((FontVariationAxis) obj2).getTag());
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(((FontVariationAxis) obj).getTag(), ((FontVariationAxis) obj2).getTag());
        }
    }

    public e(H2.b fontCache) {
        kotlin.jvm.internal.n.h(fontCache, "fontCache");
        this.f2350a = fontCache;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    private final List c(FontVariationAxis[] fontVariationAxisArr, FontVariationAxis[] fontVariationAxisArr2, p219v8.q qVar) {
        int iCompareTo;
        int i10;
        int i11;
        float fFloatValue;
        float fA;
        if (fontVariationAxisArr.length > 1) {
            AbstractC1439m.y(fontVariationAxisArr, new b());
        }
        if (fontVariationAxisArr2.length > 1) {
            AbstractC1439m.y(fontVariationAxisArr2, new c());
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= fontVariationAxisArr.length && i13 >= fontVariationAxisArr2.length) {
                return arrayList;
            }
            String tag = i12 < fontVariationAxisArr.length ? fontVariationAxisArr[i12].getTag() : null;
            String tag2 = i13 < fontVariationAxisArr2.length ? fontVariationAxisArr2[i13].getTag() : null;
            if (tag == null) {
                iCompareTo = 1;
            } else {
                iCompareTo = tag2 == null ? -1 : tag.compareTo(tag2);
            }
            if (iCompareTo != 0 && iCompareTo >= 0) {
                kotlin.jvm.internal.n.e(tag2);
                tag = tag2;
            } else {
                kotlin.jvm.internal.n.e(tag);
            }
            H2.a aVarA = g.f2356a.a(tag);
            if (iCompareTo != 0 && aVarA == null) {
                throw new IllegalArgumentException(("Unable to interpolate due to unknown default axes value: " + tag).toString());
            }
            if (iCompareTo == 0) {
                i11 = i12 + 1;
                i10 = i13 + 1;
                fFloatValue = ((Number) qVar.e(tag, Float.valueOf(fontVariationAxisArr[i12].getStyleValue()), Float.valueOf(fontVariationAxisArr2[i13].getStyleValue()))).floatValue();
            } else {
                if (iCompareTo < 0) {
                    i11 = i12 + 1;
                    Float fValueOf = Float.valueOf(fontVariationAxisArr[i12].getStyleValue());
                    kotlin.jvm.internal.n.e(aVarA);
                    fFloatValue = ((Number) qVar.e(tag, fValueOf, Float.valueOf(aVarA.b()))).floatValue();
                } else {
                    kotlin.jvm.internal.n.e(aVarA);
                    i10 = i13 + 1;
                    i11 = i12;
                    fFloatValue = ((Number) qVar.e(tag, Float.valueOf(aVarA.b()), Float.valueOf(fontVariationAxisArr2[i13].getStyleValue()))).floatValue();
                }
                if (aVarA != null) {
                    fA = aVarA.a();
                } else {
                    fA = 1.0f;
                }
                arrayList.add(new FontVariationAxis(tag, p239x8.a.b(fFloatValue / fA) * fA));
                i12 = i11;
            }
            i13 = i10;
            if (aVarA != null) {
                fA = aVarA.a();
            } else {
                fA = 1.0f;
            }
            arrayList.add(new FontVariationAxis(tag, p239x8.a.b(fFloatValue / fA) * fA));
            i12 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f10, String tag, float f11, float f12) {
        kotlin.jvm.internal.n.h(tag, "tag");
        return MathUtils.lerp(f11, f12, f10);
    }

    public final Font b(Font start, Font end, final float f10, float f11) throws IOException {
        kotlin.jvm.internal.n.h(start, "start");
        kotlin.jvm.internal.n.h(end, "end");
        if (f10 <= 0.0f) {
            return start;
        }
        if (f10 >= 1.0f) {
            return end;
        }
        FontVariationAxis[] axes = start.getAxes();
        if (axes == null) {
            axes = f2349d;
        }
        FontVariationAxis[] axes2 = end.getAxes();
        if (axes2 == null) {
            axes2 = f2349d;
        }
        if (axes.length == 0 && axes2.length == 0) {
            return start;
        }
        h hVar = new h(start, end, p239x8.a.b(this.f2350a.c() * f11));
        Font fontD = this.f2350a.d(hVar);
        if (fontD != null) {
            if (f2348c) {
                Log.d("FontInterpolator", "[" + f10 + ", " + f11 + "] Interp. cache hit for " + hVar);
            }
            return fontD;
        }
        List listC = c(axes, axes2, new p219v8.q() { // from class: H2.d
            @Override // p219v8.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return Float.valueOf(e.d(f10, (String) obj, ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
            }
        });
        t tVar = new t(start, listC);
        Font fontE = this.f2350a.e(tVar);
        if (fontE != null) {
            this.f2350a.b(hVar, fontE);
            if (f2348c) {
                Log.d("FontInterpolator", "[" + f10 + ", " + f11 + "] Axis cache hit for " + tVar);
            }
            return fontE;
        }
        Font fontBuild = new Font.Builder(start).setFontVariationSettings((FontVariationAxis[]) listC.toArray(new FontVariationAxis[0])).build();
        kotlin.jvm.internal.n.g(fontBuild, "build(...)");
        this.f2350a.b(hVar, fontBuild);
        this.f2350a.a(tVar, fontBuild);
        Log.e("FontInterpolator", "[" + f10 + ", " + f11 + "] Cache MISS for " + hVar + " / " + tVar);
        return fontBuild;
    }
}
