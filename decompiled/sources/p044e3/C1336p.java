package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1336p extends AbstractC1335o {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final g.i f20049D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20050E;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20051B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f20052C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20050E = sparseIntArray;
        sparseIntArray.put(R.id.image_container, 1);
        sparseIntArray.put(R.id.topSection, 2);
        sparseIntArray.put(R.id.bottomSection, 3);
        sparseIntArray.put(R.id.selectBorder, 4);
        sparseIntArray.put(R.id.gap, 5);
        sparseIntArray.put(R.id.text, 6);
    }

    public C1336p(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 7, f20049D, f20050E));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20052C = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20052C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20052C = 1L;
        }
        y();
    }

    private C1336p(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LinearLayout) objArr[3], (LinearLayout) objArr[5], (View) objArr[1], (View) objArr[4], (TextView) objArr[6], (LinearLayout) objArr[2]);
        this.f20052C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20051B = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
