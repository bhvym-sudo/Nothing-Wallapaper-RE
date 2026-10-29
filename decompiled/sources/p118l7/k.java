package p118l7;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import H3.AbstractC0851a;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.z;
import T7.h;
import android.app.WallpaperColors;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.C;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.bumptech.glide.Glide;
import com.bumptech.glide.MemoryCategory;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.ToolActionsView;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.InterfaceC1458i;
import kotlin.jvm.internal.n;
import p010b.u;
import p074h3.H;
import p079h8.A;
import p079h8.i;
import p079h8.r;
import p084i3.D0;
import p098j7.o;
import p128m7.a;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends AbstractComponentCallbacksC1132q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ImageButton f22978A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TextView f22979B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private TextView f22980C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private TextView f22981D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f22982E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f22983F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f22984G;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private H3.k f22990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.material.bottomsheet.a f22991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f22992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Intent f22993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f22994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private h f22995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ToolActionsView f22996z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f22987q = "CropFragment";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f22988r = 8.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f22989s = 80;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p079h8.h f22985H = i.b(new p219v8.a() { // from class: l7.b
        @Override // p219v8.a
        public final Object invoke() {
            return k.w0(this.f22970q);
        }
    });

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final c f22986I = new c();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22997q;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f22997q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            k kVar = k.this;
            p148o7.b bVarG0 = kVar.G0();
            Context contextRequireContext = k.this.requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            kVar.f22992v = bVarG0.g(contextRequireContext);
            List list = k.this.f22992v;
            if (list != null && !list.isEmpty()) {
                k.this.d1(null);
            }
            return A.f21846a;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22999q;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23001q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k f23002r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, p129m8.e eVar) {
                super(2, eVar);
                this.f23002r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f23002r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23001q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                k kVar = this.f23002r;
                kVar.V0(kVar.f22992v);
                return A.f21846a;
            }
        }

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(k kVar) {
            InterfaceC1163x viewLifecycleOwner = kVar.getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), C0803b0.c(), null, new a(kVar, null), 2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f22999q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            k kVar = k.this;
            p148o7.b bVarG0 = kVar.G0();
            Context contextRequireContext = k.this.requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            kVar.f22992v = bVarG0.g(contextRequireContext);
            List list = k.this.f22992v;
            if (list != null && !list.isEmpty()) {
                final k kVar2 = k.this;
                kVar2.d1(new Runnable() { // from class: l7.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b.u(kVar2);
                    }
                });
            }
            return A.f21846a;
        }
    }

    public static final class c extends u {
        c() {
            super(true);
        }

        @Override // p010b.u
        public void d() {
            k.this.J0();
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23004q;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23006q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f23007r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ k f23008s;

            /* JADX INFO: renamed from: l7.k$d$a$a, reason: collision with other inner class name */
            static final class C0584a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23009q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ k f23010r;

                /* JADX INFO: renamed from: l7.k$d$a$a$a, reason: collision with other inner class name */
                static final class C0585a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f23011q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f23012r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ k f23013s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0585a(k kVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f23013s = kVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0585a c0585a = new C0585a(this.f23013s, eVar);
                        c0585a.f23012r = ((Boolean) obj).booleanValue();
                        return c0585a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f23011q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        boolean z9 = this.f23012r;
                        this.f23013s.b1(z9);
                        this.f23013s.g1(z9);
                        return A.f21846a;
                    }

                    public final Object s(boolean z9, p129m8.e eVar) {
                        return ((C0585a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0584a(k kVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23010r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0584a(this.f23010r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0584a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23009q;
                    if (i10 == 0) {
                        r.b(obj);
                        z zVarN = this.f23010r.G0().n();
                        C0585a c0585a = new C0585a(this.f23010r, null);
                        this.f23009q = 1;
                        if (AbstractC0882h.i(zVarN, c0585a, this) == objE) {
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

            static final class b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23014q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ k f23015r;

                /* JADX INFO: renamed from: l7.k$d$a$b$a, reason: collision with other inner class name */
                static final class C0586a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f23016q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f23017r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ k f23018s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0586a(k kVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f23018s = kVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0586a c0586a = new C0586a(this.f23018s, eVar);
                        c0586a.f23017r = ((Boolean) obj).booleanValue();
                        return c0586a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f23016q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f23018s.n1(this.f23017r);
                        return A.f21846a;
                    }

                    public final Object s(boolean z9, p129m8.e eVar) {
                        return ((C0586a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(k kVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23015r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f23015r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23014q;
                    if (i10 == 0) {
                        r.b(obj);
                        z zVarL = this.f23015r.G0().l();
                        C0586a c0586a = new C0586a(this.f23015r, null);
                        this.f23014q = 1;
                        if (AbstractC0882h.i(zVarL, c0586a, this) == objE) {
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

            static final class c extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23019q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ k f23020r;

                /* JADX INFO: renamed from: l7.k$d$a$c$a, reason: collision with other inner class name */
                static final class C0587a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f23021q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f23022r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ k f23023s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0587a(k kVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f23023s = kVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0587a c0587a = new C0587a(this.f23023s, eVar);
                        c0587a.f23022r = obj;
                        return c0587a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f23021q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        WallpaperColors wallpaperColors = (WallpaperColors) this.f23022r;
                        this.f23023s.a1(G6.h.g(wallpaperColors));
                        this.f23023s.c1(!G6.h.h(wallpaperColors));
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(WallpaperColors wallpaperColors, p129m8.e eVar) {
                        return ((C0587a) create(wallpaperColors, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(k kVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23020r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f23020r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23019q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fK = this.f23020r.G0().k();
                        C0587a c0587a = new C0587a(this.f23020r, null);
                        this.f23019q = 1;
                        if (AbstractC0882h.i(interfaceC0880fK, c0587a, this) == objE) {
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

            /* JADX INFO: renamed from: l7.k$d$a$d, reason: collision with other inner class name */
            static final class C0588d extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23024q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ k f23025r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0588d(k kVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23025r = kVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final A u(k kVar, p128m7.a aVar) {
                    ToolActionsView toolActionsViewC0;
                    if (!n.d(aVar, m7.a.b.f23243a) && (toolActionsViewC0 = kVar.C0()) != null) {
                        toolActionsViewC0.d(ToolActionsView.a.RIGHT);
                    }
                    if (n.d(aVar, p128m7.a.C0594a.f23242a)) {
                        kVar.B0().show();
                    }
                    return A.f21846a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0588d(this.f23025r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0588d) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f23024q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    C cH = this.f23025r.G0().h();
                    InterfaceC1163x viewLifecycleOwner = this.f23025r.getViewLifecycleOwner();
                    final k kVar = this.f23025r;
                    cH.h(viewLifecycleOwner, new e(new p219v8.l() { // from class: l7.m
                        @Override // p219v8.l
                        public final Object f(Object obj2) {
                            return k.d.a.C0588d.u(kVar, (a) obj2);
                        }
                    }));
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, p129m8.e eVar) {
                super(2, eVar);
                this.f23008s = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f23008s, eVar);
                aVar.f23007r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23006q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f23007r;
                AbstractC0816i.d(l9, null, null, new C0584a(this.f23008s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f23008s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f23008s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0588d(this.f23008s, null), 3, null);
                return A.f21846a;
            }
        }

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f23004q;
            if (i10 == 0) {
                r.b(obj);
                k kVar = k.this;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(kVar, null);
                this.f23004q = 1;
                if (N.b(kVar, bVar, aVar, this) == objE) {
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

    static final class e implements I, InterfaceC1458i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final /* synthetic */ p219v8.l f23026q;

        e(p219v8.l function) {
            n.h(function, "function");
            this.f23026q = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC1458i
        public final p079h8.e a() {
            return this.f23026q;
        }

        @Override // androidx.lifecycle.I
        public final /* synthetic */ void b(Object obj) {
            this.f23026q.f(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof I) && (obj instanceof InterfaceC1458i)) {
                return n.d(a(), ((InterfaceC1458i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Toast B0() {
        Object value = this.f22985H.getValue();
        n.g(value, "getValue(...)");
        return (Toast) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(TextView textView) {
        textView.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        com.google.android.material.bottomsheet.a aVar = this.f22991u;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f22991u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(k kVar, View view) {
        ImageButton imageButton = kVar.f22978A;
        kVar.f1(!(imageButton != null ? imageButton.isSelected() : false));
    }

    private final void S0() {
        if (this.f22994x == null || this.f22992v == null) {
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), C0803b0.b(), null, new a(null), 2, null);
        }
    }

    private final void T0() {
        List list;
        if (this.f22994x == null || (list = this.f22992v) == null) {
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), C0803b0.b(), null, new b(null), 2, null);
        } else {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            V0(this.f22992v);
        }
    }

    private final void U0(View view) {
        G0().q(this.f22993w, this.f22994x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(List list) {
        h hVar;
        if (M0() || list == null || (hVar = this.f22995y) == null) {
            return;
        }
        hVar.e(list, this.f22994x, G0().u(), G0().t(this.f22993w, this.f22994x), requireContext().getDrawable(R.drawable.ic_file_download_gm2_24px), new View.OnClickListener() { // from class: l7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.W0(this.f22977q, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(k kVar, View button) {
        n.h(button, "button");
        kVar.U0(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets Z0(View v9, WindowInsets windowInsets) {
        n.h(v9, "v");
        n.h(windowInsets, "windowInsets");
        v9.setPadding(v9.getPaddingLeft(), 0, v9.getPaddingRight(), 0);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(boolean z9) {
        if (z9) {
            TextView textView = this.f22980C;
            if (textView != null) {
                textView.setTextColor(requireContext().getColor(R.color.crop_page_text_color_dark));
            }
            TextView textView2 = this.f22981D;
            if (textView2 != null) {
                textView2.setTextColor(requireContext().getColor(R.color.crop_page_text_color_dark));
            }
            TextView textView3 = this.f22979B;
            if (textView3 != null) {
                textView3.setTextColor(requireContext().getColor(R.color.crop_page_text_second_color_dark));
                return;
            }
            return;
        }
        TextView textView4 = this.f22980C;
        if (textView4 != null) {
            textView4.setTextColor(requireContext().getColor(R.color.crop_page_text_color_light));
        }
        TextView textView5 = this.f22981D;
        if (textView5 != null) {
            textView5.setTextColor(requireContext().getColor(R.color.crop_page_text_color_light));
        }
        TextView textView6 = this.f22979B;
        if (textView6 != null) {
            textView6.setTextColor(requireContext().getColor(R.color.crop_page_text_second_color_light));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(final Runnable runnable) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        G0().o(context, new D0.a() { // from class: l7.a
            @Override // i3.D0.a
            public final void a(CharSequence charSequence, Intent intent) {
                k.e1(this.f22968a, runnable, charSequence, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(k kVar, Runnable runnable, CharSequence charSequence, Intent intent) {
        kVar.f22994x = charSequence;
        kVar.f22993w = intent;
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void f1(boolean z9) {
        G0().s(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1(boolean z9) {
        int i10 = (!z9 || this.f22982E) ? 4 : 0;
        ImageButton imageButton = this.f22978A;
        if (imageButton != null) {
            imageButton.setVisibility(i10);
        }
        TextView textView = this.f22979B;
        if (textView != null) {
            textView.setVisibility(i10);
        }
        TextView textView2 = this.f22980C;
        if (textView2 != null) {
            textView2.setVisibility(i10);
        }
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.crop_tip_margin_bottom);
        TextView textView3 = this.f22981D;
        ViewGroup.LayoutParams layoutParams = textView3 != null ? textView3.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (z9) {
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = dimensionPixelSize;
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = dimensionPixelSize / 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(k kVar, View view) {
        com.google.android.material.bottomsheet.a aVar = kVar.f22991u;
        if (aVar != null && aVar.isShowing()) {
            kVar.J0();
            return;
        }
        AbstractActivityC1136v activity = kVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(k kVar, View view) {
        com.google.android.material.bottomsheet.a aVar = kVar.f22991u;
        if (aVar == null || !aVar.isShowing()) {
            kVar.l1();
        } else {
            kVar.J0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(k kVar, View view) {
        if (n.d(kVar.G0().h().e(), p128m7.a.C0594a.f23242a)) {
            kVar.B0().show();
            return;
        }
        LayoutInflater.Factory factoryRequireActivity = kVar.requireActivity();
        n.f(factoryRequireActivity, "null cannot be cast to non-null type com.nothing.wallpaper.picker.edit.container.WallpaperEditNavigator");
        ((o) factoryRequireActivity).E();
    }

    private final void l1() {
        com.google.android.material.bottomsheet.a aVar = this.f22991u;
        if (aVar == null || !aVar.isShowing()) {
            this.f22991u = new com.google.android.material.bottomsheet.a(requireContext(), R.style.BottomSheetDialog);
            Context contextRequireContext = requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            h hVar = new h(contextRequireContext);
            this.f22995y = hVar;
            T0();
            com.google.android.material.bottomsheet.a aVar2 = this.f22991u;
            if (aVar2 != null) {
                aVar2.f().i(this.f22986I);
                aVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l7.i
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        k.m1(this.f22976q, dialogInterface);
                    }
                });
                aVar2.setCanceledOnTouchOutside(true);
                aVar2.setContentView(hVar);
                aVar2.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(k kVar, DialogInterface dialogInterface) {
        kVar.f22986I.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(boolean z9) {
        ImageButton imageButton = this.f22978A;
        if (imageButton != null) {
            imageButton.setEnabled(true);
        }
        ImageButton imageButton2 = this.f22978A;
        if (imageButton2 != null) {
            imageButton2.setSelected(z9);
        }
        ImageButton imageButton3 = this.f22978A;
        if (imageButton3 != null) {
            imageButton3.setImageTintList(z9 ? requireContext().getColorStateList(R.color.top_action_button_icon_color_dark) : requireContext().getColorStateList(R.color.top_action_button_icon_color_light));
        }
        TextView textView = this.f22979B;
        if (textView != null) {
            textView.setText(z9 ? requireContext().getString(R.string.on) : requireContext().getString(R.string.off));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Toast w0(k kVar) {
        return Toast.makeText(kVar.requireContext(), R.string.nt_image_corrupt, 0);
    }

    protected final H3.k A0() {
        return this.f22990t;
    }

    protected final ToolActionsView C0() {
        return this.f22996z;
    }

    protected final TextView D0() {
        return this.f22981D;
    }

    protected final TextView E0() {
        return this.f22979B;
    }

    protected final TextView F0() {
        return this.f22980C;
    }

    protected abstract p148o7.b G0();

    protected final void H0() {
        final TextView textView = this.f22981D;
        if (textView != null) {
            textView.animate().alpha(0.0f).setDuration(250L).withEndAction(new Runnable() { // from class: l7.d
                @Override // java.lang.Runnable
                public final void run() {
                    k.I0(textView);
                }
            });
        }
    }

    protected void K0(View view) {
        n.h(view, "view");
        ToolActionsView toolActionsView = (ToolActionsView) view.findViewById(R.id.tool_actions_view);
        this.f22996z = toolActionsView;
        n.e(toolActionsView);
        h1(toolActionsView);
        this.f22981D = (TextView) view.findViewById(R.id.tv_crop_tip);
        this.f22978A = (ImageButton) view.findViewById(R.id.btn_scrollable_switch);
        this.f22979B = (TextView) view.findViewById(R.id.tv_scrollable_switch_state);
        this.f22980C = (TextView) view.findViewById(R.id.tv_scrollable_title);
        ImageButton imageButton = this.f22978A;
        if (imageButton != null) {
            imageButton.setEnabled(false);
        }
        ImageButton imageButton2 = this.f22978A;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: l7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    k.L0(this.f22972q, view2);
                }
            });
        }
    }

    protected final boolean M0() {
        AbstractActivityC1136v activity = getActivity();
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    protected final boolean N0() {
        return this.f22984G;
    }

    protected final boolean O0() {
        return this.f22982E;
    }

    protected final boolean P0() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    protected final boolean Q0() {
        return this.f22983F;
    }

    protected final boolean R0() {
        return !AbstractC0851a.j(getContext());
    }

    protected final void X0(boolean z9) {
        this.f22982E = z9;
    }

    protected final void Y0() {
        requireActivity().getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l7.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return k.Z0(view, windowInsets);
            }
        });
    }

    public final void a1(boolean z9) {
        if (z9) {
            WindowInsetsController windowInsetsController = requireActivity().getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsAppearance(0, 8);
                return;
            }
            return;
        }
        WindowInsetsController windowInsetsController2 = requireActivity().getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController2 != null) {
            windowInsetsController2.setSystemBarsAppearance(8, 8);
        }
    }

    protected final void b1(boolean z9) {
        this.f22983F = z9;
    }

    protected void h1(ToolActionsView actionBar) {
        n.h(actionBar, "actionBar");
        if (R0()) {
            actionBar.i(ToolActionsView.a.LEFT, ToolActionsView.a.MIDDLE, ToolActionsView.a.RIGHT);
        } else {
            actionBar.i(ToolActionsView.a.MIDDLE, ToolActionsView.a.RIGHT);
        }
        actionBar.f(ToolActionsView.a.LEFT, new View.OnClickListener() { // from class: l7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.i1(this.f22973q, view);
            }
        });
        actionBar.f(ToolActionsView.a.MIDDLE, new View.OnClickListener() { // from class: l7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.j1(this.f22974q, view);
            }
        });
        actionBar.f(ToolActionsView.a.RIGHT, new View.OnClickListener() { // from class: l7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.k1(this.f22975q, view);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22984G = requireArguments().getBoolean("is_asset_id_present", false);
        H hA = p074h3.I.a();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        this.f22990t = hA.e(abstractActivityC1136vRequireActivity);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        this.f22995y = null;
        this.f22996z = null;
        this.f22978A = null;
        this.f22979B = null;
        this.f22980C = null;
        this.f22981D = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onResume() {
        super.onResume();
        H hA = p074h3.I.a();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        hA.f(abstractActivityC1136vRequireActivity).j(new Date().getTime());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        Glide.get(requireActivity()).setMemoryCategory(MemoryCategory.LOW);
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new d(null), 3, null);
        S0();
    }

    protected final long x0() {
        return this.f22989s;
    }

    protected final ImageButton y0() {
        return this.f22978A;
    }

    protected final float z0() {
        return this.f22988r;
    }
}
