package F7;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(S5.d oldItem, S5.d newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        if ((oldItem instanceof S5.c) && (newItem instanceof S5.c)) {
            return true;
        }
        if ((oldItem instanceof S5.a) && (newItem instanceof S5.a)) {
            S5.a aVar = (S5.a) oldItem;
            S5.a aVar2 = (S5.a) newItem;
            if (aVar.f() == aVar2.f() && aVar.g().size() == aVar2.g().size() && aVar.c() == aVar2.c() && kotlin.jvm.internal.n.d(aVar.h(), aVar2.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(S5.d oldItem, S5.d newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        if ((oldItem instanceof S5.c) && (newItem instanceof S5.c)) {
            return kotlin.jvm.internal.n.d(((S5.c) oldItem).c(), ((S5.c) newItem).c());
        }
        return (oldItem instanceof S5.a) && (newItem instanceof S5.a) && ((S5.a) oldItem).f() == ((S5.a) newItem).f();
    }
}
