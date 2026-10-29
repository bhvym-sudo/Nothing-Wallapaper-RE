package com.android.wallpaper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.nothing.wallpaper.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class SeparatedTabLayout extends TabLayout {

    private static class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f16127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16129c;

        private boolean a() {
            return this.f16128b == 1 && this.f16129c == 2;
        }

        private void b(int i10) {
            TabLayout tabLayout = (TabLayout) this.f16127a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            tabLayout.M(tabLayout.B(i10), true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            this.f16128b = this.f16129c;
            this.f16129c = i10;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            if (f10 == 0.0f && a()) {
                b(i10);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (a()) {
                return;
            }
            b(i10);
        }

        private a(TabLayout tabLayout) {
            this.f16128b = 0;
            this.f16129c = 0;
            this.f16127a = new WeakReference(tabLayout);
        }
    }

    private static class b implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f16130a;

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f fVar) {
            ViewPager2 viewPager2 = (ViewPager2) this.f16130a.get();
            if (viewPager2 == null || viewPager2.getCurrentItem() == fVar.g()) {
                return;
            }
            viewPager2.setCurrentItem(fVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f fVar) {
        }

        private b(ViewPager2 viewPager2) {
            this.f16130a = new WeakReference(viewPager2);
        }
    }

    public SeparatedTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public TabLayout.f E() {
        TabLayout.f fVarE = super.E();
        fVarE.f17320i.setBackgroundResource(R.drawable.separated_tabs_ripple_mask);
        return fVarE;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public void setViewPager(ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new a(this));
        h(new b(viewPager2));
    }
}
