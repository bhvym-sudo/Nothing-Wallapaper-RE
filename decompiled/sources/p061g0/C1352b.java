package p061g0;

import H.i;
import I.J;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1352b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1352b f20915a = new C1352b();

    private C1352b() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, i iVar) {
        return builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(J.c(iVar)).setHandwritingBounds(J.c(iVar)).build());
    }
}
