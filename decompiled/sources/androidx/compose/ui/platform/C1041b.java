package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1041b extends AbstractC1039a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11849d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11850e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C1041b f11851f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f11852c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final C1041b a(Locale locale) {
            if (C1041b.f11851f == null) {
                C1041b.f11851f = new C1041b(locale, null);
            }
            C1041b c1041b = C1041b.f11851f;
            kotlin.jvm.internal.n.f(c1041b, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c1041b;
        }

        private a() {
        }
    }

    public /* synthetic */ C1041b(Locale locale, AbstractC1457h abstractC1457h) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f11852c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1045d
    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f11852c;
            if (breakIterator == null) {
                kotlin.jvm.internal.n.r("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f11852c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.n.r("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f11852c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.n.r("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f11852c;
            if (breakIterator == null) {
                kotlin.jvm.internal.n.r("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f11852c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.n.r("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f11852c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.n.r("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC1039a
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f11852c;
        if (breakIterator == null) {
            kotlin.jvm.internal.n.r("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C1041b(Locale locale) {
        i(locale);
    }
}
