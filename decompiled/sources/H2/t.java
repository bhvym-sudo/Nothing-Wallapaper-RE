package H2;

import android.graphics.fonts.Font;
import android.graphics.fonts.FontVariationAxis;
import java.util.Comparator;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f2419c;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(((FontVariationAxis) obj).getTag(), ((FontVariationAxis) obj2).getTag());
        }
    }

    public t(int i10, int i11, List sortedAxes) {
        kotlin.jvm.internal.n.h(sortedAxes, "sortedAxes");
        this.f2417a = i10;
        this.f2418b = i11;
        this.f2419c = sortedAxes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2417a == tVar.f2417a && this.f2418b == tVar.f2418b && kotlin.jvm.internal.n.d(this.f2419c, tVar.f2419c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f2417a) * 31) + Integer.hashCode(this.f2418b)) * 31) + this.f2419c.hashCode();
    }

    public String toString() {
        return "VarFontKey(sourceId=" + this.f2417a + ", index=" + this.f2418b + ", sortedAxes=" + this.f2419c + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(Font font, List axes) {
        this(font.getSourceIdentifier(), font.getTtcIndex(), AbstractC1444s.m0(axes, new a()));
        kotlin.jvm.internal.n.h(font, "font");
        kotlin.jvm.internal.n.h(axes, "axes");
    }
}
