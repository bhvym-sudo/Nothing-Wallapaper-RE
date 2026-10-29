package D5;

import F8.AbstractC0816i;
import F8.AbstractC0829o0;
import F8.AbstractC0833q0;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.T0;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final a f853F = new a(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final AbstractC0829o0 f854G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final C8.e f855A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final C8.e f856B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f857C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private j f858D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private e f859E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ViewGroup f862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p226w5.f f863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p216v5.a f864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p226w5.n f865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ViewGroup f867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC0846x0 f868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private InterfaceC0846x0 f869z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ r f870q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, View itemView) {
            super(itemView);
            kotlin.jvm.internal.n.h(itemView, "itemView");
            this.f870q = rVar;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f871q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.p f872r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f873s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ IntConsumer f874t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p219v8.p pVar, int i10, IntConsumer intConsumer, p129m8.e eVar) {
            super(2, eVar);
            this.f872r = pVar;
            this.f873s = i10;
            this.f874t = intConsumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f872r, this.f873s, this.f874t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f871q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                p219v8.p pVar = this.f872r;
                Integer numC = kotlin.coroutines.jvm.internal.b.c(this.f873s);
                this.f871q = 1;
                if (pVar.invoke(numC, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            IntConsumer intConsumer = this.f874t;
            if (intConsumer == null) {
                return null;
            }
            intConsumer.accept(this.f873s);
            return A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f875q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f876r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.p f877s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f878t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ IntConsumer f879u;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f880q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ IntConsumer f881r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f882s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(IntConsumer intConsumer, int i10, p129m8.e eVar) {
                super(2, eVar);
                this.f881r = intConsumer;
                this.f882s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f881r, this.f882s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f880q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                IntConsumer intConsumer = this.f881r;
                if (intConsumer != null) {
                    intConsumer.accept(this.f882s);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p219v8.p pVar, int i10, IntConsumer intConsumer, p129m8.e eVar) {
            super(2, eVar);
            this.f877s = pVar;
            this.f878t = i10;
            this.f879u = intConsumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            d dVar = new d(this.f877s, this.f878t, this.f879u, eVar);
            dVar.f876r = obj;
            return dVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (F8.AbstractC0812g.g(r7, r1, r6) == r0) goto L15;
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
                int r1 = r6.f875q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r7)
                goto L50
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                p079h8.r.b(r7)
                goto L39
            L1e:
                p079h8.r.b(r7)
                java.lang.Object r7 = r6.f876r
                F8.L r7 = (F8.L) r7
                F8.M.f(r7)
                v8.p r7 = r6.f877s
                int r1 = r6.f878t
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.c(r1)
                r6.f875q = r3
                java.lang.Object r7 = r7.invoke(r1, r6)
                if (r7 != r0) goto L39
                goto L4f
            L39:
                F8.H0 r7 = F8.C0803b0.c()
                D5.r$d$a r1 = new D5.r$d$a
                java.util.function.IntConsumer r3 = r6.f879u
                int r4 = r6.f878t
                r5 = 0
                r1.<init>(r3, r4, r5)
                r6.f875q = r2
                java.lang.Object r6 = F8.AbstractC0812g.g(r7, r1, r6)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                h8.A r6 = p079h8.A.f21846a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: D5.r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e implements View.OnAttachStateChangeListener {
        e() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v9) {
            kotlin.jvm.internal.n.h(v9, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v9) {
            kotlin.jvm.internal.n.h(v9, "v");
            InterfaceC0846x0 interfaceC0846x0 = r.this.f868y;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            InterfaceC0846x0 interfaceC0846x1 = r.this.f869z;
            if (interfaceC0846x1 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
            }
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f884q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f885r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f886s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f887t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f889v;

        f(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f887t = obj;
            this.f889v |= Integer.MIN_VALUE;
            return r.this.s(0, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f890q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f891r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f892s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f893t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ r f894u;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f895q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ r f896r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f897s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, int i10, p129m8.e eVar) {
                super(2, eVar);
                this.f896r = rVar;
                this.f897s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f896r, this.f897s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f895q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    r rVar = this.f896r;
                    int i11 = this.f897s;
                    this.f895q = 1;
                    if (rVar.w(i11, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, r rVar, p129m8.e eVar) {
            super(2, eVar);
            this.f892s = i10;
            this.f893t = i11;
            this.f894u = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            g gVar = new g(this.f892s, this.f893t, this.f894u, eVar);
            gVar.f891r = obj;
            return gVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f890q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f891r;
            B8.g gVar = new B8.g(this.f892s, this.f893t);
            r rVar = this.f894u;
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                AbstractC0816i.d(l9, C0803b0.b(), null, new a(rVar, ((p089i8.L) it).a(), null), 2, null);
            }
            return A.f21846a;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.l implements p219v8.p {
        h(Object obj) {
            super(2, obj, r.class, "groupInflateItemInfos", "groupInflateItemInfos(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object g(int i10, p129m8.e eVar) {
            return ((r) this.receiver).s(i10, eVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).intValue(), (p129m8.e) obj2);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f898q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f899r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f900s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f901t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ r f902u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ b f903v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, r rVar, b bVar, p129m8.e eVar) {
            super(2, eVar);
            this.f901t = i10;
            this.f902u = rVar;
            this.f903v = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new i(this.f901t, this.f902u, this.f903v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int size;
            D5.h hVar;
            i iVar;
            int i10;
            D5.h hVar2;
            Object objE = p139n8.b.e();
            int i11 = this.f900s;
            if (i11 == 0) {
                p079h8.r.b(obj);
                size = this.f901t % this.f902u.f861r.size();
                hVar = (D5.h) this.f902u.f861r.get(size);
                if (hVar.d() == null) {
                    Context context = this.f902u.f860q;
                    View itemView = this.f903v.itemView;
                    kotlin.jvm.internal.n.g(itemView, "itemView");
                    ViewGroup viewGroup = this.f902u.f862s;
                    p226w5.f fVar = this.f902u.f863t;
                    p216v5.a aVar = this.f902u.f864u;
                    p226w5.n nVar = this.f902u.f865v;
                    this.f899r = hVar;
                    this.f898q = size;
                    this.f900s = 1;
                    iVar = this;
                    if (hVar.a(context, itemView, viewGroup, fVar, aVar, nVar, iVar) == objE) {
                        return objE;
                    }
                    i10 = size;
                    hVar2 = hVar;
                } else {
                    iVar = this;
                }
                G5.c.f1948a.h("SimulatedRecyclerAdapter", "onBindViewHolder position = " + iVar.f901t + ", viewType = " + iVar.f903v.getItemViewType() + ",  realPosition = " + size + ",  attached = " + hVar.h() + ",  preInflateView = " + hVar.d());
                return A.f21846a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f898q;
            hVar2 = (D5.h) this.f899r;
            p079h8.r.b(obj);
            iVar = this;
            size = i10;
            hVar = hVar2;
            G5.c.f1948a.h("SimulatedRecyclerAdapter", "onBindViewHolder position = " + iVar.f901t + ", viewType = " + iVar.f903v.getItemViewType() + ",  realPosition = " + size + ",  attached = " + hVar.h() + ",  preInflateView = " + hVar.d());
            return A.f21846a;
        }
    }

    public static final class j extends ViewPager2.OnPageChangeCallback {
        j() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            super.onPageSelected(i10);
            G5.c.f1948a.h("SimulatedRecyclerAdapter", "onPageSelected, position = " + (i10 % r.this.f861r.size()));
            if (i10 != 0) {
                InterfaceC0846x0 interfaceC0846x0 = r.this.f868y;
                if (interfaceC0846x0 != null) {
                    InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                }
                r rVar = r.this;
                rVar.f868y = r.p(rVar, i10, (p219v8.p) rVar.f855A, null, 4, null);
            }
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f905q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f906r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f907s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f908t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f909u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f911w;

        k(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f909u = obj;
            this.f911w |= Integer.MIN_VALUE;
            return r.this.w(0, this);
        }
    }

    /* synthetic */ class l extends kotlin.jvm.internal.l implements p219v8.p {
        l(Object obj) {
            super(2, obj, r.class, "singleInflateItemInfo", "singleInflateItemInfo(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object g(int i10, p129m8.e eVar) {
            return ((r) this.receiver).w(i10, eVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).intValue(), (p129m8.e) obj2);
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.n.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f854G = AbstractC0833q0.a(executorServiceNewSingleThreadExecutor);
    }

    public /* synthetic */ r(Context context, List list, ViewGroup viewGroup, p226w5.f fVar, p216v5.a aVar, p226w5.n nVar, boolean z9, ViewGroup viewGroup2, int i10, AbstractC1457h abstractC1457h) {
        this(context, list, viewGroup, fVar, aVar, nVar, (i10 & 64) != 0 ? false : z9, (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : viewGroup2);
    }

    private final InterfaceC0846x0 o(int i10, p219v8.p pVar, IntConsumer intConsumer) {
        if (kotlin.jvm.internal.n.d(Looper.myLooper(), Looper.getMainLooper())) {
            return AbstractC0816i.d(O5.g.j(), f854G, null, new d(pVar, i10, intConsumer, null), 2, null);
        }
        return null;
    }

    static /* synthetic */ InterfaceC0846x0 p(r rVar, int i10, p219v8.p pVar, IntConsumer intConsumer, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            intConsumer = null;
        }
        return rVar.o(i10, pVar, intConsumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(r this$0, int i10) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        this$0.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f866w ? SubsamplingScaleImageView.TILE_SIZE_AUTO : this.f861r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return i10 % this.f861r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        ViewGroup viewGroup = this.f867x;
        if (viewGroup instanceof ViewPager2) {
            ((ViewPager2) viewGroup).registerOnPageChangeCallback(this.f858D);
            ((ViewPager2) this.f867x).addOnAttachStateChangeListener(this.f859E);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ViewGroup viewGroup = this.f867x;
        if (viewGroup instanceof ViewPager2) {
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                ((ViewPager2) viewGroup).unregisterOnPageChangeCallback(this.f858D);
                ((ViewPager2) this.f867x).removeOnAttachStateChangeListener(this.f859E);
                p079h8.q.b(A.f21846a);
            } catch (Throwable th) {
                h8.q.a aVar2 = p079h8.q.f21862r;
                p079h8.q.b(p079h8.r.a(th));
            }
        }
    }

    public final boolean q() {
        return this.f866w;
    }

    public final int r() {
        return this.f861r.size();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(int i10, p129m8.e eVar) {
        f fVar;
        int iF;
        int i11;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i12 = fVar.f889v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f889v = i12 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f887t;
        Object objE = p139n8.b.e();
        int i13 = fVar.f889v;
        if (i13 == 0) {
            p079h8.r.b(obj);
            if (!this.f857C) {
                return A.f21846a;
            }
            iF = B8.h.f(i10 - 3, 0);
            int i14 = B8.h.i(i10 + 3, getItemCount() - 1);
            g gVar = new g(iF, i14, this, null);
            fVar.f884q = i10;
            fVar.f885r = iF;
            fVar.f886s = i14;
            fVar.f889v = 1;
            if (T0.c(gVar, fVar) == objE) {
                return objE;
            }
            i11 = i14;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = fVar.f886s;
            int i15 = fVar.f885r;
            int i16 = fVar.f884q;
            p079h8.r.b(obj);
            iF = i15;
            i10 = i16;
        }
        G5.c.f1948a.h("SimulatedRecyclerAdapter", "PreInflate Item View End, source position = " + i10 + ", minPosition = " + iF + ", maxPosition = " + i11 + ", num = " + ((i11 - iF) + 1));
        return A.f21846a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b viewHolder, int i10) {
        kotlin.jvm.internal.n.h(viewHolder, "viewHolder");
        AbstractC0816i.d(O5.g.i(), null, null, new i(i10, this, viewHolder, null), 3, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int i10) {
        View viewD;
        kotlin.jvm.internal.n.h(parent, "parent");
        D5.h hVar = (D5.h) this.f861r.get(i10);
        if (hVar.d() == null) {
            viewD = hVar.f(this.f860q, parent);
        } else {
            hVar.i();
            viewD = hVar.d();
            kotlin.jvm.internal.n.e(viewD);
        }
        G5.c.f1948a.h("SimulatedRecyclerAdapter", "onCreateViewHolder viewType = " + i10 + ", preInflateView = " + hVar.d());
        return new b(this, viewD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(b holder) {
        kotlin.jvm.internal.n.h(holder, "holder");
        super.onViewRecycled(holder);
        int itemViewType = holder.getItemViewType() % this.f861r.size();
        ((D5.h) this.f861r.get(itemViewType)).p();
        G5.c.f1948a.h("SimulatedRecyclerAdapter", "ViewHolder called ViewRecycled, Position = " + itemViewType);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object w(int i10, p129m8.e eVar) {
        k kVar;
        D5.h hVar;
        int i11;
        View view;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i12 = kVar.f911w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f911w = i12 - Integer.MIN_VALUE;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f909u;
        Object objE = p139n8.b.e();
        int i13 = kVar2.f911w;
        if (i13 == 0) {
            p079h8.r.b(obj);
            if (!this.f857C) {
                return A.f21846a;
            }
            int size = i10 % this.f861r.size();
            hVar = (D5.h) this.f861r.get(size);
            if (hVar.e()) {
                hVar.j();
                Context context = this.f860q;
                ViewGroup viewGroup = this.f867x;
                if (viewGroup == null) {
                    viewGroup = this.f862s;
                }
                View viewF = hVar.f(context, viewGroup);
                Context context2 = this.f860q;
                ViewGroup viewGroup2 = this.f862s;
                p226w5.f fVar = this.f863t;
                p216v5.a aVar = this.f864u;
                p226w5.n nVar = this.f865v;
                kVar2.f907s = hVar;
                kVar2.f908t = viewF;
                kVar2.f905q = i10;
                kVar2.f906r = size;
                kVar2.f911w = 1;
                if (hVar.a(context2, viewF, viewGroup2, fVar, aVar, nVar, kVar2) == objE) {
                    return objE;
                }
                i11 = size;
                view = viewF;
            }
            return A.f21846a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = kVar2.f906r;
        i10 = kVar2.f905q;
        view = (View) kVar2.f908t;
        hVar = (D5.h) kVar2.f907s;
        p079h8.r.b(obj);
        hVar.q(view);
        hVar.k();
        G5.c.f1948a.h("SimulatedRecyclerAdapter", "Finish inflate item view with position = " + i10 + ", realPosition = " + i11);
        return A.f21846a;
    }

    public final void x(int i10, D5.h data) {
        kotlin.jvm.internal.n.h(data, "data");
        if (i10 < 0) {
            return;
        }
        this.f861r.set(i10 % this.f861r.size(), data);
        InterfaceC0846x0 interfaceC0846x0 = this.f869z;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f869z = o(i10, (p219v8.p) this.f856B, new IntConsumer() { // from class: D5.q
            @Override // java.util.function.IntConsumer
            public final void accept(int i11) {
                r.y(this.f852a, i11);
            }
        });
    }

    public r(Context contentContext, List itemInfo, ViewGroup rootParent, p226w5.f fVar, p216v5.a handler, p226w5.n animController, boolean z9, ViewGroup viewGroup) {
        kotlin.jvm.internal.n.h(contentContext, "contentContext");
        kotlin.jvm.internal.n.h(itemInfo, "itemInfo");
        kotlin.jvm.internal.n.h(rootParent, "rootParent");
        kotlin.jvm.internal.n.h(handler, "handler");
        kotlin.jvm.internal.n.h(animController, "animController");
        this.f860q = contentContext;
        this.f861r = itemInfo;
        this.f862s = rootParent;
        this.f863t = fVar;
        this.f864u = handler;
        this.f865v = animController;
        this.f866w = z9;
        this.f867x = viewGroup;
        this.f855A = new h(this);
        this.f856B = new l(this);
        this.f857C = (viewGroup instanceof ViewPager2) && (!this.f866w || this.f861r.size() >= 7);
        this.f858D = new j();
        this.f859E = new e();
    }
}
