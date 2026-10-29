package p237x6;

import C6.j;
import F8.L;
import F8.M;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import p074h3.I;
import p074h3.InterfaceC1362b;
import p079h8.A;
import p079h8.h;
import p079h8.i;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f30041q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final boolean f30042r = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f30043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.android.wallpaper.asset.a f30044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p167q6.b f30045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f30046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f30047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f30049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LruCache f30050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f30051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f30052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C6.e f30053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f30054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f30055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LruCache f30056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f30057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile p219v8.a f30058p;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p227w6.d f30059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j f30060b;

        public b(p227w6.d r9) {
            n.h(r9, "r");
            this.f30059a = r9;
        }

        public final p227w6.c a() {
            if (!c()) {
                return this.f30059a.d();
            }
            j jVar = this.f30060b;
            n.e(jVar);
            return new p227w6.c(jVar, this.f30059a.d().b());
        }

        public final p227w6.d b() {
            return c() ? new p227w6.d(a(), this.f30059a.c()) : this.f30059a;
        }

        public final boolean c() {
            return (this.f30060b == null || n.d(this.f30059a.d().c(), this.f30060b)) ? false : true;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30061q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f30062r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ k f30063s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f30064t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ C6.e f30065u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, k kVar, long j9, C6.e eVar, p129m8.e eVar2) {
            super(2, eVar2);
            this.f30062r = list;
            this.f30063s = kVar;
            this.f30064t = j9;
            this.f30065u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f30062r, this.f30063s, this.f30064t, this.f30065u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p227w6.c cVarA;
            p139n8.b.e();
            if (this.f30061q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            try {
                List list = this.f30062r;
                if (list != null && (!list.isEmpty())) {
                    com.nothing.wallpaper.common.log.c.d("EffectAssetManager", "do delete deletes:" + this.f30062r);
                    List list2 = this.f30062r;
                    k kVar = this.f30063s;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        kVar.f30043a.p((String) it.next());
                    }
                }
                this.f30063s.j(false);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f30064t;
                String str = this.f30063s.f30051i;
                String str2 = this.f30063s.f30051i;
                k kVar2 = this.f30063s;
                b bVarS = k.s(kVar2, kVar2.f30051i, false, 2, null);
                String strA = (bVarS == null || (cVarA = bVarS.a()) == null) ? null : cVarA.a();
                List list3 = this.f30062r;
                C6.e eVar = this.f30065u;
                com.nothing.wallpaper.common.log.c.d("EffectAssetManager", "close success: consume=" + jCurrentTimeMillis + "," + str + "=" + str2 + ",originScope=" + strA + ",deletes=" + list3 + ",effect=" + (eVar != null ? eVar.a() : null) + ".");
            } catch (Exception e10) {
                com.nothing.wallpaper.common.log.c.f("EffectAssetManager", "close with error:" + e10);
            }
            return A.f21846a;
        }
    }

    public static final class d extends LruCache {
        d() {
            super(20971520);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(j key, Bitmap value) {
            n.h(key, "key");
            n.h(value, "value");
            return value.getByteCount();
        }
    }

    public static final class e extends LruCache {
        e() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z9, String key, b bVar, b bVar2) {
            n.h(key, "key");
            if (z9 && n.d(key, k.this.f30051i)) {
                put(k.this.f30051i, bVar);
            }
        }
    }

    public k(q cache, Context context, com.android.wallpaper.asset.a original, String str) {
        n.h(cache, "cache");
        n.h(context, "context");
        n.h(original, "original");
        this.f30043a = cache;
        this.f30044b = original;
        this.f30045c = new p167q6.b(this);
        this.f30046d = context.getApplicationContext();
        this.f30047e = str == null;
        str = str == null ? String.valueOf(System.currentTimeMillis()) : str;
        this.f30048f = str;
        this.f30049g = new LinkedHashMap();
        this.f30050h = new e();
        this.f30051i = o.d(null, str);
        this.f30052j = i.b(new p219v8.a() { // from class: x6.h
            @Override // p219v8.a
            public final Object invoke() {
                return k.g();
            }
        });
        this.f30054l = true;
        this.f30056n = new d();
    }

    private final void C(com.android.wallpaper.asset.a aVar) throws JSONException {
        if (o(this.f30051i) != null) {
            com.nothing.wallpaper.common.log.c.d("EffectAssetManager", "original in files, no need save again.");
        } else {
            y(new p227w6.d(new p227w6.c(new j(1.0f, G6.c.h(), null, null, 12, null), null), new w6.b.a(aVar)), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1362b g() {
        return I.a().t();
    }

    private final p227w6.d h(p227w6.d dVar) throws JSONException {
        if (!this.f30054l || !this.f30055m || !(dVar.c() instanceof w6.b.a) || (((w6.b.a) dVar.c()).a() instanceof com.android.wallpaper.asset.d)) {
            return dVar;
        }
        com.nothing.wallpaper.common.log.c.d("EffectAssetManager", "build cache asset for " + dVar.d().a() + ".");
        return p227w6.d.b(dVar, null, new w6.b.a(new com.android.wallpaper.asset.d(this.f30046d, ((w6.b.a) dVar.c()).a())), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean z9) throws IOException {
        if (z9) {
            this.f30043a.p(this.f30048f);
        }
        this.f30043a.flush();
    }

    private final b o(String str) {
        b bVar = (b) this.f30049g.get(str);
        if (bVar != null) {
            return bVar;
        }
        p227w6.d dVar = this.f30043a.get(str);
        if (dVar == null) {
            return null;
        }
        b bVar2 = new b(h(dVar));
        this.f30049g.put(str, bVar2);
        return bVar2;
    }

    private final synchronized b r(String str, boolean z9) {
        b bVarO;
        try {
            t();
            if (z9) {
                bVarO = o(str);
                if (bVarO == null) {
                    bVarO = (b) this.f30050h.get(str);
                }
            } else {
                bVarO = (b) this.f30050h.get(str);
                if (bVarO == null) {
                    bVarO = o(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return bVarO;
    }

    static /* synthetic */ b s(k kVar, String str, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return kVar.r(str, z9);
    }

    private final String u(C6.e eVar) {
        return o.d(eVar != null ? eVar.a() : null, this.f30048f);
    }

    private final String v(p227w6.c cVar) {
        E6.a.C0050a c0050aB = cVar.b();
        return u(c0050aB != null ? c0050aB.b() : null);
    }

    private final void w() {
        if (f30042r) {
            List listA = this.f30043a.A(new p219v8.l() { // from class: x6.j
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(k.x((String) obj));
                }
            });
            com.nothing.wallpaper.common.log.c.d("EffectAssetManager", "current group=" + this.f30048f + ",origin scope=" + q().d().c().a() + ",isNew=" + this.f30047e + ",all cache:" + listA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(String it) {
        n.h(it, "it");
        return true;
    }

    private final void y(p227w6.d dVar, boolean z9) throws JSONException {
        String strV = v(dVar.d());
        if (n.d(strV, this.f30051i) && !z9) {
            com.nothing.wallpaper.common.log.c.o("EffectAssetManager", "can's put original in memory out of setOriginal().");
            return;
        }
        p227w6.d dVarH = h(dVar);
        this.f30050h.put(strV, new b(dVarH));
        this.f30045c.a("resultCache add result for " + dVar.d() + ", now size is " + this.f30050h.size());
        this.f30043a.L(strV, dVarH, new p219v8.l() { // from class: x6.i
            @Override // p219v8.l
            public final Object f(Object obj) {
                return k.z(this.f30040q, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A z(k kVar, boolean z9) {
        p219v8.a aVar;
        if (!z9 && (aVar = kVar.f30058p) != null) {
            aVar.invoke();
        }
        return A.f21846a;
    }

    public final synchronized void A(Bitmap bitmap) {
        n.h(bitmap, "bitmap");
        y(new p227w6.d(new p227w6.c(new j(1.0f, G6.c.h(), null, null, 12, null), new E6.a.C0050a(C6.e.a.f641c)), new p227w6.b.C0726b(bitmap)), false);
    }

    public final void B(p219v8.a aVar) {
        this.f30058p = aVar;
    }

    public final void i() {
        if (this.f30057o) {
            j(this.f30047e);
        }
    }

    public final void k() throws IOException {
        if (this.f30057o) {
            j(this.f30047e);
        }
    }

    public final Object l(List list, p129m8.e eVar) {
        if (!this.f30057o) {
            return A.f21846a;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r(this.f30051i, true) == null) {
            throw new IllegalArgumentException("original image is null.");
        }
        if (list != null ? list.contains(this.f30051i) : false) {
            throw new IllegalArgumentException("save original but original image contains in deletes.");
        }
        Object objE = M.e(new c(list, this, jCurrentTimeMillis, this.f30053k, null), eVar);
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    public final synchronized p227w6.d m() {
        return n(C6.e.a.f641c);
    }

    public final synchronized p227w6.d n(C6.e effect) {
        b bVarS;
        n.h(effect, "effect");
        t();
        bVarS = s(this, u(effect), false, 2, null);
        return bVarS != null ? bVarS.b() : null;
    }

    public final String p() {
        return this.f30048f;
    }

    public final synchronized p227w6.d q() {
        b bVarR;
        t();
        bVarR = r(this.f30051i, true);
        n.e(bVarR);
        return bVarR.b();
    }

    public final synchronized void t() {
        if (this.f30057o) {
            return;
        }
        com.nothing.wallpaper.common.log.c.d("EffectAssetManager", "initialize.");
        C(this.f30044b);
        this.f30057o = true;
        w();
    }
}
