package S4;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class m extends AbstractC0945a implements T4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Y4.b f7315g = l.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f7320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f7321f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f7322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f7323b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f7324c = new ArrayList();

        b(Executor executor) {
            this.f7322a = executor;
        }

        public b a(c cVar) {
            this.f7324c.add(cVar);
            return this;
        }

        public b b(Collection collection) {
            this.f7323b.addAll(collection);
            return this;
        }

        public m c() {
            return new m(this.f7322a, this.f7323b, this.f7324c);
        }
    }

    public static b e(Executor executor) {
        return new b(executor);
    }

    private void f(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f7319d.iterator();
            while (it.hasNext()) {
                try {
                    h hVar = (h) ((Y4.b) it.next()).get();
                    if (hVar != null) {
                        list.addAll(hVar.a());
                        it.remove();
                    }
                } catch (t e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f7316a.isEmpty()) {
                n.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f7316a.keySet());
                arrayList2.addAll(list);
                n.a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                this.f7316a.put(cVar, new u(i.a(this, cVar)));
            }
            arrayList.addAll(o(list));
            arrayList.addAll(p());
            n();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m();
    }

    private void g(Map map, boolean z9) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            Y4.b bVar = (Y4.b) entry.getValue();
            if (cVar.h() || (cVar.i() && z9)) {
                bVar.get();
            }
        }
        this.f7320e.a();
    }

    private static List i(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void m() {
        Boolean bool = (Boolean) this.f7321f.get();
        if (bool != null) {
            g(this.f7316a, bool.booleanValue());
        }
    }

    private void n() {
        for (c cVar : this.f7316a.keySet()) {
            for (o oVar : cVar.c()) {
                if (oVar.f() && !this.f7318c.containsKey(oVar.b())) {
                    this.f7318c.put(oVar.b(), v.b(Collections.EMPTY_SET));
                } else if (this.f7317b.containsKey(oVar.b())) {
                    continue;
                } else {
                    if (oVar.e()) {
                        throw new w(String.format("Unsatisfied dependency for component %s: %s", cVar, oVar.b()));
                    }
                    if (!oVar.f()) {
                        this.f7317b.put(oVar.b(), z.a());
                    }
                }
            }
        }
    }

    private List o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.j()) {
                Y4.b bVar = (Y4.b) this.f7316a.get(cVar);
                for (Class cls : cVar.e()) {
                    if (this.f7317b.containsKey(cls)) {
                        arrayList.add(j.a((z) ((Y4.b) this.f7317b.get(cls)), bVar));
                    } else {
                        this.f7317b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List p() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f7316a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.j()) {
                Y4.b bVar = (Y4.b) entry.getValue();
                for (Class cls : cVar.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f7318c.containsKey(entry2.getKey())) {
                v vVar = (v) this.f7318c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(k.a(vVar, (Y4.b) it.next()));
                }
            } else {
                this.f7318c.put((Class) entry2.getKey(), v.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // S4.AbstractC0945a, S4.d
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // S4.d
    public synchronized Y4.b b(Class cls) {
        A.c(cls, "Null interface requested.");
        return (Y4.b) this.f7317b.get(cls);
    }

    @Override // S4.d
    public synchronized Y4.b c(Class cls) {
        v vVar = (v) this.f7318c.get(cls);
        if (vVar != null) {
            return vVar;
        }
        return f7315g;
    }

    @Override // S4.AbstractC0945a, S4.d
    public /* bridge */ /* synthetic */ Set d(Class cls) {
        return super.d(cls);
    }

    public void h(boolean z9) {
        HashMap map;
        if (this.f7321f.compareAndSet(null, Boolean.valueOf(z9))) {
            synchronized (this) {
                map = new HashMap(this.f7316a);
            }
            g(map, z9);
        }
    }

    private m(Executor executor, Iterable iterable, Collection collection) {
        this.f7316a = new HashMap();
        this.f7317b = new HashMap();
        this.f7318c = new HashMap();
        this.f7321f = new AtomicReference();
        s sVar = new s(executor);
        this.f7320e = sVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.l(sVar, s.class, X4.c.class, X4.b.class));
        arrayList.add(c.l(this, T4.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f7319d = i(iterable);
        f(arrayList);
    }
}
