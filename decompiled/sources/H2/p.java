package H2;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(Layout layout, int i10) {
        return layout.getParagraphDirection(i10) == 1 ? layout.getLineLeft(i10) : layout.getLineRight(i10);
    }
}
