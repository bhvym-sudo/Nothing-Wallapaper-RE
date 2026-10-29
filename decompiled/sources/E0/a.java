package E0;

import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f1218a = new String[0];

    /* JADX INFO: renamed from: E0.a$a, reason: collision with other inner class name */
    private static class C0042a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        C0042a.a(editorInfo, charSequence, 0);
    }
}
