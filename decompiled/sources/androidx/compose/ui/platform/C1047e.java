package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1047e extends AbstractC1039a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11878d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11879e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C1047e f11880f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f11881c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final C1047e a(Locale locale) {
            if (C1047e.f11880f == null) {
                C1047e.f11880f = new C1047e(locale, null);
            }
            C1047e c1047e = C1047e.f11880f;
            kotlin.jvm.internal.n.f(c1047e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c1047e;
        }

        private a() {
        }
    }

    public /* synthetic */ C1047e(Locale locale, AbstractC1457h abstractC1457h) {
        this(locale);
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || !j(i10 - 1)) {
            return false;
        }
        return i10 == d().length() || !j(i10);
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        if (j(i10)) {
            return i10 == 0 || !j(i10 - 1);
        }
        return false;
    }

    private final void l(Locale locale) {
        this.f11881c = BreakIterator.getWordInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1045d
    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f11881c;
            if (breakIterator == null) {
                kotlin.jvm.internal.n.r("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f11881c;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.n.r("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i10, iFollowing);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1045d
    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f11881c;
            if (breakIterator == null) {
                kotlin.jvm.internal.n.r("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f11881c;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.n.r("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i10);
    }

    @Override // androidx.compose.ui.platform.AbstractC1039a
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f11881c;
        if (breakIterator == null) {
            kotlin.jvm.internal.n.r("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C1047e(Locale locale) {
        l(locale);
    }
}
