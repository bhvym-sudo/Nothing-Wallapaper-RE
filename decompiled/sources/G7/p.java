package G7;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.nothing.widget.ui.NtSwitch;
import kotlin.jvm.internal.A;
import p044e3.AbstractC1324g;
import p248y7.InterfaceC2016s;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f2099a = new p();

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2100q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J7.i f2101r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractC1324g f2102s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC2016s f2103t;

        /* JADX INFO: renamed from: G7.p$a$a, reason: collision with other inner class name */
        static final class C0087a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ AbstractC1324g f2104q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC2016s f2105r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ A f2106s;

            C0087a(AbstractC1324g abstractC1324g, InterfaceC2016s interfaceC2016s, A a10) {
                this.f2104q = abstractC1324g;
                this.f2105r = interfaceC2016s;
                this.f2106s = a10;
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(A7.g gVar, p129m8.e eVar) {
                boolean z9 = gVar != null;
                AbstractC1324g abstractC1324g = this.f2104q;
                A a10 = this.f2106s;
                if (gVar != null) {
                    boolean z10 = gVar == A7.g.ON;
                    if (abstractC1324g.f19974F.isChecked() != z10) {
                        abstractC1324g.f19974F.g(z10, false);
                    }
                }
                if (z9) {
                    if (a10.f22775q) {
                        abstractC1324g.f19979K.setAlpha(1.0f);
                    } else {
                        LinearLayout unlockAnimation = abstractC1324g.f19979K;
                        kotlin.jvm.internal.n.g(unlockAnimation, "unlockAnimation");
                        if (unlockAnimation.getVisibility() == 4) {
                            abstractC1324g.f19979K.setAlpha(0.0f);
                        }
                    }
                    LinearLayout unlockAnimation2 = abstractC1324g.f19979K;
                    kotlin.jvm.internal.n.g(unlockAnimation2, "unlockAnimation");
                    unlockAnimation2.setVisibility(0);
                } else if (a10.f22775q) {
                    LinearLayout unlockAnimation3 = abstractC1324g.f19979K;
                    kotlin.jvm.internal.n.g(unlockAnimation3, "unlockAnimation");
                    unlockAnimation3.setVisibility(4);
                }
                this.f2105r.q(z9, true ^ this.f2106s.f22775q);
                this.f2106s.f22775q = false;
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J7.i iVar, AbstractC1324g abstractC1324g, InterfaceC2016s interfaceC2016s, p129m8.e eVar) {
            super(2, eVar);
            this.f2101r = iVar;
            this.f2102s = abstractC1324g;
            this.f2103t = interfaceC2016s;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f2101r, this.f2102s, this.f2103t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2100q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                A a10 = new A();
                a10.f22775q = true;
                InterfaceC0880f interfaceC0880fO = AbstractC0882h.o(this.f2101r.W());
                C0087a c0087a = new C0087a(this.f2102s, this.f2103t, a10);
                this.f2100q = 1;
                if (interfaceC0880fO.a(c0087a, this) == objE) {
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

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2107a;

        b(View view) {
            this.f2107a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            this.f2107a.setVisibility(4);
        }
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC1324g abstractC1324g, J7.i iVar, View view) {
        NtSwitch ntSwitch = abstractC1324g.f19974F;
        if (iVar.n0()) {
            return;
        }
        ntSwitch.toggle();
        iVar.T0(ntSwitch.isChecked() ? A7.g.ON : A7.g.OFF);
    }

    public final void b(final AbstractC1324g binding, final J7.i lockScreenViewModel, InterfaceC2016s clockPickerListener, L coroutineScope) {
        kotlin.jvm.internal.n.h(binding, "binding");
        kotlin.jvm.internal.n.h(lockScreenViewModel, "lockScreenViewModel");
        kotlin.jvm.internal.n.h(clockPickerListener, "clockPickerListener");
        kotlin.jvm.internal.n.h(coroutineScope, "coroutineScope");
        binding.f19979K.setOnClickListener(new View.OnClickListener() { // from class: G7.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.c(binding, lockScreenViewModel, view);
            }
        });
        AbstractC0816i.d(coroutineScope, null, null, new a(lockScreenViewModel, binding, clockPickerListener, null), 3, null);
    }

    public final ObjectAnimator d(View unlockAnimation, boolean z9) {
        kotlin.jvm.internal.n.h(unlockAnimation, "unlockAnimation");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(unlockAnimation, (Property<View, Float>) View.ALPHA, unlockAnimation.getAlpha(), z9 ? 1.0f : 0.0f);
        if (!z9) {
            objectAnimatorOfFloat.addListener(new b(unlockAnimation));
        }
        kotlin.jvm.internal.n.g(objectAnimatorOfFloat, "also(...)");
        return objectAnimatorOfFloat;
    }
}
