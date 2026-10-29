package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.android.wallpaper.picker.FixedWidthDisplayRatioFrameLayout;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1343x extends AbstractC1342w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f20163A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f20164z = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f20165y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20163A = sparseIntArray;
        sparseIntArray.put(R.id.preview, 2);
    }

    public C1343x(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 3, f20164z, f20163A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20165y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20165y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20165y = 1L;
        }
        y();
    }

    private C1343x(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (FixedWidthDisplayRatioFrameLayout) objArr[1], (FrameLayout) objArr[0]);
        this.f20165y = -1L;
        this.f20158w.setTag(null);
        this.f20159x.setTag(null);
        A(view);
        r();
    }
}
