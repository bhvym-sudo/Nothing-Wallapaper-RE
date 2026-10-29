package com.nothing.systemui.shared.clocks.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class OldQuickLookClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18344L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f18345M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private X5.a f18346N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Y5.a f18347O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f18348P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private String f18349Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Date f18350R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private String f18351S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Handler f18352T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f18353U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18354V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldQuickLookClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void K(X5.a aVar, Y5.a aVar2) {
        String strB;
        int iC = aVar2 != null ? aVar2.c() : Integer.MIN_VALUE;
        if (aVar2 == null || (strB = aVar2.b()) == null) {
            strB = "";
        }
        int iA = Y5.b.f9357a.a(aVar2 != null ? aVar2.a() : 0);
        boolean z9 = aVar2 != null;
        boolean z10 = (iC == Integer.MIN_VALUE || strB.length() <= 0 || iA == 0) ? false : true;
        boolean z11 = aVar != null && aVar.h();
        Log.d(getTag(), "refreshInfo hasCalendar:" + z11 + " hasWeather:" + z9);
        if (z11) {
            TextView textView = (TextView) findViewById(I2.d.f2951e);
            String strD = null;
            if (textView != null) {
                textView.setText(aVar != null ? aVar.f() : null);
            }
            if ((aVar != null ? aVar.d() : null) == null) {
                strD = "";
            } else if (aVar != null) {
                strD = aVar.d();
            }
            String strD2 = X5.b.d(getContext(), aVar);
            if (strD != null && !"".equals(strD)) {
                strD2 = strD2 + " " + strD;
            }
            TextView textView2 = (TextView) findViewById(I2.d.f2949c);
            if (textView2 != null) {
                textView2.setText(strD2);
            }
            View viewFindViewById = findViewById(I2.d.f2950d);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(I2.d.f2964r);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            TextView textView3 = (TextView) findViewById(I2.d.f2963q);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(I2.d.f2954h);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (z9) {
            if (z10) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(iC);
                stringBuffer.append("° ");
                stringBuffer.append(strB);
                ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
                if (imageView != null) {
                    imageView.setImageResource(iA);
                }
                TextView textView4 = (TextView) findViewById(I2.d.f2966t);
                if (textView4 != null) {
                    textView4.setText(stringBuffer.toString());
                }
                View viewFindViewById3 = findViewById(I2.d.f2964r);
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setVisibility(0);
                }
                TextView textView5 = (TextView) findViewById(I2.d.f2963q);
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
            } else {
                View viewFindViewById4 = findViewById(I2.d.f2964r);
                if (viewFindViewById4 != null) {
                    viewFindViewById4.setVisibility(8);
                }
                TextView textView6 = (TextView) findViewById(I2.d.f2963q);
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
            }
            LinearLayout linearLayout2 = (LinearLayout) findViewById(I2.d.f2954h);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            View viewFindViewById5 = findViewById(I2.d.f2950d);
            if (viewFindViewById5 != null) {
                viewFindViewById5.setVisibility(8);
            }
        } else {
            TextView textView7 = (TextView) findViewById(I2.d.f2963q);
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            LinearLayout linearLayout3 = (LinearLayout) findViewById(I2.d.f2954h);
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            View viewFindViewById6 = findViewById(I2.d.f2950d);
            if (viewFindViewById6 != null) {
                viewFindViewById6.setVisibility(8);
            }
            View viewFindViewById7 = findViewById(I2.d.f2964r);
            if (viewFindViewById7 != null) {
                viewFindViewById7.setVisibility(8);
            }
        }
        int i10 = I2.d.f2951e;
        TextView textView8 = (TextView) findViewById(i10);
        if (textView8 != null) {
            textView8.setIncludeFontPadding(false);
        }
        int i11 = I2.d.f2949c;
        TextView textView9 = (TextView) findViewById(i11);
        if (textView9 != null) {
            textView9.setIncludeFontPadding(p047e6.a.e());
        }
        int i12 = I2.d.f2966t;
        TextView textView10 = (TextView) findViewById(i12);
        if (textView10 != null) {
            textView10.setIncludeFontPadding(p047e6.a.e());
        }
        int i13 = I2.d.f2963q;
        TextView textView11 = (TextView) findViewById(i13);
        if (textView11 != null) {
            textView11.setIncludeFontPadding(p047e6.a.e());
        }
        int i14 = I2.d.f2955i;
        TextView textView12 = (TextView) findViewById(i14);
        if (textView12 != null) {
            textView12.setIncludeFontPadding(p047e6.a.e());
        }
        int i15 = I2.d.f2948b;
        TextView textView13 = (TextView) findViewById(i15);
        if (textView13 != null) {
            textView13.setIncludeFontPadding(p047e6.a.e());
        }
        TextView textView14 = (TextView) findViewById(I2.d.f2952f);
        if (textView14 != null) {
            textView14.setTypeface(p047e6.a.b());
        }
        TextView textView15 = (TextView) findViewById(i10);
        if (textView15 != null) {
            textView15.setTypeface(p047e6.a.d());
        }
        TextView textView16 = (TextView) findViewById(i11);
        if (textView16 != null) {
            textView16.setTypeface(p047e6.a.d());
        }
        TextView textView17 = (TextView) findViewById(i12);
        if (textView17 != null) {
            textView17.setTypeface(p047e6.a.d());
        }
        TextView textView18 = (TextView) findViewById(i13);
        if (textView18 != null) {
            textView18.setTypeface(p047e6.a.d());
        }
        TextView textView19 = (TextView) findViewById(i14);
        if (textView19 != null) {
            textView19.setTypeface(p047e6.a.d());
        }
        TextView textView20 = (TextView) findViewById(i15);
        if (textView20 != null) {
            textView20.setTypeface(p047e6.a.d());
        }
        A();
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(OldQuickLookClockView oldQuickLookClockView) {
        String formattedDateLocked = oldQuickLookClockView.getFormattedDateLocked();
        Log.d(oldQuickLookClockView.getTag(), "updateDateInfo: " + formattedDateLocked);
        if (!kotlin.jvm.internal.n.d(formattedDateLocked, oldQuickLookClockView.f18349Q)) {
            oldQuickLookClockView.f18349Q = formattedDateLocked;
            TextView textView = (TextView) oldQuickLookClockView.findViewById(I2.d.f2955i);
            if (textView != null) {
                textView.setText(oldQuickLookClockView.f18349Q);
            }
        }
        oldQuickLookClockView.K(oldQuickLookClockView.f18346N, oldQuickLookClockView.f18347O);
    }

    private final boolean O(O2.a aVar, int i10) {
        if (aVar == null || aVar.a() == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(i10);
        Long lA = aVar.a();
        kotlin.jvm.internal.n.e(lA);
        return lA.longValue() <= jCurrentTimeMillis;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    protected void A() {
        int i10;
        boolean z9 = k() || m();
        float clockPaddingHorizontal = getClockPaddingHorizontal();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        if (i11 >= i12) {
            i11 = i12;
        }
        int i13 = (int) (((!n() || (i10 = this.f18353U) < 0) ? i11 : i10) - (clockPaddingHorizontal * 2));
        float dimension = getResources().getDimension(I2.b.f2860y) * getScaleRatio();
        LinearLayout linearLayout = (LinearLayout) findViewById(I2.d.f2953g);
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = i13;
            layoutParams.height = (int) dimension;
            linearLayout.setLayoutParams(layoutParams);
        }
        int i14 = (!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || z9 || m()) ? -1 : -16777216;
        TextView textView = (TextView) findViewById(I2.d.f2952f);
        if (textView != null) {
            textView.setTextColor(i14);
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2955i);
        if (textView2 != null) {
            textView2.setTextColor(i14);
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2963q);
        if (textView3 != null) {
            textView3.setTextColor(i14);
        }
        TextView textView4 = (TextView) findViewById(I2.d.f2966t);
        if (textView4 != null) {
            textView4.setTextColor(i14);
        }
        TextView textView5 = (TextView) findViewById(I2.d.f2951e);
        if (textView5 != null) {
            textView5.setTextColor(i14);
        }
        TextView textView6 = (TextView) findViewById(I2.d.f2949c);
        if (textView6 != null) {
            textView6.setTextColor(i14);
        }
        TextView textView7 = (TextView) findViewById(I2.d.f2948b);
        if (textView7 != null) {
            textView7.setTextColor(i14);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2947a);
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        ImageView imageView2 = (ImageView) findViewById(I2.d.f2965s);
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void B(boolean z9, Locale newLocale) {
        kotlin.jvm.internal.n.h(newLocale, "newLocale");
        super.B(z9, newLocale);
        M();
        Log.d(getTag(), "refreshFormat: " + this.f18349Q);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void F() {
        TextView textView;
        super.F();
        String timeStr = getTimeStr();
        if (timeStr.length() > 0 && (textView = (TextView) findViewById(I2.d.f2952f)) != null) {
            textView.setText(timeStr);
        }
        K(this.f18346N, this.f18347O);
        M();
        requestLayout();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void H() {
        setSnapshotRatio(SystemProperties.getInt("customization.old_quick_look", 470) / 1000.0f);
        setScaleRatio(getScaleRatio() * getSnapshotRatio());
        L();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00e9  */
    public final void L() {
        int dimension = (int) (getResources().getDimension(I2.b.f2830F) * getScaleRatio());
        int dimension2 = (int) (getResources().getDimension(I2.b.f2829E) * getScaleRatio());
        int dimension3 = (int) (getResources().getDimension(I2.b.f2832H) * getScaleRatio());
        int dimension4 = (int) (getResources().getDimension(I2.b.f2828D) * getScaleRatio());
        int dimension5 = (int) (getResources().getDimension(I2.b.f2825A) * getScaleRatio());
        int dimension6 = (int) (getResources().getDimension(I2.b.f2831G) * getScaleRatio());
        getResources().getDimension(I2.b.f2849n);
        getScaleRatio();
        int dimension7 = (int) (getResources().getDimension(I2.b.f2861z) * getScaleRatio());
        int dimension8 = (int) (getResources().getDimension(I2.b.f2859x) * getScaleRatio());
        float dimension9 = getResources().getDimension(I2.b.f2826B) * getScaleRatio();
        float dimension10 = getResources().getDimension(I2.b.f2827C) * getScaleRatio();
        getClockPaddingHorizontal();
        int i10 = I2.d.f2952f;
        TextView textView = (TextView) findViewById(i10);
        if (textView != null) {
            textView.setTextSize(0, dimension9);
        }
        TextView textView2 = (TextView) findViewById(i10);
        if (textView2 != null) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -2;
            layoutParams2.height = (int) dimension9;
            if (this.f18347O != null) {
                layoutParams2.topMargin = dimension2;
            } else {
                X5.a aVar = this.f18346N;
                if (aVar != null) {
                    kotlin.jvm.internal.n.e(aVar);
                    if (aVar.h()) {
                        layoutParams2.topMargin = dimension2;
                    }
                }
                layoutParams2.topMargin = dimension3;
            }
            layoutParams2.bottomMargin = dimension4;
            textView2.setPadding(0, dimension, 0, 0);
            textView2.setLayoutParams(layoutParams2);
        }
        int i11 = I2.d.f2963q;
        TextView textView3 = (TextView) findViewById(i11);
        if (textView3 != null) {
            textView3.setTextSize(0, dimension10);
        }
        TextView textView4 = (TextView) findViewById(i11);
        if (textView4 != null) {
            ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = dimension5;
            textView4.setLayoutParams(layoutParams4);
        }
        TextView textView5 = (TextView) findViewById(i11);
        if (textView5 != null) {
            textView5.setTextSize(0, dimension10);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(I2.d.f2954h);
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = dimension5;
            linearLayout.setLayoutParams(layoutParams6);
        }
        int i12 = I2.d.f2955i;
        TextView textView6 = (TextView) findViewById(i12);
        if (textView6 != null) {
            textView6.setTextSize(0, dimension10);
        }
        TextView textView7 = (TextView) findViewById(i12);
        if (textView7 != null) {
            ViewGroup.LayoutParams layoutParams7 = textView7.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
            layoutParams8.setMarginEnd(dimension5);
            textView7.setLayoutParams(layoutParams8);
        }
        TextView textView8 = (TextView) findViewById(I2.d.f2948b);
        if (textView8 != null) {
            textView8.setTextSize(0, dimension10);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2947a);
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams9 = imageView.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
            layoutParams10.width = dimension8;
            layoutParams10.height = dimension8;
            layoutParams10.setMarginEnd(dimension5);
            imageView.setLayoutParams(layoutParams10);
        }
        ImageView imageView2 = (ImageView) findViewById(I2.d.f2965s);
        if (imageView2 != null) {
            ViewGroup.LayoutParams layoutParams11 = imageView2.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams11, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
            layoutParams12.width = dimension7;
            layoutParams12.height = dimension7;
            layoutParams12.setMarginEnd(dimension6);
            imageView2.setLayoutParams(layoutParams12);
        }
        TextView textView9 = (TextView) findViewById(I2.d.f2966t);
        if (textView9 != null) {
            textView9.setTextSize(0, dimension10);
        }
        int i13 = I2.d.f2951e;
        TextView textView10 = (TextView) findViewById(i13);
        if (textView10 != null) {
            textView10.setTextSize(0, dimension10);
        }
        TextView textView11 = (TextView) findViewById(i13);
        if (textView11 != null) {
            ViewGroup.LayoutParams layoutParams13 = textView11.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams13, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams14 = (LinearLayout.LayoutParams) layoutParams13;
            layoutParams14.bottomMargin = dimension5;
            textView11.setLayoutParams(layoutParams14);
        }
        TextView textView12 = (TextView) findViewById(I2.d.f2949c);
        if (textView12 != null) {
            textView12.setTextSize(0, dimension10);
        }
    }

    protected final void M() {
        this.f18352T.postDelayed(new Runnable() { // from class: com.nothing.systemui.shared.clocks.view.O
            @Override // java.lang.Runnable
            public final void run() {
                OldQuickLookClockView.N(this.f18343q);
            }
        }, 100L);
    }

    public final int getALARM_VISIBILITY_HOURS() {
        return this.f18345M;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public int getClockHeight() {
        return (int) (getResources().getDimension(I2.b.f2860y) * getScaleRatio());
    }

    @SuppressLint({"NewApi"})
    protected final String getFormattedDateLocked() {
        Locale locale = Locale.getDefault();
        Log.d(getTag(), " getFormattedDateLocked:" + locale);
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(this.f18348P, locale);
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
        Date date = this.f18350R;
        if (date != null) {
            date.setTime(System.currentTimeMillis());
        }
        return instanceForSkeleton.format(this.f18350R);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18344L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void o(O2.a data) {
        kotlin.jvm.internal.n.h(data, "data");
        super.o(data);
        Log.d(getTag(), " onAlarmDataChanged:" + data + " withinNHoursLocked:" + O(data, this.f18345M) + " parent:" + getParent());
        if (O(data, this.f18345M)) {
            String str = android.text.format.DateFormat.is24HourFormat(getContext()) ? "HH:mm" : "h:mm";
            Long lA = data.a();
            kotlin.jvm.internal.n.e(lA);
            this.f18351S = android.text.format.DateFormat.format(str, lA.longValue()).toString();
        } else {
            this.f18351S = "";
        }
        if (TextUtils.isEmpty(this.f18351S)) {
            ImageView imageView = (ImageView) findViewById(I2.d.f2947a);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = (TextView) findViewById(I2.d.f2948b);
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = (ImageView) findViewById(I2.d.f2947a);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            TextView textView2 = (TextView) findViewById(I2.d.f2948b);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2948b);
        if (textView3 != null) {
            textView3.setText(this.f18351S);
        }
        K(this.f18346N, this.f18347O);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(getTag(), " onAttachedToWindow:");
        L();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            int width = (getWidth() - childAt.getMeasuredWidth()) / 2;
            int height = (getHeight() - childAt.getMeasuredHeight()) / 2;
            childAt.layout(width, height, childAt.getMeasuredWidth() + width, childAt.getMeasuredHeight() + height);
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (n() && (this.f18353U < 0 || this.f18354V < 0)) {
            this.f18353U = View.MeasureSpec.getSize(i10);
            int size = View.MeasureSpec.getSize(i11);
            this.f18354V = size;
            setMeasuredDimension(this.f18353U, size);
        }
        measureChildren(i10, i11);
        super.onMeasure(i10, i11);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void p(X5.a aVar) {
        Log.d(getTag(), "onCalendarDataChanged: " + aVar);
        if (kotlin.jvm.internal.n.d(this.f18346N, aVar)) {
            return;
        }
        this.f18346N = aVar;
        K(aVar, this.f18347O);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void w(TimeZone timeZone) {
        kotlin.jvm.internal.n.h(timeZone, "timeZone");
        super.w(timeZone);
        M();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void y(Y5.a aVar) {
        if (kotlin.jvm.internal.n.d(this.f18347O, aVar)) {
            return;
        }
        this.f18347O = aVar;
        Log.d(getTag(), " onWeatherDataChanged:" + aVar + " parent:" + getParent());
        K(this.f18346N, aVar);
    }

    public /* synthetic */ OldQuickLookClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldQuickLookClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18344L = "OLDQuickLookClockView";
        this.f18345M = 12;
        this.f18350R = new Date();
        this.f18352T = new Handler(Looper.getMainLooper());
        this.f18353U = -1;
        this.f18354V = -1;
        this.f18348P = getContext().getString(I2.f.f2995p);
    }
}
