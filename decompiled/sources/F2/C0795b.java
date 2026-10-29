package F2;

/* JADX INFO: renamed from: F2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0795b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1550d;

    public C0795b() {
        this.f1547a = -1;
        this.f1548b = -1;
        this.f1549c = 1;
        this.f1550d = 1;
    }

    public void a(C0795b c0795b) {
        this.f1547a = c0795b.f1547a;
        this.f1548b = c0795b.f1548b;
        this.f1549c = c0795b.f1549c;
        this.f1550d = c0795b.f1550d;
    }

    public String toString() {
        return "(" + this.f1547a + ", " + this.f1548b + ": " + this.f1549c + ", " + this.f1550d + ")";
    }

    public C0795b(int i10, int i11, int i12, int i13) {
        this.f1547a = i10;
        this.f1548b = i11;
        this.f1549c = i12;
        this.f1550d = i13;
    }
}
