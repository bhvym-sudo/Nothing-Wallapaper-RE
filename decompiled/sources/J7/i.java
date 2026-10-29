package J7;

import F8.AbstractC0816i;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.InterfaceC0846x0;
import F8.L;
import F8.W;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Size;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.nothing.launcher.card.data.CardWidgetSimpleInfo;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.bean.LoadingState;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC1457h;
import p074h3.InterfaceC1363c;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends a0 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final C0896b f3674d0 = new C0896b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final I8.E f3675A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final O f3676B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final O f3677C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final O f3678D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final O f3679E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final O f3680F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final O f3681G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final O f3682H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final O f3683I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final O f3684J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final O f3685K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final InterfaceC0880f f3686L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final InterfaceC0880f f3687M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final InterfaceC0880f f3688N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC0880f f3689O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final InterfaceC0880f f3690P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private InterfaceC0846x0 f3691Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f3692R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f3693S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final InterfaceC0880f f3694T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final I8.E f3695U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final K f3696V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final I8.A f3697W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final O f3698X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final InterfaceC0880f f3699Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final O f3700Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final InterfaceC0880f f3701a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U5.a f3702b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final InterfaceC0880f f3703b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B7.a f3704c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private List f3705c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1363c f3706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q f3707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f3708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M1.b f3709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F8.I f3710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final S1.a f3711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Resources f3712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p079h8.h f3713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f3714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p079h8.h f3715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O f3716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final O f3717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final O f3718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final O f3719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final androidx.lifecycle.H f3720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.lifecycle.C f3721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I8.E f3722t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final I8.E f3723u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final I8.E f3724v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC0880f f3725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final I8.z f3726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final I8.E f3727y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final I8.z f3728z;

    static final class A extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3729q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ A7.a f3731s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(A7.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3731s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new A(this.f3731s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((A) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3729q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                M1.b bVar = i.this.f3709g;
                A7.a aVar = this.f3731s;
                this.f3729q = 1;
                if (bVar.p(aVar, this) == objE) {
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

    static final class B extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3732q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ N1.a f3734s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(N1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3734s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new B(this.f3734s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((B) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3732q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                M1.b bVar = i.this.f3709g;
                N1.a aVar = this.f3734s;
                this.f3732q = 1;
                if (bVar.s(aVar, this) == objE) {
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

    static final class C extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3735q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ A7.g f3737s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(A7.g gVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3737s = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new C(this.f3737s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3735q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                M1.b bVar = i.this.f3709g;
                A7.g gVar = this.f3737s;
                this.f3735q = 1;
                if (bVar.t(gVar, this) == objE) {
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

    static final class D extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3738q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f3740s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f3740s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new D(this.f3740s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((D) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3738q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                M1.b bVar = i.this.f3709g;
                String str = this.f3740s;
                this.f3738q = 1;
                if (bVar.u(str, this) == objE) {
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

    static final class E extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3741q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f3743s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f3743s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new E(this.f3743s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((E) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3741q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                M1.b bVar = i.this.f3709g;
                String str = this.f3743s;
                this.f3741q = 1;
                if (bVar.u(str, this) == objE) {
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

    static final class F extends kotlin.coroutines.jvm.internal.l implements p219v8.s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3744q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3745r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3746s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3747t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3748u;

        F(p129m8.e eVar) {
            super(5, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            p139n8.b.e();
            if (this.f3744q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            List<C7.a> list = (List) this.f3745r;
            Set set = (Set) this.f3746s;
            List list2 = (List) this.f3747t;
            String str = (String) this.f3748u;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (list2 == null) {
                kotlin.coroutines.jvm.internal.b.a(linkedHashSet.addAll(set));
            } else {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.n.d(((C7.b) next).b(), str));
                C7.b bVar = (C7.b) next;
                if (bVar != null) {
                    kotlin.coroutines.jvm.internal.b.a(linkedHashSet.add(bVar.a()));
                }
            }
            for (C7.a aVar : list) {
                aVar.g(linkedHashSet.contains(aVar.c()));
            }
            C7.a aVarA = C7.a.f667k.a(i.this.f3708f);
            aVarA.g(linkedHashSet.isEmpty() || linkedHashSet.contains(aVarA.c()));
            return AbstractC1444s.g0(list, AbstractC1444s.e(aVarA));
        }

        @Override // p219v8.s
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object n(List list, Set set, List list2, String str, p129m8.e eVar) {
            F f10 = i.this.new F(eVar);
            f10.f3745r = list;
            f10.f3746s = set;
            f10.f3747t = list2;
            f10.f3748u = str;
            return f10.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class G implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3750q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3751q;

            /* JADX INFO: renamed from: J7.i$G$a$a, reason: collision with other inner class name */
            public static final class C0126a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f3752q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f3753r;

                public C0126a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3752q = obj;
                    this.f3753r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f3751q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0126a c0126a;
                if (eVar instanceof C0126a) {
                    c0126a = (C0126a) eVar;
                    int i10 = c0126a.f3753r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0126a.f3753r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0126a = new C0126a(eVar);
                    }
                } else {
                    c0126a = new C0126a(eVar);
                }
                Object obj2 = c0126a.f3752q;
                Object objE = p139n8.b.e();
                int i11 = c0126a.f3753r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f3751q;
                    if (!((Set) obj).isEmpty()) {
                        c0126a.f3753r = 1;
                        if (interfaceC0881g.b(obj, c0126a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public G(InterfaceC0880f interfaceC0880f) {
            this.f3750q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3750q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class H extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3755q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3756r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3757s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ i f3758t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(p129m8.e eVar, i iVar) {
            super(3, eVar);
            this.f3758t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3755q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f3756r;
                y yVar = new y(this.f3758t.U(), (List) this.f3757s);
                this.f3755q = 1;
                if (AbstractC0882h.t(interfaceC0881g, yVar, this) == objE) {
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

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
            H h10 = new H(eVar, this.f3758t);
            h10.f3756r = interfaceC0881g;
            h10.f3757s = obj;
            return h10.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class I implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3759q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3760q;

            /* JADX INFO: renamed from: J7.i$I$a$a, reason: collision with other inner class name */
            public static final class C0127a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f3761q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f3762r;

                public C0127a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3761q = obj;
                    this.f3762r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f3760q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0127a c0127a;
                if (eVar instanceof C0127a) {
                    c0127a = (C0127a) eVar;
                    int i10 = c0127a.f3762r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0127a.f3762r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0127a = new C0127a(eVar);
                    }
                } else {
                    c0127a = new C0127a(eVar);
                }
                Object obj2 = c0127a.f3761q;
                Object objE = p139n8.b.e();
                int i11 = c0127a.f3762r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f3760q;
                    String strA = ((C7.c) obj).a();
                    c0127a.f3762r = 1;
                    if (interfaceC0881g.b(strA, c0127a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public I(InterfaceC0880f interfaceC0880f) {
            this.f3759q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3759q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class J implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3764q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3765q;

            /* JADX INFO: renamed from: J7.i$J$a$a, reason: collision with other inner class name */
            public static final class C0128a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f3766q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f3767r;

                public C0128a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3766q = obj;
                    this.f3767r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f3765q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0128a c0128a;
                if (eVar instanceof C0128a) {
                    c0128a = (C0128a) eVar;
                    int i10 = c0128a.f3767r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0128a.f3767r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0128a = new C0128a(eVar);
                    }
                } else {
                    c0128a = new C0128a(eVar);
                }
                Object obj2 = c0128a.f3766q;
                Object objE = p139n8.b.e();
                int i11 = c0128a.f3767r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f3765q;
                    Integer num = (Integer) obj;
                    if (num != null) {
                        c0128a.f3767r = 1;
                        if (interfaceC0881g.b(num, c0128a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public J(InterfaceC0880f interfaceC0880f) {
            this.f3764q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3764q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class K implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collator f3769a;

        K() {
            Collator collator = Collator.getInstance();
            kotlin.jvm.internal.n.g(collator, "getInstance(...)");
            this.f3769a = collator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.nothing.launcher.card.j a10, com.nothing.launcher.card.j b10) {
            kotlin.jvm.internal.n.h(a10, "a");
            kotlin.jvm.internal.n.h(b10, "b");
            Integer numG = a10.G();
            Integer numG2 = b10.G();
            if (numG != null && numG2 != null && !kotlin.jvm.internal.n.d(numG, numG2)) {
                return kotlin.jvm.internal.n.i(numG.intValue(), numG2.intValue());
            }
            if (a10.B0() == b10.B0() && a10.C0() == b10.C0()) {
                return this.f3769a.compare(a10.g(i.this.f3708f), b10.g(i.this.f3708f));
            }
            return a10.B0() == b10.B0() ? kotlin.jvm.internal.n.i(a10.C0(), b10.C0()) : kotlin.jvm.internal.n.i(a10.B0(), b10.B0());
        }
    }

    /* JADX INFO: renamed from: J7.i$a, reason: case insensitive filesystem */
    static final class C0895a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3771q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3772r;

        /* JADX INFO: renamed from: J7.i$a$a, reason: collision with other inner class name */
        static final class C0129a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3774q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ i f3775r;

            /* JADX INFO: renamed from: J7.i$a$a$a, reason: collision with other inner class name */
            static final class C0130a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ i f3776q;

                C0130a(i iVar) {
                    this.f3776q = iVar;
                }

                @Override // I8.InterfaceC0881g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object b(List list, p129m8.e eVar) {
                    this.f3776q.e0().clear();
                    this.f3776q.e0().addAll(list);
                    return p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0129a(i iVar, p129m8.e eVar) {
                super(2, eVar);
                this.f3775r = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0129a(this.f3775r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0129a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f3774q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0880f interfaceC0880fD = this.f3775r.f3704c.d();
                    C0130a c0130a = new C0130a(this.f3775r);
                    this.f3774q = 1;
                    if (interfaceC0880fD.a(c0130a, this) == objE) {
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

        C0895a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0895a c0895a = i.this.new C0895a(eVar);
            c0895a.f3772r = obj;
            return c0895a;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0895a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3771q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            AbstractC0816i.d((L) this.f3772r, null, null, new C0129a(i.this, null), 3, null);
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: J7.i$b, reason: case insensitive filesystem */
    public static final class C0896b {
        public /* synthetic */ C0896b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Rect a(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            String strE = p087i6.n.e(context, "key_clock_area", "");
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return Rect.unflattenFromString(strE);
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            return p087i6.n.a(context, "depth_effect_pined", false);
        }

        public final void c(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            p087i6.n.f(context, "depth_effect_pined", true);
        }

        public final void d(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            p087i6.n.f(context, "depth_effect_pined", false);
        }

        public final void e(Context context, Rect rect) {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(rect, "rect");
            String strFlattenToString = rect.flattenToString();
            kotlin.jvm.internal.n.g(strFlattenToString, "flattenToString(...)");
            p087i6.n.i(context, "key_clock_area", strFlattenToString);
        }

        private C0896b() {
        }
    }

    /* JADX INFO: renamed from: J7.i$c, reason: case insensitive filesystem */
    public static final class C0897c implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U5.a f3777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final B7.a f3778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC1363c f3779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final M1.b f3780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final F8.I f3781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final S1.a f3782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Resources f3783h;

        public C0897c(U5.a repository, B7.a shortcutRepository, InterfaceC1363c currentWallpaperInfoFactory, M1.b interactor, F8.I backgroundDispatcher, S1.a clockViewFactory, Resources resources) {
            kotlin.jvm.internal.n.h(repository, "repository");
            kotlin.jvm.internal.n.h(shortcutRepository, "shortcutRepository");
            kotlin.jvm.internal.n.h(currentWallpaperInfoFactory, "currentWallpaperInfoFactory");
            kotlin.jvm.internal.n.h(interactor, "interactor");
            kotlin.jvm.internal.n.h(backgroundDispatcher, "backgroundDispatcher");
            kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
            kotlin.jvm.internal.n.h(resources, "resources");
            this.f3777b = repository;
            this.f3778c = shortcutRepository;
            this.f3779d = currentWallpaperInfoFactory;
            this.f3780e = interactor;
            this.f3781f = backgroundDispatcher;
            this.f3782g = clockViewFactory;
            this.f3783h = resources;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 c(Class modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            Object objA = extras.a(d0.a.f13396h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new i(this.f3777b, this.f3778c, this.f3779d, U.a(extras), (Application) objA, this.f3780e, this.f3781f, this.f3782g, this.f3783h);
        }
    }

    /* JADX INFO: renamed from: J7.i$d, reason: case insensitive filesystem */
    static final class C0898d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3784q;

        C0898d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new C0898d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0898d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r5.n(r4) == r0) goto L17;
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
                int r1 = r4.f3784q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L58
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                p079h8.r.b(r5)
                goto L34
            L1e:
                p079h8.r.b(r5)
                J7.i r5 = J7.i.this
                U5.a r5 = J7.i.o(r5)
                I8.f r5 = r5.c()
                r4.f3784q = r3
                java.lang.Object r5 = I8.AbstractC0882h.x(r5, r4)
                if (r5 != r0) goto L34
                goto L57
            L34:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L58
                J7.i r5 = J7.i.this
                androidx.lifecycle.Q r5 = J7.i.q(r5)
                java.lang.String r1 = "key_tips_state"
                J7.m$c r3 = J7.m.c.f3870q
                r5.i(r1, r3)
                J7.i r5 = J7.i.this
                U5.a r5 = J7.i.o(r5)
                r4.f3784q = r2
                java.lang.Object r4 = r5.n(r4)
                if (r4 != r0) goto L58
            L57:
                return r0
            L58:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: J7.i.C0898d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: J7.i$e, reason: case insensitive filesystem */
    static final class C0899e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3786q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3787r;

        C0899e(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0899e c0899e = i.this.new C0899e(eVar);
            c0899e.f3787r = obj;
            return c0899e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List<O1.a> list;
            T1.a aVar;
            Object objE = p139n8.b.e();
            int i10 = this.f3786q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                List list2 = (List) this.f3787r;
                this.f3787r = list2;
                this.f3786q = 1;
                if (W.b(100L, this) == objE) {
                    return objE;
                }
                list = list2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f3787r;
                p079h8.r.b(obj);
            }
            i iVar = i.this;
            ArrayList arrayList = new ArrayList();
            for (O1.a aVar2 : list) {
                O2.h hVarD = iVar.f3711i.d(aVar2.b());
                if (hVarD != null) {
                    String string = iVar.f3712j.getString(R.string.select_clock_action_description, hVarD.a().a());
                    kotlin.jvm.internal.n.g(string, "getString(...)");
                    aVar = new T1.a(aVar2.b(), aVar2.g(), string);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, p129m8.e eVar) {
            return ((C0899e) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: J7.i$f, reason: case insensitive filesystem */
    static final class C0900f extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3789q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3790r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f3791s;

        C0900f(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s((List) obj, ((Boolean) obj2).booleanValue(), (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3789q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return AbstractC1444s.g0(AbstractC1444s.p(new S5.c(this.f3791s, null, 2, null)), (List) this.f3790r);
        }

        public final Object s(List list, boolean z9, p129m8.e eVar) {
            C0900f c0900f = new C0900f(eVar);
            c0900f.f3790r = list;
            c0900f.f3791s = z9;
            return c0900f.invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: J7.i$g, reason: case insensitive filesystem */
    static final class C0901g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3792q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3793r;

        C0901g(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0901g c0901g = new C0901g(eVar);
            c0901g.f3793r = obj;
            return c0901g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3792q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            List list = (List) this.f3793r;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((O1.a) obj2).f()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((O1.a) it.next()).b());
            }
            return AbstractC1444s.w0(arrayList2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, p129m8.e eVar) {
            return ((C0901g) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: J7.i$h, reason: case insensitive filesystem */
    static final class C0902h extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3794q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f3795r;

        C0902h(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0902h c0902h = new C0902h(eVar);
            c0902h.f3795r = ((Boolean) obj).booleanValue();
            return c0902h;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3794q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f3795r);
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((C0902h) create(Boolean.valueOf(z9), eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: J7.i$i, reason: collision with other inner class name */
    static final class C0131i implements InterfaceC1363c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f3796a;

        C0131i(InterfaceC0822l interfaceC0822l) {
            this.f3796a = interfaceC0822l;
        }

        @Override // p074h3.InterfaceC1363c.a
        public final void a(p064g3.x xVar, p064g3.x xVar2, int i10) {
            InterfaceC0822l interfaceC0822l = this.f3796a;
            if (xVar2 != null) {
                xVar = xVar2;
            }
            interfaceC0822l.k(xVar, null);
        }
    }

    /* JADX INFO: renamed from: J7.i$j, reason: case insensitive filesystem */
    static final class C0903j extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3797q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ N1.a f3799s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0903j(N1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3799s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new C0903j(this.f3799s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0903j) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3797q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.z zVar = i.this.f3726x;
                N1.a aVar = this.f3799s;
                this.f3797q = 1;
                if (zVar.b(aVar, this) == objE) {
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

    /* JADX INFO: renamed from: J7.i$k, reason: case insensitive filesystem */
    static final class C0904k extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3800q;

        C0904k(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new C0904k(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0904k) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r5.m(r4) == r0) goto L17;
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
                int r1 = r4.f3800q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L58
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                p079h8.r.b(r5)
                goto L34
            L1e:
                p079h8.r.b(r5)
                J7.i r5 = J7.i.this
                U5.a r5 = J7.i.o(r5)
                I8.f r5 = r5.p()
                r4.f3800q = r3
                java.lang.Object r5 = I8.AbstractC0882h.x(r5, r4)
                if (r5 != r0) goto L34
                goto L57
            L34:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L58
                J7.i r5 = J7.i.this
                androidx.lifecycle.Q r5 = J7.i.q(r5)
                java.lang.String r1 = "key_tips_state"
                J7.m$a r3 = J7.m.a.f3868q
                r5.i(r1, r3)
                J7.i r5 = J7.i.this
                U5.a r5 = J7.i.o(r5)
                r4.f3800q = r2
                java.lang.Object r4 = r5.m(r4)
                if (r4 != r0) goto L58
            L57:
                return r0
            L58:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: J7.i.C0904k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3802q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3803r;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3805q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ i f3806r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, p129m8.e eVar) {
                super(2, eVar);
                this.f3806r = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f3806r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f3805q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    this.f3805q = 1;
                    if (W.b(800L, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                this.f3806r.f3720r.l(new LoadingState.End(true));
                return p079h8.A.f21846a;
            }
        }

        l(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            l lVar = i.this.new l(eVar);
            lVar.f3803r = obj;
            return lVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3802q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            AbstractC0816i.d((L) this.f3803r, null, null, new a(i.this, null), 3, null);
            return p079h8.A.f21846a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3807q;

        m(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new m(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((m) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3807q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.z zVar = i.this.f3728z;
                p079h8.o oVarA = p079h8.v.a(i.this.d0().getValue(), i.this.b0().getValue());
                this.f3807q = 1;
                if (zVar.b(oVarA, this) == objE) {
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

    static final class n extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3809q;

        n(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new n(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((n) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3809q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            i.this.f3707e.i("select_shortcuts", null);
            return p079h8.A.f21846a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3811q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3812r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3813s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3814t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f3815u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f3816v;

        o(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new o(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((o) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0091 A[PHI: r2 r5
          0x0091: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v10 java.lang.String) binds: [B:16:0x008d, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
          0x0091: PHI (r5v4 java.lang.Object) = (r5v3 java.lang.Object), (r5v7 java.lang.Object) binds: [B:16:0x008d, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:41:0x012c A[ADDED_TO_REGION] */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
        
            if (r2.r(r9, r21) == r1) goto L48;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: J7.i.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3818q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3819r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3820s;

        p(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new p(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((p) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            i iVar;
            Iterator it;
            Object objE = p139n8.b.e();
            int i10 = this.f3820s;
            if (i10 == 0) {
                p079h8.r.b(obj);
                List list = (List) i.this.f3700Z.getValue();
                if (list != null) {
                    iVar = i.this;
                    it = list.iterator();
                }
                return p079h8.A.f21846a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.f3819r;
            iVar = (i) this.f3818q;
            p079h8.r.b(obj);
            while (it.hasNext()) {
                C7.b bVar = (C7.b) it.next();
                com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "saveShortcuts:" + bVar.b() + "-" + bVar.a());
                B7.a aVar = iVar.f3704c;
                String strB = bVar.b();
                String strA = bVar.a();
                this.f3818q = iVar;
                this.f3819r = it;
                this.f3820s = 1;
                if (aVar.c(strB, strA, this) == objE) {
                    return objE;
                }
            }
            return p079h8.A.f21846a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3822q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C7.a f3824s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f3825t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(C7.a aVar, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f3824s = aVar;
            this.f3825t = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return i.this.new q(this.f3824s, this.f3825t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((q) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0065  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            if (r6.H0(r1, r2, r5) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        
            if (r6.c(r1, r3, r5) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r5.f3822q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                p079h8.r.b(r6)
                goto L65
            L1e:
                p079h8.r.b(r6)
                goto L86
            L22:
                p079h8.r.b(r6)
                J7.i r6 = J7.i.this
                boolean r6 = r6.a0()
                if (r6 == 0) goto L3c
                J7.i r6 = J7.i.this
                C7.a r1 = r5.f3824s
                boolean r2 = r5.f3825t
                r5.f3822q = r4
                java.lang.Object r5 = J7.i.y(r6, r1, r2, r5)
                if (r5 != r0) goto L86
                goto L85
            L3c:
                boolean r6 = r5.f3825t
                if (r6 == 0) goto L65
                J7.i r6 = J7.i.this
                B7.a r6 = J7.i.s(r6)
                J7.i r1 = J7.i.this
                I8.O r1 = J7.i.r(r1)
                java.lang.Object r1 = r1.getValue()
                java.lang.String r4 = "bottom_start"
                boolean r1 = kotlin.jvm.internal.n.d(r1, r4)
                if (r1 == 0) goto L5a
                java.lang.String r4 = "bottom_end"
            L5a:
                r5.f3822q = r3
                java.lang.String r1 = "none"
                java.lang.Object r6 = r6.c(r4, r1, r5)
                if (r6 != r0) goto L65
                goto L85
            L65:
                J7.i r6 = J7.i.this
                B7.a r6 = J7.i.s(r6)
                J7.i r1 = J7.i.this
                I8.O r1 = J7.i.r(r1)
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                C7.a r3 = r5.f3824s
                java.lang.String r3 = r3.c()
                r5.f3822q = r2
                java.lang.Object r5 = r6.c(r1, r3, r5)
                if (r5 != r0) goto L86
            L85:
                return r0
            L86:
                h8.A r5 = p079h8.A.f21846a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: J7.i.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3826q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3827r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3828s;

        r(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3826q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            List list = (List) this.f3827r;
            String str = (String) this.f3828s;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (kotlin.jvm.internal.n.d(((C7.b) obj2).b(), str)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C7.b) it.next()).a());
            }
            return AbstractC1444s.w0(arrayList2);
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(List list, String str, p129m8.e eVar) {
            r rVar = new r(eVar);
            rVar.f3827r = list;
            rVar.f3828s = str;
            return rVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.l implements p219v8.s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3829q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3830r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3831s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3832t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3833u;

        s(p129m8.e eVar) {
            super(5, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean w(C7.b bVar, C7.b bVar2) {
            return kotlin.jvm.internal.n.d(bVar.b(), bVar2.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean x(p219v8.l lVar, Object obj) {
            return ((Boolean) lVar.f(obj)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            Object next3;
            p139n8.b.e();
            if (this.f3829q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            List list = (List) this.f3830r;
            List<C7.b> list2 = (List) this.f3831s;
            String str = (String) this.f3832t;
            List list3 = (List) this.f3833u;
            ArrayList arrayList = new ArrayList();
            List<C7.b> listU0 = AbstractC1444s.u0(list);
            List list4 = list;
            Iterator it = list4.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.n.d(((C7.b) next).b(), "bottom_start"));
            if (next == null) {
                listU0.add(new C7.b("bottom_start", "none"));
            }
            Iterator it2 = list4.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!kotlin.jvm.internal.n.d(((C7.b) next2).b(), "bottom_end"));
            if (next2 == null) {
                listU0.add(new C7.b("bottom_end", "none"));
            }
            if (list2 != null) {
                for (final C7.b bVar : list2) {
                    final p219v8.l lVar = new p219v8.l() { // from class: J7.j
                        @Override // p219v8.l
                        public final Object f(Object obj2) {
                            return Boolean.valueOf(i.s.w(bVar, (C7.b) obj2));
                        }
                    };
                    if (listU0.removeIf(new Predicate() { // from class: J7.k
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return i.s.x(lVar, obj2);
                        }
                    })) {
                        listU0.add(bVar);
                    }
                }
            }
            for (C7.b bVar2 : listU0) {
                Iterator it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!kotlin.jvm.internal.n.d(bVar2.a(), ((C7.a) next3).c()));
                C7.a aVar = (C7.a) next3;
                if (aVar != null) {
                    arrayList.add(new p079h8.u(bVar2.b(), aVar, kotlin.coroutines.jvm.internal.b.a(kotlin.jvm.internal.n.d(str, bVar2.b()))));
                }
            }
            return arrayList;
        }

        @Override // p219v8.s
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object n(List list, List list2, String str, List list3, p129m8.e eVar) {
            s sVar = new s(eVar);
            sVar.f3830r = list;
            sVar.f3831s = list2;
            sVar.f3832t = str;
            sVar.f3833u = list3;
            return sVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3834q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3835r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3836s;

        t(p129m8.e eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0115  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
            Object next;
            Collection collectionP;
            S5.a aVar;
            p139n8.b.e();
            if (this.f3834q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            List list = (List) this.f3835r;
            p258z7.c cVar = (p258z7.c) this.f3836s;
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                S5.a aVar2 = null;
                if (!it.hasNext()) {
                    break;
                }
                S5.d dVar = (S5.d) it.next();
                if (dVar instanceof S5.a) {
                    aVar2 = (S5.a) dVar;
                }
                arrayList.add(aVar2);
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                aVar = (S5.a) next;
            } while (!kotlin.jvm.internal.n.d(aVar != null ? aVar.h() : null, cVar.a()));
            S5.a aVar3 = (S5.a) next;
            if (aVar3 == null) {
                return null;
            }
            i iVar = i.this;
            List<com.nothing.launcher.card.j> listG = aVar3.g();
            List arrayList2 = new ArrayList();
            boolean z9 = false;
            for (com.nothing.launcher.card.j jVar : listG) {
                List listE = jVar.E(iVar.f3708f);
                if (listE == null) {
                    collectionP = AbstractC1444s.p(jVar);
                } else {
                    if (listE.isEmpty()) {
                        listE = null;
                    }
                    if (listE != null) {
                        List<p079h8.u> list3 = listE;
                        collectionP = new ArrayList(AbstractC1444s.u(list3, 10));
                        for (p079h8.u uVar : list3) {
                            com.nothing.launcher.card.j jVar2 = new com.nothing.launcher.card.j();
                            jVar2.r0(jVar);
                            jVar2.L0(((Size) uVar.d()).getWidth());
                            jVar2.M0(((Size) uVar.d()).getHeight());
                            jVar2.I0(jVar2.B0());
                            jVar2.J0(jVar2.C0());
                            jVar2.K0((Drawable) uVar.e());
                            Object objF = uVar.f();
                            if (!kotlin.coroutines.jvm.internal.b.a(((String) objF).length() > 0).booleanValue()) {
                                objF = null;
                            }
                            jVar2.H0((String) objF);
                            collectionP.add(jVar2);
                            z9 = true;
                        }
                    } else {
                        collectionP = AbstractC1444s.p(jVar);
                    }
                }
                AbstractC1444s.z(arrayList2, collectionP);
            }
            if (!z9) {
                arrayList2 = AbstractC1444s.m0(arrayList2, iVar.f3696V);
            }
            return new p258z7.d(aVar3.a(iVar.f3708f), cVar, arrayList2);
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(List list, p258z7.c cVar, p129m8.e eVar) {
            t tVar = i.this.new t(eVar);
            tVar.f3835r = list;
            tVar.f3836s = cVar;
            return tVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3839r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3840s;

        u(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3838q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            A7.a aVar = (A7.a) this.f3839r;
            A7.a aVar2 = (A7.a) this.f3840s;
            return aVar2 == null ? aVar : aVar2;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(A7.a aVar, A7.a aVar2, p129m8.e eVar) {
            u uVar = new u(eVar);
            uVar.f3839r = aVar;
            uVar.f3840s = aVar2;
            return uVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3841q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3842r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3843s;

        v(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3841q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            String str = (String) this.f3842r;
            String str2 = (String) this.f3843s;
            return str2 == null ? str : str2;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(String str, String str2, p129m8.e eVar) {
            v vVar = new v(eVar);
            vVar.f3842r = str;
            vVar.f3843s = str2;
            return vVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3844q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3845r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3846s;

        w(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3844q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            N1.a aVar = (N1.a) this.f3845r;
            N1.a aVar2 = (N1.a) this.f3846s;
            return aVar2 == null ? aVar : aVar2;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(N1.a aVar, N1.a aVar2, p129m8.e eVar) {
            w wVar = new w(eVar);
            wVar.f3845r = aVar;
            wVar.f3846s = aVar2;
            return wVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.l implements p219v8.s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3847q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3848r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3849s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3851u;

        x(p129m8.e eVar) {
            super(5, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3847q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            A7.g gVar = (A7.g) this.f3848r;
            A7.g gVar2 = (A7.g) this.f3849s;
            if (i.this.Z0((String) this.f3850t, (Set) this.f3851u)) {
                return gVar2 == null ? gVar : gVar2;
            }
            return null;
        }

        @Override // p219v8.s
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object n(A7.g gVar, A7.g gVar2, String str, Set set, p129m8.e eVar) {
            x xVar = i.this.new x(eVar);
            xVar.f3848r = gVar;
            xVar.f3849s = gVar2;
            xVar.f3850t = str;
            xVar.f3851u = set;
            return xVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class y implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3853q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f3854r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3855q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ List f3856r;

            /* JADX INFO: renamed from: J7.i$y$a$a, reason: collision with other inner class name */
            public static final class C0132a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f3857q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f3858r;

                public C0132a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3857q = obj;
                    this.f3858r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, List list) {
                this.f3855q = interfaceC0881g;
                this.f3856r = list;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0132a c0132a;
                if (eVar instanceof C0132a) {
                    c0132a = (C0132a) eVar;
                    int i10 = c0132a.f3858r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0132a.f3858r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0132a = new C0132a(eVar);
                    }
                } else {
                    c0132a = new C0132a(eVar);
                }
                Object obj2 = c0132a.f3857q;
                Object objE = p139n8.b.e();
                int i11 = c0132a.f3858r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f3855q;
                    String str = (String) obj;
                    Iterator it = this.f3856r.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.n.d(((T1.a) it.next()).a(), str)) {
                            break;
                        }
                        i12++;
                    }
                    Integer numC = i12 >= 0 ? kotlin.coroutines.jvm.internal.b.c(i12) : null;
                    c0132a.f3858r = 1;
                    if (interfaceC0881g.b(numC, c0132a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public y(InterfaceC0880f interfaceC0880f, List list) {
            this.f3853q = interfaceC0880f;
            this.f3854r = list;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3853q.a(new a(interfaceC0881g, this.f3854r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3860q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3861r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3862s;

        z(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3860q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            List<C7.c> list = (List) this.f3861r;
            String str = (String) this.f3862s;
            if (str == null) {
                return (C7.c) list.get(0);
            }
            for (C7.c cVar : list) {
                if (kotlin.jvm.internal.n.d(cVar.a(), str)) {
                    return cVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(List list, String str, p129m8.e eVar) {
            z zVar = new z(eVar);
            zVar.f3861r = list;
            zVar.f3862s = str;
            return zVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public i(U5.a repository, B7.a shortcutRepository, InterfaceC1363c currentWallpaperInfoFactory, Q savedStateHandle, Context appContext, M1.b interactor, F8.I backgroundDispatcher, S1.a clockViewFactory, Resources resources) {
        kotlin.jvm.internal.n.h(repository, "repository");
        kotlin.jvm.internal.n.h(shortcutRepository, "shortcutRepository");
        kotlin.jvm.internal.n.h(currentWallpaperInfoFactory, "currentWallpaperInfoFactory");
        kotlin.jvm.internal.n.h(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.n.h(appContext, "appContext");
        kotlin.jvm.internal.n.h(interactor, "interactor");
        kotlin.jvm.internal.n.h(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(resources, "resources");
        this.f3702b = repository;
        this.f3704c = shortcutRepository;
        this.f3706d = currentWallpaperInfoFactory;
        this.f3707e = savedStateHandle;
        this.f3708f = appContext;
        this.f3709g = interactor;
        this.f3710h = backgroundDispatcher;
        this.f3711i = clockViewFactory;
        this.f3712j = resources;
        this.f3713k = p079h8.i.b(new p219v8.a() { // from class: J7.c
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(i.Y0());
            }
        });
        this.f3714l = a0();
        this.f3715m = p079h8.i.b(new p219v8.a() { // from class: J7.d
            @Override // p219v8.a
            public final Object invoke() {
                return i.d1(this.f3669q);
            }
        });
        this.f3716n = savedStateHandle.e("clock_area", null);
        this.f3717o = savedStateHandle.e("depth_switch_state", null);
        O oE = savedStateHandle.e("select_widget_key", new p258z7.c(null, null, 0L, 7, null));
        this.f3718p = oE;
        this.f3719q = savedStateHandle.e("key_tips_state", J7.m.b.f3869q);
        androidx.lifecycle.H h10 = new androidx.lifecycle.H(LoadingState.None.INSTANCE);
        this.f3720r = h10;
        this.f3721s = h10;
        InterfaceC0880f interfaceC0880fE = AbstractC0882h.E(repository.x(), new C0902h(null));
        L lA = b0.a(this);
        I8.K.a aVar = I8.K.f3174a;
        I8.E eJ = AbstractC0882h.J(interfaceC0880fE, lA, aVar.c(), 1);
        this.f3722t = eJ;
        I8.E eJ2 = AbstractC0882h.J(repository.w(), b0.a(this), aVar.c(), 1);
        this.f3723u = eJ2;
        this.f3724v = AbstractC0882h.J(AbstractC0882h.l(eJ2, eJ, new C0900f(null)), b0.a(this), aVar.c(), 1);
        this.f3725w = repository.o();
        I8.z zVarB = I8.G.b(0, 0, null, 7, null);
        this.f3726x = zVarB;
        this.f3727y = zVarB;
        I8.z zVarB2 = I8.G.b(0, 1, null, 5, null);
        this.f3728z = zVarB2;
        this.f3675A = zVarB2;
        O oK = AbstractC0882h.K(AbstractC0882h.D(AbstractC0882h.E(interactor.d(), new C0901g(null)), F8.I.k1(backgroundDispatcher, 1, null, 2, null)), b0.a(this), aVar.c(), p089i8.U.d());
        this.f3676B = oK;
        O oK2 = AbstractC0882h.K(AbstractC0882h.D(AbstractC0882h.E(interactor.d(), new C0899e(null)), F8.I.k1(backgroundDispatcher, 1, null, 2, null)), b0.a(this), aVar.c(), AbstractC1444s.l());
        this.f3677C = oK2;
        O oK3 = AbstractC0882h.K(interactor.i(), b0.a(this), aVar.c(), "");
        this.f3678D = oK3;
        O oK4 = AbstractC0882h.K(interactor.j(), b0.a(this), aVar.c(), N1.a.DYNAMIC);
        this.f3679E = oK4;
        O oK5 = AbstractC0882h.K(interactor.h(), b0.a(this), aVar.c(), A7.a.CENTER);
        this.f3680F = oK5;
        O oK6 = AbstractC0882h.K(interactor.l(), b0.a(this), aVar.c(), A7.g.ON);
        this.f3681G = oK6;
        O oE2 = savedStateHandle.e("select_clock_id", null);
        this.f3682H = oE2;
        O oE3 = savedStateHandle.e("select_clock_size", null);
        this.f3683I = oE3;
        O oE4 = savedStateHandle.e("select_clock_align", null);
        this.f3684J = oE4;
        O oE5 = savedStateHandle.e("select_dynamic_font", null);
        this.f3685K = oE5;
        InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(oK3, oE2, new v(null));
        this.f3686L = interfaceC0880fL;
        this.f3687M = AbstractC0882h.l(oK4, oE3, new w(null));
        this.f3688N = AbstractC0882h.l(oK5, oE4, new u(null));
        this.f3689O = AbstractC0882h.o(AbstractC0882h.j(oK6, oE5, interfaceC0880fL, new G(oK), new x(null)));
        this.f3690P = new J(AbstractC0882h.N(oK2, new H(null, this)));
        this.f3694T = repository.j();
        this.f3695U = AbstractC0882h.J(AbstractC0882h.l(eJ2, oE, new t(null)), b0.a(this), aVar.c(), 0);
        this.f3696V = new K();
        I8.A a10 = I8.Q.a(null);
        this.f3697W = a10;
        O oK7 = AbstractC0882h.K(new I(AbstractC0882h.l(shortcutRepository.a(), a10, new z(null))), b0.a(this), I8.K.a.b(aVar, 0L, 0L, 3, null), "");
        this.f3698X = oK7;
        I8.E eJ3 = AbstractC0882h.J(AbstractC0882h.l(shortcutRepository.d(), oK7, new r(null)), b0.a(this), I8.K.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f3699Y = eJ3;
        O oE6 = savedStateHandle.e("select_shortcuts", null);
        this.f3700Z = oE6;
        I8.E eJ4 = AbstractC0882h.J(AbstractC0882h.j(shortcutRepository.b(), eJ3, oE6, oK7, new F(null)), b0.a(this), I8.K.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f3701a0 = eJ4;
        this.f3703b0 = AbstractC0882h.J(AbstractC0882h.j(shortcutRepository.d(), oE6, oK7, eJ4, new s(null)), b0.a(this), aVar.c(), 1);
        this.f3705c0 = new ArrayList();
        AbstractC0816i.d(b0.a(this), null, null, new C0895a(null), 3, null);
        if (a0()) {
            l0().d(b0.a(this), repository);
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H0(C7.a aVar, boolean z9, p129m8.e eVar) {
        List arrayList;
        C7.b bVar = new C7.b((String) this.f3698X.getValue(), aVar.c());
        List list = (List) this.f3700Z.getValue();
        if (list == null || (arrayList = AbstractC1444s.u0(list)) == null) {
            arrayList = new ArrayList();
        }
        if (z9) {
            final String str = kotlin.jvm.internal.n.d(this.f3698X.getValue(), "bottom_start") ? "bottom_end" : "bottom_start";
            final p219v8.l lVar = new p219v8.l() { // from class: J7.e
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(i.I0(str, (C7.b) obj));
                }
            };
            arrayList.removeIf(new Predicate() { // from class: J7.f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i.J0(lVar, obj);
                }
            });
            arrayList.add(new C7.b(str, "none"));
        }
        if (!arrayList.isEmpty()) {
            final p219v8.l lVar2 = new p219v8.l() { // from class: J7.g
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(i.K0(this.f3672q, (C7.b) obj));
                }
            };
            arrayList.removeIf(new Predicate() { // from class: J7.h
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i.L0(lVar2, obj);
                }
            });
        }
        arrayList.add(bVar);
        this.f3707e.i("select_shortcuts", arrayList);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I0(String str, C7.b it) {
        kotlin.jvm.internal.n.h(it, "it");
        return kotlin.jvm.internal.n.d(it.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J0(p219v8.l lVar, Object obj) {
        return ((Boolean) lVar.f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K0(i iVar, C7.b it) {
        kotlin.jvm.internal.n.h(it, "it");
        return kotlin.jvm.internal.n.d(it.b(), iVar.f3698X.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(p219v8.l lVar, Object obj) {
        return ((Boolean) lVar.f(obj)).booleanValue();
    }

    private final Rect O() {
        return (Rect) this.f3707e.d("clock_area_origin");
    }

    public static /* synthetic */ void S0(i iVar, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        iVar.R0(z9, z10);
    }

    private final void U0(Rect rect) {
        this.f3707e.i("clock_area_origin", rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y0() {
        return p074h3.I.a().C().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z0(String str, Set set) {
        return p074h3.I.a().C().q() && set.contains(str);
    }

    static /* synthetic */ boolean a1(i iVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = (Set) iVar.f3676B.getValue();
        }
        return iVar.Z0(str, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J7.o d1(i iVar) {
        return J7.p.a(iVar.a0(), iVar.f3707e);
    }

    private final J7.o l0() {
        return (J7.o) this.f3715m.getValue();
    }

    private final void m0() {
        Rect rectA;
        if (!p098j7.j.f22340T.b(this.f3708f) || (rectA = f3674d0.a(this.f3708f)) == null) {
            return;
        }
        P0(rectA, true);
    }

    public final void A(p079h8.o info) {
        kotlin.jvm.internal.n.h(info, "info");
        l0().e(b0.a(this), this.f3702b, info);
        AbstractC0816i.d(b0.a(this), null, null, new C0898d(null), 3, null);
    }

    public final void A0() {
        AbstractC0816i.d(b0.a(this), null, null, new n(null), 3, null);
    }

    public final void B() {
        this.f3707e.i("key_tips_state", J7.m.b.f3869q);
    }

    public final void B0() {
        l0().a(this.f3702b);
    }

    public final void C(int i10) {
        l0().g(b0.a(this), this.f3702b, i10);
    }

    public final void C0() {
        this.f3693S = false;
        this.f3692R = false;
        AbstractC0816i.d(b0.a(this), this.f3710h, null, new o(null), 2, null);
    }

    public final void D(boolean z9) {
        l0().b(b0.a(this), this.f3702b, z9);
    }

    public final void D0() {
        this.f3702b.b();
    }

    public final O E() {
        return this.f3677C;
    }

    public final void E0() {
        AbstractC0816i.d(b0.a(this), null, null, new p(null), 3, null);
    }

    public final I8.E F() {
        return this.f3724v;
    }

    public final void F0() {
        l0().c(b0.a(this), this.f3702b);
    }

    public final InterfaceC0880f G() {
        return this.f3725w;
    }

    public final void G0(C7.a shortcutInfo, boolean z9) {
        kotlin.jvm.internal.n.h(shortcutInfo, "shortcutInfo");
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "selectShortcut:" + shortcutInfo.c() + " replace:" + z9);
        AbstractC0816i.d(b0.a(this), null, null, new q(shortcutInfo, z9, null), 3, null);
    }

    public final boolean H() {
        return this.f3702b.r();
    }

    public final List I() {
        return this.f3702b.u();
    }

    public final I8.E J() {
        return this.f3727y;
    }

    public final I8.E K() {
        return this.f3675A;
    }

    public final O L() {
        return this.f3716n;
    }

    public final O M() {
        return this.f3717o;
    }

    public final void M0(String slot) {
        kotlin.jvm.internal.n.h(slot, "slot");
        this.f3697W.h(slot);
    }

    public final I8.E N() {
        return this.f3722t;
    }

    public final void N0(p258z7.c selectInfo) {
        kotlin.jvm.internal.n.h(selectInfo, "selectInfo");
        this.f3707e.i("select_widget_key", selectInfo);
    }

    public final void O0(A7.a align) {
        kotlin.jvm.internal.n.h(align, "align");
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "setClockAlign: " + align);
        this.f3693S = false;
        if (this.f3714l) {
            this.f3707e.i("select_clock_align", align);
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f3691Q;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f3691Q = AbstractC0816i.d(b0.a(this), this.f3710h, null, new A(align, null), 2, null);
    }

    public final InterfaceC0880f P() {
        return this.f3694T;
    }

    public final void P0(Rect rect, boolean z9) {
        kotlin.jvm.internal.n.h(rect, "rect");
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "setClockArea: " + rect + " force:" + z9);
        if (z9 || this.f3716n.getValue() == null) {
            if (this.f3716n.getValue() == null) {
                U0(rect);
            }
            this.f3707e.i("clock_area", rect);
        }
    }

    public final androidx.lifecycle.C Q() {
        return this.f3721s;
    }

    public final void Q0(N1.a size) {
        kotlin.jvm.internal.n.h(size, "size");
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "setClockSize: " + size);
        this.f3693S = false;
        if (this.f3714l) {
            this.f3707e.i("select_clock_size", size);
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f3691Q;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f3691Q = AbstractC0816i.d(b0.a(this), this.f3710h, null, new B(size, null), 2, null);
    }

    public final InterfaceC0880f R() {
        return this.f3703b0;
    }

    public final void R0(boolean z9, boolean z10) {
        if (!z10) {
            this.f3707e.i("depth_switch_state", Boolean.valueOf(z9));
        } else if (((Boolean) this.f3707e.d("depth_switch_state")) == null) {
            this.f3707e.i("depth_switch_state", Boolean.valueOf(z9));
        }
    }

    public final I8.E S() {
        return this.f3695U;
    }

    public final InterfaceC0880f T() {
        return this.f3688N;
    }

    public final void T0(A7.g dynamicFont) {
        kotlin.jvm.internal.n.h(dynamicFont, "dynamicFont");
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "setDynamicFont: " + dynamicFont);
        if (this.f3714l) {
            this.f3707e.i("select_dynamic_font", dynamicFont);
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f3691Q;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f3691Q = AbstractC0816i.d(b0.a(this), this.f3710h, null, new C(dynamicFont, null), 2, null);
    }

    public final InterfaceC0880f U() {
        return this.f3686L;
    }

    public final InterfaceC0880f V() {
        return this.f3687M;
    }

    public final void V0(LoadingState state) {
        kotlin.jvm.internal.n.h(state, "state");
        this.f3720r.n(state);
    }

    public final InterfaceC0880f W() {
        return this.f3689O;
    }

    public final void W0(String clockId) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "setClock: " + clockId);
        this.f3693S = true;
        if (!this.f3714l) {
            InterfaceC0846x0 interfaceC0846x0 = this.f3691Q;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            this.f3691Q = AbstractC0816i.d(b0.a(this), this.f3710h, null, new D(clockId, null), 2, null);
            return;
        }
        O1.b bVar = (O1.b) A7.e.f313a.a().get(clockId);
        if (bVar != null) {
            this.f3707e.i("select_clock_align", bVar.d());
            this.f3707e.i("select_clock_size", bVar.f());
        }
        this.f3707e.i("select_clock_id", clockId);
    }

    public final InterfaceC0880f X() {
        return this.f3690P;
    }

    public final void X0(String clockId) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        if (this.f3714l) {
            this.f3707e.i("select_clock_id", clockId);
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f3691Q;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f3691Q = AbstractC0816i.d(b0.a(this), this.f3710h, null, new E(clockId, null), 2, null);
    }

    public final CardWidgetSimpleInfo[] Y() {
        return this.f3702b.t();
    }

    public final InterfaceC0880f Z() {
        return this.f3701a0;
    }

    public final boolean a0() {
        return ((Boolean) this.f3713k.getValue()).booleanValue();
    }

    public final O b0() {
        return this.f3680F;
    }

    public final void b1() {
        U0((Rect) this.f3716n.getValue());
    }

    public final O c0() {
        return this.f3678D;
    }

    public final void c1() {
        l0().f(b0.a(this), this.f3702b);
    }

    public final O d0() {
        return this.f3679E;
    }

    public final List e0() {
        return this.f3705c0;
    }

    public final O f0() {
        return this.f3719q;
    }

    public final O g0() {
        return this.f3684J;
    }

    public final O h0() {
        return this.f3682H;
    }

    public final O i0() {
        return this.f3683I;
    }

    public final O j0() {
        return this.f3685K;
    }

    public final Object k0(boolean z9, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        this.f3706d.a(this.f3708f, z9, new C0131i(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public final boolean n0() {
        return this.f3692R;
    }

    public final boolean o0() {
        String str = (String) this.f3682H.getValue();
        N1.a aVar = (N1.a) this.f3683I.getValue();
        A7.a aVar2 = (A7.a) this.f3684J.getValue();
        A7.g gVar = (A7.g) this.f3685K.getValue();
        if (str == null && aVar == null && aVar2 == null && gVar == null) {
            return false;
        }
        com.nothing.wallpaper.common.log.c.d("LockScreenViewModel", "isClockChanged user:" + str + "-" + aVar2 + "-" + aVar + "-" + gVar + " system:" + this.f3678D.getValue() + "-" + this.f3680F.getValue() + "-" + this.f3679E.getValue() + "-" + this.f3681G.getValue());
        return (kotlin.jvm.internal.n.d(this.f3678D.getValue(), str) && this.f3680F.getValue() == aVar2 && this.f3679E.getValue() == aVar && this.f3681G.getValue() == gVar) ? false : true;
    }

    public final boolean p0() {
        return this.f3693S;
    }

    public final boolean q0() {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List list = (List) this.f3700Z.getValue();
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = this.f3705c0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.n.d(((C7.b) next).b(), "bottom_start"));
        C7.b bVar = (C7.b) next;
        Iterator it2 = this.f3705c0.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!kotlin.jvm.internal.n.d(((C7.b) next2).b(), "bottom_end"));
        C7.b bVar2 = (C7.b) next2;
        List list2 = list;
        Iterator it3 = list2.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!kotlin.jvm.internal.n.d(((C7.b) next3).b(), "bottom_start"));
        C7.b bVar3 = (C7.b) next3;
        Iterator it4 = list2.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (!kotlin.jvm.internal.n.d(((C7.b) next4).b(), "bottom_end"));
        C7.b bVar4 = (C7.b) next4;
        if (!kotlin.jvm.internal.n.d(bVar != null ? bVar.a() : null, bVar3 != null ? bVar3.a() : null)) {
            if ((bVar != null ? bVar.a() : null) == null) {
                if (!kotlin.jvm.internal.n.d(bVar3 != null ? bVar3.a() : null, "none")) {
                    return true;
                }
            } else {
                if ((bVar3 != null ? bVar3.a() : null) != null) {
                    return true;
                }
            }
        }
        if (!kotlin.jvm.internal.n.d(bVar2 != null ? bVar2.a() : null, bVar4 != null ? bVar4.a() : null)) {
            if ((bVar2 != null ? bVar2.a() : null) == null) {
                if (!kotlin.jvm.internal.n.d(bVar4 != null ? bVar4.a() : null, "none")) {
                    return true;
                }
            } else {
                if ((bVar4 != null ? bVar4.a() : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r0() {
        return (this.f3682H.getValue() == null && this.f3683I.getValue() == null && this.f3684J.getValue() == null && this.f3685K.getValue() == null) ? false : true;
    }

    public final void s0(N1.a size, A7.f type) {
        kotlin.jvm.internal.n.h(size, "size");
        kotlin.jvm.internal.n.h(type, "type");
        if (type == A7.f.SWITCH || type == A7.f.SIZE) {
            AbstractC0816i.d(b0.a(this), null, null, new C0903j(size, null), 3, null);
        }
    }

    public final void t0() {
        AbstractC0816i.d(b0.a(this), null, null, new C0904k(null), 3, null);
    }

    public final void u0(A7.f type) {
        kotlin.jvm.internal.n.h(type, "type");
        this.f3692R = false;
        if (type == A7.f.SWITCH) {
            this.f3693S = false;
        }
    }

    public final void v0() {
        this.f3692R = true;
    }

    public final void w0() {
        AbstractC0816i.d(b0.a(this), null, null, new l(null), 3, null);
    }

    public final void x0() {
        this.f3720r.n(LoadingState.Loading.INSTANCE);
    }

    public final void y0() {
        this.f3693S = false;
        this.f3692R = false;
        this.f3720r.n(LoadingState.None.INSTANCE);
        this.f3702b.l(true);
    }

    public final void z0() {
        String str = (String) this.f3682H.getValue();
        boolean z9 = str != null ? !kotlin.jvm.internal.n.d(str, this.f3678D.getValue()) : false;
        this.f3693S = z9;
        this.f3707e.i("select_clock_size", null);
        this.f3707e.i("select_clock_align", null);
        this.f3707e.i("select_clock_id", null);
        this.f3707e.i("select_dynamic_font", null);
        if (!z9) {
            AbstractC0816i.d(b0.a(this), null, null, new m(null), 3, null);
        }
        Rect rectO = O();
        if (rectO != null) {
            P0(rectO, true);
        }
    }
}
