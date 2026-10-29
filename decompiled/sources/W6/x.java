package W6;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import F8.InterfaceC0846x0;
import F8.W;
import I8.AbstractC0882h;
import I8.InterfaceC0881g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import com.nothing.wallpaper.picker.creative.view.InterceptFrameLayout;
import com.nothing.wallpaper.picker.creative.view.MaskHollowView;
import com.nothing.wallpaper.picker.creative.view.NTPageIndicator;
import com.nothing.wallpaper.picker.edit.container.EditWallpaperActivity;
import com.nothing.wallpaper.widget.AspectRatioImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1337q;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC0992i {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final a f8851J = new a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private AbstractC1337q f8853D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private T6.g f8854E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f8857H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private InterfaceC0846x0 f8858I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final List f8852C = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Z6.d f8855F = new Z6.d(new PagerSnapHelper());

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p079h8.h f8856G = X.b(this, kotlin.jvm.internal.F.b(p008a7.d.class), new f(this), new g(null, this), new h(this));

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0) {
                x xVar = x.this;
                xVar.f8857H = xVar.f8855F.l();
                if (x.this.f8857H < 0) {
                    x.this.f8857H = 0;
                }
                x xVar2 = x.this;
                xVar2.R1(xVar2.f8857H);
                x.this.q1().H0(x.this.f8857H);
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8860q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a7.d.c f8862s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f8863t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a7.d.c cVar, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f8862s = cVar;
            this.f8863t = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return x.this.new c(this.f8862s, this.f8863t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f8860q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                this.f8860q = 1;
                if (W.b(200L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            if (!x.this.w0()) {
                x.this.s1(((a7.d.c.b) this.f8862s).e(), !this.f8863t);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8864q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f8866q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f8867r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ x f8868s;

            /* JADX INFO: renamed from: W6.x$d$a$a, reason: collision with other inner class name */
            static final class C0309a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f8869q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ x f8870r;

                /* JADX INFO: renamed from: W6.x$d$a$a$a, reason: collision with other inner class name */
                static final class C0310a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ x f8871q;

                    C0310a(x xVar) {
                        this.f8871q = xVar;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        if (i10 != this.f8871q.f8857H) {
                            this.f8871q.f8855F.q(i10, false);
                        }
                        this.f8871q.f8857H = i10;
                        this.f8871q.b2();
                        return p079h8.A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0309a(x xVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f8870r = xVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0309a(this.f8870r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0309a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f8869q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.O oT0 = this.f8870r.q1().t0();
                        C0310a c0310a = new C0310a(this.f8870r);
                        this.f8869q = 1;
                        if (oT0.a(c0310a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f8872q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ x f8873r;

                /* JADX INFO: renamed from: W6.x$d$a$b$a, reason: collision with other inner class name */
                static final class C0311a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f8874q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f8875r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ x f8876s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0311a(x xVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f8876s = xVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0311a c0311a = new C0311a(this.f8876s, eVar);
                        c0311a.f8875r = obj;
                        return c0311a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f8874q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        a7.d.c cVar = (a7.d.c) this.f8875r;
                        com.nothing.wallpaper.common.log.c.d("NTCreativePromptResultFragment", "observeData uiState     changed:" + cVar);
                        com.nothing.wallpaper.common.log.c.d("NTCreativePromptResultFragment", "observeData uiState lastUiState:" + this.f8876s.r0());
                        if (!kotlin.jvm.internal.n.d(this.f8876s.r0(), cVar)) {
                            boolean z9 = this.f8876s.r0() == null;
                            this.f8876s.F0(cVar);
                            this.f8876s.w1(cVar, z9);
                        }
                        return p079h8.A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(a7.d.c cVar, p129m8.e eVar) {
                        return ((C0311a) create(cVar, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(x xVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f8873r = xVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f8873r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f8872q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.O oP0 = this.f8873r.q1().p0();
                        C0311a c0311a = new C0311a(this.f8873r, null);
                        this.f8872q = 1;
                        if (AbstractC0882h.i(oP0, c0311a, this) == objE) {
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
            a(x xVar, p129m8.e eVar) {
                super(2, eVar);
                this.f8868s = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f8868s, eVar);
                aVar.f8867r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f8866q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                F8.L l9 = (F8.L) this.f8867r;
                AbstractC0816i.d(l9, null, null, new C0309a(this.f8868s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f8868s, null), 3, null);
                return p079h8.A.f21846a;
            }
        }

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return x.this.new d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f8864q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x viewLifecycleOwner = x.this.getViewLifecycleOwner();
                kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(x.this, null);
                this.f8864q = 1;
                if (androidx.lifecycle.N.b(viewLifecycleOwner, bVar, aVar, this) == objE) {
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

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8877q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f8879q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ x f8880r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ J6.i f8881s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, J6.i iVar, p129m8.e eVar) {
                super(2, eVar);
                this.f8880r = xVar;
                this.f8881s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f8880r, this.f8881s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f8879q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                AbstractActivityC1136v activity = this.f8880r.getActivity();
                if (activity != null) {
                    activity.startActivityForResult(EditWallpaperActivity.f18525T.c(activity, this.f8881s, true, false, true), 1);
                }
                return p079h8.A.f21846a;
            }
        }

        e(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return x.this.new e(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f8877q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                J6.i iVarS0 = x.this.q1().s0((Wallpaper) x.this.f8852C.get(x.this.f8857H));
                if (iVarS0 != null) {
                    x xVar = x.this;
                    H0 h0C = C0803b0.c();
                    a aVar = new a(xVar, iVarS0, null);
                    this.f8877q = 1;
                    if (AbstractC0812g.g(h0C, aVar, this) == objE) {
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

    public static final class f extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f8882r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f8882r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f8882r.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f8883r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f8884s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f8883r = aVar;
            this.f8884s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f8883r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f8884s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class h extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f8885r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f8885r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f8885r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    private final void A1() {
        x1();
        I0();
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            T6.g gVar = new T6.g(this.f8852C, new p219v8.l() { // from class: W6.m
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return x.B1(this.f8837q, ((Integer) obj).intValue());
                }
            });
            this.f8854E = gVar;
            o1(abstractC1337q, gVar);
            RecyclerView.ItemAnimator itemAnimator = abstractC1337q.f20069M.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.setChangeDuration(AbstractC0992i.l0());
            }
            abstractC1337q.f20073w.setOnClickListener(new View.OnClickListener() { // from class: W6.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.C1(this.f8839q, view);
                }
            });
            abstractC1337q.f20074x.setOnClickListener(new View.OnClickListener() { // from class: W6.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.D1(this.f8840q, view);
                }
            });
            abstractC1337q.f20059C.setOnSizeChanged(new p219v8.p() { // from class: W6.q
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return x.E1(this.f8841q, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            abstractC1337q.f20057A.setImageDrawable(requireContext().getDrawable(R.drawable.img_wallpaper_placeholder));
        }
        b2();
        this.f8855F.t(new p219v8.l() { // from class: W6.r
            @Override // p219v8.l
            public final Object f(Object obj) {
                return x.F1(this.f8842q, ((Float) obj).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A B1(x xVar, int i10) {
        xVar.u1(i10);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C1(x xVar, View view) {
        xVar.I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(x xVar, View view) {
        xVar.L1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A E1(x xVar, int i10, int i11) {
        xVar.c2();
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A F1(x xVar, float f10) {
        if (f10 > 0.4d) {
            xVar.R1(xVar.f8855F.l());
        }
        return p079h8.A.f21846a;
    }

    private final void G1(AbstractC1337q abstractC1337q) {
        if (w0()) {
            return;
        }
        C0988e c0988eN0 = n0();
        ConstraintLayout layoutSubjectPrompt = abstractC1337q.f20065I;
        kotlin.jvm.internal.n.g(layoutSubjectPrompt, "layoutSubjectPrompt");
        ConstraintLayout layoutStylePrompt = abstractC1337q.f20064H;
        kotlin.jvm.internal.n.g(layoutStylePrompt, "layoutStylePrompt");
        LottieAnimationView lottieProcessing = abstractC1337q.f20066J;
        kotlin.jvm.internal.n.g(lottieProcessing, "lottieProcessing");
        LottieAnimationView lottieProcessingLoop = abstractC1337q.f20067K;
        kotlin.jvm.internal.n.g(lottieProcessingLoop, "lottieProcessingLoop");
        ImageView ivSubjectPrompt = abstractC1337q.f20061E;
        kotlin.jvm.internal.n.g(ivSubjectPrompt, "ivSubjectPrompt");
        c0988eN0.s(layoutSubjectPrompt, layoutStylePrompt, lottieProcessing, lottieProcessingLoop, ivSubjectPrompt, t0(), true);
        C0988e c0988eN1 = n0();
        ConstraintLayout layoutSubjectPrompt2 = abstractC1337q.f20065I;
        kotlin.jvm.internal.n.g(layoutSubjectPrompt2, "layoutSubjectPrompt");
        ConstraintLayout layoutStylePrompt2 = abstractC1337q.f20064H;
        kotlin.jvm.internal.n.g(layoutStylePrompt2, "layoutStylePrompt");
        LottieAnimationView lottieProcessing2 = abstractC1337q.f20066J;
        kotlin.jvm.internal.n.g(lottieProcessing2, "lottieProcessing");
        LottieAnimationView lottieProcessingLoop2 = abstractC1337q.f20067K;
        kotlin.jvm.internal.n.g(lottieProcessingLoop2, "lottieProcessingLoop");
        ImageView ivStylePrompt = abstractC1337q.f20060D;
        kotlin.jvm.internal.n.g(ivStylePrompt, "ivStylePrompt");
        c0988eN1.s(layoutSubjectPrompt2, layoutStylePrompt2, lottieProcessing2, lottieProcessingLoop2, ivStylePrompt, t0(), false);
        C0988e c0988eN2 = n0();
        ConstraintLayout layoutSubjectPrompt3 = abstractC1337q.f20065I;
        kotlin.jvm.internal.n.g(layoutSubjectPrompt3, "layoutSubjectPrompt");
        c0988eN2.x(layoutSubjectPrompt3, AbstractC0992i.p0(), AbstractC0992i.o0(), AbstractC0992i.m0());
        C0988e c0988eN3 = n0();
        ConstraintLayout layoutStylePrompt3 = abstractC1337q.f20064H;
        kotlin.jvm.internal.n.g(layoutStylePrompt3, "layoutStylePrompt");
        c0988eN3.x(layoutStylePrompt3, AbstractC0992i.p0(), AbstractC0992i.o0(), AbstractC0992i.m0());
        C0988e c0988eN4 = n0();
        AspectRatioImageView ivBlurPlaceholder = abstractC1337q.f20057A;
        kotlin.jvm.internal.n.g(ivBlurPlaceholder, "ivBlurPlaceholder");
        c0988eN4.z(ivBlurPlaceholder, AbstractC0992i.o0(), AbstractC0992i.o0());
    }

    private final void H1() {
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new d(null), 3, null);
    }

    private final void I1() {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null && (interceptFrameLayout = abstractC1337q.f20063G) != null && interceptFrameLayout.getNeedInterceptTouchEvent()) {
            com.nothing.wallpaper.common.log.c.o("NTCreativePromptResultFragment", "recyclerView is scrolling!");
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        if (p087i6.m.a(contextRequireContext)) {
            q1().x0();
        } else {
            L0();
        }
    }

    private final void J1() {
        Wallpaper wallpaper = (Wallpaper) AbstractC1444s.U(this.f8852C);
        if (wallpaper == null || !X6.c.a(wallpaper)) {
            return;
        }
        this.f8852C.remove(wallpaper);
        T6.g gVar = this.f8854E;
        if (gVar == null) {
            kotlin.jvm.internal.n.r("adapter");
            gVar = null;
        }
        gVar.notifyItemRemoved(0);
        b2();
        this.f8855F.q(0, false);
    }

    private final void K1(AbstractC1337q abstractC1337q) {
        n0().i();
        C0988e c0988eN0 = n0();
        ConstraintLayout layoutSubjectPrompt = abstractC1337q.f20065I;
        kotlin.jvm.internal.n.g(layoutSubjectPrompt, "layoutSubjectPrompt");
        ConstraintLayout layoutStylePrompt = abstractC1337q.f20064H;
        kotlin.jvm.internal.n.g(layoutStylePrompt, "layoutStylePrompt");
        c0988eN0.w(layoutSubjectPrompt, layoutStylePrompt);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_selected_prompt_restore);
        abstractC1337q.f20061E.startAnimation(animationLoadAnimation);
        abstractC1337q.f20060D.startAnimation(animationLoadAnimation);
        abstractC1337q.f20061E.setAlpha(1.0f);
        abstractC1337q.f20060D.setAlpha(1.0f);
        A3.f fVar = A3.f.f167a;
        ImageView ivSubjectPrompt = abstractC1337q.f20061E;
        kotlin.jvm.internal.n.g(ivSubjectPrompt, "ivSubjectPrompt");
        fVar.p(ivSubjectPrompt, 1.0f);
        ImageView ivStylePrompt = abstractC1337q.f20060D;
        kotlin.jvm.internal.n.g(ivStylePrompt, "ivStylePrompt");
        fVar.p(ivStylePrompt, 1.0f);
        abstractC1337q.f20065I.setRenderEffect(null);
        abstractC1337q.f20064H.setRenderEffect(null);
        abstractC1337q.f20057A.setRenderEffect(null);
    }

    private final void L1() {
        if (this.f8857H >= this.f8852C.size()) {
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f8858I;
        if (interfaceC0846x0 != null && !interfaceC0846x0.O0()) {
            com.nothing.wallpaper.common.log.c.o("NTCreativePromptResultFragment", "setAsWallpaperJob not completed");
            return;
        }
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f8858I = AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), C0803b0.b(), null, new e(null), 2, null);
    }

    private final void M1(boolean z9, boolean z10, p219v8.a aVar) {
        C0988e c0988eN0 = n0();
        AbstractC1337q abstractC1337q = this.f8853D;
        c0988eN0.C(abstractC1337q != null ? abstractC1337q.f20057A : null, z9, z10, true, false, aVar);
    }

    static /* synthetic */ void N1(x xVar, boolean z9, boolean z10, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        xVar.M1(z9, z10, aVar);
    }

    private final void O1(boolean z9) {
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            C0988e c0988eN0 = n0();
            LottieAnimationView lottieProcessing = abstractC1337q.f20066J;
            kotlin.jvm.internal.n.g(lottieProcessing, "lottieProcessing");
            LottieAnimationView lottieProcessingLoop = abstractC1337q.f20067K;
            kotlin.jvm.internal.n.g(lottieProcessingLoop, "lottieProcessingLoop");
            c0988eN0.D(lottieProcessing, lottieProcessingLoop, z9);
        }
    }

    private final void P1(boolean z9) {
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            abstractC1337q.f20071O.setVisibility(z9 ? 0 : 4);
        }
    }

    private final void Q1(boolean z9) {
        C0988e c0988eN0 = n0();
        AbstractC1337q abstractC1337q = this.f8853D;
        c0988eN0.B(abstractC1337q != null ? abstractC1337q.f20058B : null, z9, false, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(int i10) {
        AbstractC1337q abstractC1337q;
        NTPageIndicator nTPageIndicator;
        if (this.f8852C.size() < 1 || i10 >= this.f8852C.size() || (abstractC1337q = this.f8853D) == null || (nTPageIndicator = abstractC1337q.f20068L) == null) {
            return;
        }
        nTPageIndicator.setLocation(i10);
    }

    private final void S1(boolean z9, boolean z10) {
        C0988e c0988eN0 = n0();
        AbstractC1337q abstractC1337q = this.f8853D;
        c0988eN0.B(abstractC1337q != null ? abstractC1337q.f20065I : null, z9, z10, true, null);
        C0988e c0988eN1 = n0();
        AbstractC1337q abstractC1337q2 = this.f8853D;
        c0988eN1.B(abstractC1337q2 != null ? abstractC1337q2.f20064H : null, z9, z10, true, null);
    }

    static /* synthetic */ void T1(x xVar, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        xVar.S1(z9, z10);
    }

    private final void U1(boolean z9, boolean z10) {
        C0988e c0988eN0 = n0();
        AbstractC1337q abstractC1337q = this.f8853D;
        c0988eN0.B(abstractC1337q != null ? abstractC1337q.f20073w : null, z9, z10, true, null);
    }

    private final void V1(boolean z9) {
        Toolbar toolbar;
        Menu menu;
        MenuItem menuItemFindItem;
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q == null || (toolbar = abstractC1337q.f20070N) == null || (menu = toolbar.getMenu()) == null || (menuItemFindItem = menu.findItem(R.id.menu_save)) == null) {
            return;
        }
        menuItemFindItem.setVisible(z9);
    }

    private final void W1(boolean z9) {
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            C0988e c0988eN0 = n0();
            AspectRatioImageView ivSelectedFrame = abstractC1337q.f20059C;
            kotlin.jvm.internal.n.g(ivSelectedFrame, "ivSelectedFrame");
            c0988eN0.G(ivSelectedFrame, z9);
        }
    }

    private final void X1(boolean z9, boolean z10) {
        C0988e c0988eN0 = n0();
        AbstractC1337q abstractC1337q = this.f8853D;
        c0988eN0.B(abstractC1337q != null ? abstractC1337q.f20074x : null, z9, z10, true, null);
    }

    private final void Y1(X6.d.a aVar, boolean z9) {
        N1(this, false, false, null, 6, null);
        P1(false);
        X1(true, false);
        W1(true);
        U1(true, false);
        V1(true);
        Q1(false);
        O1(false);
        T1(this, false, false, 2, null);
        J1();
        p1();
        if (z9) {
            K0(aVar);
        }
    }

    private final void Z1(List list, boolean z9) {
        a2();
        Wallpaper wallpaper = (Wallpaper) AbstractC1444s.U(list);
        T6.g gVar = null;
        if (wallpaper == null) {
            Y1(null, z9);
        } else {
            if (p008a7.d.f9853v.a(this.f8852C)) {
                T6.g gVar2 = this.f8854E;
                if (gVar2 == null) {
                    kotlin.jvm.internal.n.r("adapter");
                    gVar2 = null;
                }
                gVar2.notifyItemRemoved(this.f8852C.size() - 1);
            }
            Wallpaper wallpaper2 = (Wallpaper) AbstractC1444s.U(this.f8852C);
            if (wallpaper2 != null && X6.c.a(wallpaper2)) {
                wallpaper2.setId(wallpaper.getId());
                wallpaper2.setLink(wallpaper.getLink());
                T6.g gVar3 = this.f8854E;
                if (gVar3 == null) {
                    kotlin.jvm.internal.n.r("adapter");
                } else {
                    gVar = gVar3;
                }
                gVar.notifyItemChanged(0);
            } else if (!this.f8852C.contains(wallpaper)) {
                this.f8852C.add(0, wallpaper);
                T6.g gVar4 = this.f8854E;
                if (gVar4 == null) {
                    kotlin.jvm.internal.n.r("adapter");
                } else {
                    gVar = gVar4;
                }
                gVar.notifyItemInserted(0);
            }
            this.f8855F.q(0, false);
        }
        p1();
    }

    private final void a2() {
        T6.g gVar = this.f8854E;
        if (gVar == null) {
            kotlin.jvm.internal.n.r("adapter");
            gVar = null;
        }
        boolean z9 = gVar.d().y <= 0;
        T6.g gVar2 = this.f8854E;
        if (gVar2 == null) {
            kotlin.jvm.internal.n.r("adapter");
            gVar2 = null;
        }
        if (z9 | (gVar2.d().x <= 0)) {
            c2();
        }
        P1(false);
        X1(true, true);
        U1(true, true);
        W1(true);
        V1(true);
        Q1(false);
        N1(this, false, false, null, 6, null);
        O1(false);
        T1(this, false, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2() {
        AbstractC1337q abstractC1337q;
        NTPageIndicator nTPageIndicator;
        NTPageIndicator nTPageIndicator2;
        AbstractC1337q abstractC1337q2 = this.f8853D;
        if (abstractC1337q2 != null && (nTPageIndicator2 = abstractC1337q2.f20068L) != null) {
            nTPageIndicator2.setNumPages(this.f8852C.size());
        }
        if (this.f8857H >= this.f8852C.size() || this.f8852C.size() <= 0 || (abstractC1337q = this.f8853D) == null || (nTPageIndicator = abstractC1337q.f20068L) == null) {
            return;
        }
        nTPageIndicator.setLocation(this.f8857H);
    }

    private final void c2() {
        AspectRatioImageView aspectRatioImageView;
        Resources resources;
        AbstractActivityC1136v activity = getActivity();
        if (activity == null) {
            return;
        }
        final Point pointE = H3.s.a().e(activity.getDisplay());
        Context context = getContext();
        final int dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.nt_creative_frame_width);
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q == null || (aspectRatioImageView = abstractC1337q.f20059C) == null) {
            return;
        }
        aspectRatioImageView.post(new Runnable() { // from class: W6.s
            @Override // java.lang.Runnable
            public final void run() {
                x.d2(this.f8843q, dimensionPixelSize, pointE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(x xVar, int i10, Point point) {
        AbstractC1337q abstractC1337q = xVar.f8853D;
        if (abstractC1337q != null) {
            int measuredWidth = abstractC1337q.f20059C.getMeasuredWidth();
            int measuredHeight = abstractC1337q.f20059C.getMeasuredHeight();
            int dimension = (int) xVar.getResources().getDimension(R.dimen.nt_creative_prompt_placeholder_margin);
            xVar.E0(measuredWidth - i10);
            int i11 = measuredHeight - i10;
            xVar.H0((((measuredHeight - xVar.q0()) / 4) * 3) - i10);
            xVar.f8855F.u(xVar.q0());
            T6.g gVar = xVar.f8854E;
            T6.g gVar2 = null;
            if (gVar == null) {
                kotlin.jvm.internal.n.r("adapter");
                gVar = null;
            }
            gVar.g(new Point(xVar.q0(), i11));
            MaskHollowView maskHollowView = abstractC1337q.f20058B;
            maskHollowView.setHollowMarginTop(maskHollowView.getResources().getDimensionPixelSize(R.dimen.nt_creative_frame_margin_top) + abstractC1337q.f20070N.getMeasuredHeight() + dimension);
            int i12 = dimension * 2;
            maskHollowView.c(measuredWidth - i12, measuredHeight - i12);
            int iQ0 = (point.x - xVar.q0()) / 2;
            abstractC1337q.f20069M.setPadding(iQ0, 0, iQ0, 0);
            abstractC1337q.f20069M.requestLayout();
            T6.g gVar3 = xVar.f8854E;
            if (gVar3 == null) {
                kotlin.jvm.internal.n.r("adapter");
            } else {
                gVar2 = gVar3;
            }
            gVar2.notifyDataSetChanged();
            xVar.e2(abstractC1337q, measuredWidth, measuredHeight, i10);
        }
    }

    private final void e2(AbstractC1337q abstractC1337q, int i10, int i11, int i12) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.nt_creative_item_margin);
        int dimension = ((int) getResources().getDimension(R.dimen.nt_creative_prompt_placeholder_margin)) * 2;
        int i13 = i10 - dimension;
        int i14 = ((i11 - dimension) - dimensionPixelSize) / 2;
        ViewGroup.LayoutParams layoutParams = abstractC1337q.f20061E.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = abstractC1337q.f20060D.getLayoutParams();
        layoutParams.width = i13;
        layoutParams.height = i14;
        layoutParams2.width = i13;
        layoutParams2.height = i14;
        int dimension2 = (int) getResources().getDimension(R.dimen.nt_creative_recyclerview_margin);
        kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i15 = (i11 - ((i11 - i12) / 2)) + dimension2;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i15;
        kotlin.jvm.internal.n.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i15;
        abstractC1337q.f20061E.requestLayout();
        abstractC1337q.f20060D.requestLayout();
        RequestOptions requestOptionsTransform = new RequestOptions().transform(new CenterCrop(), new RoundedCorners((int) getResources().getDimension(R.dimen.nt_creative_prompt_radius)));
        Prompt promptC0 = q1().c0();
        if (promptC0 != null) {
            Glide.with(abstractC1337q.f20061E).load(promptC0.getPhotoLink()).apply((BaseRequestOptions<?>) requestOptionsTransform).into(abstractC1337q.f20061E);
        }
        Prompt promptB0 = q1().b0();
        if (promptB0 != null) {
            Glide.with(abstractC1337q.f20060D).load(promptB0.getPhotoLink()).apply((BaseRequestOptions<?>) requestOptionsTransform).into(abstractC1337q.f20060D);
        }
    }

    private final void l1() {
        final AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            this.f8857H = 0;
            abstractC1337q.f20069M.post(new Runnable() { // from class: W6.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.m1(this.f8849q, abstractC1337q);
                }
            });
            abstractC1337q.f20069M.postDelayed(new Runnable() { // from class: W6.n
                @Override // java.lang.Runnable
                public final void run() {
                    x.n1(this.f8838q);
                }
            }, AbstractC0992i.l0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(x xVar, AbstractC1337q abstractC1337q) {
        xVar.f8852C.add(0, new Wallpaper(-1L, ""));
        T6.g gVar = xVar.f8854E;
        T6.g gVar2 = null;
        if (gVar == null) {
            kotlin.jvm.internal.n.r("adapter");
            gVar = null;
        }
        gVar.notifyItemInserted(0);
        T6.g gVar3 = xVar.f8854E;
        if (gVar3 == null) {
            kotlin.jvm.internal.n.r("adapter");
        } else {
            gVar2 = gVar3;
        }
        gVar2.notifyItemRangeChanged(0, xVar.f8852C.size());
        xVar.f8855F.q(0, true);
        RecyclerView rvPromptGenerateResult = abstractC1337q.f20069M;
        kotlin.jvm.internal.n.g(rvPromptGenerateResult, "rvPromptGenerateResult");
        xVar.N0(rvPromptGenerateResult, (0 - xVar.f8857H) * xVar.q0());
        xVar.Q1(true);
        xVar.b2();
        xVar.G1(abstractC1337q);
        xVar.S1(true, true);
        N1(xVar, true, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(x xVar) {
        if (xVar.x0()) {
            xVar.f8855F.q(0, true);
        }
    }

    private final void o1(AbstractC1337q abstractC1337q, T6.g gVar) {
        abstractC1337q.f20069M.setAdapter(gVar);
        Z6.d dVar = this.f8855F;
        RecyclerView rvPromptGenerateResult = abstractC1337q.f20069M;
        kotlin.jvm.internal.n.g(rvPromptGenerateResult, "rvPromptGenerateResult");
        dVar.i(rvPromptGenerateResult);
        abstractC1337q.f20069M.addOnScrollListener(new b());
    }

    private final void p1() {
        if (this.f8852C.size() != q1().a0().size()) {
            com.nothing.wallpaper.common.log.c.d("NTCreativePromptResultFragment", "checkWallpapersCount not same!");
            this.f8852C.clear();
            this.f8852C.addAll(q1().a0());
            T6.g gVar = this.f8854E;
            if (gVar == null) {
                kotlin.jvm.internal.n.r("adapter");
                gVar = null;
            }
            gVar.notifyDataSetChanged();
            this.f8855F.q(this.f8857H, false);
        }
        b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p008a7.d q1() {
        return (p008a7.d) this.f8856G.getValue();
    }

    private final void r1(boolean z9) {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            K1(abstractC1337q);
        }
        P1(false);
        X1(true, false);
        U1(true, false);
        W1(true);
        V1(true);
        J1();
        p1();
        Q1(false);
        N1(this, false, false, null, 6, null);
        O1(false);
        T1(this, false, false, 2, null);
        if (z9) {
            K0(null);
        }
        AbstractC1337q abstractC1337q2 = this.f8853D;
        if (abstractC1337q2 == null || (interceptFrameLayout = abstractC1337q2.f20063G) == null) {
            return;
        }
        interceptFrameLayout.setNeedInterceptTouchEvent(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(X6.d dVar, boolean z9) {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            K1(abstractC1337q);
        }
        if (dVar instanceof X6.d.b) {
            X6.d.b bVar = (X6.d.b) dVar;
            if (q1().u0(bVar)) {
                Z1(bVar.a(), z9);
                q1().A0((Wallpaper) AbstractC1444s.S(bVar.a()));
            } else {
                Y1(null, z9);
            }
        } else if (dVar instanceof X6.d.a) {
            Y1((X6.d.a) dVar, z9);
        } else {
            Y1(null, z9);
        }
        AbstractC1337q abstractC1337q2 = this.f8853D;
        if (abstractC1337q2 == null || (interceptFrameLayout = abstractC1337q2.f20063G) == null) {
            return;
        }
        interceptFrameLayout.setNeedInterceptTouchEvent(false);
    }

    private final void t1() {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null && (interceptFrameLayout = abstractC1337q.f20063G) != null) {
            interceptFrameLayout.setNeedInterceptTouchEvent(true);
        }
        P1(true);
        X1(false, false);
        U1(false, false);
        W1(false);
        V1(false);
        l1();
    }

    private final void u1(int i10) {
        RecyclerView recyclerView;
        InterceptFrameLayout interceptFrameLayout;
        com.nothing.wallpaper.common.log.c.d("NTCreativePromptResultFragment", "handleOnItemClicked " + i10);
        if (i10 == this.f8857H) {
            L1();
            return;
        }
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null && (interceptFrameLayout = abstractC1337q.f20063G) != null) {
            interceptFrameLayout.setNeedInterceptTouchEvent(true);
        }
        AbstractC1337q abstractC1337q2 = this.f8853D;
        if (abstractC1337q2 == null || (recyclerView = abstractC1337q2.f20069M) == null) {
            return;
        }
        N0(recyclerView, (i10 - this.f8857H) * q0());
        recyclerView.postDelayed(new Runnable() { // from class: W6.t
            @Override // java.lang.Runnable
            public final void run() {
                x.v1(this.f8846q);
            }
        }, s0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(x xVar) {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1337q abstractC1337q = xVar.f8853D;
        if (abstractC1337q == null || (interceptFrameLayout = abstractC1337q.f20063G) == null) {
            return;
        }
        interceptFrameLayout.setNeedInterceptTouchEvent(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(a7.d.c cVar, boolean z9) {
        com.nothing.wallpaper.common.log.c.d("NTCreativePromptResultFragment", "handleUiStateOnChanged:" + cVar);
        if (cVar instanceof a7.d.c.C0354c) {
            r1(!z9);
            return;
        }
        if ((cVar instanceof a7.d.c.i) || (cVar instanceof a7.d.c.C0355d) || (cVar instanceof a7.d.c.e)) {
            t1();
            return;
        }
        if (!(cVar instanceof a7.d.c.b)) {
            if (z9) {
                p1();
            }
        } else {
            if (!this.f8852C.isEmpty()) {
                s1(((a7.d.c.b) cVar).e(), !z9);
                return;
            }
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new c(cVar, z9, null), 3, null);
        }
    }

    private final void x1() {
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            abstractC1337q.f20076z.setText(q1().l0());
            abstractC1337q.f20070N.inflateMenu(R.menu.nt_creative_result_menu);
            abstractC1337q.f20070N.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: W6.u
                @Override // android.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return x.y1(this.f8847q, menuItem);
                }
            });
            abstractC1337q.f20070N.setNavigationOnClickListener(new View.OnClickListener() { // from class: W6.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.z1(this.f8848q, view);
                }
            });
        }
        if (y0()) {
            AbstractC1337q abstractC1337q2 = this.f8853D;
            J0(abstractC1337q2 != null ? abstractC1337q2.f20070N : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(x xVar, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_save) {
            return false;
        }
        if (xVar.f8857H >= xVar.f8852C.size()) {
            return true;
        }
        String link = ((Wallpaper) xVar.f8852C.get(xVar.f8857H)).getLink();
        if (link.length() <= 0) {
            return true;
        }
        xVar.q1().v0(link);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(x xVar, View view) {
        p010b.v vVarF;
        AbstractActivityC1136v activity = xVar.getActivity();
        if (activity == null || (vVarF = activity.f()) == null) {
            return;
        }
        vVarF.l();
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.nothing.wallpaper.common.log.c.k("NTCreativePromptResultFragment", "onCreate");
        k0(true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.n.h(inflater, "inflater");
        AbstractC1337q abstractC1337qC = AbstractC1337q.C(inflater, viewGroup, false);
        this.f8853D = abstractC1337qC;
        A1();
        View viewO = abstractC1337qC.o();
        kotlin.jvm.internal.n.g(viewO, "let(...)");
        return viewO;
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        this.f8855F.k();
        this.f8853D = null;
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        com.nothing.wallpaper.common.log.c.k("NTCreativePromptResultFragment", "onStop " + this.f8852C.size());
        if (!this.f8852C.isEmpty()) {
            J6.h.f3588i.b(true);
        }
        AbstractC1337q abstractC1337q = this.f8853D;
        if (abstractC1337q != null) {
            K1(abstractC1337q);
        }
        p008a7.d.I(q1(), false, 1, null);
        q1().K();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.n.h(view, "view");
        super.onViewCreated(view, bundle);
        H1();
    }

    @Override // com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity.b
    public boolean q() {
        if (kotlin.jvm.internal.n.d(r0(), a7.d.c.e.f9885v) || kotlin.jvm.internal.n.d(r0(), a7.d.c.C0355d.f9884v)) {
            q1().H(true);
            return true;
        }
        q1().H(false);
        q1().H0(0);
        q1().z0();
        return false;
    }
}
