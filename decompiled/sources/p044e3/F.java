package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class F extends E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f19833A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final g.i f19834z = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19835y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19833A = sparseIntArray;
        sparseIntArray.put(R.id.iv_no_network_info, 1);
        sparseIntArray.put(R.id.tv_no_network_info, 2);
    }

    public F(e eVar, View view) {
        this(eVar, view, g.u(eVar, view, 3, f19834z, f19833A));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19835y = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19835y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19835y = 1L;
        }
        y();
    }

    private F(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LinearLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f19835y = -1L;
        this.f19827v.setTag(null);
        A(view);
        r();
    }
}
