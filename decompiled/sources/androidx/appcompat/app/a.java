package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public static abstract class b {
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z9);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z9);

    public abstract void s(boolean z9);

    public abstract void t(boolean z9);

    public abstract void u(CharSequence charSequence);

    public abstract void v(CharSequence charSequence);

    public androidx.appcompat.view.b w(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0360a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10093a;

        public C0360a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10093a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p050f.j.f20690t);
            this.f10093a = typedArrayObtainStyledAttributes.getInt(p050f.j.f20695u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0360a(int i10, int i11) {
            super(i10, i11);
            this.f10093a = 8388627;
        }

        public C0360a(C0360a c0360a) {
            super((ViewGroup.MarginLayoutParams) c0360a);
            this.f10093a = 0;
            this.f10093a = c0360a.f10093a;
        }

        public C0360a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10093a = 0;
        }
    }
}
