package I8;

/* JADX INFO: loaded from: classes2.dex */
public interface K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3174a = a.f3175a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3175a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final K f3176b = new L();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final K f3177c = new M();

        private a() {
        }

        public static /* synthetic */ K b(a aVar, long j9, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j9 = 0;
            }
            if ((i10 & 2) != 0) {
                j10 = Long.MAX_VALUE;
            }
            return aVar.a(j9, j10);
        }

        public final K a(long j9, long j10) {
            return new N(j9, j10);
        }

        public final K c() {
            return f3176b;
        }

        public final K d() {
            return f3177c;
        }
    }

    InterfaceC0880f a(O o9);
}
