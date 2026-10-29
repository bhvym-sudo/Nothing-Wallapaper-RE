package H8;

/* JADX INFO: loaded from: classes2.dex */
public interface w {

    public static final class a {
        public static /* synthetic */ boolean a(w wVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return wVar.h(th);
        }
    }

    void e(p219v8.l lVar);

    boolean h(Throwable th);

    Object n(Object obj, p129m8.e eVar);

    Object p(Object obj);

    boolean s();
}
