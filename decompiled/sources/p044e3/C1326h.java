package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockSnapshotListView;
import com.nothing.widget.ui.NtSwitch;

/* JADX INFO: renamed from: e3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1326h extends AbstractC1324g {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final g.i f19989N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final SparseIntArray f19990O;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f19991M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19990O = sparseIntArray;
        sparseIntArray.put(R.id.large, 11);
        sparseIntArray.put(R.id.small, 12);
        sparseIntArray.put(R.id.left, 13);
        sparseIntArray.put(R.id.center, 14);
        sparseIntArray.put(R.id.unlock_animation_text, 15);
        sparseIntArray.put(R.id.dynamicSwitch, 16);
    }

    public C1326h(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 17, f19989N, f19990O));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19991M = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19991M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19991M = 1L;
        }
        y();
    }

    private C1326h(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (Guideline) objArr[10], (ImageView) objArr[14], (LinearLayout) objArr[8], (TextView) objArr[7], (ClockSnapshotListView) objArr[4], (LinearLayout) objArr[6], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[1], (ImageView) objArr[2], (NtSwitch) objArr[16], (ImageView) objArr[11], (ImageView) objArr[13], (ImageView) objArr[12], (Guideline) objArr[0], (LinearLayout) objArr[9], (TextView) objArr[15]);
        this.f19991M = -1L;
        this.f19981v.setTag(null);
        this.f19983x.setTag(null);
        this.f19984y.setTag(null);
        this.f19985z.setTag(null);
        this.f19969A.setTag(null);
        this.f19970B.setTag(null);
        this.f19971C.setTag(null);
        this.f19972D.setTag(null);
        this.f19973E.setTag(null);
        this.f19978J.setTag(null);
        this.f19979K.setTag(null);
        B(viewArr);
        r();
    }
}
