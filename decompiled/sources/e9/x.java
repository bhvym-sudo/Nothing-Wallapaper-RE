package e9;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f20314a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20315b = ArrayPool.STANDARD_BUFFER_SIZE_BYTES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w f20316c = new w(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f20318e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20317d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f20318e = atomicReferenceArr;
    }

    private x() {
    }

    private final AtomicReference a() {
        return f20318e[(int) (Thread.currentThread().getId() & (((long) f20317d) - 1))];
    }

    public static final void b(w segment) {
        kotlin.jvm.internal.n.h(segment, "segment");
        if (segment.f20312f != null || segment.f20313g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f20310d) {
            return;
        }
        AtomicReference atomicReferenceA = f20314a.a();
        w wVar = f20316c;
        w wVar2 = (w) atomicReferenceA.getAndSet(wVar);
        if (wVar2 == wVar) {
            return;
        }
        int i10 = wVar2 != null ? wVar2.f20309c : 0;
        if (i10 >= f20315b) {
            atomicReferenceA.set(wVar2);
            return;
        }
        segment.f20312f = wVar2;
        segment.f20308b = 0;
        segment.f20309c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final w c() {
        AtomicReference atomicReferenceA = f20314a.a();
        w wVar = f20316c;
        w wVar2 = (w) atomicReferenceA.getAndSet(wVar);
        if (wVar2 == wVar) {
            return new w();
        }
        if (wVar2 == null) {
            atomicReferenceA.set(null);
            return new w();
        }
        atomicReferenceA.set(wVar2.f20312f);
        wVar2.f20312f = null;
        wVar2.f20309c = 0;
        return wVar2;
    }
}
