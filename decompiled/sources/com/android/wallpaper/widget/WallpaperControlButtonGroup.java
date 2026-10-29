package com.android.wallpaper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import android.widget.ToggleButton;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperControlButtonGroup extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int[] f16131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ToggleButton f16132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ToggleButton f16133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ToggleButton f16134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ToggleButton f16135u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ToggleButton f16136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ToggleButton f16137w;

    public WallpaperControlButtonGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16131q = new int[]{2, 3, 5, 4};
        LayoutInflater.from(context).inflate(R.layout.wallpaper_control_button_group, (ViewGroup) this, true);
        this.f16132r = (ToggleButton) findViewById(R.id.delete_button);
        this.f16133s = (ToggleButton) findViewById(R.id.edit_button);
        this.f16134t = (ToggleButton) findViewById(R.id.customize_button);
        this.f16135u = (ToggleButton) findViewById(R.id.effects_button);
        this.f16136v = (ToggleButton) findViewById(R.id.share_button);
        this.f16137w = (ToggleButton) findViewById(R.id.information_button);
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
}
