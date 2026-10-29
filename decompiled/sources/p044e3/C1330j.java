package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockSnapshotItemView;

/* JADX INFO: renamed from: e3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1330j extends AbstractC1328i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g.i f19997x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final SparseIntArray f19998y = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19999w;

    public C1330j(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 1, f19997x, f19998y));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19999w = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19999w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19999w = 1L;
        }
        y();
    }

    private C1330j(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ClockSnapshotItemView) objArr[0]);
        this.f19999w = -1L;
        this.f19993v.setTag(null);
        A(view);
        r();
    }
}
