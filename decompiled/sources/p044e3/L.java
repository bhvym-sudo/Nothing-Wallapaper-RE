package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.PhotoCoverView;
import com.nothing.wallpaper.widget.RoundImageView;

/* JADX INFO: loaded from: classes.dex */
public class L extends K {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final g.i f19875F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f19876G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ConstraintLayout f19877D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f19878E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19876G = sparseIntArray;
        sparseIntArray.put(R.id.current_wallpaper, 1);
        sparseIntArray.put(R.id.image_wallpaper_current, 2);
        sparseIntArray.put(R.id.current_title, 3);
        sparseIntArray.put(R.id.local_category, 4);
        sparseIntArray.put(R.id.card_photo_cover, 5);
        sparseIntArray.put(R.id.photo_cover, 6);
        sparseIntArray.put(R.id.local_title_old, 7);
        sparseIntArray.put(R.id.local_title, 8);
    }

    public L(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 9, f19875F, f19876G));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19878E = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19878E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19878E = 1L;
        }
        y();
    }

    private L(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (CardView) objArr[5], (TextView) objArr[3], (LinearLayout) objArr[1], (RoundImageView) objArr[2], (LinearLayout) objArr[4], (TextView) objArr[8], (TextView) objArr[7], (PhotoCoverView) objArr[6]);
        this.f19878E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19877D = constraintLayout;
        constraintLayout.setTag(null);
        A(view);
        r();
    }
}
