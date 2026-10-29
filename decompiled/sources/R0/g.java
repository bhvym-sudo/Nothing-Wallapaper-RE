package R0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final EditText f6957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f6958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.emoji2.text.e.f f6959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6960t = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6961u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6962v = true;

    private static class a extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f6963a;

        a(EditText editText) {
            this.f6963a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            super.b();
            g.b((EditText) this.f6963a.get(), 1);
        }
    }

    g(EditText editText, boolean z9) {
        this.f6957q = editText;
        this.f6958r = z9;
    }

    private androidx.emoji2.text.e.f a() {
        if (this.f6959s == null) {
            this.f6959s = new a(this.f6957q);
        }
        return this.f6959s;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f6962v) {
            return (this.f6958r || androidx.emoji2.text.e.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z9) {
        if (this.f6962v != z9) {
            if (this.f6959s != null) {
                androidx.emoji2.text.e.c().u(this.f6959s);
            }
            this.f6962v = z9;
            if (z9) {
                b(this.f6957q, androidx.emoji2.text.e.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f6957q.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.e.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.e.c().s((Spannable) charSequence, i10, i10 + i12, this.f6960t, this.f6961u);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.c().t(a());
    }
}
