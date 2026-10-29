package p014b3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o extends com.android.wallpaper.asset.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f14850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RequestOptions f14851h;

    public o(File file) {
        this(file, RequestOptions.centerCropTransform());
    }

    @Override // com.android.wallpaper.asset.o
    public InputStream O() {
        try {
            return new FileInputStream(this.f14850g.getAbsolutePath());
        } catch (FileNotFoundException e10) {
            Log.w("FileAsset", "Image file not found", e10);
            return null;
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        Glide.with(context).asDrawable().load(this.f14850g).apply((BaseRequestOptions<?>) this.f14851h.placeholder(new ColorDrawable(i10))).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }

    public o(File file, RequestOptions requestOptions) {
        this.f14850g = file;
        this.f14851h = requestOptions;
    }
}
