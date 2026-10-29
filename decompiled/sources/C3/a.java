package C3;

import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.Q;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import p079h8.r;
import p089i8.AbstractC1444s;
import p089i8.U;
import p129m8.e;
import p139n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f603a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0880f f605c;

    /* JADX INFO: renamed from: C3.a$a, reason: collision with other inner class name */
    public static final class C0028a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f606q;

        /* JADX INFO: renamed from: C3.a$a$a, reason: collision with other inner class name */
        public static final class C0029a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f607q;

            /* JADX INFO: renamed from: C3.a$a$a$a, reason: collision with other inner class name */
            public static final class C0030a extends d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f608q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f609r;

                public C0030a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f608q = obj;
                    this.f609r |= Integer.MIN_VALUE;
                    return C0029a.this.b(null, this);
                }
            }

            public C0029a(InterfaceC0881g interfaceC0881g) {
                this.f607q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0030a c0030a;
                if (eVar instanceof C0030a) {
                    c0030a = (C0030a) eVar;
                    int i10 = c0030a.f609r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0030a.f609r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0030a = new C0030a(eVar);
                    }
                } else {
                    c0030a = new C0030a(eVar);
                }
                Object obj2 = c0030a.f608q;
                Object objE = b.e();
                int i11 = c0030a.f609r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f607q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(!((Set) obj).isEmpty());
                    c0030a.f609r = 1;
                    if (interfaceC0881g.b(boolA, c0030a) == objE) {
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

        public C0028a(InterfaceC0880f interfaceC0880f) {
            this.f606q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f606q.a(new C0029a(interfaceC0881g), eVar);
            return objA == b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public a() {
        A a10 = Q.a(U.d());
        this.f604b = a10;
        this.f605c = AbstractC0882h.o(new C0028a(a10));
    }

    public final void a() {
        this.f604b.setValue(U.d());
    }

    public final Collection b() {
        return AbstractC1444s.w0((Iterable) this.f604b.getValue());
    }

    public final E3.a c(int i10) {
        return (E3.a) this.f603a.get(Integer.valueOf(i10));
    }

    public final InterfaceC0880f d() {
        return this.f605c;
    }

    public final void e(int i10, boolean z9) {
        if (z9) {
            A a10 = this.f604b;
            a10.setValue(U.h((Set) a10.getValue(), U.c(Integer.valueOf(i10))));
        } else {
            A a11 = this.f604b;
            a11.setValue(U.g((Set) a11.getValue(), U.c(Integer.valueOf(i10))));
        }
    }

    public final void f(int i10, E3.a snapshot) {
        n.h(snapshot, "snapshot");
        this.f603a.put(Integer.valueOf(i10), snapshot);
    }
}
