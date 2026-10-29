package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f10802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f10803c;

    private J(Context context, TypedArray typedArray) {
        this.f10801a = context;
        this.f10802b = typedArray;
    }

    public static J t(Context context, int i10, int[] iArr) {
        return new J(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static J u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new J(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static J v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new J(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z9) {
        return this.f10802b.getBoolean(i10, z9);
    }

    public int b(int i10, int i11) {
        return this.f10802b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f10802b.hasValue(i10) || (resourceId = this.f10802b.getResourceId(i10, 0)) == 0 || (colorStateListA = p060g.a.a(this.f10801a, resourceId)) == null) ? this.f10802b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f10802b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f10802b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f10802b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f10802b.hasValue(i10) || (resourceId = this.f10802b.getResourceId(i10, 0)) == 0) ? this.f10802b.getDrawable(i10) : p060g.a.b(this.f10801a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f10802b.hasValue(i10) || (resourceId = this.f10802b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1011h.b().d(this.f10801a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f10802b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, s0.h.e eVar) {
        int resourceId = this.f10802b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f10803c == null) {
            this.f10803c = new TypedValue();
        }
        return p181s0.h.h(this.f10801a, resourceId, this.f10803c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f10802b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f10802b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f10802b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f10802b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f10802b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f10802b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f10802b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f10802b;
    }

    public boolean s(int i10) {
        return this.f10802b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f10802b.peekValue(i10);
    }

    public void x() {
        this.f10802b.recycle();
    }
}
