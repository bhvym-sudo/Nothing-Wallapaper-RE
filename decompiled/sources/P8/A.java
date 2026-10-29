package P8;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public enum A {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f6070r = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f6078q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final A a(String protocol) throws IOException {
            kotlin.jvm.internal.n.h(protocol, "protocol");
            A a10 = A.HTTP_1_0;
            if (kotlin.jvm.internal.n.d(protocol, a10.f6078q)) {
                return a10;
            }
            A a11 = A.HTTP_1_1;
            if (kotlin.jvm.internal.n.d(protocol, a11.f6078q)) {
                return a11;
            }
            A a12 = A.H2_PRIOR_KNOWLEDGE;
            if (kotlin.jvm.internal.n.d(protocol, a12.f6078q)) {
                return a12;
            }
            A a13 = A.HTTP_2;
            if (kotlin.jvm.internal.n.d(protocol, a13.f6078q)) {
                return a13;
            }
            A a14 = A.SPDY_3;
            if (kotlin.jvm.internal.n.d(protocol, a14.f6078q)) {
                return a14;
            }
            A a15 = A.QUIC;
            if (kotlin.jvm.internal.n.d(protocol, a15.f6078q)) {
                return a15;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }
    }

    A(String str) {
        this.f6078q = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6078q;
    }
}
