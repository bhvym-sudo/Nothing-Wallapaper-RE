package com.android.wallpaper.picker;

import H3.s;
import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.nothing.wallpaper.R;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperSectionView extends s0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CardView f15941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CardView f15942t;

    public WallpaperSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(CardView cardView) {
        cardView.getLayoutParams().height = (int) (cardView.getMeasuredWidth() * s.a().d(getContext()));
        cardView.setRadius(getResources().getDimension(R.dimen.wallpaper_picker_entry_card_corner_radius));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15941s = (CardView) findViewById(R.id.home_preview);
        this.f15942t = (CardView) findViewById(R.id.lock_preview);
        this.f15941s.setCardElevation(0.0f);
        this.f15942t.setCardElevation(0.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a(this.f15941s);
        a(this.f15942t);
    }
}
