package G;

import W.AbstractC0967i;
import W.B;
import W.U;
import W.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final o b(androidx.compose.ui.focus.k kVar) {
        B bO0;
        d0 d0VarX;
        g focusOwner;
        U uJ = kVar.z().J();
        if (uJ == null || (bO0 = uJ.o0()) == null || (d0VarX = bO0.X()) == null || (focusOwner = d0VarX.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.i();
    }

    public static final void c(androidx.compose.ui.focus.k kVar) {
        AbstractC0967i.i(kVar).getFocusOwner().a(kVar);
    }

    public static final o d(androidx.compose.ui.focus.k kVar) {
        return AbstractC0967i.i(kVar).getFocusOwner().i();
    }
}
