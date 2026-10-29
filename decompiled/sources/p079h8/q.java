package p079h8;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f21862r = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f21863q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Throwable f21864q;

        public b(Throwable exception) {
            n.h(exception, "exception");
            this.f21864q = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && n.d(this.f21864q, ((b) obj).f21864q);
        }

        public int hashCode() {
            return this.f21864q.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f21864q + ')';
        }
    }

    private /* synthetic */ q(Object obj) {
        this.f21863q = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof q) && n.d(obj, ((q) obj2).h());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f21864q;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static String g(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f21863q, obj);
    }

    public final /* synthetic */ Object h() {
        return this.f21863q;
    }

    public int hashCode() {
        return e(this.f21863q);
    }

    public String toString() {
        return g(this.f21863q);
    }
}
