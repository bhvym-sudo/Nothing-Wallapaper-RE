package p181s0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f27651a;

        public c(d[] dVarArr) {
            this.f27651a = dVarArr;
        }

        public d[] a() {
            return this.f27651a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f27654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f27656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f27657f;

        public d(String str, int i10, boolean z9, String str2, int i11, int i12) {
            this.f27652a = str;
            this.f27653b = i10;
            this.f27654c = z9;
            this.f27655d = str2;
            this.f27656e = i11;
            this.f27657f = i12;
        }

        public int a() {
            return this.f27657f;
        }

        public int b() {
            return this.f27656e;
        }

        public String c() {
            return this.f27655d;
        }

        public int d() {
            return this.f27653b;
        }

        public boolean e() {
            return this.f27654c;
        }
    }

    /* JADX INFO: renamed from: s0.e$e, reason: collision with other inner class name */
    public static final class C0666e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p241y0.e f27658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p241y0.e f27659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27662e;

        public C0666e(p241y0.e eVar, p241y0.e eVar2, int i10, int i11, String str) {
            this.f27658a = eVar;
            this.f27659b = eVar2;
            this.f27661d = i10;
            this.f27660c = i11;
            this.f27662e = str;
        }

        public p241y0.e a() {
            return this.f27659b;
        }

        public int b() {
            return this.f27661d;
        }

        public p241y0.e c() {
            return this.f27658a;
        }

        public String d() {
            return this.f27662e;
        }

        public int e() {
            return this.f27660c;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), p151p0.c.f23634h);
        String string = typedArrayObtainAttributes.getString(p151p0.c.f23635i);
        String string2 = typedArrayObtainAttributes.getString(p151p0.c.f23640n);
        String string3 = typedArrayObtainAttributes.getString(p151p0.c.f23641o);
        String string4 = typedArrayObtainAttributes.getString(p151p0.c.f23637k);
        int resourceId = typedArrayObtainAttributes.getResourceId(p151p0.c.f23636j, 0);
        int integer = typedArrayObtainAttributes.getInteger(p151p0.c.f23638l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(p151p0.c.f23639m, 500);
        String string5 = typedArrayObtainAttributes.getString(p151p0.c.f23642p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List listC = c(resources, resourceId);
            return new C0666e(new p241y0.e(string, string2, string3, listC), string4 != null ? new p241y0.e(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), p151p0.c.f23643q);
        int i10 = p151p0.c.f23652z;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = p151p0.c.f23645s;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = p151p0.c.f23650x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = p151p0.c.f23646t;
        }
        boolean z9 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = p151p0.c.f23610A;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = p151p0.c.f23647u;
        }
        int i14 = p151p0.c.f23651y;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = p151p0.c.f23648v;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = p151p0.c.f23649w;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = p151p0.c.f23644r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z9, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
