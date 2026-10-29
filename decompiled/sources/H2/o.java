package H2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextShaper;
import android.util.MathUtils;
import com.android.internal.graphics.ColorUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f2381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f2382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextPaint f2383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f2384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f2385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f2386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextPaint f2387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p079h8.h f2388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p079h8.h f2389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f2390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Layout f2393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f2394n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p219v8.p f2395o;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Font f2398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Font f2399d;

        public a(int i10, int i11, Font baseFont, Font targetFont) {
            kotlin.jvm.internal.n.h(baseFont, "baseFont");
            kotlin.jvm.internal.n.h(targetFont, "targetFont");
            this.f2396a = i10;
            this.f2397b = i11;
            this.f2398c = baseFont;
            this.f2399d = targetFont;
        }

        public final Font a() {
            return this.f2398c;
        }

        public final int b() {
            return this.f2397b;
        }

        public final int c() {
            return this.f2397b - this.f2396a;
        }

        public final int d() {
            return this.f2396a;
        }

        public final Font e() {
            return this.f2399d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2396a == aVar.f2396a && this.f2397b == aVar.f2397b && kotlin.jvm.internal.n.d(this.f2398c, aVar.f2398c) && kotlin.jvm.internal.n.d(this.f2399d, aVar.f2399d);
        }

        public final void f(Font font) {
            kotlin.jvm.internal.n.h(font, "<set-?>");
            this.f2398c = font;
        }

        public final void g(Font font) {
            kotlin.jvm.internal.n.h(font, "<set-?>");
            this.f2399d = font;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f2396a) * 31) + Integer.hashCode(this.f2397b)) * 31) + this.f2398c.hashCode()) * 31) + this.f2399d.hashCode();
        }

        public String toString() {
            return "FontRun(start=" + this.f2396a + ", end=" + this.f2397b + ", baseFont=" + this.f2398c + ", targetFont=" + this.f2399d + ")";
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f2400a;

        public b(List runs) {
            kotlin.jvm.internal.n.h(runs, "runs");
            this.f2400a = runs;
        }

        public final List a() {
            return this.f2400a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends j.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f2401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f2402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2403h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Font f2404i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f2405j;

        public c() {
            super(null);
        }

        @Override // H2.j.b
        public int b() {
            return this.f2403h;
        }

        public void l(Font font) {
            kotlin.jvm.internal.n.h(font, "<set-?>");
            this.f2404i = font;
        }

        public void m(int i10) {
            this.f2405j = i10;
        }

        public void n(int i10) {
            this.f2403h = i10;
        }

        public void o(int i10) {
            this.f2402g = i10;
        }

        public void p(int i10) {
            this.f2401f = i10;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f2406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f2407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f2408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f2409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f2410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f2411f;

        public d(int[] glyphIds, float[] baseX, float[] baseY, float[] targetX, float[] targetY, List fontRuns) {
            kotlin.jvm.internal.n.h(glyphIds, "glyphIds");
            kotlin.jvm.internal.n.h(baseX, "baseX");
            kotlin.jvm.internal.n.h(baseY, "baseY");
            kotlin.jvm.internal.n.h(targetX, "targetX");
            kotlin.jvm.internal.n.h(targetY, "targetY");
            kotlin.jvm.internal.n.h(fontRuns, "fontRuns");
            this.f2406a = glyphIds;
            this.f2407b = baseX;
            this.f2408c = baseY;
            this.f2409d = targetX;
            this.f2410e = targetY;
            this.f2411f = fontRuns;
        }

        public final float[] a() {
            return this.f2407b;
        }

        public final float[] b() {
            return this.f2408c;
        }

        public final List c() {
            return this.f2411f;
        }

        public final int[] d() {
            return this.f2406a;
        }

        public final float[] e() {
            return this.f2409d;
        }

        public final float[] f() {
            return this.f2410e;
        }
    }

    public o(Layout layout, r typefaceCache, q qVar) {
        kotlin.jvm.internal.n.h(layout, "layout");
        kotlin.jvm.internal.n.h(typefaceCache, "typefaceCache");
        this.f2381a = typefaceCache;
        this.f2382b = qVar;
        this.f2383c = new TextPaint(layout.getPaint());
        this.f2384d = new TextPaint(layout.getPaint());
        this.f2385e = AbstractC1444s.l();
        this.f2386f = new e(this.f2381a.a());
        this.f2387g = new TextPaint();
        this.f2388h = p079h8.i.b(new p219v8.a() { // from class: H2.l
            @Override // p219v8.a
            public final Object invoke() {
                return o.s();
            }
        });
        this.f2389i = p079h8.i.b(new p219v8.a() { // from class: H2.m
            @Override // p219v8.a
            public final Object invoke() {
                return o.r();
            }
        });
        this.f2390j = new float[20];
        this.f2393m = layout;
        this.f2394n = "";
        p(layout);
    }

    private final void e(Canvas canvas, d dVar, a aVar, int i10, Paint paint) throws IOException {
        Font fontB = this.f2386f.b(aVar.a(), aVar.e(), this.f2391k, this.f2392l);
        p219v8.p pVar = this.f2395o;
        int i11 = 0;
        if (pVar == null) {
            int iB = aVar.b();
            for (int iD = aVar.d(); iD < iB; iD++) {
                int i12 = i11 + 1;
                this.f2390j[i11] = MathUtils.lerp(dVar.a()[iD], dVar.e()[iD], this.f2391k);
                i11 += 2;
                this.f2390j[i12] = MathUtils.lerp(dVar.b()[iD], dVar.f()[iD], this.f2391k);
            }
            canvas.drawGlyphs(dVar.d(), aVar.d(), this.f2390j, 0, aVar.c(), fontB, paint);
            return;
        }
        i().l(fontB);
        i().p(aVar.d());
        i().o(aVar.b() - aVar.d());
        i().h(i10);
        j().set(paint);
        int iD2 = aVar.d();
        int iB2 = aVar.b();
        int i13 = iD2;
        int i14 = 0;
        for (int iD3 = aVar.d(); iD3 < iB2; iD3++) {
            i().n(iD3);
            i().m(dVar.d()[iD3]);
            i().j(MathUtils.lerp(dVar.a()[iD3], dVar.e()[iD3], this.f2391k));
            i().k(MathUtils.lerp(dVar.b()[iD3], dVar.f()[iD3], this.f2391k));
            i().i(paint.getTextSize());
            i().g(paint.getColor());
            pVar.invoke(i(), Float.valueOf(this.f2391k));
            if (i().d() != paint.getTextSize() || i().a() != paint.getColor()) {
                j().setTextSize(i().d());
                j().setColor(i().a());
                canvas.drawGlyphs(dVar.d(), i13, this.f2390j, 0, iD3 - i13, fontB, j());
                i14 = 0;
                i13 = iD3;
            }
            int i15 = i14 + 1;
            this.f2390j[i14] = i().e();
            i14 += 2;
            this.f2390j[i15] = i().f();
        }
        canvas.drawGlyphs(dVar.d(), i13, this.f2390j, 0, aVar.b() - i13, fontB, j());
    }

    private final c i() {
        return (c) this.f2389i.getValue();
    }

    private final TextPaint j() {
        return (TextPaint) this.f2388h.getValue();
    }

    private final void k(Paint paint, Paint paint2, float f10, Paint paint3) {
        paint3.set(paint);
        paint3.setTextSize(MathUtils.lerp(paint.getTextSize(), paint2.getTextSize(), f10));
        paint3.setColor(ColorUtils.blendARGB(paint.getColor(), paint2.getColor(), f10));
        paint3.setStrokeWidth(MathUtils.lerp(paint.getStrokeWidth(), paint2.getStrokeWidth(), f10));
    }

    private final List o(Layout layout, TextPaint textPaint) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int lineCount = layout.getLineCount();
        int i10 = 0;
        while (i10 < lineCount) {
            int lineStart = layout.getLineStart(i10);
            int lineEnd = layout.getLineEnd(i10);
            int i11 = lineEnd - lineStart;
            int i12 = (lineStart + i11) - 1;
            if (i12 > lineStart && i12 < layout.getText().length() && layout.getText().charAt(i12) == '\n') {
                i11--;
            }
            final ArrayList arrayList2 = new ArrayList();
            TextPaint textPaint2 = textPaint;
            TextShaper.shapeText(layout.getText(), lineStart, i11, layout.getTextDirectionHeuristic(), textPaint2, new TextShaper.GlyphsConsumer() { // from class: H2.n
                @Override // android.text.TextShaper.GlyphsConsumer
                public final void accept(int i13, int i14, PositionedGlyphs positionedGlyphs, TextPaint textPaint3) {
                    o.q(arrayList2, i13, i14, positionedGlyphs, textPaint3);
                }
            });
            arrayList.add(arrayList2);
            if (i10 > 0) {
                sb.append("\n");
            }
            CharSequence text = layout.getText();
            kotlin.jvm.internal.n.g(text, "getText(...)");
            sb.append(text.subSequence(lineStart, lineEnd).toString());
            i10++;
            textPaint = textPaint2;
        }
        this.f2394n = sb.toString();
        return arrayList;
    }

    private final void p(Layout layout) {
        o oVar = this;
        List listO = oVar.o(layout, oVar.f2383c);
        List listO2 = oVar.o(layout, oVar.f2384d);
        if (listO.size() != listO2.size()) {
            throw new IllegalArgumentException("The new layout result has different line count.");
        }
        List list = listO;
        Iterator it = list.iterator();
        List list2 = listO2;
        Iterator it2 = list2.iterator();
        int i10 = 10;
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1444s.u(list, 10), AbstractC1444s.u(list2, 10)));
        int iMax = 0;
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            List list3 = (List) it2.next();
            List list4 = (List) next;
            Iterator it3 = list4.iterator();
            List list5 = list3;
            Iterator it4 = list5.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1444s.u(list4, i10), AbstractC1444s.u(list5, i10)));
            while (it3.hasNext() && it4.hasNext()) {
                Object next2 = it3.next();
                PositionedGlyphs positionedGlyphs = (PositionedGlyphs) it4.next();
                PositionedGlyphs positionedGlyphs2 = (PositionedGlyphs) next2;
                if (positionedGlyphs2.glyphCount() != positionedGlyphs.glyphCount()) {
                    throw new IllegalArgumentException(("Inconsistent glyph count at line " + oVar.f2385e.size()).toString());
                }
                int iGlyphCount = positionedGlyphs2.glyphCount();
                int[] iArr = new int[iGlyphCount];
                for (int i11 = 0; i11 < iGlyphCount; i11++) {
                    int glyphId = positionedGlyphs2.getGlyphId(i11);
                    if (glyphId != positionedGlyphs.getGlyphId(i11)) {
                        throw new IllegalArgumentException(("Inconsistent glyph ID at " + i11 + " in line " + oVar.f2385e.size()).toString());
                    }
                    A a10 = A.f21846a;
                    iArr[i11] = glyphId;
                }
                float[] fArr = new float[iGlyphCount];
                for (int i12 = 0; i12 < iGlyphCount; i12++) {
                    fArr[i12] = positionedGlyphs2.getGlyphX(i12);
                }
                float[] fArr2 = new float[iGlyphCount];
                for (int i13 = 0; i13 < iGlyphCount; i13++) {
                    fArr2[i13] = positionedGlyphs2.getGlyphY(i13);
                }
                float[] fArr3 = new float[iGlyphCount];
                for (int i14 = 0; i14 < iGlyphCount; i14++) {
                    fArr3[i14] = positionedGlyphs.getGlyphX(i14);
                }
                float[] fArr4 = new float[iGlyphCount];
                for (int i15 = 0; i15 < iGlyphCount; i15++) {
                    fArr4[i15] = positionedGlyphs.getGlyphY(i15);
                }
                ArrayList arrayList3 = new ArrayList();
                int i16 = iMax;
                if (iGlyphCount != 0) {
                    Font font = positionedGlyphs2.getFont(0);
                    String str = "getFont(...)";
                    kotlin.jvm.internal.n.g(font, "getFont(...)");
                    Font font2 = positionedGlyphs.getFont(0);
                    kotlin.jvm.internal.n.g(font2, "getFont(...)");
                    if (!e.f2347b.a(font, font2)) {
                        throw new IllegalArgumentException(("Cannot interpolate font at 0 (" + font + " vs " + font2 + ")").toString());
                    }
                    int i17 = i16;
                    int i18 = 1;
                    Font font3 = font2;
                    Font font4 = font;
                    int i19 = 0;
                    while (i18 < iGlyphCount) {
                        Font font5 = positionedGlyphs2.getFont(i18);
                        kotlin.jvm.internal.n.g(font5, str);
                        PositionedGlyphs positionedGlyphs3 = positionedGlyphs2;
                        Font font6 = positionedGlyphs.getFont(i18);
                        kotlin.jvm.internal.n.g(font6, str);
                        if (font4 != font5) {
                            if (font3 == font6) {
                                throw new IllegalArgumentException(("Base font has changed at " + i18 + " but target font is unchanged.").toString());
                            }
                            arrayList3.add(new a(i19, i18, font4, font3));
                            int iMax2 = Math.max(i17, i18 - i19);
                            if (!e.f2347b.a(font5, font6)) {
                                throw new IllegalArgumentException(("Cannot interpolate font at " + i18 + " (" + font5 + " vs " + font6 + ")").toString());
                            }
                            font4 = font5;
                            i17 = iMax2;
                            i19 = i18;
                            font3 = font6;
                        } else if (font3 != font6) {
                            throw new IllegalArgumentException(("Base font is unchanged at " + i18 + " but target font has changed.").toString());
                        }
                        i18++;
                        positionedGlyphs2 = positionedGlyphs3;
                        str = str;
                    }
                    arrayList3.add(new a(i19, iGlyphCount, font4, font3));
                    iMax = Math.max(i17, iGlyphCount - i19);
                }
                arrayList2.add(new d(iArr, fArr, fArr2, fArr3, fArr4, arrayList3));
                oVar = this;
                it = it;
                it2 = it2;
                it3 = it3;
                it4 = it4;
                arrayList = arrayList;
            }
            ArrayList arrayList4 = arrayList;
            arrayList4.add(new b(arrayList2));
            arrayList = arrayList4;
            iMax = iMax;
            it = it;
            it2 = it2;
            i10 = 10;
        }
        oVar.f2385e = arrayList;
        int i20 = iMax * 2;
        if (oVar.f2390j.length < i20) {
            oVar.f2390j = new float[i20];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(List list, int i10, int i11, PositionedGlyphs glyphs, TextPaint textPaint) {
        kotlin.jvm.internal.n.h(glyphs, "glyphs");
        kotlin.jvm.internal.n.h(textPaint, "<unused var>");
        list.add(glyphs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c r() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint s() {
        return new TextPaint();
    }

    private final void t(List list, boolean z9) {
        if (list.size() != this.f2385e.size()) {
            throw new IllegalStateException("The new layout result has different line count.");
        }
        List list2 = this.f2385e;
        Iterator it = list2.iterator();
        List list3 = list;
        Iterator it2 = list3.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1444s.u(list2, 10), AbstractC1444s.u(list3, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            List list4 = (List) it2.next();
            List listA = ((b) next).a();
            Iterator it3 = listA.iterator();
            List list5 = list4;
            Iterator it4 = list5.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1444s.u(listA, 10), AbstractC1444s.u(list5, 10)));
            while (it3.hasNext() && it4.hasNext()) {
                Object next2 = it3.next();
                PositionedGlyphs positionedGlyphs = (PositionedGlyphs) it4.next();
                d dVar = (d) next2;
                if (positionedGlyphs.glyphCount() != dVar.d().length) {
                    throw new IllegalArgumentException("The new layout has different glyph count.");
                }
                for (a aVar : dVar.c()) {
                    Font font = positionedGlyphs.getFont(aVar.d());
                    kotlin.jvm.internal.n.g(font, "getFont(...)");
                    int iB = aVar.b();
                    for (int iD = aVar.d(); iD < iB; iD++) {
                        if (positionedGlyphs.getGlyphId(aVar.d()) != dVar.d()[aVar.d()]) {
                            throw new IllegalArgumentException(("The new layout has different glyph ID at " + aVar.d()).toString());
                        }
                        if (font != positionedGlyphs.getFont(iD)) {
                            throw new IllegalArgumentException(("The new layout has different font run. " + font + " vs " + positionedGlyphs.getFont(iD) + " at " + iD).toString());
                        }
                    }
                    if (!e.f2347b.a(font, aVar.a())) {
                        throw new IllegalArgumentException(("New font cannot be interpolated with existing font. " + font + ", " + aVar.a()).toString());
                    }
                    if (z9) {
                        aVar.f(font);
                    } else {
                        aVar.g(font);
                    }
                }
                int i10 = 0;
                if (z9) {
                    int length = dVar.a().length;
                    while (i10 < length) {
                        dVar.a()[i10] = positionedGlyphs.getGlyphX(i10);
                        dVar.b()[i10] = positionedGlyphs.getGlyphY(i10);
                        i10++;
                    }
                } else {
                    int length2 = dVar.a().length;
                    while (i10 < length2) {
                        dVar.e()[i10] = positionedGlyphs.getGlyphX(i10);
                        dVar.f()[i10] = positionedGlyphs.getGlyphY(i10);
                        i10++;
                    }
                }
                arrayList2.add(A.f21846a);
            }
            arrayList.add(arrayList2);
        }
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        kotlin.jvm.internal.n.h(canvas, "canvas");
        k(this.f2383c, this.f2384d, this.f2391k, this.f2387g);
        int i10 = 0;
        for (Object obj : this.f2385e) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            for (d dVar : ((b) obj).a()) {
                canvas.save();
                try {
                    canvas.translate(p.b(this.g(), i10), this.g().getLineBaseline(i10));
                    Iterator it = dVar.c().iterator();
                    while (it.hasNext()) {
                        o oVar = this;
                        canvas2 = canvas;
                        try {
                            oVar.e(canvas2, dVar, (a) it.next(), i10, this.f2387g);
                            this = oVar;
                            canvas = canvas2;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            canvas2.restore();
                            throw th2;
                        }
                    }
                    Canvas canvas3 = canvas;
                    canvas3.restore();
                    this = this;
                    canvas = canvas3;
                } catch (Throwable th3) {
                    th = th3;
                    canvas2 = canvas;
                }
            }
            i10 = i11;
        }
    }

    public final TextPaint f() {
        return this.f2383c;
    }

    public final Layout g() {
        return this.f2393m;
    }

    public final TextPaint h() {
        return this.f2384d;
    }

    public final void l() {
        t(o(g(), this.f2383c), true);
        q qVar = this.f2382b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public final void m() {
        t(o(g(), this.f2384d), false);
        q qVar = this.f2382b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public final void n(Layout value) {
        kotlin.jvm.internal.n.h(value, "value");
        this.f2393m = value;
        p(value);
    }
}
