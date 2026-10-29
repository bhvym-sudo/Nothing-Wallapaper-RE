package com.android.wallpaper.widget;

import H3.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public final class DuoTabs extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f16092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f16093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final FrameLayout f16094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextView f16095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final FrameLayout f16096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f16098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f16099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f16100y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f16101z;

    public interface a {
        void a(int i10);
    }

    public DuoTabs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004a3.a.f9766m0, 0, 0);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.f16098w = typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.duo_tabs_preview_button_indicator_background);
        this.f16099x = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.duo_tabs_preview_button_background);
        this.f16100y = typedArrayObtainStyledAttributes.getColor(3, getResources().getColor(R.color.text_color_on_accent));
        this.f16101z = typedArrayObtainStyledAttributes.getColor(1, v.a(getContext(), android.R.attr.textColorPrimary));
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(z9 ? R.layout.duo_tabs_short : R.layout.duo_tabs, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.tab_primary);
        this.f16093r = textView;
        TextView textView2 = (TextView) findViewById(R.id.tab_secondary);
        this.f16095t = textView2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.tab_primary_container);
        this.f16094s = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.tab_secondary_container);
        this.f16096u = frameLayout2;
        if (frameLayout == null || frameLayout2 == null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: I3.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3015q.g(view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: I3.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3016q.h(view);
                }
            });
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: I3.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3013q.e(view);
                }
            });
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: I3.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3014q.f(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        i(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        i(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        i(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        i(1);
    }

    private void k(int i10) {
        this.f16093r.setBackgroundResource(i10 == 0 ? this.f16098w : this.f16099x);
        this.f16093r.setTextColor(i10 == 0 ? this.f16100y : this.f16101z);
        FrameLayout frameLayout = this.f16094s;
        if (frameLayout != null) {
            frameLayout.setSelected(i10 == 0);
        } else {
            this.f16093r.setSelected(i10 == 0);
        }
        this.f16095t.setBackgroundResource(i10 == 1 ? this.f16098w : this.f16099x);
        this.f16095t.setTextColor(i10 == 1 ? this.f16100y : this.f16101z);
        FrameLayout frameLayout2 = this.f16096u;
        if (frameLayout2 != null) {
            frameLayout2.setSelected(i10 == 1);
        } else {
            this.f16095t.setSelected(i10 == 1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public int getSelectedTab() {
        return this.f16097v;
    }

    public void i(int i10) {
        k(i10);
        a aVar = this.f16092q;
        if (aVar != null) {
            aVar.a(i10);
        }
        this.f16097v = i10;
    }

    public void j(String str, String str2) {
        this.f16093r.setText(str);
        this.f16095t.setText(str2);
    }

    public void setOnTabSelectedListener(a aVar) {
        this.f16092q = aVar;
    }
}
