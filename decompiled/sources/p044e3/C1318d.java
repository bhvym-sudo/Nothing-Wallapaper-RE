package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockEditContentView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditBorderView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.TopAreaView;

/* JADX INFO: renamed from: e3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1318d extends AbstractC1316c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final g.i f19944A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final SparseIntArray f19945B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f19946z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19945B = sparseIntArray;
        sparseIntArray.put(R.id.bgBorder, 1);
        sparseIntArray.put(R.id.top_area, 2);
        sparseIntArray.put(R.id.clock_face_current, 3);
    }

    public C1318d(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 4, f19944A, f19945B));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19946z = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19946z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19946z = 1L;
        }
        y();
    }

    private C1318d(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (ClockHostEditBorderView) objArr[1], (FrameLayout) objArr[0], (ClockEditContentView) objArr[3], (TopAreaView) objArr[2]);
        this.f19946z = -1L;
        this.f19937w.setTag(null);
        B(viewArr);
        r();
    }
}
