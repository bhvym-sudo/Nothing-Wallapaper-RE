package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10753a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10754b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10755c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10756d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10757e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10758f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10759g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10760h = false;

    D() {
    }

    public int a() {
        return this.f10759g ? this.f10753a : this.f10754b;
    }

    public int b() {
        return this.f10753a;
    }

    public int c() {
        return this.f10754b;
    }

    public int d() {
        return this.f10759g ? this.f10754b : this.f10753a;
    }

    public void e(int i10, int i11) {
        this.f10760h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f10757e = i10;
            this.f10753a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f10758f = i11;
            this.f10754b = i11;
        }
    }

    public void f(boolean z9) {
        if (z9 == this.f10759g) {
            return;
        }
        this.f10759g = z9;
        if (!this.f10760h) {
            this.f10753a = this.f10757e;
            this.f10754b = this.f10758f;
            return;
        }
        if (z9) {
            int i10 = this.f10756d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f10757e;
            }
            this.f10753a = i10;
            int i11 = this.f10755c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f10758f;
            }
            this.f10754b = i11;
            return;
        }
        int i12 = this.f10755c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f10757e;
        }
        this.f10753a = i12;
        int i13 = this.f10756d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f10758f;
        }
        this.f10754b = i13;
    }

    public void g(int i10, int i11) {
        this.f10755c = i10;
        this.f10756d = i11;
        this.f10760h = true;
        if (this.f10759g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f10753a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f10754b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f10753a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f10754b = i11;
        }
    }
}
