package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f16873t = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Calendar f16874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f16875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f16876s;

    public h() {
        Calendar calendarI = t.i();
        this.f16874q = calendarI;
        this.f16875r = calendarI.getMaximum(7);
        this.f16876s = calendarI.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f16876s;
        int i12 = this.f16875r;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f16875r) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16875r;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p225w4.g.f28866q, viewGroup, false);
        }
        this.f16874q.set(7, b(i10));
        textView.setText(this.f16874q.getDisplayName(7, f16873t, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(p225w4.i.f28894q), this.f16874q.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = t.i();
        this.f16874q = calendarI;
        this.f16875r = calendarI.getMaximum(7);
        this.f16876s = i10;
    }
}
