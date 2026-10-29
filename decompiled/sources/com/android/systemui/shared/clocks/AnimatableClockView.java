package com.android.systemui.shared.clocks;

import E8.g;
import E8.i;
import H2.j;
import H2.k;
import H2.s;
import I2.f;
import K2.e;
import O2.q;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.internal.annotations.VisibleForTesting;
import com.android.systemui.shared.clocks.AnimatableClockView;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p079h8.A;
import p089i8.AbstractC1444s;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public final class AnimatableClockView extends TextView {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f15773L = new a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f15774M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final q f15775N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Interpolator f15776O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final List f15777P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final List f15778Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private j f15779A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private l f15780B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f15781C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f15782D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p f15783E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f15784F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Long f15785G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private List f15786H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f15787I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private List f15788J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p f15789K;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private q f15790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Calendar f15792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f15793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f15794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f15795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f15796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f15797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f15798y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f15799z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15800a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static String f15801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static String f15802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static String f15803d;

        private b() {
        }

        public final String a() {
            return f15801b;
        }

        public final String b() {
            return f15802c;
        }

        public final void c(Context context) {
            n.h(context, "context");
            Locale locale = Locale.getDefault();
            String string = context.getResources().getString(f.f2980a);
            n.g(string, "getString(...)");
            String string2 = context.getResources().getString(f.f2981b);
            n.g(string2, "getString(...)");
            String str = locale + string + string2;
            if (n.d(str, f15803d)) {
                return;
            }
            String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, string);
            if (!i.S(string, "a", false, 2, null)) {
                n.e(bestDateTimePattern);
                String strB = new g("a").b(bestDateTimePattern, "");
                int length = strB.length() - 1;
                int i10 = 0;
                boolean z9 = false;
                while (i10 <= length) {
                    boolean z10 = n.i(strB.charAt(!z9 ? i10 : length), 32) <= 0;
                    if (z9) {
                        if (!z10) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z10) {
                        i10++;
                    } else {
                        z9 = true;
                    }
                }
                bestDateTimePattern = strB.subSequence(i10, length + 1).toString();
            }
            f15801b = bestDateTimePattern;
            f15802c = DateFormat.getBestDateTimePattern(locale, string2);
            f15803d = str;
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.l implements p219v8.a {
        c(Object obj) {
            super(0, obj, AnimatableClockView.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            ((AnimatableClockView) this.receiver).invalidate();
        }
    }

    public static final class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f15804a;

        d(p219v8.a aVar) {
            this.f15804a = aVar;
        }
    }

    static {
        String strB = F.b(AnimatableClockView.class).b();
        n.e(strB);
        f15774M = strB;
        f15775N = new q(null, new K2.c(K2.a.DEBUG), strB);
        f15776O = p212v1.d.f28110a;
        f15777P = AbstractC1444s.n(0, 1, 2, 3);
        f15778Q = AbstractC1444s.n(1, 0, 3, 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatableClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(AnimatableClockView animatableClockView, j.b positionedGlyph, float f10) {
        n.h(positionedGlyph, "positionedGlyph");
        int iC = (positionedGlyph.c() * 2) + positionedGlyph.b();
        if (iC < animatableClockView.f15786H.size()) {
            positionedGlyph.j(positionedGlyph.e() + ((Number) animatableClockView.f15786H.get(iC)).floatValue());
        }
        return A.f21846a;
    }

    private final q getLogger() {
        q qVar = this.f15790q;
        return qVar == null ? f15775N : qVar;
    }

    private final List<Integer> getMoveToCenterDelays() {
        return isLayoutRtl() ? f15777P : f15778Q;
    }

    private final List<Integer> getMoveToSideDelays() {
        return isLayoutRtl() ? f15778Q : f15777P;
    }

    private final int getParentWidth() {
        Object parent = getParent();
        n.f(parent, "null cannot be cast to non-null type android.view.View");
        return ((View) parent).getMeasuredWidth();
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextAnimatorFactory$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTimeOverrideInMillis$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(K2.b d10) {
        n.h(d10, "$this$d");
        return "onTextChanged(" + q.f5795e.a(d10.o()) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(K2.b d10) {
        n.h(d10, "$this$d");
        return "refreshFormat(" + q.f5795e.a(d10.o()) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(K2.b d10) {
        n.h(d10, "$this$d");
        return "refreshTime: new formattedText=" + q.f5795e.a(d10.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(K2.b d10) {
        n.h(d10, "$this$d");
        return "refreshTime: done setting new time text to: " + q.f5795e.a(d10.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j o(Layout layout, p219v8.a invalidateCb) {
        n.h(layout, "layout");
        n.h(invalidateCb, "invalidateCb");
        Typeface typeface = layout.getPaint().getTypeface();
        n.g(typeface, "getTypeface(...)");
        return new j(layout, new s(typeface, 30), new d(invalidateCb));
    }

    @Override // android.view.View
    public final float getBottom() {
        Paint.FontMetrics fontMetrics;
        TextPaint paint = getPaint();
        if (paint == null || (fontMetrics = paint.getFontMetrics()) == null) {
            return 0.0f;
        }
        return fontMetrics.bottom;
    }

    public final int getDozingWeight() {
        boolean zP = p();
        int i10 = this.f15793t;
        return zP ? i10 + 100 : i10;
    }

    public final boolean getHasCustomPositionUpdatedAnimation() {
        return this.f15791r;
    }

    public final int getLockScreenWeight() {
        boolean zP = p();
        int i10 = this.f15794u;
        return zP ? i10 + 100 : i10;
    }

    public final K2.f getMessageBuffer() {
        return getLogger().e();
    }

    public final p getTextAnimatorFactory() {
        return this.f15783E;
    }

    public final Long getTimeOverrideInMillis() {
        return this.f15785G;
    }

    public final void i() {
        j(DateFormat.is24HourFormat(getContext()));
    }

    @Override // android.view.View
    public void invalidate() {
        getLogger().o();
        super.invalidate();
    }

    public final void j(boolean z9) {
        String strA;
        b bVar = b.f15800a;
        Context context = getContext();
        n.g(context, "getContext(...)");
        bVar.c(context);
        boolean z10 = this.f15795v;
        if (z10 && z9) {
            strA = bVar.b();
        } else if (z10 || !z9) {
            strA = (!z10 || z9) ? "hh\nmm" : bVar.a();
        } else {
            strA = "HH\nmm";
        }
        this.f15796w = strA;
        q logger = getLogger();
        K2.b bVarA = logger.e().a(logger.f(), K2.a.DEBUG, new l() { // from class: Q2.a
            @Override // p219v8.l
            public final Object f(Object obj) {
                return AnimatableClockView.k((K2.b) obj);
            }
        }, null);
        CharSequence charSequence = this.f15796w;
        bVarA.k(charSequence != null ? charSequence.toString() : null);
        logger.e().b(bVarA);
        this.f15797x = z9 ? bVar.b() : bVar.a();
        l();
    }

    public final void l() {
        Calendar calendar = this.f15792s;
        Long l9 = this.f15785G;
        calendar.setTimeInMillis(l9 != null ? l9.longValue() : System.currentTimeMillis());
        setContentDescription(DateFormat.format(this.f15797x, this.f15792s));
        CharSequence charSequence = DateFormat.format(this.f15796w, this.f15792s);
        q logger = getLogger();
        l lVar = new l() { // from class: Q2.e
            @Override // p219v8.l
            public final Object f(Object obj) {
                return AnimatableClockView.m((K2.b) obj);
            }
        };
        K2.a aVar = K2.a.DEBUG;
        K2.b bVarA = logger.e().a(logger.f(), aVar, lVar, null);
        bVarA.k(charSequence != null ? charSequence.toString() : null);
        logger.e().b(bVarA);
        if (TextUtils.equals(getText(), charSequence)) {
            return;
        }
        setText(charSequence);
        q logger2 = getLogger();
        K2.b bVarA2 = logger2.e().a(logger2.f(), aVar, new l() { // from class: Q2.f
            @Override // p219v8.l
            public final Object f(Object obj) {
                return AnimatableClockView.n((K2.b) obj);
            }
        }, null);
        bVarA2.k(charSequence != null ? charSequence.toString() : null);
        logger2.e().b(bVarA2);
        if (getLayout() != null) {
            j jVar = this.f15779A;
            if (jVar != null) {
                Layout layout = getLayout();
                n.g(layout, "getLayout(...)");
                j.e(jVar, layout, 0.0f, 2, null);
            }
            e.c(getLogger(), "refreshTime: done updating textAnimator layout", null, 2, null);
        }
        requestLayout();
        e.c(getLogger(), "refreshTime: after requestLayout", null, 2, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        e.c(getLogger(), "onAttachedToWindow", null, 2, null);
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        canvas.save();
        if (this.f15781C) {
            canvas.translate(getParentWidth() / 4.0f, 0.0f);
        }
        getLogger().q(String.valueOf(getText()));
        j jVar = this.f15779A;
        if (jVar != null) {
            jVar.c(canvas);
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        getLogger().s(i10, i11);
        if (!this.f15795v && View.MeasureSpec.getMode(i11) == 1073741824) {
            super.setTextSize(0, Math.min(this.f15782D, View.MeasureSpec.getSize(i11) / 2.0f));
        }
        super.onMeasure(i10, i11);
        j jVar = this.f15779A;
        if (jVar != null) {
            Layout layout = getLayout();
            n.g(layout, "getLayout(...)");
            jVar.d(layout, getTextSize());
        } else {
            p pVar = this.f15783E;
            Layout layout2 = getLayout();
            n.g(layout2, "getLayout(...)");
            j jVar2 = (j) pVar.invoke(layout2, new c(this));
            l lVar = this.f15780B;
            if (lVar != null) {
                lVar.f(jVar2);
            }
            this.f15780B = null;
            this.f15779A = jVar2;
        }
        if (!this.f15791r) {
            this.f15781C = false;
            return;
        }
        int measuredWidth = getMeasuredWidth() + (View.MeasureSpec.getSize(i10) / 2);
        boolean z9 = getParentWidth() > measuredWidth;
        this.f15781C = z9;
        if (z9) {
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (i10 == 1) {
            setTextAlignment(3);
        } else {
            setTextAlignment(2);
        }
        super.onRtlPropertiesChanged(i10);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence text, int i10, int i11, int i12) {
        n.h(text, "text");
        q logger = getLogger();
        l lVar = new l() { // from class: Q2.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return AnimatableClockView.h((K2.b) obj);
            }
        };
        K2.b bVarA = logger.e().a(logger.f(), K2.a.DEBUG, lVar, null);
        bVarA.k(String.valueOf(text));
        logger.e().b(bVarA);
        super.onTextChanged(text, i10, i11, i12);
    }

    public final boolean p() {
        return getResources().getConfiguration().fontWeightAdjustment > 100;
    }

    public final void setAnimationEnabled(boolean z9) {
        this.f15784F = z9;
    }

    public final void setHasCustomPositionUpdatedAnimation(boolean z9) {
        this.f15791r = z9;
    }

    public final void setLineSpacingScale(float f10) {
        this.f15798y = f10;
        setLineSpacing(0.0f, f10);
    }

    public final void setMessageBuffer(K2.f value) {
        n.h(value, "value");
        this.f15790q = new q(this, value, f15774M);
    }

    public final void setTextAnimatorFactory(p pVar) {
        n.h(pVar, "<set-?>");
        this.f15783E = pVar;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        if (i10 != 0) {
            f10 = Float.MAX_VALUE;
        }
        this.f15782D = f10;
    }

    public final void setTimeOverrideInMillis(Long l9) {
        this.f15785G = l9;
    }

    public /* synthetic */ AnimatableClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatableClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        this.f15790q = f15775N;
        this.f15792s = Calendar.getInstance();
        this.f15798y = 1.0f;
        this.f15782D = Float.MAX_VALUE;
        this.f15783E = new p() { // from class: Q2.c
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return AnimatableClockView.o((Layout) obj, (p219v8.a) obj2);
            }
        };
        this.f15784F = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I2.g.f2996a, i10, i11);
        n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f15793t = typedArrayObtainStyledAttributes.getInt(I2.g.f2998c, 100);
            this.f15794u = typedArrayObtainStyledAttributes.getInt(I2.g.f2999d, 300);
            this.f15799z = typedArrayObtainStyledAttributes.getInt(I2.g.f2997b, ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.TextView, i10, i11);
            n.g(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
            try {
                this.f15795v = typedArrayObtainStyledAttributes2.getBoolean(32, false);
                typedArrayObtainStyledAttributes2.recycle();
                i();
                this.f15786H = AbstractC1444s.p(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
                this.f15787I = 1.0f;
                this.f15788J = AbstractC1444s.p(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
                this.f15789K = new p() { // from class: Q2.d
                    @Override // p219v8.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AnimatableClockView.g(this.f6748q, (H2.j.b) obj, ((Float) obj2).floatValue());
                    }
                };
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
