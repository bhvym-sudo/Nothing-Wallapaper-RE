package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class Y extends X {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final g.i f19915D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f19916E;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final FrameLayout f19917B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f19918C;

    static {
        g.i iVar = new g.i(7);
        f19915D = iVar;
        iVar.a(0, new String[]{"nt_category_view"}, new int[]{1}, new int[]{R.layout.nt_category_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19916E = sparseIntArray;
        sparseIntArray.put(R.id.default_view, 2);
        sparseIntArray.put(R.id.content_parent, 3);
        sparseIntArray.put(R.id.default_title, 4);
        sparseIntArray.put(R.id.default_summary, 5);
        sparseIntArray.put(R.id.id_create, 6);
    }

    public Y(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 7, f19915D, f19916E));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19918C = 0L;
        }
        g.j(this.f19910v);
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                if (this.f19918C != 0) {
                    return true;
                }
                return this.f19910v.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19918C = 2L;
        }
        this.f19910v.r();
        y();
    }

    private Y(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (V) objArr[1], (ConstraintLayout) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (CardView) objArr[2], (ImageView) objArr[6]);
        this.f19918C = -1L;
        z(this.f19910v);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f19917B = frameLayout;
        frameLayout.setTag(null);
        A(view);
        r();
    }
}
