package com.nothing.systemui.shared.clocks.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemProperties;
import android.os.Trace;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends ViewGroup {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f18165K = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Locale f18166A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Handler f18167B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f18168C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f18169D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f18170E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f18171F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f18172G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f18173H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f18174I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f18175J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PaintFlagsDrawFilter f18176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Calendar f18177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f18178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f18181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private K2.e f18182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f18183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f18184y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f18185z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18176q = new PaintFlagsDrawFilter(0, 3);
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.n.g(calendar, "getInstance(...)");
        this.f18177r = calendar;
        this.f18182w = new K2.e(new K2.c(K2.a.WARNING), "BaseClockView");
        int i12 = SystemProperties.getInt("ro.sf.lcd_density", TypedValues.CycleType.TYPE_EASING);
        this.f18183x = i12;
        this.f18184y = (i12 / getResources().getDisplayMetrics().densityDpi) * 0.875f;
        this.f18185z = "";
        this.f18166A = Locale.getDefault();
        this.f18167B = new Handler(Looper.getMainLooper());
        this.f18168C = true;
        this.f18169D = true;
        this.f18171F = 1.0f;
        this.f18172G = getResources().getDimension(I2.b.f2846k) * this.f18184y;
        this.f18173H = SystemProperties.getInt("customzation.snapshotRatio", 410) / 1000.0f;
        this.f18174I = p007a6.a.a("NTF_DYNAMIC_CLOCKFACE_TRANSITION");
        this.f18175J = true;
        setWillNotDraw(false);
    }

    public static /* synthetic */ void C(D d10, boolean z9, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshFormat");
        }
        if ((i10 & 2) != 0) {
            locale = d10.f18166A;
        }
        d10.B(z9, locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "refreshFormat(" + d10.o() + ") (" + d10.n() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "refreshFormat(" + d10.o() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "refreshTime() - before invalidate new time: " + d10.o();
    }

    private final void I() {
        this.f18171F = this.f18169D ? 1.0f : 0.7f;
        this.f18184y = (this.f18183x / getResources().getDisplayMetrics().densityDpi) * 0.875f;
        float dimension = getResources().getDimension(I2.b.f2846k);
        float f10 = this.f18184y;
        this.f18172G = dimension * f10;
        this.f18184y = f10 * this.f18171F;
        if (this.f18170E) {
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "onConfigurationChanged(" + d10.o() + ") (" + d10.n() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(D d10) {
        C(d10, DateFormat.is24HourFormat(d10.getContext()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "onDraw(" + d10.o() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "onTimeZoneChanged(" + d10.o() + ")";
    }

    protected void A() {
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0027  */
    public void B(boolean z9, Locale newLocale) {
        kotlin.jvm.internal.n.h(newLocale, "newLocale");
        Trace.beginSection(getTag() + "#refreshFormat");
        String str = "h:mm";
        if (this instanceof QuickLookClockView) {
            if (z9) {
                str = "HH:mm";
            }
        } else if (this instanceof OldQuickLookClockView) {
            if (z9) {
                str = "HH:mm";
            }
        } else if (this instanceof GraphicClockView) {
            str = "hmmss";
        } else {
            str = z9 ? "HHmm" : "hmm";
        }
        K2.e eVar = this.f18182w;
        p219v8.l lVar = new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.z
            @Override // p219v8.l
            public final Object f(Object obj) {
                return D.D((K2.b) obj);
            }
        };
        K2.a aVar = K2.a.DEBUG;
        K2.b bVarA = eVar.e().a(eVar.f(), aVar, lVar, null);
        bVarA.k(String.valueOf(z9));
        bVarA.i(newLocale.toString());
        eVar.e().b(bVarA);
        if (!kotlin.jvm.internal.n.d(this.f18178s, str) || !kotlin.jvm.internal.n.d(this.f18166A, newLocale)) {
            K2.e eVar2 = this.f18182w;
            K2.b bVarA2 = eVar2.e().a(eVar2.f(), aVar, new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.A
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return D.E((K2.b) obj);
                }
            }, null);
            bVarA2.k(str);
            eVar2.e().b(bVarA2);
            this.f18178s = str;
            this.f18166A = newLocale;
            F();
        }
        Trace.endSection();
    }

    public void F() {
        if (this.f18178s == null) {
            return;
        }
        this.f18177r.setTimeInMillis(System.currentTimeMillis());
        String str = new SimpleDateFormat(this.f18178s, Locale.ENGLISH).format(this.f18177r.getTime());
        if (kotlin.jvm.internal.n.d(this.f18185z, str)) {
            return;
        }
        kotlin.jvm.internal.n.e(str);
        if (str.length() > 0) {
            K2.e eVar = this.f18182w;
            p219v8.l lVar = new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.B
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return D.G((K2.b) obj);
                }
            };
            K2.b bVarA = eVar.e().a(eVar.f(), K2.a.DEBUG, lVar, null);
            bVarA.k(str);
            eVar.e().b(bVarA);
            this.f18185z = str;
            setContentDescription(getTalkBackContent());
            invalidate();
            K2.e.c(this.f18182w, "refreshTime() - after invalidate", null, 2, null);
        }
    }

    public void H() {
        this.f18184y *= this.f18173H;
    }

    protected final boolean getCLOCKFACE_TRANSITION_ENABLED() {
        return this.f18174I;
    }

    protected final Calendar getCalendar() {
        return this.f18177r;
    }

    public int getClockHeight() {
        return (int) (getResources().getDimension(I2.b.f2840e) * this.f18184y);
    }

    protected final float getClockPaddingHorizontal() {
        return this.f18170E ? this.f18172G * this.f18173H : this.f18172G;
    }

    protected final String getFormat() {
        return this.f18178s;
    }

    protected final K2.e getLogger() {
        return this.f18182w;
    }

    public final K2.f getMessageBuffer() {
        return this.f18182w.e();
    }

    protected final float getScaleRatio() {
        return this.f18184y;
    }

    protected final float getSizeScaleRatio() {
        return this.f18171F;
    }

    protected final float getSnapshotRatio() {
        return this.f18173H;
    }

    @Override // android.view.View
    public abstract String getTag();

    public final String getTalkBackContent() {
        if (DateFormat.is24HourFormat(getContext())) {
            String str = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(this.f18177r.getTime());
            kotlin.jvm.internal.n.g(str, "format(...)");
            return str;
        }
        String str2 = new SimpleDateFormat("hh:mm", Locale.ENGLISH).format(this.f18177r.getTime());
        kotlin.jvm.internal.n.g(str2, "format(...)");
        return str2;
    }

    protected final String getTimeStr() {
        return this.f18185z;
    }

    public abstract void h(Canvas canvas);

    protected final boolean i() {
        return this.f18168C;
    }

    @Override // android.view.View
    public void invalidate() {
        K2.e.c(this.f18182w, "invalidate", null, 2, null);
        super.invalidate();
    }

    protected final boolean j() {
        return this.f18175J;
    }

    protected final boolean k() {
        return this.f18179t;
    }

    protected final Boolean l() {
        return this.f18181v;
    }

    protected final boolean m() {
        return this.f18180u;
    }

    protected final boolean n() {
        return this.f18170E;
    }

    public void o(O2.a data) {
        kotlin.jvm.internal.n.h(data, "data");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        K2.e.c(this.f18182w, "onAttachedToWindow", null, 2, null);
        super.onAttachedToWindow();
        Log.d(getTag(), " onAttachedToWindow:");
        Trace.beginSection(getTag() + "#onAttachedToWindow");
        F();
        A();
        Trace.endSection();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.n.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        K2.e eVar = this.f18182w;
        K2.b bVarA = eVar.e().a(eVar.f(), K2.a.DEBUG, new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.x
            @Override // p219v8.l
            public final Object f(Object obj) {
                return D.r((K2.b) obj);
            }
        }, null);
        Locale locale = newConfig.locale;
        bVarA.k(locale != null ? locale.toString() : null);
        Locale locale2 = this.f18166A;
        bVarA.i(locale2 != null ? locale2.toString() : null);
        eVar.e().b(bVarA);
        if (!newConfig.locale.equals(this.f18166A)) {
            this.f18166A = newConfig.locale;
            this.f18167B.post(new Runnable() { // from class: com.nothing.systemui.shared.clocks.view.y
                @Override // java.lang.Runnable
                public final void run() {
                    D.s(this.f18423q);
                }
            });
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        K2.e.c(this.f18182w, "onDetachedFromWindow", null, 2, null);
        super.onDetachedFromWindow();
        Log.d(getTag(), " onDetachedFromWindow");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        Trace.beginSection(getTag() + "#onDraw");
        K2.e eVar = this.f18182w;
        K2.b bVarA = eVar.e().a(eVar.f(), K2.a.DEBUG, new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.w
            @Override // p219v8.l
            public final Object f(Object obj) {
                return D.t((K2.b) obj);
            }
        }, null);
        bVarA.k(this.f18185z);
        eVar.e().b(bVarA);
        super.onDraw(canvas);
        canvas.setDrawFilter(this.f18176q);
        Log.d(getTag(), " onDraw:" + this.f18181v);
        h(canvas);
        Trace.endSection();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), getClockHeight());
    }

    public void p(X5.a aVar) {
    }

    public void q(boolean z9, boolean z10, boolean z11) {
        this.f18168C = z9;
        this.f18169D = z10;
        this.f18175J = z11;
        I();
        requestLayout();
    }

    protected final void setClockFaceTransitionEnabled(boolean z9) {
        this.f18175J = z9;
    }

    protected final void setDoze(boolean z9) {
        this.f18179t = z9;
    }

    protected final void setFormat(String str) {
        this.f18178s = str;
    }

    public void setIsSnapshotClockView(boolean z9) {
        this.f18170E = z9;
        I();
        requestLayout();
    }

    protected final void setLogger(K2.e eVar) {
        kotlin.jvm.internal.n.h(eVar, "<set-?>");
        this.f18182w = eVar;
    }

    public final void setMessageBuffer(K2.f value) {
        kotlin.jvm.internal.n.h(value, "value");
        this.f18182w = new K2.e(value, getTag());
    }

    protected final void setRegionDark(Boolean bool) {
        this.f18181v = bool;
    }

    protected final void setScaleRatio(float f10) {
        this.f18184y = f10;
    }

    protected final void setScreenOff(boolean z9) {
        this.f18180u = z9;
    }

    protected final void setSizeScaleRatio(float f10) {
        this.f18171F = f10;
    }

    protected final void setSnapshotClockView(boolean z9) {
        this.f18170E = z9;
    }

    protected final void setSnapshotRatio(float f10) {
        this.f18173H = f10;
    }

    protected final void setTimeStr(String str) {
        kotlin.jvm.internal.n.h(str, "<set-?>");
        this.f18185z = str;
    }

    public void setWindowWidth(int i10) {
    }

    public void u() {
        I();
        z();
        invalidate();
    }

    public void v(O2.y theme) {
        kotlin.jvm.internal.n.h(theme, "theme");
        boolean zC = theme.c();
        if (kotlin.jvm.internal.n.d(this.f18181v, Boolean.valueOf(zC))) {
            return;
        }
        this.f18181v = Boolean.valueOf(zC);
        A();
    }

    public void w(TimeZone timeZone) {
        kotlin.jvm.internal.n.h(timeZone, "timeZone");
        K2.e eVar = this.f18182w;
        p219v8.l lVar = new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.C
            @Override // p219v8.l
            public final Object f(Object obj) {
                return D.x((K2.b) obj);
            }
        };
        K2.b bVarA = eVar.e().a(eVar.f(), K2.a.DEBUG, lVar, null);
        bVarA.k(timeZone.toString());
        eVar.e().b(bVarA);
        this.f18177r.setTimeZone(timeZone);
    }

    public void y(Y5.a aVar) {
    }

    public void z() {
    }
}
