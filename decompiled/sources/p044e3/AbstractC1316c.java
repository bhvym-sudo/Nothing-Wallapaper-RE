package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockEditContentView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditBorderView;
import com.nothing.wallpaper.picker.lockscreen.ui.view.TopAreaView;

/* JADX INFO: renamed from: e3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1316c extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ClockHostEditBorderView f19936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f19937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ClockEditContentView f19938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TopAreaView f19939y;

    protected AbstractC1316c(Object obj, View view, int i10, ClockHostEditBorderView clockHostEditBorderView, FrameLayout frameLayout, ClockEditContentView clockEditContentView, TopAreaView topAreaView) {
        super(obj, view, i10);
        this.f19936v = clockHostEditBorderView;
        this.f19937w = frameLayout;
        this.f19938x = clockEditContentView;
        this.f19939y = topAreaView;
    }

    public static AbstractC1316c C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1316c D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1316c) g.q(layoutInflater, R.layout.clock_host_edit_preview, viewGroup, z9, obj);
    }
}
