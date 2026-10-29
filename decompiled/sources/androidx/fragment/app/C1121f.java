package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C1021a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1121f extends b0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    static final class a extends b0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f13112d;

        /* JADX INFO: renamed from: androidx.fragment.app.f$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0392a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0.d f13113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f13114b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f13115c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f13116d;

            AnimationAnimationListenerC0392a(b0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f13113a = dVar;
                this.f13114b = viewGroup;
                this.f13115c = view;
                this.f13116d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup container, View view, a this$0) {
                kotlin.jvm.internal.n.h(container, "$container");
                kotlin.jvm.internal.n.h(this$0, "this$0");
                container.endViewTransition(view);
                this$0.h().a().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                kotlin.jvm.internal.n.h(animation, "animation");
                final ViewGroup viewGroup = this.f13114b;
                final View view = this.f13115c;
                final a aVar = this.f13116d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1121f.a.AnimationAnimationListenerC0392a.b(viewGroup, view, aVar);
                    }
                });
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f13113a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                kotlin.jvm.internal.n.h(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                kotlin.jvm.internal.n.h(animation, "animation");
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f13113a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            kotlin.jvm.internal.n.h(animationInfo, "animationInfo");
            this.f13112d = animationInfo;
        }

        @Override // androidx.fragment.app.b0.b
        public void c(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            b0.d dVarA = this.f13112d.a();
            View view = dVarA.h().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f13112d.a().e(this);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void d(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            if (this.f13112d.b()) {
                this.f13112d.a().e(this);
                return;
            }
            Context context = container.getContext();
            b0.d dVarA = this.f13112d.a();
            View view = dVarA.h().mView;
            b bVar = this.f13112d;
            kotlin.jvm.internal.n.g(context, "context");
            AbstractC1137w.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f13246a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.g() != b0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f13112d.a().e(this);
                return;
            }
            container.startViewTransition(view);
            AbstractC1137w.b bVar2 = new AbstractC1137w.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0392a(dVarA, container, view, this));
            view.startAnimation(bVar2);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has started.");
            }
        }

        public final b h() {
            return this.f13112d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$b */
    private static final class b extends C0393f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f13117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC1137w.a f13119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.d operation, boolean z9) {
            super(operation);
            kotlin.jvm.internal.n.h(operation, "operation");
            this.f13117b = z9;
        }

        public final AbstractC1137w.a c(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            if (this.f13118c) {
                return this.f13119d;
            }
            AbstractC1137w.a aVarB = AbstractC1137w.b(context, a().h(), a().g() == b0.d.b.VISIBLE, this.f13117b);
            this.f13119d = aVarB;
            this.f13118c = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$c */
    private static final class c extends b0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f13120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AnimatorSet f13121e;

        /* JADX INFO: renamed from: androidx.fragment.app.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f13122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f13123b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f13124c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b0.d f13125d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f13126e;

            a(ViewGroup viewGroup, View view, boolean z9, b0.d dVar, c cVar) {
                this.f13122a = viewGroup;
                this.f13123b = view;
                this.f13124c = z9;
                this.f13125d = dVar;
                this.f13126e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                kotlin.jvm.internal.n.h(anim, "anim");
                this.f13122a.endViewTransition(this.f13123b);
                if (this.f13124c) {
                    b0.d.b bVarG = this.f13125d.g();
                    View viewToAnimate = this.f13123b;
                    kotlin.jvm.internal.n.g(viewToAnimate, "viewToAnimate");
                    bVarG.e(viewToAnimate, this.f13122a);
                }
                this.f13126e.h().a().e(this.f13126e);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f13125d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            kotlin.jvm.internal.n.h(animatorInfo, "animatorInfo");
            this.f13120d = animatorInfo;
        }

        @Override // androidx.fragment.app.b0.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.b0.b
        public void c(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            AnimatorSet animatorSet = this.f13121e;
            if (animatorSet == null) {
                this.f13120d.a().e(this);
                return;
            }
            b0.d dVarA = this.f13120d.a();
            if (dVarA.m()) {
                e.f13128a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (J.L0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(dVarA);
                sb.append(" has been canceled");
                sb.append(dVarA.m() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void d(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            b0.d dVarA = this.f13120d.a();
            AnimatorSet animatorSet = this.f13121e;
            if (animatorSet == null) {
                this.f13120d.a().e(this);
                return;
            }
            animatorSet.start();
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animator from operation " + dVarA + " has started.");
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void e(p010b.b backEvent, ViewGroup container) {
            kotlin.jvm.internal.n.h(backEvent, "backEvent");
            kotlin.jvm.internal.n.h(container, "container");
            b0.d dVarA = this.f13120d.a();
            AnimatorSet animatorSet = this.f13121e;
            if (animatorSet == null) {
                this.f13120d.a().e(this);
                return;
            }
            if (dVarA.h().mTransitioning) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + dVarA);
                }
                long jA = d.f13127a.a(animatorSet);
                long jA2 = (long) (backEvent.a() * jA);
                if (jA2 == 0) {
                    jA2 = 1;
                }
                if (jA2 == jA) {
                    jA2 = jA - 1;
                }
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Setting currentPlayTime to " + jA2 + " for Animator " + animatorSet + " on operation " + dVarA);
                }
                e.f13128a.b(animatorSet, jA2);
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void f(ViewGroup container) {
            c cVar;
            kotlin.jvm.internal.n.h(container, "container");
            if (this.f13120d.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f13120d;
            kotlin.jvm.internal.n.g(context, "context");
            AbstractC1137w.a aVarC = bVar.c(context);
            this.f13121e = aVarC != null ? aVarC.f13247b : null;
            b0.d dVarA = this.f13120d.a();
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH = dVarA.h();
            boolean z9 = dVarA.g() == b0.d.b.GONE;
            View view = abstractComponentCallbacksC1132qH.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f13121e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z9, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f13121e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f13120d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f13127a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            kotlin.jvm.internal.n.h(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f13128a = new e();

        private e() {
        }

        public final void a(AnimatorSet animatorSet) {
            kotlin.jvm.internal.n.h(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j9) {
            kotlin.jvm.internal.n.h(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j9);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    public static class C0393f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0.d f13129a;

        public C0393f(b0.d operation) {
            kotlin.jvm.internal.n.h(operation, "operation");
            this.f13129a = operation;
        }

        public final b0.d a() {
            return this.f13129a;
        }

        public final boolean b() {
            View view = this.f13129a.h().mView;
            b0.d.b bVarA = view != null ? b0.d.b.f13096q.a(view) : null;
            b0.d.b bVarG = this.f13129a.g();
            if (bVarA == bVarG) {
                return true;
            }
            b0.d.b bVar = b0.d.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$g */
    static final class g extends b0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f13130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b0.d f13131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b0.d f13132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final V f13133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f13134h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList f13135i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final ArrayList f13136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C1021a f13137k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ArrayList f13138l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final ArrayList f13139m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C1021a f13140n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final C1021a f13141o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f13142p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final p231x0.e f13143q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Object f13144r;

        /* JADX INFO: renamed from: androidx.fragment.app.f$g$a */
        static final class a extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ViewGroup f13146s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f13147t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f13146s = viewGroup;
                this.f13147t = obj;
            }

            public final void a() {
                g.this.v().e(this.f13146s, this.f13147t);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.f$g$b */
        static final class b extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ViewGroup f13149s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f13150t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.E f13151u;

            /* JADX INFO: renamed from: androidx.fragment.app.f$g$b$a */
            static final class a extends kotlin.jvm.internal.o implements p219v8.a {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ g f13152r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ Object f13153s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ViewGroup f13154t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f13152r = gVar;
                    this.f13153s = obj;
                    this.f13154t = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void g(g this$0, ViewGroup container) {
                    kotlin.jvm.internal.n.h(this$0, "this$0");
                    kotlin.jvm.internal.n.h(container, "$container");
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        b0.d dVarA = ((h) it.next()).a();
                        View view = dVarA.h().getView();
                        if (view != null) {
                            dVarA.g().e(view, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void h(g this$0) {
                    kotlin.jvm.internal.n.h(this$0, "this$0");
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a().e(this$0);
                    }
                }

                public final void d() {
                    List listW = this.f13152r.w();
                    if (!(listW instanceof Collection) || !listW.isEmpty()) {
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).a().m()) {
                                if (J.L0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                p231x0.e eVar = new p231x0.e();
                                V v9 = this.f13152r.v();
                                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH = ((h) this.f13152r.w().get(0)).a().h();
                                Object obj = this.f13153s;
                                final g gVar = this.f13152r;
                                v9.w(abstractComponentCallbacksC1132qH, obj, eVar, new Runnable() { // from class: androidx.fragment.app.n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1121f.g.b.a.h(gVar);
                                    }
                                });
                                eVar.a();
                                return;
                            }
                        }
                    }
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    V v10 = this.f13152r.v();
                    Object objS = this.f13152r.s();
                    kotlin.jvm.internal.n.e(objS);
                    final g gVar2 = this.f13152r;
                    final ViewGroup viewGroup = this.f13154t;
                    v10.d(objS, new Runnable() { // from class: androidx.fragment.app.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1121f.g.b.a.g(gVar2, viewGroup);
                        }
                    });
                }

                @Override // p219v8.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    d();
                    return p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, kotlin.jvm.internal.E e10) {
                super(0);
                this.f13149s = viewGroup;
                this.f13150t = obj;
                this.f13151u = e10;
            }

            public final void a() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f13149s, this.f13150t));
                boolean z9 = g.this.s() != null;
                Object obj = this.f13150t;
                ViewGroup viewGroup = this.f13149s;
                if (!z9) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f13151u.f22779q = new a(g.this, obj, viewGroup);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        public g(List transitionInfos, b0.d dVar, b0.d dVar2, V transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, C1021a sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, C1021a firstOutViews, C1021a lastInViews, boolean z9) {
            kotlin.jvm.internal.n.h(transitionInfos, "transitionInfos");
            kotlin.jvm.internal.n.h(transitionImpl, "transitionImpl");
            kotlin.jvm.internal.n.h(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            kotlin.jvm.internal.n.h(sharedElementLastInViews, "sharedElementLastInViews");
            kotlin.jvm.internal.n.h(sharedElementNameMapping, "sharedElementNameMapping");
            kotlin.jvm.internal.n.h(enteringNames, "enteringNames");
            kotlin.jvm.internal.n.h(exitingNames, "exitingNames");
            kotlin.jvm.internal.n.h(firstOutViews, "firstOutViews");
            kotlin.jvm.internal.n.h(lastInViews, "lastInViews");
            this.f13130d = transitionInfos;
            this.f13131e = dVar;
            this.f13132f = dVar2;
            this.f13133g = transitionImpl;
            this.f13134h = obj;
            this.f13135i = sharedElementFirstOutViews;
            this.f13136j = sharedElementLastInViews;
            this.f13137k = sharedElementNameMapping;
            this.f13138l = enteringNames;
            this.f13139m = exitingNames;
            this.f13140n = firstOutViews;
            this.f13141o = lastInViews;
            this.f13142p = z9;
            this.f13143q = new p231x0.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(b0.d operation, g this$0) {
            kotlin.jvm.internal.n.h(operation, "$operation");
            kotlin.jvm.internal.n.h(this$0, "this$0");
            if (J.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        private final void B(ArrayList arrayList, ViewGroup viewGroup, p219v8.a aVar) {
            T.d(arrayList, 4);
            ArrayList arrayListQ = this.f13133g.q(this.f13136j);
            if (J.L0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object sharedElementFirstOutViews : this.f13135i) {
                    kotlin.jvm.internal.n.g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + androidx.core.view.H.C(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object sharedElementLastInViews : this.f13136j) {
                    kotlin.jvm.internal.n.g(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + androidx.core.view.H.C(view2));
                }
            }
            aVar.invoke();
            this.f13133g.y(viewGroup, this.f13135i, this.f13136j, arrayListQ, this.f13137k);
            T.d(arrayList, 0);
            this.f13133g.A(this.f13134h, this.f13135i, this.f13136j);
        }

        private final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (androidx.core.view.J.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    kotlin.jvm.internal.n.g(child, "child");
                    n(arrayList, child);
                }
            }
        }

        private final p079h8.o o(ViewGroup viewGroup, final b0.d dVar, final b0.d dVar2) {
            dVar = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f13130d.iterator();
            boolean z9 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar != null && !this.f13137k.isEmpty() && this.f13134h != null) {
                    T.a(dVar.h(), dVar2.h(), this.f13142p, this.f13140n, true);
                    androidx.core.view.y.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1121f.g.p(dVar, dVar2, this);
                        }
                    });
                    this.f13135i.addAll(this.f13140n.values());
                    if (!this.f13139m.isEmpty()) {
                        Object obj = this.f13139m.get(0);
                        kotlin.jvm.internal.n.g(obj, "exitingNames[0]");
                        view2 = (View) this.f13140n.get((String) obj);
                        this.f13133g.v(this.f13134h, view2);
                    }
                    this.f13136j.addAll(this.f13141o.values());
                    if (!this.f13138l.isEmpty()) {
                        Object obj2 = this.f13138l.get(0);
                        kotlin.jvm.internal.n.g(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f13141o.get((String) obj2);
                        if (view3 != null) {
                            final V v9 = this.f13133g;
                            androidx.core.view.y.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1121f.g.q(v9, view3, rect);
                                }
                            });
                            z9 = true;
                        }
                    }
                    this.f13133g.z(this.f13134h, view, this.f13135i);
                    V v10 = this.f13133g;
                    Object obj3 = this.f13134h;
                    v10.s(obj3, null, null, null, null, obj3, this.f13136j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f13130d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                b0.d dVarA = hVar.a();
                z9 = z9;
                Object objH = this.f13133g.h(hVar.f());
                if (objH != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = dVarA.h().mView;
                    kotlin.jvm.internal.n.g(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f13134h != null && (dVarA == dVar2 || dVarA == dVar)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(AbstractC1444s.w0(this.f13135i));
                        } else {
                            arrayList2.removeAll(AbstractC1444s.w0(this.f13136j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f13133g.a(objH, view);
                    } else {
                        this.f13133g.b(objH, arrayList2);
                        this.f13133g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.g() == b0.d.b.GONE) {
                            dVarA.q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarA.h().mView);
                            this.f13133g.r(objH, dVarA.h().mView, arrayList3);
                            androidx.core.view.y.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1121f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.g() == b0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z9) {
                            this.f13133g.u(objH, rect);
                        }
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object transitioningViews : arrayList2) {
                                kotlin.jvm.internal.n.g(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.f13133g.v(objH, view2);
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object transitioningViews2 : arrayList2) {
                                kotlin.jvm.internal.n.g(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        objP = this.f13133g.p(objP, objH, null);
                    } else {
                        objP2 = this.f13133g.p(objP2, objH, null);
                    }
                    it2 = it3;
                }
            }
            Object objO = this.f13133g.o(objP, objP2, this.f13134h);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO);
            }
            return new p079h8.o(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(b0.d dVar, b0.d dVar2, g this$0) {
            kotlin.jvm.internal.n.h(this$0, "this$0");
            T.a(dVar.h(), dVar2.h(), this$0.f13142p, this$0.f13141o, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(V impl, View view, Rect lastInEpicenterRect) {
            kotlin.jvm.internal.n.h(impl, "$impl");
            kotlin.jvm.internal.n.h(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            kotlin.jvm.internal.n.h(transitioningViews, "$transitioningViews");
            T.d(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(b0.d operation, g this$0) {
            kotlin.jvm.internal.n.h(operation, "$operation");
            kotlin.jvm.internal.n.h(this$0, "this$0");
            if (J.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(kotlin.jvm.internal.E seekCancelLambda) {
            kotlin.jvm.internal.n.h(seekCancelLambda, "$seekCancelLambda");
            p219v8.a aVar = (p219v8.a) seekCancelLambda.f22779q;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void C(Object obj) {
            this.f13144r = obj;
        }

        @Override // androidx.fragment.app.b0.b
        public boolean b() {
            if (!this.f13133g.m()) {
                return false;
            }
            List<h> list = this.f13130d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (hVar.f() == null || !this.f13133g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f13134h;
            return obj == null || this.f13133g.n(obj);
        }

        @Override // androidx.fragment.app.b0.b
        public void c(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            this.f13143q.a();
        }

        @Override // androidx.fragment.app.b0.b
        public void d(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            if (!container.isLaidOut()) {
                for (h hVar : this.f13130d) {
                    b0.d dVarA = hVar.a();
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + dVarA);
                    }
                    hVar.a().e(this);
                }
                return;
            }
            Object obj = this.f13144r;
            if (obj != null) {
                V v9 = this.f13133g;
                kotlin.jvm.internal.n.e(obj);
                v9.c(obj);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f13131e + " to " + this.f13132f);
                    return;
                }
                return;
            }
            p079h8.o oVarO = o(container, this.f13132f, this.f13131e);
            ArrayList arrayList = (ArrayList) oVarO.a();
            Object objB = oVarO.b();
            List list = this.f13130d;
            ArrayList<b0.d> arrayList2 = new ArrayList(AbstractC1444s.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final b0.d dVar : arrayList2) {
                this.f13133g.w(dVar.h(), objB, this.f13143q, new Runnable() { // from class: androidx.fragment.app.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1121f.g.y(dVar, this);
                    }
                });
            }
            B(arrayList, container, new a(container, objB));
            if (J.L0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f13131e + " to " + this.f13132f);
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void e(p010b.b backEvent, ViewGroup container) {
            kotlin.jvm.internal.n.h(backEvent, "backEvent");
            kotlin.jvm.internal.n.h(container, "container");
            Object obj = this.f13144r;
            if (obj != null) {
                this.f13133g.t(obj, backEvent.a());
            }
        }

        @Override // androidx.fragment.app.b0.b
        public void f(ViewGroup container) {
            kotlin.jvm.internal.n.h(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f13130d.iterator();
                while (it.hasNext()) {
                    b0.d dVarA = ((h) it.next()).a();
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + dVarA);
                    }
                }
                return;
            }
            if (x() && this.f13134h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f13134h + " between " + this.f13131e + " and " + this.f13132f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
                p079h8.o oVarO = o(container, this.f13132f, this.f13131e);
                ArrayList arrayList = (ArrayList) oVarO.a();
                Object objB = oVarO.b();
                List list = this.f13130d;
                ArrayList<b0.d> arrayList2 = new ArrayList(AbstractC1444s.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final b0.d dVar : arrayList2) {
                    this.f13133g.x(dVar.h(), objB, this.f13143q, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1121f.g.z(e10);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1121f.g.A(dVar, this);
                        }
                    });
                }
                B(arrayList, container, new b(container, objB, e10));
            }
        }

        public final Object s() {
            return this.f13144r;
        }

        public final b0.d t() {
            return this.f13131e;
        }

        public final b0.d u() {
            return this.f13132f;
        }

        public final V v() {
            return this.f13133g;
        }

        public final List w() {
            return this.f13130d;
        }

        public final boolean x() {
            List list = this.f13130d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$h */
    private static final class h extends C0393f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f13155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f13156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f13157d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b0.d operation, boolean z9, boolean z10) {
            Object returnTransition;
            super(operation);
            kotlin.jvm.internal.n.h(operation, "operation");
            b0.d.b bVarG = operation.g();
            b0.d.b bVar = b0.d.b.VISIBLE;
            if (bVarG == bVar) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH = operation.h();
                returnTransition = z9 ? abstractComponentCallbacksC1132qH.getReenterTransition() : abstractComponentCallbacksC1132qH.getEnterTransition();
            } else {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH2 = operation.h();
                returnTransition = z9 ? abstractComponentCallbacksC1132qH2.getReturnTransition() : abstractComponentCallbacksC1132qH2.getExitTransition();
            }
            this.f13155b = returnTransition;
            this.f13156c = operation.g() == bVar ? z9 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f13157d = z10 ? z9 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final V d(Object obj) {
            if (obj == null) {
                return null;
            }
            V v9 = T.f13015b;
            if (v9 != null && v9.g(obj)) {
                return v9;
            }
            V v10 = T.f13016c;
            if (v10 != null && v10.g(obj)) {
                return v10;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final V c() {
            V vD = d(this.f13155b);
            V vD2 = d(this.f13157d);
            if (vD == null || vD2 == null || vD == vD2) {
                return vD == null ? vD2 : vD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f13155b + " which uses a different Transition  type than its shared element transition " + this.f13157d).toString());
        }

        public final Object e() {
            return this.f13157d;
        }

        public final Object f() {
            return this.f13155b;
        }

        public final boolean g() {
            return this.f13157d != null;
        }

        public final boolean h() {
            return this.f13156c;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$i */
    static final class i extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Collection f13158r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection collection) {
            super(1);
            this.f13158r = collection;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(Map.Entry entry) {
            kotlin.jvm.internal.n.h(entry, "entry");
            return Boolean.valueOf(AbstractC1444s.L(this.f13158r, androidx.core.view.H.C((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121f(ViewGroup container) {
        super(container);
        kotlin.jvm.internal.n.h(container, "container");
    }

    private final void F(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1444s.z(arrayList2, ((b) it.next()).a().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z9 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            b0.d dVarA = bVar.a();
            kotlin.jvm.internal.n.g(context, "context");
            AbstractC1137w.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f13247b == null) {
                    arrayList.add(bVar);
                } else {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH = dVarA.h();
                    if (dVarA.f().isEmpty()) {
                        if (dVarA.g() == b0.d.b.GONE) {
                            dVarA.q(false);
                        }
                        dVarA.b(new c(bVar));
                        z9 = true;
                    } else if (J.L0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC1132qH + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            b0.d dVarA2 = bVar2.a();
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH2 = dVarA2.h();
            if (zIsEmpty) {
                if (!z9) {
                    dVarA2.b(new a(bVar2));
                } else if (J.L0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC1132qH2 + " as Animations cannot run alongside Animators.");
                }
            } else if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC1132qH2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C1121f this$0, b0.d operation) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        kotlin.jvm.internal.n.h(operation, "$operation");
        this$0.c(operation);
    }

    private final void H(List list, boolean z9, b0.d dVar, b0.d dVar2) {
        Object objB;
        ArrayList arrayList;
        V v9;
        p079h8.o oVarA;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((h) obj).b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((h) obj2).c() != null) {
                arrayList3.add(obj2);
            }
        }
        V v10 = null;
        for (h hVar : arrayList3) {
            V vC = hVar.c();
            if (v10 != null && vC != v10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            v10 = vC;
        }
        if (v10 == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C1021a c1021a = new C1021a();
        ArrayList<String> arrayList6 = new ArrayList<>();
        ArrayList<String> arrayList7 = new ArrayList<>();
        C1021a c1021a2 = new C1021a();
        C1021a c1021a3 = new C1021a();
        Iterator it = arrayList3.iterator();
        loop3: while (true) {
            objB = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop3;
                }
                h hVar2 = (h) it.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    objB = v10.B(v10.h(hVar2.e()));
                    arrayList7 = dVar2.h().getSharedElementSourceNames();
                    kotlin.jvm.internal.n.g(arrayList7, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames = dVar.h().getSharedElementSourceNames();
                    kotlin.jvm.internal.n.g(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = dVar.h().getSharedElementTargetNames();
                    kotlin.jvm.internal.n.g(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    arrayList = arrayList3;
                    int i10 = 0;
                    while (i10 < size) {
                        V v11 = v10;
                        int iIndexOf = arrayList7.indexOf(sharedElementTargetNames.get(i10));
                        int i11 = size;
                        if (iIndexOf != -1) {
                            arrayList7.set(iIndexOf, sharedElementSourceNames.get(i10));
                        }
                        i10++;
                        v10 = v11;
                        size = i11;
                    }
                    v9 = v10;
                    arrayList6 = dVar2.h().getSharedElementTargetNames();
                    kotlin.jvm.internal.n.g(arrayList6, "lastIn.fragment.sharedElementTargetNames");
                    if (z9) {
                        dVar.h().getEnterTransitionCallback();
                        dVar2.h().getExitTransitionCallback();
                        oVarA = p079h8.v.a(null, null);
                    } else {
                        dVar.h().getExitTransitionCallback();
                        dVar2.h().getEnterTransitionCallback();
                        oVarA = p079h8.v.a(null, null);
                    }
                    androidx.appcompat.app.o.a(oVarA.a());
                    androidx.appcompat.app.o.a(oVarA.b());
                    int i12 = 0;
                    for (int size2 = arrayList7.size(); i12 < size2; size2 = size2) {
                        String str = arrayList7.get(i12);
                        kotlin.jvm.internal.n.g(str, "exitingNames[i]");
                        String str2 = arrayList6.get(i12);
                        kotlin.jvm.internal.n.g(str2, "enteringNames[i]");
                        c1021a.put(str, str2);
                        i12++;
                    }
                    if (J.L0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator<String> it2 = arrayList6.iterator(); it2.hasNext(); it2 = it2) {
                            Log.v("FragmentManager", "Name: " + it2.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it3 = arrayList7.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + it3.next());
                        }
                    }
                    View view = dVar.h().mView;
                    kotlin.jvm.internal.n.g(view, "firstOut.fragment.mView");
                    I(c1021a2, view);
                    c1021a2.retainAll(arrayList7);
                    c1021a.retainAll(c1021a2.keySet());
                    View view2 = dVar2.h().mView;
                    kotlin.jvm.internal.n.g(view2, "lastIn.fragment.mView");
                    I(c1021a3, view2);
                    c1021a3.retainAll(arrayList6);
                    c1021a3.retainAll(c1021a.values());
                    T.c(c1021a, c1021a3);
                    Collection collectionKeySet = c1021a.keySet();
                    kotlin.jvm.internal.n.g(collectionKeySet, "sharedElementNameMapping.keys");
                    J(c1021a2, collectionKeySet);
                    Collection collectionValues = c1021a.values();
                    kotlin.jvm.internal.n.g(collectionValues, "sharedElementNameMapping.values");
                    J(c1021a3, collectionValues);
                    if (c1021a.isEmpty()) {
                        break;
                    }
                } else {
                    arrayList = arrayList3;
                    v9 = v10;
                }
                arrayList3 = arrayList;
                v10 = v9;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + objB + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            arrayList3 = arrayList;
            v10 = v9;
        }
        ArrayList arrayList8 = arrayList3;
        V v12 = v10;
        if (objB == null) {
            if (arrayList8.isEmpty()) {
                return;
            }
            Iterator it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                if (((h) it4.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList8, dVar, dVar2, v12, objB, arrayList4, arrayList5, c1021a, arrayList6, arrayList7, c1021a2, c1021a3, z9);
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            ((h) it5.next()).a().b(gVar);
        }
    }

    private final void I(Map map, View view) {
        String strC = androidx.core.view.H.C(view);
        if (strC != null) {
            map.put(strC, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    kotlin.jvm.internal.n.g(child, "child");
                    I(map, child);
                }
            }
        }
    }

    private final void J(C1021a c1021a, Collection collection) {
        Set<Map.Entry<Object, Object>> entries = c1021a.entrySet();
        kotlin.jvm.internal.n.g(entries, "entries");
        AbstractC1444s.H(entries, new i(collection));
    }

    private final void K(List list) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH = ((b0.d) AbstractC1444s.c0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0.d dVar = (b0.d) it.next();
            dVar.h().mAnimationInfo.f13217c = abstractComponentCallbacksC1132qH.mAnimationInfo.f13217c;
            dVar.h().mAnimationInfo.f13218d = abstractComponentCallbacksC1132qH.mAnimationInfo.f13218d;
            dVar.h().mAnimationInfo.f13219e = abstractComponentCallbacksC1132qH.mAnimationInfo.f13219e;
            dVar.h().mAnimationInfo.f13220f = abstractComponentCallbacksC1132qH.mAnimationInfo.f13220f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    @Override // androidx.fragment.app.b0
    public void d(List operations, boolean z9) {
        Object obj;
        Object next;
        kotlin.jvm.internal.n.h(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b0.d dVar = (b0.d) next;
            b0.d.b.a aVar = b0.d.b.f13096q;
            View view = dVar.h().mView;
            kotlin.jvm.internal.n.g(view, "operation.fragment.mView");
            b0.d.b bVarA = aVar.a(view);
            b0.d.b bVar = b0.d.b.VISIBLE;
            if (bVarA == bVar && dVar.g() != bVar) {
                break;
            }
        }
        b0.d dVar2 = (b0.d) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            b0.d dVar3 = (b0.d) objPrevious;
            b0.d.b.a aVar2 = b0.d.b.f13096q;
            View view2 = dVar3.h().mView;
            kotlin.jvm.internal.n.g(view2, "operation.fragment.mView");
            b0.d.b bVarA2 = aVar2.a(view2);
            b0.d.b bVar2 = b0.d.b.VISIBLE;
            if (bVarA2 != bVar2 && dVar3.g() == bVar2) {
                obj = objPrevious;
                break;
            }
        }
        b0.d dVar4 = (b0.d) obj;
        if (J.L0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar2 + " to " + dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final b0.d dVar5 = (b0.d) it2.next();
            arrayList.add(new b(dVar5, z9));
            boolean z10 = false;
            if (z9) {
                if (dVar5 == dVar2) {
                    z10 = true;
                }
            } else if (dVar5 == dVar4) {
                z10 = true;
            }
            arrayList2.add(new h(dVar5, z9, z10));
            dVar5.a(new Runnable() { // from class: androidx.fragment.app.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1121f.G(this.f13107q, dVar5);
                }
            });
        }
        H(arrayList2, z9, dVar2, dVar4);
        F(arrayList);
    }
}
