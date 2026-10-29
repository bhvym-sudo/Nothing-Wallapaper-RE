package M6;

import H3.D;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.M;
import p044e3.O;
import p044e3.Q;
import p064g3.x;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends ListAdapter {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f5045w = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set f5046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p219v8.q f5047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f5048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f5050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f5051v;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O binding) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
        }
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Q f5052q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q binding) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            this.f5052q = binding;
        }

        public final void d() {
            Q q9 = this.f5052q;
            q9.f19893v.setVisibility(0);
            q9.f19893v.setText(this.itemView.getResources().getString(R.string.nt_max_generated_tip, 99));
        }
    }

    public static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f5053z = new a(null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final M f5054q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final p219v8.a f5055r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final float f5056s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final p219v8.q f5057t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final p219v8.p f5058u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final Context f5059v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private x f5060w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f5061x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f5062y;

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(M binding, p219v8.a isEditingMode, float f10, p219v8.q listener, p219v8.p onWallpaperSelected) {
            int dimensionPixelOffset;
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(isEditingMode, "isEditingMode");
            kotlin.jvm.internal.n.h(listener, "listener");
            kotlin.jvm.internal.n.h(onWallpaperSelected, "onWallpaperSelected");
            this.f5054q = binding;
            this.f5055r = isEditingMode;
            this.f5056s = f10;
            this.f5057t = listener;
            this.f5058u = onWallpaperSelected;
            Context context = this.itemView.getContext();
            this.f5059v = context;
            this.f5062y = 1.0f;
            this.f5062y = D.n(this.itemView.getContext());
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (f10 <= 0.0f || f10 >= 1.0f) {
                dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.nt_individual_item_height);
            } else {
                Context context2 = this.itemView.getContext();
                kotlin.jvm.internal.n.g(context2, "getContext(...)");
                dimensionPixelOffset = (int) (f10 * p087i6.q.d(context2).y);
            }
            layoutParams.height = dimensionPixelOffset;
            ImageView indicatorIcon = binding.f19884y;
            kotlin.jvm.internal.n.g(indicatorIcon, "indicatorIcon");
            View itemView = this.itemView;
            kotlin.jvm.internal.n.g(itemView, "itemView");
            H6.d.d(indicatorIcon, itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(x xVar, d dVar, View view) {
            if ((xVar instanceof J6.i) && ((Boolean) dVar.f5055r.invoke()).booleanValue()) {
                dVar.l((J6.i) xVar);
                return;
            }
            p219v8.q qVar = dVar.f5057t;
            x xVar2 = dVar.f5060w;
            ImageView image = dVar.f5054q.f19883x;
            kotlin.jvm.internal.n.g(image, "image");
            qVar.e(xVar2, image, Boolean.FALSE);
        }

        private final void j(final J6.i iVar) {
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: M6.n
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return k.d.k(this.f5067a, iVar, view);
                }
            });
            if (iVar.z()) {
                this.f5054q.f19879A.setVisibility(0);
                this.f5054q.f19882w.setVisibility(0);
                o(0.87f);
            } else {
                this.f5054q.f19879A.setVisibility(8);
                this.f5054q.f19882w.setVisibility(8);
                o(1.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(d dVar, J6.i iVar, View view) {
            dVar.l(iVar);
            return true;
        }

        private final void l(J6.i iVar) {
            if (this.f5061x) {
                Toast.makeText(this.itemView.getContext(), R.string.nt_cant_delete_current_wallpaper, 0).show();
                return;
            }
            final boolean z9 = this.f5054q.f19879A.getVisibility() != 0;
            CardView cardView = this.f5054q.f19881v;
            kotlin.jvm.internal.n.g(cardView, "cardView");
            p167q6.a.b(cardView, z9, 0.87f, 1.0f, false, false, 48, null);
            ImageView dimmingScrim = this.f5054q.f19882w;
            kotlin.jvm.internal.n.g(dimmingScrim, "dimmingScrim");
            p167q6.a.a(dimmingScrim, z9, 0.87f, 1.0f, true, z9);
            ImageView selectedIcon = this.f5054q.f19879A;
            kotlin.jvm.internal.n.g(selectedIcon, "selectedIcon");
            p167q6.a.c(selectedIcon, z9, new p219v8.a() { // from class: M6.m
                @Override // p219v8.a
                public final Object invoke() {
                    return k.d.m(z9, this);
                }
            });
            if (this.f5061x) {
                ImageView indicatorIcon = this.f5054q.f19884y;
                kotlin.jvm.internal.n.g(indicatorIcon, "indicatorIcon");
                p167q6.a.c(indicatorIcon, !z9, null);
            }
            this.f5058u.invoke(iVar, Boolean.valueOf(z9));
            p219v8.q qVar = this.f5057t;
            x xVar = this.f5060w;
            ImageView image = this.f5054q.f19883x;
            kotlin.jvm.internal.n.g(image, "image");
            qVar.e(xVar, image, Boolean.TRUE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A m(boolean z9, d dVar) {
            if (z9) {
                dVar.f5054q.f19881v.setForeground(null);
            } else {
                CardView cardView = dVar.f5054q.f19881v;
                kotlin.jvm.internal.n.g(cardView, "cardView");
                dVar.n(cardView);
            }
            return A.f21846a;
        }

        private final void n(View view) {
            Resources.Theme theme = this.f5059v.getTheme();
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, new int[]{android.R.attr.selectableItemBackground});
            kotlin.jvm.internal.n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            RippleDrawable rippleDrawable = drawable instanceof RippleDrawable ? (RippleDrawable) drawable : null;
            typedArrayObtainStyledAttributes.recycle();
            if (rippleDrawable != null) {
                view.setForeground(rippleDrawable);
            }
        }

        private final void o(final float f10) {
            this.f5054q.f19881v.post(new Runnable() { // from class: M6.o
                @Override // java.lang.Runnable
                public final void run() {
                    k.d.p(this.f5069q, f10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(d dVar, float f10) {
            dVar.f5054q.f19882w.setScaleY(f10);
            dVar.f5054q.f19882w.setScaleX(f10);
            dVar.f5054q.f19881v.setScaleY(f10);
            dVar.f5054q.f19881v.setScaleX(f10);
        }

        public final void h(final x wallpaper, Set appliedIds) {
            boolean z9;
            kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
            kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
            this.f5060w = wallpaper;
            this.f5061x = appliedIds.contains(wallpaper.r());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: M6.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.d.i(wallpaper, this, view);
                }
            });
            if (wallpaper instanceof J6.i) {
                J6.i iVar = (J6.i) wallpaper;
                j(iVar);
                z9 = iVar.z();
            } else {
                z9 = false;
            }
            M m9 = this.f5054q;
            wallpaper.b(this.f5059v);
            ImageView imageView = m9.f19883x;
            Context context = this.f5059v;
            kotlin.jvm.internal.n.g(context, "context");
            imageView.setContentDescription(G6.g.c(wallpaper, context));
            com.android.wallpaper.asset.a aVarO = wallpaper.o(this.f5059v.getApplicationContext());
            Context context2 = this.f5059v;
            aVarO.n(context2, m9.f19883x, H3.r.a(context2, android.R.attr.colorSecondary));
            ImageView indicatorIcon = m9.f19884y;
            kotlin.jvm.internal.n.g(indicatorIcon, "indicatorIcon");
            indicatorIcon.setVisibility(this.f5061x && !z9 ? 0 : 8);
            m9.f19881v.setVisibility(0);
            m9.f19880B.setVisibility(8);
            m9.f19883x.setScaleX(this.f5062y);
            m9.f19883x.setScaleY(this.f5062y);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, Set appliedIds, p219v8.q listener) {
        super(new w(context));
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f5046q = appliedIds;
        this.f5047r = listener;
        this.f5049t = 1;
        this.f5050u = 2;
        int i10 = p087i6.q.d(context).x;
        this.f5051v = (((i10 - (context.getResources().getDimensionPixelSize(R.dimen.nt_wallpaper_item_padding) * 2)) - (context.getResources().getDimensionPixelSize(R.dimen.grid_item_individual_padding_horizontal) * 6)) / 3) / i10;
    }

    private final boolean f() {
        Object next;
        x xVar;
        List currentList = getCurrentList();
        kotlin.jvm.internal.n.g(currentList, "getCurrentList(...)");
        Iterator it = currentList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            xVar = (x) next;
        } while (!(xVar instanceof J6.i ? ((J6.i) xVar).z() : false));
        return ((x) next) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(k kVar) {
        return kVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A h(k kVar, x wallpaper, boolean z9) {
        Object next;
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        List currentList = kVar.getCurrentList();
        kotlin.jvm.internal.n.g(currentList, "getCurrentList(...)");
        Iterator it = currentList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.n.d(((x) next).r(), wallpaper.r()));
        x xVar = (x) next;
        if (xVar instanceof J6.i) {
            ((J6.i) xVar).A(z9);
        }
        return A.f21846a;
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (getCurrentList().size() == 0) {
            return 1;
        }
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (getCurrentList().size() == 0) {
            return this.f5050u;
        }
        x xVar = (x) getItem(i10);
        return kotlin.jvm.internal.n.d(xVar.r(), "CREATIVE_FOOT_WALLPAPER_ID") & (xVar instanceof J6.i) ? this.f5049t : this.f5048s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        if (getCurrentList().size() == 0) {
            return;
        }
        x xVar = (x) getItem(i10);
        if (holder instanceof d) {
            kotlin.jvm.internal.n.e(xVar);
            ((d) holder).h(xVar, this.f5046q);
        } else if (holder instanceof c) {
            ((c) holder).d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == this.f5049t) {
            Q qC = Q.C(layoutInflaterFrom, parent, false);
            kotlin.jvm.internal.n.g(qC, "inflate(...)");
            return new c(qC);
        }
        if (i10 == this.f5050u) {
            O oC = O.C(layoutInflaterFrom, parent, false);
            kotlin.jvm.internal.n.g(oC, "inflate(...)");
            return new b(oC);
        }
        M mC = M.C(layoutInflaterFrom, parent, false);
        kotlin.jvm.internal.n.g(mC, "inflate(...)");
        return new d(mC, new p219v8.a() { // from class: M6.i
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(k.g(this.f5043q));
            }
        }, this.f5051v, this.f5047r, new p219v8.p() { // from class: M6.j
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return k.h(this.f5044q, (x) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }
}
