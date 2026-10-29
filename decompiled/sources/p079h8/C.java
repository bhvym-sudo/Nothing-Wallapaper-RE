package p079h8;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final double a(long j9) {
        return ((j9 >>> 11) * ((double) RecyclerView.ItemAnimator.FLAG_MOVED)) + (j9 & 2047);
    }
}
