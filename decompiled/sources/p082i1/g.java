package p082i1;

import D8.k;
import android.view.View;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    static final class a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f21907r = new a();

        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View f(View view) {
            n.h(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f21908r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f f(View view) {
            n.h(view, "view");
            Object tag = view.getTag(p082i1.a.f21891a);
            if (tag instanceof f) {
                return (f) tag;
            }
            return null;
        }
    }

    public static final f a(View view) {
        n.h(view, "<this>");
        return (f) k.s(k.y(k.h(view, a.f21907r), b.f21908r));
    }

    public static final void b(View view, f fVar) {
        n.h(view, "<this>");
        view.setTag(p082i1.a.f21891a, fVar);
    }
}
