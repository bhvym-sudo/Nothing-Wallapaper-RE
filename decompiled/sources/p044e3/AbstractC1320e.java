package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.pageindicators.PageIndicatorDots;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.TopAreaView;

/* JADX INFO: renamed from: e3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1320e extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FrameLayout f19950v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f19951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ViewPager2 f19952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final PageIndicatorDots f19953y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TopAreaView f19954z;

    protected AbstractC1320e(Object obj, View view, int i10, FrameLayout frameLayout, LinearLayout linearLayout, ViewPager2 viewPager2, PageIndicatorDots pageIndicatorDots, TopAreaView topAreaView) {
        super(obj, view, i10);
        this.f19950v = frameLayout;
        this.f19951w = linearLayout;
        this.f19952x = viewPager2;
        this.f19953y = pageIndicatorDots;
        this.f19954z = topAreaView;
    }

    public static AbstractC1320e C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1320e D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1320e) g.q(layoutInflater, R.layout.clock_host_view_layout, viewGroup, z9, obj);
    }
}
