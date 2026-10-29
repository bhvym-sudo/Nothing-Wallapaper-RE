package P7;

import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.segmenter.Segmenter;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6068a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f6069b = i.b(new p219v8.a() { // from class: P7.a
        @Override // p219v8.a
        public final Object invoke() {
            return b.d();
        }
    });

    private b() {
    }

    private final Segmenter b() {
        return (Segmenter) f6069b.getValue();
    }

    public static final Segmenter c() {
        return f6068a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q7.a d() {
        return new Q7.a(NTPickerApplication.f18424q.a());
    }
}
