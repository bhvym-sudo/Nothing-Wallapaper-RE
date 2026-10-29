package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1012i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f11094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.a f11095b;

    C1012i(EditText editText) {
        this.f11094a = editText;
        this.f11095b = new R0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f11095b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f11094a.getContext().obtainStyledAttributes(attributeSet, p050f.j.f20626g0, i10, 0);
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

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f11095b.b(inputConnection, editorInfo);
    }

    void e(boolean z9) {
        this.f11095b.c(z9);
    }
}
