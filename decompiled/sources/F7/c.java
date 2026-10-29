package F7;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(T1.a oldItem, T1.a newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return oldItem.c() == newItem.c();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(T1.a oldItem, T1.a newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return kotlin.jvm.internal.n.d(oldItem.a(), newItem.a());
    }
}
