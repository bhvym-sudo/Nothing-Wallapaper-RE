package F7;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(com.nothing.launcher.card.j oldItem, com.nothing.launcher.card.j newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return oldItem.q() == newItem.q() && oldItem.J() == newItem.J() && kotlin.jvm.internal.n.d(oldItem.w0(), newItem.w0()) && oldItem.A() == newItem.A() && kotlin.jvm.internal.n.d(oldItem.p(), newItem.p());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(com.nothing.launcher.card.j oldItem, com.nothing.launcher.card.j newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return oldItem.e() == newItem.e() && oldItem.B0() == newItem.B0() && oldItem.C0() == newItem.C0();
    }
}
