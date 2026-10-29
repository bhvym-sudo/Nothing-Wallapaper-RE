package p181s0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p151p0.c;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    private static a a(a aVar, int i10, int i11, boolean z9, int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z9 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayQ = k.q(resources, theme, attributeSet, c.f23611B);
        float fJ = k.j(typedArrayQ, xmlPullParser, "startX", c.f23620K, 0.0f);
        float fJ2 = k.j(typedArrayQ, xmlPullParser, "startY", c.f23621L, 0.0f);
        float fJ3 = k.j(typedArrayQ, xmlPullParser, "endX", c.f23622M, 0.0f);
        float fJ4 = k.j(typedArrayQ, xmlPullParser, "endY", c.f23623N, 0.0f);
        float fJ5 = k.j(typedArrayQ, xmlPullParser, "centerX", c.f23615F, 0.0f);
        float fJ6 = k.j(typedArrayQ, xmlPullParser, "centerY", c.f23616G, 0.0f);
        int iK = k.k(typedArrayQ, xmlPullParser, "type", c.f23614E, 0);
        int iF = k.f(typedArrayQ, xmlPullParser, "startColor", c.f23612C, 0);
        boolean zP = k.p(xmlPullParser, "centerColor");
        int iF2 = k.f(typedArrayQ, xmlPullParser, "centerColor", c.f23619J, 0);
        int iF3 = k.f(typedArrayQ, xmlPullParser, "endColor", c.f23613D, 0);
        int iK2 = k.k(typedArrayQ, xmlPullParser, "tileMode", c.f23618I, 0);
        float fJ7 = k.j(typedArrayQ, xmlPullParser, "gradientRadius", c.f23617H, 0.0f);
        typedArrayQ.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zP, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f27663a, aVarA.f27664b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f27663a, aVarA.f27664b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f27663a, aVarA.f27664b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayQ = k.q(resources, theme, attributeSet, c.f23624O);
                int i10 = c.f23625P;
                boolean zHasValue = typedArrayQ.hasValue(i10);
                int i11 = c.f23626Q;
                boolean zHasValue2 = typedArrayQ.hasValue(i11);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayQ.getColor(i10, 0);
                float f10 = typedArrayQ.getFloat(i11, 0.0f);
                typedArrayQ.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f27663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f27664b;

        a(List list, List list2) {
            int size = list.size();
            this.f27663a = new int[size];
            this.f27664b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f27663a[i10] = ((Integer) list.get(i10)).intValue();
                this.f27664b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f27663a = new int[]{i10, i11};
            this.f27664b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f27663a = new int[]{i10, i11, i12};
            this.f27664b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
