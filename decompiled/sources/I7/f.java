package I7;

import J7.i;
import com.nothing.launcher.card.t;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p089i8.AbstractC1444s;
import p098j7.j;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3134c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LockScreenFragment f3136b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public f(i lockScreenViewModel, LockScreenFragment fragment) {
        n.h(lockScreenViewModel, "lockScreenViewModel");
        n.h(fragment, "fragment");
        this.f3135a = lockScreenViewModel;
        this.f3136b = fragment;
    }

    private final String b(t tVar) {
        return tVar.m() + "-" + tVar.f595s + "-" + tVar.f596t;
    }

    private final void d() {
        Object next;
        List listI = this.f3135a.I();
        List listI0 = this.f3136b.I0();
        List list = listI;
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((t) ((o) it.next()).d()).m()));
        }
        List<t> list2 = listI0;
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((t) it2.next()).m()));
        }
        com.nothing.wallpaper.common.log.c.k("WidgetPersistStrategy", "restoreAddedWidgets backup: " + arrayList + " current: " + arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (t tVar : list2) {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((t) ((o) next).d()).m() != tVar.m());
            if (next == null) {
                arrayList3.add(Integer.valueOf(tVar.m()));
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            this.f3136b.F0(((Number) it4.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(f fVar) {
        fVar.d();
        fVar.f3135a.B0();
        fVar.f3136b.O3(null);
    }

    private final void g() {
        Object next;
        List listI = this.f3135a.I();
        List listI0 = this.f3136b.I0();
        List<o> list = listI;
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((t) ((o) it.next()).d()).m()));
        }
        List list2 = listI0;
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((t) it2.next()).m()));
        }
        com.nothing.wallpaper.common.log.c.k("WidgetPersistStrategy", "saveDeletedWidgets backup:" + arrayList + " current:" + arrayList2);
        ArrayList<t> arrayList3 = new ArrayList();
        for (o oVar : list) {
            Iterator it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((t) next).m() != ((t) oVar.d()).m());
            if (next == null) {
                arrayList3.add(oVar.d());
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC1444s.u(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Integer.valueOf(((t) it4.next()).m()));
        }
        com.nothing.wallpaper.common.log.c.n("WidgetPersistStrategy", "saveDeletedWidgets ids:" + arrayList4);
        for (t tVar : arrayList3) {
            this.f3136b.F0(tVar.m());
            Integer num = (Integer) this.f3136b.K0().get(Integer.valueOf(tVar.m()));
            R7.d.f7114r.l("widget_remove", tVar, num != null ? num.intValue() : 2);
        }
    }

    public final boolean c() {
        if (this.f3135a.H() != this.f3136b.Q2()) {
            return true;
        }
        List listI = this.f3135a.I();
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(listI, 10));
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(b((t) ((o) it.next()).d()));
        }
        String string = arrayList.toString();
        List listI0 = this.f3136b.I0();
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(listI0, 10));
        Iterator it2 = listI0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((t) it2.next()));
        }
        String string2 = arrayList2.toString();
        com.nothing.wallpaper.common.log.c.k("WidgetPersistStrategy", "isWidgetChanged backup:" + string + " current:" + string2);
        return !n.d(string, string2);
    }

    public final void e() {
        boolean zH = this.f3135a.H();
        com.nothing.wallpaper.common.log.c.k("WidgetPersistStrategy", "restoreWidget expand origin:" + zH + " current:" + this.f3136b.Q2());
        if (this.f3136b.Q2() != zH) {
            this.f3136b.M().setTag(Boolean.TRUE);
            this.f3135a.D(zH);
            j jVarP2 = this.f3136b.P2();
            if (jVarP2 != null) {
                jVarP2.H0(zH);
            }
            this.f3136b.O3(new Runnable() { // from class: I7.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.f(this.f3133q);
                }
            });
        }
        if (this.f3136b.S2() == null) {
            d();
            this.f3135a.B0();
        }
    }

    public final void h() {
        this.f3135a.D0();
        g();
        this.f3135a.F0();
    }
}
