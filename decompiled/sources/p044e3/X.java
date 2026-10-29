package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class X extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ImageView f19909A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final V f19910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f19911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f19912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19913y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CardView f19914z;

    protected X(Object obj, View view, int i10, V v9, ConstraintLayout constraintLayout, TextView textView, TextView textView2, CardView cardView, ImageView imageView) {
        super(obj, view, i10);
        this.f19910v = v9;
        this.f19911w = constraintLayout;
        this.f19912x = textView;
        this.f19913y = textView2;
        this.f19914z = cardView;
        this.f19909A = imageView;
    }

    public static X C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static X D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (X) g.q(layoutInflater, R.layout.nt_creative_category_item, viewGroup, z9, obj);
    }
}
