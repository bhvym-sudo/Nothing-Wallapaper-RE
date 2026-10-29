package Y6;

import P8.z;
import android.content.Context;
import java.time.Duration;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9376a = new c();

    private c() {
    }

    public final z a(Context context) {
        n.h(context, "context");
        d9.a aVar = new d9.a(new b(context, "NTWallpaper_Http"));
        if (com.nothing.wallpaper.common.log.c.f18435a.m()) {
            aVar.d(d9.a.EnumC0527a.BODY);
        } else {
            aVar.d(d9.a.EnumC0527a.HEADERS);
        }
        z.a aVar2 = new z.a();
        Duration durationOfSeconds = Duration.ofSeconds(16L);
        n.g(durationOfSeconds, "ofSeconds(...)");
        z.a aVarJ = aVar2.J(durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(16L);
        n.g(durationOfSeconds2, "ofSeconds(...)");
        return aVarJ.d(durationOfSeconds2).a(aVar).a(new a(context)).b();
    }
}
