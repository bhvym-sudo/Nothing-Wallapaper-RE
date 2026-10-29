package p142o1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23336a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        n.h(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        n.e(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List uris) {
        n.h(cursor, "cursor");
        n.h(cr, "cr");
        n.h(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
