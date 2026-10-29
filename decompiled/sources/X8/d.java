package X8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import e9.B;
import e9.C1350e;
import e9.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c[] f9051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f9052c;

    static {
        d dVar = new d();
        f9050a = dVar;
        c cVar = new c(c.f9046j, "");
        e9.h hVar = c.f9043g;
        c cVar2 = new c(hVar, "GET");
        c cVar3 = new c(hVar, "POST");
        e9.h hVar2 = c.f9044h;
        c cVar4 = new c(hVar2, "/");
        c cVar5 = new c(hVar2, "/index.html");
        e9.h hVar3 = c.f9045i;
        c cVar6 = new c(hVar3, "http");
        c cVar7 = new c(hVar3, "https");
        e9.h hVar4 = c.f9042f;
        f9051b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f9052c = dVar.d();
    }

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f9051b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f9051b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f9047a)) {
                linkedHashMap.put(cVarArr2[i10].f9047a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.n.g(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final e9.h a(e9.h name) throws IOException {
        kotlin.jvm.internal.n.h(name, "name");
        int iV = name.v();
        for (int i10 = 0; i10 < iV; i10++) {
            byte bH = name.h(i10);
            if (65 <= bH && bH < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.y());
            }
        }
        return name;
    }

    public final Map b() {
        return f9052c;
    }

    public final c[] c() {
        return f9051b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f9055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e9.g f9056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f9057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9058f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9059g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9060h;

        public a(B source, int i10, int i11) {
            kotlin.jvm.internal.n.h(source, "source");
            this.f9053a = i10;
            this.f9054b = i11;
            this.f9055c = new ArrayList();
            this.f9056d = o.d(source);
            c[] cVarArr = new c[8];
            this.f9057e = cVarArr;
            this.f9058f = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f9054b;
            int i11 = this.f9060h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC1439m.t(this.f9057e, null, 0, 0, 6, null);
            this.f9058f = this.f9057e.length - 1;
            this.f9059g = 0;
            this.f9060h = 0;
        }

        private final int c(int i10) {
            return this.f9058f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f9057e.length;
                while (true) {
                    length--;
                    i11 = this.f9058f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f9057e[length];
                    kotlin.jvm.internal.n.e(cVar);
                    int i13 = cVar.f9049c;
                    i10 -= i13;
                    this.f9060h -= i13;
                    this.f9059g--;
                    i12++;
                }
                c[] cVarArr = this.f9057e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f9059g);
                this.f9058f += i12;
            }
            return i12;
        }

        private final e9.h f(int i10) throws IOException {
            if (h(i10)) {
                return d.f9050a.c()[i10].f9047a;
            }
            int iC = c(i10 - d.f9050a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f9057e;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    kotlin.jvm.internal.n.e(cVar);
                    return cVar.f9047a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, c cVar) {
            this.f9055c.add(cVar);
            int i11 = cVar.f9049c;
            if (i10 != -1) {
                c cVar2 = this.f9057e[c(i10)];
                kotlin.jvm.internal.n.e(cVar2);
                i11 -= cVar2.f9049c;
            }
            int i12 = this.f9054b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f9060h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f9059g + 1;
                c[] cVarArr = this.f9057e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f9058f = this.f9057e.length - 1;
                    this.f9057e = cVarArr2;
                }
                int i14 = this.f9058f;
                this.f9058f = i14 - 1;
                this.f9057e[i14] = cVar;
                this.f9059g++;
            } else {
                this.f9057e[i10 + c(i10) + iD] = cVar;
            }
            this.f9060h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f9050a.c().length - 1;
        }

        private final int i() {
            return Q8.d.d(this.f9056d.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f9055c.add(d.f9050a.c()[i10]);
                return;
            }
            int iC = c(i10 - d.f9050a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f9057e;
                if (iC < cVarArr.length) {
                    List list = this.f9055c;
                    c cVar = cVarArr[iC];
                    kotlin.jvm.internal.n.e(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f9050a.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f9055c.add(new c(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f9055c.add(new c(d.f9050a.a(j()), j()));
        }

        public final List e() {
            List listR0 = AbstractC1444s.r0(this.f9055c);
            this.f9055c.clear();
            return listR0;
        }

        public final e9.h j() {
            int i10 = i();
            boolean z9 = (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) == 128;
            long jM = m(i10, 127);
            if (!z9) {
                return this.f9056d.n(jM);
            }
            C1350e c1350e = new C1350e();
            k.f9210a.b(this.f9056d, jM, c1350e);
            return c1350e.w0();
        }

        public final void k() throws IOException {
            while (!this.f9056d.D()) {
                int iD = Q8.d.d(this.f9056d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & Optimizer.OPTIMIZATION_GRAPH_WRAP) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f9054b = iM;
                    if (iM < 0 || iM > this.f9053a) {
                        throw new IOException("Invalid dynamic table size update " + this.f9054b);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & Optimizer.OPTIMIZATION_GRAPH_WRAP) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(B b10, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
            this(b10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f9062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C1350e f9063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f9067g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9068h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9069i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9070j;

        public b(int i10, boolean z9, C1350e out) {
            kotlin.jvm.internal.n.h(out, "out");
            this.f9061a = i10;
            this.f9062b = z9;
            this.f9063c = out;
            this.f9064d = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f9066f = i10;
            c[] cVarArr = new c[8];
            this.f9067g = cVarArr;
            this.f9068h = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f9066f;
            int i11 = this.f9070j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC1439m.t(this.f9067g, null, 0, 0, 6, null);
            this.f9068h = this.f9067g.length - 1;
            this.f9069i = 0;
            this.f9070j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f9067g.length;
                while (true) {
                    length--;
                    i11 = this.f9068h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f9067g[length];
                    kotlin.jvm.internal.n.e(cVar);
                    i10 -= cVar.f9049c;
                    int i13 = this.f9070j;
                    c cVar2 = this.f9067g[length];
                    kotlin.jvm.internal.n.e(cVar2);
                    this.f9070j = i13 - cVar2.f9049c;
                    this.f9069i--;
                    i12++;
                }
                c[] cVarArr = this.f9067g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f9069i);
                c[] cVarArr2 = this.f9067g;
                int i14 = this.f9068h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f9068h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f9049c;
            int i11 = this.f9066f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f9070j + i10) - i11);
            int i12 = this.f9069i + 1;
            c[] cVarArr = this.f9067g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f9068h = this.f9067g.length - 1;
                this.f9067g = cVarArr2;
            }
            int i13 = this.f9068h;
            this.f9068h = i13 - 1;
            this.f9067g[i13] = cVar;
            this.f9069i++;
            this.f9070j += i10;
        }

        public final void e(int i10) {
            this.f9061a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f9066f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f9064d = Math.min(this.f9064d, iMin);
            }
            this.f9065e = true;
            this.f9066f = iMin;
            a();
        }

        public final void f(e9.h data) {
            kotlin.jvm.internal.n.h(data, "data");
            if (this.f9062b) {
                k kVar = k.f9210a;
                if (kVar.d(data) < data.v()) {
                    C1350e c1350e = new C1350e();
                    kVar.c(data, c1350e);
                    e9.h hVarW0 = c1350e.w0();
                    h(hVarW0.v(), 127, Optimizer.OPTIMIZATION_GRAPH_WRAP);
                    this.f9063c.s0(hVarW0);
                    return;
                }
            }
            h(data.v(), 127, 0);
            this.f9063c.s0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public final void g(List headerBlock) {
            int length;
            int length2;
            kotlin.jvm.internal.n.h(headerBlock, "headerBlock");
            if (this.f9065e) {
                int i10 = this.f9064d;
                if (i10 < this.f9066f) {
                    h(i10, 31, 32);
                }
                this.f9065e = false;
                this.f9064d = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                h(this.f9066f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) headerBlock.get(i11);
                e9.h hVarX = cVar.f9047a.x();
                e9.h hVar = cVar.f9048b;
                d dVar = d.f9050a;
                Integer num = (Integer) dVar.b().get(hVarX);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (kotlin.jvm.internal.n.d(dVar.c()[iIntValue].f9048b, hVar)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.n.d(dVar.c()[length2].f9048b, hVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f9067g.length;
                    for (int i12 = this.f9068h + 1; i12 < length3; i12++) {
                        c cVar2 = this.f9067g[i12];
                        kotlin.jvm.internal.n.e(cVar2);
                        if (kotlin.jvm.internal.n.d(cVar2.f9047a, hVarX)) {
                            c cVar3 = this.f9067g[i12];
                            kotlin.jvm.internal.n.e(cVar3);
                            if (kotlin.jvm.internal.n.d(cVar3.f9048b, hVar)) {
                                length2 = d.f9050a.c().length + (i12 - this.f9068h);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f9068h) + d.f9050a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, Optimizer.OPTIMIZATION_GRAPH_WRAP);
                } else if (length == -1) {
                    this.f9063c.F(64);
                    f(hVarX);
                    f(hVar);
                    d(cVar);
                } else if (!hVarX.w(c.f9041e) || kotlin.jvm.internal.n.d(c.f9046j, hVarX)) {
                    h(length, 63, 64);
                    f(hVar);
                    d(cVar);
                } else {
                    h(length, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f9063c.F(i10 | i12);
                return;
            }
            this.f9063c.F(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f9063c.F(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f9063c.F(i13);
        }

        public /* synthetic */ b(int i10, boolean z9, C1350e c1350e, int i11, AbstractC1457h abstractC1457h) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z9, c1350e);
        }
    }
}
