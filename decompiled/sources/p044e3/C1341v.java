package p044e3;

import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.e;
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

/* JADX INFO: renamed from: e3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1341v extends AbstractC1340u {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final g.i f20149T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final SparseIntArray f20150U;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f20151S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20150U = sparseIntArray;
        sparseIntArray.put(R.id.translation_all, 1);
        sparseIntArray.put(R.id.wallpaper_preview, 2);
        sparseIntArray.put(R.id.wallpaper_surface, 3);
        sparseIntArray.put(R.id.blur_wallpaper_image, 4);
        sparseIntArray.put(R.id.wallpaper_image_preload, 5);
        sparseIntArray.put(R.id.wallpaper_image, 6);
        sparseIntArray.put(R.id.clockHostEditPreview, 7);
        sparseIntArray.put(R.id.clockHostView, 8);
        sparseIntArray.put(R.id.wallpaper_depth_preview, 9);
        sparseIntArray.put(R.id.wallpaper_depth_image, 10);
        sparseIntArray.put(R.id.translation_group, 11);
        sparseIntArray.put(R.id.workspace, 12);
        sparseIntArray.put(R.id.accessibility_layout, 13);
        sparseIntArray.put(R.id.action_done, 14);
        sparseIntArray.put(R.id.action_cancel, 15);
        sparseIntArray.put(R.id.tv_pinch_tip, 16);
        sparseIntArray.put(R.id.btn_wallpaper, 17);
        sparseIntArray.put(R.id.wallpaper_thumbnail, 18);
        sparseIntArray.put(R.id.btn_effects, 19);
        sparseIntArray.put(R.id.shortcut_preview, 20);
        sparseIntArray.put(R.id.fingerprint_view, 21);
        sparseIntArray.put(R.id.preview_dimming_scrim, 22);
    }

    public C1341v(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 23, f20149T, f20150U));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20151S = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20151S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20151S = 1L;
        }
        y();
    }

    private C1341v(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AccessibilityCellLayout) objArr[13], (TextView) objArr[15], (TextView) objArr[14], (ImageView) objArr[4], (ImageButton) objArr[19], (Button) objArr[17], (ClockHostEditPreview) objArr[7], (ClockHostView) objArr[8], (DragLayer) objArr[0], (ImageView) objArr[21], (RoundImageView) objArr[22], (ShortCutPreview) objArr[20], (CardView) objArr[1], (FrameLayout) objArr[11], (TextView) objArr[16], (EditSubsamplingScaleImageView) objArr[10], (CardView) objArr[9], (EditSubsamplingScaleImageView) objArr[6], (ImageView) objArr[5], (CardView) objArr[2], (SurfaceView) objArr[3], (RoundedOverlayImageView) objArr[18], (Workspace) objArr[12]);
        this.f20151S = -1L;
        this.f20125D.setTag(null);
        A(view);
        r();
    }
}
