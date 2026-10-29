package androidx.slice;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public interface a {
        void a(Slice slice);
    }

    c() {
    }

    public static c c(Context context) {
        return new e(context);
    }

    public abstract Slice a(Intent intent);

    public abstract Slice b(Uri uri);

    public abstract void d(Uri uri);

    public abstract void e(Uri uri, a aVar);

    public abstract void f(Uri uri);

    public abstract void g(Uri uri, a aVar);
}
