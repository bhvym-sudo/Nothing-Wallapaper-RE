package H3;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColorStateList(0).getDefaultColor();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
