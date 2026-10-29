package D6;

import android.graphics.PointF;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: D6.a$a, reason: collision with other inner class name */
    public static final class C0036a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0036a f965a = new C0036a();

        private C0036a() {
            super(null);
        }

        public String toString() {
            return "Raw";
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PointF f967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, PointF center) {
            super(null);
            kotlin.jvm.internal.n.h(center, "center");
            this.f966a = f10;
            this.f967b = center;
        }

        public final PointF a() {
            return this.f967b;
        }

        public final float b() {
            return this.f966a;
        }

        public String toString() {
            return "Scope(scale=" + this.f966a + ", center=" + this.f967b + ")";
        }
    }

    public /* synthetic */ a(AbstractC1457h abstractC1457h) {
        this();
    }

    private a() {
    }
}
