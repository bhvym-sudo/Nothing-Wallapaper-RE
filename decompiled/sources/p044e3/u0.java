package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.TransitionImageView;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends t0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f20145A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f20146z = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ConstraintLayout f20147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f20148y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20145A = sparseIntArray;
        sparseIntArray.put(R.id.slot_start, 1);
        sparseIntArray.put(R.id.slot_end, 2);
    }

    public u0(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 3, f20146z, f20145A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20148y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20148y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20148y = 1L;
        }
        y();
    }

    private u0(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (TransitionImageView) objArr[2], (TransitionImageView) objArr[1]);
        this.f20148y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20147x = constraintLayout;
        constraintLayout.setTag(null);
        B(viewArr);
        r();
    }
}
