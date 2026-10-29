package androidx.fragment.app;

import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class Y extends Writer {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f13046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private StringBuilder f13047r = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);

    Y(String str) {
        this.f13046q = str;
    }

    private void a() {
        if (this.f13047r.length() > 0) {
            Log.d(this.f13046q, this.f13047r.toString());
            StringBuilder sb = this.f13047r;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f13047r.append(c10);
            }
        }
    }
}
