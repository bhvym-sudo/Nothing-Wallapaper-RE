package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Context f10450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    LayoutInflater f10451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    e f10452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ExpandedMenuView f10453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f10454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f10455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f10456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f10457x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    a f10458y;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f10459q = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f10452s.v();
            if (gVarV != null) {
                ArrayList arrayListZ = c.this.f10452s.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListZ.get(i10)) == gVarV) {
                        this.f10459q = i10;
                        return;
                    }
                }
            }
            this.f10459q = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListZ = c.this.f10452s.z();
            int i11 = i10 + c.this.f10454u;
            int i12 = this.f10459q;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f10452s.z().size() - c.this.f10454u;
            return this.f10459q < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f10451r.inflate(cVar.f10456w, viewGroup, false);
            }
            ((k.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f10450q = context;
        this.f10451r = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f10458y == null) {
            this.f10458y = new a();
        }
        return this.f10458y;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f10453t == null) {
            this.f10453t = (ExpandedMenuView) this.f10451r.inflate(p050f.g.f20462g, viewGroup, false);
            if (this.f10458y == null) {
                this.f10458y = new a();
            }
            this.f10453t.setAdapter((ListAdapter) this.f10458y);
            this.f10453t.setOnItemClickListener(this);
        }
        return this.f10453t;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z9) {
        j.a aVar = this.f10457x;
        if (aVar != null) {
            aVar.c(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z9) {
        a aVar = this.f10458y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f10457x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f10455v != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f10455v);
            this.f10450q = contextThemeWrapper;
            this.f10451r = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f10450q != null) {
            this.f10450q = context;
            if (this.f10451r == null) {
                this.f10451r = LayoutInflater.from(context);
            }
        }
        this.f10452s = eVar;
        a aVar = this.f10458y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f10457x;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        this.f10452s.N(this.f10458y.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f10456w = i10;
        this.f10455v = i11;
    }
}
