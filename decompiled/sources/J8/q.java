package J8;

import I8.InterfaceC0880f;

/* JADX INFO: loaded from: classes2.dex */
public interface q extends InterfaceC0880f {

    public static final class a {
        public static /* synthetic */ InterfaceC0880f a(q qVar, p129m8.i iVar, int i10, H8.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                iVar = p129m8.j.f23252q;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = H8.a.SUSPEND;
            }
            return qVar.e(iVar, i10, aVar);
        }
    }

    InterfaceC0880f e(p129m8.i iVar, int i10, H8.a aVar);
}
