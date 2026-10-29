package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends p0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final g.i f20077B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f20078C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f20079A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ConstraintLayout f20080z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20078C = sparseIntArray;
        sparseIntArray.put(R.id.icon, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.summary, 3);
        sparseIntArray.put(R.id.radio_button, 4);
    }

    public q0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 5, f20077B, f20078C));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20079A = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20079A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20079A = 1L;
        }
        y();
    }

    private q0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageView) objArr[1], (RadioButton) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.f20079A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20080z = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
