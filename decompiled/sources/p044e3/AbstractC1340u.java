package p044e3;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.android.launcher3.Workspace;
import com.android.launcher3.dragndrop.DragLayer;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.crop.view.EditSubsamplingScaleImageView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.AccessibilityCellLayout;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPreview;
import com.nothing.wallpaper.widget.RoundImageView;
import com.nothing.wallpaper.widget.RoundedOverlayImageView;

/* JADX INFO: renamed from: e3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1340u extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Button f20122A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ClockHostEditPreview f20123B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ClockHostView f20124C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final DragLayer f20125D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f20126E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RoundImageView f20127F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ShortCutPreview f20128G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final CardView f20129H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final FrameLayout f20130I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final TextView f20131J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final EditSubsamplingScaleImageView f20132K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final CardView f20133L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final EditSubsamplingScaleImageView f20134M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ImageView f20135N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final CardView f20136O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final SurfaceView f20137P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RoundedOverlayImageView f20138Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Workspace f20139R;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AccessibilityCellLayout f20140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f20141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f20142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f20143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageButton f20144z;

    protected AbstractC1340u(Object obj, View view, int i10, AccessibilityCellLayout accessibilityCellLayout, TextView textView, TextView textView2, ImageView imageView, ImageButton imageButton, Button button, ClockHostEditPreview clockHostEditPreview, ClockHostView clockHostView, DragLayer dragLayer, ImageView imageView2, RoundImageView roundImageView, ShortCutPreview shortCutPreview, CardView cardView, FrameLayout frameLayout, TextView textView3, EditSubsamplingScaleImageView editSubsamplingScaleImageView, CardView cardView2, EditSubsamplingScaleImageView editSubsamplingScaleImageView2, ImageView imageView3, CardView cardView3, SurfaceView surfaceView, RoundedOverlayImageView roundedOverlayImageView, Workspace workspace) {
        super(obj, view, i10);
        this.f20140v = accessibilityCellLayout;
        this.f20141w = textView;
        this.f20142x = textView2;
        this.f20143y = imageView;
        this.f20144z = imageButton;
        this.f20122A = button;
        this.f20123B = clockHostEditPreview;
        this.f20124C = clockHostView;
        this.f20125D = dragLayer;
        this.f20126E = imageView2;
        this.f20127F = roundImageView;
        this.f20128G = shortCutPreview;
        this.f20129H = cardView;
        this.f20130I = frameLayout;
        this.f20131J = textView3;
        this.f20132K = editSubsamplingScaleImageView;
        this.f20133L = cardView2;
        this.f20134M = editSubsamplingScaleImageView2;
        this.f20135N = imageView3;
        this.f20136O = cardView3;
        this.f20137P = surfaceView;
        this.f20138Q = roundedOverlayImageView;
        this.f20139R = workspace;
    }

    public static AbstractC1340u C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1340u D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1340u) g.q(layoutInflater, R.layout.fragment_lock_screen_main, viewGroup, z9, obj);
    }
}
