package com.nothing.wallpaper.picker.lockscreen.ui.view;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import F8.InterfaceC0846x0;
import F8.T0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.bitmap.BitmapOpaqueUtil;
import com.nothing.wallpaper.common.log.FileLog;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1316c;
import p248y7.C2003e;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockHostEditPreview extends FrameLayout implements E {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final b f18776F = new b(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final FloatProperty f18777G = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private O1.b f18778A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private H f18779B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private AnimatorSet f18780C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private F8.T f18781D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final WeakHashMap f18782E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p219v8.l f18783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p219v8.l f18784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f18785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AbstractC1316c f18786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.android.launcher3.views.f f18787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.android.launcher3.f f18788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p079h8.h f18789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p079h8.h f18790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C2003e f18791y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private F8.L f18792z;

    public static final class a extends FloatProperty {
        a() {
            super("fraction");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ClockHostEditPreview host) {
            kotlin.jvm.internal.n.h(host, "host");
            return Float.valueOf(host.getFraction());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(ClockHostEditPreview host, float f10) {
            kotlin.jvm.internal.n.h(host, "host");
            host.b0(f10);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18793q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ N1.a f18795s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ A7.a f18796t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f18797u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18798v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18799q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ClockHostEditPreview f18800r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ float f18801s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ float f18802t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ View f18803u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ A7.a f18804v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ View f18805w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ p219v8.a f18806x;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview$c$a$a, reason: collision with other inner class name */
            public static final class C0506a implements Animator.AnimatorListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ClockHostEditPreview f18807a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f18808b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p219v8.a f18809c;

                public C0506a(ClockHostEditPreview clockHostEditPreview, View view, p219v8.a aVar) {
                    this.f18807a = clockHostEditPreview;
                    this.f18808b = view;
                    this.f18809c = aVar;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f18807a.f18786t.f19938x.c(this.f18807a.f18778A, this.f18808b);
                    this.f18809c.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ClockHostEditPreview clockHostEditPreview, float f10, float f11, View view, A7.a aVar, View view2, p219v8.a aVar2, p129m8.e eVar) {
                super(2, eVar);
                this.f18800r = clockHostEditPreview;
                this.f18801s = f10;
                this.f18802t = f11;
                this.f18803u = view;
                this.f18804v = aVar;
                this.f18805w = view2;
                this.f18806x = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f18800r, this.f18801s, this.f18802t, this.f18803u, this.f18804v, this.f18805w, this.f18806x, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18799q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                ClockHostEditPreview clockHostEditPreview = this.f18800r;
                AnimatorSet animatorSetK = clockHostEditPreview.f18791y.k();
                float f10 = this.f18801s;
                float f11 = this.f18802t;
                View view = this.f18803u;
                ClockHostEditPreview clockHostEditPreview2 = this.f18800r;
                A7.a aVar = this.f18804v;
                View view2 = this.f18805w;
                p219v8.a aVar2 = this.f18806x;
                animatorSetK.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_X, f10 - f11));
                animatorSetK.play(clockHostEditPreview2.Y(aVar));
                animatorSetK.addListener(new C0506a(clockHostEditPreview2, view2, aVar2));
                animatorSetK.start();
                clockHostEditPreview.f18780C = animatorSetK;
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N1.a aVar, A7.a aVar2, View view, p219v8.a aVar3, p129m8.e eVar) {
            super(2, eVar);
            this.f18795s = aVar;
            this.f18796t = aVar2;
            this.f18797u = view;
            this.f18798v = aVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return ClockHostEditPreview.this.new c(this.f18795s, this.f18796t, this.f18797u, this.f18798v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strE;
            Object objE = p139n8.b.e();
            int i10 = this.f18793q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                O1.b bVar = ClockHostEditPreview.this.f18778A;
                if (bVar == null || (strE = bVar.e()) == null) {
                    return p079h8.A.f21846a;
                }
                View viewK = ClockHostEditPreview.this.K(strE, this.f18795s, this.f18796t);
                if (viewK == null) {
                    return p079h8.A.f21846a;
                }
                viewK.layout(0, 0, this.f18797u.getWidth(), this.f18797u.getHeight());
                float fL = ClockHostEditPreview.this.L(this.f18797u);
                float fL2 = ClockHostEditPreview.this.L(viewK);
                H0 h0C = C0803b0.c();
                a aVar = new a(ClockHostEditPreview.this, fL2, fL, this.f18797u, this.f18796t, viewK, this.f18798v, null);
                this.f18793q = 1;
                if (AbstractC0812g.g(h0C, aVar, this) == objE) {
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

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18810q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18812s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18813q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ClockHostEditPreview f18814r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ View f18815s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.a f18816t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ClockHostEditPreview clockHostEditPreview, View view, p219v8.a aVar, p129m8.e eVar) {
                super(2, eVar);
                this.f18814r = clockHostEditPreview;
                this.f18815s = view;
                this.f18816t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f18814r, this.f18815s, this.f18816t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18813q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f18814r.f18786t.f19938x.c(this.f18814r.f18778A, this.f18815s);
                this.f18816t.invoke();
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p219v8.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f18812s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return ClockHostEditPreview.this.new d(this.f18812s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            if (F8.AbstractC0812g.g(r1, r3, r7) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r7.f18810q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r8)
                goto L4e
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                p079h8.r.b(r8)
                goto L32
            L1e:
                p079h8.r.b(r8)
                com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview r8 = com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview.this
                F8.T r8 = com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview.A(r8)
                if (r8 == 0) goto L51
                r7.f18810q = r3
                java.lang.Object r8 = r8.P0(r7)
                if (r8 != r0) goto L32
                goto L4d
            L32:
                android.view.View r8 = (android.view.View) r8
                if (r8 != 0) goto L37
                goto L51
            L37:
                F8.H0 r1 = F8.C0803b0.c()
                com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview$d$a r3 = new com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview$d$a
                com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview r4 = com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview.this
                v8.a r5 = r7.f18812s
                r6 = 0
                r3.<init>(r4, r8, r5, r6)
                r7.f18810q = r2
                java.lang.Object r7 = F8.AbstractC0812g.g(r1, r3, r7)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                h8.A r7 = p079h8.A.f21846a
                return r7
            L51:
                h8.A r7 = p079h8.A.f21846a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18817q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ N1.a f18819s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ A7.a f18820t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(N1.a aVar, A7.a aVar2, p129m8.e eVar) {
            super(2, eVar);
            this.f18819s = aVar;
            this.f18820t = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return ClockHostEditPreview.this.new e(this.f18819s, this.f18820t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f18817q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            ClockHostEditPreview clockHostEditPreview = ClockHostEditPreview.this;
            O1.b bVar = clockHostEditPreview.f18778A;
            String strE = bVar != null ? bVar.e() : null;
            kotlin.jvm.internal.n.e(strE);
            return clockHostEditPreview.K(strE, this.f18819s, this.f18820t);
        }
    }

    public static final class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p219v8.l f18823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ N1.a f18824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ A7.a f18825e;

        public f(p219v8.a aVar, p219v8.l lVar, ClockHostEditPreview clockHostEditPreview, N1.a aVar2, A7.a aVar3) {
            this.f18822b = aVar;
            this.f18823c = lVar;
            this.f18824d = aVar2;
            this.f18825e = aVar3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            F8.L l9 = ClockHostEditPreview.this.f18792z;
            if (l9 != null) {
                AbstractC0816i.d(l9, null, null, ClockHostEditPreview.this.new d(this.f18822b, null), 3, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p219v8.l lVar = this.f18823c;
            O1.b bVar = ClockHostEditPreview.this.f18778A;
            kotlin.jvm.internal.n.e(bVar);
            lVar.f(bVar);
            F8.T t9 = ClockHostEditPreview.this.f18781D;
            if (t9 != null) {
                InterfaceC0846x0.a.a(t9, null, 1, null);
            }
            ClockHostEditPreview clockHostEditPreview = ClockHostEditPreview.this;
            F8.L l9 = clockHostEditPreview.f18792z;
            clockHostEditPreview.f18781D = l9 != null ? AbstractC0816i.b(l9, null, null, ClockHostEditPreview.this.new e(this.f18824d, this.f18825e, null), 3, null) : null;
        }
    }

    public static final class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18826a;

        public g(p219v8.a aVar) {
            this.f18826a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18826a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockHostEditPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final int I(O1.b bVar) {
        if (this.f18788v.f15567e0) {
            return 0;
        }
        return bVar.f() == N1.a.SMALL ? getMinClockHeight() : getMaxClockHeight();
    }

    private final String J(String str, N1.a aVar, A7.a aVar2) {
        return str + "_" + aVar + "_" + aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View K(String str, N1.a aVar, A7.a aVar2) {
        View viewC;
        O2.h hVarA;
        H h10;
        String strJ = J(str, aVar, aVar2);
        Object obj = this.f18782E.get(strJ);
        if (obj != null) {
            View view = (View) obj;
            Object tag = view.getTag(R.id.clock_controller);
            p037d6.b bVar = tag instanceof p037d6.b ? (p037d6.b) tag : null;
            if (bVar != null && (h10 = this.f18779B) != null) {
                if (h10 != null) {
                    h10.L(bVar);
                }
                return O(view);
            }
        }
        H h11 = this.f18779B;
        if (h11 == null || (viewC = h11.C(str, aVar, aVar2)) == null) {
            return null;
        }
        H h12 = this.f18779B;
        if (h12 != null && (hVarA = h12.A()) != null) {
            viewC.setTag(R.id.clock_controller, hVarA);
        }
        this.f18782E.put(strJ, viewC);
        return O(viewC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0037  */
    public final float L(View view) throws Throwable {
        Bitmap bitmapA;
        Throwable th;
        Exception e10;
        try {
            C1260b c1260b = C1260b.f19081a;
            bitmapA = c1260b.a(view, 0.2f);
            try {
                try {
                    float fC = BitmapOpaqueUtil.c(bitmapA, 0, 2, null) / 0.2f;
                    if (bitmapA != null) {
                        c1260b.b(bitmapA);
                    }
                    return fC;
                } catch (Exception e11) {
                    e10 = e11;
                    FileLog.e("ClockHostEditPreview", "getLeftNonTransparentPixel", e10);
                    if (bitmapA == null) {
                        return 0.0f;
                    }
                    C1260b.f19081a.b(bitmapA);
                    return 0.0f;
                }
            } catch (Throwable th2) {
                th = th2;
                if (bitmapA != null) {
                    C1260b.f19081a.b(bitmapA);
                }
                throw th;
            }
        } catch (Exception e12) {
            bitmapA = null;
            e10 = e12;
        } catch (Throwable th3) {
            bitmapA = null;
            th = th3;
            if (bitmapA != null) {
                C1260b.f19081a.b(bitmapA);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(ClockHostEditPreview clockHostEditPreview) {
        return clockHostEditPreview.f18788v.f15577n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(ClockHostEditPreview clockHostEditPreview) {
        return clockHostEditPreview.f18788v.f15578o;
    }

    private final View O(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A3.f.f167a.p(view, 1.0f);
        return view;
    }

    private final Animator P(N1.a aVar) {
        return this.f18791y.l(aVar, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.j
            @Override // p219v8.a
            public final Object invoke() {
                return ClockHostEditPreview.Q();
            }
        }, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.k
            @Override // p219v8.a
            public final Object invoke() {
                return ClockHostEditPreview.R();
            }
        }, new p219v8.p() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.l
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return ClockHostEditPreview.S(this.f19112q, ((Integer) obj).intValue(), ((Float) obj2).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A Q() {
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A R() {
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A S(ClockHostEditPreview clockHostEditPreview, int i10, float f10) {
        clockHostEditPreview.f18786t.f19936v.d(i10);
        return p079h8.A.f21846a;
    }

    private final AnimatorSet T(final O1.b bVar, final O1.b bVar2, final View view, final View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (bVar.f() != bVar2.f() && bVar2.f() != null) {
            animatorSet.play(P(bVar2.f()));
        }
        if (bVar.d() != bVar2.d() && bVar2.d() != null) {
            animatorSet.play(Y(bVar2.d()));
        }
        animatorSet.play(this.f18791y.g(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.o
            @Override // p219v8.a
            public final Object invoke() {
                return ClockHostEditPreview.U(view, this, bVar, view2);
            }
        }, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.p
            @Override // p219v8.a
            public final Object invoke() {
                return ClockHostEditPreview.V(view2, this, bVar2, view);
            }
        }, new p219v8.l() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.f
            @Override // p219v8.l
            public final Object f(Object obj) {
                return ClockHostEditPreview.W(view, ((Float) obj).floatValue());
            }
        }, new p219v8.l() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.g
            @Override // p219v8.l
            public final Object f(Object obj) {
                return ClockHostEditPreview.X(view2, ((Float) obj).floatValue());
            }
        }));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A U(View view, ClockHostEditPreview clockHostEditPreview, O1.b bVar, View view2) {
        int width;
        float width2;
        if (clockHostEditPreview.getLayoutDirection() == 1) {
            if (bVar.d() == A7.a.LEFT) {
                width2 = view.getWidth();
            } else {
                width = view.getWidth();
                width2 = width / 2.0f;
            }
        } else if (bVar.d() == A7.a.LEFT) {
            width2 = 0.0f;
        } else {
            width = view.getWidth();
            width2 = width / 2.0f;
        }
        view.setPivotX(width2);
        view.setPivotY(0.0f);
        view2.setAlpha(0.0f);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A V(View view, ClockHostEditPreview clockHostEditPreview, O1.b bVar, View view2) {
        int width;
        float width2;
        if (clockHostEditPreview.getLayoutDirection() == 1) {
            if (bVar.d() == A7.a.LEFT) {
                width2 = view2.getWidth();
            } else {
                width = view2.getWidth();
                width2 = width / 2.0f;
            }
        } else if (bVar.d() == A7.a.LEFT) {
            width2 = 0.0f;
        } else {
            width = view2.getWidth();
            width2 = width / 2.0f;
        }
        view.setPivotX(width2);
        view.setPivotY(0.0f);
        clockHostEditPreview.f18786t.f19938x.c(bVar, view);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A W(View view, float f10) {
        A3.f.f167a.p(view, 1.0f - (0.1f * f10));
        view.setAlpha(1.0f - f10);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A X(View view, float f10) {
        A3.f.f167a.p(view, (0.1f * f10) + 0.9f);
        view.setAlpha(f10);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animator Y(A7.a aVar) {
        return this.f18791y.e(aVar, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.m
            @Override // p219v8.a
            public final Object invoke() {
                return ClockHostEditPreview.Z();
            }
        }, new p219v8.p() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.n
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return ClockHostEditPreview.a0(this.f19113q, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A Z() {
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A a0(ClockHostEditPreview clockHostEditPreview, float f10, float f11) {
        clockHostEditPreview.f18786t.f19939y.t(f10);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(float f10) {
        AbstractC1316c abstractC1316c = this.f18786t;
        abstractC1316c.f19938x.setAlpha(f10);
        ClockEditContentView clockFaceCurrent = abstractC1316c.f19938x;
        kotlin.jvm.internal.n.g(clockFaceCurrent, "clockFaceCurrent");
        clockFaceCurrent.setVisibility((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
        abstractC1316c.f19939y.C(1 - f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFraction() {
        return this.f18786t.f19938x.getAlpha();
    }

    private final int getMaxClockHeight() {
        return ((Number) this.f18789w.getValue()).intValue();
    }

    private final int getMinClockHeight() {
        return ((Number) this.f18790x.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A v(ClockHostEditPreview clockHostEditPreview, String str) {
        p219v8.l onClockChangedListener = clockHostEditPreview.getOnClockChangedListener();
        if (onClockChangedListener != null) {
            onClockChangedListener.f(str);
        }
        return p079h8.A.f21846a;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void a(boolean z9, O1.b model, S1.a clockViewFactory, p219v8.l onTransitionStart, p219v8.a onTransitionEnd) {
        View viewK;
        kotlin.jvm.internal.n.h(model, "model");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(onTransitionStart, "onTransitionStart");
        kotlin.jvm.internal.n.h(onTransitionEnd, "onTransitionEnd");
        com.nothing.wallpaper.common.log.c.k("ClockHostEditPreview", "setUpEditClockView " + model.e());
        if (model.e() == null) {
            return;
        }
        this.f18782E.clear();
        H h10 = clockViewFactory instanceof H ? (H) clockViewFactory : null;
        if (h10 == null) {
            return;
        }
        this.f18779B = h10;
        if (model.f() == null || model.d() == null || (viewK = K(model.e(), model.f(), model.d())) == null) {
            return;
        }
        onTransitionStart.f(model);
        setTag(model.e());
        if (!z9 || this.f18778A == null) {
            AnimatorSet animatorSet = this.f18780C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f18780C;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            F8.T t9 = this.f18781D;
            if (t9 != null) {
                InterfaceC0846x0.a.a(t9, null, 1, null);
            }
            this.f18786t.f19936v.d(I(model));
            this.f18786t.f19939y.A(model, false);
            this.f18786t.f19938x.c(model, viewK);
            onTransitionEnd.invoke();
        } else {
            View childAt = this.f18786t.f19938x.getChildAt(0);
            if (childAt == null) {
                return;
            }
            this.f18786t.f19939y.A(model, true);
            O1.b bVar = this.f18778A;
            kotlin.jvm.internal.n.e(bVar);
            AnimatorSet animatorSetT = T(bVar, model, childAt, viewK);
            animatorSetT.addListener(new g(onTransitionEnd));
            animatorSetT.start();
            this.f18780C = animatorSetT;
        }
        this.f18778A = model;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void b(boolean z9) {
        if (!z9) {
            b0(this.f18788v.f15567e0 ? 0.0f : 1.0f);
            return;
        }
        O1.b bVar = this.f18778A;
        if (bVar != null) {
            this.f18786t.f19936v.d(I(bVar));
        }
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void c(float f10) {
        this.f18786t.f19937w.setAlpha(B8.h.e(0.1f, f10));
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void d() {
        this.f18786t.f19938x.removeAllViews();
        this.f18782E.clear();
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void e(A7.a align, N1.a size, p219v8.l onTransitionStart, p219v8.a onTransitionEnd) {
        View childAt;
        kotlin.jvm.internal.n.h(align, "align");
        kotlin.jvm.internal.n.h(size, "size");
        kotlin.jvm.internal.n.h(onTransitionStart, "onTransitionStart");
        kotlin.jvm.internal.n.h(onTransitionEnd, "onTransitionEnd");
        O1.b bVar = this.f18778A;
        if (bVar != null) {
            if ((bVar != null ? bVar.d() : null) != align && (childAt = this.f18786t.f19938x.getChildAt(0)) != null && childAt.getWidth() > 0 && childAt.getHeight() > 0) {
                O1.b bVar2 = this.f18778A;
                kotlin.jvm.internal.n.e(bVar2);
                onTransitionStart.f(bVar2);
                O1.b bVar3 = this.f18778A;
                this.f18778A = bVar3 != null ? O1.b.b(bVar3, null, null, null, null, null, null, align, null, 191, null) : null;
                F8.L l9 = this.f18792z;
                if (l9 != null) {
                    AbstractC0816i.d(l9, null, null, new c(size, align, childAt, onTransitionEnd, null), 3, null);
                }
            }
        }
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public ObjectAnimator f(float f10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18777G, f10);
        kotlin.jvm.internal.n.g(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public View getClockView() {
        return this.f18786t.f19938x.getChildAt(0);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public /* bridge */ /* synthetic */ View getIndicator() {
        return super.getIndicator();
    }

    public p219v8.l getOnClockChangedListener() {
        return this.f18784r;
    }

    public p219v8.l getOnClockSelectedListener() {
        return this.f18783q;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public View getView() {
        return this.f18785s;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void h(float f10) {
        this.f18786t.f19936v.c(f10);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void i(N1.a size, A7.a align, p219v8.l onClockSizeChanged, p219v8.a onTransitionStart, p219v8.a onTransitionEnd) {
        kotlin.jvm.internal.n.h(size, "size");
        kotlin.jvm.internal.n.h(align, "align");
        kotlin.jvm.internal.n.h(onClockSizeChanged, "onClockSizeChanged");
        kotlin.jvm.internal.n.h(onTransitionStart, "onTransitionStart");
        kotlin.jvm.internal.n.h(onTransitionEnd, "onTransitionEnd");
        O1.b bVar = this.f18778A;
        if (bVar != null) {
            if ((bVar != null ? bVar.f() : null) == size) {
                return;
            }
            O1.b bVar2 = this.f18778A;
            this.f18778A = bVar2 != null ? O1.b.b(bVar2, null, size, null, null, null, null, null, null, 253, null) : null;
            View childAt = this.f18786t.f19938x.getChildAt(0);
            if (childAt == null || childAt.getWidth() <= 0 || childAt.getHeight() <= 0) {
                return;
            }
            onTransitionStart.invoke();
            float f10 = size == N1.a.SMALL ? 0.7011494f : 1.4262295f;
            float dimension = getResources().getDimension(R.dimen.nt_clock_horizontal_padding) * (TypedValues.CycleType.TYPE_EASING / getResources().getDisplayMetrics().densityDpi);
            AnimatorSet animatorSetK = this.f18791y.k();
            O1.b bVar3 = this.f18778A;
            if ((bVar3 != null ? bVar3.d() : null) == A7.a.CENTER) {
                dimension = getWidth() / 2.0f;
            } else {
                Context context = getContext();
                kotlin.jvm.internal.n.g(context, "getContext(...)");
                if (H6.a.d(context)) {
                    dimension = this.f18788v.f15571h - dimension;
                }
            }
            childAt.setPivotX(dimension);
            childAt.setPivotY(0.0f);
            animatorSetK.play(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) FrameLayout.SCALE_X, f10));
            animatorSetK.play(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) FrameLayout.SCALE_Y, f10));
            animatorSetK.play(P(size));
            animatorSetK.addListener(new f(onTransitionEnd, onClockSizeChanged, this, size, align));
            animatorSetK.start();
            this.f18780C = animatorSetK;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F8.L l9 = this.f18792z;
        if (l9 != null) {
            F8.M.d(l9, null, 1, null);
        }
        AnimatorSet animatorSet = this.f18780C;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f18780C;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        AbstractC1316c abstractC1316c = this.f18786t;
        measureChild(abstractC1316c.f19937w, i10, View.MeasureSpec.makeMeasureSpec(getMaxClockHeight(), BasicMeasure.EXACTLY));
        TopAreaView topAreaView = abstractC1316c.f19939y;
        measureChild(topAreaView, i10, View.MeasureSpec.makeMeasureSpec(topAreaView.getRealHeight(), BasicMeasure.EXACTLY));
        measureChild(abstractC1316c.f19938x, i10, View.MeasureSpec.makeMeasureSpec(getMaxClockHeight(), BasicMeasure.EXACTLY));
        abstractC1316c.f19938x.setTopMarginDate(abstractC1316c.f19939y.getRealHeight());
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getMaxClockHeight());
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void setOnClockChangedListener(p219v8.l lVar) {
        this.f18784r = lVar;
    }

    public void setOnClockSelectedListener(p219v8.l lVar) {
        this.f18783q = lVar;
    }

    public /* synthetic */ ClockHostEditPreview(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockHostEditPreview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18785s = this;
        AbstractC1316c abstractC1316cC = AbstractC1316c.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(abstractC1316cC, "inflate(...)");
        this.f18786t = abstractC1316cC;
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18787u = fVar;
        com.android.launcher3.f fVarK = fVar.K();
        this.f18788v = fVarK;
        this.f18789w = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.e
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(ClockHostEditPreview.M(this.f19101q));
            }
        });
        this.f18790x = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.h
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(ClockHostEditPreview.N(this.f19108q));
            }
        });
        com.android.launcher3.f fVarK2 = fVar.K();
        kotlin.jvm.internal.n.g(fVarK2, "getDeviceProfile(...)");
        this.f18791y = new C2003e(fVarK2);
        this.f18782E = new WeakHashMap();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        b(false);
        this.f18792z = F8.M.a(T0.b(null, 1, null).z(C0803b0.b()));
        abstractC1316cC.f19938x.setOnClockChangedListener(new p219v8.l() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.i
            @Override // p219v8.l
            public final Object f(Object obj) {
                return ClockHostEditPreview.v(this.f19110q, (String) obj);
            }
        });
        ViewGroup.LayoutParams layoutParams = abstractC1316cC.f19939y.getLayoutParams();
        kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = fVarK.h();
        abstractC1316cC.f19938x.setTopMarginDate(abstractC1316cC.f19939y.getRealHeight());
    }
}
