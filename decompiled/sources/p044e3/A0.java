package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.widget.ui.NtSwitch;

/* JADX INFO: loaded from: classes.dex */
public class A0 extends z0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final g.i f19799A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final SparseIntArray f19800B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f19801z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19800B = sparseIntArray;
        sparseIntArray.put(R.id.card_view, 1);
        sparseIntArray.put(R.id.switch_view, 2);
        sparseIntArray.put(R.id.expand_tips, 3);
    }

    public A0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 4, f19799A, f19800B));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19801z = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19801z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19801z = 1L;
        }
        y();
    }

    private A0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (CardView) objArr[1], (TextView) objArr[3], (LinearLayout) objArr[0], (NtSwitch) objArr[2]);
        this.f19801z = -1L;
        this.f20177x.setTag(null);
        A(view);
        r();
    }
}
