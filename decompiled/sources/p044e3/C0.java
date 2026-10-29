package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClipCardView;

/* JADX INFO: loaded from: classes.dex */
public class C0 extends B0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final g.i f19812B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f19813C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f19814A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RelativeLayout f19815z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19813C = sparseIntArray;
        sparseIntArray.put(R.id.card_view, 1);
        sparseIntArray.put(R.id.group_icon, 2);
        sparseIntArray.put(R.id.group_preview, 3);
        sparseIntArray.put(R.id.title, 4);
    }

    public C0(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 5, f19812B, f19813C));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19814A = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19814A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19814A = 1L;
        }
        y();
    }

    private C0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ClipCardView) objArr[1], (ImageView) objArr[2], (ImageView) objArr[3], (TextView) objArr[4]);
        this.f19814A = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f19815z = relativeLayout;
        relativeLayout.setTag(null);
        A(view);
        r();
    }
}
