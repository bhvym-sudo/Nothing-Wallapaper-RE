package p173r2;

import F8.AbstractC0816i;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import I8.Q;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p064g3.x;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.s;

/* JADX INFO: loaded from: classes.dex */
public class c extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p113l2.a f25619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p194t3.a f25620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1363c f25621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f25622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p234x3.d f25623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A f25624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O f25625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0880f f25626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC0880f f25627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC0880f f25628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0880f f25629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final A f25630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0880f f25631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final A f25632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final O f25633p;

    public static final class a implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f25634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p113l2.a f25635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p194t3.a f25636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC1363c f25637e;

        public a(Context context, p113l2.a quickAffordanceInteractor, p194t3.a wallpaperInteractor, InterfaceC1363c wallpaperInfoFactory) {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(quickAffordanceInteractor, "quickAffordanceInteractor");
            kotlin.jvm.internal.n.h(wallpaperInteractor, "wallpaperInteractor");
            kotlin.jvm.internal.n.h(wallpaperInfoFactory, "wallpaperInfoFactory");
            this.f25634b = context;
            this.f25635c = quickAffordanceInteractor;
            this.f25636d = wallpaperInteractor;
            this.f25637e = wallpaperInfoFactory;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            return new c(this.f25634b, this.f25635c, this.f25636d, this.f25637e);
        }
    }

    public static final class b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25638q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25639q;

            /* JADX INFO: renamed from: r2.c$b$a$a, reason: collision with other inner class name */
            public static final class C0650a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25640q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25641r;

                public C0650a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25640q = obj;
                    this.f25641r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f25639q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0650a c0650a;
                if (eVar instanceof C0650a) {
                    c0650a = (C0650a) eVar;
                    int i10 = c0650a.f25641r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0650a.f25641r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0650a = new C0650a(eVar);
                    }
                } else {
                    c0650a = new C0650a(eVar);
                }
                Object obj2 = c0650a.f25640q;
                Object objE = p139n8.b.e();
                int i11 = c0650a.f25641r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f25639q;
                    String str = ((String) obj) + "::none";
                    c0650a.f25641r = 1;
                    if (interfaceC0881g.b(str, c0650a) == objE) {
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

        public b(InterfaceC0880f interfaceC0880f) {
            this.f25638q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25638q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: r2.c$c, reason: collision with other inner class name */
    static final class C0651c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25643q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25644r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25645s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f25647u;

        C0651c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25645s = obj;
            this.f25647u |= Integer.MIN_VALUE;
            return c.this.B(null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25648q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25649r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f25650s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f25651t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Context f25653v;

        static final class a implements InterfaceC1363c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f25654a;

            a(InterfaceC0822l interfaceC0822l) {
                this.f25654a = interfaceC0822l;
            }

            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                InterfaceC0822l interfaceC0822l = this.f25654a;
                if (xVar2 != null) {
                    xVar = xVar2;
                }
                interfaceC0822l.k(xVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, p129m8.e eVar) {
            super(2, eVar);
            this.f25653v = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            d dVar = c.this.new d(this.f25653v, eVar);
            dVar.f25651t = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f25650s;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            boolean z9 = this.f25651t;
            c cVar = c.this;
            Context context = this.f25653v;
            this.f25648q = cVar;
            this.f25649r = context;
            this.f25651t = z9;
            this.f25650s = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            cVar.f25621d.a(context, z9, new a(c0826n));
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((d) create(Boolean.valueOf(z9), eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25655q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f25656r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25657s;

        static final class a implements p219v8.a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c f25659q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f25660r;

            /* JADX INFO: renamed from: r2.c$e$a$a, reason: collision with other inner class name */
            static final class C0652a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25661q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ c f25662r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ String f25663s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0652a(c cVar, String str, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25662r = cVar;
                    this.f25663s = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0652a(this.f25662r, this.f25663s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0652a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f25661q;
                    if (i10 == 0) {
                        r.b(obj);
                        p113l2.a aVar = this.f25662r.f25619b;
                        String str = this.f25663s;
                        this.f25661q = 1;
                        if (aVar.g(str, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return p079h8.A.f21846a;
                }
            }

            a(c cVar, String str) {
                this.f25659q = cVar;
                this.f25660r = str;
            }

            public final void a() {
                AbstractC0816i.d(b0.a(this.f25659q), null, null, new C0652a(this.f25659q, this.f25660r, null), 3, null);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        e(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s(((Boolean) obj).booleanValue(), (String) obj2, (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25655q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            boolean z9 = this.f25656r;
            String str = (String) this.f25657s;
            if (z9) {
                return null;
            }
            return new a(c.this, str);
        }

        public final Object s(boolean z9, String str, p129m8.e eVar) {
            e eVar2 = c.this.new e(eVar);
            eVar2.f25656r = z9;
            eVar2.f25657s = str;
            return eVar2.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25664q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f25665r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25666s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p123m2.a f25668u;

        static final class a implements p219v8.a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c f25669q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f25670r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p123m2.a f25671s;

            /* JADX INFO: renamed from: r2.c$f$a$a, reason: collision with other inner class name */
            static final class C0653a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25672q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ c f25673r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ String f25674s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ p123m2.a f25675t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0653a(c cVar, String str, p123m2.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25673r = cVar;
                    this.f25674s = str;
                    this.f25675t = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0653a(this.f25673r, this.f25674s, this.f25675t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0653a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f25672q;
                    if (i10 == 0) {
                        r.b(obj);
                        p113l2.a aVar = this.f25673r.f25619b;
                        String str = this.f25674s;
                        String strF = this.f25675t.f();
                        this.f25672q = 1;
                        if (aVar.e(str, strF, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return p079h8.A.f21846a;
                }
            }

            a(c cVar, String str, p123m2.a aVar) {
                this.f25669q = cVar;
                this.f25670r = str;
                this.f25671s = aVar;
            }

            public final void a() {
                AbstractC0816i.d(b0.a(this.f25669q), null, null, new C0653a(this.f25669q, this.f25670r, this.f25671s, null), 3, null);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p123m2.a aVar, p129m8.e eVar) {
            super(3, eVar);
            this.f25668u = aVar;
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s(((Boolean) obj).booleanValue(), (String) obj2, (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25664q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            boolean z9 = this.f25665r;
            String str = (String) this.f25666s;
            if (z9) {
                return null;
            }
            return new a(c.this, str, this.f25668u);
        }

        public final Object s(boolean z9, String str, p129m8.e eVar) {
            f fVar = c.this.new f(this.f25668u, eVar);
            fVar.f25665r = z9;
            fVar.f25666s = str;
            return fVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class g implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Drawable f25677r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p123m2.a f25678s;

        g(Drawable drawable, p123m2.a aVar) {
            this.f25677r = drawable;
            this.f25678s = aVar;
        }

        public final void a() {
            c.this.G(this.f25677r, this.f25678s.g(), this.f25678s.d(), this.f25678s.c(), this.f25678s.b());
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class h implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p123m2.a f25680r;

        h(p123m2.a aVar) {
            this.f25680r = aVar;
        }

        public final void a() {
            c.this.F(this.f25680r.a());
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class i implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25681q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25682q;

            /* JADX INFO: renamed from: r2.c$i$a$a, reason: collision with other inner class name */
            public static final class C0654a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25683q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25684r;

                public C0654a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25683q = obj;
                    this.f25684r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f25682q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0654a c0654a;
                if (eVar instanceof C0654a) {
                    c0654a = (C0654a) eVar;
                    int i10 = c0654a.f25684r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0654a.f25684r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0654a = new C0654a(eVar);
                    }
                } else {
                    c0654a = new C0654a(eVar);
                }
                Object obj2 = c0654a.f25683q;
                Object objE = p139n8.b.e();
                int i11 = c0654a.f25684r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f25682q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Set) obj).isEmpty());
                    c0654a.f25684r = 1;
                    if (interfaceC0881g.b(boolA, c0654a) == objE) {
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

        public i(InterfaceC0880f interfaceC0880f) {
            this.f25681q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25681q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class j implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25686q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p123m2.a f25687r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25688q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p123m2.a f25689r;

            /* JADX INFO: renamed from: r2.c$j$a$a, reason: collision with other inner class name */
            public static final class C0655a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25690q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25691r;

                public C0655a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25690q = obj;
                    this.f25691r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, p123m2.a aVar) {
                this.f25688q = interfaceC0881g;
                this.f25689r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0655a c0655a;
                if (eVar instanceof C0655a) {
                    c0655a = (C0655a) eVar;
                    int i10 = c0655a.f25691r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0655a.f25691r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0655a = new C0655a(eVar);
                    }
                } else {
                    c0655a = new C0655a(eVar);
                }
                Object obj2 = c0655a.f25690q;
                Object objE = p139n8.b.e();
                int i11 = c0655a.f25691r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f25688q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Set) obj).contains(this.f25689r.f()));
                    c0655a.f25691r = 1;
                    if (interfaceC0881g.b(boolA, c0655a) == objE) {
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

        public j(InterfaceC0880f interfaceC0880f, p123m2.a aVar) {
            this.f25686q = interfaceC0880f;
            this.f25687r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25686q.a(new a(interfaceC0881g, this.f25687r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class k implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25693q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p123m2.a f25694r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25695q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p123m2.a f25696r;

            /* JADX INFO: renamed from: r2.c$k$a$a, reason: collision with other inner class name */
            public static final class C0656a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25697q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25698r;

                public C0656a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25697q = obj;
                    this.f25698r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, p123m2.a aVar) {
                this.f25695q = interfaceC0881g;
                this.f25696r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0656a c0656a;
                if (eVar instanceof C0656a) {
                    c0656a = (C0656a) eVar;
                    int i10 = c0656a.f25698r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0656a.f25698r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0656a = new C0656a(eVar);
                    }
                } else {
                    c0656a = new C0656a(eVar);
                }
                Object obj2 = c0656a.f25697q;
                Object objE = p139n8.b.e();
                int i11 = c0656a.f25698r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f25695q;
                    String str = ((String) obj) + "::" + this.f25696r.f();
                    c0656a.f25698r = 1;
                    if (interfaceC0881g.b(str, c0656a) == objE) {
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

        public k(InterfaceC0880f interfaceC0880f, p123m2.a aVar) {
            this.f25693q = interfaceC0880f;
            this.f25694r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25693q.a(new a(interfaceC0881g, this.f25694r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25700q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f25701r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25702s;

        l(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25700q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            List list = (List) this.f25701r;
            String str = (String) this.f25702s;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (kotlin.jvm.internal.n.d(((p123m2.b) obj2).b(), str)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p123m2.b) it.next()).a());
            }
            return AbstractC1444s.w0(arrayList2);
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(List list, String str, p129m8.e eVar) {
            l lVar = new l(eVar);
            lVar.f25701r = list;
            lVar.f25702s = str;
            return lVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25703q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f25704r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25705s;

        m(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25703q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            List<p123m2.c> list = (List) this.f25704r;
            String str = (String) this.f25705s;
            if (str == null) {
                return (p123m2.c) list.get(0);
            }
            for (p123m2.c cVar : list) {
                if (kotlin.jvm.internal.n.d(cVar.a(), str)) {
                    return cVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(List list, String str, p129m8.e eVar) {
            m mVar = new m(eVar);
            mVar.f25704r = list;
            mVar.f25705s = str;
            return mVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements s {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        Object f25706A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f25707B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f25708C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f25709D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f25710E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ Object f25711F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ Object f25712G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f25713H;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25715q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25716r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f25717s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f25718t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f25719u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f25720v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f25721w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f25722x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f25723y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        Object f25724z;

        n(p129m8.e eVar) {
            super(5, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A v(c cVar, p123m2.c cVar2) {
            cVar.f25624g.h(cVar2.a());
            return p079h8.A.f21846a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:14:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:20:0x00fb A[LOOP:1: B:18:0x00f5->B:20:0x00fb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:24:0x011f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0169  */
        /* JADX WARN: Code duplicated, block: B:32:0x01d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:35:0x0248  */
        /* JADX WARN: Code duplicated, block: B:37:0x0259  */
        /* JADX WARN: Code duplicated, block: B:38:0x025c  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x0130 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x0119 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0134 -> B:28:0x0163). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01d8 -> B:34:0x01ea). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 647
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.c.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.s
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object n(List list, List list2, List list3, String str, p129m8.e eVar) {
            n nVar = c.this.new n(eVar);
            nVar.f25710E = list;
            nVar.f25711F = list2;
            nVar.f25712G = list3;
            nVar.f25713H = str;
            return nVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class o implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25725q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25726q;

            /* JADX INFO: renamed from: r2.c$o$a$a, reason: collision with other inner class name */
            public static final class C0657a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25727q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25728r;

                public C0657a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25727q = obj;
                    this.f25728r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f25726q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0657a c0657a;
                if (eVar instanceof C0657a) {
                    c0657a = (C0657a) eVar;
                    int i10 = c0657a.f25728r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0657a.f25728r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0657a = new C0657a(eVar);
                    }
                } else {
                    c0657a = new C0657a(eVar);
                }
                Object obj2 = c0657a.f25727q;
                Object objE = p139n8.b.e();
                int i11 = c0657a.f25728r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f25726q;
                    String strA = ((p123m2.c) obj).a();
                    c0657a.f25728r = 1;
                    if (interfaceC0881g.b(strA, c0657a) == objE) {
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

        public o(InterfaceC0880f interfaceC0880f) {
            this.f25725q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25725q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class p implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25730q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f25731r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25732q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ c f25733r;

            /* JADX INFO: renamed from: r2.c$p$a$a, reason: collision with other inner class name */
            public static final class C0658a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                Object f25734A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                Object f25735B;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25736q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25737r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f25738s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f25740u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f25741v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                Object f25742w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                Object f25743x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                Object f25744y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                Object f25745z;

                public C0658a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25736q = obj;
                    this.f25737r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, c cVar) {
                this.f25732q = interfaceC0881g;
                this.f25733r = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x012d  */
            /* JADX WARN: Code duplicated, block: B:29:0x0155  */
            /* JADX WARN: Code duplicated, block: B:32:0x017f  */
            /* JADX WARN: Code duplicated, block: B:36:0x01ae  */
            /* JADX WARN: Code duplicated, block: B:50:0x0251  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x01e5, code lost:
            
                if (r1 == r3) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0272, code lost:
            
                if (r9.b(r0, r2) == r3) goto L52;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01e5 -> B:40:0x01e9). Please report as a decompilation issue!!! */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r26, p129m8.e r27) {
                /*
                    Method dump skipped, instruction units count: 650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: r2.c.p.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public p(InterfaceC0880f interfaceC0880f, c cVar) {
            this.f25730q = interfaceC0880f;
            this.f25731r = cVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25730q.a(new a(interfaceC0881g, this.f25731r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class q implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f25746q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f25747r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f25748s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f25749q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ c f25750r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Context f25751s;

            /* JADX INFO: renamed from: r2.c$q$a$a, reason: collision with other inner class name */
            public static final class C0659a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f25752q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f25753r;

                public C0659a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f25752q = obj;
                    this.f25753r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, c cVar, Context context) {
                this.f25749q = interfaceC0881g;
                this.f25750r = cVar;
                this.f25751s = context;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0659a c0659a;
                List listC;
                B3.a aVar;
                List listC2;
                B3.a aVar2;
                if (eVar instanceof C0659a) {
                    c0659a = (C0659a) eVar;
                    int i10 = c0659a.f25753r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0659a.f25753r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0659a = new C0659a(eVar);
                    }
                } else {
                    c0659a = new C0659a(eVar);
                }
                Object obj2 = c0659a.f25752q;
                Object objE = p139n8.b.e();
                int i11 = c0659a.f25753r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f25749q;
                    Map map = (Map) obj;
                    p173r2.e eVar2 = (p173r2.e) map.get("bottom_end");
                    p144o3.a aVar3 = (eVar2 == null || (listC2 = eVar2.c()) == null || (aVar2 = (B3.a) AbstractC1444s.U(listC2)) == null) ? null : (p144o3.a) aVar2.d();
                    p173r2.e eVar3 = (p173r2.e) map.get("bottom_start");
                    p144o3.a bVar = (eVar3 == null || (listC = eVar3.c()) == null || (aVar = (B3.a) AbstractC1444s.U(listC)) == null) ? null : (p144o3.a) aVar.d();
                    p164q3.a aVarI = this.f25750r.I(this.f25751s, map);
                    if (bVar == null) {
                        bVar = aVar3 == null ? new o3.a.b(R.drawable.link_off, null) : null;
                    }
                    p173r2.f fVar = new p173r2.f(aVarI, bVar, aVar3);
                    c0659a.f25753r = 1;
                    if (interfaceC0881g.b(fVar, c0659a) == objE) {
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

        public q(InterfaceC0880f interfaceC0880f, c cVar, Context context) {
            this.f25746q = interfaceC0880f;
            this.f25747r = cVar;
            this.f25748s = context;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f25746q.a(new a(interfaceC0881g, this.f25747r, this.f25748s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    protected c(Context context, p113l2.a quickAffordanceInteractor, p194t3.a wallpaperInteractor, InterfaceC1363c wallpaperInfoFactory) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(quickAffordanceInteractor, "quickAffordanceInteractor");
        kotlin.jvm.internal.n.h(wallpaperInteractor, "wallpaperInteractor");
        kotlin.jvm.internal.n.h(wallpaperInfoFactory, "wallpaperInfoFactory");
        this.f25619b = quickAffordanceInteractor;
        this.f25620c = wallpaperInteractor;
        this.f25621d = wallpaperInfoFactory;
        Context applicationContext = context.getApplicationContext();
        this.f25622e = applicationContext;
        kotlin.jvm.internal.n.g(applicationContext, "applicationContext");
        p219v8.l lVar = null;
        this.f25623f = new p234x3.d(new H3.q(applicationContext, null, applicationContext.getString(R.string.lock_screen_preview_provider_authority), 2, null), new p219v8.a() { // from class: r2.a
            @Override // p219v8.a
            public final Object invoke() {
                return c.E(this.f25616q);
            }
        }, new d(context, null), lVar, wallpaperInteractor, InterfaceC1364d.a.LOCK_SCREEN, 8, null);
        A a10 = Q.a(null);
        this.f25624g = a10;
        o oVar = new o(AbstractC0882h.l(quickAffordanceInteractor.d(), a10, new m(null)));
        L lA = b0.a(this);
        K.a aVar = K.f3174a;
        O oK = AbstractC0882h.K(oVar, lA, K.a.b(aVar, 0L, 0L, 3, null), "");
        this.f25625h = oK;
        InterfaceC0880f interfaceC0880fJ = AbstractC0882h.j(quickAffordanceInteractor.d(), quickAffordanceInteractor.b(), quickAffordanceInteractor.c(), oK, new n(null));
        this.f25626i = interfaceC0880fJ;
        this.f25627j = AbstractC0882h.J(AbstractC0882h.l(quickAffordanceInteractor.c(), oK, new l(null)), b0.a(this), K.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f25628k = new p(quickAffordanceInteractor.b(), this);
        this.f25629l = new q(interfaceC0880fJ, this, context);
        A a11 = Q.a(null);
        this.f25630m = a11;
        this.f25631n = AbstractC0882h.b(a11);
        A a12 = Q.a(null);
        this.f25632o = a12;
        this.f25633p = AbstractC0882h.b(a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object B(O o9, O o10, InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
        C0651c c0651c;
        O o11;
        InterfaceC0880f interfaceC0880f2;
        if (eVar instanceof C0651c) {
            c0651c = (C0651c) eVar;
            int i10 = c0651c.f25647u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0651c.f25647u = i10 - Integer.MIN_VALUE;
            } else {
                c0651c = new C0651c(eVar);
            }
        } else {
            c0651c = new C0651c(eVar);
        }
        Object objL = c0651c.f25645s;
        Object objE = p139n8.b.e();
        int i11 = c0651c.f25647u;
        if (i11 == 0) {
            r.b(objL);
            b bVar = new b(o9);
            L lA = b0.a(this);
            c0651c.f25643q = o10;
            c0651c.f25644r = interfaceC0880f;
            c0651c.f25647u = 1;
            objL = AbstractC0882h.L(bVar, lA, c0651c);
            if (objL == objE) {
                return objE;
            }
            o11 = o10;
            interfaceC0880f2 = interfaceC0880f;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC0880f interfaceC0880f3 = (InterfaceC0880f) c0651c.f25644r;
            O o12 = (O) c0651c.f25643q;
            r.b(objL);
            interfaceC0880f2 = interfaceC0880f3;
            o11 = o12;
        }
        return new B3.a((O) objL, new o3.a.b(R.drawable.link_off, null), new q3.a.c(R.string.keyguard_affordance_none), false, o11, true, interfaceC0880f2, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle E(c cVar) {
        Bundle bundle = new Bundle();
        bundle.putString("initially_selected_slot_id", (String) cVar.f25625h.getValue());
        bundle.putBoolean("highlight_quick_affordances", true);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Intent intent) {
        this.f25632o.setValue(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Drawable drawable, String str, String str2, String str3, final Intent intent) {
        A a10 = this.f25630m;
        p144o3.a.C0618a c0618a = new p144o3.a.C0618a(drawable, null);
        q3.a.c cVar = new q3.a.c(R.string.keyguard_affordance_enablement_dialog_headline);
        q3.a.b bVar = new q3.a.b(str2);
        List listC = AbstractC1444s.c();
        listC.add(new p104k3.b(new q3.a.c(str3 != null ? R.string.cancel : R.string.keyguard_affordance_enablement_dialog_dismiss_button), k3.a.b.f22710b, null, 4, null));
        if (str3 != null) {
            listC.add(new p104k3.b(new q3.a.b(str3), p104k3.a.C0577a.f22709b, new p219v8.a() { // from class: r2.b
                @Override // p219v8.a
                public final Object invoke() {
                    return c.H(intent, this);
                }
            }));
        }
        p079h8.A a11 = p079h8.A.f21846a;
        a10.setValue(new p124m3.a(c0618a, cVar, null, bVar, AbstractC1444s.a(listC), null, 36, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A H(Intent intent, c cVar) {
        if (intent != null) {
            cVar.F(intent);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p164q3.a I(Context context, Map map) {
        List listC;
        B3.a aVar;
        List listC2;
        B3.a aVar2;
        p173r2.e eVar = (p173r2.e) map.get("bottom_start");
        p164q3.a aVarE = null;
        p164q3.a aVarE2 = (eVar == null || (listC2 = eVar.c()) == null || (aVar2 = (B3.a) AbstractC1444s.U(listC2)) == null) ? null : aVar2.e();
        p173r2.e eVar2 = (p173r2.e) map.get("bottom_end");
        if (eVar2 != null && (listC = eVar2.c()) != null && (aVar = (B3.a) AbstractC1444s.U(listC)) != null) {
            aVarE = aVar.e();
        }
        if (aVarE2 == null || aVarE == null) {
            if (aVarE2 == null) {
                return aVarE == null ? new q3.a.c(R.string.keyguard_quick_affordance_none_selected) : aVarE;
            }
            return aVarE2;
        }
        String string = context.getString(R.string.keyguard_quick_affordance_two_selected_template, aVarE2.a(context), aVarE.a(context));
        kotlin.jvm.internal.n.g(string, "getString(...)");
        return new q3.a.b(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(int i10, p129m8.e eVar) {
        return this.f25619b.a(i10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String x(String str) {
        int i10;
        Context context = this.f25622e;
        if (kotlin.jvm.internal.n.d(str, "bottom_start")) {
            i10 = R.string.keyguard_slot_name_bottom_start;
        } else {
            if (!kotlin.jvm.internal.n.d(str, "bottom_end")) {
                throw new IllegalStateException(("No accessibility label for slot with ID \"" + str + "\"!").toString());
            }
            i10 = R.string.keyguard_slot_name_bottom_end;
        }
        String string = context.getString(i10);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String y(String str) {
        int i10;
        Context context = this.f25622e;
        if (kotlin.jvm.internal.n.d(str, "bottom_start")) {
            i10 = R.string.keyguard_slot_name_bottom_start;
        } else {
            if (!kotlin.jvm.internal.n.d(str, "bottom_end")) {
                throw new IllegalStateException(("No name for slot with ID of \"" + str + "\"!").toString());
            }
            i10 = R.string.keyguard_slot_name_bottom_end;
        }
        String string = context.getString(i10);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        return string;
    }

    public final InterfaceC0880f A() {
        return this.f25629l;
    }

    public final void C() {
        this.f25632o.setValue(null);
    }

    public final void D() {
        this.f25630m.setValue(null);
    }

    public final O r() {
        return this.f25633p;
    }

    public final InterfaceC0880f t() {
        return this.f25631n;
    }

    public final p234x3.d u() {
        return this.f25623f;
    }

    public final InterfaceC0880f v() {
        return this.f25628k;
    }

    public final O w() {
        return this.f25625h;
    }

    public final InterfaceC0880f z() {
        return this.f25626i;
    }
}
