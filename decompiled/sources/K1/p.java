package K1;

import F8.C0803b0;
import F8.H0;
import F8.I;
import F8.L;
import F8.M;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import p064g3.v;
import p074h3.G;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p074h3.S;
import p074h3.V;
import p074h3.W;
import p079h8.A;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends V implements K1.a {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final a f4022f0 = new a(null);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f4023g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f4024h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f4025i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f4026j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f4027k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f4028l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f4029m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f4030n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f4031o0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private p194t3.a f4032A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p113l2.a f4033B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private r2.c.a f4034C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private R2.a f4035D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private G f4036E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p113l2.c f4037F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p043e2.b f4038G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private M1.b f4039H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private T1.b.C0264b f4040I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private M1.c f4041J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private U2.a f4042K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private p073h2.a.C0546a f4043L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private V1.a f4044M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private L1.a f4045N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private b2.c.d f4046O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private V1.b f4047P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p232x1.c f4048Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private F1.h f4049R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private J1.b f4050S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private J1.a f4051T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private T1.f.b f4052U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private A1.a f4053V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private A1.b f4054W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private E1.b.a f4055X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private L1.i f4056Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private p228w7.b f4057Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p228w7.a f4058a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private p208u7.a f4059b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final L f4060c0 = M.a(C0803b0.b());

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final I f4061d0 = C0803b0.b();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final H0 f4062e0 = C0803b0.c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC1364d f4063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private S f4064y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private W f4065z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static {
        int I9 = V.I();
        f4023g0 = I9;
        f4024h0 = I9 + 1;
        f4025i0 = I9 + 2;
        f4026j0 = I9 + 3;
        f4027k0 = I9 + 4;
        f4028l0 = I9 + 5;
        f4029m0 = I9 + 6;
        f4030n0 = I9 + 7;
        f4031o0 = I9 + 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C0(H1.i iVar) {
        return iVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A D0(H1.i iVar, boolean z9) {
        iVar.m(z9);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F0(p pVar, Context context) {
        kotlin.jvm.internal.n.e(context);
        return TextUtils.equals(pVar.e0(context).m(), "preset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M1.c X(p pVar, Context context) {
        kotlin.jvm.internal.n.e(context);
        return pVar.Z(context);
    }

    private final M1.c Z(Context context) {
        M1.c cVar = this.f4041J;
        if (cVar != null) {
            return cVar;
        }
        M1.c cVar2 = new M1.c(Y(context));
        this.f4041J = cVar2;
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(p pVar, Context context, String str) {
        if (str != null) {
            return kotlin.jvm.internal.n.d(pVar.W(context).o(str), Boolean.TRUE);
        }
        return false;
    }

    private final p232x1.c e0(Context context) {
        p232x1.c cVar = this.f4048Q;
        if (cVar != null) {
            return cVar;
        }
        p232x1.c cVarQ = p232x1.c.q(context, new G1.a(context));
        this.f4048Q = cVarQ;
        kotlin.jvm.internal.n.g(cVarQ, "also(...)");
        return cVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V1.b g0(p pVar, Context context, v vVar) {
        kotlin.jvm.internal.n.e(context);
        return pVar.h0(context, vVar);
    }

    private final V1.b h0(Context context, v vVar) {
        V1.b bVar = this.f4047P;
        if (bVar != null) {
            return bVar;
        }
        V1.b bVar2 = new V1.b(f0(context, vVar));
        this.f4047P = bVar2;
        return bVar2;
    }

    private final A1.a k0(Context context) {
        final Context applicationContext = context.getApplicationContext();
        A1.a aVar = this.f4053V;
        if (aVar != null) {
            return aVar;
        }
        L lG = G();
        L lG2 = G();
        p242y1.e eVarF = p242y1.e.f(context);
        kotlin.jvm.internal.n.g(eVarF, "getInstance(...)");
        A1.a aVar2 = new A1.a(lG, new p252z1.b(lG2, eVarF, this.f4061d0), new p069g8.a() { // from class: K1.h
            @Override // p069g8.a
            public final Object get() {
                return p.l0(this.f4007a, applicationContext);
            }
        });
        this.f4053V = aVar2;
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A1.b l0(p pVar, Context context) {
        kotlin.jvm.internal.n.e(context);
        return pVar.n0(context);
    }

    private final A1.b n0(Context context) {
        A1.b bVar = this.f4054W;
        if (bVar != null) {
            return bVar;
        }
        A1.b bVar2 = new A1.b(k0(context));
        this.f4054W = bVar2;
        return bVar2;
    }

    private final p208u7.a p0(Context context) {
        p208u7.a aVar = this.f4059b0;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        I iB = C0803b0.b();
        String string = context.getString(R.string.grid_control_metadata_name);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        p208u7.a aVar2 = new p208u7.a(applicationContext, iB, new H3.q(context, string));
        this.f4059b0 = aVar2;
        return aVar2;
    }

    private final p113l2.a r0(Context context) {
        R2.a aVarT0 = t0(context);
        final Context applicationContext = context.getApplicationContext();
        return new p113l2.a(new p103k2.a(aVarT0, G()), aVarT0, new p069g8.a() { // from class: K1.k
            @Override // p069g8.a
            public final Object get() {
                return p.s0(this.f4011a, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p113l2.c s0(p pVar, Context context) {
        kotlin.jvm.internal.n.e(context);
        return pVar.v0(context);
    }

    private final p113l2.c v0(Context context) {
        p113l2.c cVar = this.f4037F;
        if (cVar != null) {
            return cVar;
        }
        p113l2.c cVar2 = new p113l2.c(q0(context), t0(context));
        this.f4037F = cVar2;
        return cVar2;
    }

    private final U2.a y0(Context context) {
        U2.a aVar = this.f4042K;
        if (aVar != null) {
            return aVar;
        }
        U2.a aVar2 = new U2.a(new T2.a(H(), this.f4061d0, J(context), K(context)));
        this.f4042K = aVar2;
        return aVar2;
    }

    private final p043e2.b z0(Context context) {
        p043e2.b bVar = this.f4038G;
        if (bVar != null) {
            return bVar;
        }
        p043e2.b bVar2 = new p043e2.b(y0(context), this.f4060c0);
        this.f4038G = bVar2;
        return bVar2;
    }

    protected final J1.a A0() {
        J1.a aVar = this.f4051T;
        if (aVar != null) {
            return aVar;
        }
        J1.a aVar2 = new J1.a(new I1.a());
        this.f4051T = aVar2;
        return aVar2;
    }

    @Override // K1.a
    public List B() {
        return AbstractC1444s.e(new F6.b());
    }

    protected final J1.b B0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        final H1.i iVarF = H1.i.f(context);
        J1.b bVar = this.f4050S;
        if (bVar != null) {
            return bVar;
        }
        J1.b bVar2 = new J1.b(new p219v8.a() { // from class: K1.i
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(p.C0(iVarF));
            }
        }, new p219v8.l() { // from class: K1.j
            @Override // p219v8.l
            public final Object f(Object obj) {
                return p.D0(iVarF, ((Boolean) obj).booleanValue());
            }
        }, A0());
        this.f4050S = bVar2;
        return bVar2;
    }

    @Override // p074h3.H
    public InterfaceC1364d D(p010b.j activity) {
        kotlin.jvm.internal.n.h(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        S1.a aVarD0 = d0(activity);
        Resources resources = activity.getResources();
        InterfaceC1364d interfaceC1364d = this.f4063x;
        if (interfaceC1364d != null) {
            return interfaceC1364d;
        }
        kotlin.jvm.internal.n.e(applicationContext);
        b2.c.d dVarI0 = i0(applicationContext, i());
        r2.c.a aVarU0 = u0(applicationContext);
        p073h2.a.C0546a c0546aX0 = x0(applicationContext);
        p034d3.a aVarC = C();
        M1.b bVarW = W(applicationContext);
        kotlin.jvm.internal.n.e(resources);
        d dVar = new d(dVarI0, aVarU0, c0546aX0, aVarC, V(bVarW, aVarD0, resources), aVarD0, B0(applicationContext), A0(), w0(), o0(activity));
        this.f4063x = dVar;
        return dVar;
    }

    @Override // p074h3.H
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public synchronized q q(Context context) {
        q eVar;
        try {
            kotlin.jvm.internal.n.h(context, "context");
            S s9 = this.f4064y;
            if (s9 != null) {
                kotlin.jvm.internal.n.f(s9, "null cannot be cast to non-null type com.android.customization.module.ThemesUserEventLogger");
                eVar = (q) s9;
            } else {
                eVar = new e(context.getApplicationContext());
                this.f4064y = eVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return eVar;
    }

    protected final I U() {
        return this.f4061d0;
    }

    public T1.b.C0264b V(M1.b interactor, S1.a clockViewFactory, Resources resources) {
        kotlin.jvm.internal.n.h(interactor, "interactor");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(resources, "resources");
        T1.b.C0264b c0264b = this.f4040I;
        if (c0264b != null) {
            return c0264b;
        }
        T1.b.C0264b c0264b2 = new T1.b.C0264b(interactor, this.f4061d0, clockViewFactory, resources);
        this.f4040I = c0264b2;
        return c0264b2;
    }

    public M1.b W(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        final Context applicationContext = context.getApplicationContext();
        M1.b bVar = this.f4039H;
        if (bVar != null) {
            return bVar;
        }
        M1.b bVar2 = new M1.b(Y(context), new p069g8.a() { // from class: K1.m
            @Override // p069g8.a
            public final Object get() {
                return p.X(this.f4016a, applicationContext);
            }
        });
        this.f4039H = bVar2;
        return bVar2;
    }

    public final L1.a Y(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        L1.a aVar = this.f4045N;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.n.e(applicationContext);
        L1.e eVar = new L1.e(J(applicationContext), a0(applicationContext), G(), this.f4062e0);
        this.f4045N = eVar;
        return eVar;
    }

    public Q2.k a0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        L1.i iVar = this.f4056Y;
        if (iVar == null) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
            iVar = new L1.i(applicationContext, G(), this.f4062e0, this.f4061d0);
            this.f4056Y = iVar;
        }
        return iVar.d();
    }

    public T1.f.b b0(final Context context, v wallpaperColorsViewModel, S1.a clockViewFactory) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(wallpaperColorsViewModel, "wallpaperColorsViewModel");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        T1.f.b bVar = this.f4052U;
        if (bVar != null) {
            return bVar;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        T1.f.b bVar2 = new T1.f.b(applicationContext, W(context), f0(context, wallpaperColorsViewModel), new p219v8.l() { // from class: K1.o
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(p.c0(this.f4020q, context, (String) obj));
            }
        });
        this.f4052U = bVar2;
        return bVar2;
    }

    public abstract S1.a d0(p010b.j jVar);

    @Override // p074h3.H
    public synchronized W f(Context context) {
        W cVar;
        kotlin.jvm.internal.n.h(context, "context");
        cVar = this.f4065z;
        if (cVar == null) {
            cVar = new c(context.getApplicationContext());
            this.f4065z = cVar;
        }
        return cVar;
    }

    public V1.a f0(Context context, final v wallpaperColorsViewModel) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(wallpaperColorsViewModel, "wallpaperColorsViewModel");
        final Context applicationContext = context.getApplicationContext();
        V1.a aVar = this.f4044M;
        if (aVar != null) {
            return aVar;
        }
        L lG = G();
        kotlin.jvm.internal.n.e(applicationContext);
        V1.a aVar2 = new V1.a(new U1.b(lG, wallpaperColorsViewModel, e0(applicationContext)), new p069g8.a() { // from class: K1.l
            @Override // p069g8.a
            public final Object get() {
                return p.g0(this.f4013a, applicationContext, wallpaperColorsViewModel);
            }
        });
        this.f4044M = aVar2;
        return aVar2;
    }

    @Override // p074h3.H
    public Map g(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        Map mapR = N.r(super.g(context));
        mapR.put(Integer.valueOf(f4023g0), v0(context));
        if (C().n()) {
            mapR.put(Integer.valueOf(f4024h0), L(context));
        }
        mapR.put(Integer.valueOf(f4025i0), z0(context));
        mapR.put(Integer.valueOf(f4026j0), j0(context));
        mapR.put(Integer.valueOf(f4027k0), B0(context));
        mapR.put(Integer.valueOf(f4028l0), n0(context));
        mapR.put(Integer.valueOf(f4029m0), h0(context, i()));
        mapR.put(Integer.valueOf(f4030n0), Z(context));
        return mapR;
    }

    @Override // p074h3.H
    public String h() {
        return null;
    }

    public b2.c.d i0(Context context, v wallpaperColorsViewModel) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(wallpaperColorsViewModel, "wallpaperColorsViewModel");
        b2.c.d dVar = this.f4046O;
        if (dVar != null) {
            return dVar;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        b2.c.d dVar2 = new b2.c.d(applicationContext, f0(context, wallpaperColorsViewModel));
        this.f4046O = dVar2;
        return dVar2;
    }

    public final F1.h j0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        F1.h hVar = this.f4049R;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.n.e(applicationContext);
        Object systemService = applicationContext.getSystemService("uimode");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        F1.h hVar2 = new F1.h(applicationContext, (UiModeManager) systemService, this.f4061d0);
        this.f4049R = hVar2;
        return hVar2;
    }

    public final d0.c m0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        E1.b.a aVar = this.f4055X;
        if (aVar != null) {
            return aVar;
        }
        E1.b.a aVar2 = new E1.b.a(context, k0(context));
        this.f4055X = aVar2;
        return aVar2;
    }

    @Override // K1.a
    public p237x6.q o(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return p237x6.m.f30067a.b(context);
    }

    protected final p228w7.a o0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        p228w7.a aVar = this.f4058a0;
        if (aVar != null) {
            return aVar;
        }
        p228w7.a aVar2 = new p228w7.a(new p218v7.a(p0(context), C0803b0.b()));
        this.f4058a0 = aVar2;
        return aVar2;
    }

    @Override // p074h3.V, p074h3.H
    public p194t3.a p(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        final Context applicationContext = context.getApplicationContext();
        p194t3.a aVar = this.f4032A;
        if (aVar != null) {
            return aVar;
        }
        L lG = G();
        kotlin.jvm.internal.n.e(applicationContext);
        InterfaceC1363c interfaceC1363cK = k(applicationContext);
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(applicationContext);
        kotlin.jvm.internal.n.g(wallpaperManager, "getInstance(...)");
        p194t3.a aVar2 = new p194t3.a(new p184s3.b(lG, new p174r3.b(applicationContext, interfaceC1363cK, wallpaperManager), f(applicationContext), this.f4061d0), new p219v8.a() { // from class: K1.n
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(p.F0(this.f4018q, applicationContext));
            }
        });
        this.f4032A = aVar2;
        return aVar2;
    }

    public p113l2.a q0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        p113l2.a aVar = this.f4033B;
        if (aVar != null) {
            return aVar;
        }
        p113l2.a aVarR0 = r0(context);
        this.f4033B = aVarR0;
        return aVarR0;
    }

    public final R2.a t0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        R2.a aVar = this.f4035D;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        R2.b bVar = new R2.b(applicationContext, C0803b0.b());
        this.f4035D = bVar;
        return bVar;
    }

    @Override // p074h3.H
    public G u() {
        G g10 = this.f4036E;
        return g10 == null ? new g() : g10;
    }

    public final r2.c.a u0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        r2.c.a aVar = this.f4034C;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        r2.c.a aVar2 = new r2.c.a(applicationContext, q0(context), p(context), k(context));
        this.f4034C = aVar2;
        return aVar2;
    }

    protected final p228w7.b w0() {
        p228w7.b bVar = this.f4057Z;
        if (bVar != null) {
            return bVar;
        }
        p228w7.b bVar2 = new p228w7.b(new p218v7.b());
        this.f4057Z = bVar2;
        return bVar2;
    }

    public final p073h2.a.C0546a x0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        p073h2.a.C0546a c0546a = this.f4043L;
        if (c0546a != null) {
            return c0546a;
        }
        p073h2.a.C0546a c0546a2 = new p073h2.a.C0546a(y0(context));
        this.f4043L = c0546a2;
        return c0546a2;
    }
}
