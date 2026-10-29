package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TabLayout f17339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewPager2 f17340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f17343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.Adapter f17344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f17346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TabLayout.d f17347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f17348j;

    private class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            d.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            d.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            d.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            d.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            d.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            d.this.c();
        }
    }

    public interface b {
        void a(TabLayout.f fVar, int i10);
    }

    private static class c extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f17350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17352c;

        c(TabLayout tabLayout) {
            this.f17350a = new WeakReference(tabLayout);
            a();
        }

        void a() {
            this.f17352c = 0;
            this.f17351b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            this.f17351b = this.f17352c;
            this.f17352c = i10;
            TabLayout tabLayout = (TabLayout) this.f17350a.get();
            if (tabLayout != null) {
                tabLayout.W(this.f17352c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f17350a.get();
            if (tabLayout != null) {
                int i12 = this.f17352c;
                boolean z9 = true;
                if (i12 == 2 && this.f17351b != 1) {
                    z9 = false;
                }
                if (i12 == 2 && this.f17351b == 0) {
                    z9 = false;
                }
                tabLayout.Q(i10, f10, z9, z9, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            TabLayout tabLayout = (TabLayout) this.f17350a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f17352c;
            tabLayout.M(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f17351b == 0));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    private static class C0464d implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager2 f17353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17354b;

        C0464d(ViewPager2 viewPager2, boolean z9) {
            this.f17353a = viewPager2;
            this.f17354b = z9;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f fVar) {
            this.f17353a.setCurrentItem(fVar.g(), this.f17354b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f fVar) {
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (this.f17345g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter adapter = this.f17340b.getAdapter();
        this.f17344f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f17345g = true;
        c cVar = new c(this.f17339a);
        this.f17346h = cVar;
        this.f17340b.registerOnPageChangeCallback(cVar);
        C0464d c0464d = new C0464d(this.f17340b, this.f17342d);
        this.f17347i = c0464d;
        this.f17339a.h(c0464d);
        if (this.f17341c) {
            a aVar = new a();
            this.f17348j = aVar;
            this.f17344f.registerAdapterDataObserver(aVar);
        }
        c();
        this.f17339a.O(this.f17340b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        RecyclerView.Adapter adapter;
        if (this.f17341c && (adapter = this.f17344f) != null) {
            adapter.unregisterAdapterDataObserver(this.f17348j);
            this.f17348j = null;
        }
        this.f17339a.J(this.f17347i);
        this.f17340b.unregisterOnPageChangeCallback(this.f17346h);
        this.f17347i = null;
        this.f17346h = null;
        this.f17344f = null;
        this.f17345g = false;
    }

    void c() {
        this.f17339a.H();
        RecyclerView.Adapter adapter = this.f17344f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.f fVarE = this.f17339a.E();
                this.f17343e.a(fVarE, i10);
                this.f17339a.k(fVarE, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f17340b.getCurrentItem(), this.f17339a.getTabCount() - 1);
                if (iMin != this.f17339a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f17339a;
                    tabLayout.L(tabLayout.B(iMin));
                }
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z9, b bVar) {
        this(tabLayout, viewPager2, z9, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z9, boolean z10, b bVar) {
        this.f17339a = tabLayout;
        this.f17340b = viewPager2;
        this.f17341c = z9;
        this.f17342d = z10;
        this.f17343e = bVar;
    }
}
