package p014b3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class r extends RequestManager {
    public r(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        super(glide, lifecycle, requestManagerTreeNode, context);
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r addDefaultRequestListener(RequestListener requestListener) {
        return (r) super.addDefaultRequestListener(requestListener);
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized r applyDefaultRequestOptions(RequestOptions requestOptions) {
        return (r) super.applyDefaultRequestOptions(requestOptions);
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public q as(Class cls) {
        return new q(this.glide, this, cls, this.context);
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q asBitmap() {
        return (q) super.asBitmap();
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public q asDrawable() {
        return (q) super.asDrawable();
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public q asFile() {
        return (q) super.asFile();
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q asGif() {
        return (q) super.asGif();
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized r clearOnStop() {
        return (r) super.clearOnStop();
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q download(Object obj) {
        return (q) super.download(obj);
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public q downloadOnly() {
        return (q) super.downloadOnly();
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public q load(Bitmap bitmap) {
        return (q) super.load(bitmap);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public q load(Drawable drawable) {
        return (q) super.load(drawable);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public q load(Uri uri) {
        return (q) super.load(uri);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public q load(File file) {
        return (q) super.load(file);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public q load(Integer num) {
        return (q) super.load(num);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public q load(Object obj) {
        return (q) super.load(obj);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public q load(String str) {
        return (q) super.load(str);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public q load(URL url) {
        return (q) super.load(url);
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public q load(byte[] bArr) {
        return (q) super.load(bArr);
    }

    @Override // com.bumptech.glide.RequestManager
    protected void setRequestOptions(RequestOptions requestOptions) {
        if (requestOptions instanceof p) {
            super.setRequestOptions(requestOptions);
        } else {
            super.setRequestOptions(new p().apply(requestOptions));
        }
    }

    @Override // com.bumptech.glide.RequestManager
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public synchronized r setDefaultRequestOptions(RequestOptions requestOptions) {
        return (r) super.setDefaultRequestOptions(requestOptions);
    }
}
