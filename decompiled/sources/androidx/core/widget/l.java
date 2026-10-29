package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    static class a {
        static void a(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        static void b(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void c(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void d(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    static class b {
        static PrecomputedText.Params a(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void b(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    static class c {
        public static void a(TextView textView, int i10, float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    private static class d implements ActionMode.Callback {
        abstract ActionMode.Callback a();
    }

    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int d(TextView textView) {
        return textView.getMaxLines();
    }

    private static int e(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static z0.c.a f(TextView textView) {
        return new z0.c.a(b.a(textView));
    }

    public static void g(TextView textView, ColorStateList colorStateList) {
        B0.i.e(textView);
        a.b(textView, colorStateList);
    }

    public static void h(TextView textView, PorterDuff.Mode mode) {
        B0.i.e(textView);
        a.c(textView, mode);
    }

    public static void i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void j(TextView textView, int i10) {
        B0.i.c(i10);
        b.b(textView, i10);
    }

    public static void k(TextView textView, int i10) {
        B0.i.c(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void l(TextView textView, int i10) {
        B0.i.c(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void m(TextView textView, int i10, float f10) {
        c.a(textView, i10, f10);
    }

    public static void n(TextView textView, p251z0.c cVar) {
        throw null;
    }

    public static void o(TextView textView, int i10) {
        textView.setTextAppearance(i10);
    }

    public static void p(TextView textView, z0.c.a aVar) {
        textView.setTextDirection(e(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.a(textView, aVar.b());
        a.d(textView, aVar.c());
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        return callback instanceof d ? ((d) callback).a() : callback;
    }

    public static ActionMode.Callback r(TextView textView, ActionMode.Callback callback) {
        return callback;
    }
}
