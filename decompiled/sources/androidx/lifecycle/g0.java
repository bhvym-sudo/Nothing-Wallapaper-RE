package androidx.lifecycle;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f13411r = new a();

        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View f(View currentView) {
            kotlin.jvm.internal.n.h(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f13412r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1163x f(View viewParent) {
            kotlin.jvm.internal.n.h(viewParent, "viewParent");
            Object tag = viewParent.getTag(Y0.a.f9230a);
            if (tag instanceof InterfaceC1163x) {
                return (InterfaceC1163x) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1163x a(View view) {
        kotlin.jvm.internal.n.h(view, "<this>");
        return (InterfaceC1163x) D8.k.s(D8.k.y(D8.k.h(view, a.f13411r), b.f13412r));
    }

    public static final void b(View view, InterfaceC1163x interfaceC1163x) {
        kotlin.jvm.internal.n.h(view, "<this>");
        view.setTag(Y0.a.f9230a, interfaceC1163x);
    }
}
