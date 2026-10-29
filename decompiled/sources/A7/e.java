package A7;

import java.util.Map;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f313a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f314b;

    static {
        N1.a aVar = N1.a.DYNAMIC;
        a aVar2 = a.LEFT;
        f314b = N.i(v.a("GENERAL", new O1.b("GENERAL", aVar, null, null, null, null, aVar2, null, 188, null)), v.a("GRAPHIC", new O1.b("GRAPHIC", aVar, null, null, null, null, a.CENTER, null, 188, null)), v.a("OLD_QUICKLOOK", new O1.b("OLD_QUICKLOOK", aVar, null, null, null, null, aVar2, null, 188, null)));
    }

    private e() {
    }

    public final Map a() {
        return f314b;
    }
}
