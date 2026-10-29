package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: e3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1332l extends AbstractC1331k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g.i f20017x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseIntArray f20018y = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f20019w;

    public C1332l(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 1, f20017x, f20018y));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f20019w = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f20019w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f20019w = 1L;
        }
        y();
    }

    private C1332l(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (RecyclerView) objArr[0]);
        this.f20019w = -1L;
        this.f20013v.setTag(null);
        B(viewArr);
        r();
    }
}
