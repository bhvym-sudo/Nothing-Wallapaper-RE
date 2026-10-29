package androidx.compose.ui.platform;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1050g implements InterfaceC1049f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f11901b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11902c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityManager f11903a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.g$a */
    private static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public C1050g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f11903a = (AccessibilityManager) systemService;
    }
}
