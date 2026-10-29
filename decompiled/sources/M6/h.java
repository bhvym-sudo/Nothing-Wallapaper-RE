package M6;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.nothing.wallpaper.widget.CategoryItemView;
import java.util.List;
import java.util.Set;
import p044e3.X;
import p064g3.AbstractC1356a;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final X f5042r;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(X binding, Set appliedIds, final p219v8.p listener) {
        kotlin.jvm.internal.n.h(binding, "binding");
        kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
        kotlin.jvm.internal.n.h(listener, "listener");
        View viewO = binding.o();
        kotlin.jvm.internal.n.g(viewO, "getRoot(...)");
        super(viewO);
        this.f5042r = binding;
        binding.f19914z.setOnClickListener(new View.OnClickListener() { // from class: M6.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.f(listener, this, view);
            }
        });
        binding.f19910v.f19904w.f(appliedIds, false, listener);
    }

    public static void f(p219v8.p pVar, h hVar, View view) {
        AbstractC1356a abstractC1356aE = hVar.e();
        kotlin.jvm.internal.n.e(view);
        pVar.invoke(abstractC1356aE, view);
    }

    @Override // M6.a
    public void d(AbstractC1356a category) {
        kotlin.jvm.internal.n.h(category, "category");
        super.d(category);
        if (category instanceof J6.h) {
            X x9 = this.f5042r;
            CategoryItemView categoryItem = x9.f19910v.f19904w;
            kotlin.jvm.internal.n.g(categoryItem, "categoryItem");
            J6.h hVar = (J6.h) category;
            List listQ = hVar.q();
            kotlin.jvm.internal.n.g(listQ, "getUnmodifiableWallpapers(...)");
            categoryItem.setVisibility(!listQ.isEmpty() ? 0 : 8);
            CardView defaultView = x9.f19914z;
            kotlin.jvm.internal.n.g(defaultView, "defaultView");
            defaultView.setVisibility(hVar.q().isEmpty() ? 0 : 8);
            x9.f19913y.setText(hVar.h());
            List listQ2 = hVar.q();
            kotlin.jvm.internal.n.g(listQ2, "getUnmodifiableWallpapers(...)");
            if (listQ2.isEmpty()) {
                return;
            }
            x9.f19910v.f19904w.c(category);
        }
    }
}
