package p247y6;

import A6.c;
import C6.g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0834r0;
import F8.L;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import p074h3.H;
import p074h3.I;
import p074h3.W;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;
import p166q5.v;
import p167q6.b;
import p219v8.p;
import p237x6.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f30335b;

    /* JADX INFO: renamed from: y6.a$a, reason: collision with other inner class name */
    static final class C0750a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30336q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30337r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ W f30338s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ K1.a f30339t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Context f30340u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f30341v;

        /* JADX INFO: renamed from: y6.a$a$a, reason: collision with other inner class name */
        static final class C0751a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f30342q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ W f30343r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ K1.a f30344s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Context f30345t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0751a(W w9, K1.a aVar, Context context, e eVar) {
                super(2, eVar);
                this.f30343r = w9;
                this.f30344s = aVar;
                this.f30345t = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0751a(this.f30343r, this.f30344s, this.f30345t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0751a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws JSONException {
                p139n8.b.e();
                if (this.f30342q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                a.f30335b.a("runCleanTask start clean effect lru dirty files");
                g.a aVar = g.f648e;
                g gVarA = aVar.a(this.f30343r.X());
                g gVarA2 = aVar.a(this.f30343r.R());
                g gVarA3 = aVar.a(this.f30343r.g());
                g gVarA4 = aVar.a(this.f30343r.N());
                List listN = AbstractC1444s.n(gVarA != null ? gVarA.d() : null, gVarA2 != null ? gVarA2.d() : null, gVarA3 != null ? gVarA3.d() : null, gVarA4 != null ? gVarA4.d() : null);
                q qVarO = this.f30344s.o(this.f30345t);
                int count = qVarO.getCount();
                qVarO.V(AbstractC1444s.P(listN));
                a.f30335b.a("runCleanTask clean effect lru exclusion:" + listN + ", clean " + (count - qVarO.getCount()) + " files");
                return A.f21846a;
            }
        }

        /* JADX INFO: renamed from: y6.a$a$b */
        static final class b extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f30346q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f30347r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ W f30348s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f30349t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, W w9, long j9, e eVar) {
                super(2, eVar);
                this.f30347r = context;
                this.f30348s = w9;
                this.f30349t = j9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new b(this.f30347r, this.f30348s, this.f30349t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Exception {
                p139n8.b.e();
                if (this.f30346q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                a.f30335b.a("runCleanTask start clean blur dirty files");
                c cVar = new c(this.f30347r);
                W w9 = this.f30348s;
                Context context = this.f30347r;
                long j9 = this.f30349t;
                try {
                    String strR = w9.R();
                    g gVarA = g.f648e.a(strR);
                    v vVar = v.f25076a;
                    String string = vVar.d(context).getString("final_image_path", null);
                    a.f30335b.d("runCleanTask blurInfo: homeLiveEffectInfo = " + strR + " \nblurSp imagePath = " + string);
                    boolean zD = false;
                    if (string != null) {
                        cVar.P0(string);
                        zD = gVarA != null ? n.d(cVar.b0(), gVarA.d()) : false;
                        if (!zD) {
                            a.f30335b.d("clear blur final info for " + string + ".");
                            vVar.a(context);
                        }
                    }
                    cVar.G(zD, j9);
                    A a10 = A.f21846a;
                    p199t8.a.a(cVar, null);
                    return A.f21846a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(cVar, th);
                        throw th2;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0750a(W w9, K1.a aVar, Context context, long j9, e eVar) {
            super(2, eVar);
            this.f30338s = w9;
            this.f30339t = aVar;
            this.f30340u = context;
            this.f30341v = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            C0750a c0750a = new C0750a(this.f30338s, this.f30339t, this.f30340u, this.f30341v, eVar);
            c0750a.f30337r = obj;
            return c0750a;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0750a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30336q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            L l9 = (L) this.f30337r;
            AbstractC0816i.d(l9, null, null, new C0751a(this.f30338s, this.f30339t, this.f30340u, null), 3, null);
            AbstractC0816i.d(l9, null, null, new b(this.f30340u, this.f30338s, this.f30341v, null), 3, null);
            return A.f21846a;
        }
    }

    static {
        a aVar = new a();
        f30334a = aVar;
        f30335b = new b(aVar);
    }

    private a() {
    }

    public final void b(Context appContext) {
        n.h(appContext, "appContext");
        long jCurrentTimeMillis = System.currentTimeMillis();
        H hA = I.a();
        K1.a aVar = hA instanceof K1.a ? (K1.a) hA : null;
        if (aVar == null) {
            return;
        }
        AbstractC0816i.d(C0834r0.f1894q, C0803b0.b(), null, new C0750a(aVar.f(appContext), aVar, appContext, jCurrentTimeMillis, null), 2, null);
    }
}
