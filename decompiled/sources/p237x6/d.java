package p237x6;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.T0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f29990v = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r f29991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final L f29992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map f29993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f29994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p167q6.b f29995u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p227w6.d f29997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f29998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC0846x0 f29999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f30000e;

        public b(String key, p227w6.d result, l lVar) {
            n.h(key, "key");
            n.h(result, "result");
            this.f29996a = key;
            this.f29997b = result;
            this.f29998c = o.c(key);
            ArrayList arrayList = new ArrayList();
            this.f30000e = arrayList;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }

        public final List a() {
            return this.f30000e;
        }

        public final InterfaceC0846x0 b() {
            return this.f29999d;
        }

        public final String c() {
            return this.f29996a;
        }

        public final p227w6.d d() {
            return this.f29997b;
        }

        public final void e(InterfaceC0846x0 interfaceC0846x0) {
            this.f29999d = interfaceC0846x0;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30001q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f30003s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p227w6.d f30004t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ b f30005u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f30006v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f30007w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, p227w6.d dVar, b bVar, int i10, long j9, e eVar) {
            super(2, eVar);
            this.f30003s = str;
            this.f30004t = dVar;
            this.f30005u = bVar;
            this.f30006v = i10;
            this.f30007w = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return d.this.new c(this.f30003s, this.f30004t, this.f30005u, this.f30006v, this.f30007w, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30001q;
            if (i10 == 0) {
                r.b(obj);
                d dVar = d.this;
                String str = this.f30003s;
                p227w6.d dVar2 = this.f30004t;
                this.f30001q = 1;
                obj = dVar.j0(str, dVar2, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            d dVar3 = d.this;
            String str2 = this.f30003s;
            b bVar = this.f30005u;
            int i11 = this.f30006v;
            p227w6.d dVar4 = this.f30004t;
            long j9 = this.f30007w;
            synchronized (dVar3) {
                try {
                    dVar3.f29993s.remove(str2);
                    Iterator it = bVar.a().iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).f(kotlin.coroutines.jvm.internal.b.a(zBooleanValue));
                    }
                    if (zBooleanValue) {
                        dVar3.f29995u.a("putAsync result is true, currId = " + i11 + ", consume " + (System.currentTimeMillis() - j9) + ", " + str2 + ":" + dVar4.d().a());
                    } else {
                        dVar3.f29995u.e("putAsync failed , currId = " + i11 + ", key" + str2 + ", req" + dVar4.d() + ", consume " + (System.currentTimeMillis() - j9));
                    }
                    b bVar2 = (b) dVar3.f29994t.remove(str2);
                    if (bVar2 != null) {
                        dVar3.f29995u.a("continue putAsync for pending job.");
                        dVar3.j(bVar2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return A.f21846a;
        }
    }

    public d(r cache) {
        n.h(cache, "cache");
        this.f29991q = cache;
        this.f29992r = M.a(T0.b(null, 1, null).z(C0803b0.b()));
        this.f29993s = new LinkedHashMap();
        this.f29994t = new LinkedHashMap();
        this.f29995u = new p167q6.b("EffectImageAsyncCache");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(b bVar) {
        String strC = bVar.c();
        p227w6.d dVarD = bVar.d();
        int iHashCode = bVar.hashCode();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f29993s.put(strC, bVar);
        this.f29995u.a("launch job id = " + iHashCode + ",key " + strC + ".");
        bVar.e(AbstractC0816i.d(this.f29992r, null, null, new c(strC, dVarD, bVar, iHashCode, jCurrentTimeMillis, null), 3, null));
    }

    @Override // p237x6.r
    public synchronized List A(l filter) {
        ArrayList arrayList;
        try {
            n.h(filter, "filter");
            Set setKeySet = this.f29993s.keySet();
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) filter.f(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC1444s.M(AbstractC1444s.g0(arrayList, this.f29991q.A(filter)));
    }

    @Override // p237x6.q
    public synchronized void L(String key, p227w6.d result, l lVar) {
        try {
            n.h(key, "key");
            n.h(result, "result");
            b bVar = (b) this.f29993s.get(key);
            if (bVar == null) {
                j(new b(key, result, lVar));
                return;
            }
            if (bVar.d() == result) {
                this.f29995u.a("putAsync but the result is already running, skip it, " + key + ".");
                if (lVar != null) {
                    bVar.a().add(lVar);
                }
            } else {
                b bVar2 = new b(key, result, lVar);
                b bVar3 = (b) this.f29994t.put(key, bVar2);
                if (bVar3 != null) {
                    bVar2.a().addAll(bVar3.a());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p237x6.r
    public synchronized void V(List list) {
        try {
            Set setKeySet = this.f29993s.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                String str = (String) obj;
                Object obj2 = null;
                if (list != null) {
                    for (Object obj3 : list) {
                        if (((Boolean) o.e().invoke((String) obj3, str)).booleanValue()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    obj2 = (String) obj2;
                }
                if (obj2 != null) {
                    arrayList.add(obj);
                }
            }
            Set setKeySet2 = this.f29993s.keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : setKeySet2) {
                if (!arrayList.contains((String) obj4)) {
                    arrayList2.add(obj4);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f29993s.remove((String) it.next());
            }
            this.f29991q.V(list);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p237x6.r
    public InputStream W(String key) {
        n.h(key, "key");
        return this.f29991q.W(key);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29991q.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f29991q.flush();
    }

    @Override // p237x6.r
    public synchronized p227w6.d get(String key) {
        n.h(key, "key");
        b bVar = (b) this.f29993s.get(key);
        if (bVar == null) {
            return this.f29991q.get(key);
        }
        this.f29995u.a("get result from running jobs for " + key + ".");
        return bVar.d();
    }

    @Override // p237x6.r
    public synchronized int getCount() {
        return this.f29991q.getCount() + this.f29993s.size();
    }

    @Override // p237x6.r
    public Object j0(String str, p227w6.d dVar, e eVar) {
        return this.f29991q.j0(str, dVar, eVar);
    }

    @Override // p237x6.r
    public synchronized void p(String group) {
        try {
            n.h(group, "group");
            this.f29995u.a("remove group " + group + ".");
            Set setKeySet = this.f29993s.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (n.d(o.c((String) obj), group)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                remove((String) it.next());
            }
            this.f29991q.p(group);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p237x6.r
    public synchronized boolean remove(String key) {
        boolean z9;
        try {
            n.h(key, "key");
            this.f29995u.a("remove key " + key + ".");
            b bVar = (b) this.f29993s.remove(key);
            if (bVar != null) {
                InterfaceC0846x0 interfaceC0846x0B = bVar.b();
                if (interfaceC0846x0B != null) {
                    InterfaceC0846x0.a.a(interfaceC0846x0B, null, 1, null);
                }
                z9 = true;
            } else {
                z9 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f29991q.remove(key) || z9;
    }

    @Override // p237x6.r
    public boolean y() {
        return this.f29991q.y();
    }
}
