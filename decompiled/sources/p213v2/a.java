package p213v2;

import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.CellLayout;
import com.android.launcher3.h;
import com.android.launcher3.views.f;
import java.util.function.Function;
import p253z2.e;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.android.launcher3.dragndrop.a.b, ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ViewGroup f28138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function f28139r;

    public a(ViewGroup viewGroup, Function function) {
        this.f28138q = viewGroup;
        this.f28139r = function;
    }

    protected void a(boolean z9, h.a aVar) {
        for (int i10 = 0; i10 < this.f28138q.getChildCount(); i10++) {
            b((CellLayout) this.f28138q.getChildAt(i10), z9);
        }
    }

    protected final void b(CellLayout cellLayout, boolean z9) {
        cellLayout.setDragAndDropAccessibilityDelegate(z9 ? (c) this.f28139r.apply(cellLayout) : null);
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void n(h.a aVar, e eVar) {
        this.f28138q.setOnHierarchyChangeListener(this);
        a(true, aVar);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        if (view == this.f28138q) {
            b((CellLayout) view2, true);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        if (view == this.f28138q) {
            b((CellLayout) view2, false);
        }
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void t() {
        this.f28138q.setOnHierarchyChangeListener(null);
        a(false, null);
        ((f) f.y(this.f28138q.getContext())).p().A(this);
    }
}
