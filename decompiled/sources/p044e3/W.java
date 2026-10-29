package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.CategoryItemView;

/* JADX INFO: loaded from: classes.dex */
public class W extends V {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f19906A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f19907z = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19908y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19906A = sparseIntArray;
        sparseIntArray.put(R.id.category_title, 1);
        sparseIntArray.put(R.id.category_grid, 2);
    }

    public W(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 3, f19907z, f19906A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19908y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19908y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19908y = 1L;
        }
        y();
    }

    private W(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RecyclerView) objArr[2], (CategoryItemView) objArr[0], (TextView) objArr[1]);
        this.f19908y = -1L;
        this.f19904w.setTag(null);
        A(view);
        r();
    }
}
