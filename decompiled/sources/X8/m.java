package X8;

import androidx.constraintlayout.core.widgets.Optimizer;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9220c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f9222b = new int[10];

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f9222b[i10];
    }

    public final int b() {
        if ((this.f9221a & 2) != 0) {
            return this.f9222b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f9221a & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            return this.f9222b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f9221a & 16) != 0 ? this.f9222b[4] : SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public final int e(int i10) {
        return (this.f9221a & 32) != 0 ? this.f9222b[5] : i10;
    }

    public final boolean f(int i10) {
        return (this.f9221a & (1 << i10)) != 0;
    }

    public final void g(m other) {
        kotlin.jvm.internal.n.h(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f9222b;
            if (i10 < iArr.length) {
                this.f9221a = (1 << i10) | this.f9221a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f9221a);
    }
}
