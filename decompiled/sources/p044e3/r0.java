package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppBarLayout f20084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f20085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RecyclerView f20086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f20087y;

    protected r0(Object obj, View view, int i10, AppBarLayout appBarLayout, View view2, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f20084v = appBarLayout;
        this.f20085w = view2;
        this.f20086x = recyclerView;
        this.f20087y = textView;
    }

    public static r0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static r0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (r0) g.q(layoutInflater, R.layout.shortcut_picker_page, viewGroup, z9, obj);
    }
}
