package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f16967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i.m f16968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f16969s;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f16970q;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f16970q = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
            if (this.f16970q.getAdapter().p(i10)) {
                o.this.f16968r.a(this.f16970q.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final TextView f16972q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final MaterialCalendarGridView f16973r;

        b(LinearLayout linearLayout, boolean z9) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(p225w4.e.f28844w);
            this.f16972q = textView;
            H.h0(textView, true);
            this.f16973r = (MaterialCalendarGridView) linearLayout.findViewById(p225w4.e.f28840s);
            if (z9) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    o(Context context, d dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        m mVarM = aVar.m();
        m mVarG = aVar.g();
        m mVarL = aVar.l();
        if (mVarM.compareTo(mVarL) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (mVarL.compareTo(mVarG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f16969s = (n.f16961u * i.q0(context)) + (k.C0(context) ? i.q0(context) : 0);
        this.f16967q = aVar;
        this.f16968r = mVar;
        setHasStableIds(true);
    }

    m e(int i10) {
        return this.f16967q.m().p(i10);
    }

    CharSequence f(int i10) {
        return e(i10).n();
    }

    int g(m mVar) {
        return this.f16967q.m().q(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f16967q.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f16967q.m().p(i10).o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        m mVarP = this.f16967q.m().p(i10);
        bVar.f16972q.setText(mVarP.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f16973r.findViewById(p225w4.e.f28840s);
        if (materialCalendarGridView.getAdapter() == null || !mVarP.equals(materialCalendarGridView.getAdapter().f16963q)) {
            n nVar = new n(mVarP, null, this.f16967q, null);
            materialCalendarGridView.setNumColumns(mVarP.f16957t);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(p225w4.g.f28868s, viewGroup, false);
        if (!k.C0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f16969s));
        return new b(linearLayout, true);
    }
}
