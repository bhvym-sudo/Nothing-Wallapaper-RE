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
public class H extends G {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final g.i f19849C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f19850D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f19851A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f19852B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19850D = sparseIntArray;
        sparseIntArray.put(R.id.img_bauhaus_bg, 1);
        sparseIntArray.put(R.id.ic_bauhaus, 2);
        sparseIntArray.put(R.id.tv_bauhaus_title, 3);
        sparseIntArray.put(R.id.tv_bauhaus_content, 4);
        sparseIntArray.put(R.id.btn_learn_more, 5);
    }

    public H(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 6, f19849C, f19850D));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19852B = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19852B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19852B = 1L;
        }
        y();
    }

    private H(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (TextView) objArr[5], (ImageView) objArr[2], (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[3]);
        this.f19852B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19851A = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
