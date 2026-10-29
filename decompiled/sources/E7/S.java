package E7;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public interface S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1327c = a.f1328a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f1328a = new a();

        private a() {
        }

        public final S a(ViewParent viewParent) {
            if (viewParent instanceof S) {
                return (S) viewParent;
            }
            if ((viewParent != null ? viewParent.getParent() : null) != null) {
                return a(viewParent.getParent());
            }
            return null;
        }
    }

    void a(boolean z9);

    void d(View view);

    void j(View view);

    void p();

    void v(p258z7.c cVar);
}
