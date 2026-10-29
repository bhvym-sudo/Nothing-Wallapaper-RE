package c9;

import Z8.h;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15253a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a(X509TrustManager trustManager) {
            n.h(trustManager, "trustManager");
            return h.f9546a.g().c(trustManager);
        }

        private a() {
        }
    }

    public abstract List a(List list, String str);
}
