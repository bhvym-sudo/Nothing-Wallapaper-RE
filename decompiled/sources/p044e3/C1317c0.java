package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.widget.EffectButton;

/* JADX INFO: renamed from: e3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1317c0 extends AbstractC1315b0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final g.i f19940A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final SparseIntArray f19941B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ConstraintLayout f19942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f19943z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19941B = sparseIntArray;
        sparseIntArray.put(R.id.action_blur, 1);
        sparseIntArray.put(R.id.action_glass, 2);
        sparseIntArray.put(R.id.action_customize, 3);
    }

    public C1317c0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 4, f19940A, f19941B));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19943z = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19943z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19943z = 1L;
        }
        y();
    }

    private C1317c0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (EffectButton) objArr[1], (EffectButton) objArr[3], (EffectButton) objArr[2]);
        this.f19943z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19942y = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
