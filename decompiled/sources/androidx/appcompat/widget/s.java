package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f11136l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f11137m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f11145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f11146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f11147j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11138a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11139b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11140c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f11141d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11142e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f11143f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11144g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f11148k = new c();

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class b extends d {
        b() {
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.s.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.s.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        abstract boolean b(TextView textView);
    }

    s(TextView textView) {
        this.f11146i = textView;
        this.f11147j = textView.getContext();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f11138a = 0;
        this.f11141d = -1.0f;
        this.f11142e = -1.0f;
        this.f11140c = -1.0f;
        this.f11143f = new int[0];
        this.f11139b = false;
    }

    private int e(RectF rectF) {
        int length = this.f11143f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f11143f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f11143f[i12];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f11137m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f11137m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f11146i.getPaint().getTextSize()) {
            this.f11146i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f11146i.isInLayout();
            if (this.f11146i.getLayout() != null) {
                this.f11139b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f11146i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f11146i.forceLayout();
                } else {
                    this.f11146i.requestLayout();
                }
                this.f11146i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f11138a == 1) {
            if (!this.f11144g || this.f11143f.length == 0) {
                int iFloor = ((int) Math.floor((this.f11142e - this.f11141d) / this.f11140c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f11141d + (i10 * this.f11140c));
                }
                this.f11143f = b(iArr);
            }
            this.f11139b = true;
        } else {
            this.f11139b = false;
        }
        return this.f11139b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f11143f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f11143f;
        int length = iArr.length;
        boolean z9 = length > 0;
        this.f11144g = z9;
        if (z9) {
            this.f11138a = 1;
            this.f11141d = iArr[0];
            this.f11142e = iArr[length - 1];
            this.f11140c = -1.0f;
        }
        return z9;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f11146i.getText();
        TransformationMethod transformationMethod = this.f11146i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f11146i)) != null) {
            text = transformation;
        }
        int maxLines = this.f11146i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f11146i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f11146i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f11138a = 1;
        this.f11141d = f10;
        this.f11142e = f11;
        this.f11140c = f12;
        this.f11144g = false;
    }

    void a() {
        if (n()) {
            if (this.f11139b) {
                if (this.f11146i.getMeasuredHeight() <= 0 || this.f11146i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f11148k.b(this.f11146i) ? 1048576 : (this.f11146i.getMeasuredWidth() - this.f11146i.getTotalPaddingLeft()) - this.f11146i.getTotalPaddingRight();
                int height = (this.f11146i.getHeight() - this.f11146i.getCompoundPaddingBottom()) - this.f11146i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f11136l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f11146i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f11139b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f11146i, this.f11145h, this.f11148k);
    }

    int f() {
        return Math.round(this.f11142e);
    }

    int g() {
        return Math.round(this.f11141d);
    }

    int h() {
        return Math.round(this.f11140c);
    }

    int[] i() {
        return this.f11143f;
    }

    int j() {
        return this.f11138a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f11145h;
        if (textPaint == null) {
            this.f11145h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f11145h.set(this.f11146i.getPaint());
        this.f11145h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f11138a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f11147j;
        int[] iArr = p050f.j.f20626g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f11146i;
        androidx.core.view.H.e0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = p050f.j.f20651l0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f11138a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = p050f.j.f20646k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = p050f.j.f20636i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = p050f.j.f20631h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = p050f.j.f20641j0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f11138a = 0;
            return;
        }
        if (this.f11138a == 1) {
            if (!this.f11144g) {
                DisplayMetrics displayMetrics = this.f11147j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f11147j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f11147j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f11143f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f11144g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f11147j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f11147j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
