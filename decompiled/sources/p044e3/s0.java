package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends r0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final g.i f20113A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final SparseIntArray f20114B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f20115z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20114B = sparseIntArray;
        sparseIntArray.put(R.id.collapse_handle, 2);
        sparseIntArray.put(R.id.title, 3);
    }

    public s0(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 4, f20113A, f20114B));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20115z = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20115z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20115z = 1L;
        }
        y();
    }

    private s0(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (AppBarLayout) objArr[0], (View) objArr[2], (RecyclerView) objArr[1], (TextView) objArr[3]);
        this.f20115z = -1L;
        this.f20084v.setTag(null);
        this.f20086x.setTag(null);
        B(viewArr);
        r();
    }
}
