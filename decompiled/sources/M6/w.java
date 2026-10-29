package M6;

import android.content.Context;
import androidx.recyclerview.widget.DiffUtil;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends DiffUtil.ItemCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5093a;

    public w(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f5093a = context;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(x oldItem, x newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return kotlin.jvm.internal.n.d(oldItem.r(), newItem.r()) && kotlin.jvm.internal.n.d(oldItem.g(this.f5093a), newItem.g(this.f5093a));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(x oldItem, x newItem) {
        kotlin.jvm.internal.n.h(oldItem, "oldItem");
        kotlin.jvm.internal.n.h(newItem, "newItem");
        return kotlin.jvm.internal.n.d(oldItem.r(), newItem.r());
    }
}
