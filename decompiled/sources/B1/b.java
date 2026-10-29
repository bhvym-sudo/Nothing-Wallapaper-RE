package B1;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f338a;

        public a(Throwable th) {
            super(null);
            this.f338a = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && n.d(this.f338a, ((a) obj).f338a);
        }

        public int hashCode() {
            Throwable th = this.f338a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f338a + ")";
        }
    }

    /* JADX INFO: renamed from: B1.b$b, reason: collision with other inner class name */
    public static final class C0014b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f339a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0014b(List options) {
            super(null);
            n.h(options, "options");
            this.f339a = options;
        }

        public final List a() {
            return this.f339a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0014b) && n.d(this.f339a, ((C0014b) obj).f339a);
        }

        public int hashCode() {
            return this.f339a.hashCode();
        }

        public String toString() {
            return "Loaded(options=" + this.f339a + ")";
        }
    }

    public /* synthetic */ b(AbstractC1457h abstractC1457h) {
        this();
    }

    private b() {
    }
}
