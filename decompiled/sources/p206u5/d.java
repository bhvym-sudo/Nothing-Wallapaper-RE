package p206u5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;
import p181s0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final Drawable a(Resources resources, int i10, Resources.Theme theme) {
        Object objB;
        n.h(resources, "<this>");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(h.e(resources, i10, theme));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        if (q.f(objB)) {
            objB = null;
        }
        return (Drawable) objB;
    }
}
