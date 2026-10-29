package I8;

import F8.InterfaceC0846x0;

/* JADX INFO: renamed from: I8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0886l {
    public static final InterfaceC0880f a(InterfaceC0880f interfaceC0880f, int i10, H8.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != H8.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = H8.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        H8.a aVar2 = aVar;
        if (interfaceC0880f instanceof J8.q) {
            return J8.q.a.a((J8.q) interfaceC0880f, null, i11, aVar2, 1, null);
        }
        return new J8.h(interfaceC0880f, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC0880f b(InterfaceC0880f interfaceC0880f, int i10, H8.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = H8.a.SUSPEND;
        }
        return AbstractC0882h.c(interfaceC0880f, i10, aVar);
    }

    private static final void c(p129m8.i iVar) {
        if (iVar.b(InterfaceC0846x0.f1901e) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
    }

    public static final InterfaceC0880f d(InterfaceC0880f interfaceC0880f) {
        return b(interfaceC0880f, -1, null, 2, null);
    }

    public static final InterfaceC0880f e(InterfaceC0880f interfaceC0880f, p129m8.i iVar) {
        c(iVar);
        if (kotlin.jvm.internal.n.d(iVar, p129m8.j.f23252q)) {
            return interfaceC0880f;
        }
        if (interfaceC0880f instanceof J8.q) {
            return J8.q.a.a((J8.q) interfaceC0880f, iVar, 0, null, 6, null);
        }
        return new J8.h(interfaceC0880f, iVar, 0, null, 12, null);
    }
}
