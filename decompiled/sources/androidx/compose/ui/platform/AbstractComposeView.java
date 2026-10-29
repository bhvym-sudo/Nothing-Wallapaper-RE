package androidx.compose.ui.platform;

import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p170r.AbstractC1696o;
import p170r.AbstractC1700q;
import p170r.InterfaceC1690l;
import p170r.InterfaceC1698p;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference f11519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private IBinder f11520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC1698p f11521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AbstractC1700q f11522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p219v8.a f11523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f11524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11526x;

    static final class a extends kotlin.jvm.internal.o implements p219v8.p {
        a() {
            super(2);
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                interfaceC1690l.m();
                return;
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
            }
            AbstractComposeView.this.a(interfaceC1690l, 0);
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return p079h8.A.f21846a;
        }
    }

    private final AbstractC1700q b(AbstractC1700q abstractC1700q) {
        AbstractC1700q abstractC1700q2 = h(abstractC1700q) ? abstractC1700q : null;
        if (abstractC1700q2 != null) {
            this.f11519q = new WeakReference(abstractC1700q2);
        }
        return abstractC1700q;
    }

    private final void c() {
        if (this.f11525w) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void e() {
        if (this.f11521s == null) {
            try {
                this.f11525w = true;
                this.f11521s = E0.b(this, i(), p240y.c.b(-656146368, true, new a()));
            } finally {
                this.f11525w = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean h(AbstractC1700q abstractC1700q) {
        return !(abstractC1700q instanceof p170r.A0) || ((r.A0.d) ((p170r.A0) abstractC1700q).c0().getValue()).compareTo(r.A0.d.ShuttingDown) > 0;
    }

    private final AbstractC1700q i() {
        AbstractC1700q abstractC1700q;
        AbstractC1700q abstractC1700qB = this.f11522t;
        if (abstractC1700qB == null) {
            AbstractC1700q abstractC1700qD = B0.d(this);
            AbstractC1700q abstractC1700q2 = null;
            abstractC1700qB = abstractC1700qD != null ? b(abstractC1700qD) : null;
            if (abstractC1700qB == null) {
                WeakReference weakReference = this.f11519q;
                if (weakReference != null && (abstractC1700q = (AbstractC1700q) weakReference.get()) != null && h(abstractC1700q)) {
                    abstractC1700q2 = abstractC1700q;
                }
                return abstractC1700q2 == null ? b(B0.h(this)) : abstractC1700q2;
            }
        }
        return abstractC1700qB;
    }

    private final void setParentContext(AbstractC1700q abstractC1700q) {
        if (this.f11522t != abstractC1700q) {
            this.f11522t = abstractC1700q;
            if (abstractC1700q != null) {
                this.f11519q = null;
            }
            InterfaceC1698p interfaceC1698p = this.f11521s;
            if (interfaceC1698p != null) {
                interfaceC1698p.dispose();
                this.f11521s = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f11520r != iBinder) {
            this.f11520r = iBinder;
            this.f11519q = null;
        }
    }

    public abstract void a(InterfaceC1690l interfaceC1690l, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void d() {
        if (this.f11522t == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        e();
    }

    public void f(boolean z9, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void g(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final boolean getHasComposition() {
        return this.f11521s != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f11524v;
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f11526x || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        f(z9, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        e();
        g(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(AbstractC1700q abstractC1700q) {
        setParentContext(abstractC1700q);
    }

    public final void setShowLayoutBounds(boolean z9) {
        this.f11524v = z9;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((W.d0) childAt).setShowLayoutBounds(z9);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z9) {
        super.setTransitionGroup(z9);
        this.f11526x = true;
    }

    public final void setViewCompositionStrategy(p0 p0Var) {
        p219v8.a aVar = this.f11523u;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f11523u = p0Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z9);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }
}
