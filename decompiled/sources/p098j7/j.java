package p098j7;

import F2.F;
import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.I;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.W;
import I8.A;
import I8.AbstractC0882h;
import I8.G;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import I8.Q;
import I8.z;
import android.app.Activity;
import android.app.WallpaperColors;
import android.app.wallpaper.WallpaperDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.provider.Settings;
import android.service.wallpaper.IWallpaperEngine;
import androidx.lifecycle.C;
import androidx.lifecycle.H;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import com.android.launcher3.w;
import com.nothing.wallpaper.common.bitmap.BitmapOpaqueUtil;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import com.nothing.wallpaper.picker.edit.preview.bean.LoadingState;
import com.nothing.wallpaper.picker.edit.preview.bean.LoadingStateKt;
import com.nothing.wallpaper.picker.edit.preview.widget.NTDisplayAspectRatioLinearLayout;
import com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState;
import com.nothing.wallpaper.picker.lockscreen.depth.NotApplicableReason;
import com.nothing.wallpaper.segmenter.Segmenter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import org.json.JSONException;
import p064g3.x;
import p074h3.U;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends a0 {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a f22340T = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private InterfaceC0846x0 f22341A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final boolean f22342B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f22343C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f22344D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f22345E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p079h8.h f22346F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p079h8.h f22347G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p079h8.h f22348H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p079h8.h f22349I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Boolean f22350J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f22351K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final A f22352L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final O f22353M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private BitmapOpaqueUtil.OpaquePercentage f22354N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile Bitmap f22355O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private volatile C6.b f22356P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private InterfaceC0846x0 f22357Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final s f22358R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p079h8.h f22359S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p158p7.a f22361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f22362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D6.f f22363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p237x6.k f22364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p167q6.b f22365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p148o7.b f22366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private J7.i f22367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final K1.a f22368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p079h8.h f22369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private D6.g f22370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f22371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final J6.e f22372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC0880f f22373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC0880f f22374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z f22375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC0880f f22376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set f22377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z f22378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC0880f f22379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final H f22380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C f22381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC0846x0 f22382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p079h8.h f22383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f22384z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(DepthEffectState depthState) {
            NotApplicableReason reason;
            kotlin.jvm.internal.n.h(depthState, "depthState");
            return (depthState instanceof DepthEffectState.DepthOn) || (depthState instanceof DepthEffectState.DepthOff) || ((depthState instanceof DepthEffectState.DepthNotApplicable) && ((reason = ((DepthEffectState.DepthNotApplicable) depthState).getReason()) == NotApplicableReason.NO_OVERLAP || reason == NotApplicableReason.OVERLAP_TOO_MUCH));
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            return Settings.Secure.getInt(context.getContentResolver(), "depth_effect_state", 0) == 1;
        }

        public final void c(Context context, boolean z9) {
            kotlin.jvm.internal.n.h(context, "context");
            Settings.Secure.putInt(context.getContentResolver(), "depth_effect_state", z9 ? 1 : 0);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22386b;

        static {
            int[] iArr = new int[p108k7.a.values().length];
            try {
                iArr[p108k7.a.Glass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22385a = iArr;
            int[] iArr2 = new int[BitmapOpaqueUtil.OpaquePercentage.values().length];
            try {
                iArr2[BitmapOpaqueUtil.OpaquePercentage.SATISFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BitmapOpaqueUtil.OpaquePercentage.NO_OPAQUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BitmapOpaqueUtil.OpaquePercentage.EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f22386b = iArr2;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22387q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C6.e.b f22389s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6.e.b bVar, p129m8.e eVar) {
            super(2, eVar);
            this.f22389s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return j.this.new c(this.f22389s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if (r1.b(r5, r4) == r0) goto L18;
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
                int r1 = r4.f22387q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L4c
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                p079h8.r.b(r5)
                goto L30
            L1e:
                p079h8.r.b(r5)
                j7.j r5 = p098j7.j.this
                I8.z r5 = p098j7.j.C(r5)
                r4.f22387q = r3
                java.lang.Object r5 = I8.AbstractC0882h.x(r5, r4)
                if (r5 != r0) goto L30
                goto L4b
            L30:
                C6.e$b r1 = r4.f22389s
                j7.j r3 = p098j7.j.this
                java.util.Map r5 = (java.util.Map) r5
                java.lang.Object r5 = r5.get(r1)
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                if (r5 != 0) goto L3f
                goto L4c
            L3f:
                I8.z r1 = p098j7.j.w(r3)
                r4.f22387q = r2
                java.lang.Object r4 = r1.b(r5, r4)
                if (r4 != r0) goto L4c
            L4b:
                return r0
            L4c:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j7.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22390q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22391r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f22392s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f22393t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f22394u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f22396w;

        d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22394u = obj;
            this.f22396w |= Integer.MIN_VALUE;
            return j.this.X(null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f22397q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f22399s;

        e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22397q = obj;
            this.f22399s |= Integer.MIN_VALUE;
            return j.this.v0(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22400q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f22401r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C6.b f22403t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C6.b bVar, p129m8.e eVar) {
            super(2, eVar);
            this.f22403t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            f fVar = j.this.new f(this.f22403t, eVar);
            fVar.f22401r = obj;
            return fVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f22400q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f22401r;
            j.this.f22355O = this.f22403t.a().a();
            if (M.g(l9) && j.this.f22355O != null) {
                Bitmap bitmap = j.this.f22355O;
                kotlin.jvm.internal.n.e(bitmap);
                if (!bitmap.isRecycled()) {
                    j jVar = j.this;
                    Bitmap bitmap2 = jVar.f22355O;
                    kotlin.jvm.internal.n.e(bitmap2);
                    jVar.Y(bitmap2);
                }
            }
            return p079h8.A.f21846a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22404q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f22406s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f22407t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f22408u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ WallpaperColors f22409v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22410q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f22411r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f22412s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ WallpaperColors f22413t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, String str, WallpaperColors wallpaperColors, p129m8.e eVar) {
                super(2, eVar);
                this.f22411r = jVar;
                this.f22412s = str;
                this.f22413t = wallpaperColors;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f22411r, this.f22412s, this.f22413t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f22410q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                A6.c cVarC0 = this.f22411r.c0();
                if (cVarC0 != null) {
                    return kotlin.coroutines.jvm.internal.b.a(cVarC0.t0(this.f22412s, this.f22413t));
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, int i10, int i11, WallpaperColors wallpaperColors, p129m8.e eVar) {
            super(2, eVar);
            this.f22406s = str;
            this.f22407t = i10;
            this.f22408u = i11;
            this.f22409v = wallpaperColors;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return j.this.new g(this.f22406s, this.f22407t, this.f22408u, this.f22409v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f22404q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I iB = C0803b0.b();
                a aVar = new a(j.this, this.f22406s, this.f22409v, null);
                this.f22404q = 1;
                obj = AbstractC0812g.g(iB, aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            j.this.f22365g.g("notify blur success:" + bool + " for path " + this.f22406s + ".");
            if (kotlin.jvm.internal.n.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
                j.this.D0();
            } else {
                j.this.A0(this.f22407t, this.f22408u);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22414q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f22415r;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22417q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f22418r;

            /* JADX INFO: renamed from: j7.j$h$a$a, reason: collision with other inner class name */
            static final class C0558a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f22419q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ j f22420r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0558a(j jVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f22420r = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0558a(this.f22420r, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f22419q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    this.f22420r.f22378t.g();
                    this.f22420r.f22375q.g();
                    return p079h8.A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ViewScope viewScope, p129m8.e eVar) {
                    return ((C0558a) create(viewScope, eVar)).invokeSuspend(p079h8.A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22418r = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f22418r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f22417q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0880f interfaceC0880fJ0 = ((D6.e) this.f22418r.f22363e).J0();
                    C0558a c0558a = new C0558a(this.f22418r, null);
                    this.f22417q = 1;
                    if (AbstractC0882h.i(interfaceC0880fJ0, c0558a, this) == objE) {
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

        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22421q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f22422r;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f22423q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f22424r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ j f22425s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f22425s = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    a aVar = new a(this.f22425s, eVar);
                    aVar.f22424r = obj;
                    return aVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
                
                    if (r3.I0((java.util.List) r6, r1, r5) == r0) goto L15;
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
                        int r1 = r5.f22423q
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        p079h8.r.b(r6)
                        goto L51
                    L12:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L1a:
                        java.lang.Object r1 = r5.f22424r
                        java.util.List r1 = (java.util.List) r1
                        p079h8.r.b(r6)
                        goto L41
                    L22:
                        p079h8.r.b(r6)
                        java.lang.Object r6 = r5.f22424r
                        r1 = r6
                        java.util.List r1 = (java.util.List) r1
                        j7.j r6 = r5.f22425s
                        D6.f r6 = p098j7.j.z(r6)
                        D6.e r6 = (D6.e) r6
                        I8.f r6 = r6.t()
                        r5.f22424r = r1
                        r5.f22423q = r3
                        java.lang.Object r6 = I8.AbstractC0882h.x(r6, r5)
                        if (r6 != r0) goto L41
                        goto L50
                    L41:
                        java.util.List r6 = (java.util.List) r6
                        j7.j r3 = r5.f22425s
                        r4 = 0
                        r5.f22424r = r4
                        r5.f22423q = r2
                        java.lang.Object r5 = p098j7.j.M(r3, r6, r1, r5)
                        if (r5 != r0) goto L51
                    L50:
                        return r0
                    L51:
                        h8.A r5 = p079h8.A.f21846a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: j7.j.h.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, p129m8.e eVar) {
                    return ((a) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
                }
            }

            /* JADX INFO: renamed from: j7.j$h$b$b, reason: collision with other inner class name */
            static final class C0559b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f22426q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f22427r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ j f22428s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0559b(j jVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f22428s = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    C0559b c0559b = new C0559b(this.f22428s, eVar);
                    c0559b.f22427r = obj;
                    return c0559b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f22426q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        List list = (List) this.f22427r;
                        if (!kotlin.jvm.internal.n.d(this.f22428s.l0(), p7.a.b.f23770b) || G6.e.i(this.f22428s.u0())) {
                            j jVar = this.f22428s;
                            List listL = AbstractC1444s.l();
                            this.f22426q = 1;
                            if (jVar.I0(list, listL, this) == objE) {
                                return objE;
                            }
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
                public final Object invoke(List list, p129m8.e eVar) {
                    return ((C0559b) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22422r = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f22422r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
            
                if (I8.AbstractC0882h.i(r6, r2, r5) == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
            
                if (I8.AbstractC0882h.i(r6, r3, r5) == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
            
                return r0;
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
                    int r1 = r5.f22421q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L17:
                    p079h8.r.b(r6)
                    goto L86
                L1b:
                    p079h8.r.b(r6)
                    j7.j r6 = r5.f22422r
                    boolean r6 = p098j7.j.J(r6)
                    r1 = 0
                    if (r6 == 0) goto L5f
                    j7.j r6 = r5.f22422r
                    boolean r6 = p098j7.j.K(r6)
                    if (r6 == 0) goto L5f
                    j7.j r6 = r5.f22422r
                    D6.g r6 = p098j7.j.B(r6)
                    if (r6 == 0) goto L5f
                    j7.j r6 = r5.f22422r
                    q6.b r6 = p098j7.j.x(r6)
                    java.lang.String r2 = "listen effect dataSource."
                    r6.a(r2)
                    j7.j r6 = r5.f22422r
                    D6.g r6 = p098j7.j.B(r6)
                    kotlin.jvm.internal.n.e(r6)
                    I8.f r6 = r6.N()
                    j7.j$h$b$a r2 = new j7.j$h$b$a
                    j7.j r4 = r5.f22422r
                    r2.<init>(r4, r1)
                    r5.f22421q = r3
                    java.lang.Object r5 = I8.AbstractC0882h.i(r6, r2, r5)
                    if (r5 != r0) goto L86
                    goto L85
                L5f:
                    j7.j r6 = r5.f22422r
                    q6.b r6 = p098j7.j.x(r6)
                    java.lang.String r3 = "listen origin dataSource."
                    r6.a(r3)
                    j7.j r6 = r5.f22422r
                    D6.f r6 = p098j7.j.z(r6)
                    D6.e r6 = (D6.e) r6
                    I8.f r6 = r6.t()
                    j7.j$h$b$b r3 = new j7.j$h$b$b
                    j7.j r4 = r5.f22422r
                    r3.<init>(r4, r1)
                    r5.f22421q = r2
                    java.lang.Object r5 = I8.AbstractC0882h.i(r6, r3, r5)
                    if (r5 != r0) goto L86
                L85:
                    return r0
                L86:
                    h8.A r5 = p079h8.A.f21846a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: j7.j.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22429q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f22430r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f22431s;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f22432q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f22433r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ j f22434s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ L f22435t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar, L l9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f22434s = jVar;
                    this.f22435t = l9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    a aVar = new a(this.f22434s, this.f22435t, eVar);
                    aVar.f22433r = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object next;
                    p139n8.b.e();
                    if (this.f22432q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    List list = (List) this.f22433r;
                    Object obj2 = null;
                    if (this.f22434s.g0()) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((C6.b) next).c() != C6.a.Depth);
                        C6.b bVar = (C6.b) next;
                        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "received Depth cropped bitmap:" + bVar);
                        if (bVar != null) {
                            this.f22434s.z0(bVar);
                        }
                    }
                    if (this.f22434s.f22343C && this.f22434s.f22342B && this.f22434s.f22370l != null) {
                        j jVar = this.f22434s;
                        for (Object obj3 : list) {
                            if (((C6.b) obj3).c() == C6.a.Setter) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        C6.b bVar2 = (C6.b) obj2;
                        if (bVar2 == null) {
                            this.f22434s.f22365g.e("didn't received Setter cropped bitmap");
                            return p079h8.A.f21846a;
                        }
                        jVar.f22356P = bVar2;
                        ArrayList arrayList = new ArrayList();
                        if (!kotlin.jvm.internal.n.d(this.f22434s.l0(), p7.a.b.f23770b)) {
                            arrayList.add(C6.e.b.f642c);
                        }
                        D6.g gVar = this.f22434s.f22370l;
                        if (gVar != null) {
                            C6.b bVar3 = this.f22434s.f22356P;
                            kotlin.jvm.internal.n.e(bVar3);
                            gVar.E(bVar3, arrayList);
                        }
                    }
                    return p079h8.A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, p129m8.e eVar) {
                    return ((a) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22431s = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                c cVar = new c(this.f22431s, eVar);
                cVar.f22430r = obj;
                return cVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f22429q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    L l9 = (L) this.f22430r;
                    InterfaceC0880f interfaceC0880fT = ((D6.e) this.f22431s.f22363e).t();
                    a aVar = new a(this.f22431s, l9, null);
                    this.f22429q = 1;
                    if (AbstractC0882h.i(interfaceC0880fT, aVar, this) == objE) {
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

        h(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            h hVar = j.this.new h(eVar);
            hVar.f22415r = obj;
            return hVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((h) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f22414q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f22415r;
            AbstractC0816i.d(l9, null, null, new a(j.this, null), 3, null);
            AbstractC0816i.d(l9, C0803b0.b(), null, new b(j.this, null), 2, null);
            AbstractC0816i.d(l9, C0803b0.b(), null, new c(j.this, null), 2, null);
            return p079h8.A.f21846a;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22436q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22438q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f22439r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f22440s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22440s = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f22440s, eVar);
                aVar.f22439r = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f22438q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "clockArea collect:" + ((Rect) this.f22439r));
                Bitmap bitmap = this.f22440s.f22355O;
                if (bitmap != null) {
                    this.f22440s.Y(bitmap);
                }
                return p079h8.A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Rect rect, p129m8.e eVar) {
                return ((a) create(rect, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        i(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return j.this.new i(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            O oL;
            Object objE = p139n8.b.e();
            int i10 = this.f22436q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                J7.i iVarP0 = j.this.p0();
                if (iVarP0 != null && (oL = iVarP0.L()) != null) {
                    a aVar = new a(j.this, null);
                    this.f22436q = 1;
                    if (AbstractC0882h.i(oL, aVar, this) == objE) {
                        return objE;
                    }
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

    /* JADX INFO: renamed from: j7.j$j, reason: collision with other inner class name */
    static final class C0560j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22441q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22442r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f22443s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f22444t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f22445u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f22446v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f22448x;

        C0560j(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22446v = obj;
            this.f22448x |= Integer.MIN_VALUE;
            return j.this.I0(null, null, this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f22449q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22450r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22452t;

        k(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22450r = obj;
            this.f22452t |= Integer.MIN_VALUE;
            return j.this.P0(false, this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22453q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22454r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22456t;

        l(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22454r = obj;
            this.f22456t |= Integer.MIN_VALUE;
            return j.this.V0(null, 0, null, this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22457q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ IWallpaperEngine f22458r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f22459s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(IWallpaperEngine iWallpaperEngine, int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f22458r = iWallpaperEngine;
            this.f22459s = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new m(this.f22458r, this.f22459s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((m) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f22457q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return this.f22458r.onApplyWallpaper(this.f22459s);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22460q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f22462s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f22463t;

        /* synthetic */ class a extends kotlin.jvm.internal.l implements p219v8.p {
            a(Object obj) {
                super(2, obj, j.class, "buildEffectInfo", "buildEffectInfo(Lcom/nothing/wallpaper/effects/data/model/Effect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6.e eVar, p129m8.e eVar2) {
                return ((j) this.receiver).X(eVar, eVar2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z9, boolean z10, p129m8.e eVar) {
            super(2, eVar);
            this.f22462s = z9;
            this.f22463t = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return j.this.new n(this.f22462s, this.f22463t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((n) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object objE = p139n8.b.e();
            int i10 = this.f22460q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                J6.e eVar = j.this.f22372n;
                boolean z9 = this.f22462s;
                boolean z10 = this.f22463t;
                x xVarU0 = j.this.u0();
                D6.f fVar = j.this.f22363e;
                a aVar = new a(j.this);
                this.f22460q = 1;
                nVar = this;
                obj = eVar.i(z9, z10, xVarU0, fVar, aVar, nVar);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                nVar = this;
            }
            if (!((Boolean) obj).booleanValue()) {
                j.this.Z();
            }
            return p079h8.A.f21846a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f22464A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        int f22465B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        long f22466C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f22467D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private /* synthetic */ Object f22468E;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ Activity f22470G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ IWallpaperEngine f22471H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f22472I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p f22473J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f22474K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ boolean f22475L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ E f22476M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ E f22477N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ E f22478O;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22479q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22480r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f22481s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f22482t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f22483u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f22484v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f22485w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f22486x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f22487y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f22488z;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22489q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f22490r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22490r = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f22490r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f22489q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    long loadingSilenceDelay = LoadingStateKt.getLoadingSilenceDelay(this.f22490r.f22372n.g());
                    this.f22489q = 1;
                    if (W.b(loadingSilenceDelay, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                this.f22490r.X0(LoadingState.Loading.INSTANCE);
                return p079h8.A.f21846a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22491q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f22492r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22492r = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f22492r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f22491q;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    return obj;
                }
                p079h8.r.b(obj);
                j jVar = this.f22492r;
                this.f22491q = 1;
                Object objH0 = jVar.h0(2, this);
                return objH0 == objE ? objE : objH0;
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22493q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f22494r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.C f22495s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j jVar, kotlin.jvm.internal.C c10, p129m8.e eVar) {
                super(2, eVar);
                this.f22494r = jVar;
                this.f22495s = c10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new c(this.f22494r, this.f22495s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f22493q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    j jVar = this.f22494r;
                    int i11 = this.f22495s.f22777q;
                    this.f22493q = 1;
                    obj = jVar.h0(i11, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                if (com.nothing.wallpaper.common.log.c.f18435a.m() && bitmap != null) {
                    this.f22494r.O0(bitmap);
                }
                return bitmap;
            }
        }

        static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22496q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f22497r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(int i10, p129m8.e eVar) {
                super(2, eVar);
                this.f22497r = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new d(this.f22497r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws JSONException {
                Object objE = p139n8.b.e();
                int i10 = this.f22496q;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    return obj;
                }
                p079h8.r.b(obj);
                A6.b bVar = A6.b.f230a;
                int i11 = this.f22497r;
                this.f22496q = 1;
                Object objD = bVar.d(i11, this);
                return objD == objE ? objE : objD;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Activity activity, IWallpaperEngine iWallpaperEngine, int i10, p pVar, boolean z9, boolean z10, E e10, E e11, E e12, p129m8.e eVar) {
            super(2, eVar);
            this.f22470G = activity;
            this.f22471H = iWallpaperEngine;
            this.f22472I = i10;
            this.f22473J = pVar;
            this.f22474K = z9;
            this.f22475L = z10;
            this.f22476M = e10;
            this.f22477N = e11;
            this.f22478O = e12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean u() {
            return A6.b.f230a.k();
        }

        private static final boolean v(p079h8.h hVar) {
            return ((Boolean) hVar.getValue()).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            o oVar = j.this.new o(this.f22470G, this.f22471H, this.f22472I, this.f22473J, this.f22474K, this.f22475L, this.f22476M, this.f22477N, this.f22478O, eVar);
            oVar.f22468E = obj;
            return oVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((o) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x03dc A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:104:0x03e8 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:105:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:108:0x03f8 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0403  */
        /* JADX WARN: Code duplicated, block: B:114:0x040a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:119:0x0417  */
        /* JADX WARN: Code duplicated, block: B:122:0x0457  */
        /* JADX WARN: Code duplicated, block: B:123:0x0459  */
        /* JADX WARN: Code duplicated, block: B:128:0x050b  */
        /* JADX WARN: Code duplicated, block: B:129:0x050d  */
        /* JADX WARN: Code duplicated, block: B:132:0x0536 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:137:0x0550  */
        /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x01d5 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:46:0x01e1 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0225 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:51:0x024f  */
        /* JADX WARN: Code duplicated, block: B:53:0x0259 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0261 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:60:0x026d  */
        /* JADX WARN: Code duplicated, block: B:63:0x027a A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0291  */
        /* JADX WARN: Code duplicated, block: B:71:0x02b6  */
        /* JADX WARN: Code duplicated, block: B:72:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:75:0x02c5 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:77:0x02ef A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:79:0x030d  */
        /* JADX WARN: Code duplicated, block: B:80:0x030f  */
        /* JADX WARN: Code duplicated, block: B:83:0x031c  */
        /* JADX WARN: Code duplicated, block: B:86:0x034d  */
        /* JADX WARN: Code duplicated, block: B:87:0x034f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0384 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:91:0x03a8 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:93:0x03b9 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:9:0x0044, B:130:0x0512, B:131:0x052f, B:15:0x0076, B:124:0x045d, B:126:0x049b, B:18:0x0098, B:88:0x0352, B:22:0x00c0, B:81:0x0313, B:84:0x0320, B:25:0x00f0, B:73:0x02bb, B:75:0x02c5, B:77:0x02ef, B:89:0x0384, B:28:0x012f, B:53:0x0259, B:56:0x0261, B:58:0x0267, B:61:0x026e, B:63:0x027a, B:65:0x0284, B:69:0x0292, B:91:0x03a8, B:93:0x03b9, B:98:0x03c3, B:100:0x03dc, B:102:0x03e2, B:104:0x03e8, B:106:0x03ee, B:108:0x03f8, B:110:0x03fe, B:112:0x0404, B:115:0x040c, B:120:0x0418, B:31:0x0168, B:43:0x01d1, B:45:0x01d5, B:46:0x01e1, B:48:0x0225, B:132:0x0536, B:133:0x053d, B:36:0x01a9, B:38:0x01ad, B:40:0x01b1), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:96:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
        /* JADX WARN: Instruction removed from duplicated block: B:75:0x02c5, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:89:0x0384, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p pVar;
            Throwable thD;
            Object obj2;
            j jVar;
            boolean z9;
            p pVar2;
            int i10;
            boolean z10;
            Activity activity;
            E e10;
            E e11;
            E e12;
            IWallpaperEngine iWallpaperEngine;
            Object objX;
            p079h8.u uVar;
            C6.g gVar;
            C6.i iVar;
            WallpaperColors wallpaperColors;
            boolean z11;
            boolean z12;
            boolean z13;
            Object obj3;
            E e13;
            j jVar2;
            C6.g gVar2;
            p pVar3;
            Activity activity2;
            E e14;
            IWallpaperEngine iWallpaperEngine2;
            WallpaperColors wallpaperColors2;
            p148o7.b bVarE0;
            boolean z14;
            boolean z15;
            kotlin.jvm.internal.C c10;
            String str;
            Object obj4;
            kotlin.jvm.internal.C c11;
            C6.i iVar2;
            j jVar3;
            E e15;
            WallpaperColors wallpaperColors3;
            p pVar4;
            Activity activity3;
            E6.a.C0050a c0050aE;
            C6.e eVarB;
            C6.g gVarK;
            C6.e eVarB2;
            long jCurrentTimeMillis;
            Object objG;
            E e16;
            kotlin.jvm.internal.C c12;
            C6.i iVar3;
            E6.a.C0050a c0050aE2;
            E6.a.C0050a c0050aE3;
            String str2;
            String strA;
            Object objX2;
            j jVar4;
            E e17;
            String str3;
            C6.e eVarB3;
            String str4;
            String str5;
            J6.a aVarA;
            String str6;
            Activity activity4;
            p pVar5;
            int i11;
            p pVar6;
            J6.a aVar;
            WallpaperColors wallpaperColors4;
            j jVar5;
            Object objG2;
            Activity activity5;
            Object objG3;
            WallpaperColors wallpaperColors5;
            j jVar6;
            E e18;
            Object objX3;
            Object objE = p139n8.b.e();
            String str7 = " to manager.";
            try {
                switch (this.f22467D) {
                    case 0:
                        p079h8.r.b(obj);
                        L l9 = (L) this.f22468E;
                        j jVar7 = j.this;
                        jVar7.f22382x = AbstractC0816i.d(l9, null, null, new a(jVar7, null), 3, null);
                        if (!G6.e.s(j.this.u0())) {
                            obj2 = objE;
                            j.this.f22365g.g("set " + G6.g.d(j.this.u0(), this.f22470G) + " to manager.");
                            IWallpaperEngine iWallpaperEngine3 = this.f22471H;
                            if (iWallpaperEngine3 != null) {
                                j jVar8 = j.this;
                                int i12 = this.f22472I;
                                x xVarU0 = jVar8.u0();
                                kotlin.jvm.internal.n.f(xVarU0, "null cannot be cast to non-null type com.android.wallpaper.model.LiveWallpaperInfo");
                                this.f22467D = 8;
                                if (jVar8.V0((p064g3.k) xVarU0, i12, iWallpaperEngine3, this) == obj2) {
                                    return obj2;
                                }
                                p079h8.A a10 = p079h8.A.f21846a;
                            }
                            InterfaceC0880f interfaceC0880fS = j.this.f22363e.S();
                            this.f22467D = 9;
                            objX3 = AbstractC0882h.x(interfaceC0880fS, this);
                            if (objX3 == obj2) {
                                return obj2;
                            }
                            WallpaperColors wallpaperColors6 = (WallpaperColors) objX3;
                            j.this.T0(this.f22472I, wallpaperColors6.getColorHints());
                            j.this.y0().u(this.f22470G, j.this.u0(), null, this.f22472I, 1.0f, null, wallpaperColors6, this.f22473J);
                            p079h8.A a11 = p079h8.A.f21846a;
                            return p079h8.A.f21846a;
                        }
                        jVar = j.this;
                        z9 = this.f22474K;
                        pVar2 = this.f22473J;
                        i10 = this.f22472I;
                        z10 = this.f22475L;
                        activity = this.f22470G;
                        e10 = this.f22476M;
                        e11 = this.f22477N;
                        e12 = this.f22478O;
                        iWallpaperEngine = this.f22471H;
                        h8.q.a aVar2 = p079h8.q.f21862r;
                        C6.e.b bVar = z9 ? C6.e.b.f642c : null;
                        this.f22468E = jVar;
                        this.f22479q = pVar2;
                        this.f22480r = activity;
                        this.f22481s = e10;
                        this.f22482t = e11;
                        this.f22483u = e12;
                        this.f22484v = iWallpaperEngine;
                        this.f22488z = z9;
                        this.f22465B = i10;
                        this.f22464A = z10;
                        this.f22467D = 1;
                        objX = jVar.X(bVar, this);
                        if (objX == objE) {
                            return objE;
                        }
                        uVar = (p079h8.u) objX;
                        if (uVar == null) {
                            gVar = (C6.g) uVar.a();
                            iVar = (C6.i) uVar.b();
                            wallpaperColors = (WallpaperColors) uVar.c();
                            p167q6.b bVar2 = jVar.f22365g;
                            String strB = G6.g.b(i10);
                            z11 = z9;
                            StringBuilder sb = new StringBuilder();
                            z12 = z10;
                            sb.append("start set PreviewImageWallpaper to ");
                            sb.append(strB);
                            bVar2.g(sb.toString());
                            if (jVar.c0() != null) {
                                throw new IllegalArgumentException("setWallpaper: select blur but BlurHelper is NULL.");
                            }
                            this.f22468E = jVar;
                            this.f22479q = pVar2;
                            this.f22480r = activity;
                            this.f22481s = e10;
                            this.f22482t = e11;
                            this.f22483u = e12;
                            this.f22484v = iWallpaperEngine;
                            this.f22485w = gVar;
                            this.f22486x = iVar;
                            this.f22487y = wallpaperColors;
                            this.f22465B = i10;
                            z13 = z12;
                            this.f22488z = z13;
                            this.f22467D = 2;
                            obj3 = objE;
                            if (jVar.P0(z11, this) != obj3) {
                                e13 = e10;
                                jVar2 = jVar;
                                gVar2 = gVar;
                                pVar3 = pVar2;
                                activity2 = activity;
                                e14 = e11;
                                iWallpaperEngine2 = iWallpaperEngine;
                                wallpaperColors2 = wallpaperColors;
                                if (z13) {
                                    c0050aE3 = gVar2.e();
                                    str2 = "ORIGIN";
                                    if (c0050aE3 != null || (eVarB3 = c0050aE3.b()) == null || (strA = eVarB3.a()) == null) {
                                        strA = "ORIGIN";
                                    }
                                    if (kotlin.jvm.internal.n.d(jVar2.l0(), p7.a.b.f23770b) || !jVar2.u0().s() || !kotlin.jvm.internal.n.d(strA, C6.e.b.f642c.a())) {
                                        str2 = strA;
                                    }
                                    InterfaceC0880f interfaceC0880fD0 = jVar2.d0();
                                    this.f22468E = jVar2;
                                    this.f22479q = pVar3;
                                    this.f22480r = activity2;
                                    this.f22481s = e14;
                                    this.f22482t = e12;
                                    this.f22483u = iWallpaperEngine2;
                                    this.f22484v = gVar2;
                                    this.f22485w = wallpaperColors2;
                                    this.f22486x = str2;
                                    this.f22487y = null;
                                    this.f22465B = i10;
                                    this.f22467D = 3;
                                    objX2 = AbstractC0882h.x(interfaceC0880fD0, this);
                                    if (objX2 != obj3) {
                                        E e19 = e14;
                                        jVar4 = jVar2;
                                        e17 = e19;
                                        str3 = str2;
                                        str5 = (String) ((Map) objX2).get(str3);
                                        if (str5 != null) {
                                            pVar3.a(null);
                                            jVar4.f22365g.g("didn't find path for pathType " + str3 + ".");
                                            return p079h8.A.f21846a;
                                        }
                                        jVar4.f22365g.g("set blur file path:" + str5);
                                        e17.f22779q = str5;
                                        e12.f22779q = wallpaperColors2;
                                        aVarA = G6.e.a(jVar4.u0(), gVar2, wallpaperColors2, jVar4.b0());
                                        if (iWallpaperEngine2 != null) {
                                            this.f22468E = jVar4;
                                            this.f22479q = pVar3;
                                            this.f22480r = activity2;
                                            this.f22481s = wallpaperColors2;
                                            this.f22482t = str3;
                                            this.f22483u = aVarA;
                                            this.f22484v = null;
                                            this.f22485w = null;
                                            this.f22486x = null;
                                            this.f22465B = i10;
                                            this.f22467D = 4;
                                            if (jVar4.V0(aVarA, i10, iWallpaperEngine2, this) == obj3) {
                                                i11 = i10;
                                                activity4 = activity2;
                                                pVar6 = pVar3;
                                                aVar = aVarA;
                                                p079h8.A a12 = p079h8.A.f21846a;
                                                aVarA = aVar;
                                                str6 = str3;
                                                pVar5 = pVar6;
                                                i10 = i11;
                                                wallpaperColors4 = wallpaperColors2;
                                                jVar5 = jVar4;
                                                jVar5.T0(i10, wallpaperColors4.getColorHints());
                                                I iB = C0803b0.b();
                                                b bVar3 = new b(jVar5, null);
                                                this.f22468E = jVar5;
                                                this.f22479q = pVar5;
                                                this.f22480r = activity4;
                                                this.f22481s = wallpaperColors4;
                                                this.f22482t = str6;
                                                this.f22483u = aVarA;
                                                this.f22484v = null;
                                                this.f22485w = null;
                                                this.f22486x = null;
                                                this.f22467D = 5;
                                                objG2 = AbstractC0812g.g(iB, bVar3, this);
                                                if (objG2 == obj3) {
                                                    activity5 = activity4;
                                                    WallpaperColors wallpaperColors7 = wallpaperColors4;
                                                    p pVar7 = pVar5;
                                                    J6.a aVar3 = aVarA;
                                                    jVar5.f22365g.g(str4 + G6.g.d(aVar3, activity5) + str7);
                                                    jVar5.y0().t(activity5, aVar3, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors7, pVar7);
                                                }
                                            }
                                        } else {
                                            str6 = str3;
                                            activity4 = activity2;
                                            pVar5 = pVar3;
                                            wallpaperColors4 = wallpaperColors2;
                                            jVar5 = jVar4;
                                            jVar5.T0(i10, wallpaperColors4.getColorHints());
                                            I iB2 = C0803b0.b();
                                            b bVar4 = new b(jVar5, null);
                                            this.f22468E = jVar5;
                                            this.f22479q = pVar5;
                                            this.f22480r = activity4;
                                            this.f22481s = wallpaperColors4;
                                            this.f22482t = str6;
                                            this.f22483u = aVarA;
                                            this.f22484v = null;
                                            this.f22485w = null;
                                            this.f22486x = null;
                                            this.f22467D = 5;
                                            objG2 = AbstractC0812g.g(iB2, bVar4, this);
                                            if (objG2 == obj3) {
                                                activity5 = activity4;
                                                WallpaperColors wallpaperColors8 = wallpaperColors4;
                                                p pVar8 = pVar5;
                                                J6.a aVar4 = aVarA;
                                                jVar5.f22365g.g(str4 + G6.g.d(aVar4, activity5) + str7);
                                                jVar5.y0().t(activity5, aVar4, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors8, pVar8);
                                            }
                                        }
                                    }
                                } else {
                                    jVar2.f22365g.g("setWallpaper for image.");
                                    bVarE0 = jVar2.e0();
                                    if (bVarE0 != null) {
                                        bVarE0.v();
                                        p079h8.A a13 = p079h8.A.f21846a;
                                    }
                                    z14 = true;
                                    if (i10 != 1) {
                                        z14 = false;
                                    }
                                    p079h8.h hVarB = p079h8.i.b(new p219v8.a() { // from class: j7.k
                                        @Override // p219v8.a
                                        public final Object invoke() {
                                            return Boolean.valueOf(j.o.u());
                                        }
                                    });
                                    z15 = jVar2.l0() instanceof p7.a.c;
                                    c10 = new kotlin.jvm.internal.C();
                                    c10.f22777q = i10;
                                    if (i10 != 2 && v(hVarB)) {
                                        c0050aE = gVar2.e();
                                        if (c0050aE != null) {
                                            eVarB = c0050aE.b();
                                        } else {
                                            eVarB = null;
                                        }
                                        gVarK = jVar2.u0().k();
                                        if (gVarK != null || (c0050aE2 = gVarK.e()) == null) {
                                            eVarB2 = null;
                                        } else {
                                            eVarB2 = c0050aE2.b();
                                        }
                                        boolean zD = kotlin.jvm.internal.n.d(eVarB, eVarB2);
                                        if (z15 || !zD) {
                                            int i13 = z14 ? 0 : 2;
                                            jCurrentTimeMillis = System.currentTimeMillis();
                                            str = "set ";
                                            jVar2.f22365g.g("start run blurDaemon.");
                                            I iB3 = C0803b0.b();
                                            Object obj5 = obj3;
                                            d dVar = new d(i13, null);
                                            this.f22468E = jVar2;
                                            this.f22479q = pVar3;
                                            this.f22480r = activity2;
                                            this.f22481s = e13;
                                            this.f22482t = gVar2;
                                            this.f22483u = iVar;
                                            this.f22484v = wallpaperColors2;
                                            this.f22485w = c10;
                                            this.f22486x = null;
                                            this.f22487y = null;
                                            this.f22465B = i10;
                                            this.f22466C = jCurrentTimeMillis;
                                            this.f22467D = 6;
                                            objG = AbstractC0812g.g(iB3, dVar, this);
                                            obj4 = obj5;
                                            if (objG == obj4) {
                                                return obj4;
                                            }
                                            e16 = e13;
                                            c12 = c10;
                                            iVar3 = iVar;
                                            jVar3 = jVar2;
                                            boolean zBooleanValue = ((Boolean) objG).booleanValue();
                                            jVar3.f22365g.g("blurDaemon run result: " + zBooleanValue + ", consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                            i10 = i10;
                                            c11 = c12;
                                            iVar2 = iVar3;
                                            e15 = e16;
                                            wallpaperColors3 = wallpaperColors2;
                                            activity3 = activity2;
                                            pVar4 = pVar3;
                                            jVar3.u0().v(gVar2);
                                            jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                                            jVar3.T0(i10, wallpaperColors3.getColorHints());
                                            I iB4 = C0803b0.b();
                                            c cVar = new c(jVar3, c11, null);
                                            this.f22468E = jVar3;
                                            this.f22479q = pVar4;
                                            this.f22480r = activity3;
                                            this.f22481s = e15;
                                            this.f22482t = iVar2;
                                            this.f22483u = wallpaperColors3;
                                            this.f22484v = c11;
                                            this.f22485w = e15;
                                            this.f22486x = null;
                                            this.f22487y = null;
                                            this.f22467D = 7;
                                            objG3 = AbstractC0812g.g(iB4, cVar, this);
                                            if (objG3 == obj4) {
                                                return obj4;
                                            }
                                            wallpaperColors5 = wallpaperColors3;
                                            jVar6 = jVar3;
                                            e18 = e15;
                                            p pVar9 = pVar4;
                                            Activity activity6 = activity3;
                                            e15.f22779q = objG3;
                                            j jVar9 = jVar6;
                                            jVar6.y0().r(activity6, jVar9.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar9.f22372n, wallpaperColors5, pVar9);
                                        } else {
                                            c10.f22777q = 2;
                                        }
                                    }
                                    str = "set ";
                                    obj4 = obj3;
                                    c11 = c10;
                                    iVar2 = iVar;
                                    jVar3 = jVar2;
                                    e15 = e13;
                                    wallpaperColors3 = wallpaperColors2;
                                    pVar4 = pVar3;
                                    activity3 = activity2;
                                    jVar3.u0().v(gVar2);
                                    jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                                    jVar3.T0(i10, wallpaperColors3.getColorHints());
                                    I iB5 = C0803b0.b();
                                    c cVar2 = new c(jVar3, c11, null);
                                    this.f22468E = jVar3;
                                    this.f22479q = pVar4;
                                    this.f22480r = activity3;
                                    this.f22481s = e15;
                                    this.f22482t = iVar2;
                                    this.f22483u = wallpaperColors3;
                                    this.f22484v = c11;
                                    this.f22485w = e15;
                                    this.f22486x = null;
                                    this.f22487y = null;
                                    this.f22467D = 7;
                                    objG3 = AbstractC0812g.g(iB5, cVar2, this);
                                    if (objG3 == obj4) {
                                        return obj4;
                                    }
                                    wallpaperColors5 = wallpaperColors3;
                                    jVar6 = jVar3;
                                    e18 = e15;
                                    p pVar10 = pVar4;
                                    Activity activity7 = activity3;
                                    e15.f22779q = objG3;
                                    j jVar10 = jVar6;
                                    jVar6.y0().r(activity7, jVar10.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar10.f22372n, wallpaperColors5, pVar10);
                                }
                            }
                            return obj3;
                        }
                        pVar2.a(new IllegalStateException("setWallpaper but buildEffectInfo return null."));
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 1:
                        z10 = this.f22464A;
                        i10 = this.f22465B;
                        z9 = this.f22488z;
                        iWallpaperEngine = (IWallpaperEngine) this.f22484v;
                        e12 = (E) this.f22483u;
                        e11 = (E) this.f22482t;
                        e10 = (E) this.f22481s;
                        activity = (Activity) this.f22480r;
                        pVar2 = (p) this.f22479q;
                        jVar = (j) this.f22468E;
                        p079h8.r.b(obj);
                        objX = obj;
                        uVar = (p079h8.u) objX;
                        if (uVar == null) {
                            gVar = (C6.g) uVar.a();
                            iVar = (C6.i) uVar.b();
                            wallpaperColors = (WallpaperColors) uVar.c();
                            p167q6.b bVar5 = jVar.f22365g;
                            String strB2 = G6.g.b(i10);
                            z11 = z9;
                            StringBuilder sb2 = new StringBuilder();
                            z12 = z10;
                            sb2.append("start set PreviewImageWallpaper to ");
                            sb2.append(strB2);
                            bVar5.g(sb2.toString());
                            if (jVar.c0() != null) {
                                throw new IllegalArgumentException("setWallpaper: select blur but BlurHelper is NULL.");
                            }
                            this.f22468E = jVar;
                            this.f22479q = pVar2;
                            this.f22480r = activity;
                            this.f22481s = e10;
                            this.f22482t = e11;
                            this.f22483u = e12;
                            this.f22484v = iWallpaperEngine;
                            this.f22485w = gVar;
                            this.f22486x = iVar;
                            this.f22487y = wallpaperColors;
                            this.f22465B = i10;
                            z13 = z12;
                            this.f22488z = z13;
                            this.f22467D = 2;
                            obj3 = objE;
                            if (jVar.P0(z11, this) != obj3) {
                                e13 = e10;
                                jVar2 = jVar;
                                gVar2 = gVar;
                                pVar3 = pVar2;
                                activity2 = activity;
                                e14 = e11;
                                iWallpaperEngine2 = iWallpaperEngine;
                                wallpaperColors2 = wallpaperColors;
                                if (z13) {
                                    c0050aE3 = gVar2.e();
                                    str2 = "ORIGIN";
                                    if (c0050aE3 != null) {
                                        strA = "ORIGIN";
                                    } else {
                                        strA = "ORIGIN";
                                    }
                                    if (kotlin.jvm.internal.n.d(jVar2.l0(), p7.a.b.f23770b)) {
                                        str2 = strA;
                                    } else {
                                        str2 = strA;
                                    }
                                    InterfaceC0880f interfaceC0880fD1 = jVar2.d0();
                                    this.f22468E = jVar2;
                                    this.f22479q = pVar3;
                                    this.f22480r = activity2;
                                    this.f22481s = e14;
                                    this.f22482t = e12;
                                    this.f22483u = iWallpaperEngine2;
                                    this.f22484v = gVar2;
                                    this.f22485w = wallpaperColors2;
                                    this.f22486x = str2;
                                    this.f22487y = null;
                                    this.f22465B = i10;
                                    this.f22467D = 3;
                                    objX2 = AbstractC0882h.x(interfaceC0880fD1, this);
                                    if (objX2 != obj3) {
                                        E e110 = e14;
                                        jVar4 = jVar2;
                                        e17 = e110;
                                        str3 = str2;
                                        str5 = (String) ((Map) objX2).get(str3);
                                        if (str5 != null) {
                                            pVar3.a(null);
                                            jVar4.f22365g.g("didn't find path for pathType " + str3 + ".");
                                            return p079h8.A.f21846a;
                                        }
                                        jVar4.f22365g.g("set blur file path:" + str5);
                                        e17.f22779q = str5;
                                        e12.f22779q = wallpaperColors2;
                                        aVarA = G6.e.a(jVar4.u0(), gVar2, wallpaperColors2, jVar4.b0());
                                        if (iWallpaperEngine2 != null) {
                                            this.f22468E = jVar4;
                                            this.f22479q = pVar3;
                                            this.f22480r = activity2;
                                            this.f22481s = wallpaperColors2;
                                            this.f22482t = str3;
                                            this.f22483u = aVarA;
                                            this.f22484v = null;
                                            this.f22485w = null;
                                            this.f22486x = null;
                                            this.f22465B = i10;
                                            this.f22467D = 4;
                                            if (jVar4.V0(aVarA, i10, iWallpaperEngine2, this) == obj3) {
                                                i11 = i10;
                                                activity4 = activity2;
                                                pVar6 = pVar3;
                                                aVar = aVarA;
                                                p079h8.A a14 = p079h8.A.f21846a;
                                                aVarA = aVar;
                                                str6 = str3;
                                                pVar5 = pVar6;
                                                i10 = i11;
                                                wallpaperColors4 = wallpaperColors2;
                                                jVar5 = jVar4;
                                                jVar5.T0(i10, wallpaperColors4.getColorHints());
                                                I iB6 = C0803b0.b();
                                                b bVar6 = new b(jVar5, null);
                                                this.f22468E = jVar5;
                                                this.f22479q = pVar5;
                                                this.f22480r = activity4;
                                                this.f22481s = wallpaperColors4;
                                                this.f22482t = str6;
                                                this.f22483u = aVarA;
                                                this.f22484v = null;
                                                this.f22485w = null;
                                                this.f22486x = null;
                                                this.f22467D = 5;
                                                objG2 = AbstractC0812g.g(iB6, bVar6, this);
                                                if (objG2 == obj3) {
                                                    activity5 = activity4;
                                                    WallpaperColors wallpaperColors9 = wallpaperColors4;
                                                    p pVar11 = pVar5;
                                                    J6.a aVar5 = aVarA;
                                                    jVar5.f22365g.g(str4 + G6.g.d(aVar5, activity5) + str7);
                                                    jVar5.y0().t(activity5, aVar5, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors9, pVar11);
                                                }
                                            }
                                        } else {
                                            str6 = str3;
                                            activity4 = activity2;
                                            pVar5 = pVar3;
                                            wallpaperColors4 = wallpaperColors2;
                                            jVar5 = jVar4;
                                            jVar5.T0(i10, wallpaperColors4.getColorHints());
                                            I iB7 = C0803b0.b();
                                            b bVar7 = new b(jVar5, null);
                                            this.f22468E = jVar5;
                                            this.f22479q = pVar5;
                                            this.f22480r = activity4;
                                            this.f22481s = wallpaperColors4;
                                            this.f22482t = str6;
                                            this.f22483u = aVarA;
                                            this.f22484v = null;
                                            this.f22485w = null;
                                            this.f22486x = null;
                                            this.f22467D = 5;
                                            objG2 = AbstractC0812g.g(iB7, bVar7, this);
                                            if (objG2 == obj3) {
                                                activity5 = activity4;
                                                WallpaperColors wallpaperColors10 = wallpaperColors4;
                                                p pVar12 = pVar5;
                                                J6.a aVar6 = aVarA;
                                                jVar5.f22365g.g(str4 + G6.g.d(aVar6, activity5) + str7);
                                                jVar5.y0().t(activity5, aVar6, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors10, pVar12);
                                            }
                                        }
                                    }
                                } else {
                                    jVar2.f22365g.g("setWallpaper for image.");
                                    bVarE0 = jVar2.e0();
                                    if (bVarE0 != null) {
                                        bVarE0.v();
                                        p079h8.A a15 = p079h8.A.f21846a;
                                    }
                                    z14 = true;
                                    if (i10 != 1) {
                                        z14 = false;
                                    }
                                    p079h8.h hVarB2 = p079h8.i.b(new p219v8.a() { // from class: j7.k
                                        @Override // p219v8.a
                                        public final Object invoke() {
                                            return Boolean.valueOf(j.o.u());
                                        }
                                    });
                                    z15 = jVar2.l0() instanceof p7.a.c;
                                    c10 = new kotlin.jvm.internal.C();
                                    c10.f22777q = i10;
                                    if (i10 != 2) {
                                        c0050aE = gVar2.e();
                                        if (c0050aE != null) {
                                            eVarB = c0050aE.b();
                                        } else {
                                            eVarB = null;
                                        }
                                        gVarK = jVar2.u0().k();
                                        if (gVarK != null) {
                                            eVarB2 = null;
                                        } else {
                                            eVarB2 = null;
                                        }
                                        boolean zD2 = kotlin.jvm.internal.n.d(eVarB, eVarB2);
                                        if (z15) {
                                        }
                                        if (z14) {
                                        }
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                        str = "set ";
                                        jVar2.f22365g.g("start run blurDaemon.");
                                        I iB8 = C0803b0.b();
                                        Object obj6 = obj3;
                                        d dVar2 = new d(i13, null);
                                        this.f22468E = jVar2;
                                        this.f22479q = pVar3;
                                        this.f22480r = activity2;
                                        this.f22481s = e13;
                                        this.f22482t = gVar2;
                                        this.f22483u = iVar;
                                        this.f22484v = wallpaperColors2;
                                        this.f22485w = c10;
                                        this.f22486x = null;
                                        this.f22487y = null;
                                        this.f22465B = i10;
                                        this.f22466C = jCurrentTimeMillis;
                                        this.f22467D = 6;
                                        objG = AbstractC0812g.g(iB8, dVar2, this);
                                        obj4 = obj6;
                                        if (objG == obj4) {
                                            return obj4;
                                        }
                                        e16 = e13;
                                        c12 = c10;
                                        iVar3 = iVar;
                                        jVar3 = jVar2;
                                        boolean zBooleanValue2 = ((Boolean) objG).booleanValue();
                                        jVar3.f22365g.g("blurDaemon run result: " + zBooleanValue2 + ", consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                        i10 = i10;
                                        c11 = c12;
                                        iVar2 = iVar3;
                                        e15 = e16;
                                        wallpaperColors3 = wallpaperColors2;
                                        activity3 = activity2;
                                        pVar4 = pVar3;
                                        jVar3.u0().v(gVar2);
                                        jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                                        jVar3.T0(i10, wallpaperColors3.getColorHints());
                                        I iB9 = C0803b0.b();
                                        c cVar3 = new c(jVar3, c11, null);
                                        this.f22468E = jVar3;
                                        this.f22479q = pVar4;
                                        this.f22480r = activity3;
                                        this.f22481s = e15;
                                        this.f22482t = iVar2;
                                        this.f22483u = wallpaperColors3;
                                        this.f22484v = c11;
                                        this.f22485w = e15;
                                        this.f22486x = null;
                                        this.f22487y = null;
                                        this.f22467D = 7;
                                        objG3 = AbstractC0812g.g(iB9, cVar3, this);
                                        if (objG3 == obj4) {
                                            return obj4;
                                        }
                                        wallpaperColors5 = wallpaperColors3;
                                        jVar6 = jVar3;
                                        e18 = e15;
                                        p pVar13 = pVar4;
                                        Activity activity8 = activity3;
                                        e15.f22779q = objG3;
                                        j jVar11 = jVar6;
                                        jVar6.y0().r(activity8, jVar11.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar11.f22372n, wallpaperColors5, pVar13);
                                    }
                                    str = "set ";
                                    obj4 = obj3;
                                    c11 = c10;
                                    iVar2 = iVar;
                                    jVar3 = jVar2;
                                    e15 = e13;
                                    wallpaperColors3 = wallpaperColors2;
                                    pVar4 = pVar3;
                                    activity3 = activity2;
                                    jVar3.u0().v(gVar2);
                                    jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                                    jVar3.T0(i10, wallpaperColors3.getColorHints());
                                    I iB10 = C0803b0.b();
                                    c cVar4 = new c(jVar3, c11, null);
                                    this.f22468E = jVar3;
                                    this.f22479q = pVar4;
                                    this.f22480r = activity3;
                                    this.f22481s = e15;
                                    this.f22482t = iVar2;
                                    this.f22483u = wallpaperColors3;
                                    this.f22484v = c11;
                                    this.f22485w = e15;
                                    this.f22486x = null;
                                    this.f22487y = null;
                                    this.f22467D = 7;
                                    objG3 = AbstractC0812g.g(iB10, cVar4, this);
                                    if (objG3 == obj4) {
                                        return obj4;
                                    }
                                    wallpaperColors5 = wallpaperColors3;
                                    jVar6 = jVar3;
                                    e18 = e15;
                                    p pVar14 = pVar4;
                                    Activity activity9 = activity3;
                                    e15.f22779q = objG3;
                                    j jVar12 = jVar6;
                                    jVar6.y0().r(activity9, jVar12.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar12.f22372n, wallpaperColors5, pVar14);
                                }
                            }
                            return obj3;
                        }
                        pVar2.a(new IllegalStateException("setWallpaper but buildEffectInfo return null."));
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 2:
                        z13 = this.f22488z;
                        int i14 = this.f22465B;
                        WallpaperColors wallpaperColors11 = (WallpaperColors) this.f22487y;
                        C6.i iVar4 = (C6.i) this.f22486x;
                        C6.g gVar3 = (C6.g) this.f22485w;
                        IWallpaperEngine iWallpaperEngine4 = (IWallpaperEngine) this.f22484v;
                        E e20 = (E) this.f22483u;
                        E e21 = (E) this.f22482t;
                        e13 = (E) this.f22481s;
                        Activity activity10 = (Activity) this.f22480r;
                        p pVar15 = (p) this.f22479q;
                        j jVar13 = (j) this.f22468E;
                        p079h8.r.b(obj);
                        activity2 = activity10;
                        i10 = i14;
                        iWallpaperEngine2 = iWallpaperEngine4;
                        pVar3 = pVar15;
                        wallpaperColors2 = wallpaperColors11;
                        gVar2 = gVar3;
                        obj3 = objE;
                        jVar2 = jVar13;
                        e12 = e20;
                        iVar = iVar4;
                        e14 = e21;
                        if (z13) {
                            c0050aE3 = gVar2.e();
                            str2 = "ORIGIN";
                            if (c0050aE3 != null) {
                                strA = "ORIGIN";
                            } else {
                                strA = "ORIGIN";
                            }
                            if (kotlin.jvm.internal.n.d(jVar2.l0(), p7.a.b.f23770b)) {
                                str2 = strA;
                            } else {
                                str2 = strA;
                            }
                            InterfaceC0880f interfaceC0880fD2 = jVar2.d0();
                            this.f22468E = jVar2;
                            this.f22479q = pVar3;
                            this.f22480r = activity2;
                            this.f22481s = e14;
                            this.f22482t = e12;
                            this.f22483u = iWallpaperEngine2;
                            this.f22484v = gVar2;
                            this.f22485w = wallpaperColors2;
                            this.f22486x = str2;
                            this.f22487y = null;
                            this.f22465B = i10;
                            this.f22467D = 3;
                            objX2 = AbstractC0882h.x(interfaceC0880fD2, this);
                            if (objX2 != obj3) {
                                E e111 = e14;
                                jVar4 = jVar2;
                                e17 = e111;
                                str3 = str2;
                                str5 = (String) ((Map) objX2).get(str3);
                                if (str5 != null) {
                                    pVar3.a(null);
                                    jVar4.f22365g.g("didn't find path for pathType " + str3 + ".");
                                    return p079h8.A.f21846a;
                                }
                                jVar4.f22365g.g("set blur file path:" + str5);
                                e17.f22779q = str5;
                                e12.f22779q = wallpaperColors2;
                                aVarA = G6.e.a(jVar4.u0(), gVar2, wallpaperColors2, jVar4.b0());
                                if (iWallpaperEngine2 != null) {
                                    this.f22468E = jVar4;
                                    this.f22479q = pVar3;
                                    this.f22480r = activity2;
                                    this.f22481s = wallpaperColors2;
                                    this.f22482t = str3;
                                    this.f22483u = aVarA;
                                    this.f22484v = null;
                                    this.f22485w = null;
                                    this.f22486x = null;
                                    this.f22465B = i10;
                                    this.f22467D = 4;
                                    if (jVar4.V0(aVarA, i10, iWallpaperEngine2, this) == obj3) {
                                        i11 = i10;
                                        activity4 = activity2;
                                        pVar6 = pVar3;
                                        aVar = aVarA;
                                        p079h8.A a16 = p079h8.A.f21846a;
                                        aVarA = aVar;
                                        str6 = str3;
                                        pVar5 = pVar6;
                                        i10 = i11;
                                        wallpaperColors4 = wallpaperColors2;
                                        jVar5 = jVar4;
                                        jVar5.T0(i10, wallpaperColors4.getColorHints());
                                        I iB11 = C0803b0.b();
                                        b bVar8 = new b(jVar5, null);
                                        this.f22468E = jVar5;
                                        this.f22479q = pVar5;
                                        this.f22480r = activity4;
                                        this.f22481s = wallpaperColors4;
                                        this.f22482t = str6;
                                        this.f22483u = aVarA;
                                        this.f22484v = null;
                                        this.f22485w = null;
                                        this.f22486x = null;
                                        this.f22467D = 5;
                                        objG2 = AbstractC0812g.g(iB11, bVar8, this);
                                        if (objG2 == obj3) {
                                            activity5 = activity4;
                                            WallpaperColors wallpaperColors12 = wallpaperColors4;
                                            p pVar16 = pVar5;
                                            J6.a aVar7 = aVarA;
                                            jVar5.f22365g.g(str4 + G6.g.d(aVar7, activity5) + str7);
                                            jVar5.y0().t(activity5, aVar7, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors12, pVar16);
                                            objB = p079h8.q.b(p079h8.A.f21846a);
                                            pVar = this.f22473J;
                                            thD = p079h8.q.d(objB);
                                            if (thD != null) {
                                                pVar.a(thD);
                                            }
                                            p079h8.q.a(objB);
                                            return p079h8.A.f21846a;
                                        }
                                    }
                                } else {
                                    str6 = str3;
                                    activity4 = activity2;
                                    pVar5 = pVar3;
                                    wallpaperColors4 = wallpaperColors2;
                                    jVar5 = jVar4;
                                    jVar5.T0(i10, wallpaperColors4.getColorHints());
                                    I iB12 = C0803b0.b();
                                    b bVar9 = new b(jVar5, null);
                                    this.f22468E = jVar5;
                                    this.f22479q = pVar5;
                                    this.f22480r = activity4;
                                    this.f22481s = wallpaperColors4;
                                    this.f22482t = str6;
                                    this.f22483u = aVarA;
                                    this.f22484v = null;
                                    this.f22485w = null;
                                    this.f22486x = null;
                                    this.f22467D = 5;
                                    objG2 = AbstractC0812g.g(iB12, bVar9, this);
                                    if (objG2 == obj3) {
                                        activity5 = activity4;
                                        WallpaperColors wallpaperColors13 = wallpaperColors4;
                                        p pVar17 = pVar5;
                                        J6.a aVar8 = aVarA;
                                        jVar5.f22365g.g(str4 + G6.g.d(aVar8, activity5) + str7);
                                        jVar5.y0().t(activity5, aVar8, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors13, pVar17);
                                        objB = p079h8.q.b(p079h8.A.f21846a);
                                        pVar = this.f22473J;
                                        thD = p079h8.q.d(objB);
                                        if (thD != null) {
                                            pVar.a(thD);
                                        }
                                        p079h8.q.a(objB);
                                        return p079h8.A.f21846a;
                                    }
                                }
                            }
                            return obj3;
                        }
                        jVar2.f22365g.g("setWallpaper for image.");
                        bVarE0 = jVar2.e0();
                        if (bVarE0 != null) {
                            bVarE0.v();
                            p079h8.A a17 = p079h8.A.f21846a;
                        }
                        z14 = true;
                        if (i10 != 1) {
                            z14 = false;
                        }
                        p079h8.h hVarB3 = p079h8.i.b(new p219v8.a() { // from class: j7.k
                            @Override // p219v8.a
                            public final Object invoke() {
                                return Boolean.valueOf(j.o.u());
                            }
                        });
                        z15 = jVar2.l0() instanceof p7.a.c;
                        c10 = new kotlin.jvm.internal.C();
                        c10.f22777q = i10;
                        if (i10 != 2) {
                            c0050aE = gVar2.e();
                            if (c0050aE != null) {
                                eVarB = c0050aE.b();
                            } else {
                                eVarB = null;
                            }
                            gVarK = jVar2.u0().k();
                            if (gVarK != null) {
                                eVarB2 = null;
                            } else {
                                eVarB2 = null;
                            }
                            boolean zD3 = kotlin.jvm.internal.n.d(eVarB, eVarB2);
                            if (z15) {
                            }
                            if (z14) {
                            }
                            jCurrentTimeMillis = System.currentTimeMillis();
                            str = "set ";
                            jVar2.f22365g.g("start run blurDaemon.");
                            I iB13 = C0803b0.b();
                            Object obj7 = obj3;
                            d dVar3 = new d(i13, null);
                            this.f22468E = jVar2;
                            this.f22479q = pVar3;
                            this.f22480r = activity2;
                            this.f22481s = e13;
                            this.f22482t = gVar2;
                            this.f22483u = iVar;
                            this.f22484v = wallpaperColors2;
                            this.f22485w = c10;
                            this.f22486x = null;
                            this.f22487y = null;
                            this.f22465B = i10;
                            this.f22466C = jCurrentTimeMillis;
                            this.f22467D = 6;
                            objG = AbstractC0812g.g(iB13, dVar3, this);
                            obj4 = obj7;
                            if (objG == obj4) {
                                return obj4;
                            }
                            e16 = e13;
                            c12 = c10;
                            iVar3 = iVar;
                            jVar3 = jVar2;
                            boolean zBooleanValue3 = ((Boolean) objG).booleanValue();
                            jVar3.f22365g.g("blurDaemon run result: " + zBooleanValue3 + ", consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
                            i10 = i10;
                            c11 = c12;
                            iVar2 = iVar3;
                            e15 = e16;
                            wallpaperColors3 = wallpaperColors2;
                            activity3 = activity2;
                            pVar4 = pVar3;
                            jVar3.u0().v(gVar2);
                            jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                            jVar3.T0(i10, wallpaperColors3.getColorHints());
                            I iB14 = C0803b0.b();
                            c cVar5 = new c(jVar3, c11, null);
                            this.f22468E = jVar3;
                            this.f22479q = pVar4;
                            this.f22480r = activity3;
                            this.f22481s = e15;
                            this.f22482t = iVar2;
                            this.f22483u = wallpaperColors3;
                            this.f22484v = c11;
                            this.f22485w = e15;
                            this.f22486x = null;
                            this.f22487y = null;
                            this.f22467D = 7;
                            objG3 = AbstractC0812g.g(iB14, cVar5, this);
                            if (objG3 == obj4) {
                                return obj4;
                            }
                            wallpaperColors5 = wallpaperColors3;
                            jVar6 = jVar3;
                            e18 = e15;
                            p pVar18 = pVar4;
                            Activity activity11 = activity3;
                            e15.f22779q = objG3;
                            j jVar14 = jVar6;
                            jVar6.y0().r(activity11, jVar14.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar14.f22372n, wallpaperColors5, pVar18);
                            objB = p079h8.q.b(p079h8.A.f21846a);
                            pVar = this.f22473J;
                            thD = p079h8.q.d(objB);
                            if (thD != null) {
                                pVar.a(thD);
                            }
                            p079h8.q.a(objB);
                            return p079h8.A.f21846a;
                        }
                        str = "set ";
                        obj4 = obj3;
                        c11 = c10;
                        iVar2 = iVar;
                        jVar3 = jVar2;
                        e15 = e13;
                        wallpaperColors3 = wallpaperColors2;
                        pVar4 = pVar3;
                        activity3 = activity2;
                        jVar3.u0().v(gVar2);
                        jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                        jVar3.T0(i10, wallpaperColors3.getColorHints());
                        I iB15 = C0803b0.b();
                        c cVar6 = new c(jVar3, c11, null);
                        this.f22468E = jVar3;
                        this.f22479q = pVar4;
                        this.f22480r = activity3;
                        this.f22481s = e15;
                        this.f22482t = iVar2;
                        this.f22483u = wallpaperColors3;
                        this.f22484v = c11;
                        this.f22485w = e15;
                        this.f22486x = null;
                        this.f22487y = null;
                        this.f22467D = 7;
                        objG3 = AbstractC0812g.g(iB15, cVar6, this);
                        if (objG3 == obj4) {
                            return obj4;
                        }
                        wallpaperColors5 = wallpaperColors3;
                        jVar6 = jVar3;
                        e18 = e15;
                        p pVar19 = pVar4;
                        Activity activity12 = activity3;
                        e15.f22779q = objG3;
                        j jVar15 = jVar6;
                        jVar6.y0().r(activity12, jVar15.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar15.f22372n, wallpaperColors5, pVar19);
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 3:
                        int i15 = this.f22465B;
                        String str8 = (String) this.f22486x;
                        WallpaperColors wallpaperColors14 = (WallpaperColors) this.f22485w;
                        C6.g gVar4 = (C6.g) this.f22484v;
                        iWallpaperEngine2 = (IWallpaperEngine) this.f22483u;
                        E e22 = (E) this.f22482t;
                        E e23 = (E) this.f22481s;
                        activity2 = (Activity) this.f22480r;
                        pVar3 = (p) this.f22479q;
                        j jVar16 = (j) this.f22468E;
                        p079h8.r.b(obj);
                        str7 = " to manager.";
                        str4 = "set ";
                        e12 = e22;
                        obj3 = objE;
                        gVar2 = gVar4;
                        e17 = e23;
                        jVar4 = jVar16;
                        wallpaperColors2 = wallpaperColors14;
                        str3 = str8;
                        i10 = i15;
                        objX2 = obj;
                        str5 = (String) ((Map) objX2).get(str3);
                        if (str5 != null) {
                            pVar3.a(null);
                            jVar4.f22365g.g("didn't find path for pathType " + str3 + ".");
                            return p079h8.A.f21846a;
                        }
                        jVar4.f22365g.g("set blur file path:" + str5);
                        e17.f22779q = str5;
                        e12.f22779q = wallpaperColors2;
                        aVarA = G6.e.a(jVar4.u0(), gVar2, wallpaperColors2, jVar4.b0());
                        if (iWallpaperEngine2 != null) {
                            this.f22468E = jVar4;
                            this.f22479q = pVar3;
                            this.f22480r = activity2;
                            this.f22481s = wallpaperColors2;
                            this.f22482t = str3;
                            this.f22483u = aVarA;
                            this.f22484v = null;
                            this.f22485w = null;
                            this.f22486x = null;
                            this.f22465B = i10;
                            this.f22467D = 4;
                            if (jVar4.V0(aVarA, i10, iWallpaperEngine2, this) == obj3) {
                                i11 = i10;
                                activity4 = activity2;
                                pVar6 = pVar3;
                                aVar = aVarA;
                                p079h8.A a18 = p079h8.A.f21846a;
                                aVarA = aVar;
                                str6 = str3;
                                pVar5 = pVar6;
                                i10 = i11;
                                wallpaperColors4 = wallpaperColors2;
                                jVar5 = jVar4;
                                jVar5.T0(i10, wallpaperColors4.getColorHints());
                                I iB16 = C0803b0.b();
                                b bVar10 = new b(jVar5, null);
                                this.f22468E = jVar5;
                                this.f22479q = pVar5;
                                this.f22480r = activity4;
                                this.f22481s = wallpaperColors4;
                                this.f22482t = str6;
                                this.f22483u = aVarA;
                                this.f22484v = null;
                                this.f22485w = null;
                                this.f22486x = null;
                                this.f22467D = 5;
                                objG2 = AbstractC0812g.g(iB16, bVar10, this);
                                if (objG2 == obj3) {
                                    activity5 = activity4;
                                    WallpaperColors wallpaperColors15 = wallpaperColors4;
                                    p pVar110 = pVar5;
                                    J6.a aVar9 = aVarA;
                                    jVar5.f22365g.g(str4 + G6.g.d(aVar9, activity5) + str7);
                                    jVar5.y0().t(activity5, aVar9, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors15, pVar110);
                                    objB = p079h8.q.b(p079h8.A.f21846a);
                                    pVar = this.f22473J;
                                    thD = p079h8.q.d(objB);
                                    if (thD != null) {
                                        pVar.a(thD);
                                    }
                                    p079h8.q.a(objB);
                                    return p079h8.A.f21846a;
                                }
                            }
                        } else {
                            str6 = str3;
                            activity4 = activity2;
                            pVar5 = pVar3;
                            wallpaperColors4 = wallpaperColors2;
                            jVar5 = jVar4;
                            jVar5.T0(i10, wallpaperColors4.getColorHints());
                            I iB17 = C0803b0.b();
                            b bVar11 = new b(jVar5, null);
                            this.f22468E = jVar5;
                            this.f22479q = pVar5;
                            this.f22480r = activity4;
                            this.f22481s = wallpaperColors4;
                            this.f22482t = str6;
                            this.f22483u = aVarA;
                            this.f22484v = null;
                            this.f22485w = null;
                            this.f22486x = null;
                            this.f22467D = 5;
                            objG2 = AbstractC0812g.g(iB17, bVar11, this);
                            if (objG2 == obj3) {
                                activity5 = activity4;
                                WallpaperColors wallpaperColors16 = wallpaperColors4;
                                p pVar111 = pVar5;
                                J6.a aVar10 = aVarA;
                                jVar5.f22365g.g(str4 + G6.g.d(aVar10, activity5) + str7);
                                jVar5.y0().t(activity5, aVar10, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors16, pVar111);
                                objB = p079h8.q.b(p079h8.A.f21846a);
                                pVar = this.f22473J;
                                thD = p079h8.q.d(objB);
                                if (thD != null) {
                                    pVar.a(thD);
                                }
                                p079h8.q.a(objB);
                                return p079h8.A.f21846a;
                            }
                        }
                        return obj3;
                    case 4:
                        i11 = this.f22465B;
                        aVar = (J6.a) this.f22483u;
                        str3 = (String) this.f22482t;
                        wallpaperColors2 = (WallpaperColors) this.f22481s;
                        activity4 = (Activity) this.f22480r;
                        pVar6 = (p) this.f22479q;
                        jVar4 = (j) this.f22468E;
                        p079h8.r.b(obj);
                        str7 = " to manager.";
                        str4 = "set ";
                        obj3 = objE;
                        p079h8.A a19 = p079h8.A.f21846a;
                        aVarA = aVar;
                        str6 = str3;
                        pVar5 = pVar6;
                        i10 = i11;
                        wallpaperColors4 = wallpaperColors2;
                        jVar5 = jVar4;
                        jVar5.T0(i10, wallpaperColors4.getColorHints());
                        I iB18 = C0803b0.b();
                        b bVar12 = new b(jVar5, null);
                        this.f22468E = jVar5;
                        this.f22479q = pVar5;
                        this.f22480r = activity4;
                        this.f22481s = wallpaperColors4;
                        this.f22482t = str6;
                        this.f22483u = aVarA;
                        this.f22484v = null;
                        this.f22485w = null;
                        this.f22486x = null;
                        this.f22467D = 5;
                        objG2 = AbstractC0812g.g(iB18, bVar12, this);
                        if (objG2 == obj3) {
                            return obj3;
                        }
                        activity5 = activity4;
                        WallpaperColors wallpaperColors17 = wallpaperColors4;
                        p pVar112 = pVar5;
                        J6.a aVar11 = aVarA;
                        jVar5.f22365g.g(str4 + G6.g.d(aVar11, activity5) + str7);
                        jVar5.y0().t(activity5, aVar11, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors17, pVar112);
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 5:
                        aVarA = (J6.a) this.f22483u;
                        wallpaperColors4 = (WallpaperColors) this.f22481s;
                        activity5 = (Activity) this.f22480r;
                        pVar5 = (p) this.f22479q;
                        jVar5 = (j) this.f22468E;
                        p079h8.r.b(obj);
                        str7 = " to manager.";
                        str4 = "set ";
                        objG2 = obj;
                        WallpaperColors wallpaperColors18 = wallpaperColors4;
                        p pVar113 = pVar5;
                        J6.a aVar12 = aVarA;
                        jVar5.f22365g.g(str4 + G6.g.d(aVar12, activity5) + str7);
                        jVar5.y0().t(activity5, aVar12, (Bitmap) objG2, null, 2, 1.0f, null, wallpaperColors18, pVar113);
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 6:
                        jCurrentTimeMillis = this.f22466C;
                        i10 = this.f22465B;
                        c12 = (kotlin.jvm.internal.C) this.f22485w;
                        wallpaperColors2 = (WallpaperColors) this.f22484v;
                        iVar3 = (C6.i) this.f22483u;
                        gVar2 = (C6.g) this.f22482t;
                        e16 = (E) this.f22481s;
                        activity2 = (Activity) this.f22480r;
                        pVar3 = (p) this.f22479q;
                        jVar3 = (j) this.f22468E;
                        p079h8.r.b(obj);
                        obj4 = objE;
                        str = "set ";
                        objG = obj;
                        boolean zBooleanValue4 = ((Boolean) objG).booleanValue();
                        jVar3.f22365g.g("blurDaemon run result: " + zBooleanValue4 + ", consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
                        i10 = i10;
                        c11 = c12;
                        iVar2 = iVar3;
                        e15 = e16;
                        wallpaperColors3 = wallpaperColors2;
                        activity3 = activity2;
                        pVar4 = pVar3;
                        jVar3.u0().v(gVar2);
                        jVar3.f22365g.g(str + G6.g.d(jVar3.u0(), activity3) + " to manager, state:" + jVar3.i0().getValue() + " depthBitmap:" + e15.f22779q);
                        jVar3.T0(i10, wallpaperColors3.getColorHints());
                        I iB19 = C0803b0.b();
                        c cVar7 = new c(jVar3, c11, null);
                        this.f22468E = jVar3;
                        this.f22479q = pVar4;
                        this.f22480r = activity3;
                        this.f22481s = e15;
                        this.f22482t = iVar2;
                        this.f22483u = wallpaperColors3;
                        this.f22484v = c11;
                        this.f22485w = e15;
                        this.f22486x = null;
                        this.f22487y = null;
                        this.f22467D = 7;
                        objG3 = AbstractC0812g.g(iB19, cVar7, this);
                        if (objG3 == obj4) {
                            return obj4;
                        }
                        wallpaperColors5 = wallpaperColors3;
                        jVar6 = jVar3;
                        e18 = e15;
                        p pVar114 = pVar4;
                        Activity activity13 = activity3;
                        e15.f22779q = objG3;
                        j jVar17 = jVar6;
                        jVar6.y0().r(activity13, jVar17.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar17.f22372n, wallpaperColors5, pVar114);
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 7:
                        e15 = (E) this.f22485w;
                        c11 = (kotlin.jvm.internal.C) this.f22484v;
                        WallpaperColors wallpaperColors19 = (WallpaperColors) this.f22483u;
                        iVar2 = (C6.i) this.f22482t;
                        E e24 = (E) this.f22481s;
                        activity3 = (Activity) this.f22480r;
                        pVar4 = (p) this.f22479q;
                        jVar6 = (j) this.f22468E;
                        p079h8.r.b(obj);
                        wallpaperColors5 = wallpaperColors19;
                        e18 = e24;
                        objG3 = obj;
                        p pVar115 = pVar4;
                        Activity activity14 = activity3;
                        e15.f22779q = objG3;
                        j jVar18 = jVar6;
                        jVar6.y0().r(activity14, jVar18.u0(), c11.f22777q, iVar2.a(), (Bitmap) e18.f22779q, jVar18.f22372n, wallpaperColors5, pVar115);
                        objB = p079h8.q.b(p079h8.A.f21846a);
                        pVar = this.f22473J;
                        thD = p079h8.q.d(objB);
                        if (thD != null) {
                            pVar.a(thD);
                        }
                        p079h8.q.a(objB);
                        return p079h8.A.f21846a;
                    case 8:
                        p079h8.r.b(obj);
                        obj2 = objE;
                        p079h8.A a110 = p079h8.A.f21846a;
                        InterfaceC0880f interfaceC0880fS2 = j.this.f22363e.S();
                        this.f22467D = 9;
                        objX3 = AbstractC0882h.x(interfaceC0880fS2, this);
                        if (objX3 == obj2) {
                            return obj2;
                        }
                        WallpaperColors wallpaperColors20 = (WallpaperColors) objX3;
                        j.this.T0(this.f22472I, wallpaperColors20.getColorHints());
                        j.this.y0().u(this.f22470G, j.this.u0(), null, this.f22472I, 1.0f, null, wallpaperColors20, this.f22473J);
                        p079h8.A a111 = p079h8.A.f21846a;
                        return p079h8.A.f21846a;
                    case 9:
                        p079h8.r.b(obj);
                        objX3 = obj;
                        WallpaperColors wallpaperColors21 = (WallpaperColors) objX3;
                        j.this.T0(this.f22472I, wallpaperColors21.getColorHints());
                        j.this.y0().u(this.f22470G, j.this.u0(), null, this.f22472I, 1.0f, null, wallpaperColors21, this.f22473J);
                        p079h8.A a112 = p079h8.A.f21846a;
                        return p079h8.A.f21846a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th) {
                h8.q.a aVar13 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
            }
        }
    }

    public static final class p implements U.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f22499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D6.b f22500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ E f22501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ E f22502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f22503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ E f22504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f22505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f22506i;

        p(Activity activity, D6.b bVar, E e10, E e11, List list, E e12, int i10, int i11) {
            this.f22499b = activity;
            this.f22500c = bVar;
            this.f22501d = e10;
            this.f22502e = e11;
            this.f22503f = list;
            this.f22504g = e12;
            this.f22505h = i10;
            this.f22506i = i11;
        }

        @Override // h3.U.a
        public void a(Throwable th) {
            j.this.f22365g.g("set wallpaper to " + G6.g.b(this.f22506i) + " failed, msg:" + (th != null ? th.getMessage() : null));
            D6.b bVar = this.f22500c;
            if (bVar != null) {
                bVar.B0(false);
            }
            j.this.A0(this.f22506i, this.f22505h);
        }

        @Override // h3.U.a
        public void b(x xVar, int i10) {
            p167q6.b bVar = j.this.f22365g;
            String strD = xVar != null ? G6.g.d(xVar, this.f22499b) : null;
            bVar.g("set " + strD + " to " + G6.g.b(i10) + " success.");
            D6.b bVar2 = this.f22500c;
            if (bVar2 != null) {
                bVar2.B0(false);
            }
            j.this.B0(i10, (String) this.f22501d.f22779q, (WallpaperColors) this.f22502e.f22779q, this.f22503f, this.f22504g.f22779q != null, this.f22505h);
        }
    }

    public static final class q implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f22507q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f22508q;

            /* JADX INFO: renamed from: j7.j$q$a$a, reason: collision with other inner class name */
            public static final class C0561a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f22509q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f22510r;

                public C0561a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f22509q = obj;
                    this.f22510r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f22508q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0561a c0561a;
                if (eVar instanceof C0561a) {
                    c0561a = (C0561a) eVar;
                    int i10 = c0561a.f22510r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0561a.f22510r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0561a = new C0561a(eVar);
                    }
                } else {
                    c0561a = new C0561a(eVar);
                }
                Object obj2 = c0561a.f22509q;
                Object objE = p139n8.b.e();
                int i11 = c0561a.f22510r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f22508q;
                    Object obj3 = ((Map) obj).get(C6.e.c.f643c);
                    c0561a.f22510r = 1;
                    if (interfaceC0881g.b(obj3, c0561a) == objE) {
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

        public q(InterfaceC0880f interfaceC0880f) {
            this.f22507q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f22507q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class r implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f22512q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f22513q;

            /* JADX INFO: renamed from: j7.j$r$a$a, reason: collision with other inner class name */
            public static final class C0562a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f22514q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f22515r;

                public C0562a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f22514q = obj;
                    this.f22515r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f22513q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0562a c0562a;
                if (eVar instanceof C0562a) {
                    c0562a = (C0562a) eVar;
                    int i10 = c0562a.f22515r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0562a.f22515r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0562a = new C0562a(eVar);
                    }
                } else {
                    c0562a = new C0562a(eVar);
                }
                Object obj2 = c0562a.f22514q;
                Object objE = p139n8.b.e();
                int i11 = c0562a.f22515r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f22513q;
                    Object objD = ((p079h8.o) obj).d();
                    c0562a.f22515r = 1;
                    if (interfaceC0881g.b(objD, c0562a) == objE) {
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

        public r(InterfaceC0880f interfaceC0880f) {
            this.f22512q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f22512q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class s implements Segmenter.b {
        s() {
        }

        @Override // com.nothing.wallpaper.segmenter.Segmenter.b
        public void a(Segmenter.ModuleState state) {
            kotlin.jvm.internal.n.h(state, "state");
            com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "segmenter state change:" + state);
            j.this.C0();
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22518q;

        t(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return j.this.new t(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((t) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f22518q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            j jVar = j.this;
            Bitmap bitmap = jVar.f22355O;
            kotlin.jvm.internal.n.e(bitmap);
            if (jVar.Y(bitmap)) {
                j.this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.NO_OVERLAP));
            }
            return p079h8.A.f21846a;
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22520q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p148o7.g f22521r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ j f22522s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f22523q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f22524r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ j f22525s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, p129m8.e eVar) {
                super(2, eVar);
                this.f22525s = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f22525s, eVar);
                aVar.f22524r = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                J7.i iVarP0;
                p139n8.b.e();
                if (this.f22523q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                if (kotlin.jvm.internal.n.d((Boolean) this.f22524r, kotlin.coroutines.jvm.internal.b.a(false)) && (iVarP0 = this.f22525s.p0()) != null) {
                    iVarP0.R0(false, false);
                }
                return p079h8.A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Boolean bool, p129m8.e eVar) {
                return ((a) create(bool, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(p148o7.g gVar, j jVar, p129m8.e eVar) {
            super(2, eVar);
            this.f22521r = gVar;
            this.f22522s = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new u(this.f22521r, this.f22522s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((u) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f22520q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                O oE0 = this.f22521r.e0();
                a aVar = new a(this.f22522s, null);
                this.f22520q = 1;
                if (AbstractC0882h.i(oE0, aVar, this) == objE) {
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

    static final class v extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22526q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f22527r;

        v(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            v vVar = new v(eVar);
            vVar.f22527r = obj;
            return vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f22526q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f22527r;
                this.f22526q = 1;
                if (interfaceC0881g.b(null, this) == objE) {
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
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((v) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context appContext, p158p7.a editFrom, x wallpaper, D6.f wallpaperDataSource, p237x6.k kVar) {
        super(wallpaperDataSource);
        kotlin.jvm.internal.n.h(appContext, "appContext");
        kotlin.jvm.internal.n.h(editFrom, "editFrom");
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        kotlin.jvm.internal.n.h(wallpaperDataSource, "wallpaperDataSource");
        this.f22360b = appContext;
        this.f22361c = editFrom;
        this.f22362d = wallpaper;
        this.f22363e = wallpaperDataSource;
        this.f22364f = kVar;
        p167q6.b bVar = new p167q6.b("EditWallpaperViewModel");
        this.f22365g = bVar;
        p074h3.H hA = p074h3.I.a();
        kotlin.jvm.internal.n.f(hA, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector");
        this.f22368j = (K1.a) hA;
        this.f22369k = p079h8.i.b(new p219v8.a() { // from class: j7.b
            @Override // p219v8.a
            public final Object invoke() {
                return j.V(this.f22333q);
            }
        });
        z zVarB = G.b(1, 0, null, 6, null);
        this.f22371m = zVarB;
        this.f22372n = new J6.e(b0.a(this));
        this.f22373o = wallpaperDataSource instanceof D6.e ? new q(zVarB) : AbstractC0882h.A(new v(null));
        this.f22374p = wallpaperDataSource.S();
        z zVarB2 = G.b(1, 0, null, 6, null);
        this.f22375q = zVarB2;
        this.f22376r = zVarB2;
        z zVarB3 = G.b(1, 0, null, 6, null);
        this.f22378t = zVarB3;
        this.f22379u = new r(zVarB3);
        H h10 = new H(LoadingState.None.INSTANCE);
        this.f22380v = h10;
        this.f22381w = h10;
        this.f22383y = p079h8.i.b(new p219v8.a() { // from class: j7.c
            @Override // p219v8.a
            public final Object invoke() {
                return j.e1(this.f22334q);
            }
        });
        this.f22342B = F6.a.f1731a.a();
        p7.a.b bVar2 = p7.a.b.f23770b;
        this.f22343C = !kotlin.jvm.internal.n.d(editFrom, bVar2);
        boolean zP = p074h3.I.a().C().p();
        this.f22344D = zP;
        boolean z9 = !wallpaper.s() && zP;
        this.f22345E = z9;
        this.f22346F = p079h8.i.b(new p219v8.a() { // from class: j7.d
            @Override // p219v8.a
            public final Object invoke() {
                return j.S0();
            }
        });
        this.f22347G = p079h8.i.b(new p219v8.a() { // from class: j7.e
            @Override // p219v8.a
            public final Object invoke() {
                return j.R0(this.f22335q);
            }
        });
        this.f22348H = p079h8.i.b(new p219v8.a() { // from class: j7.f
            @Override // p219v8.a
            public final Object invoke() {
                return j.K0(this.f22336q);
            }
        });
        this.f22349I = p079h8.i.b(new p219v8.a() { // from class: j7.g
            @Override // p219v8.a
            public final Object invoke() {
                return j.J0(this.f22337q);
            }
        });
        A a10 = Q.a(DepthEffectState.Initializing.INSTANCE);
        this.f22352L = a10;
        this.f22353M = AbstractC0882h.b(a10);
        s sVar = new s();
        this.f22358R = sVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (wallpaper.s()) {
            linkedHashSet.add(p108k7.a.Glass);
        }
        if (G6.e.g(wallpaper, appContext) && (G6.e.i(wallpaper) || (kotlin.jvm.internal.n.d(editFrom, p158p7.a.C0628a.f23769b) && G6.e.q(wallpaper, appContext)))) {
            linkedHashSet.add(p108k7.a.Blur);
        }
        this.f22377s = linkedHashSet;
        bVar.a("defaultEffects:" + linkedHashSet);
        if (!kotlin.jvm.internal.n.d(editFrom, bVar2) || G6.e.i(wallpaper)) {
            p227w6.a aVarO = o(p079h8.i.b(new p219v8.a() { // from class: j7.h
                @Override // p219v8.a
                public final Object invoke() {
                    return j.n(this.f22338q);
                }
            }));
            this.f22370l = aVarO != null ? new D6.d(aVarO) : null;
        }
        if (z9) {
            t0().b(sVar);
        }
        M0();
        F0();
        this.f22359S = p079h8.i.b(new p219v8.a() { // from class: j7.i
            @Override // p219v8.a
            public final Object invoke() {
                return j.a0(this.f22339q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(int i10, int i11) {
        InterfaceC0846x0 interfaceC0846x0 = this.f22382x;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f22382x = null;
        X0(new LoadingState.End(false));
        T0(i10, i11);
        p098j7.m.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int i10, String str, WallpaperColors wallpaperColors, List list, boolean z9, int i11) {
        J7.i iVar;
        J7.i iVar2;
        O oL;
        Rect rect;
        if (this.f22355O != null && (iVar2 = this.f22367i) != null && (oL = iVar2.L()) != null && (rect = (Rect) oL.getValue()) != null) {
            J7.i.f3674d0.e(this.f22360b, rect);
        }
        if (!kotlin.jvm.internal.n.d(this.f22361c, p7.a.b.f23770b) && (i10 == 1 || i10 == 2)) {
            J7.i.f3674d0.d(this.f22360b);
        }
        if (!f22340T.b(this.f22360b) && (iVar = this.f22367i) != null) {
            J7.i.S0(iVar, false, false, 2, null);
        }
        if (str == null || wallpaperColors == null) {
            D0();
        } else {
            AbstractC0816i.d(b0.a(this), null, null, new g(str, i10, i11, wallpaperColors, null), 3, null);
        }
        R7.d.f7114r.e(this.f22360b, this.f22362d, list, z9, i10);
        p098j7.m.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0() {
        if (j0()) {
            this.f22352L.setValue(DepthEffectState.DepthOn.INSTANCE);
            return;
        }
        if (!this.f22362d.t()) {
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.NOT_SUPPORT));
            return;
        }
        if (this.f22362d.s()) {
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.APPLIED_GLASS_EFFECT));
            return;
        }
        if (kotlin.jvm.internal.n.d(this.f22350J, Boolean.TRUE)) {
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.EXTENDED_WIDGET));
            return;
        }
        Segmenter.ModuleState moduleStateC = t0().c();
        if (moduleStateC instanceof Segmenter.ModuleState.Available) {
            if (j0()) {
                this.f22352L.setValue(DepthEffectState.DepthOn.INSTANCE);
            } else {
                b1(DepthEffectState.DepthOff.INSTANCE);
            }
        } else if (moduleStateC instanceof Segmenter.ModuleState.UnaAvailable) {
            this.f22352L.setValue(new DepthEffectState.ModuleUnavailable(false));
        } else if (moduleStateC instanceof Segmenter.ModuleState.Installing) {
            this.f22352L.setValue(new DepthEffectState.ModuleUnavailable(true));
        }
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "initDepthState switch:" + j0() + " state:" + this.f22353M.getValue() + " module:" + moduleStateC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        InterfaceC0846x0 interfaceC0846x0 = this.f22382x;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f22382x = null;
        X0(new LoadingState.End(true));
    }

    private final void E0() {
        p012b1.a.b(this.f22360b).d(new Intent("nothing.action.wallpaper.SET_WALLPAPER"));
    }

    private final void F0() {
        A6.c cVarC0 = c0();
        if ((this.f22363e instanceof D6.e) && this.f22364f != null && cVarC0 != null) {
            AbstractC0816i.d(b0.a(this), null, null, new h(null), 3, null);
        }
        AbstractC0816i.d(b0.a(this), null, null, new i(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(A6.c cVar) {
        cVar.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x022c  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0226, code lost:
    
        if (r1.b(r4, r2) == r3) goto L92;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01f3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x022c, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(java.util.List r17, java.util.List r18, p129m8.e r19) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p098j7.j.I0(java.util.List, java.util.List, m8.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p217v6.b J0(j jVar) {
        return new p217v6.b(jVar.r0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point K0(j jVar) {
        return NTDisplayAspectRatioLinearLayout.f18546r.a(jVar.f22360b, 2, Math.min(jVar.s0().x, jVar.s0().y));
    }

    private final void N0() {
        if (this.f22345E) {
            boolean zB = f22340T.b(this.f22360b);
            this.f22351K = zB;
            J7.i iVar = this.f22367i;
            if (iVar != null) {
                J7.i.S0(iVar, zB, false, 2, null);
            }
            com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "depthSwitchInSystem:" + this.f22351K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(Bitmap bitmap) {
        BitmapOpaqueUtil.k(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P0(boolean z9, p129m8.e eVar) {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i10 = kVar.f22452t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f22452t = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objX = kVar.f22450r;
        Object objE = p139n8.b.e();
        int i11 = kVar.f22452t;
        if (i11 == 0) {
            p079h8.r.b(objX);
            if (this.f22344D && !(this.f22361c instanceof p7.a.b)) {
                z zVar = this.f22371m;
                kVar.f22449q = z9;
                kVar.f22452t = 1;
                objX = AbstractC0882h.x(zVar, kVar);
                if (objX == objE) {
                    return objE;
                }
            }
            return p079h8.A.f21846a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z9 = kVar.f22449q;
        p079h8.r.b(objX);
        Map map = (Map) objX;
        p098j7.m.f22528a.g(z9 ? (Bitmap) map.get(C6.e.b.f642c) : (Bitmap) map.get(C6.e.c.f643c));
        return p079h8.A.f21846a;
    }

    public static final void Q0(Context context, boolean z9) {
        f22340T.c(context, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point R0(j jVar) {
        return H3.s.a().e(p074h3.I.a().e(jVar.f22360b).i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Segmenter S0() {
        return P7.b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(int i10, int i11) {
        if (i10 == 1 || i10 == 2) {
            F.f1542t.a(this.f22360b).q0(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A6.c V(j jVar) {
        p237x6.k kVar = jVar.f22364f;
        if (kVar == null) {
            return null;
        }
        A6.c cVar = new A6.c(jVar.f22360b);
        cVar.O0(kVar.p());
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(p064g3.k kVar, int i10, IWallpaperEngine iWallpaperEngine, p129m8.e eVar) {
        l lVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i11 = lVar.f22456t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f22456t = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objG = lVar.f22454r;
        Object objE = p139n8.b.e();
        int i12 = lVar.f22456t;
        if (i12 == 0) {
            p079h8.r.b(objG);
            if (!w.f15765i) {
                return p079h8.A.f21846a;
            }
            int iD = U.d(i10);
            I iB = C0803b0.b();
            m mVar = new m(iWallpaperEngine, iD, null);
            lVar.f22453q = kVar;
            lVar.f22456t = 1;
            objG = AbstractC0812g.g(iB, mVar, lVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (p064g3.k) lVar.f22453q;
            p079h8.r.b(objG);
        }
        WallpaperDescription wallpaperDescription = (WallpaperDescription) objG;
        if (wallpaperDescription != null) {
            kVar.C(wallpaperDescription);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x022c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00e6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01b4, please report this as an issue */
    public final Object X(C6.e eVar, p129m8.e eVar2) throws JSONException {
        d dVar;
        ViewScope viewScope;
        WallpaperColors wallpaperColors;
        List list;
        InterfaceC0880f interfaceC0880fN;
        j jVar;
        WallpaperColors wallpaperColors2;
        C6.e eVar3;
        ViewScope viewScope2;
        j jVar2;
        WallpaperColors wallpaperColors3;
        ViewScope viewScope3;
        Iterator it;
        Object next;
        C6.b bVar;
        p079h8.u uVar;
        Iterator it2;
        Object next2;
        C6.f fVar;
        if (eVar2 instanceof d) {
            dVar = (d) eVar2;
            int i10 = dVar.f22396w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f22396w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar2);
            }
        } else {
            dVar = new d(eVar2);
        }
        Object objX = dVar.f22394u;
        Object objE = p139n8.b.e();
        int i11 = dVar.f22396w;
        F6.a.b bVarA = null;
        if (i11 == 0) {
            p079h8.r.b(objX);
            if (this.f22364f == null) {
                throw new IllegalArgumentException("buildEffectInfo but assetManager is NULL.");
            }
            D6.f fVar2 = this.f22363e;
            if (!(fVar2 instanceof D6.e)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            InterfaceC0880f interfaceC0880fH0 = ((D6.e) fVar2).H0();
            dVar.f22390q = this;
            dVar.f22391r = eVar;
            dVar.f22396w = 1;
            objX = AbstractC0882h.x(interfaceC0880fH0, dVar);
            if (objX != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                wallpaperColors3 = (WallpaperColors) dVar.f22392s;
                viewScope3 = (ViewScope) dVar.f22391r;
                jVar2 = (j) dVar.f22390q;
                p079h8.r.b(objX);
                it = ((List) objX).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((C6.b) next).c() != C6.a.Setter);
                bVar = (C6.b) next;
                if (bVar != null) {
                    throw new IllegalArgumentException("buildEffectInfo but didn't received CroppedBitmap for CropType.Setter.");
                }
                if (!kotlin.jvm.internal.n.d(bVar.d(), viewScope3)) {
                    jVar2.f22365g.e("buildEffectInfo scope mismatch, cropScope=" + bVar.d() + ", colorScope=" + viewScope3 + ".");
                    return null;
                }
                if (kotlin.jvm.internal.n.d(jVar2.f22361c, p7.a.b.f23770b) && jVar2.f22362d.s()) {
                    bVarA = F6.a.b.f1732d.a(viewScope3.getScale());
                }
                uVar = new p079h8.u(new C6.g(jVar2.f22364f.p(), G6.c.l(bVar), bVarA), bVar.a(), wallpaperColors3);
                C6.g gVar = (C6.g) uVar.d();
                gVar.g(new p237x6.f(jVar2.f22364f));
                jVar2.f22365g.a("buildEffectInfo: " + gVar.c());
                return uVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wallpaperColors2 = (WallpaperColors) dVar.f22393t;
            viewScope2 = (ViewScope) dVar.f22392s;
            eVar3 = (C6.e) dVar.f22391r;
            jVar = (j) dVar.f22390q;
            p079h8.r.b(objX);
            list = (List) objX;
            j jVar3 = jVar;
            wallpaperColors = wallpaperColors2;
            this = jVar3;
            viewScope = viewScope2;
            eVar = eVar3;
            if (list != null) {
                it2 = list.iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.n.d(((C6.f) next2).b(), eVar));
                fVar = (C6.f) next2;
                if (fVar != null) {
                    if (fVar.d().c() == C6.a.Setter) {
                        throw new IllegalArgumentException("buildEffectInfo but effectCropped type is not CropType.Setter.");
                    }
                    if (!kotlin.jvm.internal.n.d(fVar.d().d(), viewScope)) {
                        this.f22365g.e("buildEffectInfo scope mismatch effectScope=" + fVar.d().d() + ", colorScope=" + viewScope + ".");
                        return null;
                    }
                    uVar = new p079h8.u(new C6.g(this.f22364f.p(), fVar.c().c(), fVar.c().b()), fVar.a(), wallpaperColors);
                    jVar2 = this;
                    C6.g gVar2 = (C6.g) uVar.d();
                    gVar2.g(new p237x6.f(jVar2.f22364f));
                    jVar2.f22365g.a("buildEffectInfo: " + gVar2.c());
                    return uVar;
                }
            }
            throw new IllegalArgumentException("buildEffectInfo but didn't received EffectBitmap for " + eVar.a() + " from wallpaperEffectBitmapDataSource.");
        }
        eVar = (C6.e) dVar.f22391r;
        this = (j) dVar.f22390q;
        p079h8.r.b(objX);
        p079h8.o oVar = (p079h8.o) objX;
        viewScope = (ViewScope) oVar.a();
        WallpaperColors wallpaperColors4 = (WallpaperColors) oVar.b();
        if (eVar != null) {
            D6.g gVar3 = this.f22370l;
            if (gVar3 == null) {
                throw new IllegalArgumentException("buildEffectInfo but assetManager is NULL.");
            }
            if (gVar3 == null || (interfaceC0880fN = gVar3.N()) == null) {
                wallpaperColors = wallpaperColors4;
                list = null;
            } else {
                dVar.f22390q = this;
                dVar.f22391r = eVar;
                dVar.f22392s = viewScope;
                dVar.f22393t = wallpaperColors4;
                dVar.f22396w = 3;
                Object objX2 = AbstractC0882h.x(interfaceC0880fN, dVar);
                if (objX2 != objE) {
                    jVar = this;
                    wallpaperColors2 = wallpaperColors4;
                    objX = objX2;
                    eVar3 = eVar;
                    viewScope2 = viewScope;
                    list = (List) objX;
                    j jVar4 = jVar;
                    wallpaperColors = wallpaperColors2;
                    this = jVar4;
                    viewScope = viewScope2;
                    eVar = eVar3;
                }
            }
            if (list != null) {
                it2 = list.iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.n.d(((C6.f) next2).b(), eVar));
                fVar = (C6.f) next2;
                if (fVar != null) {
                    if (fVar.d().c() == C6.a.Setter) {
                        throw new IllegalArgumentException("buildEffectInfo but effectCropped type is not CropType.Setter.");
                    }
                    if (!kotlin.jvm.internal.n.d(fVar.d().d(), viewScope)) {
                        this.f22365g.e("buildEffectInfo scope mismatch effectScope=" + fVar.d().d() + ", colorScope=" + viewScope + ".");
                        return null;
                    }
                    uVar = new p079h8.u(new C6.g(this.f22364f.p(), fVar.c().c(), fVar.c().b()), fVar.a(), wallpaperColors);
                    jVar2 = this;
                    C6.g gVar4 = (C6.g) uVar.d();
                    gVar4.g(new p237x6.f(jVar2.f22364f));
                    jVar2.f22365g.a("buildEffectInfo: " + gVar4.c());
                    return uVar;
                }
            }
            throw new IllegalArgumentException("buildEffectInfo but didn't received EffectBitmap for " + eVar.a() + " from wallpaperEffectBitmapDataSource.");
        }
        InterfaceC0880f interfaceC0880fT = ((D6.e) this.f22363e).t();
        dVar.f22390q = this;
        dVar.f22391r = viewScope;
        dVar.f22392s = wallpaperColors4;
        dVar.f22396w = 2;
        Object objX3 = AbstractC0882h.x(interfaceC0880fT, dVar);
        if (objX3 != objE) {
            jVar2 = this;
            wallpaperColors3 = wallpaperColors4;
            objX = objX3;
            viewScope3 = viewScope;
            it = ((List) objX).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C6.b) next).c() != C6.a.Setter);
            bVar = (C6.b) next;
            if (bVar != null) {
                throw new IllegalArgumentException("buildEffectInfo but didn't received CroppedBitmap for CropType.Setter.");
            }
            if (!kotlin.jvm.internal.n.d(bVar.d(), viewScope3)) {
                jVar2.f22365g.e("buildEffectInfo scope mismatch, cropScope=" + bVar.d() + ", colorScope=" + viewScope3 + ".");
                return null;
            }
            if (kotlin.jvm.internal.n.d(jVar2.f22361c, p7.a.b.f23770b)) {
                bVarA = F6.a.b.f1732d.a(viewScope3.getScale());
            }
            uVar = new p079h8.u(new C6.g(jVar2.f22364f.p(), G6.c.l(bVar), bVarA), bVar.a(), wallpaperColors3);
            C6.g gVar5 = (C6.g) uVar.d();
            gVar5.g(new p237x6.f(jVar2.f22364f));
            jVar2.f22365g.a("buildEffectInfo: " + gVar5.c());
            return uVar;
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(LoadingState loadingState) {
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "setSavingState state:" + loadingState);
        this.f22380v.l(loadingState);
        J7.i iVar = this.f22367i;
        if (iVar != null) {
            iVar.V0(loadingState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y(Bitmap bitmap) {
        Bitmap bitmap2;
        O oL;
        if (bitmap.isRecycled()) {
            com.nothing.wallpaper.common.log.c.o("EditWallpaperViewModel", "checkDepthApplicable depth bitmap is recycled");
            return false;
        }
        J7.i iVar = this.f22367i;
        Rect rect = (iVar == null || (oL = iVar.L()) == null) ? null : (Rect) oL.getValue();
        if (rect != null) {
            int width = (bitmap.getWidth() - s0().x) / 2;
            int height = (bitmap.getHeight() - s0().y) / 2;
            Rect rect2 = new Rect();
            rect2.set(rect.left + width, rect.top + height, rect.right + width, rect.bottom + height);
            float fD = L6.b.f4804a.d();
            com.nothing.wallpaper.common.log.c.o("EditWallpaperViewModel", "checkDepthApplicable overRate = " + fD);
            bitmap2 = bitmap;
            this.f22354N = BitmapOpaqueUtil.f(bitmap2, rect2, fD, 0, 8, null);
            if (kotlin.jvm.internal.n.d(this.f22350J, Boolean.TRUE)) {
                this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.EXTENDED_WIDGET));
            } else {
                BitmapOpaqueUtil.OpaquePercentage opaquePercentage = this.f22354N;
                if (opaquePercentage == BitmapOpaqueUtil.OpaquePercentage.SATISFIED) {
                    this.f22352L.setValue(j0() ? DepthEffectState.DepthOn.INSTANCE : DepthEffectState.DepthOff.INSTANCE);
                } else if (opaquePercentage == BitmapOpaqueUtil.OpaquePercentage.NO_OPAQUE) {
                    this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.NO_OVERLAP));
                } else if (opaquePercentage == BitmapOpaqueUtil.OpaquePercentage.EXCEEDED) {
                    this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.OVERLAP_TOO_MUCH));
                }
            }
        } else {
            bitmap2 = bitmap;
            if (this.f22351K) {
                this.f22352L.setValue(DepthEffectState.DepthOn.INSTANCE);
            }
        }
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "checkDepthApplicable state:" + this.f22353M.getValue() + " overlap:" + this.f22354N + " area:" + rect + " depth:" + p097j6.b.a(bitmap2));
        return rect != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap a0(j jVar) {
        return G6.f.d(jVar.s0());
    }

    private final void b1(DepthEffectState depthEffectState) {
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "updateDepthStateByOverlap state:" + depthEffectState);
        BitmapOpaqueUtil.OpaquePercentage opaquePercentage = this.f22354N;
        int i10 = opaquePercentage == null ? -1 : b.f22386b[opaquePercentage.ordinal()];
        if (i10 == 1) {
            this.f22352L.setValue(depthEffectState);
            return;
        }
        if (i10 == 2) {
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.NO_OVERLAP));
        } else if (i10 != 3) {
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.NO_SUBJECT));
        } else {
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.OVERLAP_TOO_MUCH));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A6.c c0() {
        return (A6.c) this.f22369k.getValue();
    }

    private final void c1() {
        J7.i iVar;
        p148o7.b bVar = this.f22366h;
        if (bVar instanceof p148o7.g) {
            kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type com.nothing.wallpaper.picker.edit.crop.viewmodels.ImageCropWallpaperViewModel");
            p148o7.g gVar = (p148o7.g) bVar;
            AbstractC0816i.d(b0.a(this), null, null, new u(gVar, this, null), 3, null);
            if (!kotlin.jvm.internal.n.d(gVar.e0().getValue(), Boolean.FALSE) || (iVar = this.f22367i) == null) {
                return;
            }
            iVar.R0(false, false);
        }
    }

    private final void d1() {
        if (this.f22362d.t()) {
            J7.i iVar = this.f22367i;
            if (iVar != null) {
                iVar.R0(this.f22351K, true);
                return;
            }
            return;
        }
        J7.i iVar2 = this.f22367i;
        if (iVar2 != null) {
            iVar2.R0(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p074h3.a0 e1(j jVar) {
        return new p074h3.a0(jVar.f22368j.A(jVar.f22360b), jVar.f22368j.f(jVar.f22360b), jVar.f22368j.q(jVar.f22360b), jVar.f22368j.k(jVar.f22360b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h0(int i10, p129m8.e eVar) {
        if (this.f22345E && (this.f22353M.getValue() instanceof DepthEffectState.DepthOn) && kotlin.jvm.internal.n.d(this.f22361c, p7.a.b.f23770b) && i10 != 0) {
            return v0(eVar);
        }
        return null;
    }

    private final boolean j0() {
        O oM;
        Boolean bool;
        J7.i iVar = this.f22367i;
        if (iVar == null || (oM = iVar.M()) == null || (bool = (Boolean) oM.getValue()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final Bitmap m0() {
        return (Bitmap) this.f22359S.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p227w6.a n(j jVar) {
        if (jVar.f22364f != null) {
            return new p227w6.a(jVar.f22368j.B(), jVar.f22364f);
        }
        return null;
    }

    private static final p227w6.a o(p079h8.h hVar) {
        return (p227w6.a) hVar.getValue();
    }

    private final p217v6.b q0() {
        return (p217v6.b) this.f22349I.getValue();
    }

    private final Point r0() {
        return (Point) this.f22348H.getValue();
    }

    private final Point s0() {
        Object value = this.f22347G.getValue();
        kotlin.jvm.internal.n.g(value, "getValue(...)");
        return (Point) value;
    }

    private final Segmenter t0() {
        return (Segmenter) this.f22346F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v0(p129m8.e eVar) {
        e eVar2;
        Object next;
        C6.i iVarA;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f22399s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f22399s = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objX = eVar2.f22397q;
        Object objE = p139n8.b.e();
        int i11 = eVar2.f22399s;
        if (i11 == 0) {
            p079h8.r.b(objX);
            D6.f fVar = this.f22363e;
            if (!(fVar instanceof D6.e)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            InterfaceC0880f interfaceC0880fT = ((D6.e) fVar).t();
            eVar2.f22399s = 1;
            objX = AbstractC0882h.x(interfaceC0880fT, eVar2);
            if (objX == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objX);
        }
        Iterator it = ((List) objX).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C6.b) next).c() != C6.a.Depth);
        C6.b bVar = (C6.b) next;
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "getWallpaperDepthBitmap: " + bVar);
        if (bVar == null || (iVarA = bVar.a()) == null) {
            return null;
        }
        return iVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p074h3.a0 y0() {
        return (p074h3.a0) this.f22383y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(C6.b bVar) {
        InterfaceC0846x0 interfaceC0846x0 = this.f22357Q;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f22357Q = AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new f(bVar, null), 2, null);
    }

    public final void H0(boolean z9) {
        if (kotlin.jvm.internal.n.d(this.f22350J, Boolean.valueOf(z9))) {
            return;
        }
        this.f22350J = Boolean.valueOf(z9);
        if (z9) {
            J7.i iVar = this.f22367i;
            if (iVar != null) {
                J7.i.S0(iVar, false, false, 2, null);
            }
            this.f22352L.setValue(new DepthEffectState.DepthNotApplicable(NotApplicableReason.EXTENDED_WIDGET));
            return;
        }
        Bitmap bitmap = this.f22355O;
        if (bitmap != null) {
            Y(bitmap);
        }
    }

    public final void L0() {
        if (this.f22345E) {
            boolean zB = f22340T.b(this.f22360b);
            this.f22351K = zB;
            if (zB) {
                return;
            }
            J7.i iVar = this.f22367i;
            if (iVar != null) {
                J7.i.S0(iVar, false, false, 2, null);
            }
            if (this.f22352L.getValue() instanceof DepthEffectState.DepthOn) {
                this.f22352L.setValue(DepthEffectState.DepthOff.INSTANCE);
            }
        }
    }

    public final void M0() {
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "reset");
        N0();
        C0();
    }

    public final void U0(p148o7.b bVar) {
        this.f22366h = bVar;
        c1();
    }

    public final void W(p108k7.a effect) {
        kotlin.jvm.internal.n.h(effect, "effect");
        if (this.f22370l != null && b.f22385a[effect.ordinal()] == 1) {
            C6.e.b bVar = C6.e.b.f642c;
            InterfaceC0846x0 interfaceC0846x0 = this.f22341A;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            this.f22341A = AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new c(bVar, null), 2, null);
        }
    }

    public final void W0(J7.i iVar) {
        this.f22367i = iVar;
        d1();
    }

    public final void Y0(List effect) {
        Object next;
        Object next2;
        kotlin.jvm.internal.n.h(effect, "effect");
        List list = effect;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((p108k7.a) next) != p108k7.a.Glass);
        boolean z9 = next != null;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((p108k7.a) next2) != p108k7.a.Blur);
        AbstractC0816i.d(b0.a(this), C0803b0.c(), null, new n(z9, next2 != null, null), 2, null);
    }

    public final void Z() {
        this.f22372n.e();
    }

    public final void Z0(Activity container, List effect, int i10, IWallpaperEngine iWallpaperEngine) {
        Object next;
        kotlin.jvm.internal.n.h(container, "container");
        kotlin.jvm.internal.n.h(effect, "effect");
        Object objE = this.f22380v.e();
        LoadingState.Silence silence = LoadingState.Silence.INSTANCE;
        if (kotlin.jvm.internal.n.d(objE, silence) || kotlin.jvm.internal.n.d(this.f22380v.e(), LoadingState.Loading.INSTANCE)) {
            return;
        }
        D6.f fVar = this.f22363e;
        Object obj = null;
        D6.b bVar = fVar instanceof D6.b ? (D6.b) fVar : null;
        if (bVar != null) {
            bVar.B0(true);
        }
        E0();
        int iQ = F.f1542t.a(container).Q();
        X0(silence);
        this.f22384z = true;
        E e10 = new E();
        E e11 = new E();
        E e12 = new E();
        p pVar = new p(container, bVar, e11, e12, effect, e10, iQ, i10);
        List list = effect;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((p108k7.a) next) != p108k7.a.Glass);
        boolean z9 = next != null;
        for (Object obj2 : list) {
            if (((p108k7.a) obj2) == p108k7.a.Blur) {
                obj = obj2;
                break;
            }
        }
        AbstractC0816i.d(b0.a(this), null, null, new o(container, iWallpaperEngine, i10, pVar, z9, obj != null, e10, e11, e12, null), 3, null);
    }

    public final void a1() {
        J7.i iVar;
        if (this.f22355O == null) {
            com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "toggleDepthState depth bitmap is null");
            return;
        }
        DepthEffectState depthEffectState = (DepthEffectState) this.f22353M.getValue();
        DepthEffectState depthEffectState2 = (DepthEffectState) this.f22353M.getValue();
        if (depthEffectState2 instanceof DepthEffectState.DepthOff) {
            if (this.f22354N == null) {
                AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new t(null), 2, null);
            } else {
                b1(DepthEffectState.DepthOn.INSTANCE);
            }
            J7.i iVar2 = this.f22367i;
            if (iVar2 != null) {
                J7.i.S0(iVar2, true, false, 2, null);
            }
        } else if (depthEffectState2 instanceof DepthEffectState.DepthOn) {
            this.f22352L.setValue(DepthEffectState.DepthOff.INSTANCE);
            J7.i iVar3 = this.f22367i;
            if (iVar3 != null) {
                J7.i.S0(iVar3, false, false, 2, null);
            }
        } else if (f22340T.a((DepthEffectState) this.f22353M.getValue()) && (iVar = this.f22367i) != null) {
            J7.i.S0(iVar, !j0(), false, 2, null);
        }
        com.nothing.wallpaper.common.log.c.d("EditWallpaperViewModel", "toggleDepthState old:" + depthEffectState + " new:" + this.f22353M.getValue() + " switch:" + j0() + " depth:" + this.f22355O);
    }

    public final Context b0() {
        return this.f22360b;
    }

    @Override // androidx.lifecycle.a0
    protected void d() throws IOException {
        p237x6.k kVar;
        C6.i iVarA;
        Bitmap bitmapB;
        super.d();
        com.nothing.wallpaper.common.log.c.c("onCleared");
        Bitmap bitmap = this.f22355O;
        if (bitmap != null) {
            bitmap.recycle();
        }
        C6.b bVar = this.f22356P;
        if (bVar != null && (iVarA = bVar.a()) != null && (bitmapB = iVarA.b()) != null) {
            bitmapB.recycle();
        }
        if (!this.f22384z && (kVar = this.f22364f) != null) {
            kVar.i();
        }
        final A6.c cVarC0 = c0();
        if (cVarC0 != null) {
            p087i6.s.a().submit(new Runnable() { // from class: j7.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.G0(cVarC0);
                }
            });
        }
        D6.g gVar = this.f22370l;
        if (gVar != null) {
            gVar.close();
        }
        Z();
        if (this.f22345E) {
            t0().e(this.f22358R);
        }
    }

    public final InterfaceC0880f d0() {
        return this.f22379u;
    }

    public final p148o7.b e0() {
        return this.f22366h;
    }

    public final Set f0() {
        return this.f22377s;
    }

    public final boolean g0() {
        return this.f22345E;
    }

    public final O i0() {
        return this.f22353M;
    }

    public final boolean k0() {
        return this.f22351K;
    }

    public final p158p7.a l0() {
        return this.f22361c;
    }

    public final InterfaceC0880f n0() {
        return this.f22376r;
    }

    public final C o0() {
        return this.f22381w;
    }

    public final J7.i p0() {
        return this.f22367i;
    }

    public final x u0() {
        return this.f22362d;
    }

    public final InterfaceC0880f w0() {
        return this.f22373o;
    }

    public final InterfaceC0880f x0() {
        return this.f22374p;
    }
}
