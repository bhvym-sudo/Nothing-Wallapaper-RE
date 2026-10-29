package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.TransitionImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TransitionImageView f20120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TransitionImageView f20121w;

    protected t0(Object obj, View view, int i10, TransitionImageView transitionImageView, TransitionImageView transitionImageView2) {
        super(obj, view, i10);
        this.f20120v = transitionImageView;
        this.f20121w = transitionImageView2;
    }

    public static t0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static t0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (t0) g.q(layoutInflater, R.layout.shortcut_preview, viewGroup, z9, obj);
    }
}
