package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f19809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f19810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f19811x;

    protected C(Object obj, View view, int i10, View view2, ConstraintLayout constraintLayout, ImageView imageView) {
        super(obj, view, i10);
        this.f19809v = view2;
        this.f19810w = constraintLayout;
        this.f19811x = imageView;
    }

    public static C C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static C D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (C) g.q(layoutInflater, R.layout.item_creative_result, viewGroup, z9, obj);
    }
}
