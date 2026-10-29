package com.nothing.wallpaper.picker.color.ui.fragment;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.O;
import I8.z;
import Z1.e;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.customization.picker.mode.DarkModeSectionView;
import com.android.wallpaper.picker.CustomizationPickerActivity;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.color.ui.fragment.NTColorPickerFragment;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p064g3.v;
import p074h3.H;
import p074h3.I;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class NTColorPickerFragment extends e {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f18446E = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Animation f18447A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private View f18448B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private P6.a f18449C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Integer[] f18450D = {Integer.valueOf(R.drawable.nt_home_screen_diagram_with_border), Integer.valueOf(R.drawable.nt_calculator_diagram_with_border), Integer.valueOf(R.drawable.nt_control_center_diagram_with_border)};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p013b2.c f18451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f18452y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Dialog f18453z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation animation2 = NTColorPickerFragment.this.f18447A;
            if (animation2 != null) {
                animation2.cancel();
            }
            View view = NTColorPickerFragment.this.f18452y;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18455q;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18457q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18458r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ NTColorPickerFragment f18459s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.color.ui.fragment.NTColorPickerFragment$c$a$a, reason: collision with other inner class name */
            static final class C0481a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18460q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ NTColorPickerFragment f18461r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.color.ui.fragment.NTColorPickerFragment$c$a$a$a, reason: collision with other inner class name */
                static final class C0482a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18462q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f18463r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ NTColorPickerFragment f18464s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0482a(NTColorPickerFragment nTColorPickerFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18464s = nTColorPickerFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0482a c0482a = new C0482a(this.f18464s, eVar);
                        c0482a.f18463r = ((Boolean) obj).booleanValue();
                        return c0482a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18462q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f18464s.W0(this.f18463r);
                        P6.a aVar = this.f18464s.f18449C;
                        if (aVar != null) {
                            aVar.notifyItemChanged(0);
                        }
                        return A.f21846a;
                    }

                    public final Object s(boolean z9, p129m8.e eVar) {
                        return ((C0482a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0481a(NTColorPickerFragment nTColorPickerFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18461r = nTColorPickerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0481a(this.f18461r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0481a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    O oY;
                    Object objE = p139n8.b.e();
                    int i10 = this.f18460q;
                    if (i10 == 0) {
                        r.b(obj);
                        p013b2.c cVar = this.f18461r.f18451x;
                        if (cVar != null && (oY = cVar.y()) != null) {
                            C0482a c0482a = new C0482a(this.f18461r, null);
                            this.f18460q = 1;
                            if (AbstractC0882h.i(oY, c0482a, this) == objE) {
                                return objE;
                            }
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
                int f18465q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ NTColorPickerFragment f18466r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.color.ui.fragment.NTColorPickerFragment$c$a$b$a, reason: collision with other inner class name */
                static final class C0483a extends l implements p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18467q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f18468r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ NTColorPickerFragment f18469s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0483a(NTColorPickerFragment nTColorPickerFragment, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18469s = nTColorPickerFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0483a c0483a = new C0483a(this.f18469s, eVar);
                        c0483a.f18468r = ((Boolean) obj).booleanValue();
                        return c0483a;
                    }

                    @Override // p219v8.p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18467q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        if (this.f18468r) {
                            this.f18469s.T0();
                        }
                        return A.f21846a;
                    }

                    public final Object s(boolean z9, p129m8.e eVar) {
                        return ((C0483a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(NTColorPickerFragment nTColorPickerFragment, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18466r = nTColorPickerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f18466r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    z zVarO;
                    Object objE = p139n8.b.e();
                    int i10 = this.f18465q;
                    if (i10 == 0) {
                        r.b(obj);
                        p013b2.c cVar = this.f18466r.f18451x;
                        if (cVar != null && (zVarO = cVar.o()) != null) {
                            C0483a c0483a = new C0483a(this.f18466r, null);
                            this.f18465q = 1;
                            if (AbstractC0882h.i(zVarO, c0483a, this) == objE) {
                                return objE;
                            }
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
            a(NTColorPickerFragment nTColorPickerFragment, p129m8.e eVar) {
                super(2, eVar);
                this.f18459s = nTColorPickerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f18459s, eVar);
                aVar.f18458r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18457q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f18458r;
                AbstractC0816i.d(l9, null, null, new C0481a(this.f18459s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f18459s, null), 3, null);
                return A.f21846a;
            }
        }

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return NTColorPickerFragment.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18455q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x viewLifecycleOwner = NTColorPickerFragment.this.getViewLifecycleOwner();
                n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(NTColorPickerFragment.this, null);
                this.f18455q = 1;
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

    private final void P0() {
        p013b2.c cVar = this.f18451x;
        if (cVar != null) {
            AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
            n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
            cVar.m(abstractActivityC1136vRequireActivity);
        }
    }

    private final void Q0() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.nt_popup_exit_material);
        animationLoadAnimation.setAnimationListener(new b());
        View view = this.f18452y;
        if (view != null) {
            view.startAnimation(animationLoadAnimation);
        }
    }

    private final void R0() {
        View view = this.f18448B;
        ViewStub viewStub = view != null ? (ViewStub) view.findViewById(R.id.vs_bauhaus_unlock) : null;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.layout_unlock_bauhaus);
        }
        View viewInflate = viewStub != null ? viewStub.inflate() : null;
        this.f18452y = viewInflate;
        TextView textView = viewInflate != null ? (TextView) viewInflate.findViewById(R.id.btn_learn_more) : null;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: R6.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NTColorPickerFragment.S0(this.f7105q, view2);
                }
            });
        }
        View view2 = this.f18452y;
        ImageView imageView = view2 != null ? (ImageView) view2.findViewById(R.id.img_bauhaus_bg) : null;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.nt_rotate_anim);
        if (imageView != null) {
            imageView.startAnimation(animationLoadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(NTColorPickerFragment nTColorPickerFragment, View view) {
        nTColorPickerFragment.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0() {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle(R.string.nt_apply_bauhaus_title).setMessage(R.string.nt_apply_bauhaus_content).setPositiveButton(R.string.nt_apply, new DialogInterface.OnClickListener() { // from class: R6.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NTColorPickerFragment.U0(this.f7106q, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.nt_cancel, new DialogInterface.OnClickListener() { // from class: R6.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NTColorPickerFragment.V0(this.f7107q, dialogInterface, i10);
            }
        }).create();
        this.f18453z = alertDialogCreate;
        if (alertDialogCreate != null) {
            alertDialogCreate.setCancelable(true);
        }
        Dialog dialog = this.f18453z;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = this.f18453z;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(NTColorPickerFragment nTColorPickerFragment, DialogInterface dialogInterface, int i10) {
        nTColorPickerFragment.P0();
        Dialog dialog = nTColorPickerFragment.f18453z;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(NTColorPickerFragment nTColorPickerFragment, DialogInterface dialogInterface, int i10) {
        Dialog dialog = nTColorPickerFragment.f18453z;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(boolean z9) {
        if (z9) {
            this.f18450D[0] = Integer.valueOf(R.drawable.nt_home_screen_diagram_with_border_bauhaus);
        } else {
            this.f18450D[0] = Integer.valueOf(R.drawable.nt_home_screen_diagram_with_border);
        }
    }

    @Override // Z1.e, com.android.wallpaper.picker.a
    public CharSequence i0() {
        String string = requireContext().getString(R.string.nt_color_picker_title);
        n.g(string, "getString(...)");
        return string;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    @Override // Z1.e, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p013b2.c cVar;
        boolean z9;
        n.h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.nt_fragment_color_picker, viewGroup, false);
        this.f18448B = viewInflate;
        q0(viewInflate);
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        K1.p pVar = (K1.p) hA;
        v vVarI = pVar.i();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        this.f18451x = (p013b2.c) new d0(abstractActivityC1136vRequireActivity, pVar.i0(contextRequireContext, vVarI)).a(F.b(p013b2.c.class));
        if (bundle != null ? bundle.getBoolean("show_bauhaus_unlock_view") : false) {
            R0();
            cVar = this.f18451x;
            if (cVar != null) {
                cVar.B(false);
            }
        } else {
            p013b2.c cVar2 = this.f18451x;
            if (cVar2 != null) {
                z9 = cVar2.v();
            }
            if (z9) {
                R0();
                cVar = this.f18451x;
                if (cVar != null) {
                    cVar.B(false);
                }
            }
        }
        p013b2.c cVar3 = this.f18451x;
        n.e(cVar3);
        n.e(viewInflate);
        F0(Q6.c.b(viewInflate, cVar3, this));
        if (bundle != null) {
            Y1.c.a aVarZ0 = z0();
            if (aVarZ0 != null) {
                aVarZ0.a(bundle);
            }
            int iMyPid = Process.myPid();
            int i10 = bundle.getInt("recorded_app_pid", iMyPid);
            String string = bundle.getString("recorded_color_option", "");
            if (i10 != iMyPid) {
                com.nothing.wallpaper.common.log.c.k("NTColorPickerFragment", "app was killed and now restarting");
                if (!TextUtils.isEmpty(string) && !string.equals(cVar3.t())) {
                    com.nothing.wallpaper.common.log.c.k("NTColorPickerFragment", "destroy old activity and start new activity");
                    Intent intent = new Intent();
                    intent.setClass(requireContext(), CustomizationPickerActivity.class);
                    intent.addFlags(32768);
                    intent.putExtra("com.android.wallpaper.LAUNCH_SOURCE", "app_launched_launcher");
                    intent.putExtra("destination", TypedValues.Custom.S_COLOR);
                    requireContext().startActivity(intent);
                    requireActivity().finish();
                    return viewInflate;
                }
            }
        }
        View viewRequireViewById = viewInflate.requireViewById(R.id.preview_rv);
        n.g(viewRequireViewById, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById;
        AbstractActivityC1136v abstractActivityC1136vRequireActivity2 = requireActivity();
        n.g(abstractActivityC1136vRequireActivity2, "requireActivity(...)");
        P6.a aVar = new P6.a(abstractActivityC1136vRequireActivity2, this, this.f18450D);
        this.f18449C = aVar;
        recyclerView.setAdapter(aVar);
        final Context context = viewInflate.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.nothing.wallpaper.picker.color.ui.fragment.NTColorPickerFragment$onCreateView$2$1
            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void removeAndRecycleViewAt(int i11, RecyclerView.Recycler recycler) {
                n.h(recycler, "recycler");
            }
        });
        recyclerView.addItemDecoration(new p023c2.a(16));
        recyclerView.setItemViewCacheSize(-1);
        View viewRequireViewById2 = viewInflate.requireViewById(R.id.dark_mode_toggle_container);
        n.g(viewRequireViewById2, "requireViewById(...)");
        Context context2 = getContext();
        AbstractC1157q lifecycle = getLifecycle();
        Context contextRequireContext2 = requireContext();
        n.g(contextRequireContext2, "requireContext(...)");
        DarkModeSectionView darkModeSectionViewF = new F1.e(context2, lifecycle, pVar.j0(contextRequireContext2)).f(requireContext());
        darkModeSectionViewF.setBackground(null);
        ((FrameLayout) viewRequireViewById2).addView(darkModeSectionViewF);
        return viewInflate;
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f18453z;
        if (dialog != null) {
            dialog.dismiss();
        }
        Animation animation = this.f18447A;
        if (animation != null) {
            animation.cancel();
        }
        this.f18452y = null;
        this.f18448B = null;
    }

    @Override // Z1.e, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle savedInstanceState) {
        n.h(savedInstanceState, "savedInstanceState");
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("recorded_app_pid", Process.myPid());
        p013b2.c cVar = this.f18451x;
        savedInstanceState.putString("recorded_color_option", cVar != null ? cVar.t() : null);
        View view = this.f18452y;
        savedInstanceState.putBoolean("show_bauhaus_unlock_view", view != null && view.getVisibility() == 0);
        Dialog dialog = this.f18453z;
        savedInstanceState.putBoolean("show_bauhaus_apply_dialog", dialog != null && dialog.isShowing());
    }

    @Override // p084i3.C1395d, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle != null ? bundle.getBoolean("show_bauhaus_apply_dialog") : false) {
            T0();
        }
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0816i.d(AbstractC1164y.a(viewLifecycleOwner), null, null, new c(null), 3, null);
    }
}
