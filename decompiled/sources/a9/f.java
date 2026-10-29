package a9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public class f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j.a f9971g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f9972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f9973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f9974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f9975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f9976e;

    public static final class a {

        /* JADX INFO: renamed from: a9.f$a$a, reason: collision with other inner class name */
        public static final class C0358a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f9977a;

            C0358a(String str) {
                this.f9977a = str;
            }

            @Override // a9.j.a
            public boolean a(SSLSocket sslSocket) {
                n.h(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                n.g(name, "sslSocket.javaClass.name");
                return E8.i.M(name, this.f9977a + '.', false, 2, null);
            }

            @Override // a9.j.a
            public k b(SSLSocket sslSocket) {
                n.h(sslSocket, "sslSocket");
                return f.f9970f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !n.d(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            n.e(superclass);
            return new f(superclass);
        }

        public final j.a c(String packageName) {
            n.h(packageName, "packageName");
            return new C0358a(packageName);
        }

        public final j.a d() {
            return f.f9971g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f9970f = aVar;
        f9971g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class sslSocketClass) throws NoSuchMethodException {
        n.h(sslSocketClass, "sslSocketClass");
        this.f9972a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        n.g(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f9973b = declaredMethod;
        this.f9974c = sslSocketClass.getMethod("setHostname", String.class);
        this.f9975d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f9976e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // a9.k
    public boolean a(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return this.f9972a.isInstance(sslSocket);
    }

    @Override // a9.k
    public boolean b() {
        return Z8.b.f9519f.b();
    }

    @Override // a9.k
    public String c(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f9975d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, E8.d.f1445b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && n.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // a9.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f9973b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f9974c.invoke(sslSocket, str);
                }
                this.f9976e.invoke(sslSocket, Z8.h.f9546a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
