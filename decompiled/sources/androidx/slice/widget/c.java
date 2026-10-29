package androidx.slice.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C1021a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c extends RecyclerView.Adapter implements SliceActionView.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f13917A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f13918B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f13919C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f13920D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f13921E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f13923G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Context f13925r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f13927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    j f13928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    List f13929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f13930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    long f13931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    SliceView f13932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    LargeTemplateView f13933z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a f13924q = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f13926s = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    Set f13922F = new HashSet();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13934a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1021a f13935b = new C1021a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C1021a f13936c = new C1021a();

        a() {
        }

        private String a(SliceItem sliceItem) {
            return ("slice".equals(sliceItem.d()) || "action".equals(sliceItem.d())) ? String.valueOf(sliceItem.j().e().size()) : sliceItem.toString();
        }

        public long b(SliceItem sliceItem) {
            String strA = a(sliceItem);
            if (!this.f13935b.containsKey(strA)) {
                C1021a c1021a = this.f13935b;
                long j9 = this.f13934a;
                this.f13934a = 1 + j9;
                c1021a.put(strA, Long.valueOf(j9));
            }
            long jLongValue = ((Long) this.f13935b.get(strA)).longValue();
            Integer num = (Integer) this.f13936c.get(strA);
            int iIntValue = num != null ? num.intValue() : 0;
            this.f13936c.put(strA, Integer.valueOf(iIntValue + 1));
            return jLongValue + ((long) (iIntValue * 10000));
        }

        public void c() {
            this.f13936c.clear();
        }
    }

    public class b extends RecyclerView.ViewHolder implements View.OnTouchListener, View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final SliceChildView f13937q;

        public b(View view) {
            super(view);
            this.f13937q = view instanceof SliceChildView ? (SliceChildView) view : null;
        }

        void d(SliceItem sliceItem, int i10) {
            SliceChildView sliceChildView = this.f13937q;
            if (sliceChildView == null || sliceItem == null) {
                return;
            }
            sliceChildView.setOnClickListener(this);
            this.f13937q.setOnTouchListener(this);
            this.f13937q.setSliceActionLoadingListener(c.this);
            boolean z9 = i10 == 0;
            boolean zT = d.t(sliceItem);
            SliceView sliceView = c.this.f13932y;
            int mode = sliceView != null ? sliceView.getMode() : 2;
            this.f13937q.setLoadingActions(c.this.f13922F);
            this.f13937q.setMode(mode);
            this.f13937q.setMaxSmallHeight(c.this.f13921E);
            this.f13937q.setTint(c.this.f13927t);
            this.f13937q.setStyle(c.this.f13928u);
            this.f13937q.setShowLastUpdated(z9 && c.this.f13930w);
            this.f13937q.setLastUpdated(z9 ? c.this.f13931x : -1L);
            int i11 = i10 == 0 ? c.this.f13918B : 0;
            int i12 = i10 == c.this.getItemCount() - 1 ? c.this.f13920D : 0;
            SliceChildView sliceChildView2 = this.f13937q;
            c cVar = c.this;
            sliceChildView2.b(cVar.f13917A, i11, cVar.f13919C, i12);
            SliceChildView sliceChildView3 = this.f13937q;
            if (sliceChildView3 instanceof RowView) {
                ((RowView) sliceChildView3).setSingleItem(c.this.getItemCount() == 1);
            }
            this.f13937q.setAllowTwoLines(c.this.f13923G);
            this.f13937q.setSliceActions(z9 ? c.this.f13929v : null);
            SliceChildView sliceChildView4 = this.f13937q;
            int itemCount = c.this.getItemCount();
            c.this.getClass();
            sliceChildView4.c(sliceItem, zT, i10, itemCount, null);
            c cVar2 = c.this;
            this.f13937q.setTag(new int[]{d.l(cVar2.f13925r, sliceItem, zT, cVar2.f13929v), i10});
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SliceView sliceView = c.this.f13932y;
            if (sliceView != null) {
                sliceView.setClickInfo((int[]) view.getTag());
                c.this.f13932y.performClick();
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LargeTemplateView largeTemplateView = c.this.f13933z;
            if (largeTemplateView == null) {
                return false;
            }
            largeTemplateView.d(motionEvent);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.slice.widget.c$c, reason: collision with other inner class name */
    protected static class C0414c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SliceItem f13939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f13940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f13941c;

        public C0414c(SliceItem sliceItem, a aVar, int i10) {
            this.f13939a = sliceItem;
            this.f13940b = a(sliceItem);
            this.f13941c = aVar.b(sliceItem);
        }

        public static int a(SliceItem sliceItem) {
            if ("message".equals(sliceItem.k())) {
                return p112l1.f.p(sliceItem, null, "source") != null ? 4 : 5;
            }
            if (sliceItem.n("horizontal")) {
                return 3;
            }
            return !sliceItem.n("list_item") ? 2 : 1;
        }
    }

    public c(Context context) {
        this.f13925r = context;
        setHasStableIds(true);
    }

    private View e(int i10) {
        RowView rowView = new RowView(this.f13925r);
        if (i10 == 3) {
            return LayoutInflater.from(this.f13925r).inflate(p122m1.d.f23128a, (ViewGroup) null);
        }
        if (i10 != 4) {
            return i10 != 5 ? rowView : LayoutInflater.from(this.f13925r).inflate(p122m1.d.f23132e, (ViewGroup) null);
        }
        return LayoutInflater.from(this.f13925r).inflate(p122m1.d.f23131d, (ViewGroup) null);
    }

    private void f() {
        if (getItemCount() > 0) {
            notifyItemChanged(0);
        }
    }

    @Override // androidx.slice.widget.SliceActionView.b
    public void a(SliceItem sliceItem, int i10) {
        this.f13922F.add(sliceItem);
        if (getItemCount() > i10) {
            notifyItemChanged(i10);
        } else {
            notifyDataSetChanged();
        }
    }

    public Set d() {
        return this.f13922F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.d(((C0414c) this.f13926s.get(i10)).f13939a, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13926s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return ((C0414c) this.f13926s.get(i10)).f13941c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return ((C0414c) this.f13926s.get(i10)).f13940b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewE = e(i10);
        viewE.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(viewE);
    }

    public void i(boolean z9) {
        this.f13923G = z9;
        f();
    }

    public void j(int i10, int i11, int i12, int i13) {
        this.f13917A = i10;
        this.f13918B = i11;
        this.f13919C = i12;
        this.f13920D = i13;
    }

    public void k(long j9) {
        if (this.f13931x != j9) {
            this.f13931x = j9;
            f();
        }
    }

    public void l(Set set) {
        if (set == null) {
            this.f13922F.clear();
        } else {
            this.f13922F = set;
        }
        notifyDataSetChanged();
    }

    public void m(int i10) {
        if (this.f13921E != i10) {
            this.f13921E = i10;
            f();
        }
    }

    public void n(SliceView sliceView, LargeTemplateView largeTemplateView) {
        this.f13932y = sliceView;
        this.f13933z = largeTemplateView;
    }

    public void o(boolean z9) {
        if (this.f13930w != z9) {
            this.f13930w = z9;
            f();
        }
    }

    public void p(List list) {
        this.f13929v = list;
        f();
    }

    public void q(List list, int i10, int i11) {
        if (list == null) {
            this.f13922F.clear();
            this.f13926s.clear();
        } else {
            this.f13924q.c();
            this.f13926s = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f13926s.add(new C0414c((SliceItem) it.next(), this.f13924q, i11));
            }
        }
        this.f13927t = i10;
        notifyDataSetChanged();
    }

    public void r(SliceView.d dVar) {
    }

    public void s(j jVar) {
        this.f13928u = jVar;
        notifyDataSetChanged();
    }
}
