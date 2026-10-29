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
import com.nothing.wallpaper.widget.AspectRatioImageView;

/* JADX INFO: renamed from: e3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1339t extends AbstractC1338s {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final g.i f20116W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final SparseIntArray f20117X;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final ConstraintLayout f20118U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f20119V;

    static {
        g.i iVar = new g.i(26);
        f20116W = iVar;
        iVar.a(1, new String[]{"layout_creative_no_network"}, new int[]{2}, new int[]{R.layout.layout_creative_no_network});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20117X = sparseIntArray;
        sparseIntArray.put(R.id.iv_prompt_placeholder, 3);
        sparseIntArray.put(R.id.lav_prompt_placeholder, 4);
        sparseIntArray.put(R.id.iv_prompt_placeholder_mask, 5);
        sparseIntArray.put(R.id.iv_prompt_placeholder_2, 6);
        sparseIntArray.put(R.id.lav_prompt_placeholder_2, 7);
        sparseIntArray.put(R.id.iv_prompt_placeholder_mask2, 8);
        sparseIntArray.put(R.id.iv_blur_placeholder, 9);
        sparseIntArray.put(R.id.layout_subject_prompt_list, 10);
        sparseIntArray.put(R.id.rv_subject_prompt, 11);
        sparseIntArray.put(R.id.layout_style_prompt_list, 12);
        sparseIntArray.put(R.id.rv_style_prompt, 13);
        sparseIntArray.put(R.id.iv_hollow_mask, 14);
        sparseIntArray.put(R.id.iv_selected_frame, 15);
        sparseIntArray.put(R.id.iv_plus_symbol, 16);
        sparseIntArray.put(R.id.lav_processing, 17);
        sparseIntArray.put(R.id.lav_processing_loop, 18);
        sparseIntArray.put(R.id.appbar_layout, 19);
        sparseIntArray.put(R.id.toolbar, 20);
        sparseIntArray.put(R.id.custom_toolbar_title, 21);
        sparseIntArray.put(R.id.prompts_title, 22);
        sparseIntArray.put(R.id.btn_generate, 23);
        sparseIntArray.put(R.id.group_random_generate, 24);
        sparseIntArray.put(R.id.tv_prompt_processing, 25);
    }

    public C1339t(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 26, f20116W, f20117X));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20119V = 0L;
        }
        g.j(this.f20110x);
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                if (this.f20119V != 0) {
                    return true;
                }
                return this.f20110x.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20119V = 2L;
        }
        this.f20110x.r();
        y();
    }

    private C1339t(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppBarLayout) objArr[19], (TextView) objArr[23], (E) objArr[2], (TextView) objArr[21], (TextView) objArr[24], (AspectRatioImageView) objArr[9], (MaskHollowView) objArr[14], (ImageView) objArr[16], (ImageView) objArr[3], (ImageView) objArr[6], (ImageView) objArr[5], (ImageView) objArr[8], (AspectRatioImageView) objArr[15], (LottieAnimationView) objArr[17], (LottieAnimationView) objArr[18], (LottieAnimationView) objArr[4], (LottieAnimationView) objArr[7], (ConstraintLayout) objArr[1], (InterceptFrameLayout) objArr[12], (InterceptFrameLayout) objArr[10], (TextView) objArr[22], (RecyclerView) objArr[13], (RecyclerView) objArr[11], (Toolbar) objArr[20], (TextView) objArr[25]);
        this.f20119V = -1L;
        z(this.f20110x);
        this.f20100M.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20118U = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
