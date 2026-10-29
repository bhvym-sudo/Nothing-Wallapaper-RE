package p053f2;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0881g;
import android.view.View;
import android.widget.Switch;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20810a = new b();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f20811q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f20812r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p073h2.a f20813s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Switch f20814t;

        /* JADX INFO: renamed from: f2.b$a$a, reason: collision with other inner class name */
        static final class C0533a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f20815q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f20816r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p073h2.a f20817s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Switch f20818t;

            /* JADX INFO: renamed from: f2.b$a$a$a, reason: collision with other inner class name */
            static final class C0534a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f20819q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p073h2.a f20820r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ Switch f20821s;

                /* JADX INFO: renamed from: f2.b$a$a$a$a, reason: collision with other inner class name */
                static final class C0535a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ Switch f20822q;

                    C0535a(Switch r9) {
                        this.f20822q = r9;
                    }

                    public final Object a(boolean z9, e eVar) {
                        this.f20822q.setChecked(z9);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0534a(p073h2.a aVar, Switch r9, e eVar) {
                    super(2, eVar);
                    this.f20820r = aVar;
                    this.f20821s = r9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0534a(this.f20820r, this.f20821s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0534a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
                
                    if (((I8.InterfaceC0880f) r5).a(r1, r4) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p139n8.b.e()
                        int r1 = r4.f20819q
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        p079h8.r.b(r5)
                        goto L3e
                    L12:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L1a:
                        p079h8.r.b(r5)
                        goto L2c
                    L1e:
                        p079h8.r.b(r5)
                        h2.a r5 = r4.f20820r
                        r4.f20819q = r3
                        java.lang.Object r5 = r5.f(r4)
                        if (r5 != r0) goto L2c
                        goto L3d
                    L2c:
                        I8.f r5 = (I8.InterfaceC0880f) r5
                        f2.b$a$a$a$a r1 = new f2.b$a$a$a$a
                        android.widget.Switch r3 = r4.f20821s
                        r1.<init>(r3)
                        r4.f20819q = r2
                        java.lang.Object r4 = r5.a(r1, r4)
                        if (r4 != r0) goto L3e
                    L3d:
                        return r0
                    L3e:
                        h8.A r4 = p079h8.A.f21846a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f2.b.a.C0533a.C0534a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0533a(p073h2.a aVar, Switch r9, e eVar) {
                super(2, eVar);
                this.f20817s = aVar;
                this.f20818t = r9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0533a c0533a = new C0533a(this.f20817s, this.f20818t, eVar);
                c0533a.f20816r = obj;
                return c0533a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0533a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f20815q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f20816r, null, null, new C0534a(this.f20817s, this.f20818t, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, p073h2.a aVar, Switch r9, e eVar) {
            super(2, eVar);
            this.f20812r = interfaceC1163x;
            this.f20813s = aVar;
            this.f20814t = r9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f20812r, this.f20813s, this.f20814t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f20811q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f20812r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0533a c0533a = new C0533a(this.f20813s, this.f20814t, null);
                this.f20811q = 1;
                if (N.b(interfaceC1163x, bVar, c0533a, this) == objE) {
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

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p073h2.a aVar, View view) {
        aVar.g();
    }

    public final void b(View view, final p073h2.a viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        View viewRequireViewById = view.requireViewById(R.id.switcher);
        n.g(viewRequireViewById, "requireViewById(...)");
        view.setOnClickListener(new View.OnClickListener() { // from class: f2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.c(viewModel, view2);
            }
        });
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, (Switch) viewRequireViewById, null), 3, null);
    }
}
