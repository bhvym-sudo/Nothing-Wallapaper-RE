package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1333m extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f20024A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f20025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f20026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f20027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f20028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f20029z;

    protected AbstractC1333m(Object obj, View view, int i10, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i10);
        this.f20025v = imageView;
        this.f20026w = textView;
        this.f20027x = textView2;
        this.f20028y = textView3;
        this.f20029z = textView4;
        this.f20024A = textView5;
    }

    public static AbstractC1333m C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1333m D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1333m) g.q(layoutInflater, R.layout.dialog_creative_policy, viewGroup, z9, obj);
    }
}
