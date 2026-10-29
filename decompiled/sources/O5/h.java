package O5;

import android.view.View;
import kotlin.jvm.internal.n;
import p079h8.o;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5903a = new h();

    private h() {
    }

    public final o a(View view) {
        n.h(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new o(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }
}
