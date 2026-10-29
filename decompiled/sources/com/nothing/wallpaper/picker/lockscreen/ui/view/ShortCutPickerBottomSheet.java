package com.nothing.wallpaper.picker.lockscreen.ui.view;

import E7.InterfaceC0769a;
import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.android.launcher3.AbstractC1219a;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortCutPickerBottomSheet extends com.android.launcher3.views.e implements p248y7.t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final a f18959U = new a(null);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final com.android.launcher3.f f18960P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private InterfaceC0769a f18961Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private InterfaceC0846x0 f18962R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ShortcutPickerPage f18963S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Dialog f18964T;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ ShortCutPickerBottomSheet b(a aVar, LockScreenFragment lockScreenFragment, boolean z9, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            return aVar.a(lockScreenFragment, z9);
        }

        public final ShortCutPickerBottomSheet a(LockScreenFragment fragment, boolean z9) {
            kotlin.jvm.internal.n.h(fragment, "fragment");
            View viewInflate = fragment.getLayoutInflater().inflate(R.layout.shortcut_picker_bottom_sheet, (ViewGroup) fragment.J(), false);
            kotlin.jvm.internal.n.f(viewInflate, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPickerBottomSheet");
            ShortCutPickerBottomSheet shortCutPickerBottomSheet = (ShortCutPickerBottomSheet) viewInflate;
            shortCutPickerBottomSheet.f18961Q = fragment;
            shortCutPickerBottomSheet.N();
            ((AbstractC1219a) shortCutPickerBottomSheet).f15492q = true;
            shortCutPickerBottomSheet.o0(z9);
            return shortCutPickerBottomSheet;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18965q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f18966r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ShortCutPickerBottomSheet f18967s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18968q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f18969r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ShortCutPickerBottomSheet f18970s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPickerBottomSheet$b$a$a, reason: collision with other inner class name */
            static final class C0510a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f18971q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ ShortCutPickerBottomSheet f18972r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.ShortCutPickerBottomSheet$b$a$a$a, reason: collision with other inner class name */
                static final class C0511a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f18973q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f18974r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ ShortCutPickerBottomSheet f18975s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0511a(ShortCutPickerBottomSheet shortCutPickerBottomSheet, p129m8.e eVar) {
                        super(2, eVar);
                        this.f18975s = shortCutPickerBottomSheet;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        C0511a c0511a = new C0511a(this.f18975s, eVar);
                        c0511a.f18974r = obj;
                        return c0511a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f18973q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                        List list = (List) this.f18974r;
                        ShortcutPickerPage shortcutPickerPage = this.f18975s.f18963S;
                        ShortcutPickerPage shortcutPickerPage2 = null;
                        if (shortcutPickerPage == null) {
                            kotlin.jvm.internal.n.r("shortcutPickerPage");
                            shortcutPickerPage = null;
                        }
                        shortcutPickerPage.setAlreadyUsedShortcutInfo(this.f18975s.getOtherSideUsed());
                        ShortcutPickerPage shortcutPickerPage3 = this.f18975s.f18963S;
                        if (shortcutPickerPage3 == null) {
                            kotlin.jvm.internal.n.r("shortcutPickerPage");
                        } else {
                            shortcutPickerPage2 = shortcutPickerPage3;
                        }
                        shortcutPickerPage2.b0(list);
                        return p079h8.A.f21846a;
                    }

                    @Override // p219v8.p
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(List list, p129m8.e eVar) {
                        return ((C0511a) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0510a(ShortCutPickerBottomSheet shortCutPickerBottomSheet, p129m8.e eVar) {
                    super(2, eVar);
                    this.f18972r = shortCutPickerBottomSheet;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0510a(this.f18972r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0510a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f18971q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0769a interfaceC0769a = this.f18972r.f18961Q;
                        if (interfaceC0769a == null) {
                            kotlin.jvm.internal.n.r("bottomSheetCallback");
                            interfaceC0769a = null;
                        }
                        InterfaceC0880f interfaceC0880fZ = interfaceC0769a.getLockScreenViewModel().Z();
                        C0511a c0511a = new C0511a(this.f18972r, null);
                        this.f18971q = 1;
                        if (AbstractC0882h.i(interfaceC0880fZ, c0511a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ShortCutPickerBottomSheet shortCutPickerBottomSheet, p129m8.e eVar) {
                super(2, eVar);
                this.f18970s = shortCutPickerBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f18970s, eVar);
                aVar.f18969r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18968q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                AbstractC0816i.d((F8.L) this.f18969r, null, null, new C0510a(this.f18970s, null), 3, null);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, ShortCutPickerBottomSheet shortCutPickerBottomSheet, p129m8.e eVar) {
            super(2, eVar);
            this.f18966r = interfaceC1163x;
            this.f18967s = shortCutPickerBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f18966r, this.f18967s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18965q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f18966r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f18967s, null);
                this.f18965q = 1;
                if (androidx.lifecycle.N.b(interfaceC1163x, bVar, aVar, this) == objE) {
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
    public ShortCutPickerBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7.a getOtherSideUsed() {
        Object next;
        InterfaceC0769a interfaceC0769a = this.f18961Q;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        List<p079h8.u> slotShortcuts = interfaceC0769a.N().getSlotShortcuts();
        if (slotShortcuts != null) {
            Iterator<T> it = slotShortcuts.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Boolean) ((p079h8.u) next).f()).booleanValue());
            p079h8.u uVar = (p079h8.u) next;
            if (uVar != null) {
                return (C7.a) uVar.e();
            }
        }
        return null;
    }

    private final boolean n0(C7.a aVar) {
        String strC = aVar.c();
        C7.a otherSideUsed = getOtherSideUsed();
        return kotlin.jvm.internal.n.d(strC, otherSideUsed != null ? otherSideUsed.c() : null);
    }

    private final boolean p0(MotionEvent motionEvent) {
        ShortcutPickerPage shortcutPickerPage = this.f18963S;
        if (shortcutPickerPage == null) {
            kotlin.jvm.internal.n.r("shortcutPickerPage");
            shortcutPickerPage = null;
        }
        return shortcutPickerPage.a0(motionEvent);
    }

    private final void q0(final C7.a aVar) {
        Dialog dialog = this.f18964T;
        if (dialog == null || !dialog.isShowing()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle(R.string.shortcut_already_in_use).setMessage(R.string.shortcut_dialog_content_already_use).setPositiveButton(R.string.shortcut_dialog_replace, new DialogInterface.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.M
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ShortCutPickerBottomSheet.r0(this.f18928q, aVar, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.nt_cancel, new DialogInterface.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.N
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ShortCutPickerBottomSheet.s0(this.f18930q, dialogInterface, i10);
                }
            }).create();
            this.f18964T = alertDialogCreate;
            if (alertDialogCreate != null) {
                alertDialogCreate.setCancelable(true);
            }
            Dialog dialog2 = this.f18964T;
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(true);
            }
            Dialog dialog3 = this.f18964T;
            if (dialog3 != null) {
                dialog3.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(ShortCutPickerBottomSheet shortCutPickerBottomSheet, C7.a aVar, DialogInterface dialogInterface, int i10) {
        InterfaceC0769a interfaceC0769a = shortCutPickerBottomSheet.f18961Q;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.getLockScreenViewModel().G0(aVar, true);
        Dialog dialog = shortCutPickerBottomSheet.f18964T;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(ShortCutPickerBottomSheet shortCutPickerBottomSheet, DialogInterface dialogInterface, int i10) {
        Dialog dialog = shortCutPickerBottomSheet.f18964T;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final boolean t0(MotionEvent motionEvent) {
        com.android.launcher3.views.g popupContainer = getPopupContainer();
        InterfaceC0769a interfaceC0769a = this.f18961Q;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        return popupContainer.n(interfaceC0769a.N(), motionEvent);
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected void I(boolean z9) {
        S(z9, this.f18960P.f15545N);
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected boolean J(int i10) {
        return (i10 & 2) != 0;
    }

    @Override // p248y7.t
    public void b(View view, C7.a info) {
        kotlin.jvm.internal.n.h(view, "view");
        kotlin.jvm.internal.n.h(info, "info");
        if (!info.e() || info.f()) {
            return;
        }
        if (!kotlin.jvm.internal.n.d(info.c(), "none") && n0(info)) {
            q0(info);
            return;
        }
        InterfaceC0769a interfaceC0769a = this.f18961Q;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.getLockScreenViewModel().G0(info, false);
    }

    public final float getClosedTranslationShift() {
        return 1.0f;
    }

    public final int getContentHeight() {
        return this.f15736u.getMeasuredHeight();
    }

    @Override // com.android.launcher3.views.e, F2.w
    public boolean k(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if (ev.getAction() == 0) {
            this.f15723D = t0(ev) || p0(ev);
        }
        return super.k(ev);
    }

    public final void o0(boolean z9) {
        if (z9) {
            b0().m();
        } else {
            setTranslationShift(0.0f);
            post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18954q.A();
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1163x interfaceC1163xA = androidx.lifecycle.g0.a(this);
        if (interfaceC1163xA != null) {
            this.f18962R = AbstractC0816i.d(AbstractC1164y.a(interfaceC1163xA), null, null, new b(interfaceC1163xA, this, null), 3, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Dialog dialog = this.f18964T;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f18964T = null;
        InterfaceC0846x0 interfaceC0846x0 = this.f18962R;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f18962R = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15736u = (ViewGroup) findViewById(R.id.container);
        Drawable drawable = getContext().getDrawable(R.drawable.bottom_sheet_bg);
        if (drawable != null) {
            Z(drawable, this.f15736u);
        }
        this.f18963S = (ShortcutPickerPage) requireViewById(R.id.shortcut_picker);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int measuredWidth = this.f15736u.getMeasuredWidth();
        int i15 = ((i12 - i10) - measuredWidth) / 2;
        ViewGroup viewGroup = this.f15736u;
        viewGroup.layout(i15, i14 - viewGroup.getMeasuredHeight(), measuredWidth + i15, i14);
        setTranslationShift(this.f15741z);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChildWithMargins(this.f15736u, i10, 0, i11, this.f18960P.f15547P);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // com.android.launcher3.views.e
    protected void setTranslationShift(float f10) {
        super.setTranslationShift(f10);
        InterfaceC0769a interfaceC0769a = this.f18961Q;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.G(f10);
    }

    @Override // p248y7.t
    public void y(View view, C7.a info) {
        kotlin.jvm.internal.n.h(view, "view");
        kotlin.jvm.internal.n.h(info, "info");
    }

    public /* synthetic */ ShortCutPickerBottomSheet(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortCutPickerBottomSheet(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18960P = ((p248y7.u) this.f15733r).K();
    }
}
