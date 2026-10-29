package S5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.launcher3.f;
import com.nothing.launcher.card.j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7352d;

    public a(int i10, int i11, String pkgName, List widgetList) {
        n.h(pkgName, "pkgName");
        n.h(widgetList, "widgetList");
        this.f7349a = i10;
        this.f7350b = i11;
        this.f7351c = pkgName;
        this.f7352d = widgetList;
    }

    @Override // S5.d
    public String a(Context context) {
        Object objB;
        n.h(context, "context");
        try {
            q.a aVar = q.f21862r;
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(this.f7351c);
            n.g(resourcesForApplication, "getResourcesForApplication(...)");
            objB = q.b(resourcesForApplication.getString(this.f7350b));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        String str = this.f7351c;
        if (q.f(objB)) {
            objB = str;
        }
        return (String) objB;
    }

    public final Drawable b(Context context) {
        Drawable drawableF0;
        n.h(context, "context");
        if (this.f7352d.isEmpty()) {
            return null;
        }
        j jVar = (j) this.f7352d.get(0);
        String strN = jVar.n();
        return (strN == null || (drawableF0 = jVar.F0(context, 0, Integer.parseInt(strN))) == null) ? b.f7353d.a(this.f7351c, this.f7349a, context) : drawableF0;
    }

    public final int c() {
        return this.f7349a;
    }

    public final String d() {
        return this.f7351c;
    }

    public final Bitmap e(Context context, f dp) {
        Object next;
        n.h(context, "context");
        n.h(dp, "dp");
        Iterator it = this.f7352d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            j jVar = (j) next;
            if (jVar.l() == 2 && jVar.k() == 2) {
                break;
            }
        }
        j jVar2 = (j) next;
        if (jVar2 == null) {
            return null;
        }
        jVar2.F0(context, 0, jVar2.J());
        return jVar2.t0(context, dp.l(jVar2.B0(), jVar2.C0()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7349a == aVar.f7349a && this.f7350b == aVar.f7350b && n.d(this.f7351c, aVar.f7351c) && n.d(this.f7352d, aVar.f7352d);
    }

    public final int f() {
        return this.f7350b;
    }

    public final List g() {
        return this.f7352d;
    }

    public final String h() {
        if (this.f7352d.isEmpty()) {
            return this.f7351c;
        }
        return this.f7351c + ((j) this.f7352d.get(0)).v0();
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f7349a) * 31) + Integer.hashCode(this.f7350b)) * 31) + this.f7351c.hashCode()) * 31) + this.f7352d.hashCode();
    }

    public String toString() {
        return "CardGroupMetaInfo(groupId=" + this.f7349a + ", titleRes=" + this.f7350b + ", pkgName=" + this.f7351c + ", widgetList=" + this.f7352d + ")";
    }
}
