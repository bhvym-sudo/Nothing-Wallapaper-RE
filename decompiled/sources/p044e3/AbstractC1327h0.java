package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.RoundImageView;

/* JADX INFO: renamed from: e3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1327h0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RoundImageView f19992v;

    protected AbstractC1327h0(Object obj, View view, int i10, RoundImageView roundImageView) {
        super(obj, view, i10);
        this.f19992v = roundImageView;
    }

    public static AbstractC1327h0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1327h0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1327h0) g.q(layoutInflater, R.layout.nt_photo_view, viewGroup, z9, obj);
    }
}
