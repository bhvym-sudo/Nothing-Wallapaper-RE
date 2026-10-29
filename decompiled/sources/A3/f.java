package A3;

import F8.AbstractC0816i;
import F8.InterfaceC0807d0;
import F8.InterfaceC0846x0;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;
import p219v8.q;
import p219v8.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f167a = new f();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f174b;

        public b(int i10, int i11) {
            this.f173a = i10;
            this.f174b = i11;
        }

        public final int a() {
            return this.f173a;
        }

        public final int b() {
            return this.f174b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f173a == bVar.f173a && this.f174b == bVar.f174b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f173a) * 31) + Integer.hashCode(this.f174b);
        }

        public String toString() {
            return "TintSpec(selectedColor=" + this.f173a + ", unselectedColor=" + this.f174b + ")";
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f175q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f176r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ B3.a f177s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ b f178t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f179u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ s f180v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ View f181w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ View f182x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ a f183y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ View f184z;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f185q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f186r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ B3.a f187s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ b f188t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ View f189u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ s f190v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ View f191w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ View f192x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ a f193y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ View f194z;

            /* JADX INFO: renamed from: A3.f$c$a$a, reason: collision with other inner class name */
            static final class C0007a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f195q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ B3.a f196r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ b f197s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ View f198t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ s f199u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ View f200v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ View f201w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ a f202x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                final /* synthetic */ View f203y;

                /* JADX INFO: renamed from: A3.f$c$a$a$a, reason: collision with other inner class name */
                static final class C0008a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ b f204q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ View f205r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ s f206s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ View f207t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    final /* synthetic */ View f208u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    final /* synthetic */ a f209v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    final /* synthetic */ E f210w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    final /* synthetic */ View f211x;

                    C0008a(b bVar, View view, s sVar, View view2, View view3, a aVar, E e10, View view4) {
                        this.f204q = bVar;
                        this.f205r = view;
                        this.f206s = sVar;
                        this.f207t = view2;
                        this.f208u = view3;
                        this.f209v = aVar;
                        this.f210w = e10;
                        this.f211x = view4;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        boolean z10;
                        b bVar = this.f204q;
                        if (bVar != null) {
                            View view = this.f205r;
                            if (view instanceof ImageView) {
                                if (z9) {
                                    ((ImageView) view).setColorFilter(bVar.a());
                                } else {
                                    ((ImageView) view).setColorFilter(bVar.b());
                                }
                            }
                        }
                        s sVar = this.f206s;
                        boolean z11 = false;
                        if (sVar != null) {
                            View view2 = this.f207t;
                            View view3 = this.f208u;
                            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(z9);
                            a aVar = this.f209v;
                            Object obj = this.f210w.f22779q;
                            if (obj != null && !n.d(obj, kotlin.coroutines.jvm.internal.b.a(z9))) {
                                z11 = true;
                            }
                            sVar.n(view2, view3, boolA, aVar, kotlin.coroutines.jvm.internal.b.a(z11));
                            z10 = z9;
                        } else {
                            f fVar = f.f167a;
                            Object obj2 = this.f210w.f22779q;
                            z10 = z9;
                            fVar.g(this.f207t, this.f208u, z10, this.f209v, (obj2 == null || n.d(obj2, kotlin.coroutines.jvm.internal.b.a(z9))) ? false : true);
                        }
                        this.f211x.setSelected(z10);
                        this.f210w.f22779q = kotlin.coroutines.jvm.internal.b.a(z10);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX INFO: renamed from: A3.f$c$a$a$b */
                public static final class b extends l implements q {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f212q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    private /* synthetic */ Object f213r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    /* synthetic */ Object f214s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ E f215t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    final /* synthetic */ B3.a f216u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(p129m8.e eVar, E e10, B3.a aVar) {
                        super(3, eVar);
                        this.f215t = e10;
                        this.f216u = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objE = p139n8.b.e();
                        int i10 = this.f212q;
                        if (i10 == 0) {
                            r.b(obj);
                            InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f213r;
                            this.f215t.f22779q = null;
                            O oG = this.f216u.g();
                            this.f212q = 1;
                            if (AbstractC0882h.t(interfaceC0881g, oG, this) == objE) {
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

                    @Override // p219v8.q
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
                        b bVar = new b(eVar, this.f215t, this.f216u);
                        bVar.f213r = interfaceC0881g;
                        bVar.f214s = obj;
                        return bVar.invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0007a(B3.a aVar, b bVar, View view, s sVar, View view2, View view3, a aVar2, View view4, p129m8.e eVar) {
                    super(2, eVar);
                    this.f196r = aVar;
                    this.f197s = bVar;
                    this.f198t = view;
                    this.f199u = sVar;
                    this.f200v = view2;
                    this.f201w = view3;
                    this.f202x = aVar2;
                    this.f203y = view4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0007a(this.f196r, this.f197s, this.f198t, this.f199u, this.f200v, this.f201w, this.f202x, this.f203y, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0007a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f195q;
                    if (i10 == 0) {
                        r.b(obj);
                        E e10 = new E();
                        InterfaceC0880f interfaceC0880fN = AbstractC0882h.N(this.f196r.a(), new b(null, e10, this.f196r));
                        C0008a c0008a = new C0008a(this.f197s, this.f198t, this.f199u, this.f200v, this.f201w, this.f202x, e10, this.f203y);
                        this.f195q = 1;
                        if (interfaceC0880fN.a(c0008a, this) == objE) {
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

            static final class b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f217q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ B3.a f218r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f219s;

                /* JADX INFO: renamed from: A3.f$c$a$b$a, reason: collision with other inner class name */
                static final class C0009a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f220q;

                    C0009a(View view) {
                        this.f220q = view;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void e(p219v8.a aVar, View view) {
                        aVar.invoke();
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object b(final p219v8.a aVar, p129m8.e eVar) {
                        this.f220q.setOnClickListener(aVar != null ? new View.OnClickListener() { // from class: A3.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                f.c.a.b.C0009a.e(aVar, view);
                            }
                        } : null);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(B3.a aVar, View view, p129m8.e eVar) {
                    super(2, eVar);
                    this.f218r = aVar;
                    this.f219s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f218r, this.f219s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f217q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fB = this.f218r.b();
                        C0009a c0009a = new C0009a(this.f219s);
                        this.f217q = 1;
                        if (interfaceC0880fB.a(c0009a, this) == objE) {
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
            a(B3.a aVar, b bVar, View view, s sVar, View view2, View view3, a aVar2, View view4, p129m8.e eVar) {
                super(2, eVar);
                this.f187s = aVar;
                this.f188t = bVar;
                this.f189u = view;
                this.f190v = sVar;
                this.f191w = view2;
                this.f192x = view3;
                this.f193y = aVar2;
                this.f194z = view4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f187s, this.f188t, this.f189u, this.f190v, this.f191w, this.f192x, this.f193y, this.f194z, eVar);
                aVar.f186r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f185q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f186r;
                AbstractC0816i.d(l9, null, null, new C0007a(this.f187s, this.f188t, this.f189u, this.f190v, this.f191w, this.f192x, this.f193y, this.f194z, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f187s, this.f194z, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1163x interfaceC1163x, B3.a aVar, b bVar, View view, s sVar, View view2, View view3, a aVar2, View view4, p129m8.e eVar) {
            super(2, eVar);
            this.f176r = interfaceC1163x;
            this.f177s = aVar;
            this.f178t = bVar;
            this.f179u = view;
            this.f180v = sVar;
            this.f181w = view2;
            this.f182x = view3;
            this.f183y = aVar2;
            this.f184z = view4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f176r, this.f177s, this.f178t, this.f179u, this.f180v, this.f181w, this.f182x, this.f183y, this.f184z, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f175q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f176r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f177s, this.f178t, this.f179u, this.f180v, this.f181w, this.f182x, this.f183y, this.f184z, null);
                this.f175q = 1;
                if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
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

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(final View view, final View view2, boolean z9, final a aVar, boolean z10) {
        if (!z9) {
            if (!z10) {
                view.setAlpha(0.0f);
                p(view2, 1.0f);
                return;
            }
            view.animate().alpha(0.0f).setDuration(aVar.d() / ((long) 2)).setInterpolator(new LinearInterpolator()).start();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            n.g(viewPropertyAnimatorAnimate, "animate(...)");
            o(viewPropertyAnimatorAnimate, 1.0f).setDuration(aVar.d()).setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f)).start();
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
            n.g(viewPropertyAnimatorAnimate2, "animate(...)");
            o(viewPropertyAnimatorAnimate2, 1.0f).setDuration(aVar.d()).setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f)).start();
            return;
        }
        if (!z10) {
            view.setAlpha(1.0f);
            p(view, 1.0f);
            p(view2, 0.86f);
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view.animate();
        n.g(viewPropertyAnimatorAnimate3, "animate(...)");
        long j9 = 2;
        o(viewPropertyAnimatorAnimate3, 1.099f).setDuration(aVar.d() / j9).setInterpolator(new PathInterpolator(0.29f, 0.0f, 0.67f, 1.0f)).withStartAction(new Runnable() { // from class: A3.c
            @Override // java.lang.Runnable
            public final void run() {
                f.h(view);
            }
        }).withEndAction(new Runnable() { // from class: A3.d
            @Override // java.lang.Runnable
            public final void run() {
                f.i(view, aVar);
            }
        }).start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate4 = view2.animate();
        n.g(viewPropertyAnimatorAnimate4, "animate(...)");
        o(viewPropertyAnimatorAnimate4, 0.9321f).setDuration(aVar.d() / j9).setInterpolator(new PathInterpolator(0.29f, 0.0f, 0.67f, 1.0f)).withEndAction(new Runnable() { // from class: A3.e
            @Override // java.lang.Runnable
            public final void run() {
                f.j(view2, aVar);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View view) {
        view.setScaleX(0.98f);
        view.setScaleY(0.98f);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View view, a aVar) {
        f fVar = f167a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        n.g(viewPropertyAnimatorAnimate, "animate(...)");
        fVar.o(viewPropertyAnimatorAnimate, 1.0f).setDuration(aVar.d() / ((long) 2)).setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.15f, 1.0f)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(View view, a aVar) {
        f fVar = f167a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        n.g(viewPropertyAnimatorAnimate, "animate(...)");
        fVar.o(viewPropertyAnimatorAnimate, 0.86f).setDuration(aVar.d() / ((long) 2)).setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.15f, 1.0f)).start();
    }

    public static /* synthetic */ InterfaceC0807d0 l(f fVar, View view, B3.a aVar, InterfaceC1163x interfaceC1163x, a aVar2, b bVar, s sVar, int i10, Object obj) {
        a aVar3;
        if ((i10 & 8) != 0) {
            aVar3 = new a(0.0f, 0.0f, 0.0f, 0.0f, 0L, 31, null);
        } else {
            aVar3 = aVar2;
        }
        return fVar.k(view, aVar, interfaceC1163x, aVar3, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(B3.a aVar, View view) {
        aVar.c().invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC0846x0 interfaceC0846x0) {
        InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
    }

    public final InterfaceC0807d0 k(View view, final B3.a viewModel, InterfaceC1163x lifecycleOwner, a animationSpec, b bVar, s sVar) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(animationSpec, "animationSpec");
        View viewRequireViewById = view.requireViewById(R.id.selection_border);
        n.g(viewRequireViewById, "requireViewById(...)");
        View viewRequireViewById2 = view.requireViewById(R.id.background);
        n.g(viewRequireViewById2, "requireViewById(...)");
        View viewRequireViewById3 = view.requireViewById(R.id.foreground);
        n.g(viewRequireViewById3, "requireViewById(...)");
        TextView textView = (TextView) view.findViewById(R.id.text);
        if (textView == null || !viewModel.h()) {
            p134n3.a.f23259a.a(viewRequireViewById3, viewModel.e());
        } else {
            p154p3.a.f23694a.a(textView, viewModel.e());
        }
        if (textView != null) {
            textView.setVisibility(viewModel.h() ? 0 : 8);
        }
        if (textView != null) {
            textView.setAlpha(viewModel.f() ? animationSpec.e() : animationSpec.c());
        }
        viewRequireViewById2.setAlpha(viewModel.f() ? animationSpec.e() : animationSpec.a());
        viewRequireViewById3.setAlpha(viewModel.f() ? animationSpec.e() : animationSpec.b());
        view.setOnLongClickListener(viewModel.c() != null ? new View.OnLongClickListener() { // from class: A3.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return f.m(viewModel, view2);
            }
        } : null);
        final InterfaceC0846x0 interfaceC0846x0D = AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new c(lifecycleOwner, viewModel, bVar, viewRequireViewById3, sVar, viewRequireViewById, viewRequireViewById2, animationSpec, view, null), 3, null);
        return new InterfaceC0807d0() { // from class: A3.b
            @Override // F8.InterfaceC0807d0
            public final void dispose() {
                f.n(interfaceC0846x0D);
            }
        };
    }

    public final ViewPropertyAnimator o(ViewPropertyAnimator viewPropertyAnimator, float f10) {
        n.h(viewPropertyAnimator, "<this>");
        ViewPropertyAnimator viewPropertyAnimatorScaleY = viewPropertyAnimator.scaleX(f10).scaleY(f10);
        n.g(viewPropertyAnimatorScaleY, "scaleY(...)");
        return viewPropertyAnimatorScaleY;
    }

    public final void p(View view, float f10) {
        n.h(view, "<this>");
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f172e;

        public a(float f10, float f11, float f12, float f13, long j9) {
            this.f168a = f10;
            this.f169b = f11;
            this.f170c = f12;
            this.f171d = f13;
            this.f172e = j9;
        }

        public final float a() {
            return this.f169b;
        }

        public final float b() {
            return this.f170c;
        }

        public final float c() {
            return this.f171d;
        }

        public final long d() {
            return this.f172e;
        }

        public final float e() {
            return this.f168a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f168a, aVar.f168a) == 0 && Float.compare(this.f169b, aVar.f169b) == 0 && Float.compare(this.f170c, aVar.f170c) == 0 && Float.compare(this.f171d, aVar.f171d) == 0 && this.f172e == aVar.f172e;
        }

        public int hashCode() {
            return (((((((Float.hashCode(this.f168a) * 31) + Float.hashCode(this.f169b)) * 31) + Float.hashCode(this.f170c)) * 31) + Float.hashCode(this.f171d)) * 31) + Long.hashCode(this.f172e);
        }

        public String toString() {
            return "AnimationSpec(enabledAlpha=" + this.f168a + ", disabledBackgroundAlpha=" + this.f169b + ", disabledForegroundAlpha=" + this.f170c + ", disabledTextAlpha=" + this.f171d + ", durationMs=" + this.f172e + ")";
        }

        public /* synthetic */ a(float f10, float f11, float f12, float f13, long j9, int i10, AbstractC1457h abstractC1457h) {
            this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.5f : f11, (i10 & 4) != 0 ? 0.5f : f12, (i10 & 8) != 0 ? 0.61f : f13, (i10 & 16) != 0 ? 333L : j9);
        }
    }
}
