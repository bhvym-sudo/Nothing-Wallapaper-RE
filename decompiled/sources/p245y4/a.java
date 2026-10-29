package p245y4;

import K4.c;
import K4.d;
import N4.h;
import N4.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.H;
import com.google.android.material.internal.i;
import com.google.android.material.internal.k;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p225w4.e;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements i.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f30230D = j.f28918o;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int f30231E = p225w4.a.f28696c;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f30232A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private WeakReference f30233B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private WeakReference f30234C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final WeakReference f30235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h f30236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i f30237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f30238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b f30239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f30240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f30241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f30242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f30243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f30244z;

    /* JADX INFO: renamed from: y4.a$a, reason: collision with other inner class name */
    class RunnableC0746a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f30245q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ FrameLayout f30246r;

        RunnableC0746a(View view, FrameLayout frameLayout) {
            this.f30245q = view;
            this.f30246r = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.N(this.f30245q, this.f30246r);
        }
    }

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f30235q = new WeakReference(context);
        k.c(context);
        this.f30238t = new Rect();
        i iVar = new i(this);
        this.f30237s = iVar;
        iVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i10, i11, i12, aVar);
        this.f30239u = bVar;
        this.f30236r = new h(l.b(context, x() ? bVar.m() : bVar.i(), x() ? bVar.l() : bVar.h()).m());
        K();
    }

    private boolean A() {
        FrameLayout frameLayoutI = i();
        return frameLayoutI != null && frameLayoutI.getId() == e.f28845x;
    }

    private void B() {
        this.f30237s.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void C() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f30239u.e());
        if (this.f30236r.v() != colorStateListValueOf) {
            this.f30236r.V(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void D() {
        this.f30237s.l(true);
        F();
        O();
        invalidateSelf();
    }

    private void E() {
        WeakReference weakReference = this.f30233B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f30233B.get();
        WeakReference weakReference2 = this.f30234C;
        N(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void F() {
        Context context = (Context) this.f30235q.get();
        if (context == null) {
            return;
        }
        this.f30236r.setShapeAppearanceModel(l.b(context, x() ? this.f30239u.m() : this.f30239u.i(), x() ? this.f30239u.l() : this.f30239u.h()).m());
        invalidateSelf();
    }

    private void G() {
        d dVar;
        Context context = (Context) this.f30235q.get();
        if (context == null || this.f30237s.e() == (dVar = new d(context, this.f30239u.z()))) {
            return;
        }
        this.f30237s.k(dVar, context);
        H();
        O();
        invalidateSelf();
    }

    private void H() {
        this.f30237s.g().setColor(this.f30239u.j());
        invalidateSelf();
    }

    private void I() {
        P();
        this.f30237s.l(true);
        O();
        invalidateSelf();
    }

    private void J() {
        boolean zF = this.f30239u.F();
        setVisible(zF, false);
        if (!c.f30289a || i() == null || zF) {
            return;
        }
        ((ViewGroup) i().getParent()).invalidate();
    }

    private void K() {
        F();
        G();
        I();
        D();
        B();
        C();
        H();
        E();
        O();
        J();
    }

    private void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != e.f28845x) {
            WeakReference weakReference = this.f30234C;
            if (weakReference == null || weakReference.get() != viewGroup) {
                M(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(e.f28845x);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f30234C = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0746a(view, frameLayout));
            }
        }
    }

    private static void M(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void O() {
        Context context = (Context) this.f30235q.get();
        WeakReference weakReference = this.f30233B;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f30238t);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f30234C;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null || c.f30289a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        c.d(this.f30238t, this.f30240v, this.f30241w, this.f30244z, this.f30232A);
        float f10 = this.f30243y;
        if (f10 != -1.0f) {
            this.f30236r.S(f10);
        }
        if (rect.equals(this.f30238t)) {
            return;
        }
        this.f30236r.setBounds(this.f30238t);
    }

    private void P() {
        if (l() != -2) {
            this.f30242x = ((int) Math.pow(10.0d, ((double) l()) - 1.0d)) - 1;
        } else {
            this.f30242x = m();
        }
    }

    private void b(View view) {
        float y9;
        float x9;
        View viewI = i();
        if (viewI == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y10 = view.getY();
            x9 = view.getX();
            viewI = (View) view.getParent();
            y9 = y10;
        } else if (!A()) {
            y9 = 0.0f;
            x9 = 0.0f;
        } else {
            if (!(viewI.getParent() instanceof View)) {
                return;
            }
            y9 = viewI.getY();
            x9 = viewI.getX();
            viewI = (View) viewI.getParent();
        }
        float fU = u(viewI, y9);
        float fK = k(viewI, x9);
        float fG = g(viewI, y9);
        float fQ = q(viewI, x9);
        if (fU < 0.0f) {
            this.f30241w += Math.abs(fU);
        }
        if (fK < 0.0f) {
            this.f30240v += Math.abs(fK);
        }
        if (fG > 0.0f) {
            this.f30241w -= Math.abs(fG);
        }
        if (fQ > 0.0f) {
            this.f30240v -= Math.abs(fQ);
        }
    }

    private void c(Rect rect, View view) {
        float f10 = x() ? this.f30239u.f30251d : this.f30239u.f30250c;
        this.f30243y = f10;
        if (f10 != -1.0f) {
            this.f30244z = f10;
            this.f30232A = f10;
        } else {
            this.f30244z = Math.round((x() ? this.f30239u.f30254g : this.f30239u.f30252e) / 2.0f);
            this.f30232A = Math.round((x() ? this.f30239u.f30255h : this.f30239u.f30253f) / 2.0f);
        }
        if (x()) {
            String strF = f();
            this.f30244z = Math.max(this.f30244z, (this.f30237s.h(strF) / 2.0f) + this.f30239u.g());
            float fMax = Math.max(this.f30232A, (this.f30237s.f(strF) / 2.0f) + this.f30239u.k());
            this.f30232A = fMax;
            this.f30244z = Math.max(this.f30244z, fMax);
        }
        int iW = w();
        int iF = this.f30239u.f();
        if (iF == 8388691 || iF == 8388693) {
            this.f30241w = rect.bottom - iW;
        } else {
            this.f30241w = rect.top + iW;
        }
        int iV = v();
        int iF2 = this.f30239u.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            this.f30240v = H.v(view) == 0 ? (rect.left - this.f30244z) + iV : (rect.right + this.f30244z) - iV;
        } else {
            this.f30240v = H.v(view) == 0 ? (rect.right + this.f30244z) - iV : (rect.left - this.f30244z) + iV;
        }
        if (this.f30239u.E()) {
            b(view);
        }
    }

    public static a d(Context context) {
        return new a(context, 0, f30231E, f30230D, null);
    }

    private void e(Canvas canvas) {
        String strF = f();
        if (strF != null) {
            Rect rect = new Rect();
            this.f30237s.g().getTextBounds(strF, 0, strF.length(), rect);
            float fExactCenterY = this.f30241w - rect.exactCenterY();
            canvas.drawText(strF, this.f30240v, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f30237s.g());
        }
    }

    private String f() {
        if (z()) {
            return s();
        }
        if (y()) {
            return o();
        }
        return null;
    }

    private float g(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f30241w + this.f30232A) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
    }

    private CharSequence j() {
        return this.f30239u.p();
    }

    private float k(View view, float f10) {
        return (this.f30240v - this.f30244z) + view.getX() + f10;
    }

    private String o() {
        if (this.f30242x == -2 || n() <= this.f30242x) {
            return NumberFormat.getInstance(this.f30239u.x()).format(n());
        }
        Context context = (Context) this.f30235q.get();
        return context == null ? "" : String.format(this.f30239u.x(), context.getString(p225w4.i.f28893p), Integer.valueOf(this.f30242x), "+");
    }

    private String p() {
        Context context;
        if (this.f30239u.q() == 0 || (context = (Context) this.f30235q.get()) == null) {
            return null;
        }
        return (this.f30242x == -2 || n() <= this.f30242x) ? context.getResources().getQuantityString(this.f30239u.q(), n(), Integer.valueOf(n())) : context.getString(this.f30239u.n(), Integer.valueOf(this.f30242x));
    }

    private float q(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f30240v + this.f30244z) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
    }

    private String s() {
        String strR = r();
        int iL = l();
        if (iL == -2 || strR == null || strR.length() <= iL) {
            return strR;
        }
        Context context = (Context) this.f30235q.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(p225w4.i.f28886i), strR.substring(0, iL - 1), "…");
    }

    private CharSequence t() {
        CharSequence charSequenceO = this.f30239u.o();
        return charSequenceO != null ? charSequenceO : r();
    }

    private float u(View view, float f10) {
        return (this.f30241w - this.f30232A) + view.getY() + f10;
    }

    private int v() {
        int iR = x() ? this.f30239u.r() : this.f30239u.s();
        if (this.f30239u.f30258k == 1) {
            iR += x() ? this.f30239u.f30257j : this.f30239u.f30256i;
        }
        return iR + this.f30239u.b();
    }

    private int w() {
        int iB = this.f30239u.B();
        if (x()) {
            iB = this.f30239u.A();
            Context context = (Context) this.f30235q.get();
            if (context != null) {
                iB = p235x4.a.c(iB, iB - this.f30239u.t(), p235x4.a.b(0.0f, 1.0f, 0.3f, 1.0f, c.e(context) - 1.0f));
            }
        }
        if (this.f30239u.f30258k == 0) {
            iB -= Math.round(this.f30232A);
        }
        return iB + this.f30239u.c();
    }

    private boolean x() {
        return z() || y();
    }

    public void N(View view, FrameLayout frameLayout) {
        this.f30233B = new WeakReference(view);
        boolean z9 = c.f30289a;
        if (z9 && frameLayout == null) {
            L(view);
        } else {
            this.f30234C = new WeakReference(frameLayout);
        }
        if (!z9) {
            M(view);
        }
        O();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.i.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f30236r.draw(canvas);
        if (x()) {
            e(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30239u.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f30238t.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f30238t.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence h() {
        if (!isVisible()) {
            return null;
        }
        if (z()) {
            return t();
        }
        return y() ? p() : j();
    }

    public FrameLayout i() {
        WeakReference weakReference = this.f30234C;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int l() {
        return this.f30239u.u();
    }

    public int m() {
        return this.f30239u.v();
    }

    public int n() {
        if (this.f30239u.C()) {
            return this.f30239u.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public String r() {
        return this.f30239u.y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30239u.H(i10);
        B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean y() {
        return !this.f30239u.D() && this.f30239u.C();
    }

    public boolean z() {
        return this.f30239u.D();
    }
}
