package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1319d0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f19947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f19948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f19949x;

    protected AbstractC1319d0(Object obj, View view, int i10, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f19947v = imageView;
        this.f19948w = textView;
        this.f19949x = textView2;
    }

    public static AbstractC1319d0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1319d0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1319d0) g.q(layoutInflater, R.layout.nt_effect_button, viewGroup, z9, obj);
    }
}
