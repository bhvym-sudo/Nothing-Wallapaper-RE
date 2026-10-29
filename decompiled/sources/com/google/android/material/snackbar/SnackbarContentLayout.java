package com.google.android.material.snackbar;

import I4.f;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.H;
import p225w4.e;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f17239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f17240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TimeInterpolator f17241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17242t;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17241s = f.g(context, p225w4.a.f28676K, p235x4.a.f29940b);
    }

    private static void d(View view, int i10, int i11) {
        if (H.O(view)) {
            H.v0(view, H.z(view), i10, H.y(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z9;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f17239q.getPaddingTop() == i11 && this.f17239q.getPaddingBottom() == i12) {
            return z9;
        }
        d(this.f17239q, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f17239q.setAlpha(0.0f);
        long j9 = i11;
        long j10 = i10;
        this.f17239q.animate().alpha(1.0f).setDuration(j9).setInterpolator(this.f17241s).setStartDelay(j10).start();
        if (this.f17240r.getVisibility() == 0) {
            this.f17240r.setAlpha(0.0f);
            this.f17240r.animate().alpha(1.0f).setDuration(j9).setInterpolator(this.f17241s).setStartDelay(j10).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f17239q.setAlpha(1.0f);
        long j9 = i11;
        long j10 = i10;
        this.f17239q.animate().alpha(0.0f).setDuration(j9).setInterpolator(this.f17241s).setStartDelay(j10).start();
        if (this.f17240r.getVisibility() == 0) {
            this.f17240r.setAlpha(1.0f);
            this.f17240r.animate().alpha(0.0f).setDuration(j9).setInterpolator(this.f17241s).setStartDelay(j10).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f17240r.setTextColor(D4.a.j(D4.a.d(this, p225w4.a.f28712o), this.f17240r.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f17240r;
    }

    public TextView getMessageView() {
        return this.f17239q;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f17239q = (TextView) findViewById(e.f28810J);
        this.f17240r = (Button) findViewById(e.f28809I);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(p225w4.c.f28764e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(p225w4.c.f28762d);
        Layout layout = this.f17239q.getLayout();
        boolean z9 = layout != null && layout.getLineCount() > 1;
        if (!z9 || this.f17242t <= 0 || this.f17240r.getMeasuredWidth() <= this.f17242t) {
            if (!z9) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f17242t = i10;
    }
}
