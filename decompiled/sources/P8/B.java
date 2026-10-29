package P8;

import java.util.LinkedHashMap;
import java.util.Map;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f6079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f6081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C f6082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f6083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0938d f6084f;

    public B(v url, String method, u headers, C c10, Map tags) {
        kotlin.jvm.internal.n.h(url, "url");
        kotlin.jvm.internal.n.h(method, "method");
        kotlin.jvm.internal.n.h(headers, "headers");
        kotlin.jvm.internal.n.h(tags, "tags");
        this.f6079a = url;
        this.f6080b = method;
        this.f6081c = headers;
        this.f6082d = c10;
        this.f6083e = tags;
    }

    public final C a() {
        return this.f6082d;
    }

    public final C0938d b() {
        C0938d c0938d = this.f6084f;
        if (c0938d != null) {
            return c0938d;
        }
        C0938d c0938dB = C0938d.f6159n.b(this.f6081c);
        this.f6084f = c0938dB;
        return c0938dB;
    }

    public final Map c() {
        return this.f6083e;
    }

    public final String d(String name) {
        kotlin.jvm.internal.n.h(name, "name");
        return this.f6081c.a(name);
    }

    public final u e() {
        return this.f6081c;
    }

    public final boolean f() {
        return this.f6079a.j();
    }

    public final String g() {
        return this.f6080b;
    }

    public final a h() {
        return new a(this);
    }

    public final Object i(Class type) {
        kotlin.jvm.internal.n.h(type, "type");
        return type.cast(this.f6083e.get(type));
    }

    public final v j() {
        return this.f6079a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f6080b);
        sb.append(", url=");
        sb.append(this.f6079a);
        if (this.f6081c.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f6081c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1444s.t();
                }
                p079h8.o oVar = (p079h8.o) obj;
                String str = (String) oVar.a();
                String str2 = (String) oVar.b();
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        if (!this.f6083e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f6083e);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v f6085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u.a f6087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C f6088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f6089e;

        public a() {
            this.f6089e = new LinkedHashMap();
            this.f6086b = "GET";
            this.f6087c = new u.a();
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            this.f6087c.a(name, value);
            return this;
        }

        public B b() {
            v vVar = this.f6085a;
            if (vVar != null) {
                return new B(vVar, this.f6086b, this.f6087c.f(), this.f6088d, Q8.d.T(this.f6089e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            this.f6087c.i(name, value);
            return this;
        }

        public a d(u headers) {
            kotlin.jvm.internal.n.h(headers, "headers");
            this.f6087c = headers.f();
            return this;
        }

        public a e(String method, C c10) {
            kotlin.jvm.internal.n.h(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (c10 == null) {
                if (V8.f.d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!V8.f.a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f6086b = method;
            this.f6088d = c10;
            return this;
        }

        public a f(String name) {
            kotlin.jvm.internal.n.h(name, "name");
            this.f6087c.h(name);
            return this;
        }

        public a g(Class type, Object obj) {
            kotlin.jvm.internal.n.h(type, "type");
            if (obj == null) {
                this.f6089e.remove(type);
                return this;
            }
            if (this.f6089e.isEmpty()) {
                this.f6089e = new LinkedHashMap();
            }
            Map map = this.f6089e;
            Object objCast = type.cast(obj);
            kotlin.jvm.internal.n.e(objCast);
            map.put(type, objCast);
            return this;
        }

        public a h(v url) {
            kotlin.jvm.internal.n.h(url, "url");
            this.f6085a = url;
            return this;
        }

        public a(B request) {
            Map mapR;
            kotlin.jvm.internal.n.h(request, "request");
            this.f6089e = new LinkedHashMap();
            this.f6085a = request.j();
            this.f6086b = request.g();
            this.f6088d = request.a();
            if (request.c().isEmpty()) {
                mapR = new LinkedHashMap();
            } else {
                mapR = N.r(request.c());
            }
            this.f6089e = mapR;
            this.f6087c = request.e().f();
        }
    }
}
