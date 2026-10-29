package M6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p064g3.AbstractC1356a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC1356a f5018q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View rootView) {
        super(rootView);
        kotlin.jvm.internal.n.h(rootView, "rootView");
    }

    public void d(AbstractC1356a category) {
        kotlin.jvm.internal.n.h(category, "category");
        this.f5018q = category;
    }

    public final AbstractC1356a e() {
        return this.f5018q;
    }
}
