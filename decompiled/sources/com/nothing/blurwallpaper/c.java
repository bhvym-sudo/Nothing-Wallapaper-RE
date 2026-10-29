package com.nothing.blurwallpaper;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import F8.M;
import I8.G;
import I8.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.google.gson.Gson;
import com.nothing.blurwallpaper.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.q;
import p079h8.r;
import p129m8.i;
import p166q5.v;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements L {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f17732v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Map f17733w = new LinkedHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ L f17734q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f17735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f17736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z f17737t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile String f17738u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final synchronized void a(String group) {
            n.h(group, "group");
            c cVar = (c) c.f17733w.get(group);
            if (cVar == null) {
                return;
            }
            if (cVar.g()) {
                c.f17733w.remove(group);
            }
        }

        public final synchronized c b(Context appContext, String group) {
            Object cVar;
            try {
                n.h(appContext, "appContext");
                n.h(group, "group");
                Map map = c.f17733w;
                cVar = map.get(group);
                if (cVar == null) {
                    Context applicationContext = appContext.getApplicationContext();
                    n.g(applicationContext, "getApplicationContext(...)");
                    cVar = new c(applicationContext, group);
                    map.put(group, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return (c) cVar;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f17740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f17741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p087i6.g f17742d;

        public b(String path, Bitmap bitmap, p087i6.g gVar, boolean z9) {
            n.h(path, "path");
            this.f17739a = path;
            this.f17740b = bitmap;
            this.f17741c = z9;
            this.f17742d = gVar;
        }

        public final Bitmap a() {
            return this.f17740b;
        }

        public final p087i6.g b() {
            return this.f17742d;
        }

        public final String c() {
            return this.f17739a;
        }

        public final boolean d() {
            return this.f17741c;
        }

        public final void e(p087i6.g gVar) {
            this.f17742d = gVar;
        }
    }

    /* JADX INFO: renamed from: com.nothing.blurwallpaper.c$c, reason: collision with other inner class name */
    static final class C0470c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17743q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o f17745s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0470c(o oVar, p129m8.e eVar) {
            super(2, eVar);
            this.f17745s = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return c.this.new C0470c(this.f17745s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0470c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f17743q;
            if (i10 == 0) {
                r.b(obj);
                z zVarH = c.this.h();
                o oVar = this.f17745s;
                this.f17743q = 1;
                if (zVarH.b(oVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17746q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f17747r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f17748s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.a f17749t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, c cVar, p219v8.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f17747r = bVar;
            this.f17748s = cVar;
            this.f17749t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new d(this.f17747r, this.f17748s, this.f17749t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p139n8.b.e();
            if (this.f17746q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "start process " + this.f17747r);
            c cVar = this.f17748s;
            b bVar = this.f17747r;
            p219v8.a aVar = this.f17749t;
            try {
                q.a aVar2 = q.f21862r;
                cVar.l(bVar, aVar);
                objB = q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar3 = q.f21862r;
                objB = q.b(r.a(th));
            }
            b bVar2 = this.f17747r;
            p219v8.a aVar4 = this.f17749t;
            Throwable thD = q.d(objB);
            if (thD != null) {
                com.nothing.wallpaper.common.log.c.g("BLUR-ImageProcessor", "process " + bVar2 + " error", thD);
                aVar4.invoke();
            }
            return A.f21846a;
        }
    }

    public c(Context appContext, String group) {
        n.h(appContext, "appContext");
        n.h(group, "group");
        this.f17734q = M.b();
        this.f17735r = appContext;
        this.f17736s = group;
        this.f17737t = G.b(4, 0, H8.a.DROP_OLDEST, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        Object next;
        String str = this.f17738u;
        Iterator it = this.f17737t.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!n.d(((o) next).c(), str));
        o oVar = (o) next;
        this.f17737t.g();
        if (oVar != null) {
            AbstractC0816i.d(this, null, null, new C0470c(oVar, null), 3, null);
        }
        return str == null;
    }

    public static /* synthetic */ void j(c cVar, b bVar, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new p219v8.a() { // from class: q5.o
                @Override // p219v8.a
                public final Object invoke() {
                    return c.k();
                }
            };
        }
        cVar.i(bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A k() {
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final b bVar, final p219v8.a aVar) throws IOException {
        Object next;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strC = bVar.c();
        Iterator it = this.f17737t.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!n.d(((o) next).c(), strC));
        o oVar = (o) next;
        List list = oVar != null ? (List) oVar.d() : null;
        if (list != null) {
            p(strC, list, bVar.d());
            m(aVar, bVar);
            return;
        }
        if (bVar.a() == null || bVar.a().isRecycled()) {
            p166q5.n.f25056a.t(this.f17735r, strC, new p() { // from class: q5.q
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return c.o(this.f25068q, strC, bVar, jCurrentTimeMillis, aVar, (List) obj, (List) obj2);
                }
            });
            return;
        }
        p166q5.n nVar = p166q5.n.f25056a;
        nVar.v(strC, bVar.a());
        com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "saveImage: path=" + strC + ", bitmap=" + p097j6.b.c(bVar.a()));
        nVar.s(this.f17735r, bVar.a(), new p() { // from class: q5.p
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return c.n(this.f25063q, strC, bVar, jCurrentTimeMillis, aVar, (List) obj, (List) obj2);
            }
        });
    }

    private static final void m(p219v8.a aVar, b bVar) {
        aVar.invoke();
        p087i6.g gVarB = bVar.b();
        if (gVarB != null) {
            gVarB.P(true);
            com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "blur done.");
        }
        bVar.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A n(c cVar, String str, b bVar, long j9, p219v8.a aVar, List list, List vertexInfos) {
        n.h(list, "<unused var>");
        n.h(vertexInfos, "vertexInfos");
        cVar.p(str, vertexInfos, bVar.d());
        m(aVar, bVar);
        com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "saveWithPath: path=" + str + ", total consume " + (System.currentTimeMillis() - j9) + ", vertexInfos=" + new Gson().toJson(vertexInfos));
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o(c cVar, String str, b bVar, long j9, p219v8.a aVar, List list, List vertexInfos) {
        n.h(list, "<unused var>");
        n.h(vertexInfos, "vertexInfos");
        cVar.p(str, vertexInfos, bVar.d());
        m(aVar, bVar);
        com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "saveWithPath: path=" + str + ", total consume " + (System.currentTimeMillis() - j9) + ", vertexInfos=" + new Gson().toJson(vertexInfos));
        return A.f21846a;
    }

    private final void p(String str, List list, boolean z9) {
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z9) {
            Iterator it = this.f17737t.c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!n.d(((o) next).c(), str));
            if (next == null) {
                this.f17737t.h(new o(str, list));
                return;
            } else {
                com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "saveVertex to flow but has exit.");
                return;
            }
        }
        SharedPreferences.Editor editorEdit = v.f25076a.d(this.f17735r).edit();
        editorEdit.putString("final_image_path", str);
        editorEdit.putString("final_vertex_infos", new Gson().toJson(list));
        editorEdit.commit();
        com.nothing.wallpaper.common.log.c.d("BLUR-ImageProcessor", "saveVertex to sp: path " + str + ",consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final z h() {
        return this.f17737t;
    }

    public final void i(b imageInfo, p219v8.a onDone) {
        n.h(imageInfo, "imageInfo");
        n.h(onDone, "onDone");
        if (!imageInfo.d()) {
            this.f17738u = imageInfo.c();
        }
        AbstractC0816i.d(this, C0803b0.b(), null, new d(imageInfo, this, onDone, null), 2, null);
    }

    @Override // F8.L
    public i w0() {
        return this.f17734q.w0();
    }
}
