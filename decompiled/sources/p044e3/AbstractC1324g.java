package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockSnapshotListView;
import com.nothing.widget.ui.NtSwitch;

/* JADX INFO: renamed from: e3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1324g extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinearLayout f19969A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f19970B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f19971C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final TextView f19972D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f19973E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final NtSwitch f19974F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ImageView f19975G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ImageView f19976H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ImageView f19977I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Guideline f19978J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final LinearLayout f19979K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TextView f19980L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Guideline f19981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f19982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f19983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f19984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ClockSnapshotListView f19985z;

    protected AbstractC1324g(Object obj, View view, int i10, Guideline guideline, ImageView imageView, LinearLayout linearLayout, TextView textView, ClockSnapshotListView clockSnapshotListView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, NtSwitch ntSwitch, ImageView imageView3, ImageView imageView4, ImageView imageView5, Guideline guideline2, LinearLayout linearLayout3, TextView textView5) {
        super(obj, view, i10);
        this.f19981v = guideline;
        this.f19982w = imageView;
        this.f19983x = linearLayout;
        this.f19984y = textView;
        this.f19985z = clockSnapshotListView;
        this.f19969A = linearLayout2;
        this.f19970B = textView2;
        this.f19971C = textView3;
        this.f19972D = textView4;
        this.f19973E = imageView2;
        this.f19974F = ntSwitch;
        this.f19975G = imageView3;
        this.f19976H = imageView4;
        this.f19977I = imageView5;
        this.f19978J = guideline2;
        this.f19979K = linearLayout3;
        this.f19980L = textView5;
    }

    public static AbstractC1324g C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1324g D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1324g) g.q(layoutInflater, R.layout.clock_picker_page, viewGroup, z9, obj);
    }
}
