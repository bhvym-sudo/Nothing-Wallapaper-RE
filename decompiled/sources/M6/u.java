package M6;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteCallback;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.widget.RoundImageView;
import java.util.List;
import p044e3.K;
import p064g3.AbstractC1356a;
import p064g3.x;
import p064g3.z;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends M6.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final K f5083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f5084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f5085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f5086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p177r6.g f5087v;

    public static final class a implements J6.l.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(K k9, List list, u uVar) {
            k9.f19869C.a(list, k9.f19870v.getMeasuredWidth(), uVar.f5086u);
        }

        @Override // J6.l.a
        public void a(final List asserts) {
            kotlin.jvm.internal.n.h(asserts, "asserts");
            final K k9 = u.this.f5083r;
            final u uVar = u.this;
            k9.f19870v.post(new Runnable() { // from class: M6.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.c(k9, asserts, uVar);
                }
            });
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f5089q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p177r6.g f5090r;

        public b(View view, p177r6.g gVar) {
            this.f5089q = view;
            this.f5090r = gVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f5089q.removeOnAttachStateChangeListener(this);
            this.f5090r.c0();
            this.f5090r.r0(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(K binding, boolean z9, final p219v8.p listener) {
        kotlin.jvm.internal.n.h(binding, "binding");
        kotlin.jvm.internal.n.h(listener, "listener");
        View viewO = binding.o();
        kotlin.jvm.internal.n.g(viewO, "getRoot(...)");
        super(viewO);
        this.f5083r = binding;
        this.f5084s = z9;
        this.f5085t = this.itemView.getContext();
        this.f5086u = I.a().C().s();
        binding.f19874z.setOnClickListener(new View.OnClickListener() { // from class: M6.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.j(listener, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(p219v8.p pVar, u uVar, View view) {
        AbstractC1356a abstractC1356aE = uVar.e();
        kotlin.jvm.internal.n.e(view);
        pVar.invoke(abstractC1356aE, view);
    }

    private final void n(p064g3.k kVar, AbstractC1157q abstractC1157q, boolean z9) {
        ComponentName component = kVar.q().getComponent();
        kotlin.jvm.internal.n.g(component, "getComponent(...)");
        p177r6.g gVar = this.f5087v;
        RoundImageView imageWallpaperCurrent = this.f5083r.f19873y;
        kotlin.jvm.internal.n.g(imageWallpaperCurrent, "imageWallpaperCurrent");
        p177r6.g gVarU = u(this, component, gVar, imageWallpaperCurrent, z9, null, 16, null);
        p167q6.g.c(gVarU, 1, false, true, (RemoteCallback) N7.f.g(abstractC1157q, new p219v8.l() { // from class: M6.s
            @Override // p219v8.l
            public final Object f(Object obj) {
                return u.o(this.f5079q, (Bitmap) obj);
            }
        }).d());
        this.f5087v = gVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o(u uVar, Bitmap it) {
        kotlin.jvm.internal.n.h(it, "it");
        uVar.f5083r.f19873y.setImageBitmap(it);
        p177r6.g gVar = uVar.f5087v;
        if (gVar != null) {
            gVar.e0();
        }
        p177r6.g gVar2 = uVar.f5087v;
        if (gVar2 != null) {
            gVar2.d0();
        }
        uVar.f5087v = null;
        return A.f21846a;
    }

    private final void p(final boolean z9, final AbstractC1157q abstractC1157q) {
        H hA = I.a();
        Context context = this.f5085t;
        kotlin.jvm.internal.n.g(context, "context");
        hA.k(context).a(this.f5085t.getApplicationContext(), false, new InterfaceC1363c.a() { // from class: M6.q
            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                u.q(this.f5073a, z9, abstractC1157q, xVar, xVar2, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(u uVar, boolean z9, AbstractC1157q abstractC1157q, x xVar, x xVar2, int i10) {
        Context context = uVar.f5085t;
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            return;
        }
        if (z9 && xVar2 != null) {
            xVar = xVar2;
        }
        kotlin.jvm.internal.n.e(xVar);
        uVar.r(xVar, z9, abstractC1157q);
    }

    private final void r(final x xVar, final boolean z9, AbstractC1157q abstractC1157q) {
        if (!G6.e.i(xVar) || z9) {
            com.android.wallpaper.asset.a aVarO = xVar.o(this.f5085t);
            if (aVarO != null) {
                Context context = this.f5085t;
                aVarO.n(context, this.f5083r.f19873y, H3.r.a(context, R.attr.colorSecondary));
            }
        } else {
            kotlin.jvm.internal.n.f(xVar, "null cannot be cast to non-null type com.android.wallpaper.model.LiveWallpaperInfo");
            n((p064g3.k) xVar, abstractC1157q, z9);
        }
        this.f5083r.f19872x.setOnClickListener(new View.OnClickListener() { // from class: M6.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.s(this.f5076q, xVar, z9, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(u uVar, x xVar, boolean z9, View view) {
        Object context = uVar.f5083r.o().getContext();
        kotlin.jvm.internal.n.f(context, "null cannot be cast to non-null type com.android.wallpaper.model.WallpaperPreviewNavigator");
        ((z) context).H(xVar, !z9);
    }

    private final p177r6.g t(ComponentName componentName, p177r6.g gVar, View view, boolean z9, p219v8.a aVar) {
        View view2;
        View view3;
        int i10;
        if (gVar == null) {
            r6.g.a aVar2 = p177r6.g.f27541I;
            Context context = this.f5083r.o().getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            if (z9) {
                i10 = 2;
                view3 = view;
            } else {
                view3 = view;
                i10 = 1;
            }
            p177r6.g gVarA = aVar2.a(componentName, view3, context, i10, aVar);
            view2 = view3;
            gVar = gVarA;
        } else {
            view2 = view;
        }
        if (!view2.isAttachedToWindow()) {
            view2.addOnAttachStateChangeListener(new b(view2, gVar));
            return gVar;
        }
        gVar.c0();
        gVar.r0(true);
        return gVar;
    }

    static /* synthetic */ p177r6.g u(u uVar, ComponentName componentName, p177r6.g gVar, View view, boolean z9, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return uVar.t(componentName, gVar, view, z9, aVar);
    }

    public void m(AbstractC1356a category, InterfaceC1163x interfaceC1163x) {
        kotlin.jvm.internal.n.h(category, "category");
        super.d(category);
        if (category instanceof J6.l) {
            Context applicationContext = this.f5085t.getApplicationContext();
            kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
            ((J6.l) category).s(applicationContext, new a());
            if (this.f5086u) {
                if (interfaceC1163x != null) {
                    p(this.f5084s, interfaceC1163x.getLifecycle());
                }
                this.f5083r.f19872x.setVisibility(0);
                this.f5083r.f19867A.setVisibility(0);
                this.f5083r.f19868B.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.f5083r.f19869C.getLayoutParams();
                kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.LayoutParams) layoutParams).endToEnd = 0;
                return;
            }
            this.f5083r.f19872x.setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = this.f5083r.f19874z.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginEnd());
            ViewGroup.LayoutParams layoutParams3 = this.f5083r.f19869C.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(com.android.launcher3.w.b(16.0f));
            this.f5083r.f19867A.setVisibility(8);
            this.f5083r.f19868B.setVisibility(0);
        }
    }
}
