package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f12275a;

    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    private z(PointerIcon pointerIcon) {
        this.f12275a = pointerIcon;
    }

    public static z b(Context context, int i10) {
        return new z(a.a(context, i10));
    }

    public Object a() {
        return this.f12275a;
    }
}
