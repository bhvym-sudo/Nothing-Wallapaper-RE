package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.view.InterceptFrameLayout;
import com.nothing.wallpaper.picker.creative.view.MaskHollowView;
import com.nothing.wallpaper.picker.creative.view.NTPageIndicator;
import com.nothing.wallpaper.widget.AspectRatioImageView;

/* JADX INFO: renamed from: e3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1337q extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AspectRatioImageView f20057A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final MaskHollowView f20058B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AspectRatioImageView f20059C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView f20060D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f20061E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f20062F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final InterceptFrameLayout f20063G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f20064H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ConstraintLayout f20065I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final LottieAnimationView f20066J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final LottieAnimationView f20067K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final NTPageIndicator f20068L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RecyclerView f20069M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Toolbar f20070N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f20071O;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppBarLayout f20072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f20073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f20074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f20075y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f20076z;

    protected AbstractC1337q(Object obj, View view, int i10, AppBarLayout appBarLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, AspectRatioImageView aspectRatioImageView, MaskHollowView maskHollowView, AspectRatioImageView aspectRatioImageView2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, InterceptFrameLayout interceptFrameLayout, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, NTPageIndicator nTPageIndicator, RecyclerView recyclerView, Toolbar toolbar, TextView textView4) {
        super(obj, view, i10);
        this.f20072v = appBarLayout;
        this.f20073w = textView;
        this.f20074x = textView2;
        this.f20075y = constraintLayout;
        this.f20076z = textView3;
        this.f20057A = aspectRatioImageView;
        this.f20058B = maskHollowView;
        this.f20059C = aspectRatioImageView2;
        this.f20060D = imageView;
        this.f20061E = imageView2;
        this.f20062F = constraintLayout2;
        this.f20063G = interceptFrameLayout;
        this.f20064H = constraintLayout3;
        this.f20065I = constraintLayout4;
        this.f20066J = lottieAnimationView;
        this.f20067K = lottieAnimationView2;
        this.f20068L = nTPageIndicator;
        this.f20069M = recyclerView;
        this.f20070N = toolbar;
        this.f20071O = textView4;
    }

    public static AbstractC1337q C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1337q D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1337q) g.q(layoutInflater, R.layout.fragment_creative_result, viewGroup, z9, obj);
    }
}
