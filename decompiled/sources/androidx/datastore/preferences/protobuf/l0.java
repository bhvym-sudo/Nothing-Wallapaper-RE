package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f12531q;

    public l0(P p9) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f12531q = null;
    }

    public C1115z a() {
        return new C1115z(getMessage());
    }
}
