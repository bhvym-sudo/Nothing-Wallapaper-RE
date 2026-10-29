package g9;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class m extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f21395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f21396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient x f21397s;

    public m(x xVar) {
        super(a(xVar));
        this.f21395q = xVar.b();
        this.f21396r = xVar.e();
        this.f21397s = xVar;
    }

    private static String a(x xVar) {
        Objects.requireNonNull(xVar, "response == null");
        return "HTTP " + xVar.b() + " " + xVar.e();
    }
}
