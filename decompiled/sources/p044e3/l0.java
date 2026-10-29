package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.RoundFWDRFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f20020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f20021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f20022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RoundFWDRFrameLayout f20023y;

    protected l0(Object obj, View view, int i10, View view2, ImageView imageView, FrameLayout frameLayout, RoundFWDRFrameLayout roundFWDRFrameLayout) {
        super(obj, view, i10);
        this.f20020v = view2;
        this.f20021w = imageView;
        this.f20022x = frameLayout;
        this.f20023y = roundFWDRFrameLayout;
    }

    public static l0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static l0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (l0) g.q(layoutInflater, R.layout.preview_color_on_home_screen, viewGroup, z9, obj);
    }
}
