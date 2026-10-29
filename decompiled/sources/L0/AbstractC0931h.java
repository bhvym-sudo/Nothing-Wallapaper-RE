package L0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.AbstractC1388c;

/* JADX INFO: renamed from: L0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0931h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4307a = new a(null);

    /* JADX INFO: renamed from: L0.h$a */
    public static final class a {

        /* JADX INFO: renamed from: L0.h$a$a, reason: collision with other inner class name */
        static final class C0146a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4308q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f4309r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ List f4310s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0146a(List list, p129m8.e eVar) {
                super(2, eVar);
                this.f4310s = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0146a c0146a = new C0146a(this.f4310s, eVar);
                c0146a.f4309r = obj;
                return c0146a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f4308q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    s sVar = (s) this.f4309r;
                    a aVar = AbstractC0931h.f4307a;
                    List list = this.f4310s;
                    this.f4308q = 1;
                    if (aVar.c(list, sVar, this) == objE) {
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

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, p129m8.e eVar) {
                return ((C0146a) create(sVar, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: L0.h$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f4311q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f4312r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f4313s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f4315u;

            b(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4313s = obj;
                this.f4315u |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: L0.h$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f4316q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f4317r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f4318s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f4319t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f4320u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ List f4321v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ List f4322w;

            /* JADX INFO: renamed from: L0.h$a$c$a, reason: collision with other inner class name */
            static final class C0147a extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f4323q;

                C0147a(InterfaceC0930g interfaceC0930g, p129m8.e eVar) {
                    super(1, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(p129m8.e eVar) {
                    return new C0147a(null, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    int i10 = this.f4323q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        this.f4323q = 1;
                        throw null;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    return p079h8.A.f21846a;
                }

                @Override // p219v8.l
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object f(p129m8.e eVar) {
                    return ((C0147a) create(eVar)).invokeSuspend(p079h8.A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, p129m8.e eVar) {
                super(2, eVar);
                this.f4321v = list;
                this.f4322w = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                c cVar = new c(this.f4321v, this.f4322w, eVar);
                cVar.f4320u = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                p139n8.b.e();
                int i10 = this.f4319t;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    obj = this.f4320u;
                    List list2 = this.f4321v;
                    list = this.f4322w;
                    it = list2.iterator();
                } else if (i10 == 1) {
                    Object obj2 = this.f4318s;
                    androidx.appcompat.app.o.a(this.f4317r);
                    Iterator it2 = (Iterator) this.f4316q;
                    List list3 = (List) this.f4320u;
                    p079h8.r.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0147a(null, null));
                        this.f4320u = list3;
                        this.f4316q = it2;
                        this.f4317r = null;
                        this.f4318s = null;
                        this.f4319t = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f4316q;
                    list = (List) this.f4320u;
                    p079h8.r.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                androidx.appcompat.app.o.a(it.next());
                this.f4320u = list;
                this.f4316q = it;
                this.f4317r = null;
                this.f4318s = obj;
                this.f4319t = 1;
                throw null;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, p129m8.e eVar) {
                return ((c) create(obj, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0072  */
        /* JADX WARN: Code duplicated, block: B:37:0x009b  */
        /* JADX WARN: Code duplicated, block: B:39:0x009e  */
        /* JADX WARN: Code duplicated, block: B:43:0x0084 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006c->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:25:0x006c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:25:0x006c). Please report as a decompilation issue!!! */
        public final Object c(List list, s sVar, p129m8.e eVar) throws Throwable {
            b bVar;
            List list2;
            Iterator it;
            kotlin.jvm.internal.E e10;
            Throwable th;
            p219v8.l lVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i10 = bVar.f4315u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f4315u = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f4313s;
            Object objE = p139n8.b.e();
            int i11 = bVar.f4315u;
            if (i11 == 0) {
                p079h8.r.b(obj);
                ArrayList arrayList = new ArrayList();
                p219v8.p cVar = new c(list, arrayList, null);
                bVar.f4311q = arrayList;
                bVar.f4315u = 1;
                if (sVar.a(cVar, bVar) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i11 == 1) {
                list2 = (List) bVar.f4311q;
                p079h8.r.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f4312r;
                e10 = (kotlin.jvm.internal.E) bVar.f4311q;
                try {
                    p079h8.r.b(obj);
                } catch (Throwable th2) {
                    Object obj2 = e10.f22779q;
                    if (obj2 == null) {
                        e10.f22779q = th2;
                    } else {
                        kotlin.jvm.internal.n.e(obj2);
                        AbstractC1388c.a((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (p219v8.l) it.next();
                bVar.f4311q = e10;
                bVar.f4312r = it;
                bVar.f4315u = 2;
                if (lVar.f(bVar) == objE) {
                    return objE;
                }
            }
            th = (Throwable) e10.f22779q;
            if (th == null) {
                return p079h8.A.f21846a;
            }
            throw th;
            kotlin.jvm.internal.E e11 = new kotlin.jvm.internal.E();
            it = list2.iterator();
            e10 = e11;
            while (it.hasNext()) {
                lVar = (p219v8.l) it.next();
                bVar.f4311q = e10;
                bVar.f4312r = it;
                bVar.f4315u = 2;
                if (lVar.f(bVar) == objE) {
                    return objE;
                }
            }
            th = (Throwable) e10.f22779q;
            if (th == null) {
                return p079h8.A.f21846a;
            }
            throw th;
        }

        public final p219v8.p b(List migrations) {
            kotlin.jvm.internal.n.h(migrations, "migrations");
            return new C0146a(migrations, null);
        }

        private a() {
        }
    }
}
