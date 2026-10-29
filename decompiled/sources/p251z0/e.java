package p251z0;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p251z0.d f30596a = new C0756e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p251z0.d f30597b = new C0756e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p251z0.d f30598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p251z0.d f30599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p251z0.d f30600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p251z0.d f30601f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f30602b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f30603a;

        private a(boolean z9) {
            this.f30603a = z9;
        }

        @Override // z0.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z9 = false;
            while (i10 < i12) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f30603a) {
                        return 1;
                    }
                    i10++;
                    z9 = z9;
                } else if (this.f30603a) {
                    return 0;
                }
                z9 = true;
                i10++;
                z9 = z9;
            }
            if (z9) {
                return this.f30603a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f30604a = new b();

        private b() {
        }

        @Override // z0.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements p251z0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f30605a;

        d(c cVar) {
            this.f30605a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int iA = this.f30605a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // p251z0.d
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f30605a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    /* JADX INFO: renamed from: z0.e$e, reason: collision with other inner class name */
    private static class C0756e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f30606b;

        C0756e(c cVar, boolean z9) {
            super(cVar);
            this.f30606b = z9;
        }

        @Override // z0.e.d
        protected boolean b() {
            return this.f30606b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f30607b = new f();

        f() {
            super(null);
        }

        @Override // z0.e.d
        protected boolean b() {
            return p251z0.f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f30604a;
        f30598c = new C0756e(bVar, false);
        f30599d = new C0756e(bVar, true);
        f30600e = new C0756e(a.f30602b, false);
        f30601f = f.f30607b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
