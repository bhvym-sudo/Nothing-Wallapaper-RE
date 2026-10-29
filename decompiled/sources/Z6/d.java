package Z6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9488i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SnapHelper f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RecyclerView f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f9494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f9495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f9496h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            n.h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (i10 != 0) {
                if (d.this.o()) {
                    d.this.f9492d -= i10;
                } else {
                    d.this.f9492d += i10;
                }
                d.this.j();
                d.this.n();
            }
        }
    }

    public d(SnapHelper snapHelper) {
        n.h(snapHelper, "snapHelper");
        this.f9489a = snapHelper;
        this.f9494f = i.b(new p219v8.a() { // from class: Z6.a
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(d.p(this.f9485q));
            }
        });
        this.f9496h = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        int i10 = this.f9491c;
        if (i10 <= 0) {
            return;
        }
        int iAbs = Math.abs(this.f9492d - (this.f9493e * i10));
        int i11 = this.f9491c;
        if (iAbs >= i11) {
            this.f9493e = this.f9492d / i11;
        }
    }

    private final int m(SnapHelper snapHelper, RecyclerView recyclerView) {
        View viewFindSnapView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindSnapView = snapHelper.findSnapView(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.getPosition(viewFindSnapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        float fE = B8.h.e(Math.abs(this.f9492d - (this.f9493e * this.f9491c)) / this.f9491c, 1.0E-4f);
        s(fE);
        l lVar = this.f9495g;
        if (lVar != null) {
            lVar.f(Float.valueOf(fE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return ((Boolean) this.f9494f.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(d dVar) {
        RecyclerView recyclerView = dVar.f9490b;
        if (recyclerView != null) {
            return H6.d.c(recyclerView);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(d dVar) {
        dVar.s(0.0f);
    }

    private final void s(float f10) {
        RecyclerView recyclerView = this.f9490b;
        T6.a aVar = (T6.a) (recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(this.f9493e - 2) : null);
        if (aVar != null) {
            aVar.a(1.0f);
        }
        RecyclerView recyclerView2 = this.f9490b;
        T6.a aVar2 = (T6.a) (recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(this.f9493e - 1) : null);
        if (aVar2 != null) {
            aVar2.a(1 - f10);
        }
        RecyclerView recyclerView3 = this.f9490b;
        T6.a aVar3 = (T6.a) (recyclerView3 != null ? recyclerView3.findViewHolderForAdapterPosition(this.f9493e) : null);
        if (aVar3 != null) {
            aVar3.a(f10);
        }
        RecyclerView recyclerView4 = this.f9490b;
        T6.a aVar4 = (T6.a) (recyclerView4 != null ? recyclerView4.findViewHolderForAdapterPosition(this.f9493e + 1) : null);
        if (aVar4 != null) {
            aVar4.a(1 - f10);
        }
        RecyclerView recyclerView5 = this.f9490b;
        T6.a aVar5 = (T6.a) (recyclerView5 != null ? recyclerView5.findViewHolderForAdapterPosition(this.f9493e + 2) : null);
        if (aVar5 != null) {
            aVar5.a(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(d dVar) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = dVar.f9490b;
        int itemCount = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount();
        if (dVar.f9493e < 0) {
            dVar.f9493e = 0;
        }
        int i10 = dVar.f9493e;
        if (i10 < itemCount) {
            try {
                RecyclerView recyclerView2 = dVar.f9490b;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(i10);
                }
            } catch (Exception e10) {
                com.nothing.wallpaper.common.log.c.f("ItemAlphaHelper", "updateItemWidth error, exception:" + e10.getMessage());
            }
        }
        dVar.n();
    }

    public final void i(RecyclerView recyclerView) {
        n.h(recyclerView, "recyclerView");
        this.f9490b = recyclerView;
        recyclerView.addOnScrollListener(this.f9496h);
        this.f9489a.attachToRecyclerView(recyclerView);
    }

    public final void k() {
        RecyclerView recyclerView = this.f9490b;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f9496h);
        }
        this.f9490b = null;
        this.f9489a.attachToRecyclerView(null);
    }

    public final int l() {
        RecyclerView recyclerView = this.f9490b;
        if (recyclerView != null) {
            return m(this.f9489a, recyclerView);
        }
        return 0;
    }

    public final void q(int i10, boolean z9) {
        com.nothing.wallpaper.common.log.c.d("ItemAlphaHelper", "setCurrentItemPosition position:" + i10);
        this.f9493e = i10;
        this.f9492d = this.f9491c * i10;
        if (z9) {
            RecyclerView recyclerView = this.f9490b;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i10);
            }
        } else {
            RecyclerView recyclerView2 = this.f9490b;
            if (recyclerView2 != null) {
                recyclerView2.scrollToPosition(i10);
            }
        }
        RecyclerView recyclerView3 = this.f9490b;
        if (recyclerView3 != null) {
            recyclerView3.post(new Runnable() { // from class: Z6.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.r(this.f9486q);
                }
            });
        }
    }

    public final void t(l lVar) {
        this.f9495g = lVar;
    }

    public final void u(int i10) {
        this.f9491c = i10;
        RecyclerView recyclerView = this.f9490b;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: Z6.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.v(this.f9487q);
                }
            });
        }
    }
}
