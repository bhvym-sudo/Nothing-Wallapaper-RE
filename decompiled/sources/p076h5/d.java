package p076h5;

import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1162w;
import androidx.lifecycle.J;
import java.io.Closeable;
import p005a4.f;
import p056f5.a;
import p215v4.k;

/* JADX INFO: loaded from: classes.dex */
public interface d extends Closeable, InterfaceC1162w, f {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @J(AbstractC1157q.a.ON_DESTROY)
    void close();

    k p0(a aVar);
}
