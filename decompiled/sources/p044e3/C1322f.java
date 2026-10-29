package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.pageindicators.PageIndicatorDots;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.TopAreaView;

/* JADX INFO: renamed from: e3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1322f extends AbstractC1320e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final g.i f19958B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f19959C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f19960A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19959C = sparseIntArray;
        sparseIntArray.put(R.id.top_area, 2);
        sparseIntArray.put(R.id.clock_face_Page, 3);
        sparseIntArray.put(R.id.clock_face_current, 4);
    }

    public C1322f(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 5, f19958B, f19959C));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19960A = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19960A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19960A = 1L;
        }
        y();
    }

    private C1322f(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (FrameLayout) objArr[0], (LinearLayout) objArr[4], (ViewPager2) objArr[3], (PageIndicatorDots) objArr[1], (TopAreaView) objArr[2]);
        this.f19960A = -1L;
        this.f19950v.setTag(null);
        this.f19953y.setTag(null);
        B(viewArr);
        r();
    }
}
