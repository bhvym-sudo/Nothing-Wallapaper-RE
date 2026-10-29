package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.f;
import androidx.databinding.g;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.individual.IndividualPickerFrame;
import com.nothing.wallpaper.widget.RoundCoordinatorLayout;
import com.nothing.wallpaper.widget.VerticallyRecyclerView;

/* JADX INFO: renamed from: e3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1323f0 extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final IndividualPickerFrame f19961A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f19962B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Toolbar f19963C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppBarLayout f19964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RoundCoordinatorLayout f19965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final VerticallyRecyclerView f19966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final FrameLayout f19968z;

    protected AbstractC1323f0(Object obj, View view, int i10, AppBarLayout appBarLayout, RoundCoordinatorLayout roundCoordinatorLayout, VerticallyRecyclerView verticallyRecyclerView, TextView textView, FrameLayout frameLayout, IndividualPickerFrame individualPickerFrame, View view2, Toolbar toolbar) {
        super(obj, view, i10);
        this.f19964v = appBarLayout;
        this.f19965w = roundCoordinatorLayout;
        this.f19966x = verticallyRecyclerView;
        this.f19967y = textView;
        this.f19968z = frameLayout;
        this.f19961A = individualPickerFrame;
        this.f19962B = view2;
        this.f19963C = toolbar;
    }

    public static AbstractC1323f0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1323f0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1323f0) g.q(layoutInflater, R.layout.nt_fragment_category_selector, viewGroup, z9, obj);
    }
}
