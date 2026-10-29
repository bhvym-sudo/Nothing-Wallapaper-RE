package p068g7;

import F8.AbstractC0816i;
import F8.L;
import F8.M;
import H3.AbstractC0851a;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.Space;
import android.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.K;
import androidx.core.view.V;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.w;
import com.google.android.material.tabs.TabLayout;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import com.nothing.wallpaper.widget.PreviewSectionLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p038d7.m;
import p064g3.f;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p084i3.C1416o;
import p087i6.q;
import p219v8.p;
import p248y7.C2013o;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends C1416o implements p048e7.a {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final a f21315O = new a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Bundle f21317D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ViewPager2 f21318E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p028c7.a f21319F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private PreviewSectionLayout f21320G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f21321H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private View[] f21322I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.material.tabs.d f21323J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private C2013o f21324K;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Animator f21327N;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final String f21316C = "NTCustomizationPickerFragment";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p079h8.h f21325L = X.b(this, F.b(J7.b.class), new g(this), new h(null, this), new i(this));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p079h8.h f21326M = X.b(this, F.b(p088i7.d.class), new j(this), new C0541k(null, this), new l(this));

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final AbstractComponentCallbacksC1132q a(boolean z9, CharSequence toolbarTitle) {
            n.h(toolbarTitle, "toolbarTitle");
            k kVar = new k();
            Bundle bundleG0 = com.android.wallpaper.picker.a.g0(toolbarTitle);
            bundleG0.putBoolean("start_from_lock_screen", z9);
            kVar.setArguments(bundleG0);
            return kVar;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f21328q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f21329r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f21330s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f21332q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p088i7.a f21333r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ k f21334s;

            /* JADX INFO: renamed from: g7.k$b$a$a, reason: collision with other inner class name */
            static final class C0540a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ k f21335q;

                C0540a(k kVar) {
                    this.f21335q = kVar;
                }

                public final Object a(int i10, p129m8.e eVar) {
                    k kVar = this.f21335q;
                    kVar.n0(kVar.getString(i10));
                    return A.f21846a;
                }

                @Override // I8.InterfaceC0881g
                public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                    return a(((Number) obj).intValue(), eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p088i7.a aVar, k kVar, p129m8.e eVar) {
                super(2, eVar);
                this.f21333r = aVar;
                this.f21334s = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f21333r, this.f21334s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f21332q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC0880f interfaceC0880fO = this.f21333r.o();
                    C0540a c0540a = new C0540a(this.f21334s);
                    this.f21332q = 1;
                    if (interfaceC0880fO.a(c0540a, this) == objE) {
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

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = k.this.new b(eVar);
            bVar.f21330s = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            L l9;
            p088i7.a aVar;
            Object objE = p139n8.b.e();
            int i10 = this.f21329r;
            if (i10 == 0) {
                r.b(obj);
                l9 = (L) this.f21330s;
                p088i7.a aVarT1 = k.this.t1();
                if (aVarT1 == null) {
                    return A.f21846a;
                }
                O oK = aVarT1.k();
                this.f21330s = l9;
                this.f21328q = aVarT1;
                this.f21329r = 1;
                Object objZ = AbstractC0882h.z(oK, this);
                if (objZ == objE) {
                    return objE;
                }
                aVar = aVarT1;
                obj = objZ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p088i7.a) this.f21328q;
                l9 = (L) this.f21330s;
                r.b(obj);
            }
            L l10 = l9;
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : 0;
            ViewPager2 viewPager2 = k.this.f21318E;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(!zBooleanValue, false);
            }
            AbstractC0816i.d(l10, null, null, new a(aVar, k.this, null), 3, null);
            return A.f21846a;
        }
    }

    public static final class c implements RecyclerView.OnItemTouchListener {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e10) {
            n.h(rv, "rv");
            n.h(e10, "e");
            PreviewSectionLayout previewSectionLayout = k.this.f21320G;
            if (previewSectionLayout == null) {
                return false;
            }
            int[] iArr = new int[2];
            previewSectionLayout.getLocationOnScreen(iArr);
            int i10 = iArr[1];
            rv.getLocationOnScreen(iArr);
            int i11 = iArr[1];
            if (e10.getRawY() >= i10) {
                MotionEvent motionEventObtain = MotionEvent.obtain(e10);
                motionEventObtain.offsetLocation(0.0f, (-(i10 - i11)) * 1.0f);
                previewSectionLayout.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z9) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView rv, MotionEvent e10) {
            n.h(rv, "rv");
            n.h(e10, "e");
        }
    }

    public static final class d extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f21338b;

        d(ViewPager2 viewPager2) {
            this.f21338b = viewPager2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            LockScreenFragment lockScreenFragmentE;
            LockScreenFragment lockScreenFragmentE2;
            if (i10 == 0) {
                k.this.f21321H = false;
                C2013o c2013o = k.this.f21324K;
                if (c2013o == null || (lockScreenFragmentE = c2013o.e()) == null) {
                    return;
                }
                lockScreenFragmentE.m4(false);
                return;
            }
            if (i10 != 1) {
                return;
            }
            k.this.f21321H = !this.f21338b.isFakeDragging();
            C2013o c2013o2 = k.this.f21324K;
            if (c2013o2 == null || (lockScreenFragmentE2 = c2013o2.e()) == null) {
                return;
            }
            lockScreenFragmentE2.m4(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            k.this.Q1(i10, f10);
            k.this.P1(i10, f10);
            PreviewSectionLayout previewSectionLayout = k.this.f21320G;
            if (previewSectionLayout != null) {
                previewSectionLayout.a(i10, f10);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            p088i7.a aVarT1 = k.this.t1();
            if (aVarT1 != null) {
                aVarT1.p(p028c7.a.f15234q.c(i10));
            }
            if (k.this.f21321H) {
                com.nothing.wallpaper.common.log.c.k(k.this.f21316C, "start vibrate");
                H hA = I.a();
                n.f(hA, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector");
                Context applicationContext = k.this.requireContext().getApplicationContext();
                n.g(applicationContext, "getApplicationContext(...)");
                ((K6.c) hA).M0(applicationContext).b();
            }
        }
    }

    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f21340b;

        public e(View view) {
            this.f21340b = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            D8.h hVarB;
            view.removeOnLayoutChangeListener(this);
            ViewPager2 viewPager2 = k.this.f21318E;
            if (viewPager2 != null) {
                View childAt = viewPager2.getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                float measuredHeight = this.f21340b.requireViewById(R.id.space_indicator_2_card).getMeasuredHeight() * 0.8888f;
                if (recyclerView != null && (hVarB = K.b(recyclerView)) != null) {
                    Iterator it = hVarB.iterator();
                    while (it.hasNext()) {
                        View viewRequireViewById = ((View) it.next()).requireViewById(R.id.screen_preview_click_view);
                        n.g(viewRequireViewById, "requireViewById(...)");
                        viewRequireViewById.setPadding(viewRequireViewById.getPaddingLeft(), (int) measuredHeight, viewRequireViewById.getPaddingRight(), viewRequireViewById.getPaddingBottom());
                    }
                }
            }
            k.this.E1();
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f21341q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f21343q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k f21344r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, p129m8.e eVar) {
                super(2, eVar);
                this.f21344r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f21344r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f21343q;
                if (i10 == 0) {
                    r.b(obj);
                    k kVar = this.f21344r;
                    this.f21343q = 1;
                    if (kVar.n1(this) == objE) {
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

        f(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new f(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f21341q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x viewLifecycleOwner = k.this.getViewLifecycleOwner();
                n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(k.this, null);
                this.f21341q = 1;
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

    public static final class g extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f21345r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f21345r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f21345r.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f21346r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f21347s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f21346r = aVar;
            this.f21347s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f21346r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f21347s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class i extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f21348r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f21348r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f21348r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class j extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f21349r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f21349r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f21349r.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: g7.k$k, reason: collision with other inner class name */
    public static final class C0541k extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f21350r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f21351s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0541k(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f21350r = aVar;
            this.f21351s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f21350r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f21351s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class l extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f21352r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f21352r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f21352r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A1(p064g3.f fVar) {
        n.e(fVar);
        return J6.d.d(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B1(p219v8.l lVar, Object obj) {
        return ((Boolean) lVar.f(obj)).booleanValue();
    }

    private final J7.b C1() {
        return (J7.b) this.f21325L.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1() {
        if (this.f21324K == null && I.a().C().s()) {
            boolean zB = AbstractC0851a.b(requireActivity().getIntent());
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = getChildFragmentManager().j0(R.id.widget_pick_frame);
            LockScreenFragment lockScreenFragmentA = abstractComponentCallbacksC1132qJ0 instanceof LockScreenFragment ? (LockScreenFragment) abstractComponentCallbacksC1132qJ0 : null;
            if (lockScreenFragmentA == null) {
                lockScreenFragmentA = LockScreenFragment.f18594p0.a(!AbstractC0851a.k(requireActivity().getIntent()));
            }
            View viewRequireView = requireView();
            n.g(viewRequireView, "requireView(...)");
            C2013o c2013o = new C2013o(viewRequireView, lockScreenFragmentA, C1());
            this.f21324K = c2013o;
            c2013o.f();
            if (abstractComponentCallbacksC1132qJ0 == null) {
                if (zB) {
                    C2013o c2013o2 = this.f21324K;
                    if (c2013o2 != null) {
                        C2013o.i(c2013o2, false, null, 2, null);
                    }
                    C1().n("lock_screen_preview", true);
                }
                getChildFragmentManager().p().r(R.id.widget_pick_frame, lockScreenFragmentA).i();
                getChildFragmentManager().g0();
            }
        }
    }

    private final void F1(View view) {
        TabLayout tabLayout = (TabLayout) view.requireViewById(R.id.page_indicator);
        ViewPager2 viewPager2 = this.f21318E;
        if (viewPager2 != null) {
            com.google.android.material.tabs.d dVar = new com.google.android.material.tabs.d(tabLayout, viewPager2, new com.google.android.material.tabs.d.b() { // from class: g7.e
                @Override // com.google.android.material.tabs.d.b
                public final void a(TabLayout.f fVar, int i10) {
                    k.G1(fVar, i10);
                }
            });
            dVar.a();
            this.f21323J = dVar;
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                tabLayout.getLayoutParams().width = requireContext().getResources().getDimensionPixelSize(R.dimen.nt_dot_container_width) * itemCount;
            }
            tabLayout.r();
        }
        n.e(tabLayout);
        H6.d.e(tabLayout, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(TabLayout.f fVar, int i10) {
        n.h(fVar, "<unused var>");
    }

    private final void H1(View view) {
        if (AbstractC0851a.j(getContext()) || w.f()) {
            return;
        }
        super.s0(R.menu.nt_customization_menu);
        p088i7.a aVarT1 = t1();
        if (aVarT1 != null) {
            p038d7.l lVar = p038d7.l.f19719a;
            Context context = view.getContext();
            n.g(context, "getContext(...)");
            Toolbar mToolbar = this.f15945t;
            n.g(mToolbar, "mToolbar");
            p088i7.d dVarU1 = u1();
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            lVar.i(context, mToolbar, aVarT1, dVarU1, viewLifecycleOwner);
        }
    }

    private final void I1(View view) {
        View childAt;
        PreviewSectionLayout previewSectionLayout = (PreviewSectionLayout) view.findViewById(R.id.previewSectionLayout);
        this.f21320G = previewSectionLayout;
        n.e(previewSectionLayout);
        m.a(previewSectionLayout, w1(true));
        PreviewSectionLayout previewSectionLayout2 = this.f21320G;
        n.e(previewSectionLayout2);
        m.a(previewSectionLayout2, w1(false));
        ViewPager2 viewPager2 = this.f21318E;
        if (viewPager2 == null || (childAt = viewPager2.getChildAt(0)) == null) {
            return;
        }
        ((RecyclerView) childAt).addOnItemTouchListener(new c());
    }

    private final void J1(View view) {
        p064g3.f fVarS1 = s1();
        if (fVarS1 != null) {
            Context contextRequireContext = requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            if (!fVarS1.e(contextRequireContext)) {
                fVarS1 = null;
            }
            if (fVarS1 != null) {
                Context contextRequireContext2 = requireContext();
                n.g(contextRequireContext2, "requireContext(...)");
                View viewC = fVarS1.c(view, contextRequireContext2);
                if (viewC != null) {
                    viewC.setTag(fVarS1);
                }
            }
        }
    }

    private final void K1(View view) {
        View viewRequireViewById = view.requireViewById(R.id.space_indicator_2_card);
        n.g(viewRequireViewById, "requireViewById(...)");
        Space space = (Space) viewRequireViewById;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        n.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Object systemService = requireActivity().getSystemService("window");
        n.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        n.g(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        float density = currentWindowMetrics.getDensity();
        float fMax = Math.max(Math.min(2.625f, (3.96556f - density) / 59.0551f), 0.0f);
        layoutParams2.matchConstraintPercentHeight = fMax;
        space.setLayoutParams(layoutParams2);
        com.nothing.wallpaper.common.log.c.k(this.f21316C, "initViewLayoutParams: current density=" + density + ", percent=" + fMax);
    }

    private final void L1(View view) {
        p028c7.a aVar;
        D8.h hVarB;
        this.f21319F = new p028c7.a(this);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.screen_preview_viewpager);
        if (viewPager2 != null) {
            Resources resources = viewPager2.getResources();
            n.g(resources, "getResources(...)");
            p028c7.a aVar2 = this.f21319F;
            if (aVar2 == null) {
                n.r("screenPreviewPagerAdapter");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            p137n6.d.f(viewPager2, resources, R.dimen.nt_screen_preview_width, R.dimen.screen_page_horizontal_margin, 2, aVar);
            viewPager2.registerOnPageChangeCallback(new d(viewPager2));
            if (!viewPager2.isLaidOut() || viewPager2.isLayoutRequested()) {
                viewPager2.addOnLayoutChangeListener(new e(view));
            } else {
                ViewPager2 viewPager3 = this.f21318E;
                if (viewPager3 != null) {
                    View childAt = viewPager3.getChildAt(0);
                    RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                    float measuredHeight = view.requireViewById(R.id.space_indicator_2_card).getMeasuredHeight() * 0.8888f;
                    if (recyclerView != null && (hVarB = K.b(recyclerView)) != null) {
                        Iterator it = hVarB.iterator();
                        while (it.hasNext()) {
                            View viewRequireViewById = ((View) it.next()).requireViewById(R.id.screen_preview_click_view);
                            n.g(viewRequireViewById, "requireViewById(...)");
                            viewRequireViewById.setPadding(viewRequireViewById.getPaddingLeft(), (int) measuredHeight, viewRequireViewById.getPaddingRight(), viewRequireViewById.getPaddingBottom());
                        }
                    }
                }
                E1();
            }
        } else {
            viewPager2 = null;
        }
        this.f21318E = viewPager2;
    }

    public static final AbstractComponentCallbacksC1132q M1(boolean z9, CharSequence charSequence) {
        return f21315O.a(z9, charSequence);
    }

    private final void N1() {
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets O1(View v9, WindowInsets windowInsets) {
        n.h(v9, "v");
        n.h(windowInsets, "windowInsets");
        v9.setPadding(v9.getPaddingLeft(), v9.getPaddingTop(), v9.getPaddingRight(), windowInsets.getInsets(V.k.f()).bottom);
        return windowInsets.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(int i10, float f10) {
        LockScreenFragment lockScreenFragmentE;
        ViewPager2 viewPager2 = this.f21318E;
        if (viewPager2 == null) {
            return;
        }
        View[] viewArrV1 = v1(viewPager2);
        if (viewArrV1 == null || viewArrV1.length != 2) {
            viewArrV1 = null;
        }
        if (viewArrV1 == null) {
            return;
        }
        if (i10 != 0) {
            f10 = 1 - f10;
        }
        viewArrV1[0].setAlpha(f10);
        viewArrV1[1].setAlpha(1 - f10);
        C2013o c2013o = this.f21324K;
        if (c2013o == null || (lockScreenFragmentE = c2013o.e()) == null) {
            return;
        }
        lockScreenFragmentE.n4(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(int i10, float f10) {
        View viewFindViewById;
        if (!I.a().C().s() || (viewFindViewById = requireView().findViewById(R.id.widget_pick_frame)) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        viewFindViewById.setTranslationX((viewFindViewById.isLayoutRtl() ? 1 : -1) * (f10 + i10) * (q.c(contextRequireContext, R.dimen.nt_screen_preview_width) + getResources().getDimensionPixelSize(R.dimen.screen_page_horizontal_margin)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n1(p129m8.e eVar) {
        Object objE = M.e(new b(null), eVar);
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p1(p064g3.f c10) {
        n.h(c10, "c");
        return J6.d.d(c10) || J6.d.b(c10) || J6.d.c(c10) || J6.d.a(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q1(p219v8.l lVar, p064g3.f fVar) {
        n.e(fVar);
        return ((Boolean) lVar.f(fVar)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r1(p219v8.l lVar, Object obj) {
        return ((Boolean) lVar.f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p088i7.a t1() {
        p234x3.b bVar = this.f22075B;
        if (bVar instanceof p088i7.a) {
            return (p088i7.a) bVar;
        }
        return null;
    }

    private final p088i7.d u1() {
        return (p088i7.d) this.f21326M.getValue();
    }

    private final View[] v1(ViewPager2 viewPager2) {
        View childAt;
        View viewFindViewById;
        View childAt2;
        View viewFindViewById2;
        View[] viewArr = this.f21322I;
        if (viewArr != null) {
            return viewArr;
        }
        View childAt3 = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt3 instanceof RecyclerView ? (RecyclerView) childAt3 : null;
        if (recyclerView == null || (childAt = recyclerView.getChildAt(0)) == null || (viewFindViewById = childAt.findViewById(R.id.preview_dimming_scrim)) == null || (childAt2 = recyclerView.getChildAt(1)) == null || (viewFindViewById2 = childAt2.findViewById(R.id.preview_dimming_scrim)) == null) {
            return null;
        }
        View[] viewArr2 = {viewFindViewById, viewFindViewById2};
        this.f21322I = viewArr2;
        return viewArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x1(boolean z9, p064g3.f c10) {
        n.h(c10, "c");
        return z9 ? J6.d.c(c10) : J6.d.b(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(p219v8.l lVar, p064g3.f fVar) {
        n.e(fVar);
        return ((Boolean) lVar.f(fVar)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z1(p219v8.l lVar, Object obj) {
        return ((Boolean) lVar.f(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // p084i3.C1416o
    protected List A0(List list) {
        List arrayList;
        Stream stream;
        final p219v8.l lVar = new p219v8.l() { // from class: g7.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(k.p1((f) obj));
            }
        };
        if (list == null || (stream = list.stream()) == null) {
            arrayList = new ArrayList();
        } else {
            final p219v8.l lVar2 = new p219v8.l() { // from class: g7.c
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(k.q1(lVar, (f) obj));
                }
            };
            Stream streamFilter = stream.filter(new Predicate() { // from class: g7.d
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return k.r1(lVar2, obj);
                }
            });
            if (streamFilter == null || (arrayList = (List) streamFilter.collect(Collectors.toList())) == null) {
                arrayList = new ArrayList();
            }
        }
        List listA0 = super.A0(arrayList);
        n.g(listA0, "filterAvailableSections(...)");
        return listA0;
    }

    @Override // p084i3.C1416o
    protected int B0() {
        return R.layout.nt_fragment_customization_picker;
    }

    @Override // p084i3.C1416o
    public int C0() {
        return R.layout.nt_toolbar_container_layout;
    }

    public final void D1() {
        LockScreenFragment lockScreenFragmentE;
        View viewFindViewById = requireView().findViewById(R.id.widget_pick_frame);
        if (viewFindViewById != null) {
            viewFindViewById.setTranslationX(0.0f);
        }
        C2013o c2013o = this.f21324K;
        if (c2013o != null) {
            C2013o.i(c2013o, false, null, 2, null);
        }
        C1().y(true);
        C2013o c2013o2 = this.f21324K;
        if (c2013o2 == null || (lockScreenFragmentE = c2013o2.e()) == null) {
            return;
        }
        lockScreenFragmentE.Z2();
    }

    @Override // p084i3.C1416o
    protected void H0(View view, Bundle bundle) {
    }

    @Override // p084i3.C1416o
    protected void I0(View view) {
        r0(view, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r3.equals("lock_screen_preview") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r3.equals("custom_short_cut") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        C1().n(r3, false);
        r2 = r2.f21324K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        p248y7.C2013o.i(r2, false, null, 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r3.equals("custom_widget") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p084i3.C1416o, g3.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L4f
            int r0 = r3.hashCode()
            switch(r0) {
                case -1065597775: goto L34;
                case 94842723: goto L1c;
                case 1070886025: goto L13;
                case 1273182930: goto La;
                default: goto L9;
            }
        L9:
            goto L4f
        La:
            java.lang.String r0 = "custom_widget"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L4f
        L13:
            java.lang.String r0 = "lock_screen_preview"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L4f
        L1c:
            java.lang.String r0 = "color"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L25
            goto L4f
        L25:
            com.nothing.wallpaper.picker.customization.ui.activity.NTColorPickerActivity$a r3 = com.nothing.wallpaper.picker.customization.ui.activity.NTColorPickerActivity.f18495S
            androidx.fragment.app.v r2 = r2.requireActivity()
            java.lang.String r0 = "requireActivity(...)"
            kotlin.jvm.internal.n.g(r2, r0)
            r3.a(r2)
            return
        L34:
            java.lang.String r0 = "custom_short_cut"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L4f
        L3d:
            J7.b r0 = r2.C1()
            r1 = 0
            r0.n(r3, r1)
            y7.o r2 = r2.f21324K
            if (r2 == 0) goto L4e
            r3 = 3
            r0 = 0
            p248y7.C2013o.i(r2, r1, r0, r3, r0)
        L4e:
            return
        L4f:
            super.P(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p068g7.k.P(java.lang.String):void");
    }

    @Override // p084i3.C1416o, g3.f.a
    public void g(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        O oK;
        if (abstractComponentCallbacksC1132q == null) {
            return;
        }
        boolean z9 = abstractComponentCallbacksC1132q instanceof com.android.wallpaper.picker.g;
        if (z9) {
            com.android.wallpaper.picker.g gVar = (com.android.wallpaper.picker.g) abstractComponentCallbacksC1132q;
            p088i7.a aVarT1 = t1();
            gVar.setArguments(p231x0.d.a(new p079h8.o("key_is_lock_screen", Boolean.valueOf((aVarT1 == null || (oK = aVarT1.k()) == null) ? true : ((Boolean) oK.getValue()).booleanValue()))));
        }
        if (!z9 || p087i6.e.n()) {
            super.g(abstractComponentCallbacksC1132q);
            return;
        }
        J jO0 = requireActivity().o0();
        n.g(jO0, "getSupportFragmentManager(...)");
        jO0.p().b(R.id.fragment_container, abstractComponentCallbacksC1132q).g(null).i();
        jO0.g0();
    }

    public final void o1() {
        C2013o c2013o = this.f21324K;
        if (c2013o != null) {
            c2013o.d();
        }
    }

    @Override // p084i3.C1416o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (viewOnCreateView == null) {
            return null;
        }
        View viewRequireViewById = viewOnCreateView.requireViewById(R.id.nt_customization_container);
        n.g(viewRequireViewById, "requireViewById(...)");
        ((ViewGroup) viewRequireViewById).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: g7.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return k.O1(view, windowInsets);
            }
        });
        return viewOnCreateView;
    }

    @Override // p084i3.C1416o, com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        ViewPager2 viewPager2 = this.f21318E;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
        this.f21318E = null;
        this.f21320G = null;
        this.f21322I = null;
        com.google.android.material.tabs.d dVar = this.f21323J;
        if (dVar != null) {
            dVar.b();
        }
        this.f21323J = null;
        this.f21327N = null;
        this.f21324K = null;
        super.onDestroyView();
    }

    @Override // p084i3.C1395d, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        this.f21317D = bundle;
        K1(view);
        L1(view);
        I1(view);
        F1(view);
        J1(view);
        H1(view);
        N1();
    }

    @Override // p048e7.a
    public List r(boolean z9) {
        Stream stream = A0(F0(z9 ? InterfaceC1364d.a.LOCK_SCREEN : InterfaceC1364d.a.HOME_SCREEN, this.f21317D)).stream();
        final p219v8.l lVar = new p219v8.l() { // from class: g7.i
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(k.A1((f) obj));
            }
        };
        Object objCollect = stream.filter(new Predicate() { // from class: g7.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return k.B1(lVar, obj);
            }
        }).collect(Collectors.toList());
        n.g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    @Override // com.android.wallpaper.picker.a
    public void s0(int i10) {
    }

    public p064g3.f s1() {
        Object next;
        Iterator it = A0(F0(InterfaceC1364d.a.LOCK_SCREEN, this.f21317D)).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (J6.d.a((p064g3.f) next)) {
                return (p064g3.f) next;
            }
        }
        next = null;
        return (p064g3.f) next;
    }

    @Override // p048e7.a
    public boolean v(boolean z9, boolean z10) {
        Animator animator = this.f21327N;
        if (animator != null && animator.isRunning()) {
            com.nothing.wallpaper.common.log.c.k(this.f21316C, "selectPageItem: viewpager is in scrolling animation, block click event");
            return true;
        }
        ViewPager2 viewPager2 = this.f21318E;
        if (viewPager2 == null || p028c7.a.f15234q.c(viewPager2.getCurrentItem()) == z9) {
            return false;
        }
        int i10 = !z9 ? 1 : 0;
        com.nothing.wallpaper.common.log.c.d(this.f21316C, "selectPageItem: position is " + i10 + ", userClick is " + z10);
        if (z10) {
            Context contextRequireContext = requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            int iC = q.c(contextRequireContext, R.dimen.nt_screen_preview_width);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.screen_page_horizontal_margin);
            Animator animator2 = this.f21327N;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.f21327N = p137n6.d.d(viewPager2, i10, 0L, null, iC, dimensionPixelOffset, 6, null);
        } else {
            viewPager2.setCurrentItem(i10, false);
        }
        return true;
    }

    public List w1(final boolean z9) {
        List listA0 = A0(F0(z9 ? InterfaceC1364d.a.LOCK_SCREEN : InterfaceC1364d.a.HOME_SCREEN, this.f21317D));
        final p219v8.l lVar = new p219v8.l() { // from class: g7.f
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(k.x1(z9, (p064g3.f) obj));
            }
        };
        Stream stream = listA0.stream();
        final p219v8.l lVar2 = new p219v8.l() { // from class: g7.g
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(k.y1(lVar, (f) obj));
            }
        };
        Object objCollect = stream.filter(new Predicate() { // from class: g7.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return k.z1(lVar2, obj);
            }
        }).collect(Collectors.toList());
        n.g(objCollect, "collect(...)");
        return (List) objCollect;
    }
}
