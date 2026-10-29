package Z8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f9532i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f9533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f9534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f9535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f9536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f9537h;

    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9540c;

        public a(List protocols) {
            n.h(protocols, "protocols");
            this.f9538a = protocols;
        }

        public final String a() {
            return this.f9540c;
        }

        public final boolean b() {
            return this.f9539b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            n.h(proxy, "proxy");
            n.h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (n.d(name, "supports") && n.d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (n.d(name, "unsupported") && n.d(Void.TYPE, returnType)) {
                this.f9539b = true;
                return null;
            }
            if (n.d(name, "protocols") && objArr.length == 0) {
                return this.f9538a;
            }
            if ((n.d(name, "selectProtocol") || n.d(name, "select")) && n.d(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    n.f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            n.f(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (this.f9538a.contains(str)) {
                                this.f9540c = str;
                                return str;
                            }
                            if (i10 != size) {
                                i10++;
                            }
                        }
                    }
                    String str2 = (String) this.f9538a.get(0);
                    this.f9540c = str2;
                    return str2;
                }
            }
            if ((!n.d(name, "protocolSelected") && !n.d(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            n.f(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f9540c = (String) obj3;
            return null;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final h a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                n.g(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                n.g(putMethod, "putMethod");
                n.g(getMethod, "getMethod");
                n.g(removeMethod, "removeMethod");
                n.g(clientProviderClass, "clientProviderClass");
                n.g(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private b() {
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        n.h(putMethod, "putMethod");
        n.h(getMethod, "getMethod");
        n.h(removeMethod, "removeMethod");
        n.h(clientProviderClass, "clientProviderClass");
        n.h(serverProviderClass, "serverProviderClass");
        this.f9533d = putMethod;
        this.f9534e = getMethod;
        this.f9535f = removeMethod;
        this.f9536g = clientProviderClass;
        this.f9537h = serverProviderClass;
    }

    @Override // Z8.h
    public void b(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        try {
            this.f9535f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // Z8.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        try {
            this.f9533d.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f9536g, this.f9537h}, new a(h.f9546a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // Z8.h
    public String g(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f9534e.invoke(null, sslSocket));
            n.f(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
