package p044e3;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.g;
import com.android.wallpaper.picker.FixedWidthDisplayRatioFrameLayout;

/* JADX INFO: renamed from: e3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1342w extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f20157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FixedWidthDisplayRatioFrameLayout f20158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f20159x;

    protected AbstractC1342w(Object obj, View view, int i10, View view2, FixedWidthDisplayRatioFrameLayout fixedWidthDisplayRatioFrameLayout, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f20157v = view2;
        this.f20158w = fixedWidthDisplayRatioFrameLayout;
        this.f20159x = frameLayout;
    }
}
