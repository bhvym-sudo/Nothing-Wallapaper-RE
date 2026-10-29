package e9;

import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20306h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f20312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f20313g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public w() {
        this.f20307a = new byte[8192];
        this.f20311e = true;
        this.f20310d = false;
    }

    public final void a() {
        int i10;
        w wVar = this.f20313g;
        if (wVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.n.e(wVar);
        if (wVar.f20311e) {
            int i11 = this.f20309c - this.f20308b;
            w wVar2 = this.f20313g;
            kotlin.jvm.internal.n.e(wVar2);
            int i12 = 8192 - wVar2.f20309c;
            w wVar3 = this.f20313g;
            kotlin.jvm.internal.n.e(wVar3);
            if (wVar3.f20310d) {
                i10 = 0;
            } else {
                w wVar4 = this.f20313g;
                kotlin.jvm.internal.n.e(wVar4);
                i10 = wVar4.f20308b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            w wVar5 = this.f20313g;
            kotlin.jvm.internal.n.e(wVar5);
            f(wVar5, i11);
            b();
            x.b(this);
        }
    }

    public final w b() {
        w wVar = this.f20312f;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.f20313g;
        kotlin.jvm.internal.n.e(wVar2);
        wVar2.f20312f = this.f20312f;
        w wVar3 = this.f20312f;
        kotlin.jvm.internal.n.e(wVar3);
        wVar3.f20313g = this.f20313g;
        this.f20312f = null;
        this.f20313g = null;
        return wVar;
    }

    public final w c(w segment) {
        kotlin.jvm.internal.n.h(segment, "segment");
        segment.f20313g = this;
        segment.f20312f = this.f20312f;
        w wVar = this.f20312f;
        kotlin.jvm.internal.n.e(wVar);
        wVar.f20313g = segment;
        this.f20312f = segment;
        return segment;
    }

    public final w d() {
        this.f20310d = true;
        return new w(this.f20307a, this.f20308b, this.f20309c, true, false);
    }

    public final w e(int i10) {
        w wVarC;
        if (i10 <= 0 || i10 > this.f20309c - this.f20308b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            wVarC = d();
        } else {
            wVarC = x.c();
            byte[] bArr = this.f20307a;
            byte[] bArr2 = wVarC.f20307a;
            int i11 = this.f20308b;
            AbstractC1439m.i(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        wVarC.f20309c = wVarC.f20308b + i10;
        this.f20308b += i10;
        w wVar = this.f20313g;
        kotlin.jvm.internal.n.e(wVar);
        wVar.c(wVarC);
        return wVarC;
    }

    public final void f(w sink, int i10) {
        kotlin.jvm.internal.n.h(sink, "sink");
        if (!sink.f20311e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f20309c;
        if (i11 + i10 > 8192) {
            if (sink.f20310d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f20308b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f20307a;
            AbstractC1439m.i(bArr, bArr, 0, i12, i11, 2, null);
            sink.f20309c -= sink.f20308b;
            sink.f20308b = 0;
        }
        byte[] bArr2 = this.f20307a;
        byte[] bArr3 = sink.f20307a;
        int i13 = sink.f20309c;
        int i14 = this.f20308b;
        AbstractC1439m.d(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f20309c += i10;
        this.f20308b += i10;
    }

    public w(byte[] data, int i10, int i11, boolean z9, boolean z10) {
        kotlin.jvm.internal.n.h(data, "data");
        this.f20307a = data;
        this.f20308b = i10;
        this.f20309c = i11;
        this.f20310d = z9;
        this.f20311e = z10;
    }
}
