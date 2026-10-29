package com.nothing.wallpaper.widget;

import H3.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.wallpaper.asset.a;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p044e3.AbstractC1327h0;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class PhotoCoverView extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LayoutInflater f19163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f19164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f19165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f19166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f19167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f19168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final float f19169w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final void b(List list) {
        removeAllViews();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            a aVar = (a) obj;
            AbstractC1327h0 abstractC1327h0C = AbstractC1327h0.C(this.f19163q, this, false);
            n.g(abstractC1327h0C, "inflate(...)");
            abstractC1327h0C.f19992v.setRoundRadius(this.f19169w);
            RoundImageView image = abstractC1327h0C.f19992v;
            n.g(image, "image");
            ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i12 = this.f19168v;
            marginLayoutParams.width = i12;
            marginLayoutParams.height = i12;
            image.setLayoutParams(marginLayoutParams);
            aVar.n(getContext(), abstractC1327h0C.f19992v, this.f19164r);
            addView(abstractC1327h0C.o());
            if (i10 > 0) {
                RoundImageView image2 = abstractC1327h0C.f19992v;
                n.g(image2, "image");
                ViewGroup.LayoutParams layoutParams2 = image2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.width = this.f19168v / 2;
                marginLayoutParams2.setMarginStart(this.f19166t);
                image2.setLayoutParams(marginLayoutParams2);
            }
            i10 = i11;
        }
    }

    private final void c(List list, int i10) {
        int i11;
        removeAllViews();
        boolean z9 = false;
        if (list.isEmpty()) {
            AbstractC1327h0 abstractC1327h0C = AbstractC1327h0.C(this.f19163q, this, false);
            n.g(abstractC1327h0C, "inflate(...)");
            abstractC1327h0C.f19992v.setImageResource(R.drawable.nt_ic_local_image);
            addView(abstractC1327h0C.o());
            return;
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC1444s.t();
            }
            AbstractC1327h0 abstractC1327h0C2 = AbstractC1327h0.C(this.f19163q, this, z9);
            n.g(abstractC1327h0C2, "inflate(...)");
            ((a) obj).n(getContext(), abstractC1327h0C2.f19992v, this.f19164r);
            if (i12 == 0) {
                addView(abstractC1327h0C2.o());
            } else if (list.size() == 2) {
                int i14 = this.f19167u;
                int i15 = this.f19165s;
                if (i10 > (i14 * 2) + (i15 * 3)) {
                    RoundImageView image = abstractC1327h0C2.f19992v;
                    n.g(image, "image");
                    ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(this.f19165s);
                    image.setLayoutParams(marginLayoutParams);
                    addView(abstractC1327h0C2.o());
                } else if (i10 > (((double) i14) * 1.5d) + ((double) (i15 * 3))) {
                    RoundImageView image2 = abstractC1327h0C2.f19992v;
                    n.g(image2, "image");
                    ViewGroup.LayoutParams layoutParams2 = image2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginStart(this.f19165s);
                    image2.setLayoutParams(marginLayoutParams2);
                    RoundImageView image3 = abstractC1327h0C2.f19992v;
                    n.g(image3, "image");
                    ViewGroup.LayoutParams layoutParams3 = image3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.width = this.f19167u / 2;
                    image3.setLayoutParams(marginLayoutParams3);
                    addView(abstractC1327h0C2.o());
                }
            } else {
                if (list.size() == 3) {
                    i11 = i13;
                    if (i10 > (((double) this.f19167u) * (((double) 1) + (((double) i12) * 0.5d))) + ((double) ((i12 + 2) * this.f19165s))) {
                        RoundImageView image4 = abstractC1327h0C2.f19992v;
                        n.g(image4, "image");
                        ViewGroup.LayoutParams layoutParams4 = image4.getLayoutParams();
                        if (layoutParams4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams4.setMarginStart(this.f19165s);
                        image4.setLayoutParams(marginLayoutParams4);
                        RoundImageView image5 = abstractC1327h0C2.f19992v;
                        n.g(image5, "image");
                        ViewGroup.LayoutParams layoutParams5 = image5.getLayoutParams();
                        if (layoutParams5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                        marginLayoutParams5.width = this.f19167u / 2;
                        image5.setLayoutParams(marginLayoutParams5);
                        addView(abstractC1327h0C2.o());
                    } else {
                        continue;
                    }
                }
                i12 = i11;
                z9 = false;
            }
            i11 = i13;
            i12 = i11;
            z9 = false;
        }
    }

    public final void a(List asserts, int i10, boolean z9) {
        n.h(asserts, "asserts");
        if (z9) {
            c(asserts, i10);
        } else {
            b(asserts);
        }
    }

    public /* synthetic */ PhotoCoverView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoCoverView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19163q = LayoutInflater.from(context);
        this.f19164r = r.a(context, android.R.attr.colorSecondary);
        this.f19165s = getResources().getDimensionPixelOffset(R.dimen.nt_photo_cover_margin);
        this.f19166t = getResources().getDimensionPixelOffset(R.dimen.nt_photo_cover_margin2);
        this.f19167u = getResources().getDimensionPixelOffset(R.dimen.nt_photo_icon_size);
        this.f19168v = getResources().getDimensionPixelOffset(R.dimen.nt_photo_icon_size2);
        this.f19169w = getResources().getDimensionPixelOffset(R.dimen.nt_photo_icon_radius2);
        setOrientation(0);
    }
}
