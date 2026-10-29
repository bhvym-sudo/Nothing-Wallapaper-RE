package g9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: g9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1360c {

    /* JADX INFO: renamed from: g9.c$a */
    static final class a extends C1360c {
        a() {
        }

        @Override // g9.C1360c
        List a(Executor executor) {
            return Arrays.asList(new g(), new i(executor));
        }

        @Override // g9.C1360c
        List b() {
            return Collections.singletonList(new r());
        }
    }

    C1360c() {
    }

    List a(Executor executor) {
        return Collections.singletonList(new i(executor));
    }

    List b() {
        return Collections.EMPTY_LIST;
    }
}
