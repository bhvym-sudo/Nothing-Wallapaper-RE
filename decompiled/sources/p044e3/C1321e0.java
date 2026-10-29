package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;

/* JADX INFO: renamed from: e3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1321e0 extends AbstractC1319d0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f19955A = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f19956z = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19957y;

    public C1321e0(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 3, f19956z, f19955A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19957y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19957y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19957y = 1L;
        }
        y();
    }

    private C1321e0(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (ImageView) objArr[0], (TextView) objArr[2], (TextView) objArr[1]);
        this.f19957y = -1L;
        this.f19947v.setTag(null);
        this.f19948w.setTag(null);
        this.f19949x.setTag(null);
        B(viewArr);
        r();
    }
}
