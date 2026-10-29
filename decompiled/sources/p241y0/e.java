package p241y0;

import B0.i;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f30116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30117e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30118f;

    public e(String str, String str2, String str3, List list) {
        this.f30113a = (String) i.e(str);
        this.f30114b = (String) i.e(str2);
        this.f30115c = (String) i.e(str3);
        this.f30116d = (List) i.e(list);
        this.f30118f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f30116d;
    }

    public int c() {
        return this.f30117e;
    }

    String d() {
        return this.f30118f;
    }

    public String e() {
        return this.f30113a;
    }

    public String f() {
        return this.f30114b;
    }

    public String g() {
        return this.f30115c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f30113a + ", mProviderPackage: " + this.f30114b + ", mQuery: " + this.f30115c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f30116d.size(); i10++) {
            sb.append(" [");
            List list = (List) this.f30116d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f30117e);
        return sb.toString();
    }
}
