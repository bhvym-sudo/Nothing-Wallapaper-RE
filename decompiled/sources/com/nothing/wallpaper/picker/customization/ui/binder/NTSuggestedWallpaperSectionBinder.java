package com.nothing.wallpaper.picker.customization.ui.binder;

import F8.AbstractC0816i;
import F8.L;
import H6.d;
import I8.AbstractC0882h;
import I8.O;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.recyclerview.widget.RecyclerView;
import com.android.wallpaper.picker.PreviewActivity;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.c;
import com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder;
import com.nothing.wallpaper.widget.MoreGuideView;
import com.nothing.wallpaper.widget.NTCarouselLayoutManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p064g3.k;
import p064g3.x;
import p074h3.I;
import p079h8.A;
import p079h8.r;
import p088i7.g;
import p129m8.e;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class NTSuggestedWallpaperSectionBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NTSuggestedWallpaperSectionBinder f18497a = new NTSuggestedWallpaperSectionBinder();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18498q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f18499r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ g f18500s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f18501t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1136v f18502u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ RecyclerView f18503v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ MoreGuideView f18504w;

        /* JADX INFO: renamed from: com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder$a$a, reason: collision with other inner class name */
        static final class C0486a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18505q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18506r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ g f18507s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Context f18508t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1136v f18509u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ RecyclerView f18510v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ MoreGuideView f18511w;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder$a$a$a, reason: collision with other inner class name */
            static final class C0487a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18512q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ g f18513r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ Context f18514s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ AbstractActivityC1136v f18515t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ RecyclerView f18516u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0487a(g gVar, Context context, AbstractActivityC1136v abstractActivityC1136v, RecyclerView recyclerView, e eVar) {
                    super(2, eVar);
                    this.f18513r = gVar;
                    this.f18514s = context;
                    this.f18515t = abstractActivityC1136v;
                    this.f18516u = recyclerView;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final A u(AbstractActivityC1136v abstractActivityC1136v, RecyclerView recyclerView, List list) {
                    NTSuggestedWallpaperSectionBinder.f18497a.f(abstractActivityC1136v, recyclerView, list);
                    return A.f21846a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0487a(this.f18513r, this.f18514s, this.f18515t, this.f18516u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0487a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f18512q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    g gVar = this.f18513r;
                    Context applicationContext = this.f18514s.getApplicationContext();
                    n.g(applicationContext, "getApplicationContext(...)");
                    final AbstractActivityC1136v abstractActivityC1136v = this.f18515t;
                    final RecyclerView recyclerView = this.f18516u;
                    gVar.h(applicationContext, new p219v8.l() { // from class: com.nothing.wallpaper.picker.customization.ui.binder.a
                        @Override // p219v8.l
                        public final Object f(Object obj2) {
                            return NTSuggestedWallpaperSectionBinder.a.C0486a.C0487a.u(abstractActivityC1136v, recyclerView, (List) obj2);
                        }
                    });
                    return A.f21846a;
                }
            }

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder$a$a$b */
            static final class b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18517q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ g f18518r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ MoreGuideView f18519s;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder$a$a$b$a, reason: collision with other inner class name */
                static final class C0488a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18520q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f18521r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ MoreGuideView f18522s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0488a(MoreGuideView moreGuideView, e eVar) {
                        super(2, eVar);
                        this.f18522s = moreGuideView;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final e create(Object obj, e eVar) {
                        C0488a c0488a = new C0488a(this.f18522s, eVar);
                        c0488a.f18521r = ((Boolean) obj).booleanValue();
                        return c0488a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18520q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        if (this.f18521r) {
                            this.f18522s.j();
                        } else {
                            this.f18522s.l();
                        }
                        return A.f21846a;
                    }

                    public final Object s(boolean z9, e eVar) {
                        return ((C0488a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(g gVar, MoreGuideView moreGuideView, e eVar) {
                    super(2, eVar);
                    this.f18518r = gVar;
                    this.f18519s = moreGuideView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new b(this.f18518r, this.f18519s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18517q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oF = this.f18518r.f();
                        C0488a c0488a = new C0488a(this.f18519s, null);
                        this.f18517q = 1;
                        if (AbstractC0882h.i(oF, c0488a, this) == objE) {
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
            C0486a(g gVar, Context context, AbstractActivityC1136v abstractActivityC1136v, RecyclerView recyclerView, MoreGuideView moreGuideView, e eVar) {
                super(2, eVar);
                this.f18507s = gVar;
                this.f18508t = context;
                this.f18509u = abstractActivityC1136v;
                this.f18510v = recyclerView;
                this.f18511w = moreGuideView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0486a c0486a = new C0486a(this.f18507s, this.f18508t, this.f18509u, this.f18510v, this.f18511w, eVar);
                c0486a.f18506r = obj;
                return c0486a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0486a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18505q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f18506r;
                AbstractC0816i.d(l9, null, null, new C0487a(this.f18507s, this.f18508t, this.f18509u, this.f18510v, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f18507s, this.f18511w, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, g gVar, Context context, AbstractActivityC1136v abstractActivityC1136v, RecyclerView recyclerView, MoreGuideView moreGuideView, e eVar) {
            super(2, eVar);
            this.f18499r = interfaceC1163x;
            this.f18500s = gVar;
            this.f18501t = context;
            this.f18502u = abstractActivityC1136v;
            this.f18503v = recyclerView;
            this.f18504w = moreGuideView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f18499r, this.f18500s, this.f18501t, this.f18502u, this.f18503v, this.f18504w, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f18498q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f18499r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0486a c0486a = new C0486a(this.f18500s, this.f18501t, this.f18502u, this.f18503v, this.f18504w, null);
                this.f18498q = 1;
                if (N.b(interfaceC1163x, bVar, c0486a, this) == objE) {
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

    private NTSuggestedWallpaperSectionBinder() {
    }

    public static final void d(AbstractActivityC1136v activity, Context context, View view, g viewModel, InterfaceC1163x lifecycleOwner, final p219v8.a onNavigateToFullWallpaperSelector) {
        n.h(activity, "activity");
        n.h(context, "context");
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(onNavigateToFullWallpaperSelector, "onNavigateToFullWallpaperSelector");
        View viewRequireViewById = view.requireViewById(R.id.layout_more_wallpapers);
        n.g(viewRequireViewById, "requireViewById(...)");
        MoreGuideView moreGuideView = (MoreGuideView) viewRequireViewById;
        d.f(moreGuideView);
        moreGuideView.setOnClickListener(new View.OnClickListener() { // from class: d7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NTSuggestedWallpaperSectionBinder.e(onNavigateToFullWallpaperSelector, view2);
            }
        });
        View viewRequireViewById2 = view.requireViewById(R.id.suggested_wallpaper);
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById2;
        recyclerView.setLayoutManager(new NTCarouselLayoutManager() { // from class: com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder$bind$suggestedWallpaperRV$1$1
            @Override // com.google.android.material.carousel.CarouselLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int computeHorizontalScrollExtent(RecyclerView.State state) {
                n.h(state, "state");
                try {
                    return super.computeHorizontalScrollExtent(state);
                } catch (Exception e10) {
                    c.f("NTSuggestedWallpaperSectionBinder", "computeHorizontalScrollExtent with exception " + e10.getMessage());
                    return 0;
                }
            }
        });
        n.g(viewRequireViewById2, "apply(...)");
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, context, activity, recyclerView, moreGuideView, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p219v8.a aVar, View view) {
        aVar.invoke();
        R7.d.f7114r.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(final AbstractActivityC1136v abstractActivityC1136v, RecyclerView recyclerView, List list) {
        recyclerView.setAdapter(new p028c7.b(list, new p219v8.l() { // from class: d7.o
            @Override // p219v8.l
            public final Object f(Object obj) {
                return NTSuggestedWallpaperSectionBinder.g(abstractActivityC1136v, (x) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(AbstractActivityC1136v abstractActivityC1136v, x it) {
        n.h(it, "it");
        f18497a.h(abstractActivityC1136v, it);
        return A.f21846a;
    }

    private final void h(AbstractActivityC1136v abstractActivityC1136v, x xVar) {
        I.a().A(abstractActivityC1136v).e(xVar);
        xVar.x(abstractActivityC1136v, new PreviewActivity.a(), xVar instanceof k ? 4 : 1, true);
    }
}
