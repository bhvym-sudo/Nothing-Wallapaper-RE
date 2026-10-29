package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f19893v;

    protected Q(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.f19893v = textView;
    }

    public static Q C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static Q D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (Q) g.q(layoutInflater, R.layout.nt_category_item_foot, viewGroup, z9, obj);
    }
}
