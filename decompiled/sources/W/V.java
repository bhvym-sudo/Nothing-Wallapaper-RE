package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C.c.AbstractC0022c b(InterfaceC0966h interfaceC0966h, int i10, int i11) {
        C.c.AbstractC0022c abstractC0022cI = interfaceC0966h.z().I();
        if (abstractC0022cI == null || (abstractC0022cI.H() & i10) == 0) {
            return null;
        }
        while (abstractC0022cI != null) {
            int iL = abstractC0022cI.L();
            if ((iL & i11) != 0) {
                return null;
            }
            if ((iL & i10) != 0) {
                return abstractC0022cI;
            }
            abstractC0022cI = abstractC0022cI.I();
        }
        return null;
    }
}
