package M6;

import H3.D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.M;
import p044e3.T;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends ListAdapter {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f5020s = new b(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set f5021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p219v8.p f5022r;

    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final M f5023q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final p219v8.p f5024r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Context f5025s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private x f5026t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private float f5027u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M binding, p219v8.p listener) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(listener, "listener");
            this.f5023q = binding;
            this.f5024r = listener;
            Context context = this.itemView.getContext();
            this.f5025s = context;
            this.f5027u = 1.0f;
            this.f5027u = D.n(this.itemView.getContext());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: M6.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a.e(this.f5019q, view);
                }
            });
            this.itemView.getLayoutParams().width = context.getResources().getDimensionPixelOffset(R.dimen.nt_category_item_size);
            ImageView indicatorIcon = binding.f19884y;
            kotlin.jvm.internal.n.g(indicatorIcon, "indicatorIcon");
            View itemView = this.itemView;
            kotlin.jvm.internal.n.g(itemView, "itemView");
            H6.d.d(indicatorIcon, itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, View view) {
            p219v8.p pVar = aVar.f5024r;
            x xVar = aVar.f5026t;
            ImageView image = aVar.f5023q.f19883x;
            kotlin.jvm.internal.n.g(image, "image");
            pVar.invoke(xVar, image);
        }

        public final void f(x wallpaper, Set appliedIds) {
            kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
            kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
            this.f5026t = wallpaper;
            M m9 = this.f5023q;
            wallpaper.b(this.f5025s);
            com.android.wallpaper.asset.a aVarO = wallpaper.o(this.f5025s.getApplicationContext());
            Context context = this.f5025s;
            aVarO.n(context, m9.f19883x, H3.r.a(context, android.R.attr.colorSecondary));
            ImageView indicatorIcon = m9.f19884y;
            kotlin.jvm.internal.n.g(indicatorIcon, "indicatorIcon");
            indicatorIcon.setVisibility(appliedIds.contains(wallpaper.r()) ? 0 : 8);
            m9.f19883x.setScaleX(this.f5027u);
            m9.f19883x.setScaleY(this.f5027u);
            if (wallpaper instanceof J6.c) {
                m9.f19883x.setContentDescription(this.f5025s.getResources().getString(R.string.color_category));
            } else {
                m9.f19883x.setContentDescription(this.f5025s.getResources().getString(R.string.nt_wallpaper_gallery));
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: M6.c$c, reason: collision with other inner class name */
    public static final class C0181c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final T f5028q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final p219v8.p f5029r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private x f5030s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Context f5031t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0181c(T binding, p219v8.p listener) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(listener, "listener");
            this.f5028q = binding;
            this.f5029r = listener;
            Context context = this.itemView.getContext();
            this.f5031t = context;
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: M6.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.C0181c.e(this.f5032q, view);
                }
            });
            this.itemView.getLayoutParams().width = context.getResources().getDimensionPixelOffset(R.dimen.nt_category_item_size);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(C0181c c0181c, View view) {
            p219v8.p pVar = c0181c.f5029r;
            x xVar = c0181c.f5030s;
            kotlin.jvm.internal.n.e(view);
            pVar.invoke(xVar, view);
        }

        public final void f(x wallpaper) {
            kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
            this.f5030s = wallpaper;
            if (wallpaper instanceof J6.m) {
                TextView textView = this.f5028q.f19898v;
                J6.m mVar = (J6.m) wallpaper;
                textView.setText(mVar.C());
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, textView.getContext().getDrawable(mVar.A()), (Drawable) null, (Drawable) null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Set appliedIds, p219v8.p listener) {
        super(new w(context));
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f5021q = appliedIds;
        this.f5022r = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return ((x) getItem(i10)) instanceof J6.m ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        x xVar = (x) getItem(i10);
        if (holder instanceof a) {
            kotlin.jvm.internal.n.e(xVar);
            ((a) holder).f(xVar, this.f5021q);
        } else if (holder instanceof C0181c) {
            kotlin.jvm.internal.n.e(xVar);
            ((C0181c) holder).f(xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == 1) {
            T tC = T.C(layoutInflaterFrom, parent, false);
            kotlin.jvm.internal.n.g(tC, "inflate(...)");
            return new C0181c(tC, this.f5022r);
        }
        M mC = M.C(layoutInflaterFrom, parent, false);
        kotlin.jvm.internal.n.g(mC, "inflate(...)");
        return new a(mC, this.f5022r);
    }
}
