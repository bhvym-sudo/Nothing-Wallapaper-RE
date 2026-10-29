package p142o1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    boolean D0();

    Cursor K0(j jVar, CancellationSignal cancellationSignal);

    boolean L0();

    Cursor R0(j jVar);

    void T();

    void X();

    Cursor f0(String str);

    String getPath();

    void h();

    boolean isOpen();

    List k();

    void l0();

    void q(String str);

    k w(String str);
}
