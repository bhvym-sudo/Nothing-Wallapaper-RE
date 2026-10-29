package p248y7;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public interface t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f30551p = a.f30552a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f30552a = new a();

        private a() {
        }

        public final t a(ViewParent viewParent) {
            if (viewParent instanceof t) {
                return (t) viewParent;
            }
            if ((viewParent != null ? viewParent.getParent() : null) != null) {
                return a(viewParent.getParent());
            }
            return null;
        }
    }

    void b(View view, C7.a aVar);

    void y(View view, C7.a aVar);
}
