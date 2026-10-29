package com.android.wallpaper.widget.floatingsheetcontent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperInfoView extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ExecutorService f16145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f16146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f16147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f16148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Button f16149u;

    public WallpaperInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16145q = Executors.newCachedThreadPool();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16146r = (TextView) findViewById(R.id.wallpaper_info_title);
        this.f16147s = (TextView) findViewById(R.id.wallpaper_info_subtitle1);
        this.f16148t = (TextView) findViewById(R.id.wallpaper_info_subtitle2);
        this.f16149u = (Button) findViewById(R.id.wallpaper_info_explore_button);
    }
}
