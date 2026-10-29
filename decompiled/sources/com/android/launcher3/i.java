package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Property f15606i = new a(Float.TYPE, "value");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f15607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f15608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f15609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueAnimator f15610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f15611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15612f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f15613g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f15614h = 0;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(i iVar) {
            return Float.valueOf(iVar.f15611e);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, Float f10) {
            iVar.f15611e = f10.floatValue();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f15614h = 0;
        }
    }

    public i(long j9, float f10, float f11) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<i, Float>) f15606i, f10, f11).setDuration(j9);
        this.f15610d = duration;
        this.f15607a = j9;
        this.f15608b = f10;
        this.f15609c = f11;
        duration.addListener(new b());
    }

    private void c(int i10) {
        long currentPlayTime = this.f15610d.getCurrentPlayTime();
        float f10 = i10 == 1 ? this.f15609c : this.f15608b;
        float f11 = this.f15612f ? this.f15608b : this.f15611e;
        f();
        this.f15614h = i10;
        long j9 = this.f15607a;
        this.f15610d.setDuration(Math.max(0L, Math.min(j9 - currentPlayTime, j9)));
        this.f15610d.setFloatValues(f11, f10);
        this.f15610d.start();
        this.f15612f = false;
    }

    public void d() {
        c(1);
    }

    public void e() {
        c(2);
    }

    public void f() {
        this.f15610d.cancel();
        this.f15614h = 0;
    }

    public ValueAnimator g() {
        return this.f15610d;
    }
}
