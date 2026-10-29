package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends x0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g.i f20168x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseIntArray f20169y = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f20170w;

    public y0(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 1, f20168x, f20169y));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20170w = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20170w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20170w = 1L;
        }
        y();
    }

    private y0(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (TextView) objArr[0]);
        this.f20170w = -1L;
        this.f20166v.setTag(null);
        B(viewArr);
        r();
    }
}
