package F2;

import android.graphics.Rect;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: F2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0798e extends AbstractC0794a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[][] f1566c;

    public C0798e(int i10, int i11) {
        this.f1564a = i10;
        this.f1565b = i11;
        this.f1566c = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i10, i11);
    }

    public void b() {
        g(0, 0, this.f1564a, this.f1565b, false);
    }

    public void c(C0798e c0798e) {
        int iMin = Math.min(this.f1564a, c0798e.f1564a);
        int iMin2 = Math.min(this.f1565b, c0798e.f1565b);
        for (int i10 = 0; i10 < iMin; i10++) {
            for (int i11 = 0; i11 < iMin2; i11++) {
                c0798e.f1566c[i10][i11] = this.f1566c[i10][i11];
            }
        }
    }

    public boolean d(int[] iArr, int i10, int i11) {
        return super.a(iArr, this.f1566c, this.f1564a, this.f1565b, i10, i11);
    }

    public boolean e(int i10, int i11, int i12, int i13) {
        return i10 >= 0 && i11 >= 0 && (i12 + i10) - 1 < this.f1564a && (i13 + i11) - 1 < this.f1565b;
    }

    public boolean f(int i10, int i11, int i12, int i13) {
        int i14 = (i12 + i10) - 1;
        int i15 = (i13 + i11) - 1;
        if (i10 < 0 || i11 < 0 || i14 >= this.f1564a || i15 >= this.f1565b) {
            return false;
        }
        while (i10 <= i14) {
            for (int i16 = i11; i16 <= i15; i16++) {
                if (this.f1566c[i10][i16]) {
                    return false;
                }
            }
            i10++;
        }
        return true;
    }

    public void g(int i10, int i11, int i12, int i13, boolean z9) {
        if (i10 < 0 || i11 < 0) {
            return;
        }
        for (int i14 = i10; i14 < i10 + i12 && i14 < this.f1564a; i14++) {
            for (int i15 = i11; i15 < i11 + i13 && i15 < this.f1565b; i15++) {
                this.f1566c[i14][i15] = z9;
            }
        }
    }

    public void h(C2.b bVar, boolean z9) {
        g(bVar.f595s, bVar.f596t, bVar.f597u, bVar.f598v, z9);
    }

    public void i(C0795b c0795b, boolean z9) {
        g(c0795b.f1547a, c0795b.f1548b, c0795b.f1549c, c0795b.f1550d, z9);
    }

    public void j(Rect rect, boolean z9) {
        g(rect.left, rect.top, rect.width(), rect.height(), z9);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Grid: \n");
        for (int i10 = 0; i10 < this.f1565b; i10++) {
            for (int i11 = 0; i11 < this.f1564a; i11++) {
                sb.append(this.f1566c[i11][i10] ? 1 : 0);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
