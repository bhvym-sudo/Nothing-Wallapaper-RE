package T6;

import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import java.util.List;
import kotlin.jvm.internal.n;
import p044e3.C;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f7703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l f7704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Point f7705s;

    public g(List wallpapers, l lVar) {
        n.h(wallpapers, "wallpapers");
        this.f7703q = wallpapers;
        this.f7704r = lVar;
        this.f7705s = new Point(0, 0);
    }

    public final Point d() {
        return this.f7705s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(i holder, int i10) {
        n.h(holder, "holder");
        Wallpaper wallpaper = (Wallpaper) this.f7703q.get(i10);
        if (wallpaper != null) {
            Point point = this.f7705s;
            holder.e(wallpaper, i10, point.x, point.y);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        C C9 = C.C(LayoutInflater.from(parent.getContext()), parent, false);
        n.g(C9, "inflate(...)");
        return new i(C9, this.f7704r);
    }

    public final void g(Point point) {
        n.h(point, "point");
        this.f7705s = point;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7703q.size();
    }
}
