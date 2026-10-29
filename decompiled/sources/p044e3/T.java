package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f19898v;

    protected T(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.f19898v = textView;
    }

    public static T C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static T D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (T) g.q(layoutInflater, R.layout.nt_category_place_holder_item, viewGroup, z9, obj);
    }
}
