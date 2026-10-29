package androidx.fragment.app;

import android.view.View;
import androidx.collection.C1021a;
import androidx.transition.C1170e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f13014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f13015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V f13016c;

    static {
        T t9 = new T();
        f13014a = t9;
        f13015b = new U();
        f13016c = t9.b();
    }

    private T() {
    }

    public static final void a(AbstractComponentCallbacksC1132q inFragment, AbstractComponentCallbacksC1132q outFragment, boolean z9, C1021a sharedElements, boolean z10) {
        kotlin.jvm.internal.n.h(inFragment, "inFragment");
        kotlin.jvm.internal.n.h(outFragment, "outFragment");
        kotlin.jvm.internal.n.h(sharedElements, "sharedElements");
        if (z9) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    private final V b() {
        try {
            kotlin.jvm.internal.n.f(C1170e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (V) C1170e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(C1021a c1021a, C1021a namedViews) {
        kotlin.jvm.internal.n.h(c1021a, "<this>");
        kotlin.jvm.internal.n.h(namedViews, "namedViews");
        int size = c1021a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c1021a.valueAt(size))) {
                c1021a.removeAt(size);
            }
        }
    }

    public static final void d(List views, int i10) {
        kotlin.jvm.internal.n.h(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
