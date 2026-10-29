package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockSnapshotItemView;

/* JADX INFO: renamed from: e3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1328i extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ClockSnapshotItemView f19993v;

    protected AbstractC1328i(Object obj, View view, int i10, ClockSnapshotItemView clockSnapshotItemView) {
        super(obj, view, i10);
        this.f19993v = clockSnapshotItemView;
    }

    public static AbstractC1328i C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1328i D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1328i) g.q(layoutInflater, R.layout.clock_snapshot_item_view, viewGroup, z9, obj);
    }
}
