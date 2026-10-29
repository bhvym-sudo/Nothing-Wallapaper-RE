package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f12572a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f12573b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f12574c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f12575d = c(3, 2);

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
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final b f12576A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final b f12577B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final b f12578C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b f12579D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final b f12580E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final b f12581F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final b f12582G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final b f12583H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final b f12584I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final b f12585J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private static final /* synthetic */ b[] f12586K;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f12587s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f12588t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f12589u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f12590v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f12591w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f12592x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f12593y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f12594z;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final c f12595q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f12596r;

        final enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r0$b$b, reason: collision with other inner class name */
        final enum C0386b extends b {
            C0386b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        final enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        final enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f12587s = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f12588t = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f12589u = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f12590v = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f12591w = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f12592x = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f12593y = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f12594z = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f12576A = aVar;
            c cVar3 = c.MESSAGE;
            C0386b c0386b = new C0386b("GROUP", 9, cVar3, 3);
            f12577B = c0386b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f12578C = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f12579D = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f12580E = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f12581F = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f12582G = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f12583H = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f12584I = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f12585J = bVar14;
            f12586K = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0386b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12586K.clone();
        }

        public c d() {
            return this.f12595q;
        }

        public int e() {
            return this.f12596r;
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f12595q = cVar;
            this.f12596r = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC1097g.f12460r),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Object f12607q;

        c(Object obj) {
            this.f12607q = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
