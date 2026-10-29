package p071h0;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21566b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale f21567a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public d(Locale locale) {
        this.f21567a = locale;
    }

    public final Locale a() {
        return this.f21567a;
    }

    public final String b() {
        return h.a(this.f21567a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return n.d(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    public d(String str) {
        this(g.a().a(str));
    }
}
