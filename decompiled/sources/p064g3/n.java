package p064g3;

import android.util.Log;
import androidx.lifecycle.C;
import androidx.lifecycle.H;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import p074h3.U;

/* JADX INFO: loaded from: classes.dex */
public class n extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f21178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21179c;

    class a implements U.a {
        a() {
        }

        @Override // h3.U.a
        public void a(Throwable th) {
            Log.w("SetWallpaperViewModel", "SetWallpaperCallback error", th);
            n.this.f21178b.n(b.ERROR);
        }

        @Override // h3.U.a
        public void b(x xVar, int i10) {
            Log.d("SetWallpaperViewModel", "SetWallpaperCallback success");
            n.this.f21178b.n(b.SUCCESS);
        }

        @Override // h3.U.a
        public void c() {
            n.this.f21178b.n(b.LOADING);
        }
    }

    public enum b {
        UNKNOWN,
        PENDING,
        SUCCESS,
        ERROR,
        LOADING
    }

    public n() {
        H h10 = new H();
        this.f21178b = h10;
        h10.n(b.UNKNOWN);
    }

    public static U.a f(d0 d0Var) {
        return ((n) d0Var.b(n.class)).new a();
    }

    public int g() {
        return this.f21179c;
    }

    public C h() {
        return this.f21178b;
    }

    public void i(int i10) {
        this.f21179c = i10;
    }
}
