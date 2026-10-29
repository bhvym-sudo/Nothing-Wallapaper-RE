package G5;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1946a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Handler handler) {
        super(handler);
        n.h(context, "context");
        n.h(handler, "handler");
        this.f1946a = context;
    }

    private final void a(Uri uri) {
        c.f1948a.k(Settings.System.getInt(this.f1946a.getContentResolver(), uri.getLastPathSegment(), 0) == 1);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z9, Uri uri) {
        if (uri != null) {
            a(uri);
        }
    }
}
