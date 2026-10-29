package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.android.launcher3.Workspace;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.graphics.LockScreenPreviewLayout;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPreview;

/* JADX INFO: loaded from: classes.dex */
public class J extends I {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final g.i f19864B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f19865C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f19866A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19865C = sparseIntArray;
        sparseIntArray.put(R.id.workspace, 1);
        sparseIntArray.put(R.id.clockHostView, 2);
        sparseIntArray.put(R.id.shortcut_preview, 3);
        sparseIntArray.put(R.id.fingerprint_view, 4);
    }

    public J(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 5, f19864B, f19865C));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19866A = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19866A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19866A = 1L;
        }
        y();
    }

    private J(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ClockHostView) objArr[2], (LockScreenPreviewLayout) objArr[0], (ImageView) objArr[4], (ShortCutPreview) objArr[3], (Workspace) objArr[1]);
        this.f19866A = -1L;
        this.f19856w.setTag(null);
        A(view);
        r();
    }
}
