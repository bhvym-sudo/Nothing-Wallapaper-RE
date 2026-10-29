package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class U extends T {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final g.i f19899y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final SparseIntArray f19900z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CardView f19901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f19902x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19900z = sparseIntArray;
        sparseIntArray.put(R.id.place_title, 1);
    }

    public U(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 2, f19899y, f19900z));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19902x = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19902x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19902x = 1L;
        }
        y();
    }

    private U(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (TextView) objArr[1]);
        this.f19902x = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f19901w = cardView;
        cardView.setTag(null);
        A(view);
        r();
    }
}
