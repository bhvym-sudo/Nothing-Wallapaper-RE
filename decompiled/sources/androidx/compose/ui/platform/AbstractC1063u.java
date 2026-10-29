package androidx.compose.ui.platform;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1063u {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.u$a */
    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f12001r = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(W.B b10) {
            boolean z9;
            p011b0.g gVarY = b10.y();
            if (gVarY != null) {
                z9 = gVarY.q() && gVarY.b(p011b0.m.f14629a.g());
            }
            return Boolean.valueOf(z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(p011b0.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof p011b0.a)) {
            return false;
        }
        p011b0.a aVar2 = (p011b0.a) obj;
        if (!kotlin.jvm.internal.n.d(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(p011b0.j jVar) {
        return !jVar.n().b(p011b0.m.f14629a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(p011b0.j jVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        if (gVarW.b(mVar.g()) && !kotlin.jvm.internal.n.d(p011b0.h.a(jVar.w(), mVar.i()), Boolean.TRUE)) {
            return true;
        }
        W.B bJ = j(jVar.q(), a.f12001r);
        if (bJ != null) {
            p011b0.g gVarY = bJ.y();
            if (!(gVarY != null ? kotlin.jvm.internal.n.d(p011b0.h.a(gVarY, mVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W.B j(W.B b10, p219v8.l lVar) {
        for (W.B bY = b10.Y(); bY != null; bY = bY.Y()) {
            if (((Boolean) lVar.f(bY)).booleanValue()) {
                return bY;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(p011b0.j jVar) {
        return jVar.p().getLayoutDirection() == p111l0.s.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(p011b0.j jVar, p011b0.g gVar) {
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            if (!jVar.n().b((p011b0.q) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }
}
