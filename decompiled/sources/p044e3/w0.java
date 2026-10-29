package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends v0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final g.i f20160B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f20161C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f20162A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20161C = sparseIntArray;
        sparseIntArray.put(R.id.icon_bg1, 1);
        sparseIntArray.put(R.id.icon1, 2);
        sparseIntArray.put(R.id.icon_bg2, 3);
        sparseIntArray.put(R.id.icon2, 4);
    }

    public w0(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 5, f20160B, f20161C));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20162A = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20162A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20162A = 1L;
        }
        y();
    }

    private w0(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (ImageView) objArr[2], (ImageView) objArr[4], (FrameLayout) objArr[1], (FrameLayout) objArr[3], (FrameLayout) objArr[0]);
        this.f20162A = -1L;
        this.f20156z.setTag(null);
        B(viewArr);
        r();
    }
}
