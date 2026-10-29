package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class S extends Q {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final g.i f19894y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final SparseIntArray f19895z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final FrameLayout f19896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f19897x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19895z = sparseIntArray;
        sparseIntArray.put(R.id.tv_foot_desc, 1);
    }

    public S(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 2, f19894y, f19895z));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19897x = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19897x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19897x = 1L;
        }
        y();
    }

    private S(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (TextView) objArr[1]);
        this.f19897x = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f19896w = frameLayout;
        frameLayout.setTag(null);
        A(view);
        r();
    }
}
