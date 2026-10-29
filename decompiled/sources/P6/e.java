package P6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends X1.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f6067r;

    private final void i(View view, int i10, int i11) {
        if (view.getWidth() <= 0 || i11 <= 0) {
            return;
        }
        this.f6067r = Integer.valueOf((((view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd()) - i10) / i11);
    }

    @Override // X1.b, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public void onBindViewHolder(X1.b.a holder, int i10) {
        n.h(holder, "holder");
        Integer num = this.f6067r;
        if (num != null) {
            holder.d().setWidth(num.intValue());
        }
        super.onBindViewHolder(holder, i10);
    }

    @Override // X1.b, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public X1.b.a onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.nt_picker_fragment_tab, parent, false);
        n.g(viewInflate, "inflate(...)");
        return new X1.b.a(viewInflate);
    }

    public final void j(View parentView, int i10, List items) {
        n.h(parentView, "parentView");
        n.h(items, "items");
        i(parentView, i10, items.size());
        h(items);
    }
}
