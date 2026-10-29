package com.nothing.cardservice.sharewidget.sticker;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18005a = new a();

    private a() {
    }

    public final void a(Context context, String uri) {
        Object objB;
        n.h(context, "context");
        n.h(uri, "uri");
        try {
            q.a aVar = q.f21862r;
            Bundle bundle = new Bundle();
            bundle.putString("check_uri", uri);
            bundle.putInt("mode_flags", 1);
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient("com.nothing.cardservice.sharewidget.stickerPermissionProvider");
            Bundle bundle2 = null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("check_grant_permission", null, bundle);
                    p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, null);
                    bundle2 = bundleCall;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, th);
                        throw th2;
                    }
                }
            }
            if (bundle2 != null && !bundle2.getBoolean("grant_result")) {
                Log.w("StickerResourceHelper", "grantStickerUriPermission result: " + bundle2 + ", uri: " + uri);
            }
            objB = q.b(A.f21846a);
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th3));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            Log.e("StickerResourceHelper", "grantStickerUriPermission error: " + thD.getMessage());
        }
    }
}
