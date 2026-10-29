package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1345z extends AbstractC1344y {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final g.i f20171y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final SparseIntArray f20172z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ConstraintLayout f20173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f20174x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20172z = sparseIntArray;
        sparseIntArray.put(R.id.tv_history_limitation, 1);
    }

    public C1345z(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 2, f20171y, f20172z));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20174x = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20174x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20174x = 1L;
        }
        y();
    }

    private C1345z(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (TextView) objArr[1]);
        this.f20174x = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20173w = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
