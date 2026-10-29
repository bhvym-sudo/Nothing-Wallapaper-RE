package F8;

/* JADX INFO: loaded from: classes2.dex */
public enum N {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ p149o8.a f1826v = p149o8.b.a(d());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1827a;

        static {
            int[] iArr = new int[N.values().length];
            try {
                iArr[N.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1827a = iArr;
        }
    }

    public final void e(p219v8.p pVar, Object obj, p129m8.e eVar) {
        int i10 = a.f1827a[ordinal()];
        if (i10 == 1) {
            L8.a.c(pVar, obj, eVar);
            return;
        }
        if (i10 == 2) {
            p129m8.g.a(pVar, obj, eVar);
        } else if (i10 == 3) {
            L8.b.a(pVar, obj, eVar);
        } else if (i10 != 4) {
            throw new p079h8.m();
        }
    }

    public final boolean f() {
        return this == LAZY;
    }
}
