package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortcutPickerPage extends CoordinatorLayout {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final r0 f18980P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final com.android.launcher3.views.f f18981Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final float f18982R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private C7.a f18983S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final LinearLayoutManager f18984T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p079h8.h f18985U;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.n.h(view, "view");
            kotlin.jvm.internal.n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), ShortcutPickerPage.this.f18982R);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortcutPickerPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void W(List list) {
        Iterator it = list.iterator();
        final int i10 = 0;
        while (it.hasNext()) {
            if (((C7.a) it.next()).f()) {
                this.f18980P.f20086x.post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortcutPickerPage.X(this.f18957q, i10);
                    }
                });
            }
            i10++;
        }
        i10 = -1;
        this.f18980P.f20086x.post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.S
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutPickerPage.X(this.f18957q, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(final ShortcutPickerPage shortcutPickerPage, int i10) {
        r0 r0Var = shortcutPickerPage.f18980P;
        r0Var.f20086x.scrollToPosition(i10);
        r0Var.f20086x.post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.U
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutPickerPage.Y(this.f19020q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(ShortcutPickerPage shortcutPickerPage) {
        if (shortcutPickerPage.f18984T.findFirstCompletelyVisibleItemPosition() > 0) {
            shortcutPickerPage.f18980P.f20084v.A(true);
        } else {
            shortcutPickerPage.f18980P.f20084v.A(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F7.j Z(ShortcutPickerPage shortcutPickerPage) {
        return new F7.j(p248y7.t.f30551p.a(shortcutPickerPage.getParent()));
    }

    private final F7.j getShortcutListAdapter() {
        return (F7.j) this.f18985U.getValue();
    }

    public final boolean a0(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        return this.f18981Q.J().n(this.f18980P.f20086x, ev) && this.f18980P.f20086x.computeVerticalScrollOffset() != 0;
    }

    public final void b0(List list) {
        kotlin.jvm.internal.n.h(list, "list");
        getShortcutListAdapter().submitList(list);
        W(list);
    }

    public final C7.a getAlreadyUsedShortcutInfo() {
        return this.f18983S;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18980P.f20086x.setAdapter(getShortcutListAdapter());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18980P.f20086x.setAdapter(null);
    }

    public final void setAlreadyUsedShortcutInfo(C7.a aVar) {
        this.f18983S = aVar;
        getShortcutListAdapter().e(this.f18983S);
    }

    public /* synthetic */ ShortcutPickerPage(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutPickerPage(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        r0 r0VarC = r0.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(r0VarC, "inflate(...)");
        this.f18980P = r0VarC;
        this.f18981Q = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18982R = getResources().getDimension(R.dimen.bottom_sheet_bg_radius);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f18984T = linearLayoutManager;
        this.f18985U = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.T
            @Override // p219v8.a
            public final Object invoke() {
                return ShortcutPickerPage.Z(this.f18987q);
            }
        });
        setOutlineProvider(new a());
        setClipToOutline(true);
        r0VarC.f20086x.setLayoutManager(linearLayoutManager);
        if (p087i6.q.e(context)) {
            return;
        }
        int iB = p087i6.q.b(context);
        RecyclerView recyclerView = r0VarC.f20086x;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), iB);
    }
}
