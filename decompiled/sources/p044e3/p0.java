package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f20053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RadioButton f20054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f20055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f20056y;

    protected p0(Object obj, View view, int i10, ImageView imageView, RadioButton radioButton, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f20053v = imageView;
        this.f20054w = radioButton;
        this.f20055x = textView;
        this.f20056y = textView2;
    }

    public static p0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static p0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (p0) g.q(layoutInflater, R.layout.shortcut_picker_item, viewGroup, z9, obj);
    }
}
