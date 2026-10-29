package F7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import p044e3.p0;
import p248y7.t;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends ListAdapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final t f1756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C7.a f1757r;

    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final p0 f1758q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final t f1759r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ j f1760s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, p0 binding, t tVar) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            this.f1760s = jVar;
            this.f1758q = binding;
            this.f1759r = tVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(a aVar, C7.a aVar2, View view) {
            t tVar = aVar.f1759r;
            if (tVar != null) {
                kotlin.jvm.internal.n.e(view);
                tVar.b(view, aVar2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean h(a aVar, C7.a aVar2, View view) {
            t tVar = aVar.f1759r;
            if (tVar == null) {
                return true;
            }
            kotlin.jvm.internal.n.e(view);
            tVar.y(view, aVar2);
            return true;
        }

        public final void f(final C7.a info) {
            kotlin.jvm.internal.n.h(info, "info");
            View view = this.itemView;
            view.setOnClickListener(new View.OnClickListener() { // from class: F7.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    j.a.g(this.f1752q, info, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: F7.i
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return j.a.h(this.f1754a, info, view2);
                }
            });
            p0 p0Var = this.f1758q;
            j jVar = this.f1760s;
            p0Var.f20053v.setImageDrawable(info.b());
            p0Var.f20053v.setImageTintList(this.itemView.getContext().getColorStateList(R.color.shortcut_item_title));
            p0Var.f20056y.setText(info.d());
            if (info.a().length() > 0) {
                p0Var.f20055x.setText(info.a());
                p0Var.f20055x.setVisibility(0);
            } else {
                String strC = info.c();
                C7.a aVarD = jVar.d();
                if (!kotlin.jvm.internal.n.d(strC, aVarD != null ? aVarD.c() : null) || kotlin.jvm.internal.n.d(info.c(), "none")) {
                    p0Var.f20055x.setText("");
                    p0Var.f20055x.setVisibility(8);
                } else {
                    TextView textView = p0Var.f20055x;
                    textView.setText(textView.getContext().getString(R.string.shortcut_already_in_use));
                    p0Var.f20055x.setVisibility(0);
                }
            }
            p0Var.f20054w.setChecked(info.f());
            p0Var.f20054w.setEnabled(info.e());
            p0Var.f20056y.setEnabled(info.e());
            p0Var.f20055x.setEnabled(info.e());
            p0Var.f20053v.setEnabled(info.e());
            this.itemView.setEnabled(info.e());
        }
    }

    public j(t tVar) {
        super(new g());
        this.f1756q = tVar;
    }

    public final C7.a d() {
        return this.f1757r;
    }

    public final void e(C7.a aVar) {
        this.f1757r = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        C7.a aVar = (C7.a) getItem(i10);
        if (holder instanceof a) {
            kotlin.jvm.internal.n.e(aVar);
            ((a) holder).f(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        p0 p0VarC = p0.C(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.n.g(p0VarC, "inflate(...)");
        return new a(this, p0VarC, this.f1756q);
    }
}
