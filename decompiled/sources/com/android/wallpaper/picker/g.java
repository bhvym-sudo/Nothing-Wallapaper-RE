package com.android.wallpaper.picker;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import F8.L;
import H3.AbstractC0854d;
import I8.AbstractC0882h;
import I8.O;
import M6.v;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.T;
import androidx.core.view.W;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1155o;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.wallpaper.picker.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.db.WallpaperDatabase;
import com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity;
import com.nothing.wallpaper.picker.individual.IndividualPickerFrame;
import com.nothing.wallpaper.widget.RoundCoordinatorLayout;
import com.nothing.wallpaper.widget.VerticallyRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import p010b.u;
import p044e3.AbstractC1323f0;
import p064g3.AbstractC1356a;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.android.wallpaper.picker.b {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a f15991T = new a(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final PathInterpolator f15992U = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private AbstractC1323f0 f15993G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ArrayList f15994H = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final PreviewActivity.a f15995I = new PreviewActivity.a();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p079h8.h f15996J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p079h8.h f15997K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Set f15998L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Dialog f15999M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f16000N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final S7.c f16001O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p079h8.h f16002P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p079h8.h f16003Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final f f16004R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final h f16005S;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f16006q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f16007r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ g f16008s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f16009q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f16010r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ List f16011s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, List list, p129m8.e eVar) {
                super(2, eVar);
                this.f16010r = gVar;
                this.f16011s = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void u(g gVar) {
                gVar.Q1(true);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f16010r, this.f16011s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f16009q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC1323f0 abstractC1323f0 = this.f16010r.f15993G;
                if (abstractC1323f0 != null) {
                    List list = this.f16011s;
                    final g gVar = this.f16010r;
                    AbstractC1356a category = abstractC1323f0.f19961A.getCategory();
                    if (category instanceof J6.h) {
                        ((J6.h) category).v(list);
                        abstractC1323f0.f19961A.l();
                        abstractC1323f0.f19961A.post(new Runnable() { // from class: com.android.wallpaper.picker.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.b.a.u(gVar);
                            }
                        });
                    }
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, g gVar, p129m8.e eVar) {
            super(2, eVar);
            this.f16007r = list;
            this.f16008s = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f16007r, this.f16008s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j9;
            String strC;
            Object objE = p139n8.b.e();
            int i10 = this.f16006q;
            if (i10 == 0) {
                r.b(obj);
                List list = this.f16007r;
                g gVar = this.f16008s;
                ArrayList<x> arrayList = new ArrayList();
                int i11 = 0;
                for (Object obj2 : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC1444s.t();
                    }
                    x xVar = (x) obj2;
                    boolean z9 = (xVar instanceof J6.i) && ((J6.i) xVar).z();
                    if (z9 && i11 <= 6) {
                        gVar.f16000N = true;
                    }
                    if (z9) {
                        arrayList.add(obj2);
                    }
                    i11 = i12;
                }
                g gVar2 = this.f16008s;
                for (x xVar2 : arrayList) {
                    try {
                        String strR = xVar2.r();
                        kotlin.jvm.internal.n.g(strR, "getWallpaperId(...)");
                        j9 = Long.parseLong(strR);
                    } catch (Exception unused) {
                        j9 = -1;
                    }
                    WallpaperDatabase.a aVar = WallpaperDatabase.f18441p;
                    Context contextRequireContext = gVar2.requireContext();
                    kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
                    int iC = aVar.b(contextRequireContext).D().c(j9, "");
                    if ((xVar2 instanceof J6.i) && (strC = ((J6.i) xVar2).c(null)) != null) {
                        U6.e.f7982c.b().d(strC);
                    }
                    com.nothing.wallpaper.common.log.c.d("NTCategorySelectorFragment", "deleteWallpapers id:" + j9 + " " + iC);
                }
                H0 h0C = C0803b0.c();
                a aVar2 = new a(this.f16008s, arrayList, null);
                this.f16006q = 1;
                if (AbstractC0812g.g(h0C, aVar2, this) == objE) {
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

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f16012q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f16014q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f16015r;

            /* JADX INFO: renamed from: com.android.wallpaper.picker.g$c$a$a, reason: collision with other inner class name */
            static final class C0450a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f16016q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f16017r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ g f16018s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0450a(g gVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f16018s = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    C0450a c0450a = new C0450a(this.f16018s, eVar);
                    c0450a.f16017r = obj;
                    return c0450a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f16016q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    O7.a.b bVar = (O7.a.b) this.f16017r;
                    AbstractC1323f0 abstractC1323f0 = this.f16018s.f15993G;
                    if (abstractC1323f0 != null) {
                        g gVar = this.f16018s;
                        if (bVar instanceof O7.a.b.C0196a) {
                            IndividualPickerFrame individualGrid = abstractC1323f0.f19961A;
                            kotlin.jvm.internal.n.g(individualGrid, "individualGrid");
                            individualGrid.setVisibility(8);
                            VerticallyRecyclerView categoryList = abstractC1323f0.f19966x;
                            kotlin.jvm.internal.n.g(categoryList, "categoryList");
                            categoryList.setVisibility(0);
                            abstractC1323f0.f19967y.setText(R.string.nt_wallpaper_gallery);
                            abstractC1323f0.f19961A.f();
                            gVar.M1();
                            abstractC1323f0.f19964v.setLiftOnScrollTargetView(abstractC1323f0.f19966x);
                        } else {
                            if (!(bVar instanceof O7.a.b.C0198b)) {
                                throw new p079h8.m();
                            }
                            AbstractC1356a abstractC1356aS1 = gVar.s1(((O7.a.b.C0198b) bVar).a());
                            if (abstractC1356aS1 instanceof p064g3.r) {
                                gVar.T1((p064g3.r) abstractC1356aS1);
                            }
                        }
                    }
                    return A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(O7.a.b bVar, p129m8.e eVar) {
                    return ((C0450a) create(bVar, eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, p129m8.e eVar) {
                super(2, eVar);
                this.f16015r = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f16015r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f16014q;
                if (i10 == 0) {
                    r.b(obj);
                    O oG = this.f16015r.w1().g();
                    C0450a c0450a = new C0450a(this.f16015r, null);
                    this.f16014q = 1;
                    if (AbstractC0882h.i(oG, c0450a, this) == objE) {
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

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f16012q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x viewLifecycleOwner = g.this.getViewLifecycleOwner();
                kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(g.this, null);
                this.f16012q = 1;
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

    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1323f0 f16019a;

        d(AbstractC1323f0 abstractC1323f0) {
            this.f16019a = abstractC1323f0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
            this.f16019a.f19964v.A(recyclerView.canScrollVertically(-1));
        }
    }

    public static final class e extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1323f0 f16020a;

        e(AbstractC1323f0 abstractC1323f0) {
            this.f16020a = abstractC1323f0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
            this.f16020a.f19964v.A(recyclerView.canScrollVertically(-1));
        }
    }

    public static final class f extends u {
        f() {
            super(false);
        }

        @Override // p010b.u
        public void d() {
            if (g.this.w1().g().getValue() instanceof O7.a.b.C0196a) {
                g.this.requireActivity().o0().c1();
            } else {
                g.this.l1();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.wallpaper.picker.g$g, reason: collision with other inner class name */
    public static final class C0451g implements com.android.wallpaper.picker.f.b {
        C0451g() {
        }

        @Override // com.android.wallpaper.picker.f.b
        public void b(boolean z9) {
            if (z9) {
                g.this.L0();
            }
        }

        @Override // com.android.wallpaper.picker.f.b
        public void c() {
            g.this.J0();
        }
    }

    public static final class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            FrameLayout frameLayout;
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(intent, "intent");
            com.nothing.wallpaper.common.log.c.d("NTCategorySelectorFragment", "onReceive set wallpaper broadcast");
            AbstractC1323f0 abstractC1323f0 = g.this.f15993G;
            if (abstractC1323f0 == null || (frameLayout = abstractC1323f0.f19968z) == null) {
                return;
            }
            frameLayout.setVisibility(4);
        }
    }

    public static final class i extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f16024r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f16024r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f16024r.requireActivity().getViewModelStore();
        }
    }

    public static final class j extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f16025r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f16026s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f16025r = aVar;
            this.f16026s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f16025r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f16026s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class k extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f16027r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f16027r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f16027r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class l extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f16028r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f16028r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractComponentCallbacksC1132q invoke() {
            return this.f16028r;
        }
    }

    public static final class m extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f16029r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(p219v8.a aVar) {
            super(0);
            this.f16029r = aVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke() {
            return (f0) this.f16029r.invoke();
        }
    }

    public static final class n extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p079h8.h f16030r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(p079h8.h hVar) {
            super(0);
            this.f16030r = hVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return X.c(this.f16030r).getViewModelStore();
        }
    }

    public static final class o extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f16031r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p079h8.h f16032s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(p219v8.a aVar, p079h8.h hVar) {
            super(0);
            this.f16031r = aVar;
            this.f16032s = hVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f16031r;
            if (aVar2 != null && (aVar = (Z0.a) aVar2.invoke()) != null) {
                return aVar;
            }
            f0 f0VarC = X.c(this.f16032s);
            InterfaceC1155o interfaceC1155o = f0VarC instanceof InterfaceC1155o ? (InterfaceC1155o) f0VarC : null;
            return interfaceC1155o != null ? interfaceC1155o.getDefaultViewModelCreationExtras() : Z0.a.C0345a.f9384b;
        }
    }

    public static final class p extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f16033r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p079h8.h f16034s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, p079h8.h hVar) {
            super(0);
            this.f16033r = abstractComponentCallbacksC1132q;
            this.f16034s = hVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            d0.c defaultViewModelProviderFactory;
            f0 f0VarC = X.c(this.f16034s);
            InterfaceC1155o interfaceC1155o = f0VarC instanceof InterfaceC1155o ? (InterfaceC1155o) f0VarC : null;
            return (interfaceC1155o == null || (defaultViewModelProviderFactory = interfaceC1155o.getDefaultViewModelProviderFactory()) == null) ? this.f16033r.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public g() {
        p079h8.h hVarA = p079h8.i.a(p079h8.l.NONE, new m(new l(this)));
        this.f15996J = X.b(this, F.b(O7.a.class), new n(hVarA), new o(null, hVarA), new p(this, hVarA));
        this.f15997K = X.b(this, F.b(J7.b.class), new i(this), new j(null, this), new k(this));
        S7.c cVar = new S7.c(0, 1, null);
        cVar.n0(400L);
        cVar.p0(f15992U);
        cVar.L0(R.id.category_lib_parent);
        cVar.h(R.id.fragment_container);
        this.f16001O = cVar;
        this.f16002P = p079h8.i.b(new p219v8.a() { // from class: i3.V
            @Override // p219v8.a
            public final Object invoke() {
                return g.m1(this.f22019q);
            }
        });
        this.f16003Q = p079h8.i.b(new p219v8.a() { // from class: i3.W
            @Override // p219v8.a
            public final Object invoke() {
                return g.Z1(this.f22020q);
            }
        });
        this.f16004R = new f();
        this.f16005S = new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A1(g gVar, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_close /* 2131362538 */:
                gVar.requireActivity().o0().c1();
                return true;
            case R.id.menu_delete /* 2131362539 */:
                gVar.N1();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B1(g gVar, View view) {
        gVar.l1();
    }

    private final void C1() {
        final AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            z1();
            requireActivity().getWindow().setStatusBarColor(0);
            abstractC1323f0.f19966x.addItemDecoration(new v(getResources().getDimensionPixelOffset(R.dimen.nt_wallpaper_list_edge_space), 0, 2, null));
            abstractC1323f0.f19966x.setLayoutManager(new LinearLayoutManager(requireContext()));
            abstractC1323f0.f19966x.setAdapter(t1());
            abstractC1323f0.f19966x.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: i3.N
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return g.D1(this.f22009a, abstractC1323f0, view, windowInsets);
                }
            });
            abstractC1323f0.f19966x.addOnScrollListener(new d(abstractC1323f0));
            abstractC1323f0.f19961A.addOnScrollListener(new e(abstractC1323f0));
            M6.e eVarT1 = t1();
            RecyclerView.RecycledViewPool recycledViewPool = abstractC1323f0.f19966x.getRecycledViewPool();
            kotlin.jvm.internal.n.g(recycledViewPool, "getRecycledViewPool(...)");
            eVarT1.g(recycledViewPool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets D1(g gVar, AbstractC1323f0 abstractC1323f0, View v9, WindowInsets insets) {
        kotlin.jvm.internal.n.h(v9, "v");
        kotlin.jvm.internal.n.h(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        kotlin.jvm.internal.n.g(insets2, "getInsets(...)");
        Bundle arguments = gVar.getArguments();
        int i10 = arguments != null ? arguments.getInt("key_padding_top") : 0;
        if (i10 <= 0) {
            i10 = insets2.top;
        }
        RoundCoordinatorLayout categoryLibParent = abstractC1323f0.f19965w;
        kotlin.jvm.internal.n.g(categoryLibParent, "categoryLibParent");
        ViewGroup.LayoutParams layoutParams = categoryLibParent.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i10;
        categoryLibParent.setLayoutParams(marginLayoutParams);
        v9.setPadding(v9.getPaddingLeft(), v9.getPaddingTop(), v9.getPaddingRight(), insets2.bottom);
        return insets;
    }

    private final void E1() {
        int i10 = 0;
        int i11 = 0;
        for (Object obj : this.f15994H) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1444s.t();
            }
            if (((AbstractC1356a) obj) instanceof J6.h) {
                i10 = i11;
            }
            i11 = i12;
        }
        t1().notifyItemChanged(i10);
    }

    private final void F1(AbstractC1356a abstractC1356a) {
        H hA = I.a();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        hA.q(abstractActivityC1136vRequireActivity).a(abstractC1356a.b());
        if (!abstractC1356a.l()) {
            if (abstractC1356a instanceof J6.h) {
                S1();
            }
        } else {
            H hA2 = I.a();
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
            hA2.n(contextRequireContext);
            H0().a(new C0451g());
        }
    }

    private final void G1(x xVar, View view) {
        if (requireActivity().isFinishing()) {
            com.nothing.wallpaper.common.log.c.o("NTCategorySelectorFragment", "onClickWallpaper on finishing Activity");
            return;
        }
        H hA = I.a();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        hA.q(abstractActivityC1136vRequireActivity).j(xVar.g(requireActivity()));
        R1(xVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A H1(final AbstractC1323f0 abstractC1323f0) {
        abstractC1323f0.f19962B.post(new Runnable() { // from class: i3.O
            @Override // java.lang.Runnable
            public final void run() {
                g.I1(abstractC1323f0);
            }
        });
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(AbstractC1323f0 abstractC1323f0) {
        abstractC1323f0.f19962B.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A J1(AbstractC1323f0 abstractC1323f0, float f10) {
        abstractC1323f0.f19962B.setAlpha(f10);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A K1(AbstractC1323f0 abstractC1323f0, float f10) {
        abstractC1323f0.f19962B.setAlpha(1.0f - f10);
        return A.f21846a;
    }

    private final void L1(boolean z9) {
        Toolbar toolbar;
        this.f16004R.j(z9);
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 == null || (toolbar = abstractC1323f0.f19963C) == null) {
            return;
        }
        if (!z9) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        toolbar.setNavigationIcon(2131231193);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setAutoMirrored(true);
        }
        Drawable navigationIcon2 = toolbar.getNavigationIcon();
        if (navigationIcon2 != null) {
            navigationIcon2.setTint(H3.r.a(requireContext(), android.R.attr.textColorPrimary));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1() {
        Toolbar toolbar;
        this.f16004R.j(true);
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 == null || (toolbar = abstractC1323f0.f19963C) == null) {
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    private final void N1() {
        List listL;
        IndividualPickerFrame individualPickerFrame;
        List<x> wallpaperList;
        Dialog dialog = this.f15999M;
        if (dialog == null || !dialog.isShowing()) {
            AbstractC1323f0 abstractC1323f0 = this.f15993G;
            if (abstractC1323f0 == null || (individualPickerFrame = abstractC1323f0.f19961A) == null || (wallpaperList = individualPickerFrame.getWallpaperList()) == null) {
                listL = AbstractC1444s.l();
            } else {
                listL = new ArrayList();
                for (Object obj : wallpaperList) {
                    x xVar = (x) obj;
                    if ((xVar instanceof J6.i) && ((J6.i) xVar).z()) {
                        listL.add(obj);
                    }
                }
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle(R.string.nt_delete_confirm_title).setMessage(listL.size() > 1 ? R.string.nt_delete_confirm_content : R.string.nt_delete_confirm_content_2).setPositiveButton(R.string.delete_live_wallpaper, new DialogInterface.OnClickListener() { // from class: i3.Y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    g.O1(this.f22023q, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.nt_cancel, new DialogInterface.OnClickListener() { // from class: i3.Z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    g.P1(this.f22024q, dialogInterface, i10);
                }
            }).create();
            this.f15999M = alertDialogCreate;
            if (alertDialogCreate != null) {
                alertDialogCreate.setCancelable(true);
            }
            Dialog dialog2 = this.f15999M;
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(true);
            }
            Dialog dialog3 = this.f15999M;
            if (dialog3 != null) {
                dialog3.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(g gVar, DialogInterface dialogInterface, int i10) {
        gVar.q1();
        Dialog dialog = gVar.f15999M;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(g gVar, DialogInterface dialogInterface, int i10) {
        Dialog dialog = gVar.f15999M;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(boolean z9) {
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            if (z9) {
                abstractC1323f0.f19963C.getMenu().findItem(R.id.menu_close).setVisible(true);
                abstractC1323f0.f19963C.getMenu().findItem(R.id.menu_delete).setVisible(false);
            } else {
                abstractC1323f0.f19963C.getMenu().findItem(R.id.menu_close).setVisible(false);
                abstractC1323f0.f19963C.getMenu().findItem(R.id.menu_delete).setVisible(true);
            }
        }
    }

    private final void R1(x xVar, View view) {
        H hA = I.a();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        hA.A(abstractActivityC1136vRequireActivity).e(xVar);
        xVar.x(requireActivity(), this.f15995I, xVar instanceof p064g3.k ? 4 : 1, true);
    }

    private final void S1() {
        CreativeWallpaperActivity.a aVar = CreativeWallpaperActivity.f18470T;
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        aVar.c(abstractActivityC1136vRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(p064g3.r rVar) {
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            IndividualPickerFrame individualPickerFrame = abstractC1323f0.f19961A;
            Set set = this.f15998L;
            if (set == null) {
                kotlin.jvm.internal.n.r("appliedWallpaperIds");
                set = null;
            }
            individualPickerFrame.k(rVar, set, w1().h(), new q() { // from class: i3.a0
                @Override // p219v8.q
                public final Object e(Object obj, Object obj2, Object obj3) {
                    return g.U1(this.f22026q, (x) obj, (View) obj2, ((Boolean) obj3).booleanValue());
                }
            });
            abstractC1323f0.f19967y.setText(rVar.h());
            IndividualPickerFrame individualGrid = abstractC1323f0.f19961A;
            kotlin.jvm.internal.n.g(individualGrid, "individualGrid");
            individualGrid.setVisibility(0);
            VerticallyRecyclerView categoryList = abstractC1323f0.f19966x;
            kotlin.jvm.internal.n.g(categoryList, "categoryList");
            categoryList.setVisibility(8);
            L1(true);
            abstractC1323f0.f19964v.setLiftOnScrollTargetView(abstractC1323f0.f19961A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A U1(g gVar, x xVar, View view, boolean z9) {
        kotlin.jvm.internal.n.h(view, "view");
        if (z9) {
            gVar.p1();
        } else if (xVar != null) {
            gVar.G1(xVar, view);
        }
        return A.f21846a;
    }

    private final void V1(boolean z9) {
        S7.e eVar = new S7.e(0, z9);
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            eVar.i(abstractC1323f0.f19966x);
            eVar.i(abstractC1323f0.f19961A);
            androidx.transition.u.a(abstractC1323f0.f19965w, eVar);
        }
    }

    private final void W1(int i10) {
        J jO0;
        List listX0;
        AbstractActivityC1136v activity = getActivity();
        if (activity == null || (jO0 = activity.o0()) == null || (listX0 = jO0.x0()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listX0) {
            if (obj instanceof p068g7.k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = ((p068g7.k) it.next()).getView();
            if (view != null) {
                view.setImportantForAccessibility(i10);
            }
            arrayList2.add(A.f21846a);
        }
    }

    private final void X1() {
        final int i10 = 0;
        for (Object obj : this.f15994H) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            AbstractC1356a abstractC1356a = (AbstractC1356a) obj;
            if (abstractC1356a instanceof J6.h) {
                J6.h.a aVar = J6.h.f3588i;
                if (aVar.a()) {
                    aVar.b(false);
                    Context context = getContext();
                    if (context != null) {
                        ((J6.h) abstractC1356a).o(context, new p064g3.A() { // from class: i3.X
                            @Override // p064g3.A
                            public final void a(List list) {
                                g.Y1(this.f22021a, i10, list);
                            }
                        }, true);
                    }
                }
            }
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y1(g gVar, int i10, List list) {
        gVar.t1().notifyItemChanged(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W Z1(g gVar) {
        Window window = gVar.requireActivity().getWindow();
        return T.a(window, window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l1() {
        IndividualPickerFrame individualPickerFrame;
        if (!w1().i()) {
            return false;
        }
        Q1(true);
        V1(false);
        if (this.f16000N) {
            E1();
            this.f16000N = false;
        }
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null && (individualPickerFrame = abstractC1323f0.f19961A) != null) {
            individualPickerFrame.m();
        }
        w1().j(null);
        w1().f();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M6.e m1(final g gVar) {
        Bundle arguments = gVar.getArguments();
        boolean z9 = arguments != null ? arguments.getBoolean("key_is_lock_screen") : true;
        ArrayList arrayList = gVar.f15994H;
        Set set = gVar.f15998L;
        if (set == null) {
            kotlin.jvm.internal.n.r("appliedWallpaperIds");
            set = null;
        }
        return new M6.e(arrayList, set, z9, new p219v8.p() { // from class: i3.b0
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return g.n1(this.f22028q, obj, (View) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A n1(final g gVar, final Object obj, final View view) {
        kotlin.jvm.internal.n.h(view, "view");
        p087i6.b.a(new p219v8.a() { // from class: i3.P
            @Override // p219v8.a
            public final Object invoke() {
                return g.o1(obj, gVar, view);
            }
        });
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o1(Object obj, g gVar, View view) {
        if (obj instanceof AbstractC1356a) {
            gVar.F1((AbstractC1356a) obj);
        } else if (obj instanceof J6.m) {
            Object tag = view.getTag();
            AbstractC1356a abstractC1356a = tag instanceof AbstractC1356a ? (AbstractC1356a) tag : null;
            if (abstractC1356a != null) {
                if (((J6.m) obj).z() == 1) {
                    gVar.V1(true);
                    O7.a aVarW1 = gVar.w1();
                    String strB = abstractC1356a.b();
                    kotlin.jvm.internal.n.g(strB, "getCollectionId(...)");
                    aVarW1.k(strB);
                } else {
                    gVar.S1();
                }
            }
        } else if (obj instanceof x) {
            gVar.G1((x) obj, view);
        }
        return A.f21846a;
    }

    private final void p1() {
        boolean z9;
        Object next;
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            Iterator<T> it = abstractC1323f0.f19961A.getWallpaperList().iterator();
            while (true) {
                z9 = true;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                x xVar = (x) next;
                if ((xVar instanceof J6.i) && ((J6.i) xVar).z()) {
                    break;
                }
            }
            if (((x) next) != null && !abstractC1323f0.f19961A.getWallpaperList().isEmpty()) {
                z9 = false;
            }
            Q1(z9);
        }
    }

    private final void q1() {
        IndividualPickerFrame individualPickerFrame;
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        List<x> wallpaperList = (abstractC1323f0 == null || (individualPickerFrame = abstractC1323f0.f19961A) == null) ? null : individualPickerFrame.getWallpaperList();
        List<x> list = wallpaperList;
        if (list == null || list.isEmpty()) {
            return;
        }
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), C0803b0.b(), null, new b(wallpaperList, this, null), 2, null);
    }

    private final Set r1() {
        String strI;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(requireContext().getApplicationContext());
        H hA = I.a();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        p074h3.W wF = hA.f(contextRequireContext);
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        ArraySet arraySet = new ArraySet();
        if (wallpaperInfo == null) {
            strI = wF.i();
        } else if (G6.e.h(wallpaperInfo)) {
            strI = wF.J();
            if (strI == null) {
                strI = "";
            }
        } else {
            strI = wallpaperInfo.getServiceName();
        }
        if (strI != null && strI.length() != 0) {
            arraySet.add(strI);
        }
        boolean z9 = wallpaperManager.getWallpaperId(2) >= 0;
        String strW = wF.W();
        if (z9 && strW != null && strW.length() != 0) {
            arraySet.add(strW);
        }
        return arraySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC1356a s1(String str) {
        Object next;
        Iterator it = this.f15994H.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.n.d(((AbstractC1356a) next).b(), str)) {
                return (AbstractC1356a) next;
            }
        }
        next = null;
        return (AbstractC1356a) next;
    }

    private final M6.e t1() {
        return (M6.e) this.f16002P.getValue();
    }

    private final List u1(AbstractC1356a abstractC1356a) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : this.f15994H) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            if (kotlin.jvm.internal.n.d(abstractC1356a.b(), ((AbstractC1356a) obj).b())) {
                arrayList.add(Integer.valueOf(i10));
            }
            i10 = i11;
        }
        return arrayList;
    }

    private final J7.b v1() {
        return (J7.b) this.f15997K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.a w1() {
        return (O7.a) this.f15996J.getValue();
    }

    private final W x1() {
        return (W) this.f16003Q.getValue();
    }

    private final void y1() {
        if (!AbstractC0854d.b(requireActivity().getIntent())) {
            H0().u();
        }
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new c(null), 3, null);
    }

    private final void z1() {
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            abstractC1323f0.f19967y.setText(R.string.nt_wallpaper_gallery);
            abstractC1323f0.f19963C.y(R.menu.nt_wallpaper_list_menu);
            List listH = w1().h();
            Q1(listH == null || listH.isEmpty());
            abstractC1323f0.f19963C.setOnMenuItemClickListener(new Toolbar.h() { // from class: i3.Q
                @Override // androidx.appcompat.widget.Toolbar.h
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return g.A1(this.f22015a, menuItem);
                }
            });
            abstractC1323f0.f19963C.setNavigationOnClickListener(new View.OnClickListener() { // from class: i3.S
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.B1(this.f22016q, view);
                }
            });
        }
    }

    @Override // com.android.wallpaper.picker.b
    protected void E0(AbstractC1356a category, boolean z9) {
        kotlin.jvm.internal.n.h(category, "category");
        com.nothing.wallpaper.common.log.c.k("NTCategorySelectorFragment", "addCategory:" + category);
        if (this.f15994H.indexOf(category) >= 0) {
            N0(category);
            return;
        }
        int iE = category.e();
        int i10 = 0;
        while (i10 < this.f15994H.size() && iE >= ((AbstractC1356a) this.f15994H.get(i10)).e()) {
            i10++;
        }
        this.f15994H.add(i10, category);
        t1().notifyItemChanged(i10);
        if ((w1().g().getValue() instanceof O7.a.b.C0198b) && (category instanceof p064g3.r)) {
            Object value = w1().g().getValue();
            kotlin.jvm.internal.n.f(value, "null cannot be cast to non-null type com.nothing.wallpaper.picker.viewmodels.CategorySelectorViewModel.Page.IndividualPage");
            p064g3.r rVar = (p064g3.r) category;
            if (kotlin.jvm.internal.n.d(((O7.a.b.C0198b) value).a(), rVar.b())) {
                T1(rVar);
            }
        }
    }

    @Override // com.android.wallpaper.picker.b
    protected void F0() {
        this.f15994H.clear();
        t1().notifyDataSetChanged();
    }

    @Override // com.android.wallpaper.picker.b
    protected void G0() {
    }

    @Override // com.android.wallpaper.picker.b
    protected void J0() {
        t1().notifyDataSetChanged();
    }

    @Override // com.android.wallpaper.picker.b
    protected void K0(AbstractC1356a category) {
        kotlin.jvm.internal.n.h(category, "category");
        com.nothing.wallpaper.common.log.c.k("NTCategorySelectorFragment", "removeCategory:" + category);
        int iIndexOf = this.f15994H.indexOf(category);
        if (iIndexOf >= 0) {
            this.f15994H.remove(iIndexOf);
            t1().notifyItemChanged(iIndexOf);
        }
    }

    @Override // com.android.wallpaper.picker.b
    protected void N0(AbstractC1356a category) {
        kotlin.jvm.internal.n.h(category, "category");
        Iterator it = u1(category).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            this.f15994H.remove(iIntValue);
            this.f15994H.add(iIntValue, category);
            t1().notifyItemChanged(iIntValue);
        }
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onAttach(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        super.onAttach(context);
        v1().x(true);
        x1().d(false);
        W1(4);
    }

    @Override // com.android.wallpaper.picker.b, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setEnterTransition(this.f16001O);
        setReturnTransition(this.f16001O);
        this.f15998L = r1();
        p012b1.a.b(requireContext()).c(this.f16005S, new IntentFilter("nothing.action.wallpaper.SET_WALLPAPER"));
    }

    @Override // com.android.wallpaper.picker.b, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.n.h(inflater, "inflater");
        final AbstractC1323f0 abstractC1323f0C = AbstractC1323f0.C(inflater, viewGroup, false);
        this.f15993G = abstractC1323f0C;
        this.f16001O.I0(new p219v8.l() { // from class: i3.M
            @Override // p219v8.l
            public final Object f(Object obj) {
                return g.J1(abstractC1323f0C, ((Float) obj).floatValue());
            }
        });
        this.f16001O.K0(new p219v8.l() { // from class: i3.T
            @Override // p219v8.l
            public final Object f(Object obj) {
                return g.K1(abstractC1323f0C, ((Float) obj).floatValue());
            }
        });
        this.f16001O.J0(new p219v8.a() { // from class: i3.U
            @Override // p219v8.a
            public final Object invoke() {
                return g.H1(abstractC1323f0C);
            }
        });
        C1();
        View viewO = abstractC1323f0C.o();
        kotlin.jvm.internal.n.g(viewO, "let(...)");
        return viewO;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() {
        super.onDestroy();
        p012b1.a.b(requireContext()).e(this.f16005S);
    }

    @Override // com.android.wallpaper.picker.b, com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        t1().f(null);
        super.onDestroyView();
        Dialog dialog = this.f15999M;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f16001O.I0(null);
        this.f16001O.K0(null);
        this.f16001O.J0(null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDetach() {
        super.onDetach();
        v1().x(false);
        W wX1 = x1();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        wX1.d(!H6.a.b(contextRequireContext));
        W1(0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.h(outState, "outState");
        super.onSaveInstanceState(outState);
        Dialog dialog = this.f15999M;
        boolean z9 = false;
        if (dialog != null && dialog.isShowing()) {
            z9 = true;
        }
        outState.putBoolean("key_show_delete_dialog", z9);
        AbstractC1323f0 abstractC1323f0 = this.f15993G;
        if (abstractC1323f0 != null) {
            w1().j(abstractC1323f0.f19961A.getWallpaperList());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStart() {
        super.onStart();
        X1();
    }

    @Override // p084i3.C1395d, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.n.h(view, "view");
        super.onViewCreated(view, bundle);
        t1().f(getViewLifecycleOwner());
        Context context = getContext();
        kotlin.jvm.internal.n.f(context, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        p010b.v vVarF = ((p010b.j) context).f();
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        vVarF.h(viewLifecycleOwner, this.f16004R);
        y1();
        if (bundle == null || !bundle.getBoolean("key_show_delete_dialog")) {
            return;
        }
        N1();
    }
}
