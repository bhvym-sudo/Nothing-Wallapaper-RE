package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.RoundFWDRFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends n0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f20046A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f20047z = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f20048y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20046A = sparseIntArray;
        sparseIntArray.put(R.id.preview_host, 1);
        sparseIntArray.put(R.id.icon_diagram, 2);
    }

    public o0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 3, f20047z, f20046A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20048y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20048y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20048y = 1L;
        }
        y();
    }

    private o0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageView) objArr[2], (FrameLayout) objArr[0], (RoundFWDRFrameLayout) objArr[1]);
        this.f20048y = -1L;
        this.f20038w.setTag(null);
        A(view);
        r();
    }
}
