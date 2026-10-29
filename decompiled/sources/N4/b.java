package N4;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f5236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f5237b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f5236a;
            f10 += ((b) dVar).f5237b;
        }
        this.f5236a = dVar;
        this.f5237b = f10;
    }

    @Override // N4.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f5236a.a(rectF) + this.f5237b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5236a.equals(bVar.f5236a) && this.f5237b == bVar.f5237b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5236a, Float.valueOf(this.f5237b)});
    }
}
