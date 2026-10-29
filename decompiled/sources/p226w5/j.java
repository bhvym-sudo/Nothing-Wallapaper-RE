package p226w5;

import B5.e;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public static final class a {
        public static /* synthetic */ void a(j jVar, String str, Bundle bundle, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActionRefresh");
            }
            if ((i10 & 2) != 0) {
                bundle = null;
            }
            jVar.i(str, bundle);
        }

        public static /* synthetic */ void b(j jVar, String str, Bundle bundle, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConfigBroadcastEventReceive");
            }
            if ((i10 & 2) != 0) {
                bundle = null;
            }
            jVar.d(str, bundle);
        }
    }

    void a(View view, int i10, e eVar, p216v5.a aVar);

    void b(View view, String str, e eVar, p216v5.a aVar);

    void c(View view, boolean z9, e eVar, p216v5.a aVar);

    void d(String str, Bundle bundle);

    void e();

    void f(View view, int i10, e eVar);

    boolean g(View view, e eVar, p216v5.a aVar);

    void h();

    void i(String str, Bundle bundle);

    boolean j(View view, int i10, e eVar, p216v5.a aVar);

    void k(View view, e eVar, p216v5.a aVar);

    void l(String str);
}
