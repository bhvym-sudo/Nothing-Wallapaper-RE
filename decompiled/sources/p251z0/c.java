package p251z0;

import B0.d;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f30591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f30592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f30594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f30595e;

        public a(PrecomputedText.Params params) {
            this.f30591a = params.getTextPaint();
            this.f30592b = params.getTextDirection();
            this.f30593c = params.getBreakStrategy();
            this.f30594d = params.getHyphenationFrequency();
            this.f30595e = params;
        }

        public boolean a(a aVar) {
            if (this.f30593c != aVar.b() || this.f30594d != aVar.c() || this.f30591a.getTextSize() != aVar.e().getTextSize() || this.f30591a.getTextScaleX() != aVar.e().getTextScaleX() || this.f30591a.getTextSkewX() != aVar.e().getTextSkewX() || this.f30591a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f30591a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f30591a.getFlags() != aVar.e().getFlags() || !this.f30591a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f30591a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f30591a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f30593c;
        }

        public int c() {
            return this.f30594d;
        }

        public TextDirectionHeuristic d() {
            return this.f30592b;
        }

        public TextPaint e() {
            return this.f30591a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f30592b == aVar.d();
        }

        public int hashCode() {
            return d.b(Float.valueOf(this.f30591a.getTextSize()), Float.valueOf(this.f30591a.getTextScaleX()), Float.valueOf(this.f30591a.getTextSkewX()), Float.valueOf(this.f30591a.getLetterSpacing()), Integer.valueOf(this.f30591a.getFlags()), this.f30591a.getTextLocales(), this.f30591a.getTypeface(), Boolean.valueOf(this.f30591a.isElegantTextHeight()), this.f30592b, Integer.valueOf(this.f30593c), Integer.valueOf(this.f30594d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f30591a.getTextSize());
            sb.append(", textScaleX=" + this.f30591a.getTextScaleX());
            sb.append(", textSkewX=" + this.f30591a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f30591a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f30591a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f30591a.getTextLocales());
            sb.append(", typeface=" + this.f30591a.getTypeface());
            sb.append(", variationSettings=" + this.f30591a.getFontVariationSettings());
            sb.append(", textDir=" + this.f30592b);
            sb.append(", breakStrategy=" + this.f30593c);
            sb.append(", hyphenationFrequency=" + this.f30594d);
            sb.append("}");
            return sb.toString();
        }
    }
}
