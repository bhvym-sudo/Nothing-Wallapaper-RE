package p237x6;

import android.net.Uri;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.n;
import p129m8.e;
import p219v8.l;
import p227w6.d;

/* JADX INFO: loaded from: classes2.dex */
public interface r extends Flushable, Closeable {
    List A(l lVar);

    default Uri Q0(String key) {
        n.h(key, "key");
        return null;
    }

    void V(List list);

    InputStream W(String str);

    d get(String str);

    int getCount();

    Object j0(String str, d dVar, e eVar);

    void p(String str);

    boolean remove(String str);

    boolean y();
}
