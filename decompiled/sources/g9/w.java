package g9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f21505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P8.v f21506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f21507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P8.u f21509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P8.x f21510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f21513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s[] f21514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f21515l;

    static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Pattern f21516y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Pattern f21517z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y f21518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f21519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Method f21520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Annotation[] f21521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Annotation[][] f21522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Type[] f21523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f21524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f21525h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f21526i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f21527j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f21528k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f21529l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f21530m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f21531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f21532o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f21533p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f21534q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f21535r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        String f21536s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        P8.u f21537t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        P8.x f21538u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Set f21539v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        s[] f21540w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f21541x;

        a(y yVar, Class cls, Method method) {
            this.f21518a = yVar;
            this.f21519b = cls;
            this.f21520c = method;
            this.f21521d = method.getAnnotations();
            this.f21523f = method.getGenericParameterTypes();
            this.f21522e = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private P8.u c(String[] strArr, boolean z9) {
            P8.u.a aVar = new P8.u.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw C.n(this.f21520c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f21538u = P8.x.d(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw C.o(this.f21520c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z9) {
                    aVar.e(strSubstring, strTrim);
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.f();
        }

        private void d(String str, String str2, boolean z9) {
            String str3 = this.f21532o;
            if (str3 != null) {
                throw C.n(this.f21520c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f21532o = str;
            this.f21533p = z9;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f21516y.matcher(strSubstring).find()) {
                    throw C.n(this.f21520c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f21536s = str2;
            this.f21539v = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof i9.b) {
                d("DELETE", ((i9.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof i9.f) {
                d("GET", ((i9.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof i9.g) {
                d("HEAD", ((i9.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof i9.n) {
                d("PATCH", ((i9.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof i9.o) {
                d("POST", ((i9.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof i9.p) {
                d("PUT", ((i9.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof i9.m) {
                d("OPTIONS", ((i9.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof i9.h) {
                i9.h hVar = (i9.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof i9.k) {
                i9.k kVar = (i9.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw C.n(this.f21520c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f21537t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof i9.l) {
                if (this.f21534q) {
                    throw C.n(this.f21520c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21535r = true;
            } else if (annotation instanceof i9.e) {
                if (this.f21535r) {
                    throw C.n(this.f21520c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f21534q = true;
            }
        }

        private s f(int i10, Type type, Annotation[] annotationArr, boolean z9) {
            s sVar;
            if (annotationArr != null) {
                sVar = null;
                for (Annotation annotation : annotationArr) {
                    s sVarG = g(i10, type, annotationArr, annotation);
                    if (sVarG != null) {
                        if (sVar != null) {
                            throw C.p(this.f21520c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        sVar = sVarG;
                    }
                }
            } else {
                sVar = null;
            }
            if (sVar != null) {
                return sVar;
            }
            if (z9) {
                try {
                    if (C.h(type) == p129m8.e.class) {
                        this.f21541x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C.p(this.f21520c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private s g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof i9.y) {
                j(i10, type);
                if (this.f21531n) {
                    throw C.p(this.f21520c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f21527j) {
                    throw C.p(this.f21520c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21528k) {
                    throw C.p(this.f21520c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21529l) {
                    throw C.p(this.f21520c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21530m) {
                    throw C.p(this.f21520c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21536s != null) {
                    throw C.p(this.f21520c, i10, "@Url cannot be used with @%s URL", this.f21532o);
                }
                this.f21531n = true;
                if (type == P8.v.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new s.p(this.f21520c, i10);
                }
                throw C.p(this.f21520c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof i9.s) {
                j(i10, type);
                if (this.f21528k) {
                    throw C.p(this.f21520c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f21529l) {
                    throw C.p(this.f21520c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f21530m) {
                    throw C.p(this.f21520c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f21531n) {
                    throw C.p(this.f21520c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f21536s == null) {
                    throw C.p(this.f21520c, i10, "@Path can only be used with relative url on @%s", this.f21532o);
                }
                this.f21527j = true;
                i9.s sVar = (i9.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new s.k(this.f21520c, i10, strValue, this.f21518a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof i9.t) {
                j(i10, type);
                i9.t tVar = (i9.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class clsH = C.h(type);
                this.f21528k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new s.l(strValue2, this.f21518a.i(type, annotationArr), zEncoded);
                    }
                    return new s.l(strValue2, this.f21518a.i(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.l(strValue2, this.f21518a.i(C.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw C.p(this.f21520c, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof i9.v) {
                j(i10, type);
                boolean zEncoded2 = ((i9.v) annotation).encoded();
                Class clsH2 = C.h(type);
                this.f21529l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new s.n(this.f21518a.i(type, annotationArr), zEncoded2);
                    }
                    return new s.n(this.f21518a.i(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.n(this.f21518a.i(C.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw C.p(this.f21520c, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof i9.u) {
                j(i10, type);
                Class clsH3 = C.h(type);
                this.f21530m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw C.p(this.f21520c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = C.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw C.p(this.f21520c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = C.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new s.m(this.f21520c, i10, this.f21518a.i(C.g(1, parameterizedType), annotationArr), ((i9.u) annotation).encoded());
                }
                throw C.p(this.f21520c, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof i9.i) {
                j(i10, type);
                i9.i iVar = (i9.i) annotation;
                String strValue3 = iVar.value();
                Class clsH4 = C.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new s.f(strValue3, this.f21518a.i(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new s.f(strValue3, this.f21518a.i(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.f(strValue3, this.f21518a.i(C.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw C.p(this.f21520c, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof i9.j) {
                if (type == P8.u.class) {
                    return new s.h(this.f21520c, i10);
                }
                j(i10, type);
                Class clsH5 = C.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw C.p(this.f21520c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = C.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw C.p(this.f21520c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = C.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new s.g(this.f21520c, i10, this.f21518a.i(C.g(1, parameterizedType2), annotationArr), ((i9.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw C.p(this.f21520c, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof i9.c) {
                j(i10, type);
                if (!this.f21534q) {
                    throw C.p(this.f21520c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                i9.c cVar = (i9.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f21524g = true;
                Class clsH6 = C.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new s.d(strValue4, this.f21518a.i(type, annotationArr), zEncoded3);
                    }
                    return new s.d(strValue4, this.f21518a.i(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new s.d(strValue4, this.f21518a.i(C.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw C.p(this.f21520c, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof i9.d) {
                j(i10, type);
                if (!this.f21534q) {
                    throw C.p(this.f21520c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsH7 = C.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw C.p(this.f21520c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = C.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw C.p(this.f21520c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = C.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarI = this.f21518a.i(C.g(1, parameterizedType3), annotationArr);
                    this.f21524g = true;
                    return new s.e(this.f21520c, i10, hVarI, ((i9.d) annotation).encoded());
                }
                throw C.p(this.f21520c, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof i9.q)) {
                if (annotation instanceof i9.r) {
                    j(i10, type);
                    if (!this.f21535r) {
                        throw C.p(this.f21520c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f21525h = true;
                    Class clsH8 = C.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw C.p(this.f21520c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = C.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw C.p(this.f21520c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = C.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = C.g(1, parameterizedType4);
                        if (P8.y.c.class.isAssignableFrom(C.h(typeG5))) {
                            throw C.p(this.f21520c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new s.j(this.f21520c, i10, this.f21518a.g(typeG5, annotationArr, this.f21521d), ((i9.r) annotation).encoding());
                    }
                    throw C.p(this.f21520c, i10, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof i9.a) {
                    j(i10, type);
                    if (this.f21534q || this.f21535r) {
                        throw C.p(this.f21520c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f21526i) {
                        throw C.p(this.f21520c, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        h hVarG = this.f21518a.g(type, annotationArr, this.f21521d);
                        this.f21526i = true;
                        return new s.c(this.f21520c, i10, hVarG);
                    } catch (RuntimeException e10) {
                        throw C.q(this.f21520c, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof i9.x)) {
                    return null;
                }
                j(i10, type);
                Class clsH9 = C.h(type);
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    s sVar2 = this.f21540w[i11];
                    if ((sVar2 instanceof s.q) && ((s.q) sVar2).f21485a.equals(clsH9)) {
                        throw C.p(this.f21520c, i10, "@Tag type " + clsH9.getName() + " is duplicate of " + t.f21487b.a(this.f21520c, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new s.q(clsH9);
            }
            j(i10, type);
            if (!this.f21535r) {
                throw C.p(this.f21520c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            i9.q qVar = (i9.q) annotation;
            this.f21525h = true;
            String strValue5 = qVar.value();
            Class clsH10 = C.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH10)) {
                    if (clsH10.isArray()) {
                        if (P8.y.c.class.isAssignableFrom(clsH10.getComponentType())) {
                            return s.o.f21482a.b();
                        }
                        throw C.p(this.f21520c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (P8.y.c.class.isAssignableFrom(clsH10)) {
                        return s.o.f21482a;
                    }
                    throw C.p(this.f21520c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (P8.y.c.class.isAssignableFrom(C.h(C.g(0, (ParameterizedType) type)))) {
                        return s.o.f21482a.c();
                    }
                    throw C.p(this.f21520c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw C.p(this.f21520c, i10, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
            }
            P8.u uVarG = P8.u.g("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH10)) {
                if (!clsH10.isArray()) {
                    if (P8.y.c.class.isAssignableFrom(clsH10)) {
                        throw C.p(this.f21520c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new s.i(this.f21520c, i10, uVarG, this.f21518a.g(type, annotationArr, this.f21521d));
                }
                Class clsA = a(clsH10.getComponentType());
                if (P8.y.c.class.isAssignableFrom(clsA)) {
                    throw C.p(this.f21520c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f21520c, i10, uVarG, this.f21518a.g(clsA, annotationArr, this.f21521d)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = C.g(0, (ParameterizedType) type);
                if (P8.y.c.class.isAssignableFrom(C.h(typeG6))) {
                    throw C.p(this.f21520c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new s.i(this.f21520c, i10, uVarG, this.f21518a.g(typeG6, annotationArr, this.f21521d)).c();
            }
            throw C.p(this.f21520c, i10, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set h(String str) {
            Matcher matcher = f21516y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f21517z.matcher(str).matches()) {
                throw C.p(this.f21520c, i10, "@Path parameter name must match %s. Found: %s", f21516y.pattern(), str);
            }
            if (!this.f21539v.contains(str)) {
                throw C.p(this.f21520c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f21536s, str);
            }
        }

        private void j(int i10, Type type) {
            if (C.j(type)) {
                throw C.p(this.f21520c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        w b() {
            for (Annotation annotation : this.f21521d) {
                e(annotation);
            }
            if (this.f21532o == null) {
                throw C.n(this.f21520c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f21533p) {
                if (this.f21535r) {
                    throw C.n(this.f21520c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f21534q) {
                    throw C.n(this.f21520c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f21522e.length;
            this.f21540w = new s[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f21540w[i11] = f(i11, this.f21523f[i11], this.f21522e[i11], i11 == i10);
                i11++;
            }
            if (this.f21536s == null && !this.f21531n) {
                throw C.n(this.f21520c, "Missing either @%s URL or @Url parameter.", this.f21532o);
            }
            boolean z9 = this.f21534q;
            if (!z9 && !this.f21535r && !this.f21533p && this.f21526i) {
                throw C.n(this.f21520c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z9 && !this.f21524g) {
                throw C.n(this.f21520c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f21535r || this.f21525h) {
                return new w(this);
            }
            throw C.n(this.f21520c, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    w(a aVar) {
        this.f21504a = aVar.f21519b;
        this.f21505b = aVar.f21520c;
        this.f21506c = aVar.f21518a.f21547c;
        this.f21507d = aVar.f21532o;
        this.f21508e = aVar.f21536s;
        this.f21509f = aVar.f21537t;
        this.f21510g = aVar.f21538u;
        this.f21511h = aVar.f21533p;
        this.f21512i = aVar.f21534q;
        this.f21513j = aVar.f21535r;
        this.f21514k = aVar.f21540w;
        this.f21515l = aVar.f21541x;
    }

    static w b(y yVar, Class cls, Method method) {
        return new a(yVar, cls, method).b();
    }

    P8.B a(Object obj, Object[] objArr) {
        s[] sVarArr = this.f21514k;
        int length = objArr.length;
        if (length != sVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sVarArr.length + ")");
        }
        v vVar = new v(this.f21507d, this.f21506c, this.f21508e, this.f21509f, this.f21510g, this.f21511h, this.f21512i, this.f21513j);
        if (this.f21515l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            sVarArr[i10].a(vVar, objArr[i10]);
        }
        return vVar.k().g(o.class, new o(this.f21504a, obj, this.f21505b, arrayList)).b();
    }
}
