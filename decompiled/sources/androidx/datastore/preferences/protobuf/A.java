package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'u' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final A f12382A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final A f12383B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final A f12384C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ A[] f12385D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final A f12386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final A f12387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final A f12388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final A f12389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final A f12390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final A f12391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final A f12392z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Class f12393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Class f12394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f12395s;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f12386t = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f12387u = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f12388v = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f12389w = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f12390x = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f12391y = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f12392z = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC1097g.class, AbstractC1097g.class, AbstractC1097g.f12460r);
        f12382A = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f12383B = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f12384C = a19;
        f12385D = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f12393q = cls;
        this.f12394r = cls2;
        this.f12395s = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f12385D.clone();
    }

    public Class d() {
        return this.f12394r;
    }
}
