package androidx.slice.widget;

import android.R;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LargeTemplateView extends SliceChildView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private SliceView f13752A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final View f13753B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final c f13754C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final RecyclerView f13755D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f13756E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private d f13757F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ArrayList f13758G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f13759H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int[] f13760I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f13761J;

    public LargeTemplateView(Context context) {
        super(context);
        this.f13758G = new ArrayList();
        this.f13759H = 0;
        this.f13760I = new int[2];
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f13755D = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        c cVar = new c(context);
        this.f13754C = cVar;
        recyclerView.setAdapter(cVar);
        addView(recyclerView);
        View view = new View(getContext());
        this.f13753B = view;
        view.setBackground(k.f(getContext(), R.attr.selectableItemBackground));
        addView(view);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    private void e(int i10) {
        d dVar = this.f13757F;
        if (dVar == null || !dVar.s()) {
            a();
            return;
        }
        int mode = getMode();
        if (mode == 1) {
            this.f13758G = new ArrayList(Arrays.asList((SliceItem) this.f13757F.k().get(0)));
        } else if (this.f13756E || i10 == 0) {
            this.f13758G = this.f13757F.k();
        } else {
            this.f13758G = this.f13757F.f(i10);
        }
        this.f13759H = this.f13757F.i(this.f13758G);
        this.f13754C.q(this.f13758G, this.f13844r, mode);
        f();
    }

    private void f() {
        this.f13755D.setOverScrollMode((this.f13756E && (this.f13759H > getMeasuredHeight())) ? 1 : 2);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void a() {
        this.f13759H = 0;
        this.f13758G.clear();
        this.f13754C.q(null, -1, getMode());
        this.f13757F = null;
    }

    @Override // androidx.slice.widget.SliceChildView
    public void b(int i10, int i11, int i12, int i13) {
        super.b(i10, i11, i12, i13);
        this.f13754C.j(i10, i11, i12, i13);
    }

    public void d(MotionEvent motionEvent) {
        SliceView sliceView = this.f13752A;
        if (sliceView != null && !sliceView.j()) {
            this.f13753B.setPressed(false);
            return;
        }
        this.f13753B.getLocationOnScreen(this.f13760I);
        this.f13753B.getBackground().setHotspot((int) (motionEvent.getRawX() - this.f13760I[0]), (int) (motionEvent.getRawY() - this.f13760I[1]));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13753B.setPressed(true);
        } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
            this.f13753B.setPressed(false);
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getActualHeight() {
        return this.f13759H;
    }

    @Override // androidx.slice.widget.SliceChildView
    public Set<SliceItem> getLoadingActions() {
        return this.f13754C.d();
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getSmallHeight() {
        d dVar = this.f13757F;
        if (dVar == null || !dVar.s()) {
            return 0;
        }
        return this.f13757F.p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SliceView sliceView = (SliceView) getParent();
        this.f13752A = sliceView;
        this.f13754C.n(sliceView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        if (!this.f13756E && this.f13758G.size() > 0 && this.f13759H != size) {
            e(size);
        }
        super.onMeasure(i10, i11);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setActionLoading(SliceItem sliceItem) {
        this.f13754C.a(sliceItem, 0);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setAllowTwoLines(boolean z9) {
        this.f13754C.i(z9);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setLastUpdated(long j9) {
        super.setLastUpdated(j9);
        this.f13754C.k(j9);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setLoadingActions(Set<SliceItem> set) {
        this.f13754C.l(set);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setMaxSmallHeight(int i10) {
        this.f13761J = i10;
        this.f13754C.m(i10);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setMode(int i10) {
        if (this.f13843q != i10) {
            this.f13843q = i10;
            d dVar = this.f13757F;
            if (dVar == null || !dVar.s()) {
                return;
            }
            e(this.f13757F.g(-1, this.f13756E));
        }
    }

    public void setScrollable(boolean z9) {
        if (this.f13756E != z9) {
            this.f13756E = z9;
            d dVar = this.f13757F;
            if (dVar == null || !dVar.s()) {
                return;
            }
            e(this.f13757F.g(-1, this.f13756E));
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setShowLastUpdated(boolean z9) {
        super.setShowLastUpdated(z9);
        this.f13754C.o(z9);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setSliceActionListener(SliceView.d dVar) {
        c cVar = this.f13754C;
        if (cVar != null) {
            cVar.r(null);
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setSliceActions(List<p112l1.d> list) {
        this.f13754C.p(list);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setSliceContent(d dVar) {
        this.f13757F = dVar;
        e(dVar.g(-1, this.f13756E));
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setStyle(j jVar) {
        super.setStyle(jVar);
        this.f13754C.s(jVar);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setTint(int i10) {
        super.setTint(i10);
        e(getMeasuredHeight());
    }
}
