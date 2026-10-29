package R0;

import B0.i;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6937b = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6938c = 0;

    /* JADX INFO: renamed from: R0.a$a, reason: collision with other inner class name */
    private static class C0251a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f6939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f6940b;

        C0251a(EditText editText, boolean z9) {
            this.f6939a = editText;
            g gVar = new g(editText, z9);
            this.f6940b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(R0.b.getInstance());
        }

        @Override // R0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // R0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f6939a, inputConnection, editorInfo);
        }

        @Override // R0.a.b
        void c(boolean z9) {
            this.f6940b.c(z9);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z9);
    }

    public a(EditText editText, boolean z9) {
        i.f(editText, "editText cannot be null");
        this.f6936a = new C0251a(editText, z9);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f6936a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f6936a.b(inputConnection, editorInfo);
    }

    public void c(boolean z9) {
        this.f6936a.c(z9);
    }
}
