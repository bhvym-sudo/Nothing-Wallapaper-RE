package p074h3;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: h3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1377q implements E {
    @Override // p074h3.E
    public Drawable a(LayerDrawable layerDrawable) {
        return layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
    }
}
