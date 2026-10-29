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
public abstract class n0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f20037v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f20038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RoundFWDRFrameLayout f20039x;

    protected n0(Object obj, View view, int i10, ImageView imageView, FrameLayout frameLayout, RoundFWDRFrameLayout roundFWDRFrameLayout) {
        super(obj, view, i10);
        this.f20037v = imageView;
        this.f20038w = frameLayout;
        this.f20039x = roundFWDRFrameLayout;
    }

    public static n0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static n0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (n0) g.q(layoutInflater, R.layout.preview_color_on_picture_screen, viewGroup, z9, obj);
    }
}
