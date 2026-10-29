package p102k1;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    private static class C0569a implements AutoCloseable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final ContentProviderClient f22681q;

        C0569a(ContentProviderClient contentProviderClient) {
            this.f22681q = contentProviderClient;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            ContentProviderClient contentProviderClient = this.f22681q;
            if (contentProviderClient == null) {
                return;
            }
            contentProviderClient.close();
        }
    }

    private static C0569a a(ContentResolver contentResolver, Uri uri) {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
            return new C0569a(contentProviderClientAcquireUnstableContentProviderClient);
        }
        throw new IllegalArgumentException("No provider found for " + uri);
    }

    public static void b(Context context, String str, String str2, Uri uri) {
        try {
            C0569a c0569aA = a(context.getContentResolver(), uri);
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("slice_uri", uri);
                bundle.putString("provider_pkg", str);
                bundle.putString("pkg", str2);
                c0569aA.f22681q.call("grant_perms", "supports_versioned_parcelable", bundle);
                c0569aA.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (c0569aA != null) {
                        try {
                            c0569aA.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (RemoteException e10) {
            Log.e("SliceProviderCompat", "Unable to get slice descendants", e10);
        }
    }
}
