package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.e;
import androidx.databinding.g;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.individual.IndividualPickerFrame;
import com.nothing.wallpaper.widget.RoundCoordinatorLayout;
import com.nothing.wallpaper.widget.VerticallyRecyclerView;

/* JADX INFO: renamed from: e3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1325g0 extends AbstractC1323f0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final g.i f19986E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f19987F;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f19988D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19987F = sparseIntArray;
        sparseIntArray.put(R.id.page_mask, 1);
        sparseIntArray.put(R.id.category_lib_parent, 2);
        sparseIntArray.put(R.id.appbar_layout, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.custom_toolbar_title, 5);
        sparseIntArray.put(R.id.category_List, 6);
        sparseIntArray.put(R.id.individual_grid, 7);
    }

    public C1325g0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 8, f19986E, f19987F));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19988D = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19988D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19988D = 1L;
        }
        y();
    }

    private C1325g0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[3], (RoundCoordinatorLayout) objArr[2], (VerticallyRecyclerView) objArr[6], (TextView) objArr[5], (FrameLayout) objArr[0], (IndividualPickerFrame) objArr[7], (View) objArr[1], (Toolbar) objArr[4]);
        this.f19988D = -1L;
        this.f19968z.setTag(null);
        A(view);
        r();
    }
}
