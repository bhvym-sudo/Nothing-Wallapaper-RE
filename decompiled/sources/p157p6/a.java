package p157p6;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p023c2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0627a f23766d = new C0627a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23767c;

    /* JADX INFO: renamed from: p6.a$a, reason: collision with other inner class name */
    public static final class C0627a {
        public /* synthetic */ C0627a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0627a() {
        }
    }

    public a(int i10) {
        super(i10);
        this.f23767c = i10;
    }

    @Override // p023c2.a
    public int a(float f10) {
        return this.f23767c / 2;
    }

    public final int c(int i10) {
        if (i10 >= 0) {
            return (i10 - 1) * this.f23767c;
        }
        return 0;
    }
}
