package p014b3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

/* JADX INFO: loaded from: classes.dex */
public final class p extends RequestOptions implements Cloneable {
    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p frame(long j9) {
        return (p) super.frame(j9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public p lock() {
        return (p) super.lock();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p onlyRetrieveFromCache(boolean z9) {
        return (p) super.onlyRetrieveFromCache(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p optionalCenterCrop() {
        return (p) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public p optionalCenterInside() {
        return (p) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public p optionalCircleCrop() {
        return (p) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public p optionalFitCenter() {
        return (p) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public p optionalTransform(Transformation transformation) {
        return (p) super.optionalTransform(transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public p optionalTransform(Class cls, Transformation transformation) {
        return (p) super.optionalTransform(cls, transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public p override(int i10) {
        return (p) super.override(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public p override(int i10, int i11) {
        return (p) super.override(i10, i11);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public p placeholder(int i10) {
        return (p) super.placeholder(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public p placeholder(Drawable drawable) {
        return (p) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public p priority(Priority priority) {
        return (p) super.priority(priority);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public p set(Option option, Object obj) {
        return (p) super.set(option, obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public p signature(Key key) {
        return (p) super.signature(key);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public p sizeMultiplier(float f10) {
        return (p) super.sizeMultiplier(f10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public p skipMemoryCache(boolean z9) {
        return (p) super.skipMemoryCache(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public p theme(Resources.Theme theme) {
        return (p) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public p timeout(int i10) {
        return (p) super.timeout(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public p transform(Transformation transformation) {
        return (p) super.transform((Transformation<Bitmap>) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public p transform(Class cls, Transformation transformation) {
        return (p) super.transform(cls, transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final p transform(Transformation... transformationArr) {
        return (p) super.transform((Transformation<Bitmap>[]) transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final p transforms(Transformation... transformationArr) {
        return (p) super.transforms(transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public p useAnimationPool(boolean z9) {
        return (p) super.useAnimationPool(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public p useUnlimitedSourceGeneratorsPool(boolean z9) {
        return (p) super.useUnlimitedSourceGeneratorsPool(z9);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p apply(BaseRequestOptions baseRequestOptions) {
        return (p) super.apply(baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p autoClone() {
        return (p) super.autoClone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p centerCrop() {
        return (p) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p centerInside() {
        return (p) super.centerInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p circleCrop() {
        return (p) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p mo15clone() {
        return (p) super.mo15clone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public p decode(Class cls) {
        return (p) super.decode(cls);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p disallowHardwareConfig() {
        return (p) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public p diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        return (p) super.diskCacheStrategy(diskCacheStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public p dontAnimate() {
        return (p) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p dontTransform() {
        return (p) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p downsample(DownsampleStrategy downsampleStrategy) {
        return (p) super.downsample(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (p) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p encodeQuality(int i10) {
        return (p) super.encodeQuality(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public p error(int i10) {
        return (p) super.error(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public p error(Drawable drawable) {
        return (p) super.error(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p fallback(int i10) {
        return (p) super.fallback(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public p fallback(Drawable drawable) {
        return (p) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public p fitCenter() {
        return (p) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public p format(DecodeFormat decodeFormat) {
        return (p) super.format(decodeFormat);
    }
}
