package p044e3;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f19919A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CheckBox f19920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f19921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f19922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f19924z;

    protected Z(Object obj, View view, int i10, CheckBox checkBox, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f19920v = checkBox;
        this.f19921w = frameLayout;
        this.f19922x = imageView;
        this.f19923y = textView;
        this.f19924z = textView2;
        this.f19919A = textView3;
    }

    public static Z C(View view) {
        f.d();
        return D(view, null);
    }

    public static Z D(View view, Object obj) {
        return (Z) g.f(obj, view, R.layout.nt_dialog_customization_reset);
    }
}
