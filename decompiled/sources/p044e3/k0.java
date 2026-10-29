package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.widget.EffectButtonGroup;
import com.nothing.wallpaper.picker.edit.preview.widget.NTDisplayAspectRatioLinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends j0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final g.i f20014J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f20015K;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f20016I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20015K = sparseIntArray;
        sparseIntArray.put(R.id.toolbar_container, 3);
        sparseIntArray.put(R.id.lock_screen_preview, 4);
        sparseIntArray.put(R.id.home_screen_preview, 5);
        sparseIntArray.put(R.id.select_wallpaper_title, 6);
        sparseIntArray.put(R.id.top_guide, 7);
        sparseIntArray.put(R.id.lock_screen_label, 8);
        sparseIntArray.put(R.id.home_screen_label, 9);
        sparseIntArray.put(R.id.screen_label_group, 10);
        sparseIntArray.put(R.id.effect_tips, 11);
        sparseIntArray.put(R.id.effect_actions_layout, 12);
    }

    public k0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 13, f20014J, f20015K));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20016I = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20016I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20016I = 1L;
        }
        y();
    }

    private k0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (EffectButtonGroup) objArr[12], (TextView) objArr[11], (TextView) objArr[9], (View) objArr[5], (TextView) objArr[8], (View) objArr[4], (NTDisplayAspectRatioLinearLayout) objArr[2], (Group) objArr[10], (FrameLayout) objArr[1], (TextView) objArr[6], (View) objArr[3], (Guideline) objArr[7]);
        this.f20016I = -1L;
        this.f20008v.setTag(null);
        this.f20002C.setTag(null);
        this.f20004E.setTag(null);
        A(view);
        r();
    }
}
