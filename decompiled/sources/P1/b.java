package P1;

import T1.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f6025q = new ArrayList();

    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final TextView f6026q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
            View viewRequireViewById = itemView.requireViewById(R.id.text);
            n.g(viewRequireViewById, "requireViewById(...)");
            this.f6026q = (TextView) viewRequireViewById;
        }

        public final TextView d() {
            return this.f6026q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, View view) {
        dVar.b().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        n.h(holder, "holder");
        final d dVar = (d) this.f6025q.get(i10);
        holder.itemView.setSelected(dVar.c());
        holder.d().setText(dVar.a());
        holder.itemView.setOnClickListener(dVar.b() != null ? new View.OnClickListener() { // from class: P1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.f(dVar, view);
            }
        } : null);
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
        return this.f6025q.size();
    }

    public final void h(List items) {
        n.h(items, "items");
        this.f6025q.clear();
        this.f6025q.addAll(items);
        notifyDataSetChanged();
    }
}
