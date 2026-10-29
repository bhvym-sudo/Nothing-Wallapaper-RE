package a9;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f9988j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f9989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f9990i;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String packageName) {
            n.h(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                n.f(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                n.f(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                n.g(paramsClass, "paramsClass");
                return new l(cls, cls2, paramsClass);
            } catch (Exception e10) {
                Z8.h.f9546a.g().j("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        n.h(sslSocketClass, "sslSocketClass");
        n.h(sslSocketFactoryClass, "sslSocketFactoryClass");
        n.h(paramClass, "paramClass");
        this.f9989h = sslSocketFactoryClass;
        this.f9990i = paramClass;
    }
}
