package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f17098n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f17099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f17100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17101c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17103e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17110l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17102d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f17104f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17105g = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17106h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f17107i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17108j = f17098n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17109k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f17111m = null;

    static class a extends Exception {
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f17099a = charSequence;
        this.f17100b = textPaint;
        this.f17101c = i10;
        this.f17103e = charSequence.length();
    }

    public static g b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new g(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f17099a == null) {
            this.f17099a = "";
        }
        int iMax = Math.max(0, this.f17101c);
        CharSequence charSequenceEllipsize = this.f17099a;
        if (this.f17105g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f17100b, iMax, this.f17111m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f17103e);
        this.f17103e = iMin;
        if (this.f17110l && this.f17105g == 1) {
            this.f17104f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f17102d, iMin, this.f17100b, iMax);
        builderObtain.setAlignment(this.f17104f);
        builderObtain.setIncludePad(this.f17109k);
        builderObtain.setTextDirection(this.f17110l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f17111m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f17105g);
        float f10 = this.f17106h;
        if (f10 != 0.0f || this.f17107i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f17107i);
        }
        if (this.f17105g > 1) {
            builderObtain.setHyphenationFrequency(this.f17108j);
        }
        return builderObtain.build();
    }

    public g c(Layout.Alignment alignment) {
        this.f17104f = alignment;
        return this;
    }

    public g d(TextUtils.TruncateAt truncateAt) {
        this.f17111m = truncateAt;
        return this;
    }

    public g e(int i10) {
        this.f17108j = i10;
        return this;
    }

    public g f(boolean z9) {
        this.f17109k = z9;
        return this;
    }

    public g g(boolean z9) {
        this.f17110l = z9;
        return this;
    }

    public g h(float f10, float f11) {
        this.f17106h = f10;
        this.f17107i = f11;
        return this;
    }

    public g i(int i10) {
        this.f17105g = i10;
        return this;
    }

    public g j(h hVar) {
        return this;
    }
}
