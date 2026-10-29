package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1312a extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RelativeLayout f19925v;

    protected AbstractC1312a(Object obj, View view, int i10, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f19925v = relativeLayout;
    }

    public static AbstractC1312a C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1312a D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1312a) g.q(layoutInflater, R.layout.clock_face_item, viewGroup, z9, obj);
    }
}
