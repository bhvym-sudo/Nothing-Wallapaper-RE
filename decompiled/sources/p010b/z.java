package p010b;

import android.view.View;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final void a(View view, w onBackPressedDispatcherOwner) {
        n.h(view, "<this>");
        n.h(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(x.f14550b, onBackPressedDispatcherOwner);
    }
}
