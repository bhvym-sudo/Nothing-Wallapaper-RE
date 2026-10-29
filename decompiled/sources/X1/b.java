package X1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import p013b2.e;

/* JADX INFO: loaded from: classes.dex */
public class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f8929q = new ArrayList();

    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final TextView f8930q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
            View viewRequireViewById = itemView.requireViewById(R.id.text);
            n.g(viewRequireViewById, "requireViewById(...)");
            this.f8930q = (TextView) viewRequireViewById;
        }

        public final TextView d() {
            return this.f8930q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, View view) {
        eVar.b().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        n.h(holder, "holder");
        final e eVar = (e) this.f8929q.get(i10);
        holder.itemView.setSelected(eVar.d());
        holder.d().setText(eVar.a());
        holder.itemView.setOnClickListener(eVar.b() != null ? new View.OnClickListener() { // from class: X1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.f(eVar, view);
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
        return this.f8929q.size();
    }

    public void h(List items) {
        n.h(items, "items");
        this.f8929q.clear();
        this.f8929q.addAll(items);
        notifyDataSetChanged();
    }
}
