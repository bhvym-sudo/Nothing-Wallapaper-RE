package p051f0;

import kotlin.jvm.internal.AbstractC1457h;
import p170r.b1;

/* JADX INFO: loaded from: classes.dex */
public interface z extends b1 {
    boolean c();

    public static final class a implements z {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Object f20786q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f20787r;

        public a(Object obj, boolean z9) {
            this.f20786q = obj;
            this.f20787r = z9;
        }

        @Override // p051f0.z
        public boolean c() {
            return this.f20787r;
        }

        @Override // p170r.b1
        public Object getValue() {
            return this.f20786q;
        }

        public /* synthetic */ a(Object obj, boolean z9, int i10, AbstractC1457h abstractC1457h) {
            this(obj, (i10 & 2) != 0 ? true : z9);
        }
    }
}
