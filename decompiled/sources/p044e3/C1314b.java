package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.e;
import androidx.databinding.g;

/* JADX INFO: renamed from: e3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1314b extends AbstractC1312a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g.i f19930x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseIntArray f19931y = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19932w;

    public C1314b(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 1, f19930x, f19931y));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19932w = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19932w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19932w = 1L;
        }
        y();
    }

    private C1314b(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RelativeLayout) objArr[0]);
        this.f19932w = -1L;
        this.f19925v.setTag(null);
        A(view);
        r();
    }
}
