package I;

import android.graphics.Canvas;

/* JADX INFO: renamed from: I.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Canvas f2690a = new Canvas();

    public static final InterfaceC0869m a(Canvas canvas) {
        C0858b c0858b = new C0858b();
        c0858b.p(canvas);
        return c0858b;
    }

    public static final Canvas c(InterfaceC0869m interfaceC0869m) {
        kotlin.jvm.internal.n.f(interfaceC0869m, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C0858b) interfaceC0869m).o();
    }
}
