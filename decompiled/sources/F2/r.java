package F2;

import android.os.UserHandle;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UserHandle f1593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1595d;

    public r(String packageName, UserHandle user, int i10, int i11) {
        kotlin.jvm.internal.n.h(packageName, "packageName");
        kotlin.jvm.internal.n.h(user, "user");
        this.f1592a = packageName;
        this.f1593b = user;
        this.f1594c = i10;
        this.f1595d = i11;
    }

    public final int a() {
        return this.f1594c;
    }

    public final String b() {
        return this.f1592a;
    }

    public final int c() {
        return this.f1595d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.n.d(this.f1592a, rVar.f1592a) && kotlin.jvm.internal.n.d(this.f1593b, rVar.f1593b) && this.f1594c == rVar.f1594c && this.f1595d == rVar.f1595d;
    }

    public int hashCode() {
        return (((((this.f1592a.hashCode() * 31) + this.f1593b.hashCode()) * 31) + Integer.hashCode(this.f1594c)) * 31) + Integer.hashCode(this.f1595d);
    }

    public String toString() {
        return "PackageUserKey(packageName=" + this.f1592a + ", user=" + this.f1593b + ", groupId=" + this.f1594c + ", titleRes=" + this.f1595d + ")";
    }
}
