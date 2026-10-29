package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.pageindicators.PageIndicatorDots;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.NTPageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final NTPageView f19819A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ViewPager2 f19820B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f19821C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Guideline f19822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f19823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PageIndicatorDots f19824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Guideline f19825y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Guideline f19826z;

    protected D0(Object obj, View view, int i10, Guideline guideline, ImageView imageView, PageIndicatorDots pageIndicatorDots, Guideline guideline2, Guideline guideline3, NTPageView nTPageView, ViewPager2 viewPager2, TextView textView) {
        super(obj, view, i10);
        this.f19822v = guideline;
        this.f19823w = imageView;
        this.f19824x = pageIndicatorDots;
        this.f19825y = guideline2;
        this.f19826z = guideline3;
        this.f19819A = nTPageView;
        this.f19820B = viewPager2;
        this.f19821C = textView;
    }

    public static D0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static D0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (D0) g.q(layoutInflater, R.layout.widget_picker_details, viewGroup, z9, obj);
    }
}
