package E1;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.Q;
import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.nothing.cardwidget.mediaplayer.utils.DisplayConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.m;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A1.a f1222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f1224d;

    public static final class a implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final A1.a f1225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f1226c;

        public a(Context context, A1.a interactor) {
            n.h(context, "context");
            n.h(interactor, "interactor");
            this.f1225b = interactor;
            this.f1226c = context.getApplicationContext();
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            n.h(modelClass, "modelClass");
            Context applicationContext = this.f1226c;
            n.g(applicationContext, "applicationContext");
            return new b(applicationContext, this.f1225b);
        }
    }

    /* JADX INFO: renamed from: E1.b$b, reason: collision with other inner class name */
    public static final class C0043b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f1227q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f1228r;

        /* JADX INFO: renamed from: E1.b$b$a */
        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f1229q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f1230r;

            /* JADX INFO: renamed from: E1.b$b$a$a, reason: collision with other inner class name */
            public static final class C0044a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f1231q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f1232r;

                public C0044a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f1231q = obj;
                    this.f1232r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f1229q = interfaceC0881g;
                this.f1230r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0044a c0044a;
                if (eVar instanceof C0044a) {
                    c0044a = (C0044a) eVar;
                    int i10 = c0044a.f1232r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0044a.f1232r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0044a = new C0044a(eVar);
                    }
                } else {
                    c0044a = new C0044a(eVar);
                }
                Object obj2 = c0044a.f1231q;
                Object objE = p139n8.b.e();
                int i11 = c0044a.f1232r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f1229q;
                    List listG = this.f1230r.g((B1.b) obj);
                    c0044a.f1232r = 1;
                    if (interfaceC0881g.b(listG, c0044a) == objE) {
                        return objE;
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

        public C0043b(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f1227q = interfaceC0880f;
            this.f1228r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f1227q.a(new a(interfaceC0881g, this.f1228r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class c implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ B1.a f1235r;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1236q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ B1.a f1237r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B1.a aVar, e eVar) {
                super(2, eVar);
                this.f1237r = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f1237r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f1236q;
                if (i10 == 0) {
                    r.b(obj);
                    p219v8.l lVarC = this.f1237r.c();
                    this.f1236q = 1;
                    if (lVarC.f(this) == objE) {
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

        c(B1.a aVar) {
            this.f1235r = aVar;
        }

        public final void a() {
            AbstractC0816i.d(b0.a(b.this), null, null, new a(this.f1235r, null), 3, null);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f1238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f1239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ B1.a f1240s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f1241q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f1242r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ B1.a f1243s;

            /* JADX INFO: renamed from: E1.b$d$a$a, reason: collision with other inner class name */
            public static final class C0045a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f1244q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f1245r;

                public C0045a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f1244q = obj;
                    this.f1245r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar, B1.a aVar) {
                this.f1241q = interfaceC0881g;
                this.f1242r = bVar;
                this.f1243s = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0045a c0045a;
                if (eVar instanceof C0045a) {
                    c0045a = (C0045a) eVar;
                    int i10 = c0045a.f1245r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0045a.f1245r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0045a = new C0045a(eVar);
                    }
                } else {
                    c0045a = new C0045a(eVar);
                }
                Object obj2 = c0045a.f1244q;
                Object objE = p139n8.b.e();
                int i11 = c0045a.f1245r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f1241q;
                    c cVar = !((Boolean) obj).booleanValue() ? this.f1242r.new c(this.f1243s) : null;
                    c0045a.f1245r = 1;
                    if (interfaceC0881g.b(cVar, c0045a) == objE) {
                        return objE;
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

        public d(InterfaceC0880f interfaceC0880f, b bVar, B1.a aVar) {
            this.f1238q = interfaceC0880f;
            this.f1239r = bVar;
            this.f1240s = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f1238q.a(new a(interfaceC0881g, this.f1239r, this.f1240s), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public b(Context context, A1.a interactor) {
        n.h(context, "context");
        n.h(interactor, "interactor");
        this.f1222b = interactor;
        this.f1223c = context.getApplicationContext();
        this.f1224d = new C0043b(interactor.e(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List g(B1.b bVar) {
        String string = this.f1223c.getResources().getString(Resources.getSystem().getIdentifier("config_icon_mask", TypedValues.Custom.S_STRING, "android"));
        n.g(string, "getString(...)");
        if (!(bVar instanceof B1.b.C0014b)) {
            if (bVar instanceof B1.b.a) {
                return AbstractC1444s.l();
            }
            throw new m();
        }
        List<B1.a> listA = ((B1.b.C0014b) bVar).a();
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(listA, 10));
        for (B1.a aVar : listA) {
            q3.a.b bVar2 = new q3.a.b(aVar.b());
            I8.A a10 = Q.a(aVar.a() + "x" + aVar.d());
            n.f(a10, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<kotlin.String>");
            arrayList.add(new B3.a(a10, new E1.a(aVar.a(), aVar.d(), string), bVar2, false, aVar.e(), false, new d(aVar.e(), this, aVar), null, DisplayConfig.Common.STANDARD_MUSIC_DEFAULT_ICON_HEIGHT, null));
        }
        return arrayList;
    }

    public final InterfaceC0880f f() {
        return this.f1224d;
    }
}
