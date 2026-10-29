package p076h5;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f21780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FloatBuffer f21781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap f21782c;

    public c(List list, FloatBuffer floatBuffer, Bitmap bitmap) {
        this.f21780a = list;
        this.f21781b = floatBuffer;
        this.f21782c = bitmap;
    }

    public Bitmap a() {
        return this.f21782c;
    }

    public FloatBuffer b() {
        return this.f21781b;
    }
}
