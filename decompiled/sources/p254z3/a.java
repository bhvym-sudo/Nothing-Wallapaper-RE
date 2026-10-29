package p254z3;

import A3.f;
import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.I;
import F8.InterfaceC0807d0;
import F8.InterfaceC0846x0;
import F8.L;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f30699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1163x f30700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final I f30701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f.b f30702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p f30703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f30704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private InterfaceC0846x0 f30705w;

    /* JADX INFO: renamed from: z3.a$a, reason: collision with other inner class name */
    public static class C0762a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private InterfaceC0807d0 f30706q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0762a(View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
        }

        public final InterfaceC0807d0 d() {
            return this.f30706q;
        }

        public final void e(InterfaceC0807d0 interfaceC0807d0) {
            this.f30706q = interfaceC0807d0;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f30707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f30708r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f30710t;

        /* JADX INFO: renamed from: z3.a$b$a, reason: collision with other inner class name */
        static final class C0763a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f30711q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ List f30712r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ List f30713s;

            /* JADX INFO: renamed from: z3.a$b$a$a, reason: collision with other inner class name */
            public static final class C0764a extends DiffUtil.Callback {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f30714a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f30715b;

                C0764a(List list, List list2) {
                    this.f30714a = list;
                    this.f30715b = list2;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i10, int i11) {
                    return n.d((B3.a) this.f30714a.get(i10), (B3.a) this.f30715b.get(i11));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i10, int i11) {
                    return n.d(((B3.a) this.f30714a.get(i10)).a().getValue(), ((B3.a) this.f30715b.get(i11)).a().getValue());
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    return this.f30715b.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    return this.f30714a.size();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0763a(List list, List list2, e eVar) {
                super(2, eVar);
                this.f30712r = list;
                this.f30713s = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0763a(this.f30712r, this.f30713s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0763a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f30711q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return DiffUtil.calculateDiff(new C0764a(this.f30712r, this.f30713s), false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, e eVar) {
            super(2, eVar);
            this.f30710t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return a.this.new b(this.f30710t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            Object objE = p139n8.b.e();
            int i10 = this.f30708r;
            if (i10 == 0) {
                r.b(obj);
                List listE = a.this.e();
                List list2 = this.f30710t;
                I i11 = a.this.f30701s;
                C0763a c0763a = new C0763a(listE, list2, null);
                this.f30707q = listE;
                this.f30708r = 1;
                Object objG = AbstractC0812g.g(i11, c0763a, this);
                if (objG == objE) {
                    return objE;
                }
                list = listE;
                obj = objG;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f30707q;
                r.b(obj);
            }
            n.g(obj, "withContext(...)");
            list.clear();
            list.addAll(this.f30710t);
            ((DiffUtil.DiffResult) obj).dispatchUpdatesTo(a.this);
            return A.f21846a;
        }
    }

    public /* synthetic */ a(int i10, InterfaceC1163x interfaceC1163x, I i11, f.b bVar, p pVar, int i12, AbstractC1457h abstractC1457h) {
        this(i10, interfaceC1163x, (i12 & 4) != 0 ? C0803b0.b() : i11, (i12 & 8) != 0 ? null : bVar, pVar);
    }

    protected final List e() {
        return this.f30704v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0762a holder, int i10) {
        n.h(holder, "holder");
        InterfaceC0807d0 interfaceC0807d0D = holder.d();
        if (interfaceC0807d0D != null) {
            interfaceC0807d0D.dispose();
        }
        B3.a aVar = (B3.a) this.f30704v.get(i10);
        if (aVar.d() != null) {
            p pVar = this.f30703u;
            View viewRequireViewById = holder.itemView.requireViewById(R.id.foreground);
            n.g(viewRequireViewById, "requireViewById(...)");
            pVar.invoke(viewRequireViewById, aVar.d());
        }
        f fVar = f.f167a;
        View itemView = holder.itemView;
        n.g(itemView, "itemView");
        holder.e(f.l(fVar, itemView, aVar, this.f30700r, null, this.f30702t, null, 40, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0762a onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f30699q, parent, false);
        n.g(viewInflate, "inflate(...)");
        return new C0762a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30704v.size();
    }

    public final void h(List items) {
        InterfaceC0846x0 interfaceC0846x0;
        n.h(items, "items");
        InterfaceC0846x0 interfaceC0846x1 = this.f30705w;
        if (interfaceC0846x1 != null && !interfaceC0846x1.O0() && (interfaceC0846x0 = this.f30705w) != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f30705w = AbstractC0816i.d(AbstractC1164y.a(this.f30700r), null, null, new b(items, null), 3, null);
    }

    public a(int i10, InterfaceC1163x lifecycleOwner, I backgroundDispatcher, f.b bVar, p bindIcon) {
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        n.h(bindIcon, "bindIcon");
        this.f30699q = i10;
        this.f30700r = lifecycleOwner;
        this.f30701s = backgroundDispatcher;
        this.f30702t = bVar;
        this.f30703u = bindIcon;
        this.f30704v = new ArrayList();
    }
}
