package P8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: P8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0938d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f6159n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0938d f6160o = new a().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0938d f6161p = new a().e().c(SubsamplingScaleImageView.TILE_SIZE_AUTO, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f6171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f6172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f6173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f6174m;

    /* JADX INFO: renamed from: P8.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6177c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6178d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6179e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f6181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f6182h;

        private final int b(long j9) {
            return j9 > 2147483647L ? SubsamplingScaleImageView.TILE_SIZE_AUTO : (int) j9;
        }

        public final C0938d a() {
            return new C0938d(this.f6175a, this.f6176b, this.f6177c, -1, false, false, false, this.f6178d, this.f6179e, this.f6180f, this.f6181g, this.f6182h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            kotlin.jvm.internal.n.h(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f6178d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f6175a = true;
            return this;
        }

        public final a e() {
            this.f6180f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: P8.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (E8.i.R(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:41:0x0106  */
        /* JADX WARN: Code duplicated, block: B:43:0x010e  */
        /* JADX WARN: Code duplicated, block: B:44:0x0114  */
        /* JADX WARN: Code duplicated, block: B:46:0x011c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0122  */
        /* JADX WARN: Code duplicated, block: B:49:0x012a  */
        /* JADX WARN: Code duplicated, block: B:50:0x0130  */
        /* JADX WARN: Code duplicated, block: B:52:0x0138  */
        /* JADX WARN: Code duplicated, block: B:53:0x013f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0147  */
        /* JADX WARN: Code duplicated, block: B:56:0x014f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0157  */
        /* JADX WARN: Code duplicated, block: B:59:0x015d  */
        /* JADX WARN: Code duplicated, block: B:61:0x0166  */
        /* JADX WARN: Code duplicated, block: B:62:0x016e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0176  */
        /* JADX WARN: Code duplicated, block: B:65:0x017e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0186  */
        public final C0938d b(u uVar) {
            int iA;
            int iA2;
            boolean z9;
            String string;
            int i10;
            String str;
            String string2;
            u headers = uVar;
            kotlin.jvm.internal.n.h(headers, "headers");
            int size = headers.size();
            boolean z10 = true;
            boolean z11 = true;
            int i11 = 0;
            String str2 = null;
            boolean z12 = false;
            boolean z13 = false;
            int iV = -1;
            int iV2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iV3 = -1;
            int iV4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i11 < size) {
                String strB = headers.b(i11);
                String strM = headers.m(i11);
                if (E8.i.B(strB, "Cache-Control", z10)) {
                    if (str2 == null) {
                        str2 = strM;
                    }
                    iA = 0;
                    while (iA < strM.length()) {
                        iA2 = a(strM, "=,;", iA);
                        String strSubstring = strM.substring(iA, iA2);
                        z9 = z10;
                        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = E8.i.N0(strSubstring).toString();
                        if (iA2 != strM.length()) {
                            i10 = size;
                            if (strM.charAt(iA2) == ',' && strM.charAt(iA2) != ';') {
                                int iD = Q8.d.D(strM, iA2 + 1);
                                if (iD >= strM.length() || strM.charAt(iD) != '\"') {
                                    str = strM;
                                    iA = a(str, ",;", iD);
                                    String strSubstring2 = str.substring(iD, iA);
                                    kotlin.jvm.internal.n.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = E8.i.N0(strSubstring2).toString();
                                } else {
                                    int i12 = iD + 1;
                                    String str3 = strM;
                                    int iC0 = E8.i.c0(str3, '\"', i12, false, 4, null);
                                    str = str3;
                                    String strSubstring3 = str.substring(i12, iC0);
                                    kotlin.jvm.internal.n.g(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iA = iC0 + 1;
                                    string2 = strSubstring3;
                                }
                            }
                            if (E8.i.B("no-cache", string, z9)) {
                                z10 = z9;
                                z12 = z10;
                            } else if (E8.i.B("no-store", string, z9)) {
                                z10 = z9;
                                z13 = z10;
                            } else {
                                if (E8.i.B("max-age", string, z9)) {
                                    iV = Q8.d.V(string2, -1);
                                } else if (E8.i.B("s-maxage", string, z9)) {
                                    iV2 = Q8.d.V(string2, -1);
                                } else if (E8.i.B("private", string, z9)) {
                                    z10 = z9;
                                    z14 = z10;
                                } else if (E8.i.B("public", string, z9)) {
                                    z10 = z9;
                                    z15 = z10;
                                } else if (E8.i.B("must-revalidate", string, z9)) {
                                    z10 = z9;
                                    z16 = z10;
                                } else if (E8.i.B("max-stale", string, z9)) {
                                    iV3 = Q8.d.V(string2, SubsamplingScaleImageView.TILE_SIZE_AUTO);
                                } else if (E8.i.B("min-fresh", string, z9)) {
                                    iV4 = Q8.d.V(string2, -1);
                                } else if (E8.i.B("only-if-cached", string, z9)) {
                                    z10 = z9;
                                    z17 = z10;
                                } else if (E8.i.B("no-transform", string, z9)) {
                                    z10 = z9;
                                    z18 = z10;
                                } else if (E8.i.B("immutable", string, z9)) {
                                    z10 = z9;
                                    z19 = z10;
                                }
                                z10 = z9;
                            }
                            strM = str;
                            size = i10;
                        } else {
                            i10 = size;
                        }
                        str = strM;
                        iA = iA2 + 1;
                        string2 = null;
                        if (E8.i.B("no-cache", string, z9)) {
                            z10 = z9;
                            z12 = z10;
                        } else if (E8.i.B("no-store", string, z9)) {
                            z10 = z9;
                            z13 = z10;
                        } else {
                            if (E8.i.B("max-age", string, z9)) {
                                iV = Q8.d.V(string2, -1);
                            } else if (E8.i.B("s-maxage", string, z9)) {
                                iV2 = Q8.d.V(string2, -1);
                            } else if (E8.i.B("private", string, z9)) {
                                z10 = z9;
                                z14 = z10;
                            } else if (E8.i.B("public", string, z9)) {
                                z10 = z9;
                                z15 = z10;
                            } else if (E8.i.B("must-revalidate", string, z9)) {
                                z10 = z9;
                                z16 = z10;
                            } else if (E8.i.B("max-stale", string, z9)) {
                                iV3 = Q8.d.V(string2, SubsamplingScaleImageView.TILE_SIZE_AUTO);
                            } else if (E8.i.B("min-fresh", string, z9)) {
                                iV4 = Q8.d.V(string2, -1);
                            } else if (E8.i.B("only-if-cached", string, z9)) {
                                z10 = z9;
                                z17 = z10;
                            } else if (E8.i.B("no-transform", string, z9)) {
                                z10 = z9;
                                z18 = z10;
                            } else if (E8.i.B("immutable", string, z9)) {
                                z10 = z9;
                                z19 = z10;
                            }
                            z10 = z9;
                        }
                        strM = str;
                        size = i10;
                    }
                    i11++;
                    headers = uVar;
                    z10 = z10;
                    size = size;
                } else {
                    if (E8.i.B(strB, "Pragma", z10)) {
                    }
                    i11++;
                    headers = uVar;
                    z10 = z10;
                    size = size;
                }
                z11 = false;
                iA = 0;
                while (iA < strM.length()) {
                    iA2 = a(strM, "=,;", iA);
                    String strSubstring4 = strM.substring(iA, iA2);
                    z9 = z10;
                    kotlin.jvm.internal.n.g(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = E8.i.N0(strSubstring4).toString();
                    if (iA2 != strM.length()) {
                        i10 = size;
                        if (strM.charAt(iA2) == ',') {
                        }
                        if (E8.i.B("no-cache", string, z9)) {
                            z10 = z9;
                            z12 = z10;
                        } else if (E8.i.B("no-store", string, z9)) {
                            z10 = z9;
                            z13 = z10;
                        } else {
                            if (E8.i.B("max-age", string, z9)) {
                                iV = Q8.d.V(string2, -1);
                            } else if (E8.i.B("s-maxage", string, z9)) {
                                iV2 = Q8.d.V(string2, -1);
                            } else if (E8.i.B("private", string, z9)) {
                                z10 = z9;
                                z14 = z10;
                            } else if (E8.i.B("public", string, z9)) {
                                z10 = z9;
                                z15 = z10;
                            } else if (E8.i.B("must-revalidate", string, z9)) {
                                z10 = z9;
                                z16 = z10;
                            } else if (E8.i.B("max-stale", string, z9)) {
                                iV3 = Q8.d.V(string2, SubsamplingScaleImageView.TILE_SIZE_AUTO);
                            } else if (E8.i.B("min-fresh", string, z9)) {
                                iV4 = Q8.d.V(string2, -1);
                            } else if (E8.i.B("only-if-cached", string, z9)) {
                                z10 = z9;
                                z17 = z10;
                            } else if (E8.i.B("no-transform", string, z9)) {
                                z10 = z9;
                                z18 = z10;
                            } else if (E8.i.B("immutable", string, z9)) {
                                z10 = z9;
                                z19 = z10;
                            }
                            z10 = z9;
                        }
                        strM = str;
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    str = strM;
                    iA = iA2 + 1;
                    string2 = null;
                    if (E8.i.B("no-cache", string, z9)) {
                        z10 = z9;
                        z12 = z10;
                    } else if (E8.i.B("no-store", string, z9)) {
                        z10 = z9;
                        z13 = z10;
                    } else {
                        if (E8.i.B("max-age", string, z9)) {
                            iV = Q8.d.V(string2, -1);
                        } else if (E8.i.B("s-maxage", string, z9)) {
                            iV2 = Q8.d.V(string2, -1);
                        } else if (E8.i.B("private", string, z9)) {
                            z10 = z9;
                            z14 = z10;
                        } else if (E8.i.B("public", string, z9)) {
                            z10 = z9;
                            z15 = z10;
                        } else if (E8.i.B("must-revalidate", string, z9)) {
                            z10 = z9;
                            z16 = z10;
                        } else if (E8.i.B("max-stale", string, z9)) {
                            iV3 = Q8.d.V(string2, SubsamplingScaleImageView.TILE_SIZE_AUTO);
                        } else if (E8.i.B("min-fresh", string, z9)) {
                            iV4 = Q8.d.V(string2, -1);
                        } else if (E8.i.B("only-if-cached", string, z9)) {
                            z10 = z9;
                            z17 = z10;
                        } else if (E8.i.B("no-transform", string, z9)) {
                            z10 = z9;
                            z18 = z10;
                        } else if (E8.i.B("immutable", string, z9)) {
                            z10 = z9;
                            z19 = z10;
                        }
                        z10 = z9;
                    }
                    strM = str;
                    size = i10;
                }
                i11++;
                headers = uVar;
                z10 = z10;
                size = size;
            }
            return new C0938d(z12, z13, iV, iV2, z14, z15, z16, iV3, iV4, z17, z18, z19, !z11 ? null : str2, null);
        }

        private b() {
        }
    }

    public /* synthetic */ C0938d(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str, AbstractC1457h abstractC1457h) {
        this(z9, z10, i10, i11, z11, z12, z13, i12, i13, z14, z15, z16, str);
    }

    public final boolean a() {
        return this.f6166e;
    }

    public final boolean b() {
        return this.f6167f;
    }

    public final int c() {
        return this.f6164c;
    }

    public final int d() {
        return this.f6169h;
    }

    public final int e() {
        return this.f6170i;
    }

    public final boolean f() {
        return this.f6168g;
    }

    public final boolean g() {
        return this.f6162a;
    }

    public final boolean h() {
        return this.f6163b;
    }

    public final boolean i() {
        return this.f6171j;
    }

    public String toString() {
        String str = this.f6174m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6162a) {
            sb.append("no-cache, ");
        }
        if (this.f6163b) {
            sb.append("no-store, ");
        }
        if (this.f6164c != -1) {
            sb.append("max-age=");
            sb.append(this.f6164c);
            sb.append(", ");
        }
        if (this.f6165d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f6165d);
            sb.append(", ");
        }
        if (this.f6166e) {
            sb.append("private, ");
        }
        if (this.f6167f) {
            sb.append("public, ");
        }
        if (this.f6168g) {
            sb.append("must-revalidate, ");
        }
        if (this.f6169h != -1) {
            sb.append("max-stale=");
            sb.append(this.f6169h);
            sb.append(", ");
        }
        if (this.f6170i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f6170i);
            sb.append(", ");
        }
        if (this.f6171j) {
            sb.append("only-if-cached, ");
        }
        if (this.f6172k) {
            sb.append("no-transform, ");
        }
        if (this.f6173l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        this.f6174m = string;
        return string;
    }

    private C0938d(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f6162a = z9;
        this.f6163b = z10;
        this.f6164c = i10;
        this.f6165d = i11;
        this.f6166e = z11;
        this.f6167f = z12;
        this.f6168g = z13;
        this.f6169h = i12;
        this.f6170i = i13;
        this.f6171j = z14;
        this.f6172k = z15;
        this.f6173l = z16;
        this.f6174m = str;
    }
}
