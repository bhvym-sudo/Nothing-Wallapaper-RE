package androidx.compose.ui.platform;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1051h implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClipboardManager f11908a;

    public C1051h(ClipboardManager clipboardManager) {
        this.f11908a = clipboardManager;
    }

    public boolean a() {
        ClipDescription primaryClipDescription = this.f11908a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1051h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
