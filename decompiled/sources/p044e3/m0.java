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
public class m0 extends l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final g.i f20030A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final SparseIntArray f20031B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f20032z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20031B = sparseIntArray;
        sparseIntArray.put(R.id.home_preview, 2);
        sparseIntArray.put(R.id.icon_diagram, 3);
    }

    public m0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 4, f20030A, f20031B));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20032z = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20032z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20032z = 1L;
        }
        y();
    }

    private m0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (ImageView) objArr[3], (FrameLayout) objArr[0], (RoundFWDRFrameLayout) objArr[1]);
        this.f20032z = -1L;
        this.f20022x.setTag(null);
        this.f20023y.setTag(null);
        A(view);
        r();
    }
}
