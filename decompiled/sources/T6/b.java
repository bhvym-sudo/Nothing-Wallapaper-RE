package T6;

import android.graphics.Point;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import java.util.List;
import kotlin.jvm.internal.n;
import p044e3.A;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f7683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f7684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f7685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private l f7686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Point f7688v;

    public b(List prompts, boolean z9, Handler handler, l lVar) {
        n.h(prompts, "prompts");
        n.h(handler, "handler");
        this.f7683q = prompts;
        this.f7684r = z9;
        this.f7685s = handler;
        this.f7686t = lVar;
        this.f7687u = true;
        this.f7688v = new Point(0, 0);
    }

    public final boolean d() {
        return this.f7687u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(f holder, int i10) {
        n.h(holder, "holder");
        Prompt prompt = (Prompt) this.f7683q.get(i10);
        if (prompt != null) {
            boolean z9 = this.f7687u;
            Point point = this.f7688v;
            holder.m(prompt, i10, z9, point.x, point.y);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        A aC = A.C(LayoutInflater.from(parent.getContext()), parent, false);
        n.g(aC, "inflate(...)");
        return new f(aC, this.f7684r, this.f7685s, this.f7686t);
    }

    public final void g(boolean z9) {
        this.f7687u = z9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7683q.size();
    }

    public final void h(Point point) {
        n.h(point, "point");
        this.f7688v = point;
    }
}
