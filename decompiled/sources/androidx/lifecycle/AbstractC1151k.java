package androidx.lifecycle;

import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1151k {

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13416q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f13417r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q f13418s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q.b f13419t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f13420u;

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        static final class C0399a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13421q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f13422r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ H8.t f13423s;

            /* JADX INFO: renamed from: androidx.lifecycle.k$a$a$a, reason: collision with other inner class name */
            static final class C0400a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ H8.t f13424q;

                C0400a(H8.t tVar) {
                    this.f13424q = tVar;
                }

                @Override // I8.InterfaceC0881g
                public final Object b(Object obj, p129m8.e eVar) {
                    Object objN = this.f13424q.n(obj, eVar);
                    return objN == p139n8.b.e() ? objN : p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0399a(InterfaceC0880f interfaceC0880f, H8.t tVar, p129m8.e eVar) {
                super(2, eVar);
                this.f13422r = interfaceC0880f;
                this.f13423s = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0399a(this.f13422r, this.f13423s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((C0399a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f13421q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0880f interfaceC0880f = this.f13422r;
                    C0400a c0400a = new C0400a(this.f13423s);
                    this.f13421q = 1;
                    if (interfaceC0880f.a(c0400a, this) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC1157q abstractC1157q, AbstractC1157q.b bVar, InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
            super(2, eVar);
            this.f13418s = abstractC1157q;
            this.f13419t = bVar;
            this.f13420u = interfaceC0880f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f13418s, this.f13419t, this.f13420u, eVar);
            aVar.f13417r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            H8.t tVar;
            Object objE = p139n8.b.e();
            int i10 = this.f13416q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                H8.t tVar2 = (H8.t) this.f13417r;
                AbstractC1157q abstractC1157q = this.f13418s;
                AbstractC1157q.b bVar = this.f13419t;
                C0399a c0399a = new C0399a(this.f13420u, tVar2, null);
                this.f13417r = tVar2;
                this.f13416q = 1;
                if (N.a(abstractC1157q, bVar, c0399a, this) == objE) {
                    return objE;
                }
                tVar = tVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (H8.t) this.f13417r;
                p079h8.r.b(obj);
            }
            H8.w.a.a(tVar, null, 1, null);
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H8.t tVar, p129m8.e eVar) {
            return ((a) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final InterfaceC0880f a(InterfaceC0880f interfaceC0880f, AbstractC1157q lifecycle, AbstractC1157q.b minActiveState) {
        kotlin.jvm.internal.n.h(interfaceC0880f, "<this>");
        kotlin.jvm.internal.n.h(lifecycle, "lifecycle");
        kotlin.jvm.internal.n.h(minActiveState, "minActiveState");
        return AbstractC0882h.e(new a(lifecycle, minActiveState, interfaceC0880f, null));
    }
}
