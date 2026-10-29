package p251z0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d f30574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f30577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f30578h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f30581c;

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    public static final class C0755a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f30582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f30584c;

        public C0755a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z9) {
            return z9 ? a.f30578h : a.f30577g;
        }

        private void c(boolean z9) {
            this.f30582a = z9;
            this.f30584c = a.f30574d;
            this.f30583b = 2;
        }

        public a a() {
            return (this.f30583b == 2 && this.f30584c == a.f30574d) ? b(this.f30582a) : new a(this.f30582a, this.f30583b, this.f30584c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f30585f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f30586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f30587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f30589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f30590e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f30585f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z9) {
            this.f30586a = charSequence;
            this.f30587b = z9;
            this.f30588c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f30585f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f30589d;
            do {
                int i11 = this.f30589d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f30586a;
                int i12 = i11 - 1;
                this.f30589d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f30590e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f30589d = i10;
            this.f30590e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f30589d;
                if (i10 >= this.f30588c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f30586a;
                this.f30589d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f30590e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f30589d;
            while (true) {
                int i11 = this.f30589d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f30586a;
                int i12 = i11 - 1;
                this.f30589d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f30590e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f30589d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f30586a;
                        int i14 = i13 - 1;
                        this.f30589d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f30590e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f30589d = i10;
            this.f30590e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f30589d;
            while (true) {
                int i11 = this.f30589d;
                if (i11 >= this.f30588c) {
                    this.f30589d = i10;
                    this.f30590e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f30586a;
                this.f30589d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f30590e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f30589d;
                        if (i12 >= this.f30588c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f30586a;
                        this.f30589d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f30590e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f30586a.charAt(this.f30589d - 1);
            this.f30590e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f30586a, this.f30589d);
                this.f30589d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f30589d--;
            byte bC = c(this.f30590e);
            if (this.f30587b) {
                char c10 = this.f30590e;
                if (c10 == '>') {
                    return h();
                }
                if (c10 == ';') {
                    return f();
                }
            }
            return bC;
        }

        byte b() {
            char cCharAt = this.f30586a.charAt(this.f30589d);
            this.f30590e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f30586a, this.f30589d);
                this.f30589d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f30589d++;
            byte bC = c(this.f30590e);
            if (this.f30587b) {
                char c10 = this.f30590e;
                if (c10 == '<') {
                    return i();
                }
                if (c10 == '&') {
                    return g();
                }
            }
            return bC;
        }

        int d() {
            this.f30589d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f30589d < this.f30588c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f30589d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f30589d = this.f30588c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f30589d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f30598c;
        f30574d = dVar;
        f30575e = Character.toString((char) 8206);
        f30576f = Character.toString((char) 8207);
        f30577g = new a(false, 2, dVar);
        f30578h = new a(true, 2, dVar);
    }

    a(boolean z9, int i10, d dVar) {
        this.f30579a = z9;
        this.f30580b = i10;
        this.f30581c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0755a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f30579a && (zA || b(charSequence) == 1)) {
            return f30575e;
        }
        if (this.f30579a) {
            return (!zA || b(charSequence) == -1) ? f30576f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f30579a && (zA || a(charSequence) == 1)) {
            return f30575e;
        }
        if (this.f30579a) {
            return (!zA || a(charSequence) == -1) ? f30576f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f30580b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f30581c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z9) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z9) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? e.f30597b : e.f30596a));
        }
        if (zA != this.f30579a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z9) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? e.f30597b : e.f30596a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f30581c, true);
    }

    public String k(String str, d dVar, boolean z9) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z9).toString();
    }
}
