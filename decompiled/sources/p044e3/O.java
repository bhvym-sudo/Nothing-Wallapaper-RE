package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends g {
    protected O(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static O C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static O D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (O) g.q(layoutInflater, R.layout.nt_category_item_empty, viewGroup, z9, obj);
    }
}
