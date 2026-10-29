package com.nothing.wallpaper.picker.lockscreen.ui.view;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1324g;
import p248y7.InterfaceC2016s;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockPickerPage extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1324g f18858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC2016s f18859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC0846x0 f18860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.android.launcher3.views.f f18861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.android.launcher3.f f18862u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18863v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18864w;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18865q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f18866r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ClockPickerPage f18867s;

        /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.ClockPickerPage$a$a, reason: collision with other inner class name */
        static final class C0507a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18868q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18869r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ClockPickerPage f18870s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.ClockPickerPage$a$a$a, reason: collision with other inner class name */
            static final class C0508a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18871q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private /* synthetic */ Object f18872r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ ClockPickerPage f18873s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0508a(ClockPickerPage clockPickerPage, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18873s = clockPickerPage;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    C0508a c0508a = new C0508a(this.f18873s, eVar);
                    c0508a.f18872r = obj;
                    return c0508a;
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0508a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f18871q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    F8.L l9 = (F8.L) this.f18872r;
                    ClockSnapshotListView clockListView = this.f18873s.f18858q.f19985z;
                    kotlin.jvm.internal.n.g(clockListView, "clockListView");
                    InterfaceC2016s interfaceC2016s = this.f18873s.f18859r;
                    kotlin.jvm.internal.n.e(interfaceC2016s);
                    J7.i lockScreenViewModel = interfaceC2016s.getLockScreenViewModel();
                    InterfaceC2016s interfaceC2016s2 = this.f18873s.f18859r;
                    kotlin.jvm.internal.n.e(interfaceC2016s2);
                    G7.n.a(clockListView, lockScreenViewModel, interfaceC2016s2.getClockViewFactory(), l9);
                    G7.l lVar = G7.l.f2056a;
                    AbstractC1324g abstractC1324g = this.f18873s.f18858q;
                    com.android.launcher3.f fVar = this.f18873s.f18862u;
                    kotlin.jvm.internal.n.g(fVar, "access$getDeviceProfile$p(...)");
                    InterfaceC2016s interfaceC2016s3 = this.f18873s.f18859r;
                    kotlin.jvm.internal.n.e(interfaceC2016s3);
                    lVar.f(abstractC1324g, fVar, interfaceC2016s3.getLockScreenViewModel(), l9);
                    AbstractC1324g abstractC1324g2 = this.f18873s.f18858q;
                    com.android.launcher3.f fVar2 = this.f18873s.f18862u;
                    kotlin.jvm.internal.n.g(fVar2, "access$getDeviceProfile$p(...)");
                    InterfaceC2016s interfaceC2016s4 = this.f18873s.f18859r;
                    kotlin.jvm.internal.n.e(interfaceC2016s4);
                    lVar.d(abstractC1324g2, fVar2, interfaceC2016s4.getLockScreenViewModel(), l9);
                    G7.p pVar = G7.p.f2099a;
                    AbstractC1324g abstractC1324g3 = this.f18873s.f18858q;
                    InterfaceC2016s interfaceC2016s5 = this.f18873s.f18859r;
                    kotlin.jvm.internal.n.e(interfaceC2016s5);
                    J7.i lockScreenViewModel2 = interfaceC2016s5.getLockScreenViewModel();
                    InterfaceC2016s interfaceC2016s6 = this.f18873s.f18859r;
                    kotlin.jvm.internal.n.e(interfaceC2016s6);
                    pVar.b(abstractC1324g3, lockScreenViewModel2, interfaceC2016s6, l9);
                    return p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0507a(ClockPickerPage clockPickerPage, p129m8.e eVar) {
                super(2, eVar);
                this.f18870s = clockPickerPage;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0507a c0507a = new C0507a(this.f18870s, eVar);
                c0507a.f18869r = obj;
                return c0507a;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((C0507a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18868q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                AbstractC0816i.d((F8.L) this.f18869r, null, null, new C0508a(this.f18870s, null), 3, null);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, ClockPickerPage clockPickerPage, p129m8.e eVar) {
            super(2, eVar);
            this.f18866r = interfaceC1163x;
            this.f18867s = clockPickerPage;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f18866r, this.f18867s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18865q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f18866r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0507a c0507a = new C0507a(this.f18867s, null);
                this.f18865q = 1;
                if (androidx.lifecycle.N.b(interfaceC1163x, bVar, c0507a, this) == objE) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockPickerPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    public static void b(ClockPickerPage clockPickerPage, View view) {
        InterfaceC2016s interfaceC2016s = clockPickerPage.f18859r;
        if (interfaceC2016s != null) {
            interfaceC2016s.x();
        }
    }

    private final void g(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i10;
        view.setLayoutParams(marginLayoutParams);
    }

    public final ObjectAnimator f(boolean z9) {
        G7.p pVar = G7.p.f2099a;
        LinearLayout unlockAnimation = this.f18858q.f19979K;
        kotlin.jvm.internal.n.g(unlockAnimation, "unlockAnimation");
        return pVar.d(unlockAnimation, z9);
    }

    public final float getDynamicFontHeight() {
        return this.f18858q.f19979K.getMeasuredHeight() + this.f18864w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2016s interfaceC2016sA = InterfaceC2016s.f30549o.a(getParent());
        if (interfaceC2016sA == null) {
            return;
        }
        this.f18859r = interfaceC2016sA;
        InterfaceC1163x interfaceC1163xA = androidx.lifecycle.g0.a(this);
        if (interfaceC1163xA != null) {
            this.f18860s = AbstractC0816i.d(AbstractC1164y.a(interfaceC1163xA), null, null, new a(interfaceC1163xA, this, null), 3, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18858q.f19985z.e();
        InterfaceC0846x0 interfaceC0846x0 = this.f18860s;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f18860s = null;
        this.f18859r = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public /* synthetic */ ClockPickerPage(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockPickerPage(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        AbstractC1324g abstractC1324gC = AbstractC1324g.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(abstractC1324gC, "inflate(...)");
        this.f18858q = abstractC1324gC;
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18861t = fVar;
        com.android.launcher3.f fVarK = fVar.K();
        this.f18862u = fVarK;
        this.f18863v = p239x8.a.b(fVarK.f15572i * 0.013043478f);
        this.f18864w = p239x8.a.b(fVarK.f15572i * 0.017391304f);
        abstractC1324gC.f19973E.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClockPickerPage.b(this.f19130q, view);
            }
        });
        TextView clockStyleText = abstractC1324gC.f19971C;
        kotlin.jvm.internal.n.g(clockStyleText, "clockStyleText");
        g(clockStyleText, this.f18863v);
        ClockSnapshotListView clockListView = abstractC1324gC.f19985z;
        kotlin.jvm.internal.n.g(clockListView, "clockListView");
        g(clockListView, this.f18864w);
        TextView clockSizeText = abstractC1324gC.f19970B;
        kotlin.jvm.internal.n.g(clockSizeText, "clockSizeText");
        g(clockSizeText, this.f18863v);
        LinearLayout clockSize = abstractC1324gC.f19969A;
        kotlin.jvm.internal.n.g(clockSize, "clockSize");
        g(clockSize, this.f18864w);
        TextView clockAlignText = abstractC1324gC.f19984y;
        kotlin.jvm.internal.n.g(clockAlignText, "clockAlignText");
        g(clockAlignText, this.f18863v);
        LinearLayout clockAlign = abstractC1324gC.f19983x;
        kotlin.jvm.internal.n.g(clockAlign, "clockAlign");
        g(clockAlign, this.f18864w);
        TextView unlockAnimationText = abstractC1324gC.f19980L;
        kotlin.jvm.internal.n.g(unlockAnimationText, "unlockAnimationText");
        g(unlockAnimationText, this.f18863v);
    }
}
