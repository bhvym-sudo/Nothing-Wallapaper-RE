package D6;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.T0;
import I8.G;
import I8.InterfaceC0880f;
import I8.z;
import android.graphics.Bitmap;
import android.graphics.Point;
import java.util.List;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p227w6.a f1039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p167q6.b f1040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final L f1041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z f1042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC0880f f1043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC0846x0 f1044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Object f1045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile Bitmap f1046x;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f1047q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f1048r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f1049s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f1050t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f1051u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ InterfaceC0846x0 f1052v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ List f1053w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ d f1054x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ C6.b f1055y;

        /* JADX INFO: renamed from: D6.d$a$a, reason: collision with other inner class name */
        static final class C0039a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1056q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f1057r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ C6.b f1058s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p227w6.c f1059t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0039a(d dVar, C6.b bVar, p227w6.c cVar, p129m8.e eVar) {
                super(2, eVar);
                this.f1057r = dVar;
                this.f1058s = bVar;
                this.f1059t = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0039a(this.f1057r, this.f1058s, this.f1059t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0039a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Exception {
                p139n8.b.e();
                if (this.f1056q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                try {
                    if (this.f1057r.f1046x == null) {
                        Object obj2 = this.f1057r.f1045w;
                        d dVar = this.f1057r;
                        C6.b bVar = this.f1058s;
                        synchronized (obj2) {
                            try {
                                if (dVar.f1046x == null) {
                                    dVar.f1046x = G6.f.c(bVar.d().getViewSize());
                                }
                                A a10 = A.f21846a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Point pointC = this.f1058s.a().c();
                    Bitmap bitmap = this.f1057r.f1046x;
                    if (bitmap == null) {
                        kotlin.jvm.internal.n.r("effectBitmap");
                        bitmap = null;
                    }
                    C6.i iVar = new C6.i(pointC, bitmap);
                    this.f1057r.f1039q.c(this.f1059t, this.f1058s.a(), iVar);
                    return iVar;
                } catch (Exception e10) {
                    if (!G6.d.b()) {
                        throw e10;
                    }
                    p167q6.b bVar2 = this.f1057r.f1040r;
                    E6.a.C0050a c0050aB = this.f1059t.b();
                    bVar2.e("effectApply.request(" + (c0050aB != null ? c0050aB.a() : null) + ") error: " + e10);
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0846x0 interfaceC0846x0, List list, d dVar, C6.b bVar, p129m8.e eVar) {
            super(2, eVar);
            this.f1052v = interfaceC0846x0;
            this.f1053w = list;
            this.f1054x = dVar;
            this.f1055y = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f1052v, this.f1053w, this.f1054x, this.f1055y, eVar);
            aVar.f1051u = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:39:0x010a  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            if (F8.A0.g(r15, r14) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
        
            if (r15 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
        
            if (r15.b(r6, r14) == r0) goto L41;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e2 -> B:31:0x00e5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: D6.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(p227w6.a effectApply) {
        kotlin.jvm.internal.n.h(effectApply, "effectApply");
        this.f1039q = effectApply;
        this.f1040r = new p167q6.b(this);
        this.f1041s = M.a(T0.b(null, 1, null).z(C0803b0.b()));
        z zVarB = G.b(1, 0, null, 6, null);
        this.f1042t = zVarB;
        this.f1043u = zVarB;
        this.f1045w = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p227w6.c B(C6.b bVar, C6.e eVar) {
        return new p227w6.c(G6.c.l(bVar), F6.a.b.f1732d.a((bVar.b().g().width() * 1.0f) / bVar.d().getViewSize().x));
    }

    @Override // D6.g
    public void E(C6.b cb, List requests) {
        kotlin.jvm.internal.n.h(cb, "cb");
        kotlin.jvm.internal.n.h(requests, "requests");
        this.f1042t.g();
        this.f1044v = AbstractC0816i.d(this.f1041s, null, null, new a(this.f1044v, requests, this, cb, null), 3, null);
    }

    @Override // D6.g
    public InterfaceC0880f N() {
        return this.f1043u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        M.d(this.f1041s, null, 1, null);
        this.f1039q.b();
    }
}
