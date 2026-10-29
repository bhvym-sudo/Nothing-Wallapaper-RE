package Y6;

import E8.i;
import android.content.Context;
import kotlin.jvm.internal.n;
import p087i6.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d9.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9375a;

    public b(Context context, String str) {
        n.h(context, "context");
        this.f9375a = i.w0(l.f22204a.c(context, true), "https://");
    }

    @Override // d9.a.b
    public void a(String message) {
        n.h(message, "message");
        com.nothing.wallpaper.common.log.c.d("HttpLogger", i.G(message, this.f9375a, "url", true));
    }
}
