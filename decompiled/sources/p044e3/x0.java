package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f20166v;

    protected x0(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.f20166v = textView;
    }

    public static x0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static x0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (x0) g.q(layoutInflater, R.layout.widget_delete_drop_view, viewGroup, z9, obj);
    }
}
