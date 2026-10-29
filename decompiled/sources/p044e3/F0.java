package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppBarLayout f19836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f19837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CoordinatorLayout f19838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RecyclerView f19840z;

    protected F0(Object obj, View view, int i10, AppBarLayout appBarLayout, View view2, CoordinatorLayout coordinatorLayout, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f19836v = appBarLayout;
        this.f19837w = view2;
        this.f19838x = coordinatorLayout;
        this.f19839y = textView;
        this.f19840z = recyclerView;
    }

    public static F0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static F0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (F0) g.q(layoutInflater, R.layout.widget_picker_group_page, viewGroup, z9, obj);
    }
}
