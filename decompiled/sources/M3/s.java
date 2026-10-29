package M3;

import T3.InterfaceC0949c;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
abstract class s implements Closeable {

    interface a {
        a a(Context context);

        s build();
    }

    s() {
    }

    abstract InterfaceC0949c a();

    abstract r b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
