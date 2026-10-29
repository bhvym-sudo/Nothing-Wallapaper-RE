package p237x6;

import E8.i;
import android.graphics.Bitmap;
import android.net.Uri;
import e9.B;
import e9.f;
import e9.g;
import e9.j;
import e9.o;
import e9.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.m;
import p079h8.r;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f30008s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Charset f30009t = E8.d.f1445b;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p257z6.b f30010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f30011r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f30012r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ z6.b.d f30013s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z6.b.d dVar, B b10) {
            super(b10);
            this.f30013s = dVar;
        }

        @Override // e9.j, e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            if (this.f30012r) {
                return;
            }
            this.f30012r = true;
            this.f30013s.close();
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f30014q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f30015r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f30016s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f30017t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f30018u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f30020w;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30018u = obj;
            this.f30020w |= Integer.MIN_VALUE;
            return e.this.j0(null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f30021q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f30022r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f30023s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f30025u;

        d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30023s = obj;
            this.f30025u |= Integer.MIN_VALUE;
            return e.this.z(null, null, this);
        }
    }

    /* JADX INFO: renamed from: x6.e$e, reason: collision with other inner class name */
    static final class C0739e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f30026q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f30027r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f30028s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f30030u;

        C0739e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30028s = obj;
            this.f30030u |= Integer.MIN_VALUE;
            return e.this.B(null, null, this);
        }
    }

    public e(p257z6.b cache) {
        n.h(cache, "cache");
        this.f30010q = cache;
        this.f30011r = true;
        if (cache.A0() != 2) {
            throw new IllegalArgumentException("cache's value count must be 2.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(com.android.wallpaper.asset.a aVar, p257z6.b.C0766b c0766b, p129m8.e eVar) {
        C0739e c0739e;
        if (eVar instanceof C0739e) {
            c0739e = (C0739e) eVar;
            int i10 = c0739e.f30030u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0739e.f30030u = i10 - Integer.MIN_VALUE;
            } else {
                c0739e = new C0739e(eVar);
            }
        } else {
            c0739e = new C0739e(eVar);
        }
        Object objE = c0739e.f30028s;
        Object objE2 = p139n8.b.e();
        int i11 = c0739e.f30030u;
        if (i11 == 0) {
            r.b(objE);
            c0739e.f30026q = this;
            c0739e.f30027r = c0766b;
            c0739e.f30030u = 1;
            objE = G6.a.e(aVar, false, c0739e);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0766b = (p257z6.b.C0766b) c0739e.f30027r;
            this = (e) c0739e.f30026q;
            r.b(objE);
        }
        Bitmap bitmap = (Bitmap) objE;
        return kotlin.coroutines.jvm.internal.b.a(bitmap != null ? this.G(bitmap, c0766b) : false);
    }

    private final boolean G(Bitmap bitmap, p257z6.b.C0766b c0766b) {
        return U(bitmap, c0766b.g(1));
    }

    private final Object I(p257z6.b.C0766b c0766b, p227w6.b bVar, p129m8.e eVar) {
        if (bVar instanceof p227w6.b.C0726b) {
            return kotlin.coroutines.jvm.internal.b.a(G(((p227w6.b.C0726b) bVar).a(), c0766b));
        }
        if (bVar instanceof w6.b.a) {
            return this.f30011r ? B(((w6.b.a) bVar).a(), c0766b, eVar) : z(((w6.b.a) bVar).a(), c0766b, eVar);
        }
        throw new m();
    }

    private final void K(p257z6.b.C0766b c0766b, p227w6.c cVar) throws IOException {
        Y(cVar, c0766b.g(0));
    }

    private final void Q(InputStream inputStream, p257z6.b.C0766b c0766b) {
        OutputStream outputStreamB1 = o.c(c0766b.g(1)).b1();
        try {
            if (p189s8.a.b(inputStream, outputStreamB1, 0, 2, null) <= 0) {
                throw new IllegalArgumentException("stream is empty");
            }
            outputStreamB1.flush();
            Q8.d.m(inputStream);
            Q8.d.m(outputStreamB1);
        } catch (Throwable th) {
            Q8.d.m(inputStream);
            Q8.d.m(outputStreamB1);
            throw th;
        }
    }

    private final boolean U(Bitmap bitmap, z zVar) throws IOException {
        OutputStream outputStreamB1 = o.c(zVar).b1();
        try {
            boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 1, outputStreamB1);
            zVar.flush();
            p189s8.b.a(outputStreamB1, null);
            return zCompress;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(outputStreamB1, th);
                throw th2;
            }
        }
    }

    private final void Y(p227w6.c cVar, z zVar) throws IOException {
        f fVarC = o.c(zVar);
        try {
            fVarC.d0(u(cVar));
            fVarC.flush();
            A a10 = A.f21846a;
            p189s8.b.a(fVarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(fVarC, th);
                throw th2;
            }
        }
    }

    private final com.android.wallpaper.asset.a f(String str) {
        if (this.f30010q.O0().contains(str)) {
            return new g(str, this);
        }
        return null;
    }

    private final p227w6.c g(z6.b.d dVar) throws IOException {
        p227w6.c cVarJ;
        g gVarD = o.d(dVar.a(0));
        try {
            try {
                cVarJ = j(gVarD.h0(f30009t));
            } catch (IOException e10) {
                com.nothing.wallpaper.common.log.c.e("read params string accor io error: " + e10);
                cVarJ = null;
            }
            p189s8.b.a(gVarD, null);
            return cVarJ;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(gVarD, th);
                throw th2;
            }
        }
    }

    private final p227w6.c j(String str) {
        List listM0 = i.m0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (!i.f0((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return p227w6.c.f29660c.a((String) arrayList.get(0));
    }

    private final String u(p227w6.c cVar) {
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(com.android.wallpaper.asset.a aVar, p257z6.b.C0766b c0766b, p129m8.e eVar) {
        d dVar;
        InputStream inputStreamO;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i10 = dVar.f30025u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f30025u = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f30023s;
        Object objE = p139n8.b.e();
        int i11 = dVar.f30025u;
        boolean zG = false;
        if (i11 == 0) {
            r.b(objB);
            if (aVar instanceof com.android.wallpaper.asset.o) {
                inputStreamO = ((com.android.wallpaper.asset.o) aVar).O();
            } else if (aVar instanceof com.android.wallpaper.asset.d) {
                com.android.wallpaper.asset.a aVar2 = ((com.android.wallpaper.asset.d) aVar).f15862c;
                com.android.wallpaper.asset.o oVar = aVar2 instanceof com.android.wallpaper.asset.o ? (com.android.wallpaper.asset.o) aVar2 : null;
                if (oVar != null) {
                    inputStreamO = oVar.O();
                } else {
                    inputStreamO = null;
                }
            } else {
                inputStreamO = null;
            }
            if (inputStreamO != null) {
                Q(inputStreamO, c0766b);
                zG = true;
            } else {
                dVar.f30021q = this;
                dVar.f30022r = c0766b;
                dVar.f30025u = 1;
                objB = G6.a.b(aVar, false, dVar);
                if (objB == objE) {
                    return objE;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0766b = (p257z6.b.C0766b) dVar.f30022r;
        this = (e) dVar.f30021q;
        r.b(objB);
        Bitmap bitmap = (Bitmap) objB;
        if (bitmap != null) {
            zG = this.G(bitmap, c0766b);
        }
        return kotlin.coroutines.jvm.internal.b.a(zG);
    }

    @Override // p237x6.r
    public List A(l filter) {
        n.h(filter, "filter");
        List listO0 = this.f30010q.O0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO0) {
            if (((Boolean) filter.f(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p237x6.r
    public Uri Q0(String key) {
        n.h(key, "key");
        z6.b.d dVarB0 = this.f30010q.q0() ? null : this.f30010q.b0(key);
        if (dVarB0 != null) {
            return dVarB0.b(1);
        }
        return null;
    }

    @Override // p237x6.r
    public void V(List list) {
        try {
            List listO0 = this.f30010q.O0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listO0) {
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
            this.f30010q.Y(arrayList);
        } catch (IOException e10) {
            com.nothing.wallpaper.common.log.c.e("delete cache error :" + e10);
        }
    }

    @Override // p237x6.r
    public InputStream W(String key) {
        z6.b.d dVarB0;
        n.h(key, "key");
        if (this.f30010q.q0() || (dVarB0 = this.f30010q.b0(key)) == null) {
            return null;
        }
        return o.d(new b(dVarB0, dVarB0.a(1))).f1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30010q.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f30010q.flush();
    }

    @Override // p237x6.r
    public p227w6.d get(String key) throws IOException {
        n.h(key, "key");
        z6.b.d dVarB0 = this.f30010q.b0(key);
        if (dVarB0 == null) {
            return null;
        }
        try {
            p227w6.c cVarG = g(dVarB0);
            if (cVarG == null) {
                p189s8.b.a(dVarB0, null);
                return null;
            }
            com.android.wallpaper.asset.a aVarF = f(key);
            if (aVarF == null) {
                p189s8.b.a(dVarB0, null);
                return null;
            }
            p227w6.d dVar = new p227w6.d(cVarG, new w6.b.a(aVarF));
            p189s8.b.a(dVarB0, null);
            return dVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(dVarB0, th);
                throw th2;
            }
        }
    }

    @Override // p237x6.r
    public int getCount() {
        return this.f30010q.O0().size();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b A[Catch: all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00ca, blocks: (B:30:0x0095, B:47:0x00e0, B:60:0x013b), top: B:68:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v29 */
    @Override // p237x6.r
    public Object j0(String str, p227w6.d dVar, p129m8.e eVar) throws Throwable {
        c cVar;
        String str2;
        p257z6.b.C0766b c0766b;
        int i10;
        boolean z9;
        ?? r9;
        boolean zBooleanValue;
        e eVar2 = this;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i11 = cVar.f30020w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f30020w = i11 - Integer.MIN_VALUE;
            } else {
                cVar = eVar2.new c(eVar);
            }
        } else {
            cVar = eVar2.new c(eVar);
        }
        Object objI = cVar.f30018u;
        Object objE = p139n8.b.e();
        int i12 = cVar.f30020w;
        if (i12 == 0) {
            r.b(objI);
            p257z6.b.C0766b c0766bU = p257z6.b.U(eVar2.f30010q, str, 0L, 2, null);
            if (c0766bU == null) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            try {
                eVar2.K(c0766bU, dVar.d());
                p227w6.b bVarC = dVar.c();
                cVar.f30014q = eVar2;
                str2 = str;
                try {
                    cVar.f30015r = str2;
                    cVar.f30016s = c0766bU;
                    cVar.f30017t = 0;
                    cVar.f30020w = 1;
                    objI = eVar2.I(c0766bU, bVarC, cVar);
                    if (objI == objE) {
                        return objE;
                    }
                    c0766b = c0766bU;
                    i10 = 0;
                    zBooleanValue = ((Boolean) objI).booleanValue();
                    if (zBooleanValue) {
                        c0766b.c();
                    } else {
                        c0766b.b();
                    }
                    com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + zBooleanValue + ", all keys:" + eVar2.f30010q.O0());
                    r9 = zBooleanValue;
                } catch (Exception e10) {
                    e = e10;
                    c0766b = c0766bU;
                    i10 = 0;
                    com.nothing.wallpaper.common.log.c.f("EffectImageCache", "put " + str2 + " error " + e);
                    if (!G6.d.b()) {
                        throw e;
                    }
                    if (i10 != 0) {
                        c0766b.c();
                    } else {
                        c0766b.b();
                    }
                    if (i10 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + z9 + ", all keys:" + eVar2.f30010q.O0());
                    r9 = i10;
                    return kotlin.coroutines.jvm.internal.b.a(r9 != 0);
                } catch (Throwable th) {
                    th = th;
                    c0766b = c0766bU;
                    i10 = 0;
                    if (i10 != 0) {
                        c0766b.c();
                    } else {
                        c0766b.b();
                    }
                    if (i10 != 0) {
                    }
                    com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + z + ", all keys:" + eVar2.f30010q.O0());
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = cVar.f30017t;
            c0766b = (p257z6.b.C0766b) cVar.f30016s;
            String str3 = (String) cVar.f30015r;
            e eVar3 = (e) cVar.f30014q;
            try {
                r.b(objI);
                i10 = i13;
                eVar2 = eVar3;
                str2 = str3;
                try {
                    try {
                        zBooleanValue = ((Boolean) objI).booleanValue();
                        if (zBooleanValue) {
                            c0766b.c();
                        } else {
                            c0766b.b();
                        }
                        com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + zBooleanValue + ", all keys:" + eVar2.f30010q.O0());
                        r9 = zBooleanValue;
                    } catch (Exception e12) {
                        e = e12;
                        com.nothing.wallpaper.common.log.c.f("EffectImageCache", "put " + str2 + " error " + e);
                        if (!G6.d.b()) {
                            throw e;
                        }
                        if (i10 != 0) {
                            c0766b.c();
                        } else {
                            c0766b.b();
                        }
                        if (i10 != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + z9 + ", all keys:" + eVar2.f30010q.O0());
                        r9 = i10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (i10 != 0) {
                        c0766b.c();
                    } else {
                        c0766b.b();
                    }
                    boolean z10 = i10 != 0;
                    com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + z10 + ", all keys:" + eVar2.f30010q.O0());
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                i10 = i13;
                eVar2 = eVar3;
                str2 = str3;
                com.nothing.wallpaper.common.log.c.f("EffectImageCache", "put " + str2 + " error " + e);
                if (!G6.d.b()) {
                    throw e;
                }
                if (i10 != 0) {
                    c0766b.c();
                } else {
                    c0766b.b();
                }
                if (i10 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + z9 + ", all keys:" + eVar2.f30010q.O0());
                r9 = i10;
                return kotlin.coroutines.jvm.internal.b.a(r9 != 0);
            } catch (Throwable th4) {
                th = th4;
                i10 = i13;
                eVar2 = eVar3;
                str2 = str3;
                if (i10 != 0) {
                    c0766b.c();
                } else {
                    c0766b.b();
                }
                if (i10 != 0) {
                }
                com.nothing.wallpaper.common.log.c.d("EffectImageCache", "put " + str2 + " " + z10 + ", all keys:" + eVar2.f30010q.O0());
                throw th;
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(r9 != 0);
    }

    @Override // p237x6.r
    public void p(String group) {
        n.h(group, "group");
        com.nothing.wallpaper.common.log.c.d("EffectImageCache", "remove group " + group);
        List listO0 = this.f30010q.O0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO0) {
            if (((Boolean) o.e().invoke(group, (String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            remove((String) it.next());
        }
    }

    @Override // p237x6.r
    public boolean remove(String key) {
        n.h(key, "key");
        boolean zRemove = this.f30010q.remove(key);
        com.nothing.wallpaper.common.log.c.d("EffectImageCache", "remove " + key + " " + zRemove);
        return zRemove;
    }

    @Override // p237x6.r
    public boolean y() {
        return this.f30010q.isClosed();
    }
}
