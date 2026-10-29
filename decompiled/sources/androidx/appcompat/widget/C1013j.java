package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1013j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.f f11097b;

    C1013j(TextView textView) {
        this.f11096a = textView;
        this.f11097b = new R0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f11097b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f11097b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f11096a.getContext().obtainStyledAttributes(attributeSet, p050f.j.f20626g0, i10, 0);
        try {
            int i11 = p050f.j.f20696u0;
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z9) {
        this.f11097b.c(z9);
    }

    void e(boolean z9) {
        this.f11097b.d(z9);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f11097b.e(transformationMethod);
    }
}
