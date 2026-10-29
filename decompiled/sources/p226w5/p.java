package p226w5;

import E5.f;
import F8.AbstractC0812g;
import F8.C0803b0;
import F8.H0;
import F8.L;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public interface p {

    public static final class a {

        /* JADX INFO: renamed from: w5.p$a$a, reason: collision with other inner class name */
        static final class C0724a extends l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f29596q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p219v8.l f29597r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0724a(p219v8.l lVar, e eVar) {
                super(2, eVar);
                this.f29597r = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0724a(this.f29597r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0724a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f29596q;
                if (i10 == 0) {
                    r.b(obj);
                    p219v8.l lVar = this.f29597r;
                    this.f29596q = 1;
                    if (lVar.f(this) == objE) {
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

        static final class b extends d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f29598q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f29599r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f29600s;

            b(e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f29599r = obj;
                this.f29600s |= Integer.MIN_VALUE;
                return a.b(null, null, null, null, null, this);
            }
        }

        static final class c extends l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f29601q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ f.j f29602r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Object f29603s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object[] f29604t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(f.j jVar, Object obj, Object[] objArr, e eVar) {
                super(2, eVar);
                this.f29602r = jVar;
                this.f29603s = obj;
                this.f29604t = objArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new c(this.f29602r, this.f29603s, this.f29604t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f29601q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                f.j jVar = this.f29602r;
                Object obj2 = this.f29603s;
                Object[] objArr = this.f29604t;
                jVar.a(obj2, Arrays.copyOf(objArr, objArr.length));
                return A.f21846a;
            }
        }

        public static Object a(p pVar, p219v8.l lVar, e eVar) {
            if (n.d(Looper.myLooper(), Looper.getMainLooper())) {
                Object objF = lVar.f(eVar);
                return objF == p139n8.b.e() ? objF : A.f21846a;
            }
            Object objG = AbstractC0812g.g(C0803b0.c(), new C0724a(lVar, null), eVar);
            return objG == p139n8.b.e() ? objG : A.f21846a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static Object b(p pVar, List list, List list2, String str, Object obj, e eVar) {
            b bVar;
            Object objB;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i10 = bVar.f29600s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f29600s = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj2 = bVar.f29599r;
            Object objE = p139n8.b.e();
            int i11 = bVar.f29600s;
            if (i11 == 0) {
                r.b(obj2);
                Class[] clsArr = (Class[]) list.toArray(new Class[0]);
                Object[] array = list2.toArray(new Object[0]);
                f.j jVarA = f.a(obj).a(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                try {
                    q.a aVar = q.f21862r;
                    objB = q.b(jVarA.b(obj, Arrays.copyOf(array, array.length)));
                } catch (Throwable th) {
                    q.a aVar2 = q.f21862r;
                    objB = q.b(r.a(th));
                }
                Throwable thD = q.d(objB);
                if (thD != null) {
                    G5.c.d("Host", "invoke view method = " + str + " error. msg = " + thD);
                    if (!n.d(Looper.myLooper(), Looper.getMainLooper())) {
                        H0 h0C = C0803b0.c();
                        c cVar = new c(jVarA, obj, array, null);
                        bVar.f29598q = objB;
                        bVar.f29600s = 1;
                        if (AbstractC0812g.g(h0C, cVar, bVar) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj2);
            }
            return A.f21846a;
        }
    }
}
