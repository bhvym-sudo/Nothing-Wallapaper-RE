package p234x3;

import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1141a;
import androidx.lifecycle.Q;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.InterfaceC1364d;
import p079h8.r;
import p082i1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f29818j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f29819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G3.c f29820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f29821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f29822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A f29823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f29824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0880f f29825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0880f f29826i;

    public static final class a {

        /* JADX INFO: renamed from: x3.b$a$a, reason: collision with other inner class name */
        public static final class C0728a extends AbstractC1141a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ D3.c f29827e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p194t3.a f29828f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0728a(f fVar, Bundle bundle, D3.c cVar, p194t3.a aVar) {
                super(fVar, bundle);
                this.f29827e = cVar;
                this.f29828f = aVar;
            }

            @Override // androidx.lifecycle.AbstractC1141a
            protected a0 f(String key, Class modelClass, Q handle) {
                n.h(key, "key");
                n.h(modelClass, "modelClass");
                n.h(handle, "handle");
                return new p088i7.a(this.f29827e, this.f29828f, handle);
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final AbstractC1141a a(f owner, Bundle bundle, D3.c undoInteractor, p194t3.a wallpaperInteractor) {
            n.h(owner, "owner");
            n.h(undoInteractor, "undoInteractor");
            n.h(wallpaperInteractor, "wallpaperInteractor");
            return new C0728a(owner, bundle, undoInteractor, wallpaperInteractor);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: x3.b$b, reason: collision with other inner class name */
    static final class C0729b implements p219v8.a {
        C0729b() {
        }

        public final void a() {
            A aJ = b.this.j();
            Boolean bool = Boolean.FALSE;
            aJ.setValue(bool);
            b.this.g().i("is_on_lock_screen", bool);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class c implements p219v8.a {
        c() {
        }

        public final void a() {
            A aJ = b.this.j();
            Boolean bool = Boolean.TRUE;
            aJ.setValue(bool);
            b.this.g().i("is_on_lock_screen", bool);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29831q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f29832r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29833q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f29834r;

            /* JADX INFO: renamed from: x3.b$d$a$a, reason: collision with other inner class name */
            public static final class C0730a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29835q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29836r;

                public C0730a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29835q = obj;
                    this.f29836r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f29833q = interfaceC0881g;
                this.f29834r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0730a c0730a;
                if (eVar instanceof C0730a) {
                    c0730a = (C0730a) eVar;
                    int i10 = c0730a.f29836r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0730a.f29836r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0730a = new C0730a(eVar);
                    }
                } else {
                    c0730a = new C0730a(eVar);
                }
                Object obj2 = c0730a.f29835q;
                Object objE = p139n8.b.e();
                int i11 = c0730a.f29836r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29833q;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    p234x3.a aVar = new p234x3.a(zBooleanValue, !zBooleanValue ? this.f29834r.new c() : null);
                    c0730a.f29836r = 1;
                    if (interfaceC0881g.b(aVar, c0730a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public d(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f29831q = interfaceC0880f;
            this.f29832r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29831q.a(new a(interfaceC0881g, this.f29832r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f29839r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29840q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f29841r;

            /* JADX INFO: renamed from: x3.b$e$a$a, reason: collision with other inner class name */
            public static final class C0731a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29842q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29843r;

                public C0731a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29842q = obj;
                    this.f29843r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f29840q = interfaceC0881g;
                this.f29841r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0731a c0731a;
                if (eVar instanceof C0731a) {
                    c0731a = (C0731a) eVar;
                    int i10 = c0731a.f29843r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0731a.f29843r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0731a = new C0731a(eVar);
                    }
                } else {
                    c0731a = new C0731a(eVar);
                }
                Object obj2 = c0731a.f29842q;
                Object objE = p139n8.b.e();
                int i11 = c0731a.f29843r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29840q;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    p234x3.a aVar = new p234x3.a(!zBooleanValue, zBooleanValue ? this.f29841r.new C0729b() : null);
                    c0731a.f29843r = 1;
                    if (interfaceC0881g.b(aVar, c0731a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public e(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f29838q = interfaceC0880f;
            this.f29839r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29838q.a(new a(interfaceC0881g, this.f29839r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public b(D3.c undoInteractor, p194t3.a wallpaperInteractor, Q savedStateHandle) {
        n.h(undoInteractor, "undoInteractor");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(savedStateHandle, "savedStateHandle");
        this.f29819b = savedStateHandle;
        this.f29820c = new G3.c(undoInteractor);
        int i10 = 8;
        AbstractC1457h abstractC1457h = null;
        int i11 = 0;
        this.f29821d = new g(wallpaperInteractor, p204u3.a.HOME, b0.a(this), i11, i10, abstractC1457h);
        this.f29822e = new g(wallpaperInteractor, p204u3.a.LOCK, b0.a(this), i11, i10, abstractC1457h);
        A a10 = I8.Q.a(Boolean.TRUE);
        this.f29823f = a10;
        O oB = AbstractC0882h.b(a10);
        this.f29824g = oB;
        this.f29825h = new d(oB, this);
        this.f29826i = new e(oB, this);
        Boolean bool = (Boolean) savedStateHandle.d("is_on_lock_screen");
        if (bool != null) {
            a10.setValue(bool);
        }
    }

    public static final AbstractC1141a l(f fVar, Bundle bundle, D3.c cVar, p194t3.a aVar) {
        return f29818j.a(fVar, bundle, cVar, aVar);
    }

    public final InterfaceC0880f e() {
        return this.f29826i;
    }

    public final InterfaceC0880f f() {
        return this.f29825h;
    }

    protected final Q g() {
        return this.f29819b;
    }

    public final G3.c h() {
        return this.f29820c;
    }

    public final g i(InterfaceC1364d.a screen) {
        n.h(screen, "screen");
        return screen == InterfaceC1364d.a.LOCK_SCREEN ? this.f29822e : this.f29821d;
    }

    protected final A j() {
        return this.f29823f;
    }

    public final O k() {
        return this.f29824g;
    }

    public final void m(boolean z9) {
        A a10 = this.f29823f;
        Boolean bool = (Boolean) this.f29819b.d("is_on_lock_screen");
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            this.f29819b.i("is_on_lock_screen", Boolean.valueOf(z9));
        }
        a10.setValue(Boolean.valueOf(z9));
    }
}
