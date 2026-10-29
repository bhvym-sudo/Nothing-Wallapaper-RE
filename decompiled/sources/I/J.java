package I;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static final Rect a(H.i iVar) {
        return new Rect((int) iVar.f(), (int) iVar.i(), (int) iVar.g(), (int) iVar.c());
    }

    public static final Rect b(p111l0.o oVar) {
        return new Rect(oVar.f(), oVar.h(), oVar.g(), oVar.d());
    }

    public static final RectF c(H.i iVar) {
        return new RectF(iVar.f(), iVar.i(), iVar.g(), iVar.c());
    }

    public static final p111l0.o d(Rect rect) {
        return new p111l0.o(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final H.i e(Rect rect) {
        return new H.i(rect.left, rect.top, rect.right, rect.bottom);
    }
}
