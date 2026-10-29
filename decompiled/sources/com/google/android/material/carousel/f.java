package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16719d;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f16721b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f16723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f16724e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f16722c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f16725f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16726g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f16727h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f16728i = -1;

        b(float f10, float f11) {
            this.f16720a = f10;
            this.f16721b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        b c(float f10, float f11, float f12, boolean z9) {
            return d(f10, f11, f12, z9, false);
        }

        b d(float f10, float f11, float f12, boolean z9, boolean z10) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f16721b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z9, z10, fAbs);
        }

        b e(float f10, float f11, float f12, boolean z9, boolean z10, float f13) {
            return f(f10, f11, f12, z9, z10, f13, 0.0f, 0.0f);
        }

        b f(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z10) {
                if (z9) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f16728i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f16728i = this.f16722c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z10, f13, f14, f15);
            if (z9) {
                if (this.f16723d == null) {
                    this.f16723d = cVar;
                    this.f16725f = this.f16722c.size();
                }
                if (this.f16726g != -1 && this.f16722c.size() - this.f16726g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f16723d.f16732d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f16724e = cVar;
                this.f16726g = this.f16722c.size();
            } else {
                if (this.f16723d == null && cVar.f16732d < this.f16727h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f16724e != null && cVar.f16732d > this.f16727h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f16727h = cVar.f16732d;
            this.f16722c.add(cVar);
            return this;
        }

        b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        b h(float f10, float f11, float f12, int i10, boolean z9) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z9);
                }
            }
            return this;
        }

        f i() {
            if (this.f16723d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f16722c.size(); i10++) {
                c cVar = (c) this.f16722c.get(i10);
                arrayList.add(new c(j(this.f16723d.f16730b, this.f16720a, this.f16725f, i10), cVar.f16730b, cVar.f16731c, cVar.f16732d, cVar.f16733e, cVar.f16734f, cVar.f16735g, cVar.f16736h));
            }
            return new f(this.f16720a, arrayList, this.f16725f, this.f16726g);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f16729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f16730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f16731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f16732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f16733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f16734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f16735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f16736h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(p235x4.a.a(cVar.f16729a, cVar2.f16729a, f10), p235x4.a.a(cVar.f16730b, cVar2.f16730b, f10), p235x4.a.a(cVar.f16731c, cVar2.f16731c, f10), p235x4.a.a(cVar.f16732d, cVar2.f16732d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z9, float f14, float f15, float f16) {
            this.f16729a = f10;
            this.f16730b = f11;
            this.f16731c = f12;
            this.f16732d = f13;
            this.f16733e = z9;
            this.f16734f = f14;
            this.f16735g = f15;
            this.f16736h = f16;
        }
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listG = fVar.g();
        List listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            arrayList.add(c.a((c) listG.get(i10), (c) listG2.get(i10), f10));
        }
        return new f(fVar.f(), arrayList, p235x4.a.c(fVar.b(), fVar2.b(), f10), p235x4.a.c(fVar.i(), fVar2.i(), f10));
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f16730b) - (fVar.j().f16732d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d((cVar.f16732d / 2.0f) + f11, cVar.f16731c, cVar.f16732d, size >= fVar.b() && size <= fVar.i(), cVar.f16733e);
            f11 += cVar.f16732d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.f16717b.get(this.f16718c);
    }

    int b() {
        return this.f16718c;
    }

    c c() {
        return (c) this.f16717b.get(0);
    }

    c d() {
        for (int i10 = 0; i10 < this.f16717b.size(); i10++) {
            c cVar = (c) this.f16717b.get(i10);
            if (!cVar.f16733e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.f16717b.subList(this.f16718c, this.f16719d + 1);
    }

    float f() {
        return this.f16716a;
    }

    List g() {
        return this.f16717b;
    }

    c h() {
        return (c) this.f16717b.get(this.f16719d);
    }

    int i() {
        return this.f16719d;
    }

    c j() {
        List list = this.f16717b;
        return (c) list.get(list.size() - 1);
    }

    c k() {
        for (int size = this.f16717b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f16717b.get(size);
            if (!cVar.f16733e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it = this.f16717b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f16733e) {
                i10++;
            }
        }
        return this.f16717b.size() - i10;
    }

    private f(float f10, List list, int i10, int i11) {
        this.f16716a = f10;
        this.f16717b = Collections.unmodifiableList(list);
        this.f16718c = i10;
        this.f16719d = i11;
    }
}
