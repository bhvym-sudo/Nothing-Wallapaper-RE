package com.android.wallpaper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ToggleButton;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperDownloadButton extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ToggleButton f16138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    View f16139r;

    public WallpaperDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.button_download_wallpaper, (ViewGroup) this, true);
        this.f16138q = (ToggleButton) findViewById(R.id.download_button);
        this.f16139r = findViewById(R.id.action_download_progress);
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

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16138q.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
