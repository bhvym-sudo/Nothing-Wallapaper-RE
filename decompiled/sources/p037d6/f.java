package p037d6;

import I2.e;
import p149o8.a;
import p149o8.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'w' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final f f19678A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final f f19679B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final f f19680C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final f f19681D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ f[] f19682E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ a f19683F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f19684s = new f("GENERAL", 0, I2.f.f2984e, e.f2968a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f19685t = new f("GRAPHIC", 1, I2.f.f2985f, e.f2969b);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f19686u = new f("LONDON_UG", 2, I2.f.f2986g, e.f2970c);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f19687v = new f("NDOT", 3, I2.f.f2988i, e.f2972e);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f19688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f19689x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f19690y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f f19691z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f19693r;

    static {
        int i10 = I2.f.f2991l;
        f19688w = new f("NTYPE", 4, i10, e.f2975h);
        f19689x = new f("LONDON_UG_16B", 5, I2.f.f2987h, e.f2971d);
        f19690y = new f("NDOT_16B", 6, I2.f.f2989j, e.f2973f);
        f19691z = new f("NTYPE_16B", 7, i10, e.f2976i);
        f19678A = new f("OLD_QUICKLOOK", 8, I2.f.f2992m, e.f2977j);
        f19679B = new f("SPACE_AGE", 9, I2.f.f2994o, e.f2979l);
        f19680C = new f("POLYLINE", 10, I2.f.f2993n, e.f2978k);
        f19681D = new f("NSEGMENTS", 11, I2.f.f2990k, e.f2974g);
        f[] fVarArrD = d();
        f19682E = fVarArrD;
        f19683F = b.a(fVarArrD);
    }

    private f(String str, int i10, int i11, int i12) {
        super(str, i10);
        this.f19692q = i11;
        this.f19693r = i12;
    }

    private static final /* synthetic */ f[] d() {
        return new f[]{f19684s, f19685t, f19686u, f19687v, f19688w, f19689x, f19690y, f19691z, f19678A, f19679B, f19680C, f19681D};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f19682E.clone();
    }

    public final int e() {
        return this.f19692q;
    }

    public final int f() {
        return this.f19693r;
    }
}
