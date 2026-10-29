package p111l0;

import p121m0.a;

/* JADX INFO: loaded from: classes.dex */
final class t implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22842a;

    public t(float f10) {
        this.f22842a = f10;
    }

    @Override // p121m0.a
    public float a(float f10) {
        return f10 * this.f22842a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f22842a, ((t) obj).f22842a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f22842a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f22842a + ')';
    }
}
