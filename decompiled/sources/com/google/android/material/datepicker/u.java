package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class u extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f16980q;

    public static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final TextView f16981q;

        a(TextView textView) {
            super(textView);
            this.f16981q = textView;
        }
    }

    u(i iVar) {
        this.f16980q = iVar;
    }

    int d(int i10) {
        return i10 - this.f16980q.m0().m().f16956s;
    }

    int e(int i10) {
        return this.f16980q.m0().m().f16956s + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        int iE = e(i10);
        aVar.f16981q.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iE)));
        TextView textView = aVar.f16981q;
        textView.setContentDescription(e.e(textView.getContext(), iE));
        c cVarN0 = this.f16980q.n0();
        if (t.g().get(1) == iE) {
            b bVar = cVarN0.f16869f;
        } else {
            b bVar2 = cVarN0.f16867d;
        }
        this.f16980q.p0();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p225w4.g.f28870u, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f16980q.m0().n();
    }
}
