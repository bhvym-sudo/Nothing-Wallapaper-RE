package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1039a implements InterfaceC1045d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f11846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f11847b = new int[2];

    protected final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f11847b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    protected final String d() {
        String str = this.f11846a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.n.r("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.f11846a = str;
    }
}
