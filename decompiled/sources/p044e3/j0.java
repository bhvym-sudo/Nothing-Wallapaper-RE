package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.widget.EffectButtonGroup;
import com.nothing.wallpaper.picker.edit.preview.widget.NTDisplayAspectRatioLinearLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f20000A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f20001B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final NTDisplayAspectRatioLinearLayout f20002C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Group f20003D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final FrameLayout f20004E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final TextView f20005F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final View f20006G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Guideline f20007H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f20008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EffectButtonGroup f20009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f20010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f20011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f20012z;

    protected j0(Object obj, View view, int i10, ConstraintLayout constraintLayout, EffectButtonGroup effectButtonGroup, TextView textView, TextView textView2, View view2, TextView textView3, View view3, NTDisplayAspectRatioLinearLayout nTDisplayAspectRatioLinearLayout, Group group, FrameLayout frameLayout, TextView textView4, View view4, Guideline guideline) {
        super(obj, view, i10);
        this.f20008v = constraintLayout;
        this.f20009w = effectButtonGroup;
        this.f20010x = textView;
        this.f20011y = textView2;
        this.f20012z = view2;
        this.f20000A = textView3;
        this.f20001B = view3;
        this.f20002C = nTDisplayAspectRatioLinearLayout;
        this.f20003D = group;
        this.f20004E = frameLayout;
        this.f20005F = textView4;
        this.f20006G = view4;
        this.f20007H = guideline;
    }

    public static j0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static j0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (j0) g.q(layoutInflater, R.layout.nt_preview_fragment, viewGroup, z9, obj);
    }
}
