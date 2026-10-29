package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClipCardView;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ClipCardView f19805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f19806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f19807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19808y;

    protected B0(Object obj, View view, int i10, ClipCardView clipCardView, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i10);
        this.f19805v = clipCardView;
        this.f19806w = imageView;
        this.f19807x = imageView2;
        this.f19808y = textView;
    }

    public static B0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static B0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (B0) g.q(layoutInflater, R.layout.widget_list_item, viewGroup, z9, obj);
    }
}
