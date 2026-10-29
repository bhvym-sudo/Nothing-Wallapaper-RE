package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f20152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f20153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f20154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final FrameLayout f20155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final FrameLayout f20156z;

    protected v0(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        super(obj, view, i10);
        this.f20152v = imageView;
        this.f20153w = imageView2;
        this.f20154x = frameLayout;
        this.f20155y = frameLayout2;
        this.f20156z = frameLayout3;
    }

    public static v0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static v0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (v0) g.q(layoutInflater, R.layout.transition_image_view, viewGroup, z9, obj);
    }
}
