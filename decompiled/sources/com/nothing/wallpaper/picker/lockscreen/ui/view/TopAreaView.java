package com.nothing.wallpaper.picker.lockscreen.ui.view;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.UserHandle;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import com.nothing.wallpaper.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class TopAreaView extends View {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final a f18988O = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final float f18989A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final float f18990B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f18991C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Drawable f18992D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Rect f18993E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f18994F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f18995G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f18996H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f18997I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p079h8.h f18998J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Runnable f18999K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Paint f19000L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final BroadcastReceiver f19001M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final F8.L f19002N;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f19003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f19004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f19005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AlarmManager.AlarmClockInfo f19006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f19008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Calendar f19009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private SimpleDateFormat f19010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p079h8.h f19011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ContentObserver f19012z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            TopAreaView.this.E();
            TopAreaView.this.q();
            TopAreaView.this.p();
        }
    }

    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(intent, "intent");
            if (TopAreaView.this.f19008v == null && kotlin.jvm.internal.n.d("android.intent.action.TIMEZONE_CHANGED", intent.getAction())) {
                TopAreaView.this.n(intent.getStringExtra("time-zone"));
                TopAreaView.this.q();
                TopAreaView.this.p();
                return;
            }
            if (kotlin.jvm.internal.n.d("android.intent.action.TIME_TICK", intent.getAction()) || kotlin.jvm.internal.n.d("android.intent.action.TIME_SET", intent.getAction())) {
                TopAreaView.this.q();
            } else if (kotlin.jvm.internal.n.d("android.app.action.NEXT_ALARM_CLOCK_CHANGED", intent.getAction())) {
                TopAreaView.this.p();
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19015q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f19017q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ TopAreaView f19018r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TopAreaView topAreaView, p129m8.e eVar) {
                super(2, eVar);
                this.f19018r = topAreaView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f19018r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f19017q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f19018r.x();
                return p079h8.A.f21846a;
            }
        }

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return TopAreaView.this.new d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AlarmManager.AlarmClockInfo nextAlarmClock;
            Object objE = p139n8.b.e();
            int i10 = this.f19015q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                TopAreaView topAreaView = TopAreaView.this;
                AlarmManager alarmManager = topAreaView.getAlarmManager();
                if (alarmManager == null || (nextAlarmClock = alarmManager.getNextAlarmClock()) == null) {
                    nextAlarmClock = null;
                } else {
                    TopAreaView topAreaView2 = TopAreaView.this;
                    long triggerTime = (nextAlarmClock.getTriggerTime() - System.currentTimeMillis()) - TimeUnit.HOURS.toMillis(12L);
                    if (triggerTime > 0) {
                        topAreaView2.postDelayed(topAreaView2.f18999K, triggerTime);
                    }
                }
                topAreaView.f19006t = nextAlarmClock;
                H0 h0C = C0803b0.c();
                a aVar = new a(TopAreaView.this, null);
                this.f19015q = 1;
                if (AbstractC0812g.g(h0C, aVar, this) == objE) {
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
    public TopAreaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(TopAreaView topAreaView) {
        topAreaView.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        String str = DateFormat.is24HourFormat(getContext()) ? "HH:mm" : "h:mm";
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        this.f19010x = new SimpleDateFormat(str, H6.a.a(context));
    }

    private final boolean F(long j9) {
        return j9 <= System.currentTimeMillis() + TimeUnit.HOURS.toMillis(12L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlarmManager getAlarmManager() {
        return (AlarmManager) this.f18998J.getValue();
    }

    private final SimpleDateFormat getDateSimpleFormat() {
        return (SimpleDateFormat) this.f19011y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlarmManager m(Context context) {
        return (AlarmManager) context.getSystemService(AlarmManager.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(String str) {
        this.f19009w = str != null ? Calendar.getInstance(TimeZone.getTimeZone(str)) : Calendar.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat o(Context context) {
        Locale localeA = H6.a.a(context);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeA, "E, d MMM"), localeA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        removeCallbacks(this.f18999K);
        AbstractC0816i.d(this.f19002N, null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        Calendar calendar = this.f19009w;
        if (calendar == null) {
            return;
        }
        calendar.setTimeInMillis(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = this.f19010x;
        if (simpleDateFormat == null) {
            kotlin.jvm.internal.n.r("timeSimpleFormat");
            simpleDateFormat = null;
        }
        String str = simpleDateFormat.format(calendar.getTime());
        this.f19003q = str;
        setContentDescription(str);
        this.f19004r = getDateSimpleFormat().format(calendar.getTime());
        invalidate();
    }

    private final void r() {
        if (this.f19007u) {
            if (this.f19012z == null) {
                this.f19012z = new b(getHandler());
            }
            getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("time_12_24"), true, this.f19012z, UserHandle.myUserId());
        }
    }

    private final void s() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        getContext().registerReceiver(this.f19001M, intentFilter);
    }

    private final void v() {
        ContentObserver contentObserver = this.f19012z;
        if (contentObserver != null) {
            getContext().getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    private final void w() {
        getContext().unregisterReceiver(this.f19001M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Calendar calendar = this.f19009w;
        if (calendar == null) {
            return;
        }
        AlarmManager.AlarmClockInfo alarmClockInfo = this.f19006t;
        String str = null;
        SimpleDateFormat simpleDateFormat = null;
        str = null;
        if (alarmClockInfo != null) {
            Long lValueOf = Long.valueOf(alarmClockInfo.getTriggerTime());
            if (!F(lValueOf.longValue())) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                calendar.setTimeInMillis(lValueOf.longValue());
                SimpleDateFormat simpleDateFormat2 = this.f19010x;
                if (simpleDateFormat2 == null) {
                    kotlin.jvm.internal.n.r("timeSimpleFormat");
                } else {
                    simpleDateFormat = simpleDateFormat2;
                }
                str = simpleDateFormat.format(calendar.getTime());
            }
        }
        this.f19005s = str;
        invalidate();
    }

    public final void A(O1.b snapshotModel, boolean z9) {
        kotlin.jvm.internal.n.h(snapshotModel, "snapshotModel");
        if (!z9) {
            this.f18995G = snapshotModel.d() == A7.a.CENTER ? 0.0f : 1.0f;
        }
        float f10 = kotlin.jvm.internal.n.d(snapshotModel.e(), "OLD_QUICKLOOK") ? 0.0f : 1.0f;
        this.f18996H = f10;
        this.f18997I = this.f18994F <= 0.0f ? p239x8.a.b(f10 * 255) : 255;
        invalidate();
    }

    public final void B(float f10) {
        this.f18994F = f10;
        this.f18997I = this.f18996H <= 0.0f ? p239x8.a.b(f10 * 255) : 255;
        invalidate();
    }

    public final void C(float f10) {
        B(f10);
    }

    public final int getRealHeight() {
        Paint.FontMetrics fontMetrics = this.f19000L.getFontMetrics();
        return p239x8.a.b(fontMetrics.bottom - fontMetrics.top);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19007u) {
            return;
        }
        this.f19007u = true;
        s();
        r();
        n(this.f19008v);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f19007u) {
            w();
            v();
            this.f19007u = false;
        }
        removeCallbacks(this.f18999K);
        F8.M.d(this.f19002N, null, 1, null);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        String str;
        kotlin.jvm.internal.n.h(canvas, "canvas");
        super.onDraw(canvas);
        String str2 = this.f19005s;
        boolean z9 = str2 == null || str2.length() == 0;
        float fMeasureText = this.f19000L.measureText(this.f19003q);
        float f10 = this.f18989A + fMeasureText;
        float fMeasureText2 = this.f19000L.measureText(this.f19004r);
        float fMeasureText3 = !z9 ? this.f19000L.measureText(this.f19005s) : 0.0f;
        float f11 = 2;
        float fWidth = ((f10 + fMeasureText2) + (!z9 ? (this.f18993E.width() + fMeasureText3) + (this.f18990B * 2) : 0.0f)) / f11;
        int measuredWidth = getMeasuredWidth() / 2;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        float f12 = H6.a.d(context) ? (measuredWidth + fWidth) - fMeasureText : measuredWidth - fWidth;
        float fAbs = (Math.abs(this.f19000L.ascent() + this.f19000L.descent()) / f11) + (getMeasuredHeight() / 2);
        float f13 = f10 / f11;
        float f14 = (((measuredWidth - fWidth) + f13) - this.f18991C) * this.f18995G;
        float f15 = 1;
        float f16 = this.f18994F;
        float f17 = f14 * (f15 - f16);
        float f18 = f13 * (f15 - f16);
        Context context2 = getContext();
        kotlin.jvm.internal.n.g(context2, "getContext(...)");
        float f19 = H6.a.d(context2) ? (f12 - f18) + f17 : (f12 + f18) - f17;
        this.f19000L.setAlpha(p239x8.a.b((f15 - (Math.min(f15 - this.f18994F, 0.75f) / 0.75f)) * 255));
        canvas.drawText(this.f19003q, f19, fAbs, this.f19000L);
        Context context3 = getContext();
        kotlin.jvm.internal.n.g(context3, "getContext(...)");
        float f20 = H6.a.d(context3) ? ((f12 - fMeasureText2) - this.f18989A) + f18 + f17 : ((f12 + f10) - f18) - f17;
        this.f19000L.setAlpha(this.f18997I);
        canvas.drawText(this.f19004r, f20, fAbs, this.f19000L);
        if (!z9) {
            Context context4 = getContext();
            kotlin.jvm.internal.n.g(context4, "getContext(...)");
            float fWidth2 = H6.a.d(context4) ? (f20 - this.f18990B) - this.f18993E.width() : f20 + fMeasureText2 + this.f18990B;
            this.f18993E.offsetTo((int) fWidth2, ((getMeasuredHeight() / 2) - (this.f18993E.height() / 2)) - 2);
            Drawable drawable = this.f18992D;
            if (drawable != null) {
                drawable.setAlpha(this.f18997I);
            }
            Drawable drawable2 = this.f18992D;
            if (drawable2 != null) {
                drawable2.setBounds(this.f18993E);
            }
            Drawable drawable3 = this.f18992D;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
            Context context5 = getContext();
            kotlin.jvm.internal.n.g(context5, "getContext(...)");
            float fWidth3 = H6.a.d(context5) ? (fWidth2 - this.f18990B) - fMeasureText3 : fWidth2 + this.f18993E.width() + this.f18990B;
            String str3 = this.f19005s;
            kotlin.jvm.internal.n.e(str3);
            canvas.drawText(str3, fWidth3, fAbs, this.f19000L);
        }
        if (this.f18994F > 0.0f) {
            str = this.f19003q + " " + this.f19004r + this.f19005s;
        } else {
            str = this.f19004r + this.f19005s;
        }
        setContentDescription(str);
    }

    public final void t(float f10) {
        this.f18995G = f10;
        invalidate();
    }

    public final void u(int i10, int i11, float f10) {
        A7.d dVar = A7.d.f308a;
        boolean zK = dVar.k(i10);
        boolean zK2 = dVar.k(i11);
        if (zK || zK2) {
            if (f10 > 0.0f) {
                this.f18995G = ((!zK2 || i10 >= i11) && (!zK || i10 <= i11)) ? 1 - f10 : f10;
                invalidate();
            } else {
                z(i11);
            }
        }
        boolean zJ = dVar.j(i10);
        boolean zJ2 = dVar.j(i11);
        if (zJ || zJ2) {
            if (f10 <= 0.0f) {
                z(i11);
                return;
            }
            if ((zJ2 && i10 < i11) || (zJ && i10 > i11)) {
                f10 = 1 - f10;
            }
            this.f18996H = f10;
            this.f18997I = p239x8.a.b(f10 * 255);
            invalidate();
        }
    }

    public final void y(String selectId) {
        kotlin.jvm.internal.n.h(selectId, "selectId");
        z(A7.d.f308a.e(selectId));
    }

    public final void z(int i10) {
        A7.d dVar = A7.d.f308a;
        this.f18995G = dVar.k(i10) ? 1.0f : 0.0f;
        float f10 = dVar.j(i10) ? 0.0f : 1.0f;
        this.f18996H = f10;
        this.f18997I = this.f18994F <= 0.0f ? p239x8.a.b(f10 * 255) : 255;
        invalidate();
    }

    public /* synthetic */ TopAreaView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAreaView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        this.f19003q = "";
        this.f19004r = " ";
        this.f19011y = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.V
            @Override // p219v8.a
            public final Object invoke() {
                return TopAreaView.o(context);
            }
        });
        this.f18989A = getResources().getDimension(R.dimen.top_time_paddings);
        this.f18990B = getResources().getDimension(R.dimen.top_alarm_paddings);
        this.f18991C = getResources().getDimension(R.dimen.clock_face_paddings);
        Drawable drawableD = p171r0.a.d(context, R.drawable.ic_alarm);
        this.f18992D = drawableD;
        Rect rect = new Rect();
        if (drawableD != null) {
            rect.left = 0;
            rect.top = 0;
            rect.right = drawableD.getIntrinsicWidth();
            rect.bottom = drawableD.getIntrinsicHeight();
        }
        this.f18993E = rect;
        this.f18997I = 255;
        this.f18998J = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.W
            @Override // p219v8.a
            public final Object invoke() {
                return TopAreaView.m(context);
            }
        });
        this.f18999K = new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.X
            @Override // java.lang.Runnable
            public final void run() {
                TopAreaView.D(this.f19076q);
            }
        };
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(p171r0.a.b(context, F2.F.f1542t.a(context).Y() ? android.R.color.system_neutral1_0 : android.R.color.system_neutral1_900));
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 450, false));
        paint.setTextSize(getResources().getDimension(R.dimen.top_area_text_size));
        this.f19000L = paint;
        this.f19001M = new c();
        this.f19002N = F8.M.a(C0803b0.b());
        if (drawableD != null) {
            drawableD.setTint(paint.getColor());
        }
        n(this.f19008v);
        E();
        q();
        p();
    }
}
