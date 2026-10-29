package com.android.wallpaper.asset;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;
import java.io.InputStream;
import p014b3.C;

/* JADX INFO: loaded from: classes.dex */
@GlideModule
public class WallpaperGlideModule extends AppGlideModule {
    @Override // com.bumptech.glide.module.AppGlideModule, com.bumptech.glide.module.AppliesOptions
    public void applyOptions(Context context, GlideBuilder glideBuilder) {
        glideBuilder.setDiskCache(new InternalCacheDiskCacheFactory(context, 104857600L));
        glideBuilder.setMemorySizeCalculator(new MemorySizeCalculator.Builder(context).setBitmapPoolScreens(2.0f).setMemoryCacheScreens(1.2f).build());
        glideBuilder.setDefaultRequestOptions(new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888));
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(Context context, Glide glide, Registry registry) {
        registry.append(C.class, Drawable.class, new r.b());
        registry.append(m.class, InputStream.class, new n.b());
        registry.append(p.class, InputStream.class, new q.a());
        registry.append(k.class, Drawable.class, new l.a());
        registry.append(h.class, InputStream.class, new i.b());
        registry.append(Drawable.class, Drawable.class, new p014b3.n());
        registry.append(p077h6.c.class, Drawable.class, new h6.d.a());
        registry.append(S5.a.class, Bitmap.class, new z7.b.a(context.getApplicationContext()));
    }
}
