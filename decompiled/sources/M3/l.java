package M3;

/* JADX INFO: loaded from: classes.dex */
abstract class l {

    public static abstract class a {
        public abstract l a();

        abstract a b(K3.b bVar);

        abstract a c(K3.c cVar);

        abstract a d(K3.e eVar);

        public abstract a e(m mVar);

        public abstract a f(String str);
    }

    l() {
    }

    public static a a() {
        return new b.C0180b();
    }

    public abstract K3.b b();

    abstract K3.c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract K3.e e();

    public abstract m f();

    public abstract String g();
}
