package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import java.util.Set;
import p170r.AbstractC1696o;
import p170r.AbstractC1709v;
import p170r.C1710v0;
import p170r.InterfaceC1690l;
import p170r.InterfaceC1698p;

/* JADX INFO: loaded from: classes.dex */
final class C0 implements InterfaceC1698p, InterfaceC1160u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AndroidComposeView f11666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1698p f11667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AbstractC1157q f11669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p219v8.p f11670u = L.f11724a.a();

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.p f11672s;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.C0$a$a, reason: collision with other inner class name */
        static final class C0372a extends kotlin.jvm.internal.o implements p219v8.p {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C0 f11673r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p219v8.p f11674s;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.C0$a$a$a, reason: collision with other inner class name */
            static final class C0373a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f11675q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ C0 f11676r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0373a(C0 c10, p129m8.e eVar) {
                    super(2, eVar);
                    this.f11676r = c10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0373a(this.f11676r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0373a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f11675q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        AndroidComposeView androidComposeViewA = this.f11676r.A();
                        this.f11675q = 1;
                        if (androidComposeViewA.R(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    return p079h8.A.f21846a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.C0$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f11677q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ C0 f11678r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C0 c10, p129m8.e eVar) {
                    super(2, eVar);
                    this.f11678r = c10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f11678r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f11677q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        AndroidComposeView androidComposeViewA = this.f11678r.A();
                        this.f11677q = 1;
                        if (androidComposeViewA.S(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    return p079h8.A.f21846a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.C0$a$a$c */
            static final class c extends kotlin.jvm.internal.o implements p219v8.p {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ C0 f11679r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ p219v8.p f11680s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C0 c10, p219v8.p pVar) {
                    super(2);
                    this.f11679r = c10;
                    this.f11680s = pVar;
                }

                public final void a(InterfaceC1690l interfaceC1690l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                        interfaceC1690l.m();
                        return;
                    }
                    if (AbstractC1696o.G()) {
                        AbstractC1696o.O(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                    }
                    A.a(this.f11679r.A(), this.f11680s, interfaceC1690l, 0);
                    if (AbstractC1696o.G()) {
                        AbstractC1696o.N();
                    }
                }

                @Override // p219v8.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC1690l) obj, ((Number) obj2).intValue());
                    return p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0372a(C0 c10, p219v8.p pVar) {
                super(2);
                this.f11673r = c10;
                this.f11674s = pVar;
            }

            public final void a(InterfaceC1690l interfaceC1690l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                    interfaceC1690l.m();
                    return;
                }
                if (AbstractC1696o.G()) {
                    AbstractC1696o.O(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                }
                AndroidComposeView androidComposeViewA = this.f11673r.A();
                int i11 = C.g.f472J;
                Object tag = androidComposeViewA.getTag(i11);
                Set set = kotlin.jvm.internal.I.k(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f11673r.A().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i11) : null;
                    set = kotlin.jvm.internal.I.k(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC1690l.e());
                    interfaceC1690l.a();
                }
                AndroidComposeView androidComposeViewA2 = this.f11673r.A();
                boolean zF = interfaceC1690l.f(this.f11673r);
                C0 c10 = this.f11673r;
                Object objD = interfaceC1690l.d();
                if (zF || objD == InterfaceC1690l.f25468a.a()) {
                    objD = new C0373a(c10, null);
                    interfaceC1690l.q(objD);
                }
                p170r.L.b(androidComposeViewA2, (p219v8.p) objD, interfaceC1690l, 0);
                AndroidComposeView androidComposeViewA3 = this.f11673r.A();
                boolean zF2 = interfaceC1690l.f(this.f11673r);
                C0 c11 = this.f11673r;
                Object objD2 = interfaceC1690l.d();
                if (zF2 || objD2 == InterfaceC1690l.f25468a.a()) {
                    objD2 = new b(c11, null);
                    interfaceC1690l.q(objD2);
                }
                p170r.L.b(androidComposeViewA3, (p219v8.p) objD2, interfaceC1690l, 0);
                AbstractC1709v.a(B.d.a().d(set), p240y.c.d(-1193460702, true, new c(this.f11673r, this.f11674s), interfaceC1690l, 54), interfaceC1690l, C1710v0.f25588i | 48);
                if (AbstractC1696o.G()) {
                    AbstractC1696o.N();
                }
            }

            @Override // p219v8.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC1690l) obj, ((Number) obj2).intValue());
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p219v8.p pVar) {
            super(1);
            this.f11672s = pVar;
        }

        public final void a(AndroidComposeView.b bVar) {
            if (C0.this.f11668s) {
                return;
            }
            AbstractC1157q lifecycle = bVar.a().getLifecycle();
            C0.this.f11670u = this.f11672s;
            if (C0.this.f11669t == null) {
                C0.this.f11669t = lifecycle;
                lifecycle.a(C0.this);
            } else if (lifecycle.b().e(AbstractC1157q.b.CREATED)) {
                C0.this.z().d(p240y.c.b(-2000640158, true, new C0372a(C0.this, this.f11672s)));
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((AndroidComposeView.b) obj);
            return p079h8.A.f21846a;
        }
    }

    public C0(AndroidComposeView androidComposeView, InterfaceC1698p interfaceC1698p) {
        this.f11666q = androidComposeView;
        this.f11667r = interfaceC1698p;
    }

    public final AndroidComposeView A() {
        return this.f11666q;
    }

    @Override // p170r.InterfaceC1698p
    public void d(p219v8.p pVar) {
        this.f11666q.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // p170r.InterfaceC1698p
    public void dispose() {
        if (!this.f11668s) {
            this.f11668s = true;
            this.f11666q.getView().setTag(C.g.f473K, null);
            AbstractC1157q abstractC1157q = this.f11669t;
            if (abstractC1157q != null) {
                abstractC1157q.d(this);
            }
        }
        this.f11667r.dispose();
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
        if (aVar == AbstractC1157q.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != AbstractC1157q.a.ON_CREATE || this.f11668s) {
                return;
            }
            d(this.f11670u);
        }
    }

    public final InterfaceC1698p z() {
        return this.f11667r;
    }
}
