package W6;

import F8.AbstractC0816i;
import I8.AbstractC0882h;
import I8.InterfaceC0881g;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.core.view.V;
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
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import com.nothing.wallpaper.picker.creative.view.InterceptFrameLayout;
import com.nothing.wallpaper.picker.creative.view.MaskHollowView;
import com.nothing.wallpaper.widget.AspectRatioImageView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1338s;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends AbstractC0992i {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final a f8713b0 = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private AbstractC1338s f8714C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.material.bottomsheet.a f8716E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private T6.b f8719H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private T6.b f8720I;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f8723L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f8724M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f8725N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f8726O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private View f8727P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private View f8728Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private View f8729R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private View f8730S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f8731T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private View f8732U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f8733V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private C0995l f8734W;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p079h8.h f8715D = X.b(this, kotlin.jvm.internal.F.b(p008a7.d.class), new f(this), new g(null, this), new h(this));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final List f8717F = new ArrayList();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final List f8718G = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Z6.d f8721J = new Z6.d(new PagerSnapHelper());

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Z6.d f8722K = new Z6.d(new PagerSnapHelper());

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f8735X = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f8736Y = "";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final i f8737Z = new i(Looper.getMainLooper());

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final e f8738a0 = new e();

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
                if (U.this.f8724M < 0) {
                    U.this.f8724M = 0;
                }
                U u9 = U.this;
                u9.f8724M = u9.f8721J.l();
                U.this.H1().E0(U.this.f8724M);
            }
        }
    }

    public static final class c extends RecyclerView.OnScrollListener {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0) {
                U u9 = U.this;
                u9.f8723L = u9.f8722K.l();
                if (U.this.f8723L < 0) {
                    U.this.f8723L = 0;
                }
                U.this.H1().F0(U.this.f8723L);
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8741q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f8743q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f8744r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ U f8745s;

            /* JADX INFO: renamed from: W6.U$d$a$a, reason: collision with other inner class name */
            static final class C0304a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f8746q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ U f8747r;

                /* JADX INFO: renamed from: W6.U$d$a$a$a, reason: collision with other inner class name */
                static final class C0305a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f8748q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f8749r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ U f8750s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0305a(U u9, p129m8.e eVar) {
                        super(2, eVar);
                        this.f8750s = u9;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0305a c0305a = new C0305a(this.f8750s, eVar);
                        c0305a.f8749r = obj;
                        return c0305a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f8748q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        a7.d.c cVar = (a7.d.c) this.f8749r;
                        com.nothing.wallpaper.common.log.c.d("NTCreativeSelectorFragment", "observeData uiState     changed:" + cVar);
                        com.nothing.wallpaper.common.log.c.d("NTCreativeSelectorFragment", "observeData uiState lastUiState:" + this.f8750s.r0());
                        if (!kotlin.jvm.internal.n.d(cVar, this.f8750s.r0())) {
                            boolean z9 = this.f8750s.r0() == null;
                            this.f8750s.F0(cVar);
                            this.f8750s.W1(cVar, z9);
                        }
                        return p079h8.A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(a7.d.c cVar, p129m8.e eVar) {
                        return ((C0305a) create(cVar, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0304a(U u9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f8747r = u9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0304a(this.f8747r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0304a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f8746q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.O oP0 = this.f8747r.H1().p0();
                        C0305a c0305a = new C0305a(this.f8747r, null);
                        this.f8746q = 1;
                        if (AbstractC0882h.i(oP0, c0305a, this) == objE) {
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
                int f8751q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ U f8752r;

                /* JADX INFO: renamed from: W6.U$d$a$b$a, reason: collision with other inner class name */
                static final class C0306a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ U f8753q;

                    C0306a(U u9) {
                        this.f8753q = u9;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        T6.b bVar = this.f8753q.f8719H;
                        if (bVar == null) {
                            kotlin.jvm.internal.n.r("styleAdapter");
                            bVar = null;
                        }
                        if (i10 < bVar.getItemCount() && this.f8753q.f8724M != i10) {
                            this.f8753q.f8721J.q(this.f8753q.f8724M, false);
                        }
                        this.f8753q.f8724M = i10;
                        return p079h8.A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(U u9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f8752r = u9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f8752r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f8751q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.O oN0 = this.f8752r.H1().n0();
                        C0306a c0306a = new C0306a(this.f8752r);
                        this.f8751q = 1;
                        if (oN0.a(c0306a, this) == objE) {
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

            static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f8754q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ U f8755r;

                /* JADX INFO: renamed from: W6.U$d$a$c$a, reason: collision with other inner class name */
                static final class C0307a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ U f8756q;

                    C0307a(U u9) {
                        this.f8756q = u9;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        T6.b bVar = this.f8756q.f8720I;
                        if (bVar == null) {
                            kotlin.jvm.internal.n.r("subjectAdapter");
                            bVar = null;
                        }
                        if (i10 < bVar.getItemCount() && this.f8756q.f8723L != i10) {
                            this.f8756q.f8722K.q(this.f8756q.f8723L, false);
                        }
                        this.f8756q.f8723L = i10;
                        return p079h8.A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(U u9, p129m8.e eVar) {
                    super(2, eVar);
                    this.f8755r = u9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f8755r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f8754q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.O oO0 = this.f8755r.H1().o0();
                        C0307a c0307a = new C0307a(this.f8755r);
                        this.f8754q = 1;
                        if (oO0.a(c0307a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u9, p129m8.e eVar) {
                super(2, eVar);
                this.f8745s = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f8745s, eVar);
                aVar.f8744r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f8743q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                F8.L l9 = (F8.L) this.f8744r;
                AbstractC0816i.d(l9, null, null, new C0304a(this.f8745s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f8745s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f8745s, null), 3, null);
                return p079h8.A.f21846a;
            }
        }

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return U.this.new d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f8741q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x viewLifecycleOwner = U.this.getViewLifecycleOwner();
                kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(U.this, null);
                this.f8741q = 1;
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

    public static final class e extends p010b.u {
        e() {
            super(true);
        }

        @Override // p010b.u
        public void d() {
            U.this.C1();
        }
    }

    public static final class f extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f8758r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f8758r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f8758r.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f8759r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f8760s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f8759r = aVar;
            this.f8760s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f8759r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f8760s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class h extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f8761r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f8761r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f8761r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class i extends Handler {
        i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            kotlin.jvm.internal.n.h(msg, "msg");
            if (msg.what == 10) {
                if (U.this.x0()) {
                    U.this.X2();
                }
                U.this.f8735X = true;
            }
        }
    }

    private final void A1(AbstractC1338s abstractC1338s, T6.b bVar) {
        abstractC1338s.f20105R.setAdapter(bVar);
        Z6.d dVar = this.f8722K;
        RecyclerView rvSubjectPrompt = abstractC1338s.f20105R;
        kotlin.jvm.internal.n.g(rvSubjectPrompt, "rvSubjectPrompt");
        dVar.i(rvSubjectPrompt);
        abstractC1338s.f20105R.addOnScrollListener(new c());
    }

    private final void A2(boolean z9) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.B(abstractC1338s != null ? abstractC1338s.f20089B : null, z9, false, true, null);
    }

    private final void B1() {
        List listG0 = H1().g0();
        if (listG0 != null && this.f8718G.size() != listG0.size()) {
            this.f8718G.clear();
            this.f8718G.addAll(listG0);
            T6.b bVar = this.f8720I;
            if (bVar == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
                bVar = null;
            }
            bVar.notifyDataSetChanged();
            int i10 = this.f8723L;
            T6.b bVar2 = this.f8720I;
            if (bVar2 == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
                bVar2 = null;
            }
            if (i10 < bVar2.getItemCount()) {
                this.f8722K.q(this.f8723L, false);
            }
        }
        List listF0 = H1().f0();
        if (listF0 != null && this.f8717F.size() != listF0.size()) {
            this.f8717F.clear();
            this.f8717F.addAll(listF0);
            T6.b bVar3 = this.f8719H;
            if (bVar3 == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
                bVar3 = null;
            }
            bVar3.notifyDataSetChanged();
            int i11 = this.f8724M;
            T6.b bVar4 = this.f8719H;
            if (bVar4 == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
                bVar4 = null;
            }
            if (i11 < bVar4.getItemCount()) {
                this.f8721J.q(this.f8724M, false);
            }
        }
        if ((!this.f8717F.isEmpty()) || (!this.f8718G.isEmpty())) {
            F2(true, true);
            w2(true, true, true);
            H2(true, true, null);
            C2(this, false, 0, 2, null);
            I2(true);
            E2(false, false);
            D2(true, false, true);
            return;
        }
        F2(false, false);
        w2(false, true, false);
        H2(false, true, null);
        C2(this, true, 0, 2, null);
        I2(false);
        E2(true, false);
        D2(false, false, false);
    }

    private final void B2(boolean z9, int i10) {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            abstractC1338s.f20110x.f19827v.setVisibility(z9 ? 0 : 8);
            abstractC1338s.f20110x.f19829x.setText(requireContext().getResources().getString(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1() {
        com.google.android.material.bottomsheet.a aVar = this.f8716E;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    static /* synthetic */ void C2(U u9, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = R.string.nt_no_network_connection;
        }
        u9.B2(z9, i10);
    }

    private final void D1() {
        C0995l c0995l = this.f8734W;
        if (c0995l != null) {
            c0995l.f();
        }
    }

    private final void D2(boolean z9, boolean z10, boolean z11) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.B(abstractC1338s != null ? abstractC1338s.f20090C : null, z9, z10, z11, null);
    }

    private final void E1() {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            abstractC1338s.f20102O.setNeedInterceptTouchEvent(true);
            abstractC1338s.f20101N.setNeedInterceptTouchEvent(true);
        }
    }

    private final void E2(boolean z9, boolean z10) {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            int i10 = z9 ? 0 : 4;
            abstractC1338s.f20091D.setVisibility(i10);
            abstractC1338s.f20092E.setVisibility(i10);
            abstractC1338s.f20098K.setVisibility(i10);
            abstractC1338s.f20099L.setVisibility(i10);
            abstractC1338s.f20093F.setVisibility(i10);
            abstractC1338s.f20094G.setVisibility(i10);
            LottieAnimationView lavPromptPlaceholder = abstractC1338s.f20098K;
            kotlin.jvm.internal.n.g(lavPromptPlaceholder, "lavPromptPlaceholder");
            z0(lavPromptPlaceholder, z10);
            LottieAnimationView lavPromptPlaceholder2 = abstractC1338s.f20099L;
            kotlin.jvm.internal.n.g(lavPromptPlaceholder2, "lavPromptPlaceholder2");
            z0(lavPromptPlaceholder2, z10);
        }
    }

    private final void F1() {
        int iNextInt = new SecureRandom().nextInt(this.f8717F.size());
        this.f8726O = iNextInt;
        if (iNextInt == this.f8724M) {
            F1();
        }
    }

    private final void F2(boolean z9, boolean z10) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.C(abstractC1338s != null ? abstractC1338s.f20101N : null, z9, z10, true, false, null);
        C0988e c0988eN1 = n0();
        AbstractC1338s abstractC1338s2 = this.f8714C;
        c0988eN1.C(abstractC1338s2 != null ? abstractC1338s2.f20102O : null, z9, z10, true, false, null);
    }

    private final void G1() {
        int iNextInt = new SecureRandom().nextInt(this.f8718G.size());
        this.f8725N = iNextInt;
        if (iNextInt == this.f8723L) {
            G1();
        }
    }

    private final void G2(boolean z9, boolean z10) {
        AbstractC1338s abstractC1338s;
        TextView textView;
        if (z9 && (abstractC1338s = this.f8714C) != null && (textView = abstractC1338s.f20103P) != null) {
            textView.setText(H1().l0());
        }
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s2 = this.f8714C;
        c0988eN0.B(abstractC1338s2 != null ? abstractC1338s2.f20103P : null, z9, z10, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p008a7.d H1() {
        return (p008a7.d) this.f8715D.getValue();
    }

    private final void H2(boolean z9, boolean z10, p219v8.a aVar) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.B(abstractC1338s != null ? abstractC1338s.f20112z : null, z9, z10, true, aVar);
    }

    private final void I1(X6.d.a aVar, boolean z9) {
        com.nothing.wallpaper.common.log.c.f("NTCreativeSelectorFragment", "handleGenerateWallpaperFailure");
        t2(this, true, false, null, 4, null);
        G2(false, false);
        z2(false);
        y2(false);
        v2(this, false, false, 2, null);
        B1();
        if (z9) {
            K0(aVar);
        }
    }

    private final void I2(boolean z9) {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            C0988e c0988eN0 = n0();
            AspectRatioImageView ivSelectedFrame = abstractC1338s.f20095H;
            kotlin.jvm.internal.n.g(ivSelectedFrame, "ivSelectedFrame");
            c0988eN0.G(ivSelectedFrame, z9);
        }
    }

    private final void J1(X6.d dVar, boolean z9) {
        v2(this, false, false, 2, null);
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            r2(abstractC1338s);
        }
        T6.b bVar = this.f8720I;
        if (bVar == null) {
            kotlin.jvm.internal.n.r("subjectAdapter");
            bVar = null;
        }
        if (!bVar.d()) {
            T6.b bVar2 = this.f8720I;
            if (bVar2 == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
                bVar2 = null;
            }
            bVar2.g(true);
            T6.b bVar3 = this.f8720I;
            if (bVar3 == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
                bVar3 = null;
            }
            bVar3.notifyDataSetChanged();
        }
        T6.b bVar4 = this.f8719H;
        if (bVar4 == null) {
            kotlin.jvm.internal.n.r("styleAdapter");
            bVar4 = null;
        }
        if (!bVar4.d()) {
            T6.b bVar5 = this.f8719H;
            if (bVar5 == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
                bVar5 = null;
            }
            bVar5.g(true);
            T6.b bVar6 = this.f8719H;
            if (bVar6 == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
                bVar6 = null;
            }
            bVar6.notifyDataSetChanged();
        }
        this.f8722K.q(this.f8723L, false);
        this.f8721J.q(this.f8724M, false);
        F2(false, false);
        y2(false);
        A2(false);
        if (!(dVar instanceof X6.d.b)) {
            kotlin.jvm.internal.n.f(dVar, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.model.WallpaperResult.Fail");
            I1((X6.d.a) dVar, z9);
            return;
        }
        if (!H1().u0((X6.d.b) dVar)) {
            I1(null, z9);
            return;
        }
        try {
            LayoutInflater.Factory activity = getActivity();
            kotlin.jvm.internal.n.f(activity, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeNavigator");
            ((S6.d) activity).A();
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f("NTCreativeSelectorFragment", "showGeneratedWallpaper exception:" + e10.getMessage());
            V2();
        }
    }

    private final void J2() {
        com.google.android.material.bottomsheet.a aVar = this.f8716E;
        if (aVar == null || !aVar.isShowing()) {
            D1();
            this.f8716E = new com.google.android.material.bottomsheet.a(requireContext(), R.style.BottomSheetDialog);
            final View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.nt_layout_bottom_sheet, (ViewGroup) null);
            if (p024c3.a.a()) {
                viewInflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: W6.T
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return U.K2(viewInflate, view, windowInsets);
                    }
                });
            }
            ((TextView) viewInflate.requireViewById(R.id.tv_dialog_title)).setText(getResources().getString(R.string.nt_ai_wallpaper_title));
            View viewRequireViewById = viewInflate.requireViewById(R.id.tv_dialog_subtitle);
            kotlin.jvm.internal.n.g(viewRequireViewById, "requireViewById(...)");
            TextView textView = (TextView) viewRequireViewById;
            textView.setVisibility(0);
            textView.setText(getResources().getString(R.string.nt_ai_wallpaper_intr));
            com.google.android.material.bottomsheet.a aVar2 = this.f8716E;
            if (aVar2 != null) {
                aVar2.f().i(this.f8738a0);
                aVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: W6.z
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        U.L2(this.f8887q, dialogInterface);
                    }
                });
                aVar2.setCanceledOnTouchOutside(true);
                aVar2.setContentView(viewInflate);
                aVar2.show();
            }
        }
    }

    private final void K1(boolean z9) {
        n0().l();
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            r2(abstractC1338s);
        }
        t2(this, true, false, null, 4, null);
        G2(false, false);
        z2(false);
        y2(false);
        A2(false);
        v2(this, false, false, 2, null);
        B1();
        if (z9) {
            K0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets K2(View view, View view2, WindowInsets windowInsets) {
        kotlin.jvm.internal.n.h(view2, "<unused var>");
        kotlin.jvm.internal.n.h(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(V.k.d());
        kotlin.jvm.internal.n.g(insets, "getInsets(...)");
        kotlin.jvm.internal.n.e(view);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
        return windowInsets;
    }

    private final void L1() {
        E1();
        s2(false, true, new p219v8.a() { // from class: W6.I
            @Override // p219v8.a
            public final Object invoke() {
                return U.M1(this.f8702q);
            }
        });
        G2(false, false);
        I2(false);
        C2(this, false, 0, 2, null);
        E2(false, false);
        x2(this, false, true, false, 4, null);
        H2(false, true, new p219v8.a() { // from class: W6.K
            @Override // p219v8.a
            public final Object invoke() {
                return U.N1(this.f8704q);
            }
        });
        D2(false, true, true);
        A2(true);
        v2(this, true, false, 2, null);
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            k2(this, abstractC1338s, 0, 0, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(U u9, DialogInterface dialogInterface) {
        u9.f8738a0.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A M1(U u9) {
        if (u9.x0()) {
            u9.G2(true, true);
        }
        return p079h8.A.f21846a;
    }

    private final void M2(boolean z9) {
        this.f8733V = z9;
        if (i2()) {
            return;
        }
        C1();
        Context context = getContext();
        if (context != null) {
            C0995l c0995l = new C0995l(context);
            this.f8734W = c0995l;
            c0995l.o(new p219v8.l() { // from class: W6.A
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return U.N2(this.f8694q, ((Boolean) obj).booleanValue());
                }
            });
            c0995l.q(new DialogInterface.OnShowListener() { // from class: W6.B
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    U.O2(this.f8695a, dialogInterface);
                }
            });
            c0995l.p(new DialogInterface.OnDismissListener() { // from class: W6.C
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    U.P2(this.f8696q, dialogInterface);
                }
            });
            c0995l.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A N1(U u9) {
        if (u9.x0()) {
            u9.z2(true);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A N2(U u9, boolean z9) {
        if (z9) {
            if (u9.f8733V) {
                u9.p2();
            } else {
                u9.o2();
            }
        }
        return p079h8.A.f21846a;
    }

    private final void O1(X6.b bVar) {
        if (bVar instanceof X6.b.C0322b) {
            U2((X6.b.C0322b) bVar);
        } else {
            if (!(bVar instanceof X6.b.a)) {
                throw new p079h8.m();
            }
            T2((X6.b.a) bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(U u9, DialogInterface dialogInterface) {
        u9.k0(true);
    }

    private final void P1() {
        t2(this, true, false, null, 4, null);
        G2(false, false);
        z2(false);
        y2(false);
        A2(false);
        B1();
        v2(this, false, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(U u9, DialogInterface dialogInterface) {
        u9.k0(false);
    }

    private final void Q1() {
        t2(this, true, false, null, 4, null);
        G2(false, false);
        I2(false);
        F2(false, false);
        C2(this, false, 0, 2, null);
        z2(false);
        y2(false);
        E2(true, true);
        x2(this, false, false, false, 4, null);
        H2(false, false, null);
        D2(false, false, false);
        A2(false);
        v2(this, false, false, 2, null);
    }

    private final void Q2() {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            abstractC1338s.f20102O.setNeedInterceptTouchEvent(false);
            abstractC1338s.f20101N.setNeedInterceptTouchEvent(false);
        }
    }

    private final void R1(int i10) {
        RecyclerView recyclerView;
        InterceptFrameLayout interceptFrameLayout;
        if (i10 != this.f8724M) {
            AbstractC1338s abstractC1338s = this.f8714C;
            if (abstractC1338s != null && (interceptFrameLayout = abstractC1338s.f20101N) != null) {
                interceptFrameLayout.setNeedInterceptTouchEvent(true);
            }
            AbstractC1338s abstractC1338s2 = this.f8714C;
            if (abstractC1338s2 == null || (recyclerView = abstractC1338s2.f20104Q) == null) {
                return;
            }
            N0(recyclerView, (i10 - this.f8724M) * q0());
            recyclerView.postDelayed(new Runnable() { // from class: W6.E
                @Override // java.lang.Runnable
                public final void run() {
                    U.S1(this.f8698q);
                }
            }, s0());
        }
    }

    private final void R2() {
        AspectRatioImageView aspectRatioImageView;
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s == null || (aspectRatioImageView = abstractC1338s.f20095H) == null) {
            return;
        }
        aspectRatioImageView.post(new Runnable() { // from class: W6.F
            @Override // java.lang.Runnable
            public final void run() {
                U.S2(this.f8699q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(U u9) {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1338s abstractC1338s = u9.f8714C;
        if (abstractC1338s == null || (interceptFrameLayout = abstractC1338s.f20101N) == null) {
            return;
        }
        interceptFrameLayout.setNeedInterceptTouchEvent(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(U u9) {
        MaskHollowView maskHollowView;
        Toolbar toolbar;
        AspectRatioImageView aspectRatioImageView;
        AspectRatioImageView aspectRatioImageView2;
        Resources resources;
        if (u9.w0()) {
            return;
        }
        Point pointE = H3.s.a().e(u9.requireActivity().getDisplay());
        Context context = u9.getContext();
        int measuredHeight = 0;
        int dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.nt_creative_frame_width);
        AbstractC1338s abstractC1338s = u9.f8714C;
        int measuredWidth = (abstractC1338s == null || (aspectRatioImageView2 = abstractC1338s.f20095H) == null) ? 0 : aspectRatioImageView2.getMeasuredWidth();
        AbstractC1338s abstractC1338s2 = u9.f8714C;
        int measuredHeight2 = (abstractC1338s2 == null || (aspectRatioImageView = abstractC1338s2.f20095H) == null) ? 0 : aspectRatioImageView.getMeasuredHeight();
        u9.E0(measuredWidth - dimensionPixelSize);
        int i10 = (measuredHeight2 - dimensionPixelSize) / 2;
        u9.H0((((measuredHeight2 - u9.q0()) / 4) * 3) - dimensionPixelSize);
        u9.f8721J.u(u9.q0());
        u9.f8722K.u(u9.q0());
        AbstractC1338s abstractC1338s3 = u9.f8714C;
        if (abstractC1338s3 != null) {
            abstractC1338s3.f20105R.getLayoutParams().height = i10;
            abstractC1338s3.f20104Q.getLayoutParams().height = i10;
            int iQ0 = (pointE.x - u9.q0()) / 2;
            abstractC1338s3.f20105R.setPadding(iQ0, 0, iQ0, 0);
            abstractC1338s3.f20104Q.setPadding(iQ0, 0, iQ0, 0);
            int dimension = (measuredHeight2 - i10) - ((int) u9.getResources().getDimension(R.dimen.nt_creative_recyclerview_margin));
            ViewGroup.LayoutParams layoutParams = abstractC1338s3.f20105R.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimension;
            ViewGroup.LayoutParams layoutParams2 = abstractC1338s3.f20104Q.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimension;
            int dimension2 = (int) u9.getResources().getDimension(R.dimen.nt_creative_prompt_placeholder_margin);
            int i11 = dimension2 * 2;
            int i12 = measuredWidth - i11;
            int i13 = measuredHeight2 - i11;
            int dimension3 = (i13 - ((int) u9.getResources().getDimension(R.dimen.nt_creative_item_margin))) / 2;
            ViewGroup.LayoutParams layoutParams3 = abstractC1338s3.f20091D.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = abstractC1338s3.f20092E.getLayoutParams();
            layoutParams3.width = i12;
            layoutParams3.height = dimension3;
            layoutParams4.width = i12;
            layoutParams4.height = dimension3;
            kotlin.jvm.internal.n.f(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = dimension2;
            kotlin.jvm.internal.n.f(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = dimension2;
            ViewGroup.LayoutParams layoutParams5 = abstractC1338s3.f20093F.getLayoutParams();
            ViewGroup.LayoutParams layoutParams6 = abstractC1338s3.f20094G.getLayoutParams();
            layoutParams5.width = i12;
            layoutParams5.height = dimension3;
            layoutParams6.width = i12;
            layoutParams6.height = dimension3;
            kotlin.jvm.internal.n.f(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = dimension2;
            kotlin.jvm.internal.n.f(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = dimension2;
            ViewGroup.LayoutParams layoutParams7 = abstractC1338s3.f20098K.getLayoutParams();
            ViewGroup.LayoutParams layoutParams8 = abstractC1338s3.f20099L.getLayoutParams();
            layoutParams7.width = i12;
            layoutParams7.height = dimension3;
            layoutParams8.width = i12;
            layoutParams8.height = dimension3;
            kotlin.jvm.internal.n.f(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = dimension2;
            kotlin.jvm.internal.n.f(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = dimension2;
            abstractC1338s3.f20105R.requestLayout();
            abstractC1338s3.f20104Q.requestLayout();
            T6.b bVar = u9.f8720I;
            T6.b bVar2 = null;
            if (bVar == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
                bVar = null;
            }
            bVar.h(new Point(u9.q0(), i10));
            T6.b bVar3 = u9.f8719H;
            if (bVar3 == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
                bVar3 = null;
            }
            bVar3.h(new Point(u9.q0(), i10));
            T6.b bVar4 = u9.f8720I;
            if (bVar4 == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
                bVar4 = null;
            }
            bVar4.notifyDataSetChanged();
            T6.b bVar5 = u9.f8719H;
            if (bVar5 == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
            } else {
                bVar2 = bVar5;
            }
            bVar2.notifyDataSetChanged();
            u9.f8722K.q(u9.f8723L, false);
            u9.f8721J.q(u9.f8724M, false);
            AbstractC1338s abstractC1338s4 = u9.f8714C;
            if (abstractC1338s4 == null || (maskHollowView = abstractC1338s4.f20089B) == null) {
                return;
            }
            int dimensionPixelSize2 = maskHollowView.getResources().getDimensionPixelSize(R.dimen.nt_creative_frame_margin_top);
            AbstractC1338s abstractC1338s5 = u9.f8714C;
            if (abstractC1338s5 != null && (toolbar = abstractC1338s5.f20106S) != null) {
                measuredHeight = toolbar.getMeasuredHeight();
            }
            maskHollowView.setHollowMarginTop(dimensionPixelSize2 + measuredHeight + dimension2);
            maskHollowView.c(i12, i13);
        }
    }

    private final void T1(int i10) {
        RecyclerView recyclerView;
        InterceptFrameLayout interceptFrameLayout;
        if (i10 != this.f8723L) {
            AbstractC1338s abstractC1338s = this.f8714C;
            if (abstractC1338s != null && (interceptFrameLayout = abstractC1338s.f20102O) != null) {
                interceptFrameLayout.setNeedInterceptTouchEvent(true);
            }
            AbstractC1338s abstractC1338s2 = this.f8714C;
            if (abstractC1338s2 == null || (recyclerView = abstractC1338s2.f20105R) == null) {
                return;
            }
            N0(recyclerView, (i10 - this.f8723L) * q0());
            recyclerView.postDelayed(new Runnable() { // from class: W6.D
                @Override // java.lang.Runnable
                public final void run() {
                    U.U1(this.f8697q);
                }
            }, s0());
        }
    }

    private final void T2(X6.b.a aVar) {
        com.nothing.wallpaper.common.log.c.f("NTCreativeSelectorFragment", "updateLoadPromptFail " + aVar);
        if (w0()) {
            return;
        }
        t2(this, true, false, null, 4, null);
        G2(false, false);
        I2(false);
        F2(false, false);
        z2(false);
        y2(false);
        E2(true, false);
        x2(this, false, false, false, 4, null);
        H2(false, false, null);
        D2(false, false, false);
        A2(false);
        v2(this, false, false, 2, null);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        if (!p087i6.m.a(contextRequireContext)) {
            B2(true, R.string.nt_no_network_connection);
            return;
        }
        a7.d.b bVar = p008a7.d.f9853v;
        if (bVar.c(aVar.a())) {
            B2(true, R.string.nt_troubles_connecting);
        } else if (bVar.d(aVar.a())) {
            B2(true, R.string.nt_update_time_tip);
        } else {
            B2(true, R.string.nt_server_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(U u9) {
        InterceptFrameLayout interceptFrameLayout;
        AbstractC1338s abstractC1338s = u9.f8714C;
        if (abstractC1338s == null || (interceptFrameLayout = abstractC1338s.f20102O) == null) {
            return;
        }
        interceptFrameLayout.setNeedInterceptTouchEvent(false);
    }

    private final void U2(X6.b.C0322b c0322b) {
        if (w0()) {
            return;
        }
        V2();
        W2(c0322b);
    }

    private final void V1() {
        this.f8735X = false;
        E1();
        T6.b bVar = this.f8719H;
        T6.b bVar2 = null;
        if (bVar == null) {
            kotlin.jvm.internal.n.r("styleAdapter");
            bVar = null;
        }
        bVar.g(false);
        T6.b bVar3 = this.f8720I;
        if (bVar3 == null) {
            kotlin.jvm.internal.n.r("subjectAdapter");
            bVar3 = null;
        }
        bVar3.g(false);
        T6.b bVar4 = this.f8719H;
        if (bVar4 == null) {
            kotlin.jvm.internal.n.r("styleAdapter");
            bVar4 = null;
        }
        bVar4.notifyDataSetChanged();
        T6.b bVar5 = this.f8720I;
        if (bVar5 == null) {
            kotlin.jvm.internal.n.r("subjectAdapter");
        } else {
            bVar2 = bVar5;
        }
        bVar2.notifyDataSetChanged();
        int iQ0 = (this.f8726O - this.f8724M) * q0();
        int iQ1 = (this.f8725N - this.f8723L) * q0();
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            RecyclerView rvStylePrompt = abstractC1338s.f20104Q;
            kotlin.jvm.internal.n.g(rvStylePrompt, "rvStylePrompt");
            O0(rvStylePrompt, iQ0, 800);
            RecyclerView rvSubjectPrompt = abstractC1338s.f20105R;
            kotlin.jvm.internal.n.g(rvSubjectPrompt, "rvSubjectPrompt");
            O0(rvSubjectPrompt, iQ1, 800);
        }
        this.f8737Z.removeMessages(10);
        this.f8737Z.sendEmptyMessageDelayed(10, 900L);
    }

    private final void V2() {
        t2(this, true, false, null, 4, null);
        G2(false, false);
        I2(true);
        F2(true, true);
        C2(this, false, 0, 2, null);
        z2(false);
        y2(false);
        E2(false, false);
        x2(this, true, true, false, 4, null);
        H2(true, true, null);
        D2(true, false, true);
        A2(false);
        v2(this, false, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(a7.d.c cVar, boolean z9) {
        com.nothing.wallpaper.common.log.c.k("NTCreativeSelectorFragment", "handleUiStateOnChanged " + cVar);
        k0(x0());
        if (cVar instanceof a7.d.c.h) {
            Q1();
            return;
        }
        if (cVar instanceof a7.d.c.f) {
            X6.b bVarE = ((a7.d.c.f) cVar).e();
            if (bVarE != null) {
                O1(bVarE);
                return;
            }
            return;
        }
        if (cVar instanceof a7.d.c.g) {
            P1();
            return;
        }
        if (cVar instanceof a7.d.c.C0354c) {
            K1(!z9);
            return;
        }
        if (cVar instanceof a7.d.c.C0355d) {
            V1();
        } else if (cVar instanceof a7.d.c.e) {
            L1();
        } else if (cVar instanceof a7.d.c.b) {
            J1(((a7.d.c.b) cVar).e(), !z9);
        }
    }

    private final void W2(X6.b.C0322b c0322b) {
        for (PromptCategory promptCategory : c0322b.a()) {
            T6.b bVar = null;
            if (X6.a.b(promptCategory) && this.f8718G.size() != promptCategory.getPrompts().size()) {
                this.f8718G.clear();
                this.f8718G.addAll(promptCategory.getPrompts());
                T6.b bVar2 = this.f8720I;
                if (bVar2 == null) {
                    kotlin.jvm.internal.n.r("subjectAdapter");
                } else {
                    bVar = bVar2;
                }
                bVar.notifyDataSetChanged();
            } else if (X6.a.a(promptCategory) && this.f8717F.size() != promptCategory.getPrompts().size()) {
                this.f8717F.clear();
                this.f8717F.addAll(promptCategory.getPrompts());
                T6.b bVar3 = this.f8719H;
                if (bVar3 == null) {
                    kotlin.jvm.internal.n.r("styleAdapter");
                } else {
                    bVar = bVar3;
                }
                bVar.notifyDataSetChanged();
            }
            this.f8721J.q(this.f8724M, false);
            this.f8722K.q(this.f8723L, false);
        }
    }

    private final void X1() {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            abstractC1338s.f20111y.setText(getString(R.string.nt_ai_wallpaper_title));
            abstractC1338s.f20106S.inflateMenu(R.menu.nt_creative_info_menu);
            abstractC1338s.f20106S.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: W6.G
                @Override // android.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return U.Y1(this.f8700q, menuItem);
                }
            });
            abstractC1338s.f20106S.setNavigationOnClickListener(new View.OnClickListener() { // from class: W6.H
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    U.Z1(this.f8701q, view);
                }
            });
        }
        if (y0()) {
            AbstractC1338s abstractC1338s2 = this.f8714C;
            J0(abstractC1338s2 != null ? abstractC1338s2.f20106S : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2() {
        this.f8722K.q(this.f8723L, false);
        this.f8721J.q(this.f8724M, false);
        s2(false, true, new p219v8.a() { // from class: W6.y
            @Override // p219v8.a
            public final Object invoke() {
                return U.Y2(this.f8886q);
            }
        });
        I2(false);
        C2(this, false, 0, 2, null);
        E2(false, false);
        x2(this, false, true, false, 4, null);
        H2(false, true, new p219v8.a() { // from class: W6.J
            @Override // p219v8.a
            public final Object invoke() {
                return U.Z2(this.f8703q);
            }
        });
        v2(this, true, false, 2, null);
        D2(false, true, false);
        A2(true);
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            j2(abstractC1338s, this.f8726O, this.f8725N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y1(U u9, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_info) {
            return false;
        }
        u9.J2();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A Y2(U u9) {
        if (u9.x0()) {
            u9.G2(true, true);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(U u9, View view) {
        p010b.v vVarF;
        AbstractActivityC1136v activity = u9.getActivity();
        if (activity == null || (vVarF = activity.f()) == null) {
            return;
        }
        vVarF.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A Z2(U u9) {
        if (u9.x0()) {
            u9.z2(true);
        }
        return p079h8.A.f21846a;
    }

    private final void a2() {
        X1();
        I0();
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            this.f8719H = new T6.b(this.f8717F, true, this.f8737Z, new p219v8.l() { // from class: W6.M
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return U.b2(this.f8706q, ((Integer) obj).intValue());
                }
            });
            this.f8720I = new T6.b(this.f8718G, false, this.f8737Z, new p219v8.l() { // from class: W6.N
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return U.c2(this.f8707q, ((Integer) obj).intValue());
                }
            });
            T6.b bVar = this.f8719H;
            T6.b bVar2 = null;
            if (bVar == null) {
                kotlin.jvm.internal.n.r("styleAdapter");
                bVar = null;
            }
            z1(abstractC1338s, bVar);
            T6.b bVar3 = this.f8720I;
            if (bVar3 == null) {
                kotlin.jvm.internal.n.r("subjectAdapter");
            } else {
                bVar2 = bVar3;
            }
            A1(abstractC1338s, bVar2);
            abstractC1338s.f20090C.setOnClickListener(new View.OnClickListener() { // from class: W6.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    U.d2(this.f8708q, view);
                }
            });
            abstractC1338s.f20109w.setOnClickListener(new View.OnClickListener() { // from class: W6.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    U.e2(this.f8709q, view);
                }
            });
            abstractC1338s.f20112z.setOnClickListener(new View.OnClickListener() { // from class: W6.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    U.f2(this.f8710q, view);
                }
            });
            LottieAnimationView lavPromptPlaceholder = abstractC1338s.f20098K;
            kotlin.jvm.internal.n.g(lavPromptPlaceholder, "lavPromptPlaceholder");
            G0(lavPromptPlaceholder);
            LottieAnimationView lavPromptPlaceholder2 = abstractC1338s.f20099L;
            kotlin.jvm.internal.n.g(lavPromptPlaceholder2, "lavPromptPlaceholder2");
            G0(lavPromptPlaceholder2);
            abstractC1338s.f20095H.setOnSizeChanged(new p219v8.p() { // from class: W6.S
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return U.g2(this.f8711q, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            AspectRatioImageView ivBlurPlaceholder = abstractC1338s.f20088A;
            kotlin.jvm.internal.n.g(ivBlurPlaceholder, "ivBlurPlaceholder");
            D0(ivBlurPlaceholder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A b2(U u9, int i10) {
        u9.R1(i10);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A c2(U u9, int i10) {
        u9.T1(i10);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(U u9, View view) {
        u9.o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(U u9, View view) {
        u9.o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(U u9, View view) {
        u9.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A g2(U u9, int i10, int i11) {
        u9.R2();
        return p079h8.A.f21846a;
    }

    private final boolean h2() {
        com.google.android.material.bottomsheet.a aVar = this.f8716E;
        return aVar != null && aVar.isShowing();
    }

    private final boolean i2() {
        C0995l c0995l = this.f8734W;
        if (c0995l != null) {
            return c0995l.j();
        }
        return false;
    }

    private final void j2(AbstractC1338s abstractC1338s, int i10, int i11) {
        E1();
        m2(abstractC1338s, i10, i11);
        l2(abstractC1338s, i10, i11);
    }

    static /* synthetic */ void k2(U u9, AbstractC1338s abstractC1338s, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = u9.f8724M;
        }
        if ((i12 & 2) != 0) {
            i11 = u9.f8723L;
        }
        u9.j2(abstractC1338s, i10, i11);
    }

    private final void l2(AbstractC1338s abstractC1338s, int i10, int i11) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = abstractC1338s.f20105R.findViewHolderForAdapterPosition(i11);
        this.f8727P = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = abstractC1338s.f20104Q.findViewHolderForAdapterPosition(i10);
        this.f8728Q = viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView : null;
        View view = this.f8727P;
        if (view != null) {
            C0988e c0988eN0 = n0();
            InterceptFrameLayout layoutSubjectPromptList = abstractC1338s.f20102O;
            kotlin.jvm.internal.n.g(layoutSubjectPromptList, "layoutSubjectPromptList");
            InterceptFrameLayout layoutStylePromptList = abstractC1338s.f20101N;
            kotlin.jvm.internal.n.g(layoutStylePromptList, "layoutStylePromptList");
            LottieAnimationView lavProcessing = abstractC1338s.f20096I;
            kotlin.jvm.internal.n.g(lavProcessing, "lavProcessing");
            LottieAnimationView lavProcessingLoop = abstractC1338s.f20097J;
            kotlin.jvm.internal.n.g(lavProcessingLoop, "lavProcessingLoop");
            c0988eN0.s(layoutSubjectPromptList, layoutStylePromptList, lavProcessing, lavProcessingLoop, view, t0(), true);
        }
        View view2 = this.f8728Q;
        if (view2 != null) {
            C0988e c0988eN1 = n0();
            InterceptFrameLayout layoutSubjectPromptList2 = abstractC1338s.f20102O;
            kotlin.jvm.internal.n.g(layoutSubjectPromptList2, "layoutSubjectPromptList");
            InterceptFrameLayout layoutStylePromptList2 = abstractC1338s.f20101N;
            kotlin.jvm.internal.n.g(layoutStylePromptList2, "layoutStylePromptList");
            LottieAnimationView lavProcessing2 = abstractC1338s.f20096I;
            kotlin.jvm.internal.n.g(lavProcessing2, "lavProcessing");
            LottieAnimationView lavProcessingLoop2 = abstractC1338s.f20097J;
            kotlin.jvm.internal.n.g(lavProcessingLoop2, "lavProcessingLoop");
            c0988eN1.s(layoutSubjectPromptList2, layoutStylePromptList2, lavProcessing2, lavProcessingLoop2, view2, t0(), false);
        }
        C0988e c0988eN2 = n0();
        InterceptFrameLayout layoutStylePromptList3 = abstractC1338s.f20101N;
        kotlin.jvm.internal.n.g(layoutStylePromptList3, "layoutStylePromptList");
        c0988eN2.x(layoutStylePromptList3, AbstractC0992i.p0(), AbstractC0992i.o0(), AbstractC0992i.m0());
        C0988e c0988eN3 = n0();
        InterceptFrameLayout layoutSubjectPromptList3 = abstractC1338s.f20102O;
        kotlin.jvm.internal.n.g(layoutSubjectPromptList3, "layoutSubjectPromptList");
        c0988eN3.x(layoutSubjectPromptList3, AbstractC0992i.p0(), AbstractC0992i.o0(), AbstractC0992i.m0());
        C0988e c0988eN4 = n0();
        AspectRatioImageView ivBlurPlaceholder = abstractC1338s.f20088A;
        kotlin.jvm.internal.n.g(ivBlurPlaceholder, "ivBlurPlaceholder");
        c0988eN4.z(ivBlurPlaceholder, AbstractC0992i.o0(), AbstractC0992i.o0());
        if ((this.f8727P == null) || (this.f8728Q == null)) {
            y2(true);
        }
    }

    private final void m2(AbstractC1338s abstractC1338s, int i10, int i11) {
        if (i11 == 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = abstractC1338s.f20105R.findViewHolderForAdapterPosition(1);
            this.f8729R = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
        } else if (i11 == this.f8718G.size() - 1) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = abstractC1338s.f20105R.findViewHolderForAdapterPosition(i11 - 1);
            this.f8729R = viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView : null;
        } else {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = abstractC1338s.f20105R.findViewHolderForAdapterPosition(i11 - 1);
            this.f8729R = viewHolderFindViewHolderForAdapterPosition3 != null ? viewHolderFindViewHolderForAdapterPosition3.itemView : null;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition4 = abstractC1338s.f20105R.findViewHolderForAdapterPosition(i11 + 1);
            this.f8730S = viewHolderFindViewHolderForAdapterPosition4 != null ? viewHolderFindViewHolderForAdapterPosition4.itemView : null;
        }
        if (i10 == 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition5 = abstractC1338s.f20104Q.findViewHolderForAdapterPosition(1);
            this.f8731T = viewHolderFindViewHolderForAdapterPosition5 != null ? viewHolderFindViewHolderForAdapterPosition5.itemView : null;
        } else if (i10 == this.f8717F.size() - 1) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition6 = abstractC1338s.f20104Q.findViewHolderForAdapterPosition(i10 - 1);
            this.f8731T = viewHolderFindViewHolderForAdapterPosition6 != null ? viewHolderFindViewHolderForAdapterPosition6.itemView : null;
        } else {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition7 = abstractC1338s.f20104Q.findViewHolderForAdapterPosition(i10 - 1);
            this.f8731T = viewHolderFindViewHolderForAdapterPosition7 != null ? viewHolderFindViewHolderForAdapterPosition7.itemView : null;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition8 = abstractC1338s.f20104Q.findViewHolderForAdapterPosition(i10 + 1);
            this.f8732U = viewHolderFindViewHolderForAdapterPosition8 != null ? viewHolderFindViewHolderForAdapterPosition8.itemView : null;
        }
        View view = this.f8729R;
        if (view != null) {
            n0().H(view);
        }
        View view2 = this.f8730S;
        if (view2 != null) {
            n0().H(view2);
        }
        View view3 = this.f8731T;
        if (view3 != null) {
            n0().H(view3);
        }
        View view4 = this.f8732U;
        if (view4 != null) {
            n0().H(view4);
        }
    }

    private final void n2() {
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new d(null), 3, null);
    }

    private final void o2() {
        com.nothing.wallpaper.common.log.c.d("NTCreativeSelectorFragment", "onGenerate");
        n0().i();
        if (w0()) {
            return;
        }
        C0995l.a aVar = C0995l.f8830d;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        if (!aVar.b(contextRequireContext)) {
            M2(false);
            return;
        }
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext2, "requireContext(...)");
        if (!p087i6.m.a(contextRequireContext2)) {
            L0();
            return;
        }
        if ((this.f8723L < this.f8718G.size()) && (this.f8724M < this.f8717F.size())) {
            H1().Q();
            H1().W((Prompt) this.f8718G.get(this.f8723L), (Prompt) this.f8717F.get(this.f8724M), true);
            R7.d.f7114r.b(1, ((Prompt) this.f8718G.get(this.f8723L)).getPromptWordId(), ((Prompt) this.f8717F.get(this.f8724M)).getPromptWordId());
        }
    }

    private final void p2() {
        com.nothing.wallpaper.common.log.c.d("NTCreativeSelectorFragment", "onRandomGenerate");
        n0().i();
        if (w0()) {
            return;
        }
        C0995l.a aVar = C0995l.f8830d;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        if (!aVar.b(contextRequireContext)) {
            M2(true);
            return;
        }
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext2, "requireContext(...)");
        if (!p087i6.m.a(contextRequireContext2)) {
            L0();
            return;
        }
        if ((!this.f8718G.isEmpty()) && (!this.f8717F.isEmpty())) {
            G1();
            F1();
            H1().Q();
            H1().w0((Prompt) this.f8718G.get(this.f8725N), (Prompt) this.f8717F.get(this.f8726O), true);
            R7.d.f7114r.b(3, ((Prompt) this.f8718G.get(this.f8723L)).getPromptWordId(), ((Prompt) this.f8717F.get(this.f8724M)).getPromptWordId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A q2(U u9, boolean z9) {
        com.nothing.wallpaper.common.log.c.k("NTCreativeSelectorFragment", "onStart network changed:" + z9 + " " + u9.r0());
        if (z9 && kotlin.jvm.internal.n.d(u9.r0(), a7.d.c.g.f9887v)) {
            u9.H1().h0(false, u9.f8736Y);
        }
        return p079h8.A.f21846a;
    }

    private final void r2(AbstractC1338s abstractC1338s) {
        n0().i();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(10L);
        View view = this.f8729R;
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
        View view2 = this.f8730S;
        if (view2 != null) {
            view2.startAnimation(alphaAnimation);
        }
        View view3 = this.f8731T;
        if (view3 != null) {
            view3.startAnimation(alphaAnimation);
        }
        View view4 = this.f8732U;
        if (view4 != null) {
            view4.startAnimation(alphaAnimation);
        }
        C0988e c0988eN0 = n0();
        InterceptFrameLayout layoutSubjectPromptList = abstractC1338s.f20102O;
        kotlin.jvm.internal.n.g(layoutSubjectPromptList, "layoutSubjectPromptList");
        InterceptFrameLayout layoutStylePromptList = abstractC1338s.f20101N;
        kotlin.jvm.internal.n.g(layoutStylePromptList, "layoutStylePromptList");
        c0988eN0.w(layoutSubjectPromptList, layoutStylePromptList);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_selected_prompt_restore);
        View view5 = this.f8727P;
        if (view5 != null) {
            view5.startAnimation(animationLoadAnimation);
        }
        View view6 = this.f8728Q;
        if (view6 != null) {
            view6.startAnimation(animationLoadAnimation);
        }
        View view7 = this.f8727P;
        if (view7 != null) {
            view7.setAlpha(1.0f);
        }
        View view8 = this.f8728Q;
        if (view8 != null) {
            view8.setAlpha(1.0f);
        }
        View view9 = this.f8727P;
        if (view9 != null) {
            A3.f.f167a.p(view9, 1.0f);
        }
        View view10 = this.f8728Q;
        if (view10 != null) {
            A3.f.f167a.p(view10, 1.0f);
        }
        abstractC1338s.f20101N.setRenderEffect(null);
        abstractC1338s.f20102O.setRenderEffect(null);
        abstractC1338s.f20088A.setRenderEffect(null);
        Q2();
    }

    private final void s2(boolean z9, boolean z10, p219v8.a aVar) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.B(abstractC1338s != null ? abstractC1338s.f20106S : null, z9, z10, true, aVar);
    }

    static /* synthetic */ void t2(U u9, boolean z9, boolean z10, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        u9.s2(z9, z10, aVar);
    }

    private final void u2(boolean z9, boolean z10) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.C(abstractC1338s != null ? abstractC1338s.f20088A : null, z9, z10, true, false, null);
    }

    static /* synthetic */ void v2(U u9, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        u9.u2(z9, z10);
    }

    private final void w2(boolean z9, boolean z10, boolean z11) {
        C0988e c0988eN0 = n0();
        AbstractC1338s abstractC1338s = this.f8714C;
        c0988eN0.B(abstractC1338s != null ? abstractC1338s.f20109w : null, z9, z10, z11, null);
    }

    static /* synthetic */ void x2(U u9, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        u9.w2(z9, z10, z11);
    }

    private final void y2(boolean z9) {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            C0988e c0988eN0 = n0();
            LottieAnimationView lavProcessing = abstractC1338s.f20096I;
            kotlin.jvm.internal.n.g(lavProcessing, "lavProcessing");
            LottieAnimationView lavProcessingLoop = abstractC1338s.f20097J;
            kotlin.jvm.internal.n.g(lavProcessingLoop, "lavProcessingLoop");
            c0988eN0.D(lavProcessing, lavProcessingLoop, z9);
        }
    }

    private final void z1(AbstractC1338s abstractC1338s, T6.b bVar) {
        abstractC1338s.f20104Q.setAdapter(bVar);
        Z6.d dVar = this.f8721J;
        RecyclerView rvStylePrompt = abstractC1338s.f20104Q;
        kotlin.jvm.internal.n.g(rvStylePrompt, "rvStylePrompt");
        dVar.i(rvStylePrompt);
        abstractC1338s.f20104Q.addOnScrollListener(new b());
    }

    private final void z2(boolean z9) {
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            abstractC1338s.f20107T.setVisibility(z9 ? 0 : 4);
        }
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v0();
        String string = bundle != null ? bundle.getString("last_language") : null;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        this.f8736Y = p087i6.e.h(contextRequireContext);
        if (!(!kotlin.jvm.internal.n.d(this.f8736Y, string)) || !(!(string == null || string.length() == 0))) {
            H1().j0(this.f8736Y);
        } else {
            com.nothing.wallpaper.common.log.c.k("NTCreativeSelectorFragment", "onCreate update promptList");
            H1().h0(true, this.f8736Y);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.n.h(inflater, "inflater");
        AbstractC1338s abstractC1338sC = AbstractC1338s.C(inflater, viewGroup, false);
        this.f8714C = abstractC1338sC;
        a2();
        View viewO = abstractC1338sC.o();
        kotlin.jvm.internal.n.g(viewO, "let(...)");
        return viewO;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() {
        super.onDestroy();
        C1();
        D1();
        this.f8737Z.removeCallbacksAndMessages(null);
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        this.f8721J.k();
        this.f8722K.k();
        this.f8714C = null;
        this.f8727P = null;
        this.f8728Q = null;
        this.f8729R = null;
        this.f8730S = null;
        this.f8731T = null;
        this.f8732U = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (getContext() != null) {
            outState.putString("last_language", this.f8736Y);
            outState.putBoolean("show_about_dialog", h2());
            outState.putBoolean("show_policy_dialog_from_random", this.f8733V);
            outState.putBoolean("show_policy_dialog", i2());
        }
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStart() {
        super.onStart();
        B0(new p219v8.l() { // from class: W6.L
            @Override // p219v8.l
            public final Object f(Object obj) {
                return U.q2(this.f8705q, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // W6.AbstractC0992i, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        com.nothing.wallpaper.common.log.c.d("NTCreativeSelectorFragment", "onStop");
        y2(false);
        p008a7.d.I(H1(), false, 1, null);
        AbstractC1338s abstractC1338s = this.f8714C;
        if (abstractC1338s != null) {
            r2(abstractC1338s);
        }
        P0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.n.h(view, "view");
        super.onViewCreated(view, bundle);
        com.nothing.wallpaper.common.log.c.k("NTCreativeSelectorFragment", "onViewCreated");
        if (bundle != null ? bundle.getBoolean("show_about_dialog") : false) {
            J2();
        }
        this.f8733V = bundle != null ? bundle.getBoolean("show_policy_dialog_from_random") : false;
        if (bundle != null ? bundle.getBoolean("show_policy_dialog") : false) {
            M2(this.f8733V);
        }
        n2();
    }

    @Override // com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity.b
    public boolean q() {
        if (!this.f8735X) {
            return true;
        }
        if (h2()) {
            C1();
            return true;
        }
        if (i2()) {
            D1();
            return true;
        }
        if (x0()) {
            H1().H(true);
            return true;
        }
        H1().E0(0);
        H1().F0(0);
        return false;
    }
}
