package E7;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.nothing.wallpaper.common.bitmap.BitmapOpaqueUtil;
import com.nothing.wallpaper.picker.edit.crop.view.EditSubsamplingScaleImageView;
import com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1340u;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f1335p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LockScreenFragment f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1340u f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p064g3.x f1339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EditSubsamplingScaleImageView f1340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditSubsamplingScaleImageView f1341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CardView f1342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageSource f1343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Point f1344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DepthEffectState f1345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p079h8.h f1347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p079h8.h f1348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p079h8.h f1349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1350o;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f1351q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f1352r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f1353s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f1355u;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1353s = obj;
            this.f1355u |= Integer.MIN_VALUE;
            return Z.this.s(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1356q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ View f1357r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int[] f1358s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, int[] iArr, p129m8.e eVar) {
            super(2, eVar);
            this.f1357r = view;
            this.f1358s = iArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f1357r, this.f1358s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f1356q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            this.f1357r.getLocationOnScreen(this.f1358s);
            return p079h8.A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1359q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f1361s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f1361s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return Z.this.new d(this.f1361s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1359q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                Z z9 = Z.this;
                this.f1359q = 1;
                obj = z9.s(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            Rect rect = (Rect) obj;
            if (rect != null) {
                Z z10 = Z.this;
                z10.y().getLockScreenViewModel().P0(rect, this.f1361s);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1362q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1364q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Z f1365r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z9, p129m8.e eVar) {
                super(2, eVar);
                this.f1365r = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f1365r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0066  */
            /* JADX WARN: Code duplicated, block: B:29:0x0070  */
            /* JADX WARN: Code duplicated, block: B:30:0x007f  */
            /* JADX WARN: Code duplicated, block: B:32:0x0085  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f1364q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    J7.i lockScreenViewModel = this.f1365r.y().getLockScreenViewModel();
                    this.f1364q = 1;
                    obj = lockScreenViewModel.k0(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                p064g3.x xVar = (p064g3.x) obj;
                if (xVar != null) {
                    Z z9 = this.f1365r;
                    if (z9.F() == null) {
                        z9.Q(xVar);
                        if (G6.e.m(xVar)) {
                            z9.R();
                            z9.y().getLockScreenViewModel().R0(false, false);
                        } else {
                            if (xVar.s()) {
                                xVar.v(null);
                            }
                            z9.y().Q3(xVar, p7.a.b.f23770b);
                            z9.T();
                            z9.K();
                            Z.u(z9, false, 1, null);
                        }
                    } else {
                        p064g3.x xVarF = z9.F();
                        if ((xVarF != null ? xVarF.k() : null) == null) {
                            z9.Q(xVar);
                            if (G6.e.m(xVar)) {
                                z9.R();
                                z9.y().getLockScreenViewModel().R0(false, false);
                            } else {
                                if (xVar.s()) {
                                    xVar.v(null);
                                }
                                z9.y().Q3(xVar, p7.a.b.f23770b);
                                z9.T();
                                z9.K();
                                Z.u(z9, false, 1, null);
                            }
                        } else {
                            p064g3.x xVarF2 = z9.F();
                            if (kotlin.jvm.internal.n.d(xVarF2 != null ? xVarF2.k() : null, xVar.k())) {
                                com.nothing.wallpaper.common.log.c.d("WallpaperUIHelper", "getWallpaperInfo is same wallpaper, return");
                            } else {
                                z9.Q(xVar);
                                if (G6.e.m(xVar)) {
                                    z9.R();
                                    z9.y().getLockScreenViewModel().R0(false, false);
                                } else {
                                    if (xVar.s()) {
                                        xVar.v(null);
                                    }
                                    z9.y().Q3(xVar, p7.a.b.f23770b);
                                    z9.T();
                                    z9.K();
                                    Z.u(z9, false, 1, null);
                                }
                            }
                        }
                    }
                }
                return p079h8.A.f21846a;
            }
        }

        e(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return Z.this.new e(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1362q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                LockScreenFragment lockScreenFragmentY = Z.this.y();
                AbstractC1157q.b bVar = AbstractC1157q.b.RESUMED;
                a aVar = new a(Z.this, null);
                this.f1362q = 1;
                if (androidx.lifecycle.N.b(lockScreenFragmentY, bVar, aVar, this) == objE) {
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

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1366q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1368q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f1369r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Z f1370s;

            /* JADX INFO: renamed from: E7.Z$f$a$a, reason: collision with other inner class name */
            static final class C0052a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1371q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Z f1372r;

                /* JADX INFO: renamed from: E7.Z$f$a$a$a, reason: collision with other inner class name */
                static final class C0053a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f1373q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f1374r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Z f1375s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0053a(Z z9, p129m8.e eVar) {
                        super(2, eVar);
                        this.f1375s = z9;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0053a c0053a = new C0053a(this.f1375s, eVar);
                        c0053a.f1374r = obj;
                        return c0053a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f1373q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        p079h8.u uVar = (p079h8.u) this.f1374r;
                        com.nothing.wallpaper.common.log.c.k("WallpaperUIHelper", "wallpaper image load complete");
                        this.f1375s.P((ImageSource) uVar.d(), (Point) uVar.f());
                        this.f1375s.S((Bitmap) uVar.e());
                        if (this.f1375s.f1343h != null) {
                            this.f1375s.O();
                        }
                        return p079h8.A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p079h8.u uVar, p129m8.e eVar) {
                        return ((C0053a) create(uVar, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0052a(Z z9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f1372r = z9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0052a(this.f1372r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0052a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC0880f interfaceC0880fA0;
                    Object objE = p139n8.b.e();
                    int i10 = this.f1371q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        p148o7.g gVarV = this.f1372r.v();
                        if (gVarV != null && (interfaceC0880fA0 = gVarV.a0()) != null) {
                            C0053a c0053a = new C0053a(this.f1372r, null);
                            this.f1371q = 1;
                            if (AbstractC0882h.i(interfaceC0880fA0, c0053a, this) == objE) {
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

            static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1376q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Z f1377r;

                /* JADX INFO: renamed from: E7.Z$f$a$b$a, reason: collision with other inner class name */
                static final class C0054a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f1378q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f1379r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Z f1380s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0054a(Z z9, p129m8.e eVar) {
                        super(2, eVar);
                        this.f1380s = z9;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0054a c0054a = new C0054a(this.f1380s, eVar);
                        c0054a.f1379r = obj;
                        return c0054a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f1378q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        p079h8.o oVar = (p079h8.o) this.f1379r;
                        com.nothing.wallpaper.common.log.c.k("WallpaperUIHelper", "wallpaper depth image load complete");
                        this.f1380s.f1343h = (ImageSource) oVar.c();
                        if (this.f1380s.z() != null) {
                            this.f1380s.O();
                        }
                        return p079h8.A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p079h8.o oVar, p129m8.e eVar) {
                        return ((C0054a) create(oVar, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Z z9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f1377r = z9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f1377r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC0880f interfaceC0880fY;
                    Object objE = p139n8.b.e();
                    int i10 = this.f1376q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        p148o7.g gVarV = this.f1377r.v();
                        if (gVarV != null && (interfaceC0880fY = gVarV.Y()) != null) {
                            C0054a c0054a = new C0054a(this.f1377r, null);
                            this.f1376q = 1;
                            if (AbstractC0882h.i(interfaceC0880fY, c0054a, this) == objE) {
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

            static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1381q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Z f1382r;

                /* JADX INFO: renamed from: E7.Z$f$a$c$a, reason: collision with other inner class name */
                static final class C0055a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f1383q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f1384r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Z f1385s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0055a(Z z9, p129m8.e eVar) {
                        super(2, eVar);
                        this.f1385s = z9;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0055a c0055a = new C0055a(this.f1385s, eVar);
                        c0055a.f1384r = obj;
                        return c0055a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f1383q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        DepthEffectState depthEffectState = (DepthEffectState) this.f1384r;
                        com.nothing.wallpaper.common.log.c.d("WallpaperUIHelper", "collect depthState change:" + depthEffectState + " oldState:" + this.f1385s.w());
                        if (!kotlin.jvm.internal.n.d(this.f1385s.w(), depthEffectState)) {
                            this.f1385s.x().d(depthEffectState);
                            this.f1385s.M(depthEffectState);
                        }
                        return p079h8.A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(DepthEffectState depthEffectState, p129m8.e eVar) {
                        return ((C0055a) create(depthEffectState, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(Z z9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f1382r = z9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f1382r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    I8.O oI0;
                    Object objE = p139n8.b.e();
                    int i10 = this.f1381q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        p098j7.j jVarP2 = this.f1382r.y().P2();
                        if (jVarP2 != null && (oI0 = jVarP2.i0()) != null) {
                            C0055a c0055a = new C0055a(this.f1382r, null);
                            this.f1381q = 1;
                            if (AbstractC0882h.i(oI0, c0055a, this) == objE) {
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

            static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1386q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Z f1387r;

                /* JADX INFO: renamed from: E7.Z$f$a$d$a, reason: collision with other inner class name */
                static final class C0056a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f1388q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f1389r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Z f1390s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0056a(Z z9, p129m8.e eVar) {
                        super(2, eVar);
                        this.f1390s = z9;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0056a c0056a = new C0056a(this.f1390s, eVar);
                        c0056a.f1389r = ((Boolean) obj).booleanValue();
                        return c0056a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f1388q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        boolean z9 = this.f1389r;
                        com.nothing.wallpaper.common.log.c.d("WallpaperUIHelper", "collect expand widget change:" + z9);
                        this.f1390s.f1346k = z9;
                        p098j7.j jVarP2 = this.f1390s.y().P2();
                        if (jVarP2 != null) {
                            jVarP2.H0(z9);
                        }
                        return p079h8.A.f21846a;
                    }

                    public final Object s(boolean z9, p129m8.e eVar) {
                        return ((C0056a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(Z z9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f1387r = z9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new d(this.f1387r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f1386q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.E eN = this.f1387r.y().getLockScreenViewModel().N();
                        C0056a c0056a = new C0056a(this.f1387r, null);
                        this.f1386q = 1;
                        if (AbstractC0882h.i(eN, c0056a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z9, p129m8.e eVar) {
                super(2, eVar);
                this.f1370s = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f1370s, eVar);
                aVar.f1369r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f1368q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                F8.L l9 = (F8.L) this.f1369r;
                AbstractC0816i.d(l9, null, null, new C0052a(this.f1370s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f1370s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f1370s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new d(this.f1370s, null), 3, null);
                return p079h8.A.f21846a;
            }
        }

        f(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return Z.this.new f(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1366q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                LockScreenFragment lockScreenFragmentY = Z.this.y();
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(Z.this, null);
                this.f1366q = 1;
                if (androidx.lifecycle.N.b(lockScreenFragmentY, bVar, aVar, this) == objE) {
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

    public static final class g implements View.OnLayoutChangeListener {
        g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            Z.this.y().E3();
        }
    }

    public Z(LockScreenFragment lockScreenFragment, AbstractC1340u binding) {
        kotlin.jvm.internal.n.h(lockScreenFragment, "lockScreenFragment");
        kotlin.jvm.internal.n.h(binding, "binding");
        this.f1336a = lockScreenFragment;
        this.f1337b = binding;
        Context contextRequireContext = lockScreenFragment.requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        this.f1338c = contextRequireContext;
        EditSubsamplingScaleImageView wallpaperImage = binding.f20134M;
        kotlin.jvm.internal.n.g(wallpaperImage, "wallpaperImage");
        this.f1340e = wallpaperImage;
        EditSubsamplingScaleImageView wallpaperDepthImage = binding.f20132K;
        kotlin.jvm.internal.n.g(wallpaperDepthImage, "wallpaperDepthImage");
        this.f1341f = wallpaperDepthImage;
        CardView wallpaperDepthPreview = binding.f20133L;
        kotlin.jvm.internal.n.g(wallpaperDepthPreview, "wallpaperDepthPreview");
        this.f1342g = wallpaperDepthPreview;
        this.f1345j = DepthEffectState.Initializing.INSTANCE;
        this.f1347l = p079h8.i.b(new p219v8.a() { // from class: E7.T
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(Z.X(this.f1329q));
            }
        });
        this.f1348m = p079h8.i.b(new p219v8.a() { // from class: E7.U
            @Override // p219v8.a
            public final Object invoke() {
                return Z.L(this.f1330q);
            }
        });
        this.f1349n = p079h8.i.b(new p219v8.a() { // from class: E7.V
            @Override // p219v8.a
            public final Object invoke() {
                return Z.r(this.f1331q);
            }
        });
        this.f1350o = J7.i.f3674d0.b(contextRequireContext);
    }

    private final boolean B() {
        return ((Boolean) this.f1347l.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        InterfaceC1163x viewLifecycleOwner = this.f1336a.getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 L(Z z9) {
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = z9.f1336a.requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        return new c0(abstractActivityC1136vRequireActivity, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        ImageSource imageSource;
        if (this.f1336a.isDetached() || this.f1336a.getContext() == null || (imageSource = this.f1343h) == null) {
            return;
        }
        this.f1341f.setImage(imageSource);
        A().p();
        p148o7.g gVarV = v();
        if (gVarV != null) {
            gVarV.k0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(ImageSource imageSource, Point point) {
        if (this.f1336a.isDetached() || this.f1336a.getContext() == null) {
            return;
        }
        this.f1340e.addOnLayoutChangeListener(new g());
        this.f1344i = point;
        this.f1340e.setImage(imageSource);
        p148o7.g gVarV = v();
        A().q((gVarV != null ? gVarV.V() : null) instanceof com.android.wallpaper.asset.h);
        this.f1336a.B2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        com.android.wallpaper.asset.a aVarO;
        p064g3.x xVar = this.f1339d;
        if (xVar == null || (aVarO = xVar.o(this.f1338c)) == null) {
            return;
        }
        Context context = this.f1338c;
        aVarO.n(context, this.f1337b.f20138Q, H3.r.a(context, R.attr.colorSecondary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Bitmap bitmap) {
        if (this.f1336a.isDetached() || this.f1336a.getContext() == null || bitmap.isRecycled()) {
            com.nothing.wallpaper.common.log.c.o("WallpaperUIHelper", "setThumbnail bitmap is recycled or detached");
            return;
        }
        RequestOptions requestOptions = new RequestOptions().transform(new CenterCrop()).format(DecodeFormat.PREFER_RGB_565);
        kotlin.jvm.internal.n.g(requestOptions, "format(...)");
        int dimension = (int) this.f1338c.getResources().getDimension(com.nothing.wallpaper.R.dimen.wallpaper_thumbnail_size);
        Glide.with(this.f1338c).load(bitmap).override(dimension, dimension).apply((BaseRequestOptions<?>) requestOptions).transition(DrawableTransitionOptions.withCrossFade()).into(this.f1337b.f20138Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        this.f1341f.setCanHandleTouchEvent(false);
        this.f1340e.setVisibility(0);
        this.f1340e.setMinimumScaleType(3);
        this.f1341f.setMinimumScaleType(3);
        this.f1340e.setPanLimit(1);
        this.f1341f.setPanLimit(1);
        this.f1340e.setOnStartTouchListener(new p219v8.a() { // from class: E7.W
            @Override // p219v8.a
            public final Object invoke() {
                return Z.U(this.f1332q);
            }
        });
        this.f1340e.setOnStateEndListener(new p219v8.a() { // from class: E7.X
            @Override // p219v8.a
            public final Object invoke() {
                return Z.V(this.f1333q);
            }
        });
        this.f1340e.setOnStatePreEndListener(new p219v8.p() { // from class: E7.Y
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return Z.W(this.f1334q, (Float) obj, (PointF) obj2);
            }
        });
        A().o();
        A().n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A U(Z z9) {
        ObjectAnimator objectAnimatorB = z9.x().b();
        if (objectAnimatorB != null) {
            objectAnimatorB.cancel();
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A V(Z z9) {
        p148o7.g gVarV = z9.v();
        if (gVarV != null) {
            p148o7.g.l0(gVarV, false, 1, null);
        }
        if (!z9.f1350o) {
            z9.N();
            TextView tvPinchTip = z9.f1337b.f20131J;
            kotlin.jvm.internal.n.g(tvPinchTip, "tvPinchTip");
            if (tvPinchTip.getVisibility() == 0) {
                C0771c c0771cX = z9.x();
                TextView tvPinchTip2 = z9.f1337b.f20131J;
                kotlin.jvm.internal.n.g(tvPinchTip2, "tvPinchTip");
                C0771c.f(c0771cX, tvPinchTip2, false, 0L, 4, null);
            }
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A W(Z z9, Float f10, PointF pointF) {
        p148o7.g gVarV = z9.v();
        if (gVarV != null) {
            gVarV.m0(f10, pointF);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(Z z9) {
        return z9.f1336a.getLockScreenViewModel().a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0771c r(Z z9) {
        return new C0771c(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(p129m8.e eVar) {
        b bVar;
        View clockView;
        Rect rect;
        int[] iArr;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f1355u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f1355u = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f1353s;
        Object objE = p139n8.b.e();
        int i11 = bVar.f1355u;
        if (i11 == 0) {
            p079h8.r.b(objD);
            clockView = this.f1336a.l().getClockView();
            if (clockView == null) {
                return null;
            }
            bVar.f1351q = clockView;
            bVar.f1355u = 1;
            objD = BitmapOpaqueUtil.d(clockView, bVar);
            if (objD != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            clockView = (View) bVar.f1351q;
            p079h8.r.b(objD);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr = (int[]) bVar.f1352r;
            rect = (Rect) bVar.f1351q;
            p079h8.r.b(objD);
        }
        int i12 = rect.top;
        int i13 = iArr[1];
        rect.top = i12 + i13;
        rect.bottom += i13;
        com.nothing.wallpaper.common.log.c.d("WallpaperUIHelper", "getClockAreaInScreen " + rect);
        return rect;
        Rect rect2 = (Rect) objD;
        if (rect2.left == -1) {
            return null;
        }
        int[] iArr2 = new int[2];
        H0 h0C = C0803b0.c();
        c cVar = new c(clockView, iArr2, null);
        bVar.f1351q = rect2;
        bVar.f1352r = iArr2;
        bVar.f1355u = 2;
        if (AbstractC0812g.g(h0C, cVar, bVar) != objE) {
            rect = rect2;
            iArr = iArr2;
            int i14 = rect.top;
            int i15 = iArr[1];
            rect.top = i14 + i15;
            rect.bottom += i15;
            com.nothing.wallpaper.common.log.c.d("WallpaperUIHelper", "getClockAreaInScreen " + rect);
            return rect;
        }
        return objE;
    }

    public static /* synthetic */ void u(Z z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        z9.t(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0771c x() {
        return (C0771c) this.f1349n.getValue();
    }

    public final c0 A() {
        return (c0) this.f1348m.getValue();
    }

    public final EditSubsamplingScaleImageView C() {
        return this.f1341f;
    }

    public final CardView D() {
        return this.f1342g;
    }

    public final EditSubsamplingScaleImageView E() {
        return this.f1340e;
    }

    public final p064g3.x F() {
        return this.f1339d;
    }

    public final boolean G() {
        p098j7.j jVarP2 = this.f1336a.P2();
        return jVarP2 != null && jVarP2.g0();
    }

    public final boolean H() {
        p064g3.x xVar;
        return (!B() || (xVar = this.f1339d) == null || G6.e.m(xVar) || this.f1350o) ? false : true;
    }

    public final boolean I() {
        p064g3.x xVar;
        p064g3.x xVar2;
        return (!B() || (xVar = this.f1339d) == null || G6.e.m(xVar) || (xVar2 = this.f1339d) == null || xVar2.s()) ? false : true;
    }

    public final void J() {
        AbstractC0816i.d(AbstractC1164y.a(this.f1336a), null, null, new e(null), 3, null);
    }

    public final void M(DepthEffectState depthEffectState) {
        kotlin.jvm.internal.n.h(depthEffectState, "<set-?>");
        this.f1345j = depthEffectState;
    }

    public final void N() {
        this.f1350o = true;
        J7.i.f3674d0.c(this.f1338c);
    }

    public final void Q(p064g3.x xVar) {
        this.f1339d = xVar;
    }

    public final void Y(boolean z9, boolean z10) {
        x().j(z9, z10);
    }

    public final void t(boolean z9) {
        p064g3.x xVar;
        if (!B() || this.f1346k || (((xVar = this.f1339d) != null && G6.e.m(xVar)) || this.f1336a.h() || !kotlin.jvm.internal.n.d(this.f1336a.T2().j().getValue(), Boolean.TRUE))) {
            com.nothing.wallpaper.common.log.c.d("WallpaperUIHelper", "getClockAreaInScreenIfNeed return");
        } else {
            AbstractC0816i.d(AbstractC1164y.a(this.f1336a), C0803b0.b(), null, new d(z9, null), 2, null);
        }
    }

    public final p148o7.g v() {
        return this.f1336a.M2();
    }

    public final DepthEffectState w() {
        return this.f1345j;
    }

    public final LockScreenFragment y() {
        return this.f1336a;
    }

    public final Point z() {
        return this.f1344i;
    }
}
