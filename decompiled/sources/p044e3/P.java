package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.e;
import androidx.databinding.g;

/* JADX INFO: loaded from: classes.dex */
public class P extends O {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g.i f19889x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseIntArray f19890y = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final FrameLayout f19891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19892w;

    public P(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 1, f19889x, f19890y));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19892w = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19892w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19892w = 1L;
        }
        y();
    }

    private P(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0);
        this.f19892w = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f19891v = frameLayout;
        frameLayout.setTag(null);
        A(view);
        r();
    }
}
