package F7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.NtRadioButton;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f1739s = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f1740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p219v8.p f1741r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final TextView f1742q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ImageView f1743r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final NtRadioButton f1744s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final LinearLayout f1745t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final View f1746u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView) {
            super(itemView);
            kotlin.jvm.internal.n.h(itemView, "itemView");
            View viewRequireViewById = itemView.requireViewById(R.id.item_title);
            kotlin.jvm.internal.n.g(viewRequireViewById, "requireViewById(...)");
            this.f1742q = (TextView) viewRequireViewById;
            View viewRequireViewById2 = itemView.requireViewById(R.id.item_icon);
            kotlin.jvm.internal.n.g(viewRequireViewById2, "requireViewById(...)");
            this.f1743r = (ImageView) viewRequireViewById2;
            View viewRequireViewById3 = itemView.requireViewById(R.id.item_rb);
            kotlin.jvm.internal.n.g(viewRequireViewById3, "requireViewById(...)");
            this.f1744s = (NtRadioButton) viewRequireViewById3;
            View viewRequireViewById4 = itemView.requireViewById(R.id.item_bg);
            kotlin.jvm.internal.n.g(viewRequireViewById4, "requireViewById(...)");
            this.f1745t = (LinearLayout) viewRequireViewById4;
            View viewRequireViewById5 = itemView.requireViewById(R.id.decoration);
            kotlin.jvm.internal.n.g(viewRequireViewById5, "requireViewById(...)");
            this.f1746u = viewRequireViewById5;
        }

        public final LinearLayout d() {
            return this.f1745t;
        }

        public final View e() {
            return this.f1746u;
        }

        public final ImageView f() {
            return this.f1743r;
        }

        public final NtRadioButton g() {
            return this.f1744s;
        }

        public final TextView h() {
            return this.f1742q;
        }
    }

    public e(List models, p219v8.p onItemClick) {
        kotlin.jvm.internal.n.h(models, "models");
        kotlin.jvm.internal.n.h(onItemClick, "onItemClick");
        this.f1740q = models;
        this.f1741r = onItemClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, f fVar, View view) {
        eVar.f1741r.invoke(Boolean.valueOf(fVar.d()), fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int i10) {
        float f10;
        kotlin.jvm.internal.n.h(holder, "holder");
        final f fVar = (f) this.f1740q.get(i10);
        if (fVar.a()) {
            f10 = 1.0f;
        } else {
            f10 = fVar.d() ? 0.3f : 0.4f;
        }
        if (fVar.c() > 0) {
            holder.f().setImageResource(fVar.c());
        } else {
            holder.f().setImageDrawable(null);
        }
        holder.f().setEnabled(fVar.a());
        holder.f().setAlpha(f10);
        holder.h().setText(fVar.e());
        holder.h().setAlpha(f10);
        if (i10 == 0) {
            holder.d().setBackgroundResource(R.drawable.popup_menu_item_top_bg);
            holder.e().setVisibility(0);
        } else if (i10 == this.f1740q.size() - 1) {
            holder.d().setBackgroundResource(R.drawable.popup_menu_item_bottom_bg);
            holder.e().setVisibility(8);
        } else {
            holder.d().setBackgroundResource(R.drawable.popup_menu_item_bg);
            holder.e().setVisibility(0);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: F7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.f(this.f1737q, fVar, view);
            }
        });
        NtRadioButton ntRadioButtonG = holder.g();
        ntRadioButtonG.setEnabled(fVar.a());
        ntRadioButtonG.setChecked(fVar.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_popup_effect_menu, parent, false);
        kotlin.jvm.internal.n.e(viewInflate);
        return new b(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1740q.size();
    }
}
