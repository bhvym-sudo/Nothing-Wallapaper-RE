package p233x2;

import C2.b;
import F2.C0795b;
import android.view.View;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C0795b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f29755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, b info, c.a cellPos) {
        super(cellPos.f29770a, cellPos.f29771b, info.f597u, info.f598v);
        n.h(info, "info");
        n.h(cellPos, "cellPos");
        this.f29755e = view;
        this.f29756f = cellPos.f29772c;
    }

    @Override // F2.C0795b
    public String toString() {
        return "CellInfo(cell=" + this.f29755e + ", screenId=" + this.f29756f + ")";
    }
}
