package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.view.InterceptFrameLayout;
import com.nothing.wallpaper.picker.creative.view.MaskHollowView;
import com.nothing.wallpaper.picker.creative.view.NTPageIndicator;
import com.nothing.wallpaper.widget.AspectRatioImageView;

/* JADX INFO: loaded from: classes.dex */
public class r extends AbstractC1337q {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final g.i f20081Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final SparseIntArray f20082R;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f20083P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20082R = sparseIntArray;
        sparseIntArray.put(R.id.iv_blur_placeholder, 1);
        sparseIntArray.put(R.id.layout_subject_prompt, 2);
        sparseIntArray.put(R.id.iv_subject_prompt, 3);
        sparseIntArray.put(R.id.layout_style_prompt, 4);
        sparseIntArray.put(R.id.iv_style_prompt, 5);
        sparseIntArray.put(R.id.iv_hollow_mask, 6);
        sparseIntArray.put(R.id.layout_generate_result, 7);
        sparseIntArray.put(R.id.rv_prompt_generate_result, 8);
        sparseIntArray.put(R.id.iv_selected_frame, 9);
        sparseIntArray.put(R.id.lottie_processing, 10);
        sparseIntArray.put(R.id.lottie_processing_loop, 11);
        sparseIntArray.put(R.id.appbar_layout, 12);
        sparseIntArray.put(R.id.toolbar, 13);
        sparseIntArray.put(R.id.custom_toolbar_title, 14);
        sparseIntArray.put(R.id.layout_bottom, 15);
        sparseIntArray.put(R.id.page_indicator, 16);
        sparseIntArray.put(R.id.btn_set_as_wallpaper, 17);
        sparseIntArray.put(R.id.btn_regenerate, 18);
        sparseIntArray.put(R.id.tv_prompt_processing, 19);
    }

    public r(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 20, f20081Q, f20082R));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20083P = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20083P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20083P = 1L;
        }
        y();
    }

    private r(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[12], (TextView) objArr[18], (TextView) objArr[17], (ConstraintLayout) objArr[0], (TextView) objArr[14], (AspectRatioImageView) objArr[1], (MaskHollowView) objArr[6], (AspectRatioImageView) objArr[9], (ImageView) objArr[5], (ImageView) objArr[3], (ConstraintLayout) objArr[15], (InterceptFrameLayout) objArr[7], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[2], (LottieAnimationView) objArr[10], (LottieAnimationView) objArr[11], (NTPageIndicator) objArr[16], (RecyclerView) objArr[8], (Toolbar) objArr[13], (TextView) objArr[19]);
        this.f20083P = -1L;
        this.f20075y.setTag(null);
        A(view);
        r();
    }
}
