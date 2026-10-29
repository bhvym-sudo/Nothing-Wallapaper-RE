package p175r4;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p025c4.C1199m;
import p036d5.AbstractC1304c;
import p036d5.C1308g;
import p036d5.m;
import p215v4.k;
import p231x0.f;
import p231x0.h;

/* JADX INFO: renamed from: r4.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1784f9 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static AbstractC1948w f26673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AbstractC1968y f26674l = AbstractC1968y.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V8 f26677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f26678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f26679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f26680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f26683i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f26684j = new HashMap();

    public C1784f9(Context context, final m mVar, V8 v9, String str) {
        this.f26675a = context.getPackageName();
        this.f26676b = AbstractC1304c.a(context);
        this.f26678d = mVar;
        this.f26677c = v9;
        r9.a();
        this.f26681g = str;
        this.f26679e = C1308g.a().b(new Callable() { // from class: r4.b9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f26452a.b();
            }
        });
        C1308g c1308gA = C1308g.a();
        mVar.getClass();
        this.f26680f = c1308gA.b(new Callable() { // from class: r4.c9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC1968y abstractC1968y = f26674l;
        this.f26682h = abstractC1968y.containsKey(str) ? DynamiteModule.b(context, (String) abstractC1968y.get(str)) : -1;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized AbstractC1948w i() {
        try {
            AbstractC1948w abstractC1948w = f26673k;
            if (abstractC1948w != null) {
                return abstractC1948w;
            }
            h hVarA = f.a(Resources.getSystem().getConfiguration());
            C1918t c1918t = new C1918t();
            for (int i10 = 0; i10 < hVarA.f(); i10++) {
                c1918t.a(AbstractC1304c.b(hVarA.c(i10)));
            }
            AbstractC1948w abstractC1948wB = c1918t.b();
            f26673k = abstractC1948wB;
            return abstractC1948wB;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String j() {
        if (this.f26679e.l()) {
            return (String) this.f26679e.i();
        }
        return C1199m.a().b(this.f26681g);
    }

    private final boolean k(EnumC1896q6 enumC1896q6, long j9, long j10) {
        return this.f26683i.get(enumC1896q6) == null || j9 - ((Long) this.f26683i.get(enumC1896q6)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return C1199m.a().b(this.f26681g);
    }

    final /* synthetic */ void c(U8 u9, EnumC1896q6 enumC1896q6, String str) {
        u9.d(enumC1896q6);
        String strB = u9.b();
        C1927t8 c1927t8 = new C1927t8();
        c1927t8.b(this.f26675a);
        c1927t8.c(this.f26676b);
        c1927t8.h(i());
        c1927t8.g(Boolean.TRUE);
        c1927t8.l(strB);
        c1927t8.j(str);
        c1927t8.i(this.f26680f.l() ? (String) this.f26680f.i() : this.f26678d.a());
        c1927t8.d(10);
        c1927t8.k(Integer.valueOf(this.f26682h));
        u9.a(c1927t8);
        this.f26677c.a(u9);
    }

    public final void d(U8 u9, EnumC1896q6 enumC1896q6) {
        e(u9, enumC1896q6, j());
    }

    public final void e(final U8 u9, final EnumC1896q6 enumC1896q6, final String str) {
        C1308g.d().execute(new Runnable() { // from class: r4.Z8
            @Override // java.lang.Runnable
            public final void run() {
                this.f26400q.c(u9, enumC1896q6, str);
            }
        });
    }

    public final void f(InterfaceC1773e9 interfaceC1773e9, EnumC1896q6 enumC1896q6) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC1896q6, jElapsedRealtime, 30L)) {
            this.f26683i.put(enumC1896q6, Long.valueOf(jElapsedRealtime));
            e(interfaceC1773e9.zza(), enumC1896q6, j());
        }
    }

    final /* synthetic */ void g(EnumC1896q6 enumC1896q6, p086i5.h hVar) {
        C c10 = (C) this.f26684j.get(enumC1896q6);
        if (c10 != null) {
            for (Object obj : c10.d()) {
                ArrayList arrayList = new ArrayList(c10.c(obj));
                Collections.sort(arrayList);
                O5 o9 = new O5();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                o9.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                o9.c(Long.valueOf(a(arrayList, 100.0d)));
                o9.f(Long.valueOf(a(arrayList, 75.0d)));
                o9.d(Long.valueOf(a(arrayList, 50.0d)));
                o9.b(Long.valueOf(a(arrayList, 25.0d)));
                o9.e(Long.valueOf(a(arrayList, 0.0d)));
                Q5 q5G = o9.g();
                int size = arrayList.size();
                C1905r6 c1905r6 = new C1905r6();
                c1905r6.e(EnumC1866n6.TYPE_THIN);
                X0 x9 = new X0();
                x9.a(Integer.valueOf(size));
                x9.c((C1721a1) obj);
                x9.b(q5G);
                c1905r6.d(x9.e());
                e(C1817i9.e(c1905r6), enumC1896q6, j());
            }
            this.f26684j.remove(enumC1896q6);
        }
    }

    final /* synthetic */ void h(final EnumC1896q6 enumC1896q6, Object obj, long j9, final p086i5.h hVar) {
        if (!this.f26684j.containsKey(enumC1896q6)) {
            this.f26684j.put(enumC1896q6, J9.p());
        }
        ((C) this.f26684j.get(enumC1896q6)).b(obj, Long.valueOf(j9));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC1896q6, jElapsedRealtime, 30L)) {
            this.f26683i.put(enumC1896q6, Long.valueOf(jElapsedRealtime));
            C1308g.d().execute(new Runnable() { // from class: r4.a9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26430q.g(enumC1896q6, hVar);
                }
            });
        }
    }
}
