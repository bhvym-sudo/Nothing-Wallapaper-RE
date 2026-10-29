package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1313a0 extends Z {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final g.i f19926D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f19927E;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f19928B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f19929C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19927E = sparseIntArray;
        sparseIntArray.put(R.id.ic_reset_workspace, 1);
        sparseIntArray.put(R.id.tv_reset_title, 2);
        sparseIntArray.put(R.id.fl_checkbox, 3);
        sparseIntArray.put(R.id.cb_discard, 4);
        sparseIntArray.put(R.id.tv_reset, 5);
        sparseIntArray.put(R.id.tv_cancel, 6);
    }

    public C1313a0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 7, f19926D, f19927E));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19929C = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19929C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19929C = 1L;
        }
        y();
    }

    private C1313a0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (CheckBox) objArr[4], (FrameLayout) objArr[3], (ImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[2]);
        this.f19929C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19928B = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
