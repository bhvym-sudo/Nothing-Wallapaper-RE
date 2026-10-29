package p038d7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import p064g3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f19738a = new m();

    private m() {
    }

    public static final void a(ViewGroup container, List screenOptionsSections) {
        n.h(container, "container");
        n.h(screenOptionsSections, "screenOptionsSections");
        m mVar = f19738a;
        Context context = container.getContext();
        n.g(context, "getContext(...)");
        mVar.b(context, container, screenOptionsSections);
    }

    private final void b(Context context, ViewGroup viewGroup, List list) {
        ArrayList<f> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((f) obj).e(context)) {
                arrayList.add(obj);
            }
        }
        for (f fVar : arrayList) {
            View viewC = fVar.c(viewGroup, context);
            if (viewC != null) {
                viewC.setTag(fVar);
            }
        }
    }
}
