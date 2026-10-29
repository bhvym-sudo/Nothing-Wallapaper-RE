package p168q7;

import F8.AbstractC0816i;
import F8.L;
import H3.q;
import I8.AbstractC0882h;
import I8.E;
import I8.InterfaceC0880f;
import I8.O;
import android.app.ProgressDialog;
import android.app.WallpaperColors;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.os.Bundle;
import android.service.wallpaper.IWallpaperEngine;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.H;
import androidx.core.view.T;
import androidx.core.view.W;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.bean.LoadingState;
import com.nothing.wallpaper.picker.edit.preview.widget.EffectButtonGroup;
import com.nothing.wallpaper.picker.edit.preview.widget.WallpaperScreenContainer;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC1458i;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p044e3.j0;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends com.android.wallpaper.picker.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final a f25127G = new a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final ComponentName f25128H = new ComponentName("com.nothing.wallpaper", "com.nothing.blurwallpaper.AtmosphereWallpaperService");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f25129A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p177r6.g f25130B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p177r6.g f25131C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p177r6.g f25132D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ProgressDialog f25133E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private j0 f25135v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private WallpaperScreenContainer f25138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private WallpaperScreenContainer f25139z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p079h8.h f25136w = X.b(this, F.b(p188s7.a.class), new h(this), new i(null, this), new j(this));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p079h8.h f25137x = X.b(this, F.b(p098j7.j.class), new k(this), new C0645l(null, this), new m(this));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p079h8.h f25134F = p079h8.i.b(new p219v8.a() { // from class: q7.i
        @Override // p219v8.a
        public final Object invoke() {
            return l.m1(this.f25124q);
        }
    });

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25140q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f25141r;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f25143q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ l f25144r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, p129m8.e eVar) {
                super(2, eVar);
                this.f25144r = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f25144r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
            
                if (r5 == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                if (r5 == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.io.IOException {
                /*
                    r4 = this;
                    java.lang.Object r0 = p139n8.b.e()
                    int r1 = r4.f25143q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    p079h8.r.b(r5)
                    goto L5a
                L12:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L1a:
                    p079h8.r.b(r5)
                    goto L40
                L1e:
                    p079h8.r.b(r5)
                    q7.l r5 = r4.f25144r
                    s7.a r5 = p168q7.l.K0(r5)
                    boolean r5 = r5.t()
                    if (r5 == 0) goto L43
                    q7.l r5 = r4.f25144r
                    j7.j r5 = p168q7.l.H0(r5)
                    I8.f r5 = r5.n0()
                    r4.f25143q = r3
                    java.lang.Object r5 = I8.AbstractC0882h.x(r5, r4)
                    if (r5 != r0) goto L40
                    goto L59
                L40:
                    android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                    goto L5c
                L43:
                    q7.l r5 = r4.f25144r
                    j7.j r5 = p168q7.l.H0(r5)
                    I8.f r5 = r5.w0()
                    I8.f r5 = I8.AbstractC0882h.w(r5)
                    r4.f25143q = r2
                    java.lang.Object r5 = I8.AbstractC0882h.x(r5, r4)
                    if (r5 != r0) goto L5a
                L59:
                    return r0
                L5a:
                    android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                L5c:
                    q7.l r0 = r4.f25144r
                    com.nothing.wallpaper.picker.edit.preview.widget.WallpaperScreenContainer r0 = p168q7.l.J0(r0)
                    if (r0 == 0) goto L67
                    r0.J(r5)
                L67:
                    q7.l r4 = r4.f25144r
                    com.nothing.wallpaper.picker.edit.preview.widget.WallpaperScreenContainer r4 = p168q7.l.I0(r4)
                    if (r4 == 0) goto L72
                    r4.J(r5)
                L72:
                    h8.A r4 = p079h8.A.f21846a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.l.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: q7.l$b$b, reason: collision with other inner class name */
        static final class C0638b extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f25145q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ l f25146r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0638b(l lVar, p129m8.e eVar) {
                super(2, eVar);
                this.f25146r = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0638b(this.f25146r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0638b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f25145q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC0880f interfaceC0880fD0 = this.f25146r.P0().d0();
                    this.f25145q = 1;
                    obj = AbstractC0882h.x(interfaceC0880fD0, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                Map map = (Map) obj;
                p177r6.g gVar = this.f25146r.f25132D;
                if (gVar != null) {
                    p167q6.g.b(gVar, (String) map.get(this.f25146r.R0().t() ? C6.e.b.f642c.a() : "ORIGIN"), this.f25146r.R0().s() ? 1 : 0);
                }
                return A.f21846a;
            }
        }

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f25141r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25140q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            L l9 = (L) this.f25141r;
            AbstractC0816i.d(l9, null, null, new a(l.this, null), 3, null);
            if (l.this.R0().u()) {
                AbstractC0816i.d(l9, null, null, new C0638b(l.this, null), 3, null);
            }
            return A.f21846a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25147q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f25149q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f25150r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ l f25151s;

            /* JADX INFO: renamed from: q7.l$c$a$a, reason: collision with other inner class name */
            static final class C0639a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25152q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ l f25153r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0639a(l lVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25153r = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0639a(this.f25153r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0639a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
                
                    if (r1.i1(r3, r5, r4) == r0) goto L15;
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
                        int r1 = r4.f25152q
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        p079h8.r.b(r5)
                        goto L4a
                    L12:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L1a:
                        p079h8.r.b(r5)
                        goto L31
                    L1e:
                        p079h8.r.b(r5)
                        q7.l r5 = r4.f25153r
                        s7.a r5 = p168q7.l.K0(r5)
                        r4.f25152q = r3
                        r1 = 0
                        java.lang.Object r5 = r5.n(r1, r4)
                        if (r5 != r0) goto L31
                        goto L49
                    L31:
                        q7.l r1 = r4.f25153r
                        h8.o r5 = (p079h8.o) r5
                        java.lang.Object r3 = r5.a()
                        g3.x r3 = (p064g3.x) r3
                        java.lang.Object r5 = r5.b()
                        g3.x r5 = (p064g3.x) r5
                        r4.f25152q = r2
                        java.lang.Object r4 = p168q7.l.M0(r1, r3, r5, r4)
                        if (r4 != r0) goto L4a
                    L49:
                        return r0
                    L4a:
                        h8.A r4 = p079h8.A.f21846a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: q7.l.c.a.C0639a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            static final class b extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25154q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ l f25155r;

                /* JADX INFO: renamed from: q7.l$c$a$b$a, reason: collision with other inner class name */
                static final class C0640a extends kotlin.coroutines.jvm.internal.l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f25156q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f25157r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ l f25158s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0640a(l lVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f25158s = lVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0640a c0640a = new C0640a(this.f25158s, eVar);
                        c0640a.f25157r = obj;
                        return c0640a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f25156q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        WallpaperColors wallpaperColors = (WallpaperColors) this.f25157r;
                        WallpaperScreenContainer wallpaperScreenContainer = this.f25158s.f25138y;
                        if (wallpaperScreenContainer != null) {
                            wallpaperScreenContainer.z(wallpaperColors);
                        }
                        WallpaperScreenContainer wallpaperScreenContainer2 = this.f25158s.f25139z;
                        if (wallpaperScreenContainer2 != null) {
                            wallpaperScreenContainer2.z(wallpaperColors);
                        }
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(WallpaperColors wallpaperColors, p129m8.e eVar) {
                        return ((C0640a) create(wallpaperColors, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(l lVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25155r = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f25155r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f25154q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fW = AbstractC0882h.w(this.f25155r.P0().x0());
                        C0640a c0640a = new C0640a(this.f25155r, null);
                        this.f25154q = 1;
                        if (AbstractC0882h.i(interfaceC0880fW, c0640a, this) == objE) {
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

            /* JADX INFO: renamed from: q7.l$c$a$c, reason: collision with other inner class name */
            static final class C0641c extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25159q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ l f25160r;

                /* JADX INFO: renamed from: q7.l$c$a$c$a, reason: collision with other inner class name */
                static final class C0642a extends kotlin.coroutines.jvm.internal.l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f25161q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f25162r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ l f25163s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0642a(l lVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f25163s = lVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0642a c0642a = new C0642a(this.f25163s, eVar);
                        c0642a.f25162r = obj;
                        return c0642a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws IOException {
                        p139n8.b.e();
                        if (this.f25161q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f25163s.l1((p158p7.c) this.f25162r);
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p158p7.c cVar, p129m8.e eVar) {
                        return ((C0642a) create(cVar, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0641c(l lVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25160r = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0641c(this.f25160r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0641c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f25159q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oQ = this.f25160r.R0().q();
                        C0642a c0642a = new C0642a(this.f25160r, null);
                        this.f25159q = 1;
                        if (AbstractC0882h.i(oQ, c0642a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, p129m8.e eVar) {
                super(2, eVar);
                this.f25151s = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f25151s, eVar);
                aVar.f25150r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f25149q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f25150r;
                AbstractC0816i.d(l9, null, null, new C0639a(this.f25151s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f25151s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0641c(this.f25151s, null), 3, null);
                return A.f21846a;
            }
        }

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return l.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f25147q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x viewLifecycleOwner = l.this.getViewLifecycleOwner();
                n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.RESUMED;
                a aVar = new a(l.this, null);
                this.f25147q = 1;
                if (N.b(viewLifecycleOwner, bVar, aVar, this) == objE) {
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

    static final class d extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25164q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f25166q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f25167r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ l f25168s;

            /* JADX INFO: renamed from: q7.l$d$a$a, reason: collision with other inner class name */
            static final class C0643a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25169q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ l f25170r;

                /* JADX INFO: renamed from: q7.l$d$a$a$a, reason: collision with other inner class name */
                static final class C0644a extends kotlin.coroutines.jvm.internal.l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f25171q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f25172r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ l f25173s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0644a(l lVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f25173s = lVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0644a c0644a = new C0644a(this.f25173s, eVar);
                        c0644a.f25172r = obj;
                        return c0644a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f25171q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f25173s.T0((p158p7.b) this.f25172r);
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p158p7.b bVar, p129m8.e eVar) {
                        return ((C0644a) create(bVar, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0643a(l lVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25170r = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0643a(this.f25170r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0643a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f25169q;
                    if (i10 == 0) {
                        r.b(obj);
                        E eP = this.f25170r.R0().p();
                        C0644a c0644a = new C0644a(this.f25170r, null);
                        this.f25169q = 1;
                        if (AbstractC0882h.i(eP, c0644a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, p129m8.e eVar) {
                super(2, eVar);
                this.f25168s = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f25168s, eVar);
                aVar.f25167r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f25166q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f25167r, null, null, new C0643a(this.f25168s, null), 3, null);
                return A.f21846a;
            }
        }

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return l.this.new d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f25164q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x viewLifecycleOwner = l.this.getViewLifecycleOwner();
                n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.CREATED;
                a aVar = new a(l.this, null);
                this.f25164q = 1;
                if (N.b(viewLifecycleOwner, bVar, aVar, this) == objE) {
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
        private final /* synthetic */ p219v8.l f25174q;

        e(p219v8.l function) {
            n.h(function, "function");
            this.f25174q = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC1458i
        public final p079h8.e a() {
            return this.f25174q;
        }

        @Override // androidx.lifecycle.I
        public final /* synthetic */ void b(Object obj) {
            this.f25174q.f(obj);
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

    public static final class f implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f25175q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p177r6.g f25176r;

        public f(View view, p177r6.g gVar) {
            this.f25175q = view;
            this.f25176r = gVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f25175q.removeOnAttachStateChangeListener(this);
            this.f25176r.c0();
            this.f25176r.r0(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25177q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25178r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f25179s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f25180t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f25181u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f25183w;

        g(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25181u = obj;
            this.f25183w |= Integer.MIN_VALUE;
            return l.this.i1(null, null, this);
        }
    }

    public static final class h extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f25184r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f25184r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f25184r.requireActivity().getViewModelStore();
        }
    }

    public static final class i extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f25185r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f25186s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f25185r = aVar;
            this.f25186s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f25185r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f25186s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class j extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f25187r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f25187r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f25187r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class k extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f25188r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f25188r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f25188r.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: q7.l$l, reason: collision with other inner class name */
    public static final class C0645l extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f25189r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f25190s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0645l(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f25189r = aVar;
            this.f25190s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f25189r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f25190s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class m extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f25191r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f25191r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f25191r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    private final void O0() {
        if (G6.e.s(P0().u0())) {
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new b(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p098j7.j P0() {
        return (p098j7.j) this.f25137x.getValue();
    }

    private final IWallpaperEngine Q0(int i10) {
        p177r6.g gVar = (i10 == 0 || i10 != 1) ? this.f25131C : this.f25130B;
        if (gVar != null) {
            return gVar.j0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p188s7.a R0() {
        return (p188s7.a) this.f25136w.getValue();
    }

    private final W S0() {
        return (W) this.f25134F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(p158p7.b bVar) {
        EffectButtonGroup effectButtonGroup;
        j0 j0Var = this.f25135v;
        if (j0Var == null || (effectButtonGroup = j0Var.f20009w) == null) {
            return;
        }
        effectButtonGroup.b(bVar.a());
        final Intent intentB = bVar.b();
        if (intentB != null) {
            effectButtonGroup.a(EffectButtonGroup.a.CUSTOMIZE, new View.OnClickListener() { // from class: q7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.U0(this.f25116q, intentB, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(l lVar, Intent intent, View view) {
        p087i6.a aVar = p087i6.a.f22186a;
        Context contextRequireContext = lVar.requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        p087i6.a.b(aVar, contextRequireContext, intent, null, R.string.live_wallpaper_customize_error, 4, null);
    }

    private final void V0() {
        requireActivity().getWindow().setNavigationBarColor(0);
        j0 j0Var = this.f25135v;
        if (j0Var != null) {
            q0(j0Var.o());
            j0Var.f20009w.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: q7.a
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return l.Z0(view, windowInsets);
                }
            });
            j0Var.f20009w.a(EffectButtonGroup.a.BLUR, new View.OnClickListener() { // from class: q7.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.a1(this.f25118q, view);
                }
            });
            j0Var.f20009w.a(EffectButtonGroup.a.GLASS, new View.OnClickListener() { // from class: q7.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.b1(this.f25119q, view);
                }
            });
        }
        j0 j0Var2 = this.f25135v;
        View view = j0Var2 != null ? j0Var2.f20001B : null;
        WallpaperScreenContainer wallpaperScreenContainer = view instanceof WallpaperScreenContainer ? (WallpaperScreenContainer) view : null;
        if (wallpaperScreenContainer != null) {
            wallpaperScreenContainer.setOnClickListener(new View.OnClickListener() { // from class: q7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l.W0(this.f25120q, view2);
                }
            });
            wallpaperScreenContainer.setContentDescription(getString(R.string.set_wallpaper_lock_screen_destination));
            this.f25138y = wallpaperScreenContainer;
        }
        j0 j0Var3 = this.f25135v;
        View view2 = j0Var3 != null ? j0Var3.f20012z : null;
        WallpaperScreenContainer wallpaperScreenContainer2 = view2 instanceof WallpaperScreenContainer ? (WallpaperScreenContainer) view2 : null;
        if (wallpaperScreenContainer2 != null) {
            wallpaperScreenContainer2.setOnClickListener(new View.OnClickListener() { // from class: q7.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    l.X0(this.f25121q, view3);
                }
            });
            wallpaperScreenContainer2.setContentDescription(getString(R.string.set_wallpaper_home_screen_destination));
            this.f25139z = wallpaperScreenContainer2;
        }
        s0(R.menu.nt_preview_menu);
        View actionView = this.f15945t.getMenu().findItem(R.id.done).getActionView();
        View viewFindViewById = actionView != null ? actionView.findViewById(R.id.action_apply) : null;
        this.f25129A = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: q7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    l.Y0(this.f25122q, view3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(l lVar, View view) {
        lVar.R0().x(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(l lVar, View view) {
        lVar.R0().x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(l lVar, View view) {
        p079h8.o oVarO = lVar.R0().o();
        List list = (List) oVarO.a();
        int iIntValue = ((Number) oVarO.b()).intValue();
        p098j7.j jVarP0 = lVar.P0();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = lVar.requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        jVarP0.Z0(abstractActivityC1136vRequireActivity, list, iIntValue, lVar.Q0(iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets Z0(View v9, WindowInsets insets) {
        n.h(v9, "v");
        n.h(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        n.g(insets2, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v9.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = insets2.bottom;
        v9.setLayoutParams(marginLayoutParams);
        return WindowInsets.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(l lVar, View view) {
        lVar.R0().k();
        lVar.P0().Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(l lVar, View view) {
        if (!lVar.R0().t()) {
            lVar.P0().W(p108k7.a.Glass);
        }
        lVar.R0().l();
        lVar.P0().Z();
    }

    private final void c1() {
        WallpaperScreenContainer wallpaperScreenContainer = this.f25138y;
        if (wallpaperScreenContainer != null) {
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Context contextRequireContext = requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            wallpaperScreenContainer.r(viewLifecycleOwner, new q(contextRequireContext, null, getResources().getString(R.string.lock_screen_preview_provider_authority), 2, null));
        }
        WallpaperScreenContainer wallpaperScreenContainer2 = this.f25139z;
        if (wallpaperScreenContainer2 != null) {
            InterfaceC1163x viewLifecycleOwner2 = getViewLifecycleOwner();
            n.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            Context contextRequireContext2 = requireContext();
            n.g(contextRequireContext2, "requireContext(...)");
            String string = getResources().getString(R.string.grid_control_metadata_name);
            n.g(string, "getString(...)");
            wallpaperScreenContainer2.r(viewLifecycleOwner2, new q(contextRequireContext2, string));
        }
        InterfaceC1163x viewLifecycleOwner3 = getViewLifecycleOwner();
        n.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner3), null, null, new c(null), 3, null);
        InterfaceC1163x viewLifecycleOwner4 = getViewLifecycleOwner();
        n.g(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner4), null, null, new d(null), 3, null);
        P0().o0().h(getViewLifecycleOwner(), new e(new p219v8.l() { // from class: q7.j
            @Override // p219v8.l
            public final Object f(Object obj) {
                return l.d1(this.f25125q, (LoadingState) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A d1(l lVar, LoadingState loadingState) {
        Window window;
        if (n.d(loadingState, LoadingState.Silence.INSTANCE)) {
            e1(lVar);
            ProgressDialog progressDialog = lVar.f25133E;
            if (progressDialog != null && (window = progressDialog.getWindow()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = 1;
                attributes.height = 1;
                attributes.dimAmount = 0.0f;
                window.setAttributes(attributes);
            }
        } else if (n.d(loadingState, LoadingState.Loading.INSTANCE)) {
            e1(lVar);
        } else if (loadingState instanceof LoadingState.End) {
            ProgressDialog progressDialog2 = lVar.f25133E;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            if (((LoadingState.End) loadingState).getSuccess()) {
                AbstractActivityC1136v abstractActivityC1136vRequireActivity = lVar.requireActivity();
                abstractActivityC1136vRequireActivity.setResult(-1);
                abstractActivityC1136vRequireActivity.finish();
            }
        }
        return A.f21846a;
    }

    private static final void e1(l lVar) {
        ProgressDialog progressDialog = lVar.f25133E;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ProgressDialog progressDialog2 = new ProgressDialog(lVar.getActivity(), R.style.LightDialogTheme);
        progressDialog2.setTitle((CharSequence) null);
        AbstractActivityC1136v activity = lVar.getActivity();
        progressDialog2.setMessage(activity != null ? activity.getString(R.string.set_wallpaper_progress_message) : null);
        progressDialog2.setInverseBackgroundForced(true);
        progressDialog2.setCanceledOnTouchOutside(false);
        progressDialog2.setCancelable(false);
        progressDialog2.show();
        lVar.f25133E = progressDialog2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A f1(l lVar) throws IOException {
        WallpaperScreenContainer wallpaperScreenContainer = lVar.f25139z;
        if (wallpaperScreenContainer != null) {
            p177r6.g gVar = lVar.f25132D;
            n.e(gVar);
            wallpaperScreenContainer.H(gVar);
        }
        return A.f21846a;
    }

    private final p177r6.g g1(ComponentName componentName, p177r6.g gVar, int i10, p219v8.a aVar) {
        if (gVar == null) {
            r6.g.a aVar2 = p177r6.g.f27541I;
            WallpaperScreenContainer wallpaperScreenContainer = this.f25139z;
            Context contextRequireContext = requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            gVar = aVar2.a(componentName, wallpaperScreenContainer, contextRequireContext, i10, aVar);
        }
        WallpaperScreenContainer wallpaperScreenContainer2 = this.f25139z;
        if (wallpaperScreenContainer2 != null) {
            if (wallpaperScreenContainer2.isAttachedToWindow()) {
                gVar.c0();
                gVar.r0(true);
                return gVar;
            }
            wallpaperScreenContainer2.addOnAttachStateChangeListener(new f(wallpaperScreenContainer2, gVar));
        }
        return gVar;
    }

    static /* synthetic */ p177r6.g h1(l lVar, ComponentName componentName, p177r6.g gVar, int i10, p219v8.a aVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            aVar = null;
        }
        return lVar.g1(componentName, gVar, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f0  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r1.L(r2, r3, r4, r5, r6) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        if (r1.L(r2, r3, null, r5, r6) == r0) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(p064g3.x r11, p064g3.x r12, p129m8.e r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p168q7.l.i1(g3.x, g3.x, m8.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j1(l lVar, Bitmap it) {
        n.h(it, "it");
        lVar.R0().y(it);
        WallpaperScreenContainer wallpaperScreenContainer = lVar.f25139z;
        if (wallpaperScreenContainer != null) {
            wallpaperScreenContainer.B(it, ImageView.ScaleType.CENTER_CROP);
        }
        return A.f21846a;
    }

    private final void k1(boolean z9) {
        j0 j0Var = this.f25135v;
        if (j0Var != null) {
            if (H.M(j0Var.f20002C)) {
                j0Var.f20002C.animate().translationY(z9 ? -63.0f : 0.0f).setDuration(400L).setInterpolator(WallpaperScreenContainer.f18551A.a()).start();
            } else {
                j0Var.f20002C.setTranslationY(z9 ? -63.0f : 0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1(p158p7.c cVar) throws IOException {
        j0 j0Var = this.f25135v;
        if (j0Var != null) {
            boolean z9 = cVar instanceof p158p7.c.C0632c;
            j0Var.f20005F.setText(z9 ? R.string.un_select_wallpaper_title : R.string.select_wallpaper_title);
            View view = this.f25129A;
            if (view != null) {
                view.setEnabled(!z9);
            }
            boolean zF = cVar.f();
            boolean zG = cVar.g();
            k1(zF);
            j0Var.f20009w.c(EffectButtonGroup.a.BLUR, zF);
            j0Var.f20009w.c(EffectButtonGroup.a.GLASS, zG);
            TextView effectTips = j0Var.f20010x;
            n.g(effectTips, "effectTips");
            effectTips.setVisibility(zF ? 0 : 8);
            Group screenLabelGroup = j0Var.f20003D;
            n.g(screenLabelGroup, "screenLabelGroup");
            screenLabelGroup.setVisibility(zF ? 8 : 0);
            WallpaperScreenContainer wallpaperScreenContainer = this.f25138y;
            if (wallpaperScreenContainer != null) {
                wallpaperScreenContainer.setSelected(cVar.e());
            }
            WallpaperScreenContainer wallpaperScreenContainer2 = this.f25139z;
            if (wallpaperScreenContainer2 != null) {
                wallpaperScreenContainer2.setSelected(cVar.d());
            }
            O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W m1(l lVar) {
        Window window = lVar.requireActivity().getWindow();
        return T.a(window, window.getDecorView());
    }

    @Override // com.android.wallpaper.picker.a
    protected int j0() {
        return android.R.color.transparent;
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onAttach(Context context) {
        n.h(context, "context");
        super.onAttach(context);
        W wS0 = S0();
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        wS0.d(!H6.a.b(contextRequireContext));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        this.f25135v = j0.C(inflater, viewGroup, false);
        V0();
        j0 j0Var = this.f25135v;
        if (j0Var != null) {
            return j0Var.o();
        }
        return null;
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        p177r6.g gVar = this.f25130B;
        if (gVar != null) {
            gVar.d0();
        }
        this.f25130B = null;
        p177r6.g gVar2 = this.f25131C;
        if (gVar2 != null) {
            gVar2.d0();
        }
        this.f25131C = null;
        p177r6.g gVar3 = this.f25132D;
        if (gVar3 != null) {
            gVar3.d0();
        }
        this.f25132D = null;
        ProgressDialog progressDialog = this.f25133E;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onPause() {
        super.onPause();
        p177r6.g gVar = this.f25130B;
        if (gVar != null) {
            gVar.r0(false);
        }
        p177r6.g gVar2 = this.f25131C;
        if (gVar2 != null) {
            gVar2.r0(false);
        }
        p177r6.g gVar3 = this.f25132D;
        if (gVar3 != null) {
            gVar3.r0(false);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStart() {
        super.onStart();
        p177r6.g gVar = this.f25132D;
        if (gVar != null) {
            gVar.c0();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        p177r6.g gVar = this.f25130B;
        if (gVar != null) {
            gVar.e0();
        }
        p177r6.g gVar2 = this.f25131C;
        if (gVar2 != null) {
            gVar2.e0();
        }
        p177r6.g gVar3 = this.f25132D;
        if (gVar3 != null) {
            gVar3.e0();
        }
        R0().w();
    }

    @Override // p084i3.C1395d, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        R0().r(P0().u0(), P0().l0(), P0().f0());
        if (G6.e.s(P0().u0())) {
            if (R0().t()) {
                P0().W(p108k7.a.Glass);
            }
            if (!R0().s()) {
                P0().Y0((List) R0().o().c());
            }
            this.f25132D = g1(f25128H, this.f25132D, 1, new p219v8.a() { // from class: q7.h
                @Override // p219v8.a
                public final Object invoke() {
                    return l.f1(this.f25123q);
                }
            });
        }
        c1();
    }
}
