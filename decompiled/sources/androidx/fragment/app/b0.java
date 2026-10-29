package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f13070g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f13071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f13073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13076f;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final b0 a(ViewGroup container, J fragmentManager) {
            kotlin.jvm.internal.n.h(container, "container");
            kotlin.jvm.internal.n.h(fragmentManager, "fragmentManager");
            c0 c0VarD0 = fragmentManager.D0();
            kotlin.jvm.internal.n.g(c0VarD0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, c0VarD0);
        }

        public final b0 b(ViewGroup container, c0 factory) {
            kotlin.jvm.internal.n.h(container, "container");
            kotlin.jvm.internal.n.h(factory, "factory");
            int i10 = T0.b.f7402b;
            Object tag = container.getTag(i10);
            if (tag instanceof b0) {
                return (b0) tag;
            }
            b0 b0VarA = factory.a(container);
            kotlin.jvm.internal.n.g(b0VarA, "factory.createController(container)");
            container.setTag(i10, b0VarA);
            return b0VarA;
        }

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f13077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13079c;

        public final void a(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            if (!this.f13079c) {
                c(container);
            }
            this.f13079c = true;
        }

        public boolean b() {
            return this.f13077a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(p010b.b backEvent, ViewGroup container) {
            kotlin.jvm.internal.n.h(backEvent, "backEvent");
            kotlin.jvm.internal.n.h(container, "container");
        }

        public void f(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
        }

        public final void g(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            if (!this.f13078b) {
                f(container);
            }
            this.f13078b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final P f13080l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b finalState, d.a lifecycleImpact, P fragmentStateManager) {
            kotlin.jvm.internal.n.h(finalState, "finalState");
            kotlin.jvm.internal.n.h(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.n.h(fragmentStateManager, "fragmentStateManager");
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = fragmentStateManager.k();
            kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, abstractComponentCallbacksC1132qK);
            this.f13080l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.b0.d
        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f13080l.m();
        }

        @Override // androidx.fragment.app.b0.d
        public void p() {
            if (n()) {
                return;
            }
            super.p();
            if (i() != d.a.ADDING) {
                if (i() == d.a.REMOVING) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = this.f13080l.k();
                    kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qK, "fragmentStateManager.fragment");
                    View viewRequireView = abstractComponentCallbacksC1132qK.requireView();
                    kotlin.jvm.internal.n.g(viewRequireView, "fragment.requireView()");
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + abstractComponentCallbacksC1132qK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK2 = this.f13080l.k();
            kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qK2, "fragmentStateManager.fragment");
            View viewFindFocus = abstractComponentCallbacksC1132qK2.mView.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC1132qK2.setFocusedView(viewFindFocus);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC1132qK2);
                }
            }
            View viewRequireView2 = h().requireView();
            kotlin.jvm.internal.n.g(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f13080l.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(abstractComponentCallbacksC1132qK2.getPostOnViewCreatedAlpha());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f13081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f13082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractComponentCallbacksC1132q f13083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f13084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f13086f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f13087g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f13088h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f13089i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f13090j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final List f13091k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final a f13096q = new a(null);

            public static final class a {
                public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                    this();
                }

                public final b a(View view) {
                    kotlin.jvm.internal.n.h(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.b0$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0391b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f13102a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f13102a = iArr;
                }
            }

            public static final b f(int i10) {
                return f13096q.b(i10);
            }

            public final void e(View view, ViewGroup container) {
                kotlin.jvm.internal.n.h(view, "view");
                kotlin.jvm.internal.n.h(container, "container");
                int i10 = C0391b.f13102a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13103a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f13103a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, AbstractComponentCallbacksC1132q fragment) {
            kotlin.jvm.internal.n.h(finalState, "finalState");
            kotlin.jvm.internal.n.h(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.n.h(fragment, "fragment");
            this.f13081a = finalState;
            this.f13082b = lifecycleImpact;
            this.f13083c = fragment;
            this.f13084d = new ArrayList();
            this.f13089i = true;
            ArrayList arrayList = new ArrayList();
            this.f13090j = arrayList;
            this.f13091k = arrayList;
        }

        public final void a(Runnable listener) {
            kotlin.jvm.internal.n.h(listener, "listener");
            this.f13084d.add(listener);
        }

        public final void b(b effect) {
            kotlin.jvm.internal.n.h(effect, "effect");
            this.f13090j.add(effect);
        }

        public final void c(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            this.f13088h = false;
            if (this.f13085e) {
                return;
            }
            this.f13085e = true;
            if (this.f13090j.isEmpty()) {
                d();
                return;
            }
            Iterator it = AbstractC1444s.r0(this.f13091k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.f13088h = false;
            if (this.f13086f) {
                return;
            }
            if (J.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f13086f = true;
            Iterator it = this.f13084d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            kotlin.jvm.internal.n.h(effect, "effect");
            if (this.f13090j.remove(effect) && this.f13090j.isEmpty()) {
                d();
            }
        }

        public final List f() {
            return this.f13091k;
        }

        public final b g() {
            return this.f13081a;
        }

        public final AbstractComponentCallbacksC1132q h() {
            return this.f13083c;
        }

        public final a i() {
            return this.f13082b;
        }

        public final boolean j() {
            return this.f13089i;
        }

        public final boolean k() {
            return this.f13085e;
        }

        public final boolean l() {
            return this.f13086f;
        }

        public final boolean m() {
            return this.f13087g;
        }

        public final boolean n() {
            return this.f13088h;
        }

        public final void o(b finalState, a lifecycleImpact) {
            kotlin.jvm.internal.n.h(finalState, "finalState");
            kotlin.jvm.internal.n.h(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f13103a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f13081a == b.REMOVED) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f13083c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f13082b + " to ADDING.");
                    }
                    this.f13081a = b.VISIBLE;
                    this.f13082b = a.ADDING;
                    this.f13089i = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f13083c + " mFinalState = " + this.f13081a + " -> REMOVED. mLifecycleImpact  = " + this.f13082b + " to REMOVING.");
                }
                this.f13081a = b.REMOVED;
                this.f13082b = a.REMOVING;
                this.f13089i = true;
                return;
            }
            if (i10 == 3 && this.f13081a != b.REMOVED) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f13083c + " mFinalState = " + this.f13081a + " -> " + finalState + '.');
                }
                this.f13081a = finalState;
            }
        }

        public void p() {
            this.f13088h = true;
        }

        public final void q(boolean z9) {
            this.f13089i = z9;
        }

        public final void r(boolean z9) {
            this.f13087g = z9;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f13081a + " lifecycleImpact = " + this.f13082b + " fragment = " + this.f13083c + '}';
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13104a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13104a = iArr;
        }
    }

    public b0(ViewGroup container) {
        kotlin.jvm.internal.n.h(container, "container");
        this.f13071a = container;
        this.f13072b = new ArrayList();
        this.f13073c = new ArrayList();
    }

    private final void B(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) list.get(i10)).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1444s.z(arrayList, ((d) it.next()).f());
        }
        List listR0 = AbstractC1444s.r0(AbstractC1444s.w0(arrayList));
        int size2 = listR0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listR0.get(i11)).g(this.f13071a);
        }
    }

    private final void C() {
        for (d dVar : this.f13072b) {
            if (dVar.i() == d.a.ADDING) {
                View viewRequireView = dVar.h().requireView();
                kotlin.jvm.internal.n.g(viewRequireView, "fragment.requireView()");
                dVar.o(d.b.f13096q.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, P p9) {
        synchronized (this.f13072b) {
            try {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qK, "fragmentStateManager.fragment");
                d dVarO = o(abstractComponentCallbacksC1132qK);
                if (dVarO == null) {
                    if (p9.k().mTransitioning) {
                        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK2 = p9.k();
                        kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qK2, "fragmentStateManager.fragment");
                        dVarO = p(abstractComponentCallbacksC1132qK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, p9);
                this.f13072b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.h(this.f13048q, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.i(this.f13054q, cVar);
                    }
                });
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(b0 this$0, c operation) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(operation, "$operation");
        if (this$0.f13072b.contains(operation)) {
            d.b bVarG = operation.g();
            View view = operation.h().mView;
            kotlin.jvm.internal.n.g(view, "operation.fragment.mView");
            bVarG.e(view, this$0.f13071a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(b0 this$0, c operation) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(operation, "$operation");
        this$0.f13072b.remove(operation);
        this$0.f13073c.remove(operation);
    }

    private final d o(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        Object next;
        Iterator it = this.f13072b.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (kotlin.jvm.internal.n.d(dVar.h(), abstractComponentCallbacksC1132q) && !dVar.k()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    private final d p(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        Object next;
        Iterator it = this.f13073c.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (kotlin.jvm.internal.n.d(dVar.h(), abstractComponentCallbacksC1132q) && !dVar.k()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public static final b0 u(ViewGroup viewGroup, J j9) {
        return f13070g.a(viewGroup, j9);
    }

    public static final b0 v(ViewGroup viewGroup, c0 c0Var) {
        return f13070g.b(viewGroup, c0Var);
    }

    private final boolean w(List list) {
        boolean z9;
        List list2 = list;
        Iterator it = list2.iterator();
        loop0: while (true) {
            z9 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator it2 = listF.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                        } while (((b) it2.next()).b());
                    } else {
                        break;
                    }
                }
                z9 = false;
            }
        }
        if (z9) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                AbstractC1444s.z(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List list) {
        Iterator it = list.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().mTransitioning) {
                z9 = false;
            }
        }
        return z9;
    }

    public final void A(p010b.b backEvent) {
        kotlin.jvm.internal.n.h(backEvent, "backEvent");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.a());
        }
        List list = this.f13073c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1444s.z(arrayList, ((d) it.next()).f());
        }
        List listR0 = AbstractC1444s.r0(AbstractC1444s.w0(arrayList));
        int size = listR0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listR0.get(i10)).e(backEvent, this.f13071a);
        }
    }

    public final void D(boolean z9) {
        this.f13075e = z9;
    }

    public final void c(d operation) {
        kotlin.jvm.internal.n.h(operation, "operation");
        if (operation.j()) {
            d.b bVarG = operation.g();
            View viewRequireView = operation.h().requireView();
            kotlin.jvm.internal.n.g(viewRequireView, "operation.fragment.requireView()");
            bVarG.e(viewRequireView, this.f13071a);
            operation.q(false);
        }
    }

    public abstract void d(List list, boolean z9);

    public void e(List operations) {
        kotlin.jvm.internal.n.h(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            AbstractC1444s.z(arrayList, ((d) it.next()).f());
        }
        List listR0 = AbstractC1444s.r0(AbstractC1444s.w0(arrayList));
        int size = listR0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listR0.get(i10)).d(this.f13071a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c((d) operations.get(i11));
        }
        List listR1 = AbstractC1444s.r0(operations);
        int size3 = listR1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listR1.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.f13073c);
        e(this.f13073c);
    }

    public final void j(d.b finalState, P fragmentStateManager) {
        kotlin.jvm.internal.n.h(finalState, "finalState");
        kotlin.jvm.internal.n.h(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(P fragmentStateManager) {
        kotlin.jvm.internal.n.h(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(P fragmentStateManager) {
        kotlin.jvm.internal.n.h(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(P fragmentStateManager) {
        kotlin.jvm.internal.n.h(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        if (this.f13076f) {
            return;
        }
        if (!this.f13071a.isAttachedToWindow()) {
            q();
            this.f13075e = false;
            return;
        }
        synchronized (this.f13072b) {
            try {
                List<d> listU0 = AbstractC1444s.u0(this.f13073c);
                this.f13073c.clear();
                for (d dVar : listU0) {
                    dVar.r(!this.f13072b.isEmpty() && dVar.h().mTransitioning);
                }
                for (d dVar2 : listU0) {
                    if (this.f13074d) {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.f13071a);
                    }
                    this.f13074d = false;
                    if (!dVar2.l()) {
                        this.f13073c.add(dVar2);
                    }
                }
                if (!this.f13072b.isEmpty()) {
                    C();
                    List listU1 = AbstractC1444s.u0(this.f13072b);
                    if (listU1.isEmpty()) {
                        return;
                    }
                    this.f13072b.clear();
                    this.f13073c.addAll(listU1);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listU1, this.f13075e);
                    boolean zW = w(listU1);
                    boolean zX = x(listU1);
                    this.f13074d = zX && !zW;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listU1);
                        e(listU1);
                    } else if (zW) {
                        B(listU1);
                        int size = listU1.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c((d) listU1.get(i10));
                        }
                    }
                    this.f13075e = false;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f13071a.isAttachedToWindow();
        synchronized (this.f13072b) {
            try {
                C();
                B(this.f13072b);
                List<d> listU0 = AbstractC1444s.u0(this.f13073c);
                Iterator it = listU0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listU0) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f13071a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f13071a);
                }
                List<d> listU1 = AbstractC1444s.u0(this.f13072b);
                Iterator it2 = listU1.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listU1) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f13071a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f13071a);
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.f13076f) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f13076f = false;
            n();
        }
    }

    public final d.a s(P fragmentStateManager) {
        kotlin.jvm.internal.n.h(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = fragmentStateManager.k();
        kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qK, "fragmentStateManager.fragment");
        d dVarO = o(abstractComponentCallbacksC1132qK);
        d.a aVarI = dVarO != null ? dVarO.i() : null;
        d dVarP = p(abstractComponentCallbacksC1132qK);
        d.a aVarI2 = dVarP != null ? dVarP.i() : null;
        int i10 = aVarI == null ? -1 : e.f13104a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup t() {
        return this.f13071a;
    }

    public final boolean y() {
        return !this.f13072b.isEmpty();
    }

    public final void z() {
        Object objPrevious;
        synchronized (this.f13072b) {
            try {
                C();
                List list = this.f13072b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.f13096q;
                    View view = dVar.h().mView;
                    kotlin.jvm.internal.n.g(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarG = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH = dVar2 != null ? dVar2.h() : null;
                this.f13076f = abstractComponentCallbacksC1132qH != null ? abstractComponentCallbacksC1132qH.isPostponed() : false;
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
