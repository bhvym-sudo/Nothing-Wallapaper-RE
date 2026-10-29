package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class i<S> extends q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final Object f16877C = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    static final Object f16878D = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final Object f16879E = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final Object f16880F = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f16881A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private View f16882B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.material.datepicker.a f16884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.material.datepicker.m f16885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l f16886u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.material.datepicker.c f16887v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RecyclerView f16888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private RecyclerView f16889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f16890y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f16891z;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ o f16892q;

        a(o oVar) {
            this.f16892q = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = i.this.s0().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                i.this.v0(this.f16892q.e(iFindLastVisibleItemPosition));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f16894q;

        b(int i10) {
            this.f16894q = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f16889x.smoothScrollToPosition(this.f16894q);
        }
    }

    class c extends C1069a {
        c() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.i0(null);
        }
    }

    class d extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16897a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z9, int i11) {
            super(context, i10, z9);
            this.f16897a = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            if (this.f16897a == 0) {
                iArr[0] = i.this.f16889x.getWidth();
                iArr[1] = i.this.f16889x.getWidth();
            } else {
                iArr[0] = i.this.f16889x.getHeight();
                iArr[1] = i.this.f16889x.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.i.m
        public void a(long j9) {
            if (i.this.f16884s.f().h(j9)) {
                i.h0(i.this);
                throw null;
            }
        }
    }

    class f extends C1069a {
        f() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.H0(false);
        }
    }

    class g extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f16901a = t.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f16902b = t.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.h0(i.this);
                throw null;
            }
        }
    }

    class h extends C1069a {
        h() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.t0(i.this.f16882B.getVisibility() == 0 ? i.this.getString(p225w4.i.f28903z) : i.this.getString(p225w4.i.f28901x));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    class C0460i extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f16905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f16906b;

        C0460i(o oVar, MaterialButton materialButton) {
            this.f16905a = oVar;
            this.f16906b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f16906b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iFindFirstVisibleItemPosition = i10 < 0 ? i.this.s0().findFirstVisibleItemPosition() : i.this.s0().findLastVisibleItemPosition();
            i.this.f16885t = this.f16905a.e(iFindFirstVisibleItemPosition);
            this.f16906b.setText(this.f16905a.f(iFindFirstVisibleItemPosition));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.y0();
        }
    }

    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ o f16909q;

        k(o oVar) {
            this.f16909q = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = i.this.s0().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < i.this.f16889x.getAdapter().getItemCount()) {
                i.this.v0(this.f16909q.e(iFindFirstVisibleItemPosition));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j9);
    }

    static /* synthetic */ com.google.android.material.datepicker.d h0(i iVar) {
        iVar.getClass();
        return null;
    }

    private void k0(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(p225w4.e.f28841t);
        materialButton.setTag(f16880F);
        H.g0(materialButton, new h());
        View viewFindViewById = view.findViewById(p225w4.e.f28843v);
        this.f16890y = viewFindViewById;
        viewFindViewById.setTag(f16878D);
        View viewFindViewById2 = view.findViewById(p225w4.e.f28842u);
        this.f16891z = viewFindViewById2;
        viewFindViewById2.setTag(f16879E);
        this.f16881A = view.findViewById(p225w4.e.f28804D);
        this.f16882B = view.findViewById(p225w4.e.f28846y);
        w0(l.DAY);
        materialButton.setText(this.f16885t.n());
        this.f16889x.addOnScrollListener(new C0460i(oVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f16891z.setOnClickListener(new k(oVar));
        this.f16890y.setOnClickListener(new a(oVar));
    }

    private RecyclerView.ItemDecoration l0() {
        return new g();
    }

    static int q0(Context context) {
        return context.getResources().getDimensionPixelSize(p225w4.c.f28746Q);
    }

    private static int r0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(p225w4.c.f28753X) + resources.getDimensionPixelOffset(p225w4.c.f28754Y) + resources.getDimensionPixelOffset(p225w4.c.f28752W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(p225w4.c.f28748S);
        int i10 = n.f16961u;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(p225w4.c.f28746Q) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(p225w4.c.f28751V)) + resources.getDimensionPixelOffset(p225w4.c.f28744O);
    }

    public static i t0(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.l());
        iVar.setArguments(bundle);
        return iVar;
    }

    private void u0(int i10) {
        this.f16889x.post(new b(i10));
    }

    private void x0() {
        H.g0(this.f16889x, new f());
    }

    @Override // com.google.android.material.datepicker.q
    public boolean d0(p pVar) {
        return super.d0(pVar);
    }

    com.google.android.material.datepicker.a m0() {
        return this.f16884s;
    }

    com.google.android.material.datepicker.c n0() {
        return this.f16887v;
    }

    com.google.android.material.datepicker.m o0() {
        return this.f16885t;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16883r = bundle.getInt("THEME_RES_ID_KEY");
        androidx.appcompat.app.o.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f16884s = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        androidx.appcompat.app.o.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f16885t = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f16883r);
        this.f16887v = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.m mVarM = this.f16884s.m();
        if (com.google.android.material.datepicker.k.C0(contextThemeWrapper)) {
            i10 = p225w4.g.f28869t;
            i11 = 1;
        } else {
            i10 = p225w4.g.f28867r;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(r0(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(p225w4.e.f28847z);
        H.g0(gridView, new c());
        int iJ = this.f16884s.j();
        gridView.setAdapter((ListAdapter) (iJ > 0 ? new com.google.android.material.datepicker.h(iJ) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(mVarM.f16957t);
        gridView.setEnabled(false);
        this.f16889x = (RecyclerView) viewInflate.findViewById(p225w4.e.f28803C);
        this.f16889x.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f16889x.setTag(f16877C);
        o oVar = new o(contextThemeWrapper, null, this.f16884s, null, new e());
        this.f16889x.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(p225w4.f.f28849b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(p225w4.e.f28804D);
        this.f16888w = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f16888w.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f16888w.setAdapter(new u(this));
            this.f16888w.addItemDecoration(l0());
        }
        if (viewInflate.findViewById(p225w4.e.f28841t) != null) {
            k0(viewInflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.C0(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f16889x);
        }
        this.f16889x.scrollToPosition(oVar.g(this.f16885t));
        x0();
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16883r);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16884s);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f16885t);
    }

    public com.google.android.material.datepicker.d p0() {
        return null;
    }

    LinearLayoutManager s0() {
        return (LinearLayoutManager) this.f16889x.getLayoutManager();
    }

    void v0(com.google.android.material.datepicker.m mVar) {
        o oVar = (o) this.f16889x.getAdapter();
        int iG = oVar.g(mVar);
        int iG2 = iG - oVar.g(this.f16885t);
        boolean z9 = Math.abs(iG2) > 3;
        boolean z10 = iG2 > 0;
        this.f16885t = mVar;
        if (z9 && z10) {
            this.f16889x.scrollToPosition(iG - 3);
            u0(iG);
        } else if (!z9) {
            u0(iG);
        } else {
            this.f16889x.scrollToPosition(iG + 3);
            u0(iG);
        }
    }

    void w0(l lVar) {
        this.f16886u = lVar;
        if (lVar == l.YEAR) {
            this.f16888w.getLayoutManager().scrollToPosition(((u) this.f16888w.getAdapter()).d(this.f16885t.f16956s));
            this.f16881A.setVisibility(0);
            this.f16882B.setVisibility(8);
            this.f16890y.setVisibility(8);
            this.f16891z.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f16881A.setVisibility(8);
            this.f16882B.setVisibility(0);
            this.f16890y.setVisibility(0);
            this.f16891z.setVisibility(0);
            v0(this.f16885t);
        }
    }

    void y0() {
        l lVar = this.f16886u;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            w0(l.DAY);
        } else if (lVar == l.DAY) {
            w0(lVar2);
        }
    }
}
