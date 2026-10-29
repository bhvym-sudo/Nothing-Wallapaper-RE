package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1043c extends AbstractC1039a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11854c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C1043c f11855d;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final C1043c a() {
            if (C1043c.f11855d == null) {
                C1043c.f11855d = new C1043c(null);
            }
            C1043c c1043c = C1043c.f11855d;
            kotlin.jvm.internal.n.f(c1043c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c1043c;
        }

        private a() {
        }
    }

    public /* synthetic */ C1043c(AbstractC1457h abstractC1457h) {
        this();
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || d().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == d().length() || d().charAt(i10) == '\n';
    }

    private final boolean j(int i10) {
        if (d().charAt(i10) != '\n') {
            return i10 == 0 || d().charAt(i10 - 1) == '\n';
        }
        return false;
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
        while (i10 < length && d().charAt(i10) == '\n' && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
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
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }

    private C1043c() {
    }
}
