package M6;

import com.nothing.wallpaper.widget.CategoryItemView;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p064g3.AbstractC1356a;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final CategoryItemView f5039r;

    public /* synthetic */ f(CategoryItemView categoryItemView, Set set, p219v8.p pVar, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this(categoryItemView, set, pVar, (i10 & 8) != 0 ? false : z9);
    }

    @Override // M6.a
    public void d(AbstractC1356a category) {
        kotlin.jvm.internal.n.h(category, "category");
        super.d(category);
        this.f5039r.c(category);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CategoryItemView categoryView, Set appliedIds, p219v8.p listener, boolean z9) {
        super(categoryView);
        kotlin.jvm.internal.n.h(categoryView, "categoryView");
        kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f5039r = categoryView;
        categoryView.f(appliedIds, z9, listener);
    }
}
