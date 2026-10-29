package A7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f308a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LinkedList f309b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f310c = i.b(new p219v8.a() { // from class: A7.b
        @Override // p219v8.a
        public final Object invoke() {
            return Integer.valueOf(d.d());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f311d = i.b(new p219v8.a() { // from class: A7.c
        @Override // p219v8.a
        public final Object invoke() {
            return Integer.valueOf(d.c());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f312e = AbstractC1444s.p("GENERAL", "OLD_QUICKLOOK");

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c() {
        Iterator it = f309b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (n.d("OLD_QUICKLOOK", ((O1.a) it.next()).b())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d() {
        Iterator it = f309b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (n.d("GENERAL", ((O1.a) it.next()).b())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private final int f() {
        return ((Number) f311d.getValue()).intValue();
    }

    private final int g() {
        return ((Number) f310c.getValue()).intValue();
    }

    public final int e(String clockId) {
        n.h(clockId, "clockId");
        Iterator it = f309b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (n.d(((O1.a) it.next()).b(), clockId)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean h(String clockId) {
        n.h(clockId, "clockId");
        return f312e.contains(clockId);
    }

    public final void i(List clocks) {
        n.h(clocks, "clocks");
        LinkedList linkedList = f309b;
        linkedList.clear();
        linkedList.addAll(clocks);
    }

    public final boolean j(int i10) {
        return i10 == f();
    }

    public final boolean k(int i10) {
        return i10 == g();
    }
}
