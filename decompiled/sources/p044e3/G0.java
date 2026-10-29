package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class G0 extends F0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final g.i f19846B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f19847C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f19848A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19847C = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 1);
        sparseIntArray.put(R.id.collapse_handle, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.widgets_list_view, 4);
    }

    public G0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 5, f19846B, f19847C));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19848A = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19848A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19848A = 1L;
        }
        y();
    }

    private G0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[1], (View) objArr[2], (CoordinatorLayout) objArr[0], (TextView) objArr[3], (RecyclerView) objArr[4]);
        this.f19848A = -1L;
        this.f19838x.setTag(null);
        A(view);
        r();
    }
}
