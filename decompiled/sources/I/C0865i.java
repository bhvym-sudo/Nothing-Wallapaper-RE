package I;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: I.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865i implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f2700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f2701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f2702d;

    public C0865i(Path path) {
        this.f2700b = path;
    }

    private final void j(H.i iVar) {
        if (Float.isNaN(iVar.f()) || Float.isNaN(iVar.i()) || Float.isNaN(iVar.g()) || Float.isNaN(iVar.c())) {
            AbstractC0866j.c("Invalid rectangle, make sure no value is NaN");
        }
    }

    public final Path a() {
        return this.f2700b;
    }

    @Override // I.H
    public void b() {
        this.f2700b.reset();
    }

    @Override // I.H
    public H.i d() {
        if (this.f2701c == null) {
            this.f2701c = new RectF();
        }
        RectF rectF = this.f2701c;
        kotlin.jvm.internal.n.e(rectF);
        this.f2700b.computeBounds(rectF, true);
        return new H.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // I.H
    public boolean f(H h10, H h11, int i10) {
        Path.Op op;
        I.a aVar = I.f2653a;
        if (I.f(i10, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (I.f(i10, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (I.f(i10, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = I.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f2700b;
        if (!(h10 instanceof C0865i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathA = ((C0865i) h10).a();
        if (h11 instanceof C0865i) {
            return path.op(pathA, ((C0865i) h11).a(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // I.H
    public void g() {
        this.f2700b.rewind();
    }

    @Override // I.H
    public void h(H.i iVar, H.b bVar) {
        j(iVar);
        if (this.f2701c == null) {
            this.f2701c = new RectF();
        }
        RectF rectF = this.f2701c;
        kotlin.jvm.internal.n.e(rectF);
        rectF.set(iVar.f(), iVar.i(), iVar.g(), iVar.c());
        Path path = this.f2700b;
        RectF rectF2 = this.f2701c;
        kotlin.jvm.internal.n.e(rectF2);
        path.addRect(rectF2, AbstractC0866j.d(bVar));
    }

    @Override // I.H
    public void i(H.k kVar, H.b bVar) {
        if (this.f2701c == null) {
            this.f2701c = new RectF();
        }
        RectF rectF = this.f2701c;
        kotlin.jvm.internal.n.e(rectF);
        rectF.set(kVar.e(), kVar.g(), kVar.f(), kVar.a());
        if (this.f2702d == null) {
            this.f2702d = new float[8];
        }
        float[] fArr = this.f2702d;
        kotlin.jvm.internal.n.e(fArr);
        fArr[0] = H.a.d(kVar.h());
        fArr[1] = H.a.e(kVar.h());
        fArr[2] = H.a.d(kVar.i());
        fArr[3] = H.a.e(kVar.i());
        fArr[4] = H.a.d(kVar.c());
        fArr[5] = H.a.e(kVar.c());
        fArr[6] = H.a.d(kVar.b());
        fArr[7] = H.a.e(kVar.b());
        Path path = this.f2700b;
        RectF rectF2 = this.f2701c;
        kotlin.jvm.internal.n.e(rectF2);
        float[] fArr2 = this.f2702d;
        kotlin.jvm.internal.n.e(fArr2);
        path.addRoundRect(rectF2, fArr2, AbstractC0866j.d(bVar));
    }

    @Override // I.H
    public boolean isEmpty() {
        return this.f2700b.isEmpty();
    }

    public /* synthetic */ C0865i(Path path, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
