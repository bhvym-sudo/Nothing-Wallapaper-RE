package p251z0;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        static String b(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }

    public static String b(Spanned spanned, int i10) {
        return a.b(spanned, i10);
    }
}
