package L0;

import F8.InterfaceC0841v;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p219v8.p f4517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0841v f4518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f4519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p129m8.i f4520d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p219v8.p transform, InterfaceC0841v ack, D d10, p129m8.i callerContext) {
            super(null);
            kotlin.jvm.internal.n.h(transform, "transform");
            kotlin.jvm.internal.n.h(ack, "ack");
            kotlin.jvm.internal.n.h(callerContext, "callerContext");
            this.f4517a = transform;
            this.f4518b = ack;
            this.f4519c = d10;
            this.f4520d = callerContext;
        }

        public final InterfaceC0841v a() {
            return this.f4518b;
        }

        public final p129m8.i b() {
            return this.f4520d;
        }

        public D c() {
            return this.f4519c;
        }

        public final p219v8.p d() {
            return this.f4517a;
        }
    }

    public /* synthetic */ w(AbstractC1457h abstractC1457h) {
        this();
    }

    private w() {
    }
}
