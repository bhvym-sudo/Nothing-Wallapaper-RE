package androidx.graphics.path;

import V0.a;
import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* JADX INFO: loaded from: classes.dex */
public final class PathIteratorPreApi34Impl extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13255b;

    private final native long createInternalPathIterator(Path path, int i10, float f10);

    private final native void destroyInternalPathIterator(long j9);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j9);

    @FastNative
    private final native int internalPathIteratorNext(long j9, float[] fArr, int i10);

    @FastNative
    private final native int internalPathIteratorPeek(long j9);

    @FastNative
    private final native int internalPathIteratorRawSize(long j9);

    @FastNative
    private final native int internalPathIteratorSize(long j9);

    protected final void finalize() {
        destroyInternalPathIterator(this.f13255b);
    }
}
