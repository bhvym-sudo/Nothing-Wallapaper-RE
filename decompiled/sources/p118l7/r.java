package p118l7;

import F8.AbstractC0816i;
import F8.L;
import H3.D;
import H3.k;
import H3.s;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import com.nothing.wallpaper.picker.edit.crop.view.EditSubsamplingScaleImageView;
import com.nothing.wallpaper.widget.ToolActionsView;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p079h8.h;
import p079h8.u;
import p084i3.J0;
import p148o7.g;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends k {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Group f23035L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private View f23036M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ImageView f23037N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EditSubsamplingScaleImageView f23038O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Point f23039P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ValueAnimator f23041R;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final String f23033J = "CropImageFragment";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final String f23034K = "is_clean_screen";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final h f23040Q = X.b(this, F.b(g.class), new d(this), new e(null, this), new f(this));

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final a f23042S = new a();

    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationCancel(animation);
            r rVar = r.this;
            TextView textViewD0 = rVar.D0();
            rVar.F1(n.b(textViewD0 != null ? Float.valueOf(textViewD0.getAlpha()) : null, 1.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            r rVar = r.this;
            TextView textViewD0 = rVar.D0();
            rVar.F1(n.b(textViewD0 != null ? Float.valueOf(textViewD0.getAlpha()) : null, 1.0f));
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23044q;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23046q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f23047r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ r f23048s;

            /* JADX INFO: renamed from: l7.r$b$a$a, reason: collision with other inner class name */
            static final class C0589a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23049q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ r f23050r;

                /* JADX INFO: renamed from: l7.r$b$a$a$a, reason: collision with other inner class name */
                static final class C0590a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f23051q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f23052r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ r f23053s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0590a(r rVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f23053s = rVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0590a c0590a = new C0590a(this.f23053s, eVar);
                        c0590a.f23052r = obj;
                        return c0590a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f23051q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        u uVar = (u) this.f23052r;
                        this.f23053s.D1((ImageSource) uVar.d(), (Point) uVar.f());
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(u uVar, p129m8.e eVar) {
                        return ((C0590a) create(uVar, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0589a(r rVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23050r = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0589a(this.f23050r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0589a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23049q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fA0 = this.f23050r.G0().a0();
                        C0590a c0590a = new C0590a(this.f23050r, null);
                        this.f23049q = 1;
                        if (AbstractC0882h.i(interfaceC0880fA0, c0590a, this) == objE) {
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
            a(r rVar, p129m8.e eVar) {
                super(2, eVar);
                this.f23048s = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f23048s, eVar);
                aVar.f23047r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23046q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                AbstractC0816i.d((L) this.f23047r, null, null, new C0589a(this.f23048s, null), 3, null);
                return A.f21846a;
            }
        }

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return r.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f23044q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                r rVar = r.this;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(rVar, null);
                this.f23044q = 1;
                if (N.b(rVar, bVar, aVar, this) == objE) {
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

    public static final class c extends SubsamplingScaleImageView.DefaultOnStateChangedListener {
        c() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF newCenter, int i10) {
            n.h(newCenter, "newCenter");
            super.onCenterChanged(newCenter, i10);
            r.v1(r.this, true, false, 2, null);
            r.this.G0().j0(newCenter, null, "onCenterChanged");
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f10, int i10) {
            super.onScaleChanged(f10, i10);
            r.v1(r.this, true, false, 2, null);
            r.this.G0().j0(null, Float.valueOf(f10), "onScaleChanged");
        }
    }

    public static final class d extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f23055r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f23055r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f23055r.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f23056r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f23057s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f23056r = aVar;
            this.f23057s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f23056r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f23057s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class f extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f23058r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f23058r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f23058r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A A1(r rVar) {
        g.l0(rVar.G0(), false, 1, null);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A B1(r rVar, Float f10, PointF pointF) {
        rVar.G0().m0(f10, pointF);
        return A.f21846a;
    }

    private final void C1() {
        s sVarA = s.a();
        k kVarA0 = A0();
        Point pointE = sVarA.e(kVarA0 != null ? kVarA0.i() : null);
        float fN = D.n(getContext());
        int i10 = pointE.x;
        int i11 = pointE.y;
        k kVarA1 = A0();
        if (kVarA1 != null) {
            AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
            n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
            if (!kVarA1.n(abstractActivityC1136vRequireActivity)) {
                int i12 = pointE.x;
                i10 = (int) (i12 * (i10 / i12));
            }
        }
        int iCeil = (int) Math.ceil(i10 * fN);
        int iCeil2 = (int) Math.ceil(i11 * fN);
        D.o(getContext());
        EditSubsamplingScaleImageView editSubsamplingScaleImageView = this.f23038O;
        ViewGroup.LayoutParams layoutParams = editSubsamplingScaleImageView != null ? editSubsamplingScaleImageView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = iCeil;
        }
        if (layoutParams != null) {
            layoutParams.height = iCeil2;
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView2 = this.f23038O;
        if (editSubsamplingScaleImageView2 != null) {
            editSubsamplingScaleImageView2.setLayoutParams(layoutParams);
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView3 = this.f23038O;
        if (editSubsamplingScaleImageView3 != null) {
            editSubsamplingScaleImageView3.requestLayout();
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView4 = this.f23038O;
        if (editSubsamplingScaleImageView4 != null) {
            editSubsamplingScaleImageView4.measure(View.MeasureSpec.makeMeasureSpec(iCeil, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(iCeil2, BasicMeasure.EXACTLY));
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView5 = this.f23038O;
        if (editSubsamplingScaleImageView5 != null) {
            editSubsamplingScaleImageView5.layout(0, 0, iCeil, iCeil2);
        }
        G0().n0(new Point(iCeil, iCeil2), fN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(ImageSource imageSource, Point point) {
        this.f23039P = point;
        com.nothing.wallpaper.common.log.c.j("setFullResBitmap mRawWallpaperSize:" + point);
        EditSubsamplingScaleImageView editSubsamplingScaleImageView = this.f23038O;
        if (editSubsamplingScaleImageView != null) {
            editSubsamplingScaleImageView.setImage(imageSource);
        }
        G1(G0().V() instanceof com.android.wallpaper.asset.h);
        EditSubsamplingScaleImageView editSubsamplingScaleImageView2 = this.f23038O;
        if (editSubsamplingScaleImageView2 != null) {
            editSubsamplingScaleImageView2.setOnStateChangedListener(new c());
        }
    }

    private final void E1(p227w6.b bVar) {
        int iC0 = G0().c0();
        ImageView imageView = this.f23037N;
        if (imageView != null) {
            imageView.setBackgroundColor(iC0);
            com.nothing.wallpaper.common.log.c.j("setLowResImage placeHolderColor:" + iC0 + "  image:" + bVar);
            if (bVar instanceof w6.b.a) {
                ((w6.b.a) bVar).a().q(getActivity(), imageView, iC0, new J0(requireContext().getApplicationContext(), P0()));
            } else if (bVar instanceof p227w6.b.C0726b) {
                imageView.setImageDrawable(new ColorDrawable(iC0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(boolean z9) {
        int i10 = z9 ? 0 : 4;
        Group group = this.f23035L;
        if (group != null) {
            group.setVisibility(i10);
        }
        if (z9 && Q0()) {
            ImageButton imageButtonY0 = y0();
            if (imageButtonY0 != null) {
                imageButtonY0.setVisibility(0);
            }
            TextView textViewE0 = E0();
            if (textViewE0 != null) {
                textViewE0.setVisibility(0);
            }
            TextView textViewF0 = F0();
            if (textViewF0 != null) {
                textViewF0.setVisibility(0);
                return;
            }
            return;
        }
        ImageButton imageButtonY1 = y0();
        if (imageButtonY1 != null) {
            imageButtonY1.setVisibility(4);
        }
        TextView textViewE1 = E0();
        if (textViewE1 != null) {
            textViewE1.setVisibility(4);
        }
        TextView textViewF1 = F0();
        if (textViewF1 != null) {
            textViewF1.setVisibility(4);
        }
    }

    private final void G1(boolean z9) {
        k kVarA0;
        Point point = this.f23039P;
        if (point == null) {
            com.nothing.wallpaper.common.log.c.f(x1(), "setWallpaperZoomAndScroll but rawWallpaperSize is null.");
            return;
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView = this.f23038O;
        if (editSubsamplingScaleImageView != null) {
            int measuredWidth = editSubsamplingScaleImageView.getMeasuredWidth();
            EditSubsamplingScaleImageView editSubsamplingScaleImageView2 = this.f23038O;
            if (editSubsamplingScaleImageView2 != null) {
                Point point2 = new Point(measuredWidth, editSubsamplingScaleImageView2.getMeasuredHeight());
                Rect rectJ = D.j(point, point2);
                com.nothing.wallpaper.common.log.c.k(x1(), "setWallpaperZoomAndScroll screenSize:" + point2 + "  mRawWallpaperSize:" + point + "  visibleRawWallpaperRect:" + rectJ);
                if (z9 && (kVarA0 = A0()) != null) {
                    AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
                    n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
                    if (kVarA0.n(abstractActivityC1136vRequireActivity)) {
                        if (D.o(requireContext())) {
                            rectJ.offsetTo(point.x - rectJ.width(), rectJ.top);
                        } else {
                            rectJ.offsetTo(0, rectJ.top);
                        }
                    }
                }
                PointF pointF = new PointF(rectJ.centerX(), rectJ.centerY());
                float fI = D.i(new Point(rectJ.width(), rectJ.height()), point2);
                EditSubsamplingScaleImageView editSubsamplingScaleImageView3 = this.f23038O;
                if (editSubsamplingScaleImageView3 != null) {
                    editSubsamplingScaleImageView3.setMaxScale(B8.h.e(z0(), fI));
                }
                EditSubsamplingScaleImageView editSubsamplingScaleImageView4 = this.f23038O;
                if (editSubsamplingScaleImageView4 != null) {
                    editSubsamplingScaleImageView4.setMinScale(fI);
                }
                String strX1 = x1();
                EditSubsamplingScaleImageView editSubsamplingScaleImageView5 = this.f23038O;
                com.nothing.wallpaper.common.log.c.d(strX1, "setDefaultWallpaperZoomAndScroll, maxScale=" + (editSubsamplingScaleImageView5 != null ? Float.valueOf(editSubsamplingScaleImageView5.getMaxScale()) : null) + ",minScale=" + fI);
                ViewScope viewScopeW = G0().W();
                float scale = viewScopeW != null ? viewScopeW.getScale() : 1.0f;
                ViewScope viewScopeW2 = G0().W();
                PointF center = viewScopeW2 != null ? viewScopeW2.getCenter() : null;
                if (center != null) {
                    EditSubsamplingScaleImageView editSubsamplingScaleImageView6 = this.f23038O;
                    if (editSubsamplingScaleImageView6 != null) {
                        editSubsamplingScaleImageView6.setScaleAndCenter(scale, center);
                    }
                    com.nothing.wallpaper.common.log.c.d(x1(), "setScaleAndCenter, scale=" + scale + ", center=" + center);
                    return;
                }
                EditSubsamplingScaleImageView editSubsamplingScaleImageView7 = this.f23038O;
                if (editSubsamplingScaleImageView7 != null) {
                    editSubsamplingScaleImageView7.setScaleAndCenter(fI, pointF);
                }
                G0().j0(pointF, Float.valueOf(fI), "init");
                com.nothing.wallpaper.common.log.c.d(x1(), "setScaleAndCenter, default scale=" + fI + ",center=" + pointF);
            }
        }
    }

    private final void u1(boolean z9, boolean z10) {
        if (O0() == z9 || M0()) {
            return;
        }
        ValueAnimator valueAnimator = this.f23041R;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            float f10 = 0.0f;
            if (z10 && !z9) {
                ToolActionsView toolActionsViewC0 = C0();
                if ((toolActionsViewC0 != null ? toolActionsViewC0.getAlpha() : 0.0f) > 0.0f) {
                    return;
                }
            }
            if (z10 && z9) {
                ToolActionsView toolActionsViewC1 = C0();
                if ((toolActionsViewC1 != null ? toolActionsViewC1.getAlpha() : 0.0f) == 0.0f) {
                    return;
                }
            }
            X0(z9);
            float f11 = 1.0f;
            if (z9) {
                f10 = 1.0f;
                f11 = 0.0f;
            }
            ValueAnimator valueAnimator2 = this.f23041R;
            if (valueAnimator2 != null) {
                valueAnimator2.removeListener(this.f23042S);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
            this.f23041R = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(x0());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l7.n
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        r.w1(this.f23029a, valueAnimator3);
                    }
                });
                F1(true);
                valueAnimatorOfFloat.start();
            }
            ValueAnimator valueAnimator3 = this.f23041R;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(this.f23042S);
            }
        }
    }

    static /* synthetic */ void v1(r rVar, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        rVar.u1(z9, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(r rVar, ValueAnimator animation) {
        n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        ToolActionsView toolActionsViewC0 = rVar.C0();
        if (toolActionsViewC0 != null) {
            toolActionsViewC0.setAlpha(fFloatValue);
        }
        TextView textViewD0 = rVar.D0();
        if (textViewD0 != null) {
            textViewD0.setAlpha(fFloatValue);
        }
        View view = rVar.f23036M;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        if (rVar.Q0()) {
            ImageButton imageButtonY0 = rVar.y0();
            if (imageButtonY0 != null) {
                imageButtonY0.setAlpha(fFloatValue);
            }
            TextView textViewE0 = rVar.E0();
            if (textViewE0 != null) {
                textViewE0.setAlpha(fFloatValue);
            }
            TextView textViewF0 = rVar.F0();
            if (textViewF0 != null) {
                textViewF0.setAlpha(fFloatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(r rVar, View view) {
        v1(rVar, !rVar.O0(), false, 2, null);
    }

    @Override // p118l7.k
    protected void K0(View view) {
        n.h(view, "view");
        super.K0(view);
        this.f23035L = (Group) view.findViewById(R.id.view_group);
        this.f23036M = view.findViewById(R.id.view_gradient_scrim);
        ImageView imageView = (ImageView) view.findViewById(R.id.low_res_image);
        this.f23037N = imageView;
        if (imageView != null) {
            imageView.setRenderEffect(RenderEffect.createBlurEffect(150.0f, 150.0f, Shader.TileMode.CLAMP));
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView = (EditSubsamplingScaleImageView) view.findViewById(R.id.full_res_image);
        this.f23038O = editSubsamplingScaleImageView;
        if (editSubsamplingScaleImageView != null) {
            editSubsamplingScaleImageView.setMinimumScaleType(3);
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView2 = this.f23038O;
        if (editSubsamplingScaleImageView2 != null) {
            editSubsamplingScaleImageView2.setPanLimit(1);
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView3 = this.f23038O;
        if (editSubsamplingScaleImageView3 != null) {
            editSubsamplingScaleImageView3.setOnClickListener(new View.OnClickListener() { // from class: l7.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    r.z1(this.f23030q, view2);
                }
            });
        }
    }

    @Override // p118l7.k
    protected void h1(ToolActionsView actionBar) {
        n.h(actionBar, "actionBar");
        super.h1(actionBar);
        ToolActionsView toolActionsViewC0 = C0();
        if (toolActionsViewC0 != null) {
            toolActionsViewC0.c(ToolActionsView.a.RIGHT);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        Y0();
        View viewInflate = inflater.inflate(R.layout.nt_fragment_crop_wallpaper, viewGroup, false);
        n.e(viewInflate);
        K0(viewInflate);
        C1();
        u1(bundle != null ? bundle.getBoolean(this.f23034K) : false, false);
        return viewInflate;
    }

    @Override // p118l7.k, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.f23041R;
        if (valueAnimator != null) {
            valueAnimator.removeListener(this.f23042S);
        }
        ValueAnimator valueAnimator2 = this.f23041R;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView = this.f23038O;
        if (editSubsamplingScaleImageView != null) {
            editSubsamplingScaleImageView.recycle();
        }
        this.f23038O = null;
        this.f23037N = null;
        this.f23036M = null;
        this.f23035L = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle outState) {
        n.h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (getContext() != null) {
            outState.putBoolean(this.f23034K, O0());
        }
    }

    @Override // p118l7.k, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new b(null), 3, null);
        EditSubsamplingScaleImageView editSubsamplingScaleImageView = this.f23038O;
        if (editSubsamplingScaleImageView != null) {
            editSubsamplingScaleImageView.setOnStateEndListener(new p219v8.a() { // from class: l7.p
                @Override // p219v8.a
                public final Object invoke() {
                    return r.A1(this.f23031q);
                }
            });
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView2 = this.f23038O;
        if (editSubsamplingScaleImageView2 != null) {
            editSubsamplingScaleImageView2.setOnStatePreEndListener(new p() { // from class: l7.q
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return r.B1(this.f23032q, (Float) obj, (PointF) obj2);
                }
            });
        }
        EditSubsamplingScaleImageView editSubsamplingScaleImageView3 = this.f23038O;
        if (editSubsamplingScaleImageView3 == null || editSubsamplingScaleImageView3.isImageLoaded()) {
            return;
        }
        E1(G0().Z());
    }

    protected String x1() {
        return this.f23033J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p118l7.k
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public g G0() {
        return (g) this.f23040Q.getValue();
    }
}
