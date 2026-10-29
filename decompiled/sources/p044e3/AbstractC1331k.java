package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1331k extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RecyclerView f20013v;

    protected AbstractC1331k(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f20013v = recyclerView;
    }

    public static AbstractC1331k C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1331k D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1331k) g.q(layoutInflater, R.layout.clock_snapshot_list_view, viewGroup, z9, obj);
    }
}
