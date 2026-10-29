package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: e3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1334n extends AbstractC1333m {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final g.i f20033D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20034E;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20035B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f20036C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20034E = sparseIntArray;
        sparseIntArray.put(R.id.iv_policy_info, 1);
        sparseIntArray.put(R.id.tv_policy_title, 2);
        sparseIntArray.put(R.id.tv_policy_body1, 3);
        sparseIntArray.put(R.id.tv_policy_body2, 4);
        sparseIntArray.put(R.id.tv_positive, 5);
        sparseIntArray.put(R.id.tv_negative, 6);
    }

    public C1334n(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 7, f20033D, f20034E));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20036C = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20036C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20036C = 1L;
        }
        y();
    }

    private C1334n(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[5]);
        this.f20036C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20035B = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
