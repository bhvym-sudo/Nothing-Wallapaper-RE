package P6;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0826n;
import F8.H0;
import F8.InterfaceC0822l;
import F8.L;
import H3.k;
import H3.q;
import android.app.Activity;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p044e3.l0;
import p044e3.n0;
import p064g3.v;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f6028t = new b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final ArrayList f6029u = AbstractC1444s.h(0, 1, 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Activity f6030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1163x f6031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Integer[] f6032s;

    /* JADX INFO: renamed from: P6.a$a, reason: collision with other inner class name */
    public class C0204a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a f6033q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0204a(a aVar, View view) {
            super(view);
            n.h(view, "view");
            this.f6033q = aVar;
        }

        public abstract void d(Integer num, int i10);
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public final class c extends C0204a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final l0 f6034r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f6035s;

        /* JADX INFO: renamed from: P6.a$c$a, reason: collision with other inner class name */
        static final class C0205a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f6036q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f6037r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f6038s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f6039t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f6040u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            /* synthetic */ boolean f6041v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ InterfaceC1363c f6042w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ a f6043x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ v f6044y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ WallpaperManager f6045z;

            /* JADX INFO: renamed from: P6.a$c$a$a, reason: collision with other inner class name */
            static final class C0206a implements InterfaceC1363c.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f6046a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC0822l f6047b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ v f6048c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ WallpaperManager f6049d;

                /* JADX INFO: renamed from: P6.a$c$a$a$a, reason: collision with other inner class name */
                static final class C0207a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f6050q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ v f6051r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ a f6052s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ WallpaperManager f6053t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0207a(v vVar, a aVar, WallpaperManager wallpaperManager, p129m8.e eVar) {
                        super(2, eVar);
                        this.f6051r = vVar;
                        this.f6052s = aVar;
                        this.f6053t = wallpaperManager;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        return new C0207a(this.f6051r, this.f6052s, this.f6053t, eVar);
                    }

                    @Override // p219v8.p
                    public final Object invoke(L l9, p129m8.e eVar) {
                        return ((C0207a) create(l9, eVar)).invokeSuspend(A.f21846a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
                    
                        if (r7.f(r1, r3, r4, r6) == r0) goto L19;
                     */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = p139n8.b.e()
                            int r1 = r6.f6050q
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L1e
                            if (r1 == r3) goto L1a
                            if (r1 != r2) goto L12
                            p079h8.r.b(r7)
                            goto L65
                        L12:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L1a:
                            p079h8.r.b(r7)
                            goto L43
                        L1e:
                            p079h8.r.b(r7)
                            g3.v r7 = r6.f6051r
                            I8.O r7 = r7.e()
                            java.lang.Object r7 = r7.getValue()
                            boolean r7 = r7 instanceof g3.s.b
                            if (r7 == 0) goto L43
                            P6.a r7 = r6.f6052s
                            android.app.WallpaperManager r1 = r6.f6053t
                            kotlin.jvm.internal.n.e(r1)
                            g3.v r4 = r6.f6051r
                            h3.d$a r5 = p074h3.InterfaceC1364d.a.HOME_SCREEN
                            r6.f6050q = r3
                            java.lang.Object r7 = r7.f(r1, r4, r5, r6)
                            if (r7 != r0) goto L43
                            goto L64
                        L43:
                            g3.v r7 = r6.f6051r
                            I8.O r7 = r7.f()
                            java.lang.Object r7 = r7.getValue()
                            boolean r7 = r7 instanceof g3.s.b
                            if (r7 == 0) goto L65
                            P6.a r7 = r6.f6052s
                            android.app.WallpaperManager r1 = r6.f6053t
                            kotlin.jvm.internal.n.e(r1)
                            g3.v r3 = r6.f6051r
                            h3.d$a r4 = p074h3.InterfaceC1364d.a.LOCK_SCREEN
                            r6.f6050q = r2
                            java.lang.Object r6 = r7.f(r1, r3, r4, r6)
                            if (r6 != r0) goto L65
                        L64:
                            return r0
                        L65:
                            h8.A r6 = p079h8.A.f21846a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: P6.a.c.C0205a.C0206a.C0207a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                C0206a(a aVar, InterfaceC0822l interfaceC0822l, v vVar, WallpaperManager wallpaperManager) {
                    this.f6046a = aVar;
                    this.f6047b = interfaceC0822l;
                    this.f6048c = vVar;
                    this.f6049d = wallpaperManager;
                }

                @Override // p074h3.InterfaceC1363c.a
                public final void a(x xVar, x xVar2, int i10) {
                    AbstractC0816i.d(AbstractC1164y.a(this.f6046a.f6031r), null, null, new C0207a(this.f6048c, this.f6046a, this.f6049d, null), 3, null);
                    InterfaceC0822l interfaceC0822l = this.f6047b;
                    if (xVar == null) {
                        xVar = xVar2;
                    }
                    interfaceC0822l.k(xVar, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0205a(InterfaceC1363c interfaceC1363c, a aVar, v vVar, WallpaperManager wallpaperManager, p129m8.e eVar) {
                super(2, eVar);
                this.f6042w = interfaceC1363c;
                this.f6043x = aVar;
                this.f6044y = vVar;
                this.f6045z = wallpaperManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0205a c0205a = new C0205a(this.f6042w, this.f6043x, this.f6044y, this.f6045z, eVar);
                c0205a.f6041v = ((Boolean) obj).booleanValue();
                return c0205a;
            }

            @Override // p219v8.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f6040u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    return obj;
                }
                r.b(obj);
                boolean z9 = this.f6041v;
                InterfaceC1363c interfaceC1363c = this.f6042w;
                a aVar = this.f6043x;
                v vVar = this.f6044y;
                WallpaperManager wallpaperManager = this.f6045z;
                this.f6036q = interfaceC1363c;
                this.f6037r = aVar;
                this.f6038s = vVar;
                this.f6039t = wallpaperManager;
                this.f6041v = z9;
                this.f6040u = 1;
                C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
                c0826n.G();
                interfaceC1363c.a(aVar.f6030q, z9, new C0206a(aVar, c0826n, vVar, wallpaperManager));
                Object objA = c0826n.A();
                if (objA == p139n8.b.e()) {
                    h.c(this);
                }
                return objA == objE ? objE : objA;
            }

            public final Object s(boolean z9, p129m8.e eVar) {
                return ((C0205a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(a aVar, l0 binding) {
            n.h(binding, "binding");
            this.f6035s = aVar;
            View viewO = binding.o();
            n.g(viewO, "getRoot(...)");
            super(aVar, viewO);
            this.f6034r = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle h(boolean z9) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_enable_cache", z9);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A i(v vVar, WallpaperColors wallpaperColors) {
            vVar.i(wallpaperColors);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A j(a aVar) {
            Activity activity = aVar.f6030q;
            if (activity != null) {
                activity.recreate();
            }
            return A.f21846a;
        }

        @Override // P6.a.C0204a
        public void d(Integer num, int i10) {
            if (num != null) {
                this.f6034r.f20021w.setImageResource(num.intValue());
            }
            H hA = I.a();
            n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
            K1.p pVar = (K1.p) hA;
            InterfaceC1363c interfaceC1363cK = pVar.k(this.f6035s.f6030q);
            final v vVarI = pVar.i();
            k kVarE = pVar.e(this.f6035s.f6030q);
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(this.f6035s.f6030q);
            p214v3.l lVar = p214v3.l.f28194a;
            Activity activity = this.f6035s.f6030q;
            View view = this.f6034r.f20020v;
            n.f(view, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            CardView cardView = (CardView) view;
            final boolean z9 = false;
            p234x3.d dVar = new p234x3.d(new q(this.f6035s.f6030q, ""), new p219v8.a() { // from class: P6.b
                @Override // p219v8.a
                public final Object invoke() {
                    return a.c.h(z9);
                }
            }, new C0205a(interfaceC1363cK, this.f6035s, vVarI, wallpaperManager, null), new p219v8.l() { // from class: P6.c
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return a.c.i(vVarI, (WallpaperColors) obj);
                }
            }, pVar.p(this.f6035s.f6030q), InterfaceC1364d.a.HOME_SCREEN);
            InterfaceC1163x interfaceC1163x = this.f6035s.f6031r;
            boolean zO = kVarE.o(this.f6035s.f6030q);
            final a aVar = this.f6035s;
            p214v3.l.n(activity, cardView, dVar, interfaceC1163x, false, true, false, zO, false, new p219v8.a() { // from class: P6.d
                @Override // p219v8.a
                public final Object invoke() {
                    return a.c.j(aVar);
                }
            }, null, false, 3392, null);
            this.f6034r.f20021w.setContentDescription(this.f6035s.f6030q.getString(R.string.home_wallpaper_preview_card_content_description) + (i10 + 1));
        }
    }

    public final class d extends C0204a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final n0 f6054r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f6055s;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(a aVar, n0 binding) {
            n.h(binding, "binding");
            this.f6055s = aVar;
            View viewO = binding.o();
            n.g(viewO, "getRoot(...)");
            super(aVar, viewO);
            this.f6054r = binding;
        }

        @Override // P6.a.C0204a
        public void d(Integer num, int i10) {
            this.f6054r.f20039x.setContentDescription(this.f6055s.f6030q.getString(R.string.home_wallpaper_preview_card_content_description) + (i10 + 1));
            if (num != null) {
                this.f6054r.f20037v.setImageResource(num.intValue());
            }
        }
    }

    static final class e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6056q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WallpaperManager f6057r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1364d.a f6058s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ v f6059t;

        /* JADX INFO: renamed from: P6.a$e$a, reason: collision with other inner class name */
        static final class C0208a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6060q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1364d.a f6061r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ v f6062s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ WallpaperColors f6063t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0208a(InterfaceC1364d.a aVar, v vVar, WallpaperColors wallpaperColors, p129m8.e eVar) {
                super(2, eVar);
                this.f6061r = aVar;
                this.f6062s = vVar;
                this.f6063t = wallpaperColors;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0208a(this.f6061r, this.f6062s, this.f6063t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0208a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f6060q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                if (this.f6061r == InterfaceC1364d.a.LOCK_SCREEN) {
                    this.f6062s.j(this.f6063t);
                } else {
                    this.f6062s.i(this.f6063t);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(WallpaperManager wallpaperManager, InterfaceC1364d.a aVar, v vVar, p129m8.e eVar) {
            super(2, eVar);
            this.f6057r = wallpaperManager;
            this.f6058s = aVar;
            this.f6059t = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new e(this.f6057r, this.f6058s, this.f6059t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6056q;
            if (i10 == 0) {
                r.b(obj);
                WallpaperColors wallpaperColors = this.f6057r.getWallpaperColors(this.f6058s == InterfaceC1364d.a.LOCK_SCREEN ? 2 : 1);
                H0 h0C = C0803b0.c();
                C0208a c0208a = new C0208a(this.f6058s, this.f6059t, wallpaperColors, null);
                this.f6056q = 1;
                if (AbstractC0812g.g(h0C, c0208a, this) == objE) {
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

    public a(Activity activity, InterfaceC1163x lifecycleOwner, Integer[] diagramResourceList) {
        n.h(activity, "activity");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(diagramResourceList, "diagramResourceList");
        this.f6030q = activity;
        this.f6031r = lifecycleOwner;
        this.f6032s = diagramResourceList;
    }

    public final Object f(WallpaperManager wallpaperManager, v vVar, InterfaceC1364d.a aVar, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.b(), new e(wallpaperManager, aVar, vVar, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0204a holder, int i10) {
        n.h(holder, "holder");
        holder.d(this.f6032s[i10], i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6032s.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object obj = f6029u.get(i10);
        n.g(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0204a onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == 0) {
            l0 l0VarC = l0.C(layoutInflaterFrom, parent, false);
            n.g(l0VarC, "inflate(...)");
            return new c(this, l0VarC);
        }
        n0 n0VarC = n0.C(layoutInflaterFrom, parent, false);
        n.g(n0VarC, "inflate(...)");
        return new d(this, n0VarC);
    }
}
