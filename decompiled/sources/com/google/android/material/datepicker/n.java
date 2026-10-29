package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class n extends BaseAdapter {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f16961u = t.i().getMaximum(4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f16962v = (t.i().getMaximum(5) + t.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final m f16963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Collection f16964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    c f16965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final a f16966t;

    n(m mVar, d dVar, a aVar, g gVar) {
        this.f16963q = mVar;
        this.f16966t = aVar;
        this.f16964r = dVar.i();
    }

    private String c(Context context, long j9) {
        return e.a(context, j9, j(j9), i(j9), g(j9));
    }

    private void f(Context context) {
        if (this.f16965s == null) {
            this.f16965s = new c(context);
        }
    }

    private boolean h(long j9) {
        throw null;
    }

    private boolean j(long j9) {
        return t.g().getTimeInMillis() == j9;
    }

    private void m(TextView textView, long j9, int i10) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j9));
        if (this.f16966t.f().h(j9)) {
            textView.setEnabled(true);
            boolean zH = h(j9);
            textView.setSelected(zH);
            if (zH) {
                bVar = this.f16965s.f16865b;
            } else {
                bVar = j(j9) ? this.f16965s.f16866c : this.f16965s.f16864a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f16965s.f16870g;
        }
        bVar.b(textView);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j9) {
        if (m.f(j9).equals(this.f16963q)) {
            int iM = this.f16963q.m(j9);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iM) - materialCalendarGridView.getFirstVisiblePosition()), j9, iM);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f16963q.k(this.f16966t.j());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > k()) {
            return null;
        }
        return Long.valueOf(this.f16963q.l(l(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p225w4.g.f28865p, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            m mVar = this.f16963q;
            if (iB >= mVar.f16958u) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
                textView.setTag(mVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        m(textView, item.longValue(), i11);
        return textView;
    }

    boolean g(long j9) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f16962v;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f16963q.f16957t;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j9) {
        throw null;
    }

    int k() {
        return (b() + this.f16963q.f16958u) - 1;
    }

    int l(int i10) {
        return (i10 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f16964r.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean p(int i10) {
        return i10 >= b() && i10 <= k();
    }
}
