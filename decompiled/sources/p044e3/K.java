package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.PhotoCoverView;
import com.nothing.wallpaper.widget.RoundImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f19867A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f19868B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final PhotoCoverView f19869C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CardView f19870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f19871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f19872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RoundImageView f19873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinearLayout f19874z;

    protected K(Object obj, View view, int i10, CardView cardView, TextView textView, LinearLayout linearLayout, RoundImageView roundImageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, PhotoCoverView photoCoverView) {
        super(obj, view, i10);
        this.f19870v = cardView;
        this.f19871w = textView;
        this.f19872x = linearLayout;
        this.f19873y = roundImageView;
        this.f19874z = linearLayout2;
        this.f19867A = textView2;
        this.f19868B = textView3;
        this.f19869C = photoCoverView;
    }

    public static K C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static K D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (K) g.q(layoutInflater, R.layout.my_photo_categrory_view, viewGroup, z9, obj);
    }
}
