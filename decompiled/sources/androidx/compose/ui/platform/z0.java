package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12016a = a.f12017a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f12017a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z0 f12018b = new z0() { // from class: androidx.compose.ui.platform.y0
            @Override // androidx.compose.ui.platform.z0
            public final p170r.A0 a(View view) {
                return z0.a.b(view);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p170r.A0 b(View view) {
            return B0.c(view, null, null, 3, null);
        }

        public final z0 c() {
            return f12018b;
        }
    }

    p170r.A0 a(View view);
}
