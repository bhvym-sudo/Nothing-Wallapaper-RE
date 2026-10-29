package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class D extends C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f19816A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f19817z = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19818y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19816A = sparseIntArray;
        sparseIntArray.put(R.id.iv_creative_result, 1);
        sparseIntArray.put(R.id.creative_result_dimming_scrim, 2);
    }

    public D(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 3, f19817z, f19816A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19818y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19818y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19818y = 1L;
        }
        y();
    }

    private D(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (ConstraintLayout) objArr[0], (ImageView) objArr[1]);
        this.f19818y = -1L;
        this.f19810w.setTag(null);
        A(view);
        r();
    }
}
