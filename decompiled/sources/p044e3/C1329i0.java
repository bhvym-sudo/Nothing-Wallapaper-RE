package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.widget.RoundImageView;

/* JADX INFO: renamed from: e3.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1329i0 extends AbstractC1327h0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g.i f19994x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseIntArray f19995y = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19996w;

    public C1329i0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 1, f19994x, f19995y));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19996w = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19996w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19996w = 1L;
        }
        y();
    }

    private C1329i0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RoundImageView) objArr[0]);
        this.f19996w = -1L;
        this.f19992v.setTag(null);
        A(view);
        r();
    }
}
