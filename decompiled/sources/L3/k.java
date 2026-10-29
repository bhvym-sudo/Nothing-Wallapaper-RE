package L3;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(L3.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f4727q;

        b(int i10) {
            this.f4727q = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract L3.a b();

    public abstract b c();
}
