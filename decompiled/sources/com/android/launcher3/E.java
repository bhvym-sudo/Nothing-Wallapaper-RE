package com.android.launcher3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public interface E {
    default void e(View view, C2.b bVar) {
        x2.c.a aVarA = getCellPosMapper().a(bVar);
        m(view, 0, aVarA.f29772c, aVarA.f29770a, aVarA.f29771b, bVar.f597u, bVar.f598v);
    }

    CellLayout f(int i10);

    p233x2.c getCellPosMapper();

    default View.OnLongClickListener getWorkspaceChildOnLongClickListener() {
        return E2.f.f1270a;
    }

    default void h(View view, C2.b bVar) {
        x2.c.a aVarA = getCellPosMapper().a(bVar);
        m(view, 0, aVarA.f29772c, aVarA.f29770a, aVarA.f29771b, bVar.f597u, bVar.f598v);
    }

    void j(h hVar);

    /* JADX WARN: Multi-variable type inference failed */
    default void m(View view, int i10, int i11, int i12, int i13, int i14, int i15) {
        p233x2.b bVar;
        CellLayout cellLayoutF = f(i11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof p233x2.b) {
            bVar = (p233x2.b) layoutParams;
            bVar.e(i12);
            bVar.f(i13);
            bVar.f29762f = i14;
            bVar.f29763g = i15;
        } else {
            bVar = new p233x2.b(i12, i13, i14, i15);
        }
        if (i14 < 0 && i15 < 0) {
            bVar.f29764h = false;
        }
        C2.b bVar2 = (C2.b) view.getTag();
        bVar2.f595s = i12;
        bVar2.f596t = i13;
        p233x2.b bVar3 = bVar;
        if (!cellLayoutF.b(view, -1, bVar2.e(), bVar3, true)) {
            Log.e("Launcher.Workspace", "Failed to add to item at (" + bVar3.a() + "," + bVar3.b() + ") to CellLayout");
        }
        view.setHapticFeedbackEnabled(false);
        view.setOnLongClickListener(getWorkspaceChildOnLongClickListener());
        if (view instanceof h) {
            j((h) view);
        }
    }
}
