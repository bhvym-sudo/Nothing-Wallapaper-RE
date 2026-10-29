package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import p170r.AbstractC1700q;
import p170r.AbstractC1705t;
import p170r.InterfaceC1698p;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f11710a = new ViewGroup.LayoutParams(-2, -2);

    private static final InterfaceC1698p a(AndroidComposeView androidComposeView, AbstractC1700q abstractC1700q, p219v8.p pVar) {
        if (V.a()) {
            int i10 = C.g.f472J;
            if (androidComposeView.getTag(i10) == null) {
                androidComposeView.setTag(i10, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        InterfaceC1698p interfaceC1698pA = AbstractC1705t.a(new W.u0(androidComposeView.getRoot()), abstractC1700q);
        View view = androidComposeView.getView();
        int i11 = C.g.f473K;
        Object tag = view.getTag(i11);
        C0 c10 = tag instanceof C0 ? (C0) tag : null;
        if (c10 == null) {
            c10 = new C0(androidComposeView, interfaceC1698pA);
            androidComposeView.getView().setTag(i11, c10);
        }
        c10.d(pVar);
        if (!kotlin.jvm.internal.n.d(androidComposeView.getCoroutineContext(), abstractC1700q.h())) {
            androidComposeView.setCoroutineContext(abstractC1700q.h());
        }
        return c10;
    }

    public static final InterfaceC1698p b(AbstractComposeView abstractComposeView, AbstractC1700q abstractC1700q, p219v8.p pVar) {
        T.f11780a.b();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), abstractC1700q.h());
            abstractComposeView.addView(androidComposeView.getView(), f11710a);
        }
        return a(androidComposeView, abstractC1700q, pVar);
    }
}
