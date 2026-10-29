package N4;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5235a;

    public a(float f10) {
        this.f5235a = f10;
    }

    @Override // N4.d
    public float a(RectF rectF) {
        return this.f5235a;
    }

    public float b() {
        return this.f5235a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5235a == ((a) obj).f5235a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5235a)});
    }
}
