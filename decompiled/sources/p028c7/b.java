package p028c7;

import H3.r;
import R7.d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.i;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f15235s = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f15236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f15237r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: c7.b$b, reason: collision with other inner class name */
    public final class C0438b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final View f15238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ImageView f15239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f15240s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0438b(final b bVar, View view, ImageView imgView) {
            super(view);
            n.h(view, "view");
            n.h(imgView, "imgView");
            this.f15240s = bVar;
            this.f15238q = view;
            this.f15239r = imgView;
            i iVar = view instanceof i ? (i) view : null;
            if (iVar != null) {
                iVar.setShapeAppearanceModel(f());
                iVar.setOnClickListener(new View.OnClickListener() { // from class: c7.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        b.C0438b.d(this.f15241q, bVar, view2);
                    }
                });
            }
        }

        public static void d(C0438b c0438b, b bVar, View view) {
            int layoutPosition = c0438b.getLayoutPosition();
            if (layoutPosition >= 0 && layoutPosition < bVar.f15236q.size()) {
                bVar.f15237r.f(bVar.f15236q.get(layoutPosition));
                d dVar = d.f7114r;
                String strR = ((x) bVar.f15236q.get(layoutPosition)).r();
                n.g(strR, "getWallpaperId(...)");
                dVar.k(strR);
                return;
            }
            c.f("SuggestedWallpaperAdapter", "click item pos with CarouselLayoutManager error, layoutPos=" + c0438b.getBindingAdapterPosition() + ", adapterPos=" + c0438b.getAbsoluteAdapterPosition());
        }

        private final N4.l f() {
            N4.a aVar = new N4.a(this.f15238q.getContext().getResources().getDimensionPixelSize(R.dimen.nt_suggested_wallpaper_card_corner));
            N4.l lVarM = new N4.l.b().y(0, aVar).C(0, aVar).u(0, aVar).q(0, aVar).m();
            n.g(lVarM, "build(...)");
            return lVarM;
        }

        public final void e(x wallpaper, int i10) {
            n.h(wallpaper, "wallpaper");
            Context context = this.f15238q.getContext();
            wallpaper.o(context.getApplicationContext()).n(context, this.f15239r, r.a(context, android.R.attr.colorSecondary));
            this.f15239r.setContentDescription(context.getString(R.string.nt_wallpaper_gallery) + (i10 + 1));
        }
    }

    public b(List wallpaperList, l listener) {
        n.h(wallpaperList, "wallpaperList");
        n.h(listener, "listener");
        this.f15236q = wallpaperList;
        this.f15237r = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15236q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        n.h(holder, "holder");
        ((C0438b) holder).e((x) this.f15236q.get(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.nt_single_suggested_wallpaper, parent, false);
        n.e(viewInflate);
        View viewRequireViewById = viewInflate.requireViewById(R.id.carousel_image_view);
        n.g(viewRequireViewById, "requireViewById(...)");
        return new C0438b(this, viewInflate, (ImageView) viewRequireViewById);
    }
}
