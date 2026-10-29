package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1165z extends AbstractC1157q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f13461k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p120m.a f13463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1157q.b f13464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f13465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f13469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final I8.A f13470j;

    /* JADX INFO: renamed from: androidx.lifecycle.z$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final AbstractC1157q.b a(AbstractC1157q.b state1, AbstractC1157q.b bVar) {
            kotlin.jvm.internal.n.h(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC1157q.b f13471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1160u f13472b;

        public b(InterfaceC1162w interfaceC1162w, AbstractC1157q.b initialState) {
            kotlin.jvm.internal.n.h(initialState, "initialState");
            kotlin.jvm.internal.n.e(interfaceC1162w);
            this.f13472b = B.f(interfaceC1162w);
            this.f13471a = initialState;
        }

        public final void a(InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
            kotlin.jvm.internal.n.h(event, "event");
            AbstractC1157q.b bVarE = event.e();
            this.f13471a = C1165z.f13461k.a(this.f13471a, bVarE);
            InterfaceC1160u interfaceC1160u = this.f13472b;
            kotlin.jvm.internal.n.e(interfaceC1163x);
            interfaceC1160u.onStateChanged(interfaceC1163x, event);
            this.f13471a = bVarE;
        }

        public final AbstractC1157q.b b() {
            return this.f13471a;
        }
    }

    private C1165z(InterfaceC1163x interfaceC1163x, boolean z9) {
        this.f13462b = z9;
        this.f13463c = new p120m.a();
        AbstractC1157q.b bVar = AbstractC1157q.b.INITIALIZED;
        this.f13464d = bVar;
        this.f13469i = new ArrayList();
        this.f13465e = new WeakReference(interfaceC1163x);
        this.f13470j = I8.Q.a(bVar);
    }

    private final void e(InterfaceC1163x interfaceC1163x) {
        Iterator itDescendingIterator = this.f13463c.descendingIterator();
        kotlin.jvm.internal.n.g(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f13468h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            kotlin.jvm.internal.n.g(entry, "next()");
            InterfaceC1162w interfaceC1162w = (InterfaceC1162w) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f13464d) > 0 && !this.f13468h && this.f13463c.contains(interfaceC1162w)) {
                AbstractC1157q.a aVarA = AbstractC1157q.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.e());
                bVar.a(interfaceC1163x, aVarA);
                l();
            }
        }
    }

    private final AbstractC1157q.b f(InterfaceC1162w interfaceC1162w) {
        b bVar;
        Map.Entry entryN = this.f13463c.n(interfaceC1162w);
        AbstractC1157q.b bVar2 = null;
        AbstractC1157q.b bVarB = (entryN == null || (bVar = (b) entryN.getValue()) == null) ? null : bVar.b();
        if (!this.f13469i.isEmpty()) {
            ArrayList arrayList = this.f13469i;
            bVar2 = (AbstractC1157q.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f13461k;
        return aVar.a(aVar.a(this.f13464d, bVarB), bVar2);
    }

    private final void g(String str) {
        if (!this.f13462b || A.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(InterfaceC1163x interfaceC1163x) {
        m.b.d dVarE = this.f13463c.e();
        kotlin.jvm.internal.n.g(dVarE, "observerMap.iteratorWithAdditions()");
        while (dVarE.hasNext() && !this.f13468h) {
            Map.Entry entry = (Map.Entry) dVarE.next();
            InterfaceC1162w interfaceC1162w = (InterfaceC1162w) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f13464d) < 0 && !this.f13468h && this.f13463c.contains(interfaceC1162w)) {
                m(bVar.b());
                AbstractC1157q.a aVarB = AbstractC1157q.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1163x, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f13463c.size() == 0) {
            return true;
        }
        Map.Entry entryA = this.f13463c.a();
        kotlin.jvm.internal.n.e(entryA);
        AbstractC1157q.b bVarB = ((b) entryA.getValue()).b();
        Map.Entry entryF = this.f13463c.f();
        kotlin.jvm.internal.n.e(entryF);
        AbstractC1157q.b bVarB2 = ((b) entryF.getValue()).b();
        return bVarB == bVarB2 && this.f13464d == bVarB2;
    }

    private final void k(AbstractC1157q.b bVar) {
        AbstractC1157q.b bVar2 = this.f13464d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1157q.b.INITIALIZED && bVar == AbstractC1157q.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f13464d + " in component " + this.f13465e.get()).toString());
        }
        this.f13464d = bVar;
        if (this.f13467g || this.f13466f != 0) {
            this.f13468h = true;
            return;
        }
        this.f13467g = true;
        o();
        this.f13467g = false;
        if (this.f13464d == AbstractC1157q.b.DESTROYED) {
            this.f13463c = new p120m.a();
        }
    }

    private final void l() {
        ArrayList arrayList = this.f13469i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(AbstractC1157q.b bVar) {
        this.f13469i.add(bVar);
    }

    private final void o() {
        InterfaceC1163x interfaceC1163x = (InterfaceC1163x) this.f13465e.get();
        if (interfaceC1163x == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f13468h = false;
            AbstractC1157q.b bVar = this.f13464d;
            Map.Entry entryA = this.f13463c.a();
            kotlin.jvm.internal.n.e(entryA);
            if (bVar.compareTo(((b) entryA.getValue()).b()) < 0) {
                e(interfaceC1163x);
            }
            Map.Entry entryF = this.f13463c.f();
            if (!this.f13468h && entryF != null && this.f13464d.compareTo(((b) entryF.getValue()).b()) > 0) {
                h(interfaceC1163x);
            }
        }
        this.f13468h = false;
        this.f13470j.setValue(b());
    }

    @Override // androidx.lifecycle.AbstractC1157q
    public void a(InterfaceC1162w observer) {
        InterfaceC1163x interfaceC1163x;
        kotlin.jvm.internal.n.h(observer, "observer");
        g("addObserver");
        AbstractC1157q.b bVar = this.f13464d;
        AbstractC1157q.b bVar2 = AbstractC1157q.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1157q.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f13463c.j(observer, bVar3)) == null && (interfaceC1163x = (InterfaceC1163x) this.f13465e.get()) != null) {
            boolean z9 = this.f13466f != 0 || this.f13467g;
            AbstractC1157q.b bVarF = f(observer);
            this.f13466f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f13463c.contains(observer)) {
                m(bVar3.b());
                AbstractC1157q.a aVarB = AbstractC1157q.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1163x, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z9) {
                o();
            }
            this.f13466f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1157q
    public AbstractC1157q.b b() {
        return this.f13464d;
    }

    @Override // androidx.lifecycle.AbstractC1157q
    public void d(InterfaceC1162w observer) {
        kotlin.jvm.internal.n.h(observer, "observer");
        g("removeObserver");
        this.f13463c.m(observer);
    }

    public void i(AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(event, "event");
        g("handleLifecycleEvent");
        k(event.e());
    }

    public void n(AbstractC1157q.b state) {
        kotlin.jvm.internal.n.h(state, "state");
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1165z(InterfaceC1163x provider) {
        this(provider, true);
        kotlin.jvm.internal.n.h(provider, "provider");
    }
}
