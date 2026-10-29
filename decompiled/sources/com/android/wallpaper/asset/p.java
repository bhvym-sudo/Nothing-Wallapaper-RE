package com.android.wallpaper.asset;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15919k;

    private static class a extends m.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15920c;

        a(Resources resources, int i10, String str) {
            super(resources, i10);
            this.f15920c = str;
        }

        @Override // com.android.wallpaper.asset.m.a
        protected String a() {
            return "PackageResourceKey{packageName=" + this.f15909a + ",resId=" + this.f15910b + ",resName=" + this.f15920c + '}';
        }
    }

    public p(Resources resources, int i10, String str) {
        super(resources, i10);
        this.f15919k = str;
    }

    @Override // com.android.wallpaper.asset.m
    public Key S() {
        if (this.f15908j == null) {
            this.f15908j = new a(this.f15905g, this.f15906h, this.f15919k);
        }
        return this.f15908j;
    }

    @Override // com.android.wallpaper.asset.a
    public void q(Activity activity, ImageView imageView, int i10, BitmapTransformation bitmapTransformation) {
        Glide.with(activity).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(new MultiTransformation(new FitCenter(), bitmapTransformation)).placeholder(new ColorDrawable(i10))).into(imageView);
    }
}
