package S5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.launcher3.p;
import com.nothing.cardwidget.battery.BatteryConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7353d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f7354e = AbstractC1444s.n(new b(BatteryConfig.DEFAULT_PACKAGE_NAME, 0, p.f15656g), new b("com.android.systemui", 1, p.f15657h), new b("com.nothing.weather", 1, p.f15658i));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7357c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Drawable a(String pkgName, int i10, Context context) {
            Object next;
            n.h(pkgName, "pkgName");
            n.h(context, "context");
            Iterator it = b.f7354e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                b bVar = (b) next;
                if (n.d(bVar.c(), pkgName) && bVar.b() == i10) {
                    break;
                }
            }
            b bVar2 = (b) next;
            if (bVar2 != null) {
                return context.getDrawable(bVar2.d());
            }
            return null;
        }

        private a() {
        }
    }

    public b(String pkgName, int i10, int i11) {
        n.h(pkgName, "pkgName");
        this.f7355a = pkgName;
        this.f7356b = i10;
        this.f7357c = i11;
    }

    public final int b() {
        return this.f7356b;
    }

    public final String c() {
        return this.f7355a;
    }

    public final int d() {
        return this.f7357c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f7355a, bVar.f7355a) && this.f7356b == bVar.f7356b && this.f7357c == bVar.f7357c;
    }

    public int hashCode() {
        return (((this.f7355a.hashCode() * 31) + Integer.hashCode(this.f7356b)) * 31) + Integer.hashCode(this.f7357c);
    }

    public String toString() {
        return "GroupIconInfo(pkgName=" + this.f7355a + ", groupId=" + this.f7356b + ", resInt=" + this.f7357c + ")";
    }
}
