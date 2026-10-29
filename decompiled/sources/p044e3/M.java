package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ImageView f19879A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f19880B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CardView f19881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f19882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f19883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f19884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final FrameLayout f19885z;

    protected M(Object obj, View view, int i10, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, FrameLayout frameLayout, ImageView imageView4, TextView textView) {
        super(obj, view, i10);
        this.f19881v = cardView;
        this.f19882w = imageView;
        this.f19883x = imageView2;
        this.f19884y = imageView3;
        this.f19885z = frameLayout;
        this.f19879A = imageView4;
        this.f19880B = textView;
    }

    public static M C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static M D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (M) g.q(layoutInflater, R.layout.nt_category_item, viewGroup, z9, obj);
    }
}
