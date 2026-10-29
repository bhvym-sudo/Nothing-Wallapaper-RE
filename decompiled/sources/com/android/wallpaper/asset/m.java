package com.android.wallpaper.asset;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.nothing.wallpaper.NTPickerApplication;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class m extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Resources f15905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f15906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RequestOptions f15907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Key f15908j;

    protected static class a implements Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected String f15909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f15910b;

        public a(Resources resources, int i10) {
            try {
                this.f15909a = resources.getResourcePackageName(i10);
            } catch (Exception e10) {
                com.nothing.wallpaper.common.log.c.f("ResourceAsset", "getResourcePackageName error:" + e10.getMessage());
                this.f15909a = "com.nothing.wallpapersstub";
            }
            this.f15910b = i10;
        }

        protected String a() {
            return "PackageResourceKey{packageName=" + this.f15909a + ",resId=" + this.f15910b + '}';
        }

        @Override // com.bumptech.glide.load.Key
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return a().equals(((a) obj).a());
            }
            return false;
        }

        @Override // com.bumptech.glide.load.Key
        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return a();
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(MessageDigest messageDigest) {
            messageDigest.update(a().getBytes(Key.CHARSET));
        }
    }

    public m(Resources resources, int i10, RequestOptions requestOptions) {
        this.f15905g = resources;
        this.f15906h = i10;
        this.f15907i = requestOptions;
    }

    @Override // com.android.wallpaper.asset.o
    public InputStream O() {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = this.f15905g.openRawResource(this.f15906h);
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f("StreamableAsset", "openRawResource error:" + e10.getMessage());
            inputStreamOpenRawResource = null;
        }
        return (!this.f15918e || inputStreamOpenRawResource == null) ? inputStreamOpenRawResource : R(inputStreamOpenRawResource);
    }

    public InputStream R(InputStream inputStream) {
        try {
            byte[] bArr = new byte[12];
            int i10 = inputStream.read(bArr);
            if (i10 != 12) {
                com.nothing.wallpaper.common.log.c.f("StreamableAsset", "decryptInputStream fail, invalid iv length: " + i10);
                inputStream.close();
                return null;
            }
            String strA = p087i6.l.f22204a.a(NTPickerApplication.c());
            if (strA != null && !strA.isEmpty()) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("SHA-256").digest(strA.getBytes(StandardCharsets.UTF_8)), "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, secretKeySpec, new GCMParameterSpec(Optimizer.OPTIMIZATION_GRAPH_WRAP, bArr));
                return new CipherInputStream(inputStream, cipher);
            }
            com.nothing.wallpaper.common.log.c.f("StreamableAsset", "decryptInputStream fail: empty encryption key");
            inputStream.close();
            return null;
        } catch (IOException | GeneralSecurityException e10) {
            com.nothing.wallpaper.common.log.c.g("StreamableAsset", "decryptInputStream fail", e10);
            try {
                inputStream.close();
            } catch (IOException e11) {
                com.nothing.wallpaper.common.log.c.f("StreamableAsset", "Failed to close fis: " + e11.getMessage());
            }
            return null;
        } catch (NoSuchAlgorithmException e12) {
            com.nothing.wallpaper.common.log.c.g("StreamableAsset", "decryptInputStream security exception: missing algorithm", e12);
            try {
                inputStream.close();
            } catch (IOException e13) {
                com.nothing.wallpaper.common.log.c.f("StreamableAsset", "Failed to close fis: " + e13.getMessage());
            }
            return null;
        }
    }

    public Key S() {
        if (this.f15908j == null) {
            this.f15908j = new a(this.f15905g, this.f15906h);
        }
        return this.f15908j;
    }

    int T() {
        return this.f15906h;
    }

    Resources U() {
        return this.f15905g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return S().equals(((m) obj).S());
        }
        return false;
    }

    public int hashCode() {
        return S().hashCode();
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        Glide.with(context).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) this.f15907i.placeholder(new ColorDrawable(i10))).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }

    public m(Resources resources, int i10) {
        this(resources, i10, RequestOptions.centerCropTransform());
    }
}
