package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class G {
    public C8.e a(k kVar) {
        return kVar;
    }

    public C8.c b(Class cls) {
        return new C1455f(cls);
    }

    public C8.d c(Class cls, String str) {
        return new u(cls, str);
    }

    public C8.f d(p pVar) {
        return pVar;
    }

    public C8.g e(r rVar) {
        return rVar;
    }

    public C8.h f(v vVar) {
        return vVar;
    }

    public C8.j g(x xVar) {
        return xVar;
    }

    public String h(j jVar) {
        String string = jVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(o oVar) {
        return h(oVar);
    }
}
