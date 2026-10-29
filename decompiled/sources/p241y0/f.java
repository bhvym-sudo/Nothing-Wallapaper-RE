package p241y0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.P;
import androidx.collection.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t f30119a = new t(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f30120b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f30121c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final P f30122d = new P();

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p241y0.e f30125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30126d;

        a(String str, Context context, p241y0.e eVar, int i10) {
            this.f30123a = str;
            this.f30124b = context;
            this.f30125c = eVar;
            this.f30126d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f30123a, this.f30124b, List.of(this.f30125c), this.f30126d);
        }
    }

    class b implements B0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p241y0.a f30127a;

        b(p241y0.a aVar) {
            this.f30127a = aVar;
        }

        @Override // B0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f30127a.b(eVar);
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f30130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30131d;

        c(String str, Context context, List list, int i10) {
            this.f30128a = str;
            this.f30129b = context;
            this.f30130c = list;
            this.f30131d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f30128a, this.f30129b, this.f30130c, this.f30131d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements B0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30132a;

        d(String str) {
            this.f30132a = str;
        }

        @Override // B0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f30121c) {
                try {
                    P p9 = f.f30122d;
                    ArrayList arrayList = (ArrayList) p9.get(this.f30132a);
                    if (arrayList == null) {
                        return;
                    }
                    p9.remove(this.f30132a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((B0.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((p241y0.e) list.get(i11)).d());
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        g.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List list, int i10) {
        p182s1.a.a("getFontSync");
        try {
            t tVar = f30119a;
            Typeface typeface = (Typeface) tVar.d(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                p182s1.a.b();
                return eVar;
            }
            try {
                g.a aVarE = p241y0.d.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    p182s1.a.b();
                    return eVar2;
                }
                Typeface typefaceC = aVarE.f() ? p191t0.e.c(context, null, aVarE.d(), i10) : p191t0.e.b(context, null, aVarE.c(), i10);
                if (typefaceC == null) {
                    e eVar3 = new e(-3);
                    p182s1.a.b();
                    return eVar3;
                }
                tVar.e(str, typefaceC);
                e eVar4 = new e(typefaceC);
                p182s1.a.b();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                p182s1.a.b();
                return eVar5;
            }
        } catch (Throwable th) {
            p182s1.a.b();
            throw th;
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, p241y0.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f30119a.d(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f30121c) {
            try {
                P p9 = f30122d;
                ArrayList arrayList = (ArrayList) p9.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                p9.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f30120b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, p241y0.e eVar, p241y0.a aVar, int i10, int i11) {
        String strA = a(List.of(eVar), i10);
        Typeface typeface = (Typeface) f30119a.d(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, List.of(eVar), i10);
            aVar.b(eVarC);
            return eVarC.f30133a;
        }
        try {
            e eVar2 = (e) h.d(f30120b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f30133a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f30133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f30134b;

        e(int i10) {
            this.f30133a = null;
            this.f30134b = i10;
        }

        boolean a() {
            return this.f30134b == 0;
        }

        e(Typeface typeface) {
            this.f30133a = typeface;
            this.f30134b = 0;
        }
    }
}
