package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.android.launcher3.Workspace;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.graphics.LockScreenPreviewLayout;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPreview;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ClockHostView f19855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LockScreenPreviewLayout f19856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f19857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ShortCutPreview f19858y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Workspace f19859z;

    protected I(Object obj, View view, int i10, ClockHostView clockHostView, LockScreenPreviewLayout lockScreenPreviewLayout, ImageView imageView, ShortCutPreview shortCutPreview, Workspace workspace) {
        super(obj, view, i10);
        this.f19855v = clockHostView;
        this.f19856w = lockScreenPreviewLayout;
        this.f19857x = imageView;
        this.f19858y = shortCutPreview;
        this.f19859z = workspace;
    }

    public static I C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static I D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (I) g.q(layoutInflater, R.layout.lock_screen_preview_layout, viewGroup, z9, obj);
    }
}
