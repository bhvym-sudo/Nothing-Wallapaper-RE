package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    e f10461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10462r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f10464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final LayoutInflater f10465u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f10466v;

    public d(e eVar, LayoutInflater layoutInflater, boolean z9, int i10) {
        this.f10464t = z9;
        this.f10465u = layoutInflater;
        this.f10461q = eVar;
        this.f10466v = i10;
        a();
    }

    void a() {
        g gVarV = this.f10461q.v();
        if (gVarV != null) {
            ArrayList arrayListZ = this.f10461q.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListZ.get(i10)) == gVarV) {
                    this.f10462r = i10;
                    return;
                }
            }
        }
        this.f10462r = -1;
    }

    public e b() {
        return this.f10461q;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListZ = this.f10464t ? this.f10461q.z() : this.f10461q.E();
        int i11 = this.f10462r;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListZ.get(i10);
    }

    public void d(boolean z9) {
        this.f10463s = z9;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListZ = this.f10464t ? this.f10461q.z() : this.f10461q.E();
        return this.f10462r < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f10465u.inflate(this.f10466v, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f10461q.G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f10463s) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
