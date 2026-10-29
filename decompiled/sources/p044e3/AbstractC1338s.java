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
import com.nothing.wallpaper.widget.AspectRatioImageView;

/* JADX INFO: renamed from: e3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1338s extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AspectRatioImageView f20088A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final MaskHollowView f20089B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ImageView f20090C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView f20091D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f20092E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ImageView f20093F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ImageView f20094G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final AspectRatioImageView f20095H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final LottieAnimationView f20096I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final LottieAnimationView f20097J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final LottieAnimationView f20098K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final LottieAnimationView f20099L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ConstraintLayout f20100M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final InterceptFrameLayout f20101N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final InterceptFrameLayout f20102O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final TextView f20103P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RecyclerView f20104Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final RecyclerView f20105R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Toolbar f20106S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final TextView f20107T;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppBarLayout f20108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f20109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E f20110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f20111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f20112z;

    protected AbstractC1338s(Object obj, View view, int i10, AppBarLayout appBarLayout, TextView textView, E e10, TextView textView2, TextView textView3, AspectRatioImageView aspectRatioImageView, MaskHollowView maskHollowView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, AspectRatioImageView aspectRatioImageView2, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, LottieAnimationView lottieAnimationView4, ConstraintLayout constraintLayout, InterceptFrameLayout interceptFrameLayout, InterceptFrameLayout interceptFrameLayout2, TextView textView4, RecyclerView recyclerView, RecyclerView recyclerView2, Toolbar toolbar, TextView textView5) {
        super(obj, view, i10);
        this.f20108v = appBarLayout;
        this.f20109w = textView;
        this.f20110x = e10;
        this.f20111y = textView2;
        this.f20112z = textView3;
        this.f20088A = aspectRatioImageView;
        this.f20089B = maskHollowView;
        this.f20090C = imageView;
        this.f20091D = imageView2;
        this.f20092E = imageView3;
        this.f20093F = imageView4;
        this.f20094G = imageView5;
        this.f20095H = aspectRatioImageView2;
        this.f20096I = lottieAnimationView;
        this.f20097J = lottieAnimationView2;
        this.f20098K = lottieAnimationView3;
        this.f20099L = lottieAnimationView4;
        this.f20100M = constraintLayout;
        this.f20101N = interceptFrameLayout;
        this.f20102O = interceptFrameLayout2;
        this.f20103P = textView4;
        this.f20104Q = recyclerView;
        this.f20105R = recyclerView2;
        this.f20106S = toolbar;
        this.f20107T = textView5;
    }

    public static AbstractC1338s C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1338s D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1338s) g.q(layoutInflater, R.layout.fragment_creative_selector, viewGroup, z9, obj);
    }
}
