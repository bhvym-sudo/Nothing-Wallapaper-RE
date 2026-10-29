package p226w5;

import F8.L;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    public static final class a {

        /* JADX INFO: renamed from: w5.o$a$a, reason: collision with other inner class name */
        static final class C0723a extends d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f29579q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f29580r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f29581s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f29582t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f29583u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f29584v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f29585w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            /* synthetic */ Object f29586x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f29587y;

            C0723a(e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f29586x = obj;
                this.f29587y |= Integer.MIN_VALUE;
                return a.a(null, null, null, null, null, null, null, this);
            }
        }

        static final class b extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f29588q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ o f29589r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Context f29590s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ View f29591t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ ViewGroup f29592u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ f f29593v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ p216v5.a f29594w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ n f29595x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o oVar, Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
                super(2, eVar);
                this.f29589r = oVar;
                this.f29590s = context;
                this.f29591t = view;
                this.f29592u = viewGroup;
                this.f29593v = fVar;
                this.f29594w = aVar;
                this.f29595x = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new b(this.f29589r, this.f29590s, this.f29591t, this.f29592u, this.f29593v, this.f29594w, this.f29595x, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f29588q;
                if (i10 == 0) {
                    r.b(obj);
                    o oVar = this.f29589r;
                    Context context = this.f29590s;
                    View view = this.f29591t;
                    ViewGroup viewGroup = this.f29592u;
                    f fVar = this.f29593v;
                    p216v5.a aVar = this.f29594w;
                    n nVar = this.f29595x;
                    this.f29588q = 1;
                    if (oVar.b(context, view, viewGroup, fVar, aVar, nVar, this) == objE) {
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

        /* JADX WARN: Code duplicated, block: B:8:0x0016  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
        
            if (F8.AbstractC0812g.g(r2, r11, r9) == r1) goto L35;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(p226w5.o r20, android.content.Context r21, android.view.View r22, android.view.ViewGroup r23, p226w5.f r24, p216v5.a r25, p226w5.n r26, p129m8.e r27) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.o.a.a(w5.o, android.content.Context, android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
        }
    }

    Object a(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar);

    Object b(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar);
}
