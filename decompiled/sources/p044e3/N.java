package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class N extends M {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final g.i f19886D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f19887E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f19888C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19887E = sparseIntArray;
        sparseIntArray.put(R.id.card_view, 1);
        sparseIntArray.put(R.id.image, 2);
        sparseIntArray.put(R.id.indicator_icon, 3);
        sparseIntArray.put(R.id.dimming_scrim, 4);
        sparseIntArray.put(R.id.selected_icon, 5);
        sparseIntArray.put(R.id.tv_foot_desc, 6);
    }

    public N(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 7, f19886D, f19887E));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19888C = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19888C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19888C = 1L;
        }
        y();
    }

    private N(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (CardView) objArr[1], (ImageView) objArr[4], (ImageView) objArr[2], (ImageView) objArr[3], (FrameLayout) objArr[0], (ImageView) objArr[5], (TextView) objArr[6]);
        this.f19888C = -1L;
        this.f19885z.setTag(null);
        A(view);
        r();
    }
}
