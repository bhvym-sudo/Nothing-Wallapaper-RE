package p097j6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Bitmap f22328q;

    public c(Bitmap bitmap) {
        n.h(bitmap, "bitmap");
        this.f22328q = bitmap;
    }

    @Override // p097j6.f
    public Bitmap get() {
        return this.f22328q;
    }
}
