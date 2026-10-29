package p014b3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import java.io.File;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q extends RequestBuilder implements Cloneable {
    q(Class cls, RequestBuilder requestBuilder) {
        super(cls, requestBuilder);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public q fallback(Drawable drawable) {
        return (q) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public q fitCenter() {
        return (q) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public q format(DecodeFormat decodeFormat) {
        return (q) super.format(decodeFormat);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public q frame(long j9) {
        return (q) super.frame(j9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public q getDownloadOnlyRequest() {
        return new q(File.class, this).apply(RequestBuilder.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public q listener(RequestListener requestListener) {
        return (q) super.listener(requestListener);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public q load(Bitmap bitmap) {
        return (q) super.load(bitmap);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public q load(Drawable drawable) {
        return (q) super.load(drawable);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public q load(Uri uri) {
        return (q) super.load(uri);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public q load(File file) {
        return (q) super.load(file);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public q load(Integer num) {
        return (q) super.load(num);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public q load(Object obj) {
        return (q) super.load(obj);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public q load(String str) {
        return (q) super.load(str);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public q load(URL url) {
        return (q) super.load(url);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public q load(byte[] bArr) {
        return (q) super.load(bArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public q lock() {
        return (q) super.lock();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public q onlyRetrieveFromCache(boolean z9) {
        return (q) super.onlyRetrieveFromCache(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public q optionalCenterCrop() {
        return (q) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public q optionalCenterInside() {
        return (q) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public q optionalCircleCrop() {
        return (q) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public q optionalFitCenter() {
        return (q) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public q optionalTransform(Transformation transformation) {
        return (q) super.optionalTransform(transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public q optionalTransform(Class cls, Transformation transformation) {
        return (q) super.optionalTransform(cls, transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public q override(int i10) {
        return (q) super.override(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public q override(int i10, int i11) {
        return (q) super.override(i10, i11);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public q placeholder(int i10) {
        return (q) super.placeholder(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public q placeholder(Drawable drawable) {
        return (q) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public q addListener(RequestListener requestListener) {
        return (q) super.addListener(requestListener);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public q priority(Priority priority) {
        return (q) super.priority(priority);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q apply(BaseRequestOptions baseRequestOptions) {
        return (q) super.apply((BaseRequestOptions<?>) baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public q set(Option option, Object obj) {
        return (q) super.set(option, obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public q autoClone() {
        return (q) super.autoClone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public q signature(Key key) {
        return (q) super.signature(key);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public q sizeMultiplier(float f10) {
        return (q) super.sizeMultiplier(f10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public q skipMemoryCache(boolean z9) {
        return (q) super.skipMemoryCache(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public q centerCrop() {
        return (q) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public q theme(Resources.Theme theme) {
        return (q) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q centerInside() {
        return (q) super.centerInside();
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public q thumbnail(float f10) {
        return (q) super.thumbnail(f10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public q circleCrop() {
        return (q) super.circleCrop();
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public q thumbnail(RequestBuilder requestBuilder) {
        return (q) super.thumbnail(requestBuilder);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public q mo15clone() {
        return (q) super.mo15clone();
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public q thumbnail(List list) {
        return (q) super.thumbnail(list);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public q decode(Class cls) {
        return (q) super.decode(cls);
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final q thumbnail(RequestBuilder... requestBuilderArr) {
        return (q) super.thumbnail(requestBuilderArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public q disallowHardwareConfig() {
        return (q) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public q timeout(int i10) {
        return (q) super.timeout(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public q diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        return (q) super.diskCacheStrategy(diskCacheStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public q transform(Transformation transformation) {
        return (q) super.transform((Transformation<Bitmap>) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public q dontAnimate() {
        return (q) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public q transform(Class cls, Transformation transformation) {
        return (q) super.transform(cls, transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public q dontTransform() {
        return (q) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public q transform(Transformation... transformationArr) {
        return (q) super.transform((Transformation<Bitmap>[]) transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public q downsample(DownsampleStrategy downsampleStrategy) {
        return (q) super.downsample(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public q transforms(Transformation... transformationArr) {
        return (q) super.transforms(transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public q encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (q) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public q transition(TransitionOptions transitionOptions) {
        return (q) super.transition(transitionOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public q encodeQuality(int i10) {
        return (q) super.encodeQuality(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public q useAnimationPool(boolean z9) {
        return (q) super.useAnimationPool(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public q error(int i10) {
        return (q) super.error(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public q useUnlimitedSourceGeneratorsPool(boolean z9) {
        return (q) super.useUnlimitedSourceGeneratorsPool(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public q error(Drawable drawable) {
        return (q) super.error(drawable);
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public q error(RequestBuilder requestBuilder) {
        return (q) super.error(requestBuilder);
    }

    @Override // com.bumptech.glide.RequestBuilder
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public q error(Object obj) {
        return (q) super.error(obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public q fallback(int i10) {
        return (q) super.fallback(i10);
    }

    q(Glide glide, RequestManager requestManager, Class cls, Context context) {
        super(glide, requestManager, cls, context);
    }
}
