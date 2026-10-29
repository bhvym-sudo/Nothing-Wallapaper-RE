package com.android.wallpaper.widget;

import H3.r;
import H3.t;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.o;
import androidx.core.widget.i;
import com.android.internal.util.ArrayUtils;
import com.android.wallpaper.widget.BottomActionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nothing.wallpaper.R;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class BottomActionBar extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f16061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f16062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map f16063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d f16064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ViewGroup f16065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final QueueStateBottomSheetBehavior f16066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Set f16067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private d f16068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f16069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private c f16070z;

    public static class QueueStateBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        private boolean f16071A0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private final Deque f16072z0;

        class a extends BottomSheetBehavior.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BottomSheetBehavior.g f16073a;

            a(BottomSheetBehavior.g gVar) {
                this.f16073a = gVar;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void b(View view, float f10) {
                BottomSheetBehavior.g gVar = this.f16073a;
                if (gVar != null) {
                    gVar.b(view, f10);
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void c(View view, int i10) {
                if (!QueueStateBottomSheetBehavior.this.f16072z0.isEmpty()) {
                    if (i10 == ((Integer) QueueStateBottomSheetBehavior.this.f16072z0.getFirst()).intValue()) {
                        QueueStateBottomSheetBehavior.this.f16072z0.removeFirst();
                        if (QueueStateBottomSheetBehavior.this.f16072z0.isEmpty()) {
                            QueueStateBottomSheetBehavior.this.f16071A0 = false;
                        } else {
                            QueueStateBottomSheetBehavior queueStateBottomSheetBehavior = QueueStateBottomSheetBehavior.this;
                            queueStateBottomSheetBehavior.X0(((Integer) queueStateBottomSheetBehavior.f16072z0.getFirst()).intValue());
                        }
                    } else {
                        QueueStateBottomSheetBehavior queueStateBottomSheetBehavior2 = QueueStateBottomSheetBehavior.this;
                        queueStateBottomSheetBehavior2.X0(((Integer) queueStateBottomSheetBehavior2.f16072z0.getFirst()).intValue());
                    }
                }
                BottomSheetBehavior.g gVar = this.f16073a;
                if (gVar != null) {
                    gVar.c(view, i10);
                }
            }
        }

        public QueueStateBottomSheetBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16072z0 = new ArrayDeque();
            J0(null);
        }

        public void G0() {
            this.f16072z0.clear();
            this.f16071A0 = false;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
        public void J0(BottomSheetBehavior.g gVar) {
            super.J0(new a(gVar));
        }

        public void n1(int i10) {
            if (this.f16072z0.isEmpty() || ((Integer) this.f16072z0.getLast()).intValue() != i10) {
                this.f16072z0.add(Integer.valueOf(i10));
            }
        }

        public boolean o1() {
            return this.f16071A0;
        }

        public void p1() {
            if (this.f16072z0.isEmpty()) {
                return;
            }
            X0(((Integer) this.f16072z0.getFirst()).intValue());
            this.f16071A0 = true;
        }
    }

    class a extends BottomSheetBehavior.g {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (BottomActionBar.this.f16066v.o1()) {
                BottomActionBar.this.u();
                if (BottomActionBar.this.f16068x == null || i10 != 4) {
                    return;
                }
                BottomActionBar bottomActionBar = BottomActionBar.this;
                bottomActionBar.U(bottomActionBar.f16068x);
                return;
            }
            BottomActionBar.this.N(i10);
            BottomActionBar.this.x();
            BottomActionBar bottomActionBar2 = BottomActionBar.this;
            if (bottomActionBar2.H(bottomActionBar2.f16068x)) {
                if (i10 == 4) {
                    BottomActionBar bottomActionBar3 = BottomActionBar.this;
                    bottomActionBar3.V(bottomActionBar3.f16068x, false);
                } else if (i10 == 3) {
                    BottomActionBar bottomActionBar4 = BottomActionBar.this;
                    bottomActionBar4.V(bottomActionBar4.f16068x, true);
                }
            }
        }
    }

    class b extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f16076a;

        b(BottomActionBar bottomActionBar, int[] iArr) {
            this.f16076a = iArr;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            if (ArrayUtils.contains(this.f16076a, i10)) {
                return;
            }
            super.sendAccessibilityEvent(view, i10);
        }
    }

    public interface c {
        void a();

        void b();
    }

    public enum d {
        ROTATION,
        DELETE,
        INFORMATION(R.string.accessibility_info_shown, R.string.accessibility_info_hidden),
        EDIT,
        CUSTOMIZE(R.string.accessibility_customize_shown, R.string.accessibility_customize_hidden),
        EFFECTS,
        DOWNLOAD,
        PROGRESS,
        APPLY,
        APPLY_TEXT;


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f16088q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f16089r;

        d() {
            this(0, 0);
        }

        public int e(boolean z9) {
            return z9 ? this.f16088q : this.f16089r;
        }

        d(int i10, int i11) {
            this.f16088q = i10;
            this.f16089r = i11;
        }
    }

    public interface e {
        BottomActionBar B();
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f16090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16091b;

        public f(Context context) {
            this.f16090a = c(context);
            h(false);
        }

        private View c(Context context) {
            View viewInflate = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
            f(viewInflate);
            viewInflate.setFocusable(true);
            return viewInflate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(Context context) {
            e(this.f16090a);
            this.f16090a = c(context);
            h(this.f16091b);
        }

        public abstract int d();

        public void e(View view) {
        }

        public abstract void f(View view);

        /* JADX INFO: Access modifiers changed from: protected */
        public void h(boolean z9) {
            this.f16091b = z9;
            this.f16090a.setVisibility(z9 ? 0 : 8);
        }
    }

    public interface g {
        void a(boolean z9);
    }

    public BottomActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EnumMap enumMap = new EnumMap(d.class);
        this.f16061q = enumMap;
        this.f16062r = new EnumMap(d.class);
        this.f16063s = new EnumMap(d.class);
        this.f16067w = new HashSet();
        LayoutInflater.from(context).inflate(R.layout.bottom_actions_layout, (ViewGroup) this, true);
        enumMap.put(d.ROTATION, findViewById(R.id.action_rotation));
        enumMap.put(d.DELETE, findViewById(R.id.action_delete));
        d dVar = d.INFORMATION;
        enumMap.put(dVar, findViewById(R.id.action_information));
        enumMap.put(d.EDIT, findViewById(R.id.action_edit));
        d dVar2 = d.CUSTOMIZE;
        enumMap.put(dVar2, findViewById(R.id.action_customize));
        enumMap.put(d.EFFECTS, findViewById(R.id.action_effects));
        enumMap.put(d.DOWNLOAD, findViewById(R.id.action_download));
        enumMap.put(d.PROGRESS, findViewById(R.id.action_progress));
        enumMap.put(d.APPLY, findViewById(R.id.action_apply));
        enumMap.put(d.APPLY_TEXT, findViewById(R.id.action_apply_text_button));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_bottom_sheet);
        this.f16065u = viewGroup;
        t.a(viewGroup);
        setColor(context);
        QueueStateBottomSheetBehavior queueStateBottomSheetBehavior = (QueueStateBottomSheetBehavior) BottomSheetBehavior.q0(viewGroup);
        this.f16066v = queueStateBottomSheetBehavior;
        queueStateBottomSheetBehavior.X0(4);
        queueStateBottomSheetBehavior.J0(new a());
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: I3.f
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return BottomActionBar.i(view, windowInsets);
            }
        });
        T(new d[]{dVar, dVar2}, new int[]{1, 4});
    }

    private CharSequence A(d dVar, boolean z9) {
        int iE;
        if (dVar == null || (iE = dVar.e(z9)) == 0) {
            return null;
        }
        return getContext().getText(iE);
    }

    private void E() {
        if (H(this.f16068x) && this.f16066v.u0() == 3) {
            this.f16066v.X0(4);
            V(this.f16068x, false);
            this.f16068x = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(d dVar) {
        return dVar != null && this.f16062r.containsKey(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(d dVar, View view) {
        if (this.f16066v.u0() == 4) {
            U(dVar);
        }
        this.f16065u.setAccessibilityTraversalAfter(view.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(d dVar) {
        V(dVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(d dVar, View.OnClickListener onClickListener, View view) {
        d dVar2 = this.f16064t;
        if (dVar == dVar2) {
            V(dVar2, !F(dVar2));
        }
        d dVar3 = this.f16068x;
        if (dVar3 == null || dVar3 == this.f16064t || !F(dVar3)) {
            this.f16068x = null;
        } else {
            V(this.f16068x, false);
            if (H(this.f16068x)) {
                this.f16066v.n1(4);
            }
        }
        if (dVar == this.f16068x) {
            this.f16068x = null;
        } else {
            d dVar4 = this.f16064t;
            if (dVar != dVar4) {
                this.f16068x = dVar;
                this.f16069y = dVar;
                V(dVar, true);
                if (H(this.f16068x)) {
                    this.f16066v.n1(3);
                }
            } else if (F(dVar4)) {
                d dVar5 = this.f16064t;
                this.f16068x = dVar5;
                this.f16069y = dVar5;
            }
        }
        onClickListener.onClick(view);
        this.f16066v.p1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Context context, f fVar) {
        fVar.g(context);
        this.f16065u.addView(fVar.f16090a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Set set, d dVar) {
        if (set.contains(dVar)) {
            R(dVar);
        } else {
            C(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10) {
        if (this.f16070z == null) {
            return;
        }
        if (i10 == 4) {
            CharSequence charSequenceA = A(this.f16069y, false);
            if (!TextUtils.isEmpty(charSequenceA)) {
                setAccessibilityPaneTitle(charSequenceA);
            }
            this.f16070z.b();
            return;
        }
        if (i10 == 3) {
            CharSequence charSequenceA2 = A(this.f16068x, true);
            if (!TextUtils.isEmpty(charSequenceA2)) {
                setAccessibilityPaneTitle(charSequenceA2);
            }
            this.f16070z.a();
        }
    }

    private void T(d[] dVarArr, int[] iArr) {
        for (d dVar : dVarArr) {
            ((View) this.f16061q.get(dVar)).setAccessibilityDelegate(new b(this, iArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(final d dVar) {
        this.f16062r.forEach(new BiConsumer() { // from class: I3.j
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                BottomActionBar.f fVar = (BottomActionBar.f) obj2;
                fVar.h(((BottomActionBar.d) obj).equals(dVar));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(d dVar, boolean z9) {
        W(dVar, z9, false);
    }

    private void W(d dVar, boolean z9, boolean z10) {
        View view = (View) this.f16061q.get(dVar);
        if (view.isSelected() == z9) {
            return;
        }
        if (!z10) {
            o.a(this.f16063s.get(dVar));
        }
        view.setSelected(z9);
    }

    public static /* synthetic */ WindowInsets i(View view, WindowInsets windowInsets) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    public void B() {
        setVisibility(8);
    }

    public void C(d... dVarArr) {
        for (d dVar : dVarArr) {
            ((View) this.f16061q.get(dVar)).setVisibility(8);
            if (H(dVar) && this.f16068x == dVar) {
                E();
            }
        }
    }

    public void D() {
        S(new d[0]);
    }

    public boolean F(d dVar) {
        return ((View) this.f16061q.get(dVar)).isSelected();
    }

    public boolean G() {
        return this.f16066v.u0() == 4;
    }

    public void O() {
        B();
        D();
        x();
        this.f16061q.values().forEach(new Consumer() { // from class: I3.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((View) obj).setOnClickListener(null);
            }
        });
        findViewById(R.id.action_back).setOnClickListener(null);
        this.f16061q.keySet().forEach(new Consumer() { // from class: I3.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f3000a.J((BottomActionBar.d) obj);
            }
        });
        this.f16062r.clear();
        this.f16063s.clear();
        this.f16065u.removeAllViews();
        this.f16066v.G0();
        this.f16068x = null;
    }

    public void P(final d dVar, final View.OnClickListener onClickListener) {
        View view = (View) this.f16061q.get(dVar);
        if (!view.hasOnClickListeners()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: I3.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f3009q.K(dVar, onClickListener, view2);
                }
            });
            return;
        }
        throw new IllegalStateException("Had already set a click listener to button: " + dVar);
    }

    public void Q() {
        setVisibility(0);
    }

    public void R(d... dVarArr) {
        for (d dVar : dVarArr) {
            ((View) this.f16061q.get(dVar)).setVisibility(0);
        }
    }

    public void S(d... dVarArr) {
        final HashSet hashSet = new HashSet(Arrays.asList(dVarArr));
        this.f16061q.keySet().forEach(new Consumer() { // from class: I3.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f3005a.M(hashSet, (BottomActionBar.d) obj);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(final boolean z9) {
        super.onVisibilityAggregated(z9);
        this.f16067w.forEach(new Consumer() { // from class: I3.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                boolean z10 = z9;
                androidx.appcompat.app.o.a(obj);
                ((BottomActionBar.g) null).a(z10);
            }
        });
    }

    public void q(final Activity activity) {
        findViewById(R.id.action_back).setOnClickListener(new View.OnClickListener() { // from class: I3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                activity.onBackPressed();
            }
        });
    }

    public void r(f fVar, final d dVar) {
        this.f16062r.put(dVar, fVar);
        this.f16065u.addView(fVar.f16090a);
        P(dVar, new View.OnClickListener() { // from class: I3.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3007q.I(dVar, view);
            }
        });
    }

    public void s() {
        E();
    }

    public void setAccessibilityCallback(c cVar) {
        this.f16070z = cVar;
    }

    public void setBackButtonVisibility(int i10) {
        findViewById(R.id.action_back).setVisibility(i10);
    }

    public void setColor(final Context context) {
        this.f16065u.setBackground(context.getDrawable(R.drawable.bottom_sheet_background));
        if (this.f16065u.getChildCount() > 0) {
            this.f16065u.removeAllViews();
            this.f16062r.values().forEach(new Consumer() { // from class: I3.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f3001a.L(context, (BottomActionBar.f) obj);
                }
            });
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_tabs);
        viewGroup.setBackgroundColor(r.a(context, android.R.attr.colorBackground));
        ColorStateList colorStateList = context.getColorStateList(R.color.bottom_action_button_color_tint);
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ImageView) {
                childAt.setBackground(context.getDrawable(R.drawable.bottom_action_button_background));
                i.c((ImageView) childAt, colorStateList);
            } else if (childAt instanceof ProgressBar) {
                ((ProgressBar) childAt).setIndeterminateTintList(colorStateList);
            }
        }
    }

    public void setDefaultSelectedButton(d dVar) {
        if (this.f16068x == null) {
            this.f16068x = dVar;
            V(dVar, true);
        }
    }

    public void setExemptionAction(d dVar) {
        this.f16064t = dVar;
    }

    public void t(d dVar) {
        if (H(dVar)) {
            this.f16066v.X0(4);
        }
        V(dVar, false);
        if (dVar == this.f16068x) {
            this.f16068x = null;
        }
    }

    public void u() {
        v(d.values());
    }

    public void v(d... dVarArr) {
        for (d dVar : dVarArr) {
            ((View) this.f16061q.get(dVar)).setEnabled(false);
        }
    }

    public void w(boolean z9) {
        if (z9) {
            y((d[]) this.f16062r.keySet().toArray(new d[0]));
        } else {
            v((d[]) this.f16062r.keySet().toArray(new d[0]));
        }
    }

    public void x() {
        y(d.values());
    }

    public void y(d... dVarArr) {
        for (d dVar : dVarArr) {
            ((View) this.f16061q.get(dVar)).setEnabled(true);
        }
    }

    public void z(d dVar) {
        ((View) this.f16061q.get(dVar)).sendAccessibilityEvent(8);
    }
}
