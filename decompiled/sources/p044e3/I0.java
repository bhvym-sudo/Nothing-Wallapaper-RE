package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class I0 extends H0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f19860A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f19861z = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final LinearLayout f19862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19863y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19860A = sparseIntArray;
        sparseIntArray.put(R.id.preview_container, 1);
        sparseIntArray.put(R.id.preview_img, 2);
    }

    public I0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 3, f19861z, f19860A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19863y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19863y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19863y = 1L;
        }
        y();
    }

    private I0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (FrameLayout) objArr[1], (ImageView) objArr[2]);
        this.f19863y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f19862x = linearLayout;
        linearLayout.setTag(null);
        A(view);
        r();
    }
}
