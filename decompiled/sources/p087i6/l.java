package p087i6;

import android.content.Context;
import com.nothing.wallpaper.common.SecurityConfig;
import kotlin.jvm.internal.n;
import p027c6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f22204a = new l();

    private l() {
    }

    public final String a(Context context) {
        n.h(context, "context");
        return a.C0436a.b(a.f15231b, null, 1, null).c(context);
    }

    public final String b(Context context) {
        n.h(context, "context");
        return a.C0436a.b(a.f15231b, null, 1, null).b(context);
    }

    public final String c(Context context, boolean z9) {
        n.h(context, "context");
        SecurityConfig securityConfig = (SecurityConfig) a.C0436a.b(a.f15231b, null, 1, null).d(context, SecurityConfig.class);
        return z9 ? securityConfig.getReleaseUrl() : securityConfig.getDebugUrl();
    }

    public final String d(Context context) {
        n.h(context, "context");
        return ((SecurityConfig) a.C0436a.b(a.f15231b, null, 1, null).d(context, SecurityConfig.class)).getPrivacyUrl();
    }

    public final String e(Context context, boolean z9) {
        n.h(context, "context");
        SecurityConfig securityConfig = (SecurityConfig) a.C0436a.b(a.f15231b, null, 1, null).d(context, SecurityConfig.class);
        return z9 ? securityConfig.getLightTermsUrl() : securityConfig.getDarkTermsUrl();
    }
}
