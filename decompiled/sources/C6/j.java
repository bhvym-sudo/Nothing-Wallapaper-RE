package C6;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f661e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j f662f = new j(1.0f, G6.c.h(), null, null, 12, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Point f666d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final j a(String str) {
            if (str == null || E8.i.f0(str)) {
                return null;
            }
            List listD0 = E8.i.D0(str, new String[]{"*|*"}, false, 0, 6, null);
            float fK = G6.c.k((String) listD0.get(0));
            Rect rectUnflattenFromString = Rect.unflattenFromString((String) listD0.get(1));
            if (rectUnflattenFromString == null) {
                return null;
            }
            String str2 = (String) AbstractC1444s.V(listD0, 2);
            PointF pointFA = str2 != null ? G6.c.a(str2) : null;
            String str3 = (String) AbstractC1444s.V(listD0, 3);
            return new j(fK, rectUnflattenFromString, pointFA, str3 != null ? G6.c.b(str3) : null);
        }

        private a() {
        }
    }

    public j(float f10, Rect rect, PointF pointF, Point point) {
        n.h(rect, "rect");
        this.f663a = f10;
        this.f664b = rect;
        this.f665c = pointF;
        this.f666d = point;
    }

    public final String a() {
        String strE;
        String strFlattenToString;
        String strF = G6.c.f(this.f663a);
        String strFlattenToString2 = this.f664b.flattenToString();
        PointF pointF = this.f665c;
        String str = "";
        if (pointF == null || (strE = G6.c.e(pointF)) == null) {
            strE = "";
        }
        Point point = this.f666d;
        if (point != null && (strFlattenToString = point.flattenToString()) != null) {
            str = strFlattenToString;
        }
        return strF + "*|*" + strFlattenToString2 + "*|*" + strE + "*|*" + str;
    }

    public final PointF b() {
        return this.f665c;
    }

    public final float c() {
        return this.f663a;
    }

    public final Point d() {
        return this.f666d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n.d(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.f(obj, "null cannot be cast to non-null type com.nothing.wallpaper.effects.data.model.Scope");
        j jVar = (j) obj;
        return this.f663a == jVar.f663a && n.d(this.f664b, jVar.f664b) && n.d(this.f665c, jVar.f665c);
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f663a) * 31) + this.f664b.hashCode()) * 31;
        PointF pointF = this.f665c;
        return iHashCode + (pointF != null ? pointF.hashCode() : 0);
    }

    public String toString() {
        return "Scope(scale=" + this.f663a + ", rect=" + this.f664b + ", center=" + this.f665c + ", viewSize=" + this.f666d + ")";
    }

    public /* synthetic */ j(float f10, Rect rect, PointF pointF, Point point, int i10, AbstractC1457h abstractC1457h) {
        this(f10, rect, (i10 & 4) != 0 ? null : pointF, (i10 & 8) != 0 ? null : point);
    }
}
