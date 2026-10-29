package androidx.slice.widget;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
abstract class h {
    h() {
    }

    public static h a(Context context, Uri uri) {
        return new i(context, uri);
    }

    protected abstract void b();

    protected abstract void c();
}
