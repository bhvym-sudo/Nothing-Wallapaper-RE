package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f19795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f19796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f19797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19798y;

    protected A(Object obj, View view, int i10, ImageView imageView, ConstraintLayout constraintLayout, View view2, TextView textView) {
        super(obj, view, i10);
        this.f19795v = imageView;
        this.f19796w = constraintLayout;
        this.f19797x = view2;
        this.f19798y = textView;
    }

    public static A C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static A D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (A) g.q(layoutInflater, R.layout.item_creative_prompt_image, viewGroup, z9, obj);
    }
}
