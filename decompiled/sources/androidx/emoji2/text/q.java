package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class q implements Spannable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12848q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Spannable f12849r;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        abstract boolean a(CharSequence charSequence);
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.q.b
        boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedText;
        }
    }

    q(Spannable spannable) {
        this.f12849r = spannable;
    }

    private void a() {
        Spannable spannable = this.f12849r;
        if (!this.f12848q && c().a(spannable)) {
            this.f12849r = new SpannableString(spannable);
        }
        this.f12848q = true;
    }

    static b c() {
        return new c();
    }

    Spannable b() {
        return this.f12849r;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f12849r.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f12849r);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f12849r);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f12849r.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f12849r.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f12849r.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f12849r.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f12849r.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f12849r.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f12849r.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f12849r.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f12849r.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f12849r.toString();
    }

    q(CharSequence charSequence) {
        this.f12849r = new SpannableString(charSequence);
    }
}
