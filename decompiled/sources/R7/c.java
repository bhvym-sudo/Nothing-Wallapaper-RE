package R7;

import android.os.Bundle;
import com.nothing.wallpaper.NTPickerApplication;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7111a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f7112b = new a(NTPickerApplication.f18424q.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f7113c = Executors.newSingleThreadExecutor();

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, Bundle bundle) {
        f7112b.a(str, bundle);
    }

    public final void b(final String eventName, final Bundle eventParams) {
        n.h(eventName, "eventName");
        n.h(eventParams, "eventParams");
        f7113c.execute(new Runnable() { // from class: R7.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(eventName, eventParams);
            }
        });
    }
}
