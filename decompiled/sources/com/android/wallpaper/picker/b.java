package com.android.wallpaper.picker;

import H3.AbstractC0854d;
import H3.r;
import H3.t;
import I3.y;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.wallpaper.picker.b;
import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import p064g3.AbstractC1356a;
import p064g3.InterfaceC1357b;
import p064g3.x;
import p074h3.I;
import p074h3.S;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.android.wallpaper.picker.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Point f15947A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f15948B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f15950D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f15951E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RecyclerView f15953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C0449b f15954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private i f15955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC1357b f15956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList f15957z = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ArrayList f15949C = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f15952F = false;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.M0(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.wallpaper.picker.b$b, reason: collision with other inner class name */
    class C0449b extends RecyclerView.Adapter implements com.android.wallpaper.picker.f.b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List f15959q;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(DialogInterface dialogInterface, int i10) {
            b.this.M0(1);
        }

        @Override // com.android.wallpaper.picker.f.b
        public void b(boolean z9) {
            if (z9) {
                new AlertDialog.Builder(b.this.getActivity(), R.style.LightDialogTheme).setMessage(b.this.getString(R.string.permission_needed_explanation_go_to_settings)).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.settings_button_label, new DialogInterface.OnClickListener() { // from class: com.android.wallpaper.picker.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        this.f15983q.e(dialogInterface, i10);
                    }
                }).create().show();
            }
        }

        @Override // com.android.wallpaper.picker.f.b
        public void c() {
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int size = this.f15959q.size();
            return b.this.f15948B ? size + 1 : size;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            if (b.this.f15948B && i10 == getItemCount() - 1) {
                return 4;
            }
            if (i10 == 0) {
                return 1;
            }
            if (b.this.f15950D) {
                return (i10 == 1 || i10 == 2) ? 2 : 3;
            }
            return 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType == 1 || itemViewType == 2 || itemViewType == 3) {
                ((c) viewHolder).f((AbstractC1356a) this.f15959q.get(i10));
            } else if (itemViewType != 4) {
                Log.e("CategorySelectorFragment", "Unsupported viewType " + itemViewType + " in CategoryAdapter");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(b.this.getActivity());
            if (i10 == 1) {
                return new l(b.this, layoutInflaterFrom.inflate(R.layout.grid_item_category, viewGroup, false));
            }
            if (i10 == 2) {
                return new f(b.this, layoutInflaterFrom.inflate(R.layout.grid_item_category, viewGroup, false));
            }
            if (i10 == 3) {
                return b.this.new c(layoutInflaterFrom.inflate(R.layout.grid_item_category, viewGroup, false));
            }
            if (i10 == 4) {
                return new k(layoutInflaterFrom.inflate(R.layout.grid_item_loading_indicator, viewGroup, false));
            }
            Log.e("CategorySelectorFragment", "Unsupported viewType " + i10 + " in CategoryAdapter");
            return null;
        }

        private C0449b(List list) {
            this.f15959q = list;
        }
    }

    private class c extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private AbstractC1356a f15961q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ImageView f15962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ImageView f15963s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private TextView f15964t;

        class a implements com.android.wallpaper.picker.f.b {
            a() {
            }

            @Override // com.android.wallpaper.picker.f.b
            public void b(boolean z9) {
                if (z9) {
                    b.this.L0();
                }
            }

            @Override // com.android.wallpaper.picker.f.b
            public void c() {
                c.this.g();
            }
        }

        c(View view) {
            super(view);
            view.setOnClickListener(this);
            this.f15962r = (ImageView) view.findViewById(R.id.image);
            this.f15963s = (ImageView) view.findViewById(R.id.overlay_icon);
            this.f15964t = (TextView) view.findViewById(R.id.category_title);
            CardView cardView = (CardView) view.findViewById(R.id.category);
            cardView.getLayoutParams().height = b.this.f15947A.y;
            cardView.setRadius(b.this.getResources().getDimension(R.dimen.grid_item_all_radius_small));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(AbstractC1356a abstractC1356a) {
            AbstractC1356a abstractC1356a2;
            this.f15961q = abstractC1356a;
            this.f15964t.setText(abstractC1356a.h());
            g();
            if (b.this.f15952F && (abstractC1356a2 = this.f15961q) != null && TextUtils.equals(abstractC1356a2.b(), b.this.getActivity().getApplicationContext().getString(R.string.image_wallpaper_collection_id))) {
                this.itemView.setOnClickListener(null);
                ((CardView) this.itemView.findViewById(R.id.category)).setOnClickListener(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            this.f15963s.setImageDrawable(this.f15961q.c(b.this.getActivity().getApplicationContext()));
            com.android.wallpaper.asset.a aVarG = this.f15961q.g(b.this.getActivity().getApplicationContext());
            if (aVarG == null) {
                this.f15962r.setBackgroundColor(b.this.getResources().getColor(R.color.myphoto_background_color));
                Glide.with(b.this.getActivity()).asDrawable().load((Object) null).into(this.f15962r);
                return;
            }
            int iD = (int) (this.f15961q.d() * H3.g.b().a(b.this.getResources(), b.this.getActivity().getWindowManager().getDefaultDisplay()).density);
            this.f15963s.getLayoutParams().width = iD;
            this.f15963s.getLayoutParams().height = iD;
            aVarG.n(b.this.getActivity(), this.f15962r, r.a(b.this.getActivity(), android.R.attr.colorSecondary));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractActivityC1136v activity = b.this.getActivity();
            S sQ = I.a().q(activity);
            sQ.a(this.f15961q.b());
            if (this.f15961q.l()) {
                I.a().n(b.this.getContext());
                b.this.H0().a(new a());
            } else {
                if (!this.f15961q.j()) {
                    b.this.H0().y(this.f15961q);
                    return;
                }
                x xVarF = this.f15961q.f();
                sQ.j(this.f15961q.b());
                I.a().A(activity).e(xVarF);
                xVarF.x(activity, new PreviewActivity.a(), xVarF instanceof p064g3.k ? 4 : 1, true);
            }
        }
    }

    public interface d {
        void a(com.android.wallpaper.picker.f.b bVar);

        void b(CharSequence charSequence);

        void c();

        boolean d();

        void u();

        void y(AbstractC1356a abstractC1356a);
    }

    private class e extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C0449b f15967a;

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (i10 < 0 || this.f15967a.getItemViewType(i10) == 4 || this.f15967a.getItemViewType(i10) == 1) {
                return b.this.I0() * 2;
            }
            if (this.f15967a.getItemViewType(i10) == 2) {
                return (b.this.I0() * 2) / 2;
            }
            return 2;
        }

        private e(C0449b c0449b) {
            this.f15967a = c0449b;
        }
    }

    private class f extends c {
        f(b bVar, View view) {
            super(view);
            CardView cardView = (CardView) view.findViewById(R.id.category);
            cardView.getLayoutParams().height = t.d(bVar.getActivity()).y;
            cardView.setRadius(bVar.getResources().getDimension(R.dimen.grid_item_all_radius));
        }
    }

    private class g extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15969a;

        g(int i10) {
            this.f15969a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (recyclerView.getChildAdapterPosition(view) >= 0) {
                int i10 = this.f15969a;
                rect.left = i10;
                rect.right = i10;
            }
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if ((childViewHolder instanceof l) || (childViewHolder instanceof h) || (childViewHolder instanceof f)) {
                rect.bottom = b.this.getResources().getDimensionPixelSize(R.dimen.grid_item_featured_category_padding_bottom);
            } else {
                rect.bottom = b.this.getResources().getDimensionPixelSize(R.dimen.grid_item_category_padding_bottom);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        LayoutInflater f15971q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ArrayList f15972r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ArrayList f15973s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ArrayList f15974t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ArrayList f15975u;

        class a implements com.android.wallpaper.picker.f.b {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f15977q;

            a(int i10) {
                this.f15977q = i10;
            }

            @Override // com.android.wallpaper.picker.f.b
            public void b(boolean z9) {
                if (z9) {
                    b.this.L0();
                }
            }

            @Override // com.android.wallpaper.picker.f.b
            public void c() {
                h hVar = h.this;
                hVar.k((ImageView) hVar.f15974t.get(this.f15977q), (AbstractC1356a) h.this.f15972r.get(this.f15977q), (ImageView) h.this.f15973s.get(this.f15977q));
            }
        }

        h(View view, int i10) {
            super(view);
            this.f15971q = LayoutInflater.from(b.this.getActivity());
            this.f15972r = new ArrayList();
            this.f15973s = new ArrayList();
            this.f15974t = new ArrayList();
            this.f15975u = new ArrayList();
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear_layout_for_cards);
            for (final int i11 = 0; i11 < i10; i11++) {
                LinearLayout linearLayout2 = (LinearLayout) this.f15971q.inflate(R.layout.grid_item_category, (ViewGroup) null);
                if (linearLayout2 != null) {
                    this.f15973s.add((ImageView) linearLayout2.findViewById(R.id.image));
                    this.f15974t.add((ImageView) linearLayout2.findViewById(R.id.overlay_icon));
                    this.f15975u.add((TextView) linearLayout2.findViewById(R.id.category_title));
                    n(linearLayout2);
                    linearLayout.addView(linearLayout2);
                    linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.android.wallpaper.picker.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f15988q.l(i11, view2);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(ArrayList arrayList) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                this.f15972r.add((AbstractC1356a) arrayList.get(i10));
                ((TextView) this.f15975u.get(i10)).setText(((AbstractC1356a) arrayList.get(i10)).h());
                k((ImageView) this.f15974t.get(i10), (AbstractC1356a) this.f15972r.get(i10), (ImageView) this.f15973s.get(i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(ImageView imageView, AbstractC1356a abstractC1356a, ImageView imageView2) {
            imageView.setImageDrawable(abstractC1356a.c(b.this.getActivity().getApplicationContext()));
            com.android.wallpaper.asset.a aVarG = abstractC1356a.g(b.this.getActivity().getApplicationContext());
            if (aVarG == null) {
                imageView2.setBackgroundColor(b.this.getResources().getColor(R.color.myphoto_background_color));
                Glide.with(b.this.getActivity()).asDrawable().load((Object) null).into(imageView2);
                return;
            }
            int iD = (int) (abstractC1356a.d() * H3.g.b().a(b.this.getResources(), b.this.getActivity().getWindowManager().getDefaultDisplay()).density);
            imageView.getLayoutParams().width = iD;
            imageView.getLayoutParams().height = iD;
            aVarG.n(b.this.getActivity(), imageView2, r.a(b.this.getActivity(), android.R.attr.colorSecondary));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(int i10, View view) {
            m(i10);
        }

        private void m(int i10) {
            AbstractActivityC1136v activity = b.this.getActivity();
            S sQ = I.a().q(activity);
            sQ.a(((AbstractC1356a) this.f15972r.get(i10)).b());
            if (((AbstractC1356a) this.f15972r.get(i10)).l()) {
                b.this.H0().a(new a(i10));
                return;
            }
            if (!((AbstractC1356a) this.f15972r.get(i10)).j()) {
                b.this.H0().y((AbstractC1356a) this.f15972r.get(i10));
                return;
            }
            x xVarF = ((AbstractC1356a) this.f15972r.get(i10)).f();
            sQ.j(((AbstractC1356a) this.f15972r.get(i10)).b());
            I.a().A(activity).e(xVarF);
            xVarF.x(activity, new PreviewActivity.a(), xVarF instanceof p064g3.k ? 4 : 1, true);
        }

        private void n(LinearLayout linearLayout) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
            }
            layoutParams.setMargins((int) b.this.getResources().getDimension(R.dimen.creative_category_grid_padding_horizontal), (int) b.this.getResources().getDimension(R.dimen.creative_category_grid_padding_vertical), (int) b.this.getResources().getDimension(R.dimen.creative_category_grid_padding_horizontal), (int) b.this.getResources().getDimension(R.dimen.creative_category_grid_padding_vertical));
            CardView cardView = (CardView) linearLayout.findViewById(R.id.category);
            cardView.getLayoutParams().height = t.d(b.this.getActivity()).y / 2;
            cardView.setRadius(b.this.getResources().getDimension(R.dimen.grid_item_all_radius));
            layoutParams.weight = 1.0f;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class i extends RecyclerView.Adapter implements com.android.wallpaper.picker.f.b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List f15979q;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(DialogInterface dialogInterface, int i10) {
            b.this.M0(1);
        }

        @Override // com.android.wallpaper.picker.f.b
        public void b(boolean z9) {
            if (z9) {
                new AlertDialog.Builder(b.this.getActivity(), R.style.LightDialogTheme).setMessage(b.this.getString(R.string.permission_needed_explanation_go_to_settings)).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.settings_button_label, new DialogInterface.OnClickListener() { // from class: com.android.wallpaper.picker.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        this.f15990q.e(dialogInterface, i10);
                    }
                }).create().show();
            }
        }

        @Override // com.android.wallpaper.picker.f.b
        public void c() {
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int size = this.f15979q.size();
            if (b.this.f15948B) {
                size++;
            }
            return b.this.f15949C.size() >= 2 ? size - (b.this.f15949C.size() - 1) : size;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            if (b.this.f15948B && i10 == getItemCount() - 1) {
                return 4;
            }
            if (!this.f15979q.stream().anyMatch(new Predicate() { // from class: i3.f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((AbstractC1356a) obj).n();
                }
            })) {
                return i10 == 0 ? 1 : 3;
            }
            if (i10 == 0) {
                return 2;
            }
            return i10 == 1 ? 1 : 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType == 1) {
                viewHolder.setIsRecyclable(false);
            } else {
                if (itemViewType == 2) {
                    ((h) viewHolder).j(b.this.f15949C);
                    return;
                }
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        Log.e("CategorySelectorFragment", "Unsupported viewType " + itemViewType + " in CategoryAdapter");
                        return;
                    }
                    return;
                }
            }
            if (!b.this.f15951E) {
                ((c) viewHolder).f((AbstractC1356a) this.f15979q.get(i10));
            } else {
                ((c) viewHolder).f((AbstractC1356a) this.f15979q.get((i10 + b.this.f15949C.size()) - 1));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(b.this.getActivity());
            if (i10 == 1) {
                return new l(b.this, layoutInflaterFrom.inflate(R.layout.my_photos, viewGroup, false));
            }
            if (i10 == 2) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.creative_wallpaper, viewGroup, false);
                b bVar = b.this;
                return bVar.new h(viewInflate, bVar.f15949C.size());
            }
            if (i10 == 3) {
                return b.this.new c(layoutInflaterFrom.inflate(R.layout.grid_item_category, viewGroup, false));
            }
            if (i10 == 4) {
                return new k(layoutInflaterFrom.inflate(R.layout.grid_item_loading_indicator, viewGroup, false));
            }
            Log.e("CategorySelectorFragment", "Unsupported viewType " + i10 + " in CategoryAdapter");
            return null;
        }

        private i(List list) {
            this.f15979q = list;
        }
    }

    private class j extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f15981a;

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (i10 >= 0 && this.f15981a.getItemViewType(i10) != 4 && this.f15981a.getItemViewType(i10) != 1 && this.f15981a.getItemViewType(i10) != 2) {
                return 2;
            }
            int iI0 = b.this.I0();
            return iI0 * 2;
        }

        private j(i iVar) {
            this.f15981a = iVar;
        }
    }

    private class k extends RecyclerView.ViewHolder {
        private k(b bVar, View view) {
            super(view);
            ((ProgressBar) view.findViewById(R.id.loading_indicator)).getIndeterminateDrawable().setColorFilter(r.a(bVar.getActivity(), android.R.attr.colorAccent), PorterDuff.Mode.SRC_IN);
        }
    }

    private class l extends c {
        l(b bVar, View view) {
            super(view);
            CardView cardView = (CardView) view.findViewById(R.id.category);
            int i10 = t.d(bVar.getActivity()).y;
            cardView.getLayoutParams().height = i10;
            cardView.setRadius(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I0() {
        AbstractActivityC1136v activity = getActivity();
        if (activity == null) {
            return 1;
        }
        return t.g(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(int i10) {
        AbstractActivityC1136v activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        startActivityForResult(intent, i10);
    }

    public static /* synthetic */ WindowInsets v0(View view, WindowInsets windowInsets) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    void E0(AbstractC1356a abstractC1356a, boolean z9) {
        int i10 = 0;
        if (!this.f15952F) {
            if (z9 && !this.f15948B) {
                this.f15954w.notifyItemChanged(I0());
                this.f15954w.notifyItemInserted(I0());
                this.f15948B = true;
            }
            if (this.f15957z.indexOf(abstractC1356a) >= 0) {
                N0(abstractC1356a);
                return;
            }
            int iE = abstractC1356a.e();
            while (i10 < this.f15957z.size() && iE >= ((AbstractC1356a) this.f15957z.get(i10)).e()) {
                i10++;
            }
            this.f15957z.add(i10, abstractC1356a);
            C0449b c0449b = this.f15954w;
            if (c0449b != null) {
                c0449b.notifyItemInserted(i10);
                return;
            }
            return;
        }
        if (z9 && !this.f15948B) {
            this.f15955x.notifyItemChanged(I0());
            this.f15955x.notifyItemInserted(I0());
            this.f15948B = true;
        }
        if (this.f15957z.indexOf(abstractC1356a) >= 0) {
            N0(abstractC1356a);
            return;
        }
        int iE2 = abstractC1356a.e();
        if (abstractC1356a.n()) {
            this.f15949C.add(abstractC1356a);
        }
        while (i10 < this.f15957z.size() && iE2 >= ((AbstractC1356a) this.f15957z.get(i10)).e()) {
            i10++;
        }
        this.f15957z.add(i10, abstractC1356a);
        i iVar = this.f15955x;
        if (iVar != null) {
            iVar.notifyItemInserted(i10);
        }
    }

    void F0() {
        this.f15957z.clear();
        if (!this.f15952F) {
            this.f15954w.notifyDataSetChanged();
        } else {
            this.f15949C.clear();
            this.f15955x.notifyDataSetChanged();
        }
    }

    void G0() {
        if (this.f15948B) {
            if (this.f15952F) {
                i iVar = this.f15955x;
                iVar.notifyItemRemoved(iVar.getItemCount() - 1);
            } else {
                C0449b c0449b = this.f15954w;
                c0449b.notifyItemRemoved(c0449b.getItemCount() - 1);
            }
            this.f15948B = false;
        }
        this.f15950D = this.f15956y.d();
        this.f15951E = this.f15956y.g();
    }

    protected d H0() {
        InterfaceC1163x parentFragment = getParentFragment();
        return parentFragment != null ? (d) parentFragment : (d) getActivity();
    }

    void J0() {
        if (this.f15952F) {
            this.f15955x.notifyDataSetChanged();
        } else {
            this.f15954w.notifyDataSetChanged();
        }
    }

    void K0(AbstractC1356a abstractC1356a) {
        int iIndexOf = this.f15957z.indexOf(abstractC1356a);
        if (iIndexOf >= 0) {
            this.f15957z.remove(iIndexOf);
            if (!this.f15952F) {
                this.f15954w.notifyItemRemoved(iIndexOf);
                return;
            }
            int iIndexOf2 = this.f15949C.indexOf(abstractC1356a);
            if (iIndexOf2 >= 0) {
                this.f15949C.remove(iIndexOf2);
            }
            this.f15955x.notifyItemRemoved(iIndexOf);
        }
    }

    protected void L0() {
        if (getView() == null) {
            return;
        }
        Snackbar snackbarK0 = Snackbar.k0(getView(), R.string.settings_snackbar_description, 0);
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarK0.G();
        TextView textView = (TextView) snackbarLayout.findViewById(R.id.snackbar_text);
        snackbarLayout.setBackgroundResource(R.drawable.snackbar_background);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.textColorPrimary, android.R.attr.colorAccent});
        ((TextView) snackbarLayout.findViewById(R.id.snackbar_action)).setTypeface(null, 1);
        textView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        snackbarK0.o0(typedArrayObtainStyledAttributes.getColor(1, 0));
        typedArrayObtainStyledAttributes.recycle();
        snackbarK0.n0(getContext().getString(R.string.settings_snackbar_enable), new a());
        snackbarK0.W();
    }

    void N0(AbstractC1356a abstractC1356a) {
        int iIndexOf = this.f15957z.indexOf(abstractC1356a);
        if (iIndexOf >= 0) {
            this.f15957z.remove(iIndexOf);
            this.f15957z.add(iIndexOf, abstractC1356a);
            if (!this.f15952F) {
                this.f15954w.notifyItemChanged(iIndexOf);
                return;
            }
            int iIndexOf2 = this.f15949C.indexOf(abstractC1356a);
            if (iIndexOf2 >= 0) {
                this.f15949C.remove(iIndexOf2);
                this.f15949C.add(iIndexOf2, abstractC1356a);
            }
            this.f15955x.notifyItemChanged(iIndexOf);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 1) {
            J0();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15956y = I.a().a(requireContext());
        boolean zE = I.a().C().e(requireContext());
        this.f15952F = zE;
        if (zE) {
            this.f15955x = new i(this.f15957z);
        } else {
            this.f15954w = new C0449b(this.f15957z);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_category_selector, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.category_grid);
        this.f15953v = recyclerView;
        recyclerView.addItemDecoration(new g(getResources().getDimensionPixelSize(R.dimen.grid_item_category_padding_horizontal)));
        this.f15947A = t.c(getActivity());
        if (this.f15952F) {
            this.f15953v.setAdapter(this.f15955x);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), I0() * 2);
            gridLayoutManager.setSpanSizeLookup(new j(this.f15955x));
            this.f15953v.setLayoutManager(gridLayoutManager);
        } else {
            this.f15953v.setAdapter(this.f15954w);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getActivity(), I0() * 2);
            gridLayoutManager2.setSpanSizeLookup(new e(this.f15954w));
            this.f15953v.setLayoutManager(gridLayoutManager2);
        }
        RecyclerView recyclerView2 = this.f15953v;
        RecyclerView recyclerView3 = this.f15953v;
        o.a(getParentFragment());
        recyclerView2.setAccessibilityDelegateCompat(new y(recyclerView3, null, I0()));
        if (H0().d()) {
            viewInflate.findViewById(R.id.header_bar).setVisibility(8);
            H0().b(getText(R.string.wallpaper_title));
        } else {
            q0(viewInflate);
            n0(getText(R.string.wallpaper_title));
        }
        if (!AbstractC0854d.b(getActivity().getIntent())) {
            H0().u();
        }
        this.f15953v.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: i3.e
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return b.v0(view, windowInsets);
            }
        });
        return viewInflate;
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        H0().c();
        super.onDestroyView();
    }
}
