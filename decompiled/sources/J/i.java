package J;

import androidx.collection.AbstractC1032l;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.x f3444a;

    static {
        g gVar = g.f3410a;
        int iB = gVar.h().b();
        int iB2 = gVar.h().b();
        n.a aVar = n.f3462a;
        AbstractC1457h abstractC1457h = null;
        f3444a = AbstractC1032l.c(iB | (iB2 << 6) | (aVar.b() << 12), h.f3434g.c(gVar.h()), gVar.h().b() | (gVar.g().b() << 6) | (aVar.b() << 12), new h(gVar.h(), gVar.g(), aVar.b(), abstractC1457h), gVar.g().b() | (gVar.h().b() << 6) | (aVar.b() << 12), new h(gVar.g(), gVar.h(), aVar.b(), abstractC1457h));
    }

    public static final androidx.collection.x a() {
        return f3444a;
    }
}
