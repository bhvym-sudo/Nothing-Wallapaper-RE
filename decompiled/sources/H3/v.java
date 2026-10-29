package H3;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f2530a = new v();

    private v() {
    }

    public static final int a(Context context, int i10) {
        kotlin.jvm.internal.n.h(context, "context");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            int i11 = typedValue.type;
            if (28 <= i11 && i11 <= 31) {
                return typedValue.data;
            }
            if (i11 == 3) {
                return p171r0.a.b(context, typedValue.resourceId);
            }
        }
        throw new IllegalArgumentException("Theme is missing expected color " + context.getResources().getResourceName(i10) + " (" + i10 + ") references a missing resource.");
    }
}
