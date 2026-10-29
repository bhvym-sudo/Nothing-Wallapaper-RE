package G;

/* JADX INFO: loaded from: classes.dex */
public enum m implements l {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1929a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1929a = iArr;
        }
    }

    @Override // G.l
    public boolean d() {
        int i10 = a.f1929a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new p079h8.m();
    }
}
