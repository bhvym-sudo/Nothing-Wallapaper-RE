package J6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p064g3.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f3606f = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f3607e;

    public interface a {
        void a(List list);
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String title, String collectionId, int i10, int i11) {
        super(title, collectionId, i10, i11);
        n.h(title, "title");
        n.h(collectionId, "collectionId");
        this.f3607e = Executors.newCachedThreadPool();
    }

    private final List r(Context context) throws IOException {
        if (!H6.a.c(context)) {
            return new ArrayList();
        }
        Set<String> externalVolumeNames = MediaStore.getExternalVolumeNames(context);
        n.g(externalVolumeNames, "getExternalVolumeNames(...)");
        if (externalVolumeNames.isEmpty()) {
            com.nothing.wallpaper.common.log.c.f("NTMyImageCategory", "No external volumes!");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "date_modified"}, null, null, "date_modified DESC");
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext() && arrayList.size() < 3) {
            try {
                arrayList.add(new com.android.wallpaper.asset.g(context, Uri.parse(MediaStore.Images.Media.EXTERNAL_CONTENT_URI + "/" + cursorQuery.getString(0))));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
        A a10 = A.f21846a;
        p189s8.b.a(cursorQuery, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(l lVar, Context context, final a aVar) throws IOException {
        final List listR = lVar.r(context);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: J6.k
            @Override // java.lang.Runnable
            public final void run() {
                l.u(aVar, listR);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(a aVar, List list) {
        aVar.a(list);
    }

    public final void s(final Context context, final a receiver) {
        n.h(context, "context");
        n.h(receiver, "receiver");
        this.f3607e.execute(new Runnable() { // from class: J6.j
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                l.t(this.f3601q, context, receiver);
            }
        });
    }
}
