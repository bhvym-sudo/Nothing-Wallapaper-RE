package p062g1;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f21109a = new r();

    private r() {
    }

    public static final String a(String hash) {
        n.h(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
