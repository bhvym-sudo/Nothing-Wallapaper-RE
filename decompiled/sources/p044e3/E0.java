package p044e3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.pageindicators.PageIndicatorDots;
import com.nothing.wallpaper.picker.lockscreen.ui.view.NTPageView;

/* JADX INFO: loaded from: classes.dex */
public class E0 extends D0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final g.i f19830E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f19831F = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f19832D;

    public E0(e eVar, View[] viewArr) {
        this(eVar, viewArr, g.v(eVar, viewArr, 8, f19830E, f19831F));
    }

    @Override // androidx.databinding.g
    protected void h() {
        synchronized (this) {
            this.f19832D = 0L;
        }
    }

    @Override // androidx.databinding.g
    public boolean p() {
        synchronized (this) {
            try {
                return this.f19832D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.g
    public void r() {
        synchronized (this) {
            this.f19832D = 1L;
        }
        y();
    }

    private E0(e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (Guideline) objArr[6], (ImageView) objArr[2], (PageIndicatorDots) objArr[7], (Guideline) objArr[3], (Guideline) objArr[0], (NTPageView) objArr[4], (ViewPager2) objArr[5], (TextView) objArr[1]);
        this.f19832D = -1L;
        this.f19822v.setTag(null);
        this.f19823w.setTag(null);
        this.f19824x.setTag(null);
        this.f19825y.setTag(null);
        this.f19826z.setTag(null);
        this.f19819A.setTag(null);
        this.f19820B.setTag(null);
        this.f19821C.setTag(null);
        B(viewArr);
        r();
    }
}
