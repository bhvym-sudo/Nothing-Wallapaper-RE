package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p225w4.g;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Chip f17624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Chip f17625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ClockHandView f17626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ClockFaceView f17627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final MaterialButtonToggleGroup f17628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View.OnClickListener f17629v;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.c(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.d(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ GestureDetector f17632q;

        c(GestureDetector gestureDetector) {
            this.f17632q = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f17632q.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e c(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d d(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void e() {
        Chip chip = this.f17624q;
        int i10 = p225w4.e.f28808H;
        chip.setTag(i10, 12);
        this.f17625r.setTag(i10, 10);
        this.f17624q.setOnClickListener(this.f17629v);
        this.f17625r.setOnClickListener(this.f17629v);
        this.f17624q.setAccessibilityClassName("android.view.View");
        this.f17625r.setAccessibilityClassName("android.view.View");
    }

    private void f() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f17624q.setOnTouchListener(cVar);
        this.f17625r.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f17625r.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17629v = new a();
        LayoutInflater.from(context).inflate(g.f28863n, this);
        this.f17627t = (ClockFaceView) findViewById(p225w4.e.f28832k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(p225w4.e.f28835n);
        this.f17628u = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z9) {
                this.f17647a.getClass();
            }
        });
        this.f17624q = (Chip) findViewById(p225w4.e.f28838q);
        this.f17625r = (Chip) findViewById(p225w4.e.f28836o);
        this.f17626s = (ClockHandView) findViewById(p225w4.e.f28833l);
        f();
        e();
    }
}
