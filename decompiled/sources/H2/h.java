package H2;

import android.graphics.fonts.Font;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Font f2365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Font f2366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2367c;

    public h(Font font, Font font2, int i10) {
        this.f2365a = font;
        this.f2366b = font2;
        this.f2367c = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.n.d(this.f2365a, hVar.f2365a) && kotlin.jvm.internal.n.d(this.f2366b, hVar.f2366b) && this.f2367c == hVar.f2367c;
    }

    public int hashCode() {
        Font font = this.f2365a;
        int iHashCode = (font == null ? 0 : font.hashCode()) * 31;
        Font font2 = this.f2366b;
        return ((iHashCode + (font2 != null ? font2.hashCode() : 0)) * 31) + Integer.hashCode(this.f2367c);
    }

    public String toString() {
        return "InterpKey(start=" + this.f2365a + ", end=" + this.f2366b + ", frame=" + this.f2367c + ")";
    }
}
