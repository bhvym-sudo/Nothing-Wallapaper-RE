package p133n2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p173r2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f23257q = new ArrayList();

    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final TextView f23258q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
            View viewRequireViewById = itemView.requireViewById(R.id.text);
            n.g(viewRequireViewById, "requireViewById(...)");
            this.f23258q = (TextView) viewRequireViewById;
        }

        public final TextView d() {
            return this.f23258q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, View view) {
        eVar.b().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        Object next;
        p164q3.a aVarE;
        n.h(holder, "holder");
        final e eVar = (e) this.f23257q.get(i10);
        holder.itemView.setSelected(eVar.d());
        holder.d().setText(eVar.a());
        String string = null;
        holder.itemView.setOnClickListener(eVar.b() != null ? new View.OnClickListener() { // from class: n2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.f(eVar, view);
            }
        } : null);
        Iterator it = eVar.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) ((B3.a) next).g().getValue()).booleanValue());
        B3.a aVar = (B3.a) next;
        if (aVar != null && (aVarE = aVar.e()) != null) {
            Context context = holder.itemView.getContext();
            n.g(context, "getContext(...)");
            string = aVarE.a(context);
        }
        View view = holder.itemView;
        if (string == null) {
            string = view.getResources().getString(R.string.keyguard_affordance_none);
            n.g(string, "getString(...)");
        }
        view.setStateDescription(string);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.picker_fragment_tab, parent, false);
        n.g(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f23257q.size();
    }

    public final void h(List items) {
        n.h(items, "items");
        this.f23257q.clear();
        this.f23257q.addAll(items);
        notifyDataSetChanged();
    }
}
