package com.google.android.material.timepicker;

import N4.h;
import N4.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p225w4.g;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
abstract class d extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f17637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f17639s;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(g.f28860k, this);
        H.k0(this, c());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29277k5, i10, 0);
        this.f17638r = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f29287l5, 0);
        this.f17637q = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f17636q.h();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(List list, ConstraintSet constraintSet, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(((View) it.next()).getId(), p225w4.e.f28824c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable c() {
        h hVar = new h();
        this.f17639s = hVar;
        hVar.T(new j(0.5f));
        this.f17639s.V(ColorStateList.valueOf(-1));
        return this.f17639s;
    }

    private static boolean g(View view) {
        return "skip".equals(view.getTag());
    }

    private void i() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f17637q);
            handler.post(this.f17637q);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(H.i());
        }
        i();
    }

    int d(int i10) {
        int i11 = this.f17638r;
        return i10 == 2 ? Math.round(i11 * 0.66f) : i11;
    }

    public int e() {
        return this.f17638r;
    }

    public void f(int i10) {
        this.f17638r = i10;
        h();
    }

    protected void h() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != p225w4.e.f28824c && !g(childAt)) {
                int i11 = (Integer) childAt.getTag(p225w4.e.f28834m);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            b((List) entry.getValue(), constraintSet, d(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        i();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f17639s.V(ColorStateList.valueOf(i10));
    }
}
