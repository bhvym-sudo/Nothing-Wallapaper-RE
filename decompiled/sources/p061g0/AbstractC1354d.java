package p061g0;

import H.i;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import p031d0.l;
import p031d0.n;

/* JADX INFO: renamed from: g0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1354d {
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i10, int i11, r rVar, l lVar, i iVar) {
        float[] fArr = new float[(rVar.a(i11) - rVar.a(i10)) * 4];
        throw null;
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, y yVar, r rVar, l lVar, Matrix matrix, i iVar, i iVar2, boolean z9, boolean z10, boolean z11, boolean z12) {
        builder.reset();
        builder.setMatrix(matrix);
        int i10 = n.i(yVar.c());
        builder.setSelectionRange(i10, n.h(yVar.c()));
        if (z9) {
            c(builder, i10, rVar, lVar, iVar);
        }
        if (z10) {
            n nVarB = yVar.b();
            int i11 = nVarB != null ? n.i(nVarB.m()) : -1;
            n nVarB2 = yVar.b();
            int iH = nVarB2 != null ? n.h(nVarB2.m()) : -1;
            if (i11 >= 0 && i11 < iH) {
                builder.setComposingText(i11, yVar.d().subSequence(i11, iH));
                a(builder, i11, iH, rVar, lVar, iVar);
            }
        }
        if (z11) {
            C1352b.a(builder, iVar2);
        }
        if (z12) {
            C1353c.a(builder, lVar, iVar);
        }
        return builder.build();
    }

    private static final CursorAnchorInfo.Builder c(CursorAnchorInfo.Builder builder, int i10, r rVar, l lVar, i iVar) {
        if (i10 < 0) {
            return builder;
        }
        rVar.a(i10);
        throw null;
    }
}
