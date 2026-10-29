package U6;

import com.nothing.wallpaper.NTPickerApplication;
import java.io.File;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7980a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f7981b = i.b(new p219v8.a() { // from class: U6.a
        @Override // p219v8.a
        public final Object invoke() {
            return b.c();
        }
    });

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p127m6.d c() {
        File file = new File(NTPickerApplication.f18424q.a().getFilesDir().getAbsolutePath(), "NTCreative_wallpapers_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        m6.d.b bVar = p127m6.d.f23235e;
        String absolutePath = file.getAbsolutePath();
        n.g(absolutePath, "getAbsolutePath(...)");
        return bVar.a(absolutePath, 100);
    }

    private final p127m6.a d() {
        return (p127m6.a) f7981b.getValue();
    }

    public final p127m6.a b() {
        return d();
    }
}
