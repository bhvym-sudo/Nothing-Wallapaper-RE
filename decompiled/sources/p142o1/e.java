package p142o1;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f23335a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle extras) {
        n.h(cursor, "cursor");
        n.h(extras, "extras");
        cursor.setExtras(extras);
    }
}
