package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class B extends A {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final g.i f19802A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final SparseIntArray f19803B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f19804z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19803B = sparseIntArray;
        sparseIntArray.put(R.id.iv_prompt, 1);
        sparseIntArray.put(R.id.tv_prompt, 2);
        sparseIntArray.put(R.id.prompt_dimming_scrim, 3);
    }

    public B(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 4, f19802A, f19803B));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19804z = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19804z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19804z = 1L;
        }
        y();
    }

    private B(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageView) objArr[1], (ConstraintLayout) objArr[0], (View) objArr[3], (TextView) objArr[2]);
        this.f19804z = -1L;
        this.f19796w.setTag(null);
        A(view);
        r();
    }
}
