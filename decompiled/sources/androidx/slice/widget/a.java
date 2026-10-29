package androidx.slice.widget;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13888d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13891g = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13889e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13890f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13892h = -1;

    public a(int i10, int i11, int i12, int i13) {
        this.f13885a = i10;
        this.f13886b = i11;
        this.f13887c = i12;
        this.f13888d = i13;
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "TOGGLE";
        }
        if (i10 == 1) {
            return "BUTTON";
        }
        if (i10 == 2) {
            return "SLIDER";
        }
        if (i10 == 3) {
            return "CONTENT";
        }
        if (i10 == 4) {
            return "SEE MORE";
        }
        return "unknown action: " + i10;
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "START";
        }
        if (i10 == 1) {
            return "END";
        }
        if (i10 == 2) {
            return "CELL";
        }
        return "unknown position: " + i10;
    }

    private static String c(int i10) {
        switch (i10) {
            case -1:
                return "SHORTCUT";
            case 0:
                return "LIST";
            case 1:
                return "GRID";
            case 2:
                return "MESSAGING";
            case 3:
                return "TOGGLE";
            case 4:
                return "SLIDER";
            case 5:
                return "PROGRESS";
            default:
                return "unknown row type: " + i10;
        }
    }

    public void d(int i10, int i11, int i12) {
        this.f13891g = i10;
        this.f13889e = i11;
        this.f13890f = i12;
    }

    public String toString() {
        return "mode=" + SliceView.l(this.f13885a) + ", actionType=" + a(this.f13886b) + ", rowTemplateType=" + c(this.f13887c) + ", rowIndex=" + this.f13888d + ", actionPosition=" + b(this.f13891g) + ", actionIndex=" + this.f13889e + ", actionCount=" + this.f13890f + ", state=" + this.f13892h;
    }
}
