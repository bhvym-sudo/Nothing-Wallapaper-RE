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
public abstract class H0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FrameLayout f19853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f19854w;

    protected H0(Object obj, View view, int i10, FrameLayout frameLayout, ImageView imageView) {
        super(obj, view, i10);
        this.f19853v = frameLayout;
        this.f19854w = imageView;
    }

    public static H0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static H0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (H0) g.q(layoutInflater, R.layout.widget_preview_item, viewGroup, z9, obj);
    }
}
