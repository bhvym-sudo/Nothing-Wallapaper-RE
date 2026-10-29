package com.nothing.wallpaper.picker.lockscreen.ui;

import E7.C0773e;
import E7.EnumC0774f;
import E7.InterfaceC0769a;
import E7.Z;
import F8.AbstractC0816i;
import F8.L;
import F8.W;
import H3.AbstractC0851a;
import I8.AbstractC0882h;
import I8.E;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.core.view.T;
import androidx.core.view.V;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.android.launcher3.AbstractC1219a;
import com.android.launcher3.Workspace;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.w;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.bean.LoadingState;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import com.nothing.wallpaper.picker.lockscreen.ui.view.AccessibilityCellLayout;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostEditPreview;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockPickerBottomSheet;
import com.nothing.wallpaper.picker.lockscreen.ui.view.H;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPickerBottomSheet;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPreview;
import com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet;
import com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetSettingsToast;
import com.nothing.wallpaper.widget.RoundedOverlayImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC1458i;
import p044e3.AbstractC1340u;
import p064g3.x;
import p079h8.A;
import p089i8.AbstractC1444s;
import p248y7.C;
import p248y7.S;

/* JADX INFO: loaded from: classes2.dex */
public final class LockScreenFragment extends S implements InterfaceC0769a, com.android.launcher3.l {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f18594p0 = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p098j7.j f18595C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p148o7.g f18596D;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private AbstractC1340u f18603K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private WidgetPickerBottomSheet f18604L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ShortCutPickerBottomSheet f18605M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ClockPickerBottomSheet f18606N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private C f18607O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private x f18608P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p248y7.r f18609Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ValueAnimator f18610R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ValueAnimator f18611S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Bundle f18613U;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f18619a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private N1.a f18621c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private A7.a f18622d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f18623e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f18624f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f18625g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Z f18626h0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private ProgressDialog f18628j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private X7.i f18629k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Runnable f18630l0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p079h8.h f18597E = p079h8.i.b(new p219v8.a() { // from class: E7.g
        @Override // p219v8.a
        public final Object invoke() {
            return LockScreenFragment.x3(this.f1424q);
        }
    });

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p079h8.h f18598F = X.b(this, F.b(J7.b.class), new t(this), new u(null, this), new v(this));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p079h8.h f18599G = p079h8.i.b(new p219v8.a() { // from class: E7.r
        @Override // p219v8.a
        public final Object invoke() {
            return LockScreenFragment.D2(this.f1435q);
        }
    });

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p079h8.h f18600H = p079h8.i.b(new p219v8.a() { // from class: E7.C
        @Override // p219v8.a
        public final Object invoke() {
            return Integer.valueOf(LockScreenFragment.R3(this.f1311q));
        }
    });

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p079h8.h f18601I = p079h8.i.b(new p219v8.a() { // from class: E7.I
        @Override // p219v8.a
        public final Object invoke() {
            return Integer.valueOf(LockScreenFragment.y3(this.f1319q));
        }
    });

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p079h8.h f18602J = p079h8.i.b(new p219v8.a() { // from class: E7.J
        @Override // p219v8.a
        public final Object invoke() {
            return Boolean.valueOf(LockScreenFragment.u3(this.f1320q));
        }
    });

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Handler f18612T = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f18614V = -1.0f;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18615W = -1;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final p079h8.h f18616X = p079h8.i.b(new p219v8.a() { // from class: E7.K
        @Override // p219v8.a
        public final Object invoke() {
            return Boolean.valueOf(LockScreenFragment.r3());
        }
    });

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final p079h8.h f18617Y = p079h8.i.b(new p219v8.a() { // from class: E7.L
        @Override // p219v8.a
        public final Object invoke() {
            return LockScreenFragment.p4(this.f1321q);
        }
    });

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f18618Z = "";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private List f18620b0 = new ArrayList();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final p079h8.h f18627i0 = p079h8.i.b(new p219v8.a() { // from class: E7.M
        @Override // p219v8.a
        public final Object invoke() {
            return LockScreenFragment.H2(this.f1322q);
        }
    });

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final l f18631m0 = new l();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Runnable f18632n0 = new Runnable() { // from class: E7.N
        @Override // java.lang.Runnable
        public final void run() {
            LockScreenFragment.h4(this.f1323q);
        }
    };

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Runnable f18633o0 = new Runnable() { // from class: E7.O
        @Override // java.lang.Runnable
        public final void run() {
            LockScreenFragment.X2(this.f1324q);
        }
    };

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final LockScreenFragment a(boolean z9) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showPreviewDimmingScrim", z9);
            LockScreenFragment lockScreenFragment = new LockScreenFragment();
            lockScreenFragment.setArguments(bundle);
            return lockScreenFragment;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18634q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18636q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18637r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ LockScreenFragment f18638s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$a, reason: collision with other inner class name */
            static final class C0489a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18639q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18640r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$a$a, reason: collision with other inner class name */
                static final class C0490a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18641q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f18642r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18643s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0490a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18643s = lockScreenFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0490a c0490a = new C0490a(this.f18643s, eVar);
                        c0490a.f18642r = obj;
                        return c0490a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18641q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        this.f18643s.f18618Z = (String) this.f18642r;
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(String str, p129m8.e eVar) {
                        return ((C0490a) create(str, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0489a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18640r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0489a(this.f18640r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0489a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18639q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fU = this.f18640r.getLockScreenViewModel().U();
                        C0490a c0490a = new C0490a(this.f18640r, null);
                        this.f18639q = 1;
                        if (AbstractC0882h.i(interfaceC0880fU, c0490a, this) == objE) {
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

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$b, reason: collision with other inner class name */
            static final class C0491b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18644q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18645r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$b$a, reason: collision with other inner class name */
                static final class C0492a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18646q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f18647r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18648s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0492a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18648s = lockScreenFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0492a c0492a = new C0492a(this.f18648s, eVar);
                        c0492a.f18647r = ((Boolean) obj).booleanValue();
                        return c0492a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18646q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        this.f18648s.N3(this.f18647r);
                        return A.f21846a;
                    }

                    public final Object s(boolean z9, p129m8.e eVar) {
                        return ((C0492a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0491b(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18645r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0491b(this.f18645r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0491b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18644q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        E eN = this.f18645r.getLockScreenViewModel().N();
                        C0492a c0492a = new C0492a(this.f18645r, null);
                        this.f18644q = 1;
                        if (AbstractC0882h.i(eN, c0492a, this) == objE) {
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

            static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18649q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18650r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$c$a, reason: collision with other inner class name */
                static final class C0493a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18651q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f18652r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18653s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0493a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18653s = lockScreenFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0493a c0493a = new C0493a(this.f18653s, eVar);
                        c0493a.f18652r = obj;
                        return c0493a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18651q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        List list = (List) this.f18652r;
                        LockScreenFragment lockScreenFragment = this.f18653s;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C7.a) ((p079h8.u) it.next()).e()).c());
                        }
                        lockScreenFragment.f18620b0 = arrayList;
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(List list, p129m8.e eVar) {
                        return ((C0493a) create(list, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18650r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f18650r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18649q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fR = this.f18650r.getLockScreenViewModel().R();
                        C0493a c0493a = new C0493a(this.f18650r, null);
                        this.f18649q = 1;
                        if (AbstractC0882h.i(interfaceC0880fR, c0493a, this) == objE) {
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

            static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18654q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18655r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$d$a, reason: collision with other inner class name */
                static final class C0494a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18656q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f18657r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18658s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0494a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18658s = lockScreenFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0494a c0494a = new C0494a(this.f18658s, eVar);
                        c0494a.f18657r = obj;
                        return c0494a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18656q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        this.f18658s.f18621c0 = (N1.a) this.f18657r;
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N1.a aVar, p129m8.e eVar) {
                        return ((C0494a) create(aVar, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18655r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new d(this.f18655r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18654q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fV = this.f18655r.getLockScreenViewModel().V();
                        C0494a c0494a = new C0494a(this.f18655r, null);
                        this.f18654q = 1;
                        if (AbstractC0882h.i(interfaceC0880fV, c0494a, this) == objE) {
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

            static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18659q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18660r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$b$a$e$a, reason: collision with other inner class name */
                static final class C0495a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18661q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f18662r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18663s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0495a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18663s = lockScreenFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0495a c0495a = new C0495a(this.f18663s, eVar);
                        c0495a.f18662r = obj;
                        return c0495a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18661q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        this.f18663s.f18622d0 = (A7.a) this.f18662r;
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(A7.a aVar, p129m8.e eVar) {
                        return ((C0495a) create(aVar, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18660r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new e(this.f18660r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18659q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fT = this.f18660r.getLockScreenViewModel().T();
                        C0495a c0495a = new C0495a(this.f18660r, null);
                        this.f18659q = 1;
                        if (AbstractC0882h.i(interfaceC0880fT, c0495a, this) == objE) {
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
            a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                super(2, eVar);
                this.f18638s = lockScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f18638s, eVar);
                aVar.f18637r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18636q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                L l9 = (L) this.f18637r;
                AbstractC0816i.d(l9, null, null, new C0489a(this.f18638s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0491b(this.f18638s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f18638s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new d(this.f18638s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new e(this.f18638s, null), 3, null);
                return A.f21846a;
            }
        }

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return LockScreenFragment.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18634q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                LockScreenFragment lockScreenFragment = LockScreenFragment.this;
                AbstractC1157q.b bVar = AbstractC1157q.b.CREATED;
                a aVar = new a(lockScreenFragment, null);
                this.f18634q = 1;
                if (N.b(lockScreenFragment, bVar, aVar, this) == objE) {
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

    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LockScreenFragment f18665b;

        c(boolean z9, LockScreenFragment lockScreenFragment) {
            this.f18664a = z9;
            this.f18665b = lockScreenFragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            if (this.f18664a) {
                AbstractC1340u abstractC1340u = this.f18665b.f18603K;
                if (abstractC1340u == null) {
                    kotlin.jvm.internal.n.r("binding");
                    abstractC1340u = null;
                }
                abstractC1340u.f20129H.setCardBackgroundColor(-16777216);
            } else {
                this.f18665b.c4();
                this.f18665b.f18631m0.h();
            }
            Z zN2 = this.f18665b.N2();
            if (zN2 != null) {
                Z.u(zN2, false, 1, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            if (this.f18664a) {
                return;
            }
            AbstractC1340u abstractC1340u = this.f18665b.f18603K;
            if (abstractC1340u == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u = null;
            }
            abstractC1340u.f20129H.setBackgroundColor(0);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18666q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f18668s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f18669t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z9, long j9, p129m8.e eVar) {
            super(2, eVar);
            this.f18668s = z9;
            this.f18669t = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return LockScreenFragment.this.new d(this.f18668s, this.f18669t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f18666q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            if (LockScreenFragment.this.getParentFragment() instanceof p068g7.k) {
                LockScreenFragment.this.G3(this.f18668s, this.f18669t);
            } else {
                LockScreenFragment.this.requireActivity().finish();
            }
            return A.f21846a;
        }
    }

    /* synthetic */ class e extends kotlin.jvm.internal.l implements p219v8.p {
        e(Object obj) {
            super(2, obj, J7.i.class, "getWallpaperInfo", "getWallpaperInfo(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object g(boolean z9, p129m8.e eVar) {
            return ((J7.i) this.receiver).k0(z9, eVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }
    }

    public static final class f implements com.android.wallpaper.asset.a.f {
        f() {
        }

        @Override // com.android.wallpaper.asset.a.f
        public void a(Throwable th) {
            LockScreenFragment.this.B2();
        }

        @Override // com.android.wallpaper.asset.a.f
        public void b(Bitmap bitmap) {
            LockScreenFragment.this.B2();
        }
    }

    public static final class g implements ShortCutPreview.a {
        g() {
        }

        @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPreview.a
        public void a(String slotId) {
            kotlin.jvm.internal.n.h(slotId, "slotId");
            com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "onSlotClicked slotId:" + slotId);
            LockScreenFragment.this.getLockScreenViewModel().M0(slotId);
            LockScreenFragment.this.T2().s();
        }
    }

    public static final class h implements View.OnLayoutChangeListener {
        public h() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            LockScreenFragment lockScreenFragment = LockScreenFragment.this;
            AbstractC1340u abstractC1340u = LockScreenFragment.this.f18603K;
            if (abstractC1340u == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u = null;
            }
            lockScreenFragment.f18609Q = new p248y7.r(abstractC1340u, LockScreenFragment.this.l(), LockScreenFragment.this.O0(), LockScreenFragment.this.T2());
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18673q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18675q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18676r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ LockScreenFragment f18677s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$i$a$a, reason: collision with other inner class name */
            static final class C0496a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18678q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18679r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$i$a$a$a, reason: collision with other inner class name */
                static final class C0497a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18680q;

                    C0497a(LockScreenFragment lockScreenFragment) {
                        this.f18680q = lockScreenFragment;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        this.f18680q.v0(list);
                        this.f18680q.f18624f0 = true;
                        this.f18680q.j4();
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0496a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18679r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0496a(this.f18679r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0496a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18678q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fG = this.f18679r.getLockScreenViewModel().G();
                        C0497a c0497a = new C0497a(this.f18679r);
                        this.f18678q = 1;
                        if (interfaceC0880fG.a(c0497a, this) == objE) {
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

            static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18681q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18682r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$i$a$b$a, reason: collision with other inner class name */
                static final class C0498a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18683q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f18684r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18685s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0498a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18685s = lockScreenFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0498a c0498a = new C0498a(this.f18685s, eVar);
                        c0498a.f18684r = obj;
                        return c0498a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18683q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        List<p079h8.u> list = (List) this.f18684r;
                        AbstractC1340u abstractC1340u = this.f18685s.f18603K;
                        if (abstractC1340u == null) {
                            kotlin.jvm.internal.n.r("binding");
                            abstractC1340u = null;
                        }
                        abstractC1340u.f20128G.setShortcuts(list);
                        return A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(List list, p129m8.e eVar) {
                        return ((C0498a) create(list, eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18682r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f18682r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18681q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fR = this.f18682r.getLockScreenViewModel().R();
                        C0498a c0498a = new C0498a(this.f18682r, null);
                        this.f18681q = 1;
                        if (AbstractC0882h.i(interfaceC0880fR, c0498a, this) == objE) {
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

            static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18686q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18687r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$i$a$c$a, reason: collision with other inner class name */
                static final class C0499a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18688q;

                    C0499a(LockScreenFragment lockScreenFragment) {
                        this.f18688q = lockScreenFragment;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void e(LockScreenFragment lockScreenFragment) {
                        lockScreenFragment.F3();
                        lockScreenFragment.getLockScreenViewModel().c1();
                        lockScreenFragment.A2();
                        lockScreenFragment.T2().f();
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object b(J7.n nVar, p129m8.e eVar) {
                        AbstractC1340u abstractC1340u = this.f18688q.f18603K;
                        if (abstractC1340u == null) {
                            kotlin.jvm.internal.n.r("binding");
                            abstractC1340u = null;
                        }
                        AccessibilityCellLayout accessibilityCellLayout = abstractC1340u.f20140v;
                        J7.n.d dVar = J7.n.d.f3874q;
                        accessibilityCellLayout.f(kotlin.jvm.internal.n.d(nVar, dVar));
                        if (kotlin.jvm.internal.n.d(nVar, dVar)) {
                            WidgetPickerBottomSheet widgetPickerBottomSheet = this.f18688q.f18604L;
                            if (widgetPickerBottomSheet == null || !widgetPickerBottomSheet.K()) {
                                LockScreenFragment lockScreenFragment = this.f18688q;
                                lockScreenFragment.f18604L = WidgetPickerBottomSheet.a.b(WidgetPickerBottomSheet.f19023r0, lockScreenFragment, false, 2, null);
                                this.f18688q.L2();
                                WidgetPickerBottomSheet widgetPickerBottomSheet2 = this.f18688q.f18604L;
                                if (widgetPickerBottomSheet2 != null) {
                                    final LockScreenFragment lockScreenFragment2 = this.f18688q;
                                    widgetPickerBottomSheet2.setOnCloseBeginListener(new com.android.launcher3.views.e.c() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.a
                                        @Override // com.android.launcher3.views.e.c
                                        public final void a() {
                                            LockScreenFragment.i.a.c.C0499a.e(lockScreenFragment2);
                                        }
                                    });
                                }
                            }
                        } else if (kotlin.jvm.internal.n.d(nVar, J7.n.c.f3873q)) {
                            this.f18688q.a4();
                        } else if (kotlin.jvm.internal.n.d(nVar, J7.n.a.f3871q) && !this.f18688q.Q2()) {
                            this.f18688q.S3();
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18687r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f18687r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18686q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        O oM = this.f18687r.T2().m();
                        C0499a c0499a = new C0499a(this.f18687r);
                        this.f18686q = 1;
                        if (oM.a(c0499a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                super(2, eVar);
                this.f18677s = lockScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f18677s, eVar);
                aVar.f18676r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18675q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                L l9 = (L) this.f18676r;
                AbstractC0816i.d(l9, null, null, new C0496a(this.f18677s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f18677s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f18677s, null), 3, null);
                return A.f21846a;
            }
        }

        i(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return LockScreenFragment.this.new i(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18673q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x viewLifecycleOwner = LockScreenFragment.this.getViewLifecycleOwner();
                kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(LockScreenFragment.this, null);
                this.f18673q = 1;
                if (N.b(viewLifecycleOwner, bVar, aVar, this) == objE) {
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

    static final class j extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18689q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f18690r;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18692q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ LockScreenFragment f18693r;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$j$a$a, reason: collision with other inner class name */
            static final class C0500a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18694q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ boolean f18695r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18696s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0500a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18696s = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    C0500a c0500a = new C0500a(this.f18696s, eVar);
                    c0500a.f18695r = ((Boolean) obj).booleanValue();
                    return c0500a;
                }

                @Override // p219v8.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f18694q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    boolean z9 = this.f18695r;
                    if (this.f18696s.getLockScreenViewModel().a0() && kotlin.jvm.internal.n.d(this.f18696s.T2().j().getValue(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        this.f18696s.K3(!z9);
                    }
                    return A.f21846a;
                }

                public final Object s(boolean z9, p129m8.e eVar) {
                    return ((C0500a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                super(2, eVar);
                this.f18693r = lockScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f18693r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f18692q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0880f interfaceC0880fW = AbstractC0882h.w(this.f18693r.T2().k());
                    C0500a c0500a = new C0500a(this.f18693r, null);
                    this.f18692q = 1;
                    if (AbstractC0882h.i(interfaceC0880fW, c0500a, this) == objE) {
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

        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18697q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ LockScreenFragment f18698r;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18699q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f18700r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18701s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18701s = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    a aVar = new a(this.f18701s, eVar);
                    aVar.f18700r = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    J7.m mVar;
                    Object objE = p139n8.b.e();
                    int i10 = this.f18699q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        J7.m mVar2 = (J7.m) this.f18700r;
                        InterfaceC0880f interfaceC0880fV = this.f18701s.getLockScreenViewModel().V();
                        this.f18700r = mVar2;
                        this.f18699q = 1;
                        Object objX = AbstractC0882h.x(interfaceC0880fV, this);
                        if (objX == objE) {
                            return objE;
                        }
                        mVar = mVar2;
                        obj = objX;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar = (J7.m) this.f18700r;
                        p079h8.r.b(obj);
                    }
                    boolean z9 = ((N1.a) obj) == N1.a.SMALL;
                    if (kotlin.jvm.internal.n.d(mVar, J7.m.c.f3870q)) {
                        WidgetSettingsToast.a aVar = WidgetSettingsToast.f19065z;
                        LockScreenFragment lockScreenFragment = this.f18701s;
                        String string = lockScreenFragment.getString(R.string.widget_picker_open_settings_toast);
                        kotlin.jvm.internal.n.g(string, "getString(...)");
                        aVar.a(lockScreenFragment, string, false, z9);
                    } else if (kotlin.jvm.internal.n.d(mVar, J7.m.a.f3868q)) {
                        WidgetSettingsToast.a aVar2 = WidgetSettingsToast.f19065z;
                        LockScreenFragment lockScreenFragment2 = this.f18701s;
                        String string2 = lockScreenFragment2.getString(R.string.clock_settings_toast);
                        kotlin.jvm.internal.n.g(string2, "getString(...)");
                        aVar2.a(lockScreenFragment2, string2, true, z9);
                    }
                    return A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J7.m mVar, p129m8.e eVar) {
                    return ((a) create(mVar, eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                super(2, eVar);
                this.f18698r = lockScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f18698r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f18697q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    O oF0 = this.f18698r.getLockScreenViewModel().f0();
                    a aVar = new a(this.f18698r, null);
                    this.f18697q = 1;
                    if (AbstractC0882h.i(oF0, aVar, this) == objE) {
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

        j(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            j jVar = LockScreenFragment.this.new j(eVar);
            jVar.f18690r = obj;
            return jVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((j) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f18689q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f18690r;
            AbstractC0816i.d(l9, null, null, new a(LockScreenFragment.this, null), 3, null);
            AbstractC0816i.d(l9, null, null, new b(LockScreenFragment.this, null), 3, null);
            return A.f21846a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18702q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18704q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18705r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ LockScreenFragment f18706s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$k$a$a, reason: collision with other inner class name */
            static final class C0501a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18707q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18708r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$k$a$a$a, reason: collision with other inner class name */
                static final class C0502a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18709q;

                    /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$k$a$a$a$a, reason: collision with other inner class name */
                    static final class C0503a extends kotlin.coroutines.jvm.internal.d {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        Object f18710q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        int f18711r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        /* synthetic */ Object f18712s;

                        /* JADX INFO: renamed from: u, reason: collision with root package name */
                        int f18714u;

                        C0503a(p129m8.e eVar) {
                            super(eVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f18712s = obj;
                            this.f18714u |= Integer.MIN_VALUE;
                            return C0502a.this.b(null, this);
                        }
                    }

                    C0502a(LockScreenFragment lockScreenFragment) {
                        this.f18709q = lockScreenFragment;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(N1.a aVar, p129m8.e eVar) {
                        C0503a c0503a;
                        int i10;
                        if (eVar instanceof C0503a) {
                            c0503a = (C0503a) eVar;
                            int i11 = c0503a.f18714u;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0503a.f18714u = i11 - Integer.MIN_VALUE;
                            } else {
                                c0503a = new C0503a(eVar);
                            }
                        } else {
                            c0503a = new C0503a(eVar);
                        }
                        Object objX = c0503a.f18712s;
                        Object objE = p139n8.b.e();
                        int i12 = c0503a.f18714u;
                        if (i12 == 0) {
                            p079h8.r.b(objX);
                            i10 = aVar == N1.a.SMALL ? 1 : 0;
                            E eN = this.f18709q.getLockScreenViewModel().N();
                            c0503a.f18710q = this;
                            c0503a.f18711r = i10;
                            c0503a.f18714u = 1;
                            objX = AbstractC0882h.x(eN, c0503a);
                            if (objX == objE) {
                                return objE;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = c0503a.f18711r;
                            C0502a c0502a = (C0502a) c0503a.f18710q;
                            p079h8.r.b(objX);
                            i10 = i13;
                            this = c0502a;
                        }
                        boolean zBooleanValue = ((Boolean) objX).booleanValue();
                        AbstractC1340u abstractC1340u = this.f18709q.f18603K;
                        if (abstractC1340u == null) {
                            kotlin.jvm.internal.n.r("binding");
                            abstractC1340u = null;
                        }
                        abstractC1340u.f20139R.X(i10 != 0, zBooleanValue, this.f18709q.f18625g0);
                        this.f18709q.f18625g0 = true;
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0501a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18708r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0501a(this.f18708r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0501a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18707q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        E eJ = this.f18708r.getLockScreenViewModel().J();
                        C0502a c0502a = new C0502a(this.f18708r);
                        this.f18707q = 1;
                        if (eJ.a(c0502a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18715q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18716r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$k$a$b$a, reason: collision with other inner class name */
                static final class C0504a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LockScreenFragment f18717q;

                    /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment$k$a$b$a$a, reason: collision with other inner class name */
                    public static final class ViewOnLayoutChangeListenerC0505a implements View.OnLayoutChangeListener {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LockScreenFragment f18718a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        final /* synthetic */ N1.a f18719b;

                        public ViewOnLayoutChangeListenerC0505a(LockScreenFragment lockScreenFragment, N1.a aVar) {
                            this.f18718a = lockScreenFragment;
                            this.f18719b = aVar;
                        }

                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                            view.removeOnLayoutChangeListener(this);
                            AbstractC1340u abstractC1340u = this.f18718a.f18603K;
                            if (abstractC1340u == null) {
                                kotlin.jvm.internal.n.r("binding");
                                abstractC1340u = null;
                            }
                            abstractC1340u.f20140v.d(this.f18719b);
                            this.f18718a.l().h(this.f18718a.O() ? 1.0f : 0.0f);
                        }
                    }

                    C0504a(LockScreenFragment lockScreenFragment) {
                        this.f18717q = lockScreenFragment;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(N1.a aVar, p129m8.e eVar) {
                        com.nothing.wallpaper.common.log.c.k("LockScreenFragment", "onClockSize Changed: " + aVar);
                        Workspace workspaceM = this.f18717q.M();
                        LockScreenFragment lockScreenFragment = this.f18717q;
                        if (!workspaceM.isLaidOut() || workspaceM.isLayoutRequested()) {
                            workspaceM.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0505a(lockScreenFragment, aVar));
                        } else {
                            AbstractC1340u abstractC1340u = lockScreenFragment.f18603K;
                            if (abstractC1340u == null) {
                                kotlin.jvm.internal.n.r("binding");
                                abstractC1340u = null;
                            }
                            abstractC1340u.f20140v.d(aVar);
                            lockScreenFragment.l().h(lockScreenFragment.O() ? 1.0f : 0.0f);
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18716r = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f18716r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18715q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fV = this.f18716r.getLockScreenViewModel().V();
                        C0504a c0504a = new C0504a(this.f18716r);
                        this.f18715q = 1;
                        if (interfaceC0880fV.a(c0504a, this) == objE) {
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

            static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18720q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f18721r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LockScreenFragment f18722s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18722s = lockScreenFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    c cVar = new c(this.f18722s, eVar);
                    cVar.f18721r = obj;
                    return cVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f18720q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    Boolean bool = (Boolean) this.f18721r;
                    com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "lockScreenOpenState: " + bool);
                    if (kotlin.jvm.internal.n.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
                        Z zN2 = this.f18722s.N2();
                        if (zN2 != null) {
                            Z.u(zN2, false, 1, null);
                        }
                        if (this.f18722s.A3()) {
                            this.f18722s.f18612T.postDelayed(this.f18722s.f18633o0, 3000L);
                        }
                        if (AbstractC0851a.b(this.f18722s.requireActivity().getIntent())) {
                            R7.d.f7114r.h(1);
                        } else if (AbstractC0851a.i(this.f18722s.requireActivity().getIntent())) {
                            R7.d.f7114r.h(2);
                        } else {
                            R7.d.f7114r.h(0);
                        }
                    } else if (kotlin.jvm.internal.n.d(bool, kotlin.coroutines.jvm.internal.b.a(false))) {
                        this.f18722s.k4();
                    }
                    return A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Boolean bool, p129m8.e eVar) {
                    return ((c) create(bool, eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LockScreenFragment lockScreenFragment, p129m8.e eVar) {
                super(2, eVar);
                this.f18706s = lockScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f18706s, eVar);
                aVar.f18705r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f18704q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    L l9 = (L) this.f18705r;
                    if (this.f18706s.q3()) {
                        AbstractC0816i.d(l9, null, null, new C0501a(this.f18706s, null), 3, null);
                        AbstractC0816i.d(l9, null, null, new b(this.f18706s, null), 3, null);
                    }
                    I8.A aJ = this.f18706s.T2().j();
                    c cVar = new c(this.f18706s, null);
                    this.f18704q = 1;
                    if (AbstractC0882h.i(aJ, cVar, this) == objE) {
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

        k(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return LockScreenFragment.this.new k(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((k) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18702q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                LockScreenFragment lockScreenFragment = LockScreenFragment.this;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(lockScreenFragment, null);
                this.f18702q = 1;
                if (N.b(lockScreenFragment, bVar, aVar, this) == objE) {
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

    public static final class l extends p010b.u {
        l() {
            super(true);
        }

        @Override // p010b.u
        public void d() {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = LockScreenFragment.this.requireActivity().o0().j0(R.id.fragment_container);
            if (abstractComponentCallbacksC1132qJ0 != null && (abstractComponentCallbacksC1132qJ0 instanceof com.android.wallpaper.picker.g)) {
                LockScreenFragment.this.requireActivity().o0().c1();
                return;
            }
            if (LockScreenFragment.this.E2()) {
                return;
            }
            if (LockScreenFragment.this.getLockScreenViewModel().a0()) {
                LockScreenFragment.this.z2();
            } else if (LockScreenFragment.this.getParentFragment() instanceof p068g7.k) {
                LockScreenFragment.this.I2();
            } else {
                LockScreenFragment.this.requireActivity().finish();
            }
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18724q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f18726s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f18726s = z9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A v(final LockScreenFragment lockScreenFragment, boolean z9) {
            Runnable runnableS2 = lockScreenFragment.S2();
            if (runnableS2 != null) {
                runnableS2.run();
            }
            if (z9) {
                lockScreenFragment.getLockScreenViewModel().c1();
            } else {
                com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "widgetExpand anim end");
                lockScreenFragment.l().getView().postDelayed(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        LockScreenFragment.m.w(lockScreenFragment);
                    }
                }, 100L);
            }
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(LockScreenFragment lockScreenFragment) {
            Z zN2 = lockScreenFragment.N2();
            if (zN2 != null) {
                Z.u(zN2, false, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return LockScreenFragment.this.new m(this.f18726s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((m) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18724q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fV = LockScreenFragment.this.getLockScreenViewModel().V();
                this.f18724q = 1;
                obj = AbstractC0882h.x(interfaceC0880fV, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            boolean z9 = ((N1.a) obj) == N1.a.SMALL;
            C c10 = LockScreenFragment.this.f18607O;
            if (c10 == null) {
                kotlin.jvm.internal.n.r("widgetExpandAnimation");
                c10 = null;
            }
            final boolean z10 = this.f18726s;
            final LockScreenFragment lockScreenFragment = LockScreenFragment.this;
            c10.u(z10, z9, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.b
                @Override // p219v8.a
                public final Object invoke() {
                    return LockScreenFragment.m.v(lockScreenFragment, z10);
                }
            });
            return A.f21846a;
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18727q;

        n(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return LockScreenFragment.this.new n(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((n) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18727q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fV = LockScreenFragment.this.getLockScreenViewModel().V();
                this.f18727q = 1;
                obj = AbstractC0882h.x(interfaceC0880fV, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            N1.a aVar = (N1.a) obj;
            AbstractC1340u abstractC1340u = LockScreenFragment.this.f18603K;
            if (abstractC1340u == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u = null;
            }
            abstractC1340u.f20140v.d(aVar);
            return A.f21846a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18729q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f18730r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f18731s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LockScreenFragment f18732t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z9, long j9, LockScreenFragment lockScreenFragment, p129m8.e eVar) {
            super(2, eVar);
            this.f18730r = z9;
            this.f18731s = j9;
            this.f18732t = lockScreenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new o(this.f18730r, this.f18731s, this.f18732t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((o) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18729q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                if (this.f18730r) {
                    long j9 = this.f18731s;
                    this.f18729q = 1;
                    if (W.b(j9, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            this.f18732t.I2();
            return A.f21846a;
        }
    }

    static final class p implements I, InterfaceC1458i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final /* synthetic */ p219v8.l f18733q;

        p(p219v8.l function) {
            kotlin.jvm.internal.n.h(function, "function");
            this.f18733q = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC1458i
        public final p079h8.e a() {
            return this.f18733q;
        }

        @Override // androidx.lifecycle.I
        public final /* synthetic */ void b(Object obj) {
            this.f18733q.f(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof I) && (obj instanceof InterfaceC1458i)) {
                return kotlin.jvm.internal.n.d(a(), ((InterfaceC1458i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class q extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18735b;

        q(boolean z9) {
            this.f18735b = z9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            LockScreenFragment.this.J3(this.f18735b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            LockScreenFragment.this.J3(true);
        }
    }

    public static final class r extends AnimatorListenerAdapter {
        r() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            LockScreenFragment.this.f18612T.postDelayed(LockScreenFragment.this.f18633o0, 3000L);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            LockScreenFragment.this.P3();
        }
    }

    public static final class s extends AnimatorListenerAdapter {
        s() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            Z zN2 = LockScreenFragment.this.N2();
            if (zN2 != null) {
                Z.u(zN2, false, 1, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            LockScreenFragment.this.l().getView().setAlpha(0.0f);
            LockScreenFragment.this.l().getView().setVisibility(0);
            LockScreenFragment.this.M().setAlpha(0.0f);
            LockScreenFragment.this.M().setVisibility(new UserHandle(UserHandle.myUserId()).isSystem() ? 0 : 8);
        }
    }

    public static final class t extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f18738r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f18738r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f18738r.requireActivity().getViewModelStore();
        }
    }

    public static final class u extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18739r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f18740s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f18739r = aVar;
            this.f18740s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f18739r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f18740s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class v extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f18741r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f18741r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f18741r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2() {
        ArrayList arrayList = new ArrayList();
        List<View> allChildren = M().getAllChildren();
        kotlin.jvm.internal.n.g(allChildren, "getAllChildren(...)");
        List<View> list = allChildren;
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list, 10));
        for (View view : list) {
            Object tag = view.getTag();
            kotlin.jvm.internal.n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
            arrayList2.add(p079h8.v.a(view, (com.nothing.launcher.card.t) tag));
        }
        ArrayList<p079h8.o> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            p079h8.o oVar = (p079h8.o) obj;
            ((com.nothing.launcher.card.t) oVar.d()).r(-1);
            ((com.nothing.launcher.card.t) oVar.d()).s(-1);
            if (((com.nothing.launcher.card.t) oVar.d()).n()) {
                arrayList3.add(obj);
            }
        }
        for (p079h8.o oVar2 : arrayList3) {
            com.nothing.wallpaper.common.log.c.k("LockScreenFragment", "checkToDelete:" + ((com.nothing.launcher.card.t) oVar2.d()).m());
            Object objC = oVar2.c();
            kotlin.jvm.internal.n.g(objC, "<get-first>(...)");
            LockScreenFragment lockScreenFragment = this;
            S.d1(lockScreenFragment, (View) objC, (com.nothing.launcher.card.t) oVar2.d(), false, 4, null);
            arrayList.add(Integer.valueOf(((com.nothing.launcher.card.t) oVar2.d()).m()));
            this = lockScreenFragment;
        }
        LockScreenFragment lockScreenFragment2 = this;
        if (lockScreenFragment2.getLockScreenViewModel().a0()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lockScreenFragment2.R().D(((Number) it.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A3() {
        Z z9 = this.f18626h0;
        return z9 != null && z9.H();
    }

    private final void B3() {
        Z z9 = this.f18626h0;
        if (z9 != null) {
            z9.J();
        }
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new i(null), 3, null);
        InterfaceC1163x viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner2), null, null, new j(null), 3, null);
        InterfaceC1163x viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner3), null, null, new k(null), 3, null);
        getLockScreenViewModel().Q().h(getViewLifecycleOwner(), new p(new p219v8.l() { // from class: E7.h
            @Override // p219v8.l
            public final Object f(Object obj) {
                return LockScreenFragment.C3(this.f1425q, (LoadingState) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(LockScreenFragment lockScreenFragment) {
        AbstractC1340u abstractC1340u = lockScreenFragment.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        ImageView imageView = abstractC1340u.f20135N;
        kotlin.jvm.internal.n.e(imageView);
        imageView.setVisibility(8);
        imageView.setImageBitmap(null);
        p098j7.m.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A C3(LockScreenFragment lockScreenFragment, LoadingState loadingState) {
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "saving state change:" + loadingState);
        kotlin.jvm.internal.n.e(loadingState);
        lockScreenFragment.W2(loadingState);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S1.a D2(LockScreenFragment lockScreenFragment) {
        K6.c cVarN0 = lockScreenFragment.N0();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = lockScreenFragment.requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        return cVarN0.d0(abstractActivityC1136vRequireActivity);
    }

    private final void D3(String str) {
        getLockScreenViewModel().X0(str);
        if (A7.d.f308a.h(str)) {
            getLockScreenViewModel().t0();
        }
        Z z9 = this.f18626h0;
        if (z9 != null) {
            z9.t(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E2() {
        AbstractC1219a abstractC1219aF = AbstractC1219a.F(O0());
        if (abstractC1219aF == null || !abstractC1219aF.B()) {
            return false;
        }
        abstractC1219aF.onBackInvoked();
        return true;
    }

    private final void F2() {
        AbstractC0816i.d(AbstractC1164y.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3() {
        if (this.f18615W != -1) {
            l().getView().setImportantForAccessibility(this.f18615W);
            this.f18615W = -1;
        }
        M().f(0).getEmptyView().setImportantForAccessibility(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I7.b H2(LockScreenFragment lockScreenFragment) {
        return new I7.b(new I7.f(lockScreenFragment.getLockScreenViewModel(), lockScreenFragment), new I7.a(lockScreenFragment.getLockScreenViewModel()), new I7.c(lockScreenFragment.getLockScreenViewModel()), new I7.d(lockScreenFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        if (!(getParentFragment() instanceof p068g7.k) || h()) {
            return;
        }
        AbstractComponentCallbacksC1132q parentFragment = getParentFragment();
        kotlin.jvm.internal.n.f(parentFragment, "null cannot be cast to non-null type com.nothing.wallpaper.picker.customization.ui.fragment.NTCustomizationPickerFragment");
        ((p068g7.k) parentFragment).o1();
    }

    private final void J2(boolean z9, long j9) {
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "exitPage");
        AbstractC0816i.d(AbstractC1164y.a(this), null, null, new d(z9, j9, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(boolean z9) {
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        TextView actionDone = abstractC1340u.f20142x;
        kotlin.jvm.internal.n.g(actionDone, "actionDone");
        actionDone.setVisibility(!z9 ? 4 : 0);
        TextView actionCancel = abstractC1340u.f20141w;
        kotlin.jvm.internal.n.g(actionCancel, "actionCancel");
        actionCancel.setVisibility(z9 ? 0 : 4);
    }

    static /* synthetic */ void K2(LockScreenFragment lockScreenFragment, boolean z9, long j9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j9 = 100;
        }
        lockScreenFragment.J2(z9, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(boolean z9) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E7.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LockScreenFragment.L3(this.f1438a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new q(z9));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L2() {
        this.f18615W = l().getView().getImportantForAccessibility();
        l().getView().setImportantForAccessibility(4);
        M().f(0).getEmptyView().setImportantForAccessibility(M().f(0).getShortcutsAndWidgets().getChildCount() != 0 ? 1 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(LockScreenFragment lockScreenFragment, ValueAnimator animation) {
        kotlin.jvm.internal.n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        AbstractC1340u abstractC1340u = lockScreenFragment.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        abstractC1340u.f20142x.setAlpha(fFloatValue);
        abstractC1340u.f20141w.setAlpha(fFloatValue);
    }

    private final void M3() {
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        F2.h hVar = F2.h.f1567a;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        p079h8.o oVarB = hVar.b(contextRequireContext);
        abstractC1340u.f20142x.setBackgroundTintList((ColorStateList) oVarB.c());
        abstractC1340u.f20141w.setBackgroundTintList((ColorStateList) oVarB.c());
        abstractC1340u.f20142x.setTextColor(((Number) oVarB.d()).intValue());
        abstractC1340u.f20141w.setTextColor(((Number) oVarB.d()).intValue());
        abstractC1340u.f20144z.setImageTintList((ColorStateList) oVarB.c());
        RoundedOverlayImageView roundedOverlayImageView = abstractC1340u.f20138Q;
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext2, "requireContext(...)");
        roundedOverlayImageView.setOverlayColor(hVar.j(contextRequireContext2));
    }

    private final I7.b O2() {
        return (I7.b) this.f18627i0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P3() {
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        abstractC1340u.f20131J.setVisibility(A3() ? 0 : 8);
        if (getLockScreenViewModel().a0()) {
            abstractC1340u.f20144z.setVisibility(z3() ? 0 : 8);
            abstractC1340u.f20138Q.setVisibility(0);
            J3(true);
        } else {
            abstractC1340u.f20122A.setVisibility(0);
        }
        abstractC1340u.f20128G.setVisibility(0);
    }

    private final int R2() {
        return ((Number) this.f18601I.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R3(LockScreenFragment lockScreenFragment) {
        return lockScreenFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.nt_shortcut_slot_margin_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S3() {
        ClockPickerBottomSheet clockPickerBottomSheet = this.f18606N;
        if (clockPickerBottomSheet == null || !clockPickerBottomSheet.K()) {
            this.f18606N = ClockPickerBottomSheet.b.b(ClockPickerBottomSheet.f18844b0, this, false, 2, null);
            L2();
            ClockPickerBottomSheet clockPickerBottomSheet2 = this.f18606N;
            if (clockPickerBottomSheet2 != null) {
                clockPickerBottomSheet2.setOnCloseBeginListener(new com.android.launcher3.views.e.c() { // from class: E7.G
                    @Override // com.android.launcher3.views.e.c
                    public final void a() {
                        LockScreenFragment.T3(this.f1316a);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(LockScreenFragment lockScreenFragment) {
        lockScreenFragment.F3();
        lockScreenFragment.T2().f();
    }

    private final int U2() {
        return ((Number) this.f18600H.getValue()).intValue();
    }

    private final void U3() {
        AlertDialog alertDialogE;
        X7.i iVar = this.f18629k0;
        if (iVar == null || (alertDialogE = iVar.e()) == null || !alertDialogE.isShowing()) {
            String string = getString(R.string.depth_effect_discard);
            kotlin.jvm.internal.n.g(string, "getString(...)");
            W7.a aVar = new W7.a(string, new p219v8.a() { // from class: E7.v
                @Override // p219v8.a
                public final Object invoke() {
                    return LockScreenFragment.V3(this.f1439q);
                }
            }, W7.b.Warning, false, 8, null);
            String string2 = getString(R.string.depth_effect_continue_editing);
            kotlin.jvm.internal.n.g(string2, "getString(...)");
            List listN = AbstractC1444s.n(aVar, new W7.a(string2, new p219v8.a() { // from class: E7.w
                @Override // p219v8.a
                public final Object invoke() {
                    return LockScreenFragment.W3();
                }
            }, W7.b.Normal, false, 8, null));
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
            X7.i iVar2 = new X7.i(contextRequireContext, listN, true);
            this.f18629k0 = iVar2;
            String string3 = getString(R.string.depth_effect_discard_change);
            kotlin.jvm.internal.n.g(string3, "getString(...)");
            iVar2.q(string3);
            iVar2.p("");
            iVar2.n(true);
            iVar2.o(true);
            iVar2.r();
        }
    }

    private final androidx.core.view.W V2() {
        return (androidx.core.view.W) this.f18617Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A V3(LockScreenFragment lockScreenFragment) {
        lockScreenFragment.H3();
        K2(lockScreenFragment, true, 0L, 2, null);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A W3() {
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(LockScreenFragment lockScreenFragment) {
        AbstractC1340u abstractC1340u = lockScreenFragment.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        abstractC1340u.f20131J.setVisibility(8);
        Z z9 = lockScreenFragment.f18626h0;
        if (z9 != null) {
            z9.N();
        }
    }

    private final void X3() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        Boolean bool = (Boolean) getLockScreenViewModel().M().getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Z z9 = this.f18626h0;
        AbstractC1340u abstractC1340u = null;
        final C0773e c0773e = new C0773e(contextRequireContext, zBooleanValue, z9 != null ? z9.w() : null);
        c0773e.f(new p219v8.p() { // from class: E7.H
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return LockScreenFragment.Y3(this.f1317q, c0773e, ((Boolean) obj).booleanValue(), (EnumC0774f) obj2);
            }
        });
        AbstractC1340u abstractC1340u2 = this.f18603K;
        if (abstractC1340u2 == null) {
            kotlin.jvm.internal.n.r("binding");
        } else {
            abstractC1340u = abstractC1340u2;
        }
        ImageButton btnEffects = abstractC1340u.f20144z;
        kotlin.jvm.internal.n.g(btnEffects, "btnEffects");
        c0773e.g(btnEffects);
    }

    private final void Y2() {
        V2().e(2);
        V2().a(V.k.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A Y3(LockScreenFragment lockScreenFragment, C0773e c0773e, boolean z9, EnumC0774f effectType) {
        Z z10;
        kotlin.jvm.internal.n.h(effectType, "effectType");
        EnumC0774f enumC0774f = EnumC0774f.EFFECT_DEPTH_ON;
        if ((effectType == enumC0774f || effectType == EnumC0774f.EFFECT_NONE) && (z10 = lockScreenFragment.f18626h0) != null) {
            z10.Y(z9, effectType == enumC0774f);
        }
        c0773e.dismiss();
        return A.f21846a;
    }

    private final void a3() {
        AbstractC1340u abstractC1340u = this.f18603K;
        AbstractC1340u abstractC1340u2 = null;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        Bitmap bitmapB = p098j7.m.f22528a.b();
        if (bitmapB != null) {
            if (bitmapB.isRecycled()) {
                p098j7.m.c();
            } else {
                ImageView wallpaperImagePreload = abstractC1340u.f20135N;
                kotlin.jvm.internal.n.g(wallpaperImagePreload, "wallpaperImagePreload");
                wallpaperImagePreload.setVisibility(0);
                ImageView wallpaperImagePreload2 = abstractC1340u.f20135N;
                kotlin.jvm.internal.n.g(wallpaperImagePreload2, "wallpaperImagePreload");
                p098j7.m.f(wallpaperImagePreload2, bitmapB);
            }
        }
        if (w3()) {
            abstractC1340u.f20140v.setOnClickListener(new View.OnClickListener() { // from class: E7.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LockScreenFragment.b3(this.f1426q, view);
                }
            });
        } else {
            AccessibilityCellLayout accessibilityLayout = abstractC1340u.f20140v;
            kotlin.jvm.internal.n.g(accessibilityLayout, "accessibilityLayout");
            accessibilityLayout.setVisibility(8);
        }
        View view = l().getView();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = l().getView() instanceof ClockHostEditPreview ? K().j() - K().h() : K().j();
        view.setLayoutParams(marginLayoutParams);
        com.nothing.wallpaper.picker.lockscreen.ui.view.E eL = l();
        J7.i lockScreenViewModel = getLockScreenViewModel();
        S1.a clockViewFactory = getClockViewFactory();
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        G7.d.f(eL, lockScreenViewModel, clockViewFactory, viewLifecycleOwner);
        abstractC1340u.f20124C.setOnClockSelectedListener(new p219v8.l() { // from class: E7.j
            @Override // p219v8.l
            public final Object f(Object obj) {
                return LockScreenFragment.c3(this.f1427q, (String) obj);
            }
        });
        l().setOnClockChangedListener(new p219v8.l() { // from class: E7.k
            @Override // p219v8.l
            public final Object f(Object obj) {
                return LockScreenFragment.d3(this.f1428q, (String) obj);
            }
        });
        this.f18607O = new C(this, l());
        if (l().getView() instanceof ClockHostEditPreview) {
            l().getView().setOnClickListener(new View.OnClickListener() { // from class: E7.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LockScreenFragment.e3(this.f1429q, view2);
                }
            });
        }
        this.f18607O = new C(this, l());
        abstractC1340u.f20128G.setOnSlotListener(new g());
        if (getLockScreenViewModel().a0()) {
            l4();
            M3();
            AbstractC1340u abstractC1340u3 = this.f18603K;
            if (abstractC1340u3 == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u3 = null;
            }
            abstractC1340u3.f20144z.setOnClickListener(new View.OnClickListener() { // from class: E7.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LockScreenFragment.f3(this.f1430q, view2);
                }
            });
            abstractC1340u.f20142x.setOnClickListener(new View.OnClickListener() { // from class: E7.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LockScreenFragment.h3(this.f1431q, view2);
                }
            });
            abstractC1340u.f20141w.setOnClickListener(new View.OnClickListener() { // from class: E7.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LockScreenFragment.j3(this.f1432q, view2);
                }
            });
            abstractC1340u.f20138Q.setOnClickListener(new View.OnClickListener() { // from class: E7.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LockScreenFragment.l3(this.f1433q, view2);
                }
            });
            if (!t3()) {
                ViewGroup.LayoutParams layoutParams2 = abstractC1340u.f20138Q.getLayoutParams();
                kotlin.jvm.internal.n.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.LayoutParams layoutParams3 = abstractC1340u.f20144z.getLayoutParams();
                kotlin.jvm.internal.n.f(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_thumbnail_margin_bottom);
                int dimensionPixelSize2 = requireContext().getResources().getDimensionPixelSize(R.dimen.effects_btn_margin_bottom);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = R2() + dimensionPixelSize;
                ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = R2() + dimensionPixelSize2;
            }
        } else {
            abstractC1340u.f20122A.setOnClickListener(new View.OnClickListener() { // from class: E7.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LockScreenFragment.n3(this.f1434q, view2);
                }
            });
            F2.h hVar = F2.h.f1567a;
            Button btnWallpaper = abstractC1340u.f20122A;
            kotlin.jvm.internal.n.g(btnWallpaper, "btnWallpaper");
            hVar.n(btnWallpaper, R.drawable.btn_hollow_oval, R.drawable.btn_hollow_oval_dark);
            if (!t3()) {
                ViewGroup.LayoutParams layoutParams4 = abstractC1340u.f20122A.getLayoutParams();
                kotlin.jvm.internal.n.f(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = R2() + requireContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_btn_margin_bottom);
            }
        }
        if (!t3()) {
            ViewGroup.LayoutParams layoutParams5 = abstractC1340u.f20128G.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = R2() + U2();
        }
        CardView translationAll = abstractC1340u.f20129H;
        kotlin.jvm.internal.n.g(translationAll, "translationAll");
        if (!translationAll.isLaidOut() || translationAll.isLayoutRequested()) {
            translationAll.addOnLayoutChangeListener(new h());
        } else {
            AbstractC1340u abstractC1340u4 = this.f18603K;
            if (abstractC1340u4 == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u4 = null;
            }
            this.f18609Q = new p248y7.r(abstractC1340u4, l(), O0(), T2());
        }
        G7.v vVar = G7.v.f2149a;
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        AbstractC1340u abstractC1340u5 = this.f18603K;
        if (abstractC1340u5 == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u5 = null;
        }
        CardView wallpaperPreview = abstractC1340u5.f20136O;
        kotlin.jvm.internal.n.g(wallpaperPreview, "wallpaperPreview");
        InterfaceC1163x viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        e eVar = new e(getLockScreenViewModel());
        p064g3.v vVarI = N0().i();
        K6.c cVarN0 = N0();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        H3.k kVarE = cVarN0.e(contextRequireContext);
        AbstractActivityC1136v abstractActivityC1136vRequireActivity2 = requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity2, "requireActivity(...)");
        G7.v.j(abstractActivityC1136vRequireActivity, wallpaperPreview, vVarI, eVar, viewLifecycleOwner2, kVarE.o(abstractActivityC1136vRequireActivity2), !v3(), new p219v8.a() { // from class: E7.s
            @Override // p219v8.a
            public final Object invoke() {
                return LockScreenFragment.p3(this.f1436q);
            }
        }, new f());
        abstractC1340u.f20131J.setTranslationY(K().f15544M);
        if (getLockScreenViewModel().a0()) {
            AbstractC1340u abstractC1340u6 = this.f18603K;
            if (abstractC1340u6 == null) {
                kotlin.jvm.internal.n.r("binding");
            } else {
                abstractC1340u2 = abstractC1340u6;
            }
            this.f18626h0 = new Z(this, abstractC1340u2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a4() {
        ShortCutPickerBottomSheet shortCutPickerBottomSheet = this.f18605M;
        if (shortCutPickerBottomSheet == null || !shortCutPickerBottomSheet.K()) {
            ShortCutPickerBottomSheet shortCutPickerBottomSheetB = ShortCutPickerBottomSheet.a.b(ShortCutPickerBottomSheet.f18959U, this, false, 2, null);
            this.f18605M = shortCutPickerBottomSheetB;
            if (shortCutPickerBottomSheetB != null) {
                shortCutPickerBottomSheetB.setOnCloseBeginListener(new com.android.launcher3.views.e.c() { // from class: E7.F
                    @Override // com.android.launcher3.views.e.c
                    public final void a() {
                        LockScreenFragment.b4(this.f1315a);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(LockScreenFragment lockScreenFragment, View view) {
        lockScreenFragment.requireView().performHapticFeedback(4);
        lockScreenFragment.T2().t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(LockScreenFragment lockScreenFragment) {
        lockScreenFragment.T2().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A c3(LockScreenFragment lockScreenFragment, String clockId) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        lockScreenFragment.D3(clockId);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c4() {
        V2().f(V.k.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A d3(LockScreenFragment lockScreenFragment, String str) {
        boolean zR0 = lockScreenFragment.getLockScreenViewModel().r0();
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "onClockChanged " + zR0);
        Z z9 = lockScreenFragment.f18626h0;
        if (z9 != null) {
            z9.t(zR0);
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(LockScreenFragment lockScreenFragment, View view) {
        if (lockScreenFragment.K().f15567e0) {
            return;
        }
        if (!lockScreenFragment.T2().o()) {
            lockScreenFragment.T2().r();
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = "";
        }
        if (A7.d.f308a.h(str)) {
            S1.a clockViewFactory = lockScreenFragment.getClockViewFactory();
            kotlin.jvm.internal.n.f(clockViewFactory, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.NTClockViewFactoryImpl");
            Context contextRequireContext = lockScreenFragment.requireContext();
            kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
            ((H) clockViewFactory).H(contextRequireContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(AbstractC1340u abstractC1340u, LockScreenFragment lockScreenFragment, ValueAnimator animation) {
        kotlin.jvm.internal.n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        abstractC1340u.f20128G.setAlpha(fFloatValue);
        if (lockScreenFragment.getLockScreenViewModel().a0()) {
            abstractC1340u.f20138Q.setAlpha(fFloatValue);
            abstractC1340u.f20142x.setAlpha(fFloatValue);
            abstractC1340u.f20141w.setAlpha(fFloatValue);
        } else {
            abstractC1340u.f20122A.setAlpha(fFloatValue);
        }
        if (lockScreenFragment.z3()) {
            abstractC1340u.f20144z.setAlpha(fFloatValue);
        }
        if (lockScreenFragment.A3()) {
            abstractC1340u.f20131J.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(final LockScreenFragment lockScreenFragment, View view) {
        p087i6.b.a(new p219v8.a() { // from class: E7.D
            @Override // p219v8.a
            public final Object invoke() {
                return LockScreenFragment.g3(this.f1312q);
            }
        });
    }

    private final void f4() {
        this.f18612T.postDelayed(this.f18632n0, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g3(LockScreenFragment lockScreenFragment) {
        lockScreenFragment.X3();
        return A.f21846a;
    }

    private final void g4() {
        l().getView().setVisibility(0);
        M().setVisibility(w3() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(final LockScreenFragment lockScreenFragment, View view) {
        p087i6.b.a(new p219v8.a() { // from class: E7.A
            @Override // p219v8.a
            public final Object invoke() {
                return LockScreenFragment.i3(this.f1308q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(final LockScreenFragment lockScreenFragment) {
        if (lockScreenFragment.M().getVisibility() == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        lockScreenFragment.f18611S = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E7.z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LockScreenFragment.i4(this.f1443a, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(lockScreenFragment.new s());
        }
        ValueAnimator valueAnimator = lockScreenFragment.f18611S;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i3(LockScreenFragment lockScreenFragment) {
        if (lockScreenFragment.E2()) {
            return A.f21846a;
        }
        if (lockScreenFragment.s3()) {
            lockScreenFragment.I3();
        } else {
            K2(lockScreenFragment, false, 0L, 2, null);
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(LockScreenFragment lockScreenFragment, ValueAnimator animation) {
        kotlin.jvm.internal.n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        lockScreenFragment.M().setAlpha(fFloatValue);
        lockScreenFragment.l().getView().setAlpha(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(final LockScreenFragment lockScreenFragment, View view) {
        p087i6.b.a(new p219v8.a() { // from class: E7.y
            @Override // p219v8.a
            public final Object invoke() {
                return LockScreenFragment.k3(this.f1442q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4() {
        if (this.f18624f0 && this.f18623e0) {
            if (v3()) {
                f4();
            } else {
                g4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A k3(LockScreenFragment lockScreenFragment) {
        if (lockScreenFragment.E2()) {
            return A.f21846a;
        }
        boolean zS3 = lockScreenFragment.s3();
        if (zS3) {
            lockScreenFragment.H3();
        }
        K2(lockScreenFragment, zS3, 0L, 2, null);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k4() {
        R7.d.f7114r.g(this.f18619a0, this.f18618Z, this.f18620b0, getLockScreenViewModel().Y(), this.f18621c0, this.f18622d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(final LockScreenFragment lockScreenFragment, final View view) {
        p087i6.b.a(new p219v8.a() { // from class: E7.B
            @Override // p219v8.a
            public final Object invoke() {
                return LockScreenFragment.m3(view, lockScreenFragment);
            }
        });
    }

    private final void l4() {
        if (p087i6.e.m()) {
            AbstractC1340u abstractC1340u = this.f18603K;
            if (abstractC1340u == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u = null;
            }
            ViewGroup.LayoutParams layoutParams = abstractC1340u.f20142x.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.LayoutParams layoutParams2 = abstractC1340u.f20141w.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int dimensionPixelSize = (int) (((double) requireContext().getResources().getDimensionPixelSize(R.dimen.lock_screen_action_button_margin_top)) * 0.7d);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimensionPixelSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A m3(View view, LockScreenFragment lockScreenFragment) {
        view.performHapticFeedback(4);
        lockScreenFragment.o4();
        R7.d.f7114r.i();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(final LockScreenFragment lockScreenFragment, final View view) {
        p087i6.b.a(new p219v8.a() { // from class: E7.E
            @Override // p219v8.a
            public final Object invoke() {
                return LockScreenFragment.o3(view, lockScreenFragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o3(View view, LockScreenFragment lockScreenFragment) {
        view.performHapticFeedback(4);
        lockScreenFragment.o4();
        R7.d.f7114r.i();
        return A.f21846a;
    }

    private final void o4() {
        J jO0 = requireActivity().o0();
        kotlin.jvm.internal.n.g(jO0, "getSupportFragmentManager(...)");
        com.android.wallpaper.picker.g gVar = new com.android.wallpaper.picker.g();
        gVar.setArguments(p231x0.d.a(new p079h8.o("key_padding_top", Integer.valueOf(w.b(48.0f))), new p079h8.o("key_is_lock_screen", Boolean.TRUE)));
        jO0.p().b(R.id.fragment_container, gVar).g(null).i();
        jO0.g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A p3(LockScreenFragment lockScreenFragment) {
        lockScreenFragment.E3();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.core.view.W p4(LockScreenFragment lockScreenFragment) {
        Window window = lockScreenFragment.requireActivity().getWindow();
        return T.a(window, window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q3() {
        return ((Boolean) this.f18616X.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r3() {
        return p087i6.e.j();
    }

    private final boolean s3() {
        return O2().a();
    }

    private final boolean t3() {
        return ((Boolean) this.f18602J.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(LockScreenFragment lockScreenFragment) {
        Context contextRequireContext = lockScreenFragment.requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        return p087i6.q.e(contextRequireContext);
    }

    private final boolean v3() {
        return this.f18613U == null && T2().l() && this.f18610R == null;
    }

    private final boolean w3() {
        return new UserHandle(UserHandle.myUserId()).isSystem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J7.i x3(LockScreenFragment lockScreenFragment) {
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = lockScreenFragment.requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        K6.c cVarN0 = lockScreenFragment.N0();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity2 = lockScreenFragment.requireActivity();
        kotlin.jvm.internal.n.g(abstractActivityC1136vRequireActivity2, "requireActivity(...)");
        return (J7.i) new d0(abstractActivityC1136vRequireActivity, cVarN0.K0(abstractActivityC1136vRequireActivity2)).b(J7.i.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y3(LockScreenFragment lockScreenFragment) {
        Context contextRequireContext = lockScreenFragment.requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        return p087i6.q.b(contextRequireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2() {
        if (s3()) {
            U3();
        } else {
            K2(this, false, 0L, 2, null);
        }
    }

    private final boolean z3() {
        Z z9 = this.f18626h0;
        return z9 != null && z9.I();
    }

    public final void B2() {
        this.f18612T.postDelayed(new Runnable() { // from class: E7.t
            @Override // java.lang.Runnable
            public final void run() {
                LockScreenFragment.C2(this.f1437q);
            }
        }, 400L);
    }

    @Override // E7.InterfaceC0769a
    public void C(com.nothing.launcher.card.m info) {
        kotlin.jvm.internal.n.h(info, "info");
        int[] iArr = new int[2];
        if (!M().f(info.f594r).p(iArr, info.f597u, info.f598v)) {
            Toast.makeText(requireContext(), getString(R.string.not_enough_space), 0).show();
            return;
        }
        Context context = M().getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        info.q(info.o(context));
        info.f592D = 5;
        U(info, iArr, info.f597u, info.f598v);
    }

    public final void E3() {
        this.f18623e0 = true;
        float f10 = this.f18614V;
        if (f10 == -1.0f) {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("showPreviewDimmingScrim")) {
                n4(1.0f);
            }
        } else {
            n4(f10);
        }
        d4();
    }

    @Override // E7.InterfaceC0769a
    public void G(float f10) {
        if (isDetached() || getContext() == null) {
            return;
        }
        float f11 = -(1 - f10);
        ShortCutPickerBottomSheet shortCutPickerBottomSheet = this.f18605M;
        float contentHeight = (shortCutPickerBottomSheet != null ? shortCutPickerBottomSheet.getContentHeight() : 0) * f11;
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        p248y7.r rVar = this.f18609Q;
        if (rVar != null) {
            rVar.j(f10);
        }
        FrameLayout frameLayout = abstractC1340u.f20130I;
        frameLayout.setTranslationY(contentHeight);
        frameLayout.setAlpha(f10);
        kotlin.jvm.internal.n.e(frameLayout);
        frameLayout.setVisibility((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
        View view = l().getView();
        view.setTranslationY(contentHeight);
        view.setAlpha(f10);
        view.setVisibility(f10 > 0.0f ? 0 : 8);
        ShortCutPreview shortCutPreview = abstractC1340u.f20128G;
        shortCutPreview.setTranslationY(contentHeight);
        shortCutPreview.setAnimAlpha(f10);
        if (!t3()) {
            ViewGroup.LayoutParams layoutParams = shortCutPreview.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = U2() + ((int) (f10 * R2()));
            shortCutPreview.requestLayout();
        }
        abstractC1340u.f20136O.setTranslationY(f11 * K().f15549R);
        abstractC1340u.f20133L.setTranslationY(abstractC1340u.f20136O.getTranslationY());
    }

    @Override // p248y7.S
    public void G0(int i10) {
        getLockScreenViewModel().C(i10);
        A2();
        M().k0();
    }

    public final AnimatorSet G2(boolean z9) {
        AnimatorSet animatorSetD;
        if (z9) {
            Y2();
            p010b.v vVarF = requireActivity().f();
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            vVarF.h(viewLifecycleOwner, this.f18631m0);
        }
        p248y7.r rVar = this.f18609Q;
        if (rVar == null || (animatorSetD = rVar.d(z9)) == null) {
            return null;
        }
        animatorSetD.addListener(new c(z9, this));
        return animatorSetD;
    }

    public final void G3(boolean z9, long j9) {
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "reset and exit");
        E2();
        getLockScreenViewModel().y0();
        p098j7.j jVar = this.f18595C;
        if (jVar != null) {
            jVar.M0();
        }
        AbstractC0816i.d(AbstractC1164y.a(this), null, null, new o(z9, j9, this, null), 3, null);
    }

    public final void H3() {
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "restoreChange");
        O2().c();
    }

    public final void I3() {
        boolean z9 = s3() && !O2().b();
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "saveChange notify saving:" + z9);
        if (z9) {
            getLockScreenViewModel().x0();
        }
        O2().d();
        if (z9) {
            getLockScreenViewModel().w0();
        }
    }

    @Override // com.android.launcher3.views.f
    public DragLayer J() {
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        DragLayer dragLayer = abstractC1340u.f20125D;
        kotlin.jvm.internal.n.g(dragLayer, "dragLayer");
        return dragLayer;
    }

    @Override // E7.InterfaceC0769a
    public void L(float f10) {
        if (isDetached() || getContext() == null || p().y()) {
            return;
        }
        float f11 = 1 - f10;
        M().i0(f11);
        M().setGridAlpha(f11);
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        abstractC1340u.f20128G.setAlpha(f11);
        p248y7.r rVar = this.f18609Q;
        if (rVar != null) {
            rVar.k(f10);
        }
    }

    @Override // com.android.launcher3.views.f
    public Workspace M() {
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        Workspace workspace = abstractC1340u.f20139R;
        kotlin.jvm.internal.n.g(workspace, "workspace");
        return workspace;
    }

    public final p148o7.g M2() {
        return this.f18596D;
    }

    @Override // E7.InterfaceC0769a
    public ShortCutPreview N() {
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        ShortCutPreview shortcutPreview = abstractC1340u.f20128G;
        kotlin.jvm.internal.n.g(shortcutPreview, "shortcutPreview");
        return shortcutPreview;
    }

    public final Z N2() {
        return this.f18626h0;
    }

    public final void N3(boolean z9) {
        this.f18619a0 = z9;
    }

    @Override // com.android.launcher3.views.f
    public boolean O() {
        return T2().i();
    }

    public final void O3(Runnable runnable) {
        this.f18630l0 = runnable;
    }

    public final p098j7.j P2() {
        return this.f18595C;
    }

    @Override // com.android.launcher3.views.f
    public boolean Q() {
        WidgetPickerBottomSheet widgetPickerBottomSheet = this.f18604L;
        return widgetPickerBottomSheet != null && widgetPickerBottomSheet.K();
    }

    public final boolean Q2() {
        return this.f18619a0;
    }

    public final void Q3(x wallpaper, p158p7.a editFrom) {
        x xVar;
        D6.f cVar;
        p237x6.k kVar;
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        kotlin.jvm.internal.n.h(editFrom, "editFrom");
        Context applicationContext = requireContext().getApplicationContext();
        kotlin.jvm.internal.n.e(applicationContext);
        com.nothing.wallpaper.common.log.c.k("LockScreenFragment", "setupWallpaper " + G6.g.d(wallpaper, applicationContext));
        if (G6.e.s(wallpaper)) {
            xVar = wallpaper;
            cVar = new D6.b(applicationContext, xVar, G6.e.i(wallpaper), !wallpaper.s(), true);
        } else {
            xVar = wallpaper;
            cVar = new D6.c(applicationContext, xVar);
        }
        if (G6.e.s(xVar)) {
            C6.g gVarK = xVar.k();
            com.android.wallpaper.asset.a aVarE = G6.e.e(xVar, applicationContext);
            p074h3.H hA = p074h3.I.a();
            kotlin.jvm.internal.n.f(hA, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector");
            kVar = new p237x6.k(((K1.a) hA).o(applicationContext), applicationContext, aVarE, gVarK != null ? gVarK.d() : null);
        } else {
            kVar = null;
        }
        d0.c cVarA = p098j7.n.a(editFrom, xVar, kVar, cVar);
        this.f18595C = (p098j7.j) new d0(this, cVarA).b(p098j7.j.class);
        this.f18596D = G6.e.s(xVar) ? (p148o7.g) new d0(this, cVarA).b(p148o7.g.class) : null;
        p098j7.j jVar = this.f18595C;
        if (jVar != null) {
            jVar.W0(getLockScreenViewModel());
        }
        p098j7.j jVar2 = this.f18595C;
        if (jVar2 != null) {
            jVar2.U0(this.f18596D);
        }
        p098j7.j jVar3 = this.f18595C;
        if (jVar3 != null) {
            jVar3.L0();
        }
        if (kotlin.jvm.internal.n.d(T2().j().getValue(), Boolean.TRUE) && A3()) {
            this.f18612T.postDelayed(this.f18633o0, 3000L);
        }
    }

    public final Runnable S2() {
        return this.f18630l0;
    }

    @Override // E7.InterfaceC0769a
    public void T() {
        f1(null);
    }

    public final J7.b T2() {
        return (J7.b) this.f18598F.getValue();
    }

    public final void W2(LoadingState state) {
        Window window;
        kotlin.jvm.internal.n.h(state, "state");
        if (kotlin.jvm.internal.n.d(state, LoadingState.Silence.INSTANCE)) {
            Z3();
            ProgressDialog progressDialog = this.f18628j0;
            if (progressDialog == null || (window = progressDialog.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = 1;
            attributes.height = 1;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            return;
        }
        if (kotlin.jvm.internal.n.d(state, LoadingState.Loading.INSTANCE)) {
            Z3();
            return;
        }
        if (state instanceof LoadingState.End) {
            try {
                ProgressDialog progressDialog2 = this.f18628j0;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
            } catch (Exception e10) {
                com.nothing.wallpaper.common.log.c.f("LockScreenFragment", "dismiss error:" + e10.getMessage());
            }
            if (((LoadingState.End) state).getSuccess()) {
                J2(true, 400L);
            }
            this.f18628j0 = null;
        }
    }

    public final void Z2() {
        p248y7.r rVar = this.f18609Q;
        if (rVar != null) {
            rVar.f();
        }
        Y2();
        p010b.v vVarF = requireActivity().f();
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        vVarF.h(viewLifecycleOwner, this.f18631m0);
    }

    public final void Z3() {
        ProgressDialog progressDialog = this.f18628j0;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ProgressDialog progressDialog2 = new ProgressDialog(getContext(), R.style.LightDialogTheme);
        progressDialog2.setTitle((CharSequence) null);
        progressDialog2.setMessage(progressDialog2.getContext().getString(R.string.depth_effect_applying));
        progressDialog2.setInverseBackgroundForced(true);
        progressDialog2.setCanceledOnTouchOutside(false);
        progressDialog2.setCancelable(false);
        progressDialog2.show();
        this.f18628j0 = progressDialog2;
    }

    @Override // E7.InterfaceC0769a
    public void a(boolean z9) {
        M().setTag(Boolean.TRUE);
        getLockScreenViewModel().D(z9);
    }

    @Override // com.android.launcher3.l
    public void b(boolean z9) {
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "onIdpChanged " + z9);
        Workspace workspaceM = M();
        Object tag = M().getTag();
        Boolean bool = Boolean.TRUE;
        workspaceM.V(Boolean.valueOf(kotlin.jvm.internal.n.d(tag, bool)));
        l().b(kotlin.jvm.internal.n.d(M().getTag(), bool));
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        AccessibilityCellLayout.e(abstractC1340u.f20140v, null, 1, null);
        AbstractC1340u abstractC1340u2 = this.f18603K;
        if (abstractC1340u2 == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u2 = null;
        }
        abstractC1340u2.f20131J.setTranslationY(K().f15544M);
        if (kotlin.jvm.internal.n.d(M().getTag(), bool)) {
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new m(z9, null), 3, null);
            M().setTag(null);
        }
        if (q3()) {
            InterfaceC1163x viewLifecycleOwner2 = getViewLifecycleOwner();
            kotlin.jvm.internal.n.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner2), null, null, new n(null), 3, null);
        }
    }

    @Override // E7.InterfaceC0769a
    public void c(float f10) {
        if (isDetached() || getContext() == null) {
            return;
        }
        C c10 = this.f18607O;
        AbstractC1340u abstractC1340u = null;
        if (c10 == null) {
            kotlin.jvm.internal.n.r("widgetExpandAnimation");
            c10 = null;
        }
        if (c10.x() || p().y()) {
            return;
        }
        R().y0(f10);
        if (q3()) {
            l().h(1 - f10);
        } else {
            M().setGridAlpha(f10);
        }
        AbstractC1340u abstractC1340u2 = this.f18603K;
        if (abstractC1340u2 == null) {
            kotlin.jvm.internal.n.r("binding");
        } else {
            abstractC1340u = abstractC1340u2;
        }
        ShortCutPreview shortCutPreview = abstractC1340u.f20128G;
        float f11 = 1 - f10;
        shortCutPreview.setAlpha(f11);
        l().c(f11);
        p248y7.r rVar = this.f18609Q;
        if (rVar != null) {
            rVar.k(f10);
        }
    }

    public final void d4() {
        final AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        if (v3()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f18610R = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(600L);
                valueAnimatorOfFloat.setStartDelay(600L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E7.x
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LockScreenFragment.e4(abstractC1340u, this, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new r());
            }
            ValueAnimator valueAnimator = this.f18610R;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } else {
            P3();
            abstractC1340u.f20128G.setAlpha(1.0f);
        }
        abstractC1340u.f20126E.setVisibility(0);
        j4();
    }

    @Override // E7.InterfaceC0769a
    public S1.a getClockViewFactory() {
        return (S1.a) this.f18599G.getValue();
    }

    @Override // E7.InterfaceC0769a
    public J7.i getLockScreenViewModel() {
        return (J7.i) this.f18597E.getValue();
    }

    @Override // com.android.launcher3.views.f
    public boolean h() {
        p248y7.r rVar = this.f18609Q;
        return rVar != null && rVar.i();
    }

    @Override // com.android.launcher3.views.f
    public void k(C2.b info) {
        kotlin.jvm.internal.n.h(info, "info");
        getLockScreenViewModel().c1();
        A2();
    }

    @Override // E7.InterfaceC0769a
    public com.nothing.wallpaper.picker.lockscreen.ui.view.E l() {
        com.nothing.wallpaper.picker.lockscreen.ui.view.E e10;
        String str;
        boolean zQ3 = q3();
        AbstractC1340u abstractC1340u = null;
        AbstractC1340u abstractC1340u2 = this.f18603K;
        if (zQ3) {
            if (abstractC1340u2 == null) {
                kotlin.jvm.internal.n.r("binding");
            } else {
                abstractC1340u = abstractC1340u2;
            }
            e10 = abstractC1340u.f20123B;
            str = "clockHostEditPreview";
        } else {
            if (abstractC1340u2 == null) {
                kotlin.jvm.internal.n.r("binding");
            } else {
                abstractC1340u = abstractC1340u2;
            }
            e10 = abstractC1340u.f20124C;
            str = "clockHostView";
        }
        kotlin.jvm.internal.n.g(e10, str);
        return e10;
    }

    public final void m4(boolean z9) {
        if (this.f18603K != null) {
            M().f(0).o(z9);
        }
    }

    public final void n4(float f10) {
        this.f18614V = f10;
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u != null) {
            AbstractC1340u abstractC1340u2 = null;
            if (abstractC1340u == null) {
                kotlin.jvm.internal.n.r("binding");
                abstractC1340u = null;
            }
            abstractC1340u.f20127F.setAlpha(f10);
            AbstractC1340u abstractC1340u3 = this.f18603K;
            if (abstractC1340u3 == null) {
                kotlin.jvm.internal.n.r("binding");
            } else {
                abstractC1340u2 = abstractC1340u3;
            }
            abstractC1340u2.f20127F.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.n.h(inflater, "inflater");
        this.f18625g0 = false;
        this.f18613U = bundle;
        AbstractC1340u abstractC1340uC = AbstractC1340u.C(inflater, viewGroup, false);
        this.f18603K = abstractC1340uC;
        AbstractC1340u abstractC1340u = null;
        if (abstractC1340uC == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340uC = null;
        }
        J3(false);
        abstractC1340uC.f20122A.setVisibility(4);
        abstractC1340uC.f20138Q.setVisibility(4);
        abstractC1340uC.f20144z.setVisibility(4);
        abstractC1340uC.f20128G.setVisibility(4);
        l().getView().setVisibility(4);
        abstractC1340uC.f20139R.setVisibility(4);
        abstractC1340uC.f20139R.setGridAlpha(O() ? 1.0f : 0.0f);
        abstractC1340uC.f20126E.setVisibility(4);
        AbstractC1340u abstractC1340u2 = this.f18603K;
        if (abstractC1340u2 == null) {
            kotlin.jvm.internal.n.r("binding");
        } else {
            abstractC1340u = abstractC1340u2;
        }
        View viewO = abstractC1340u.o();
        kotlin.jvm.internal.n.g(viewO, "getRoot(...)");
        return viewO;
    }

    @Override // p248y7.S, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        AlertDialog alertDialogE;
        super.onDestroyView();
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "onDestroyView");
        ProgressDialog progressDialog = this.f18628j0;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        X7.i iVar = this.f18629k0;
        if (iVar != null && (alertDialogE = iVar.e()) != null) {
            alertDialogE.dismiss();
        }
        ValueAnimator valueAnimator = this.f18610R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f18611S;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f18612T.removeCallbacksAndMessages(null);
        M().animate().cancel();
        l().d();
        AbstractC1340u abstractC1340u = this.f18603K;
        if (abstractC1340u == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u = null;
        }
        abstractC1340u.f20134M.recycle();
        AbstractC1340u abstractC1340u2 = this.f18603K;
        if (abstractC1340u2 == null) {
            kotlin.jvm.internal.n.r("binding");
            abstractC1340u2 = null;
        }
        abstractC1340u2.f20132K.recycle();
        this.f18631m0.h();
        this.f18608P = null;
        this.f18604L = null;
        this.f18605M = null;
        K().r(this);
        getViewModelStore().a();
        this.f18595C = null;
        this.f18596D = null;
        if (getLockScreenViewModel().a0()) {
            return;
        }
        getLockScreenViewModel().c1();
        A2();
    }

    @Override // p248y7.S, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.h(outState, "outState");
        super.onSaveInstanceState(outState);
        float f10 = this.f18614V;
        if (f10 == -1.0f) {
            return;
        }
        outState.putFloat("previewDimmingScrimAlpha", f10);
    }

    @Override // p248y7.S, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "onStop");
        if (O()) {
            k4();
        }
    }

    @Override // p248y7.S, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.n.h(view, "view");
        super.onViewCreated(view, bundle);
        com.nothing.wallpaper.common.log.c.d("LockScreenFragment", "onViewCreated");
        if (bundle != null) {
            this.f18614V = bundle.getFloat("previewDimmingScrimAlpha");
        }
        if (T2().i()) {
            Y2();
            p010b.v vVarF = requireActivity().f();
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            vVarF.h(viewLifecycleOwner, this.f18631m0);
        }
        a3();
        B3();
        K().d(this);
        F2();
    }

    @Override // p248y7.S
    public void u0(p079h8.o info) {
        kotlin.jvm.internal.n.h(info, "info");
        getLockScreenViewModel().A(info);
        A2();
        M().k0();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[RETURN] */
    @Override // p248y7.S
    public boolean y0(int i10) {
        for (Object obj : getLockScreenViewModel().I()) {
            if (((com.nothing.launcher.card.t) ((p079h8.o) obj).d()).m() == i10) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }
}
