package com.android.wallpaper.widget;

import android.app.WallpaperInfo;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p064g3.x;

/* JADX INFO: loaded from: classes.dex */
public class WallpaperInfoView extends LinearLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final ExecutorService f16140u = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f16141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f16142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f16143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Button f16144t;

    public WallpaperInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(List list, x xVar, boolean z9, CharSequence charSequence, View.OnClickListener onClickListener) {
        this.f16141q.setText((CharSequence) null);
        this.f16142r.setText((CharSequence) null);
        this.f16142r.setVisibility(8);
        this.f16143s.setText((CharSequence) null);
        this.f16143s.setVisibility(8);
        this.f16144t.setText((CharSequence) null);
        this.f16144t.setOnClickListener(null);
        this.f16144t.setVisibility(8);
        if (list.size() > 0 && list.get(0) != null) {
            this.f16141q.setText((CharSequence) list.get(0));
        }
        if (f(xVar)) {
            if (list.size() > 1 && list.get(1) != null) {
                this.f16142r.setVisibility(0);
                this.f16142r.setText((CharSequence) list.get(1));
            }
            if (list.size() > 2 && list.get(2) != null) {
                this.f16143s.setVisibility(0);
                this.f16143s.setText((CharSequence) list.get(2));
            }
            if (z9) {
                this.f16144t.setVisibility(0);
                this.f16144t.setText(charSequence);
                this.f16144t.setOnClickListener(onClickListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final x xVar, final boolean z9, final CharSequence charSequence, final View.OnClickListener onClickListener) {
        final List listE = xVar.e(getContext());
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: I3.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3031q.c(listE, xVar, z9, charSequence, onClickListener);
            }
        });
    }

    private boolean f(x xVar) {
        WallpaperInfo wallpaperInfoQ = xVar.q();
        return wallpaperInfoQ == null || wallpaperInfoQ.getShowMetadataInPreview();
    }

    public void e(final x xVar, final CharSequence charSequence, final boolean z9, final View.OnClickListener onClickListener) {
        f16140u.execute(new Runnable() { // from class: I3.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f3026q.d(xVar, z9, charSequence, onClickListener);
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16141q = (TextView) findViewById(R.id.wallpaper_info_title);
        this.f16142r = (TextView) findViewById(R.id.wallpaper_info_subtitle1);
        this.f16143s = (TextView) findViewById(R.id.wallpaper_info_subtitle2);
        this.f16144t = (Button) findViewById(R.id.wallpaper_info_explore_button);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.generateLayoutParams(layoutParams);
    }
}
