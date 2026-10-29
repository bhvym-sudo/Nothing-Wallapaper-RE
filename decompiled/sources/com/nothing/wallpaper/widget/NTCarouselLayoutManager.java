package com.nothing.wallpaper.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public class NTCarouselLayoutManager extends CarouselLayoutManager {
    @Override // com.google.android.material.carousel.CarouselLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View focused, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        n.h(focused, "focused");
        n.h(recycler, "recycler");
        n.h(state, "state");
        try {
            return super.onFocusSearchFailed(focused, i10, recycler, state);
        } catch (ClassCastException e10) {
            c.f("NTCarouselLayoutManager", "onFocusSearchFailed error, msg:" + e10.getMessage());
            return null;
        }
    }
}
