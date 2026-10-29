package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f20778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f20781d;

    public static /* synthetic */ x b(x xVar, g gVar, o oVar, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            xVar.getClass();
            gVar = null;
        }
        if ((i12 & 2) != 0) {
            oVar = xVar.f20778a;
        }
        if ((i12 & 4) != 0) {
            i10 = xVar.f20779b;
        }
        if ((i12 & 8) != 0) {
            i11 = xVar.f20780c;
        }
        if ((i12 & 16) != 0) {
            obj = xVar.f20781d;
        }
        Object obj3 = obj;
        int i13 = i10;
        return xVar.a(gVar, oVar, i13, i11, obj3);
    }

    public abstract x a(g gVar, o oVar, int i10, int i11, Object obj);

    public abstract g c();

    public abstract int d();

    public abstract o e();
}
