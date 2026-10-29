package F7;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(C7.a oldItem, C7.a newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(C7.a oldItem, C7.a newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return kotlin.jvm.internal.n.d(oldItem.c(), newItem.c());
    }
}
