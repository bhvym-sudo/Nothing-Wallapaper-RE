package Q7;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import com.nothing.wallpaper.NTPickerApplication;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p215v4.InterfaceC1995f;
import p215v4.InterfaceC1996g;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p076h5.d f6898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p079h8.h f6900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p079h8.h f6901d;

    public interface a {
        void a();

        void b(p076h5.c cVar);
    }

    public f(p076h5.d subjectSegmenter) {
        kotlin.jvm.internal.n.h(subjectSegmenter, "subjectSegmenter");
        this.f6898a = subjectSegmenter;
        this.f6899b = "MLKitSegmenterProcessor";
        this.f6900c = p079h8.i.b(new p219v8.a() { // from class: Q7.d
            @Override // p219v8.a
            public final Object invoke() {
                return f.e();
            }
        });
        this.f6901d = p079h8.i.b(new p219v8.a() { // from class: Q7.e
            @Override // p219v8.a
            public final Object invoke() {
                return f.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityManager e() {
        Object systemService = NTPickerApplication.f18424q.a().getSystemService("activity");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return (ActivityManager) systemService;
    }

    private final p215v4.k f(p056f5.a aVar) {
        p215v4.k kVarP0 = this.f6898a.p0(aVar);
        kotlin.jvm.internal.n.g(kVarP0, "process(...)");
        return kVarP0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService g() {
        return Executors.newSingleThreadExecutor();
    }

    private final ActivityManager h() {
        return (ActivityManager) this.f6900c.getValue();
    }

    private final ExecutorService i() {
        return (ExecutorService) this.f6901d.getValue();
    }

    private final p215v4.k k(p215v4.k kVar, final a aVar) {
        p215v4.k kVarD = kVar.f(i(), new InterfaceC1996g() { // from class: Q7.b
            @Override // p215v4.InterfaceC1996g
            public final void b(Object obj) {
                f.l(this.f6894a, aVar, (p076h5.c) obj);
            }
        }).d(i(), new InterfaceC1995f() { // from class: Q7.c
            @Override // p215v4.InterfaceC1995f
            public final void d(Exception exc) {
                f.m(this.f6896a, aVar, exc);
            }
        });
        kotlin.jvm.internal.n.g(kVarD, "addOnFailureListener(...)");
        return kVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(f fVar, a aVar, p076h5.c cVar) {
        com.nothing.wallpaper.common.log.c.d(fVar.f6899b, "Success to process.");
        if (com.nothing.wallpaper.common.log.c.f18435a.m()) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            fVar.h().getMemoryInfo(memoryInfo);
            long j9 = memoryInfo.availMem / 1048576;
            com.nothing.wallpaper.common.log.c.d(fVar.f6899b, "Memory available in system: " + j9 + " MB");
        }
        kotlin.jvm.internal.n.e(cVar);
        aVar.b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(f fVar, a aVar, Exception e10) {
        kotlin.jvm.internal.n.h(e10, "e");
        com.nothing.wallpaper.common.log.c.f(fVar.f6899b, "Failed to process. error:" + e10.getMessage());
        aVar.a();
    }

    public final void j(Bitmap bitmap, a listener) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        kotlin.jvm.internal.n.h(listener, "listener");
        p056f5.a aVarA = p056f5.a.a(bitmap, 0);
        kotlin.jvm.internal.n.g(aVarA, "fromBitmap(...)");
        k(f(aVarA), listener);
    }
}
