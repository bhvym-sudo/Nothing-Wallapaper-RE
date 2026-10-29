package p061g0;

import H.i;
import I.AbstractC0862f;
import I.C;
import Q.B;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.l;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1355e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f20917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f20918b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y f20926j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f20928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f20929m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20919c = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f20927k = a.f20933r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f20930n = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f20931o = C.c(null, 1, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Matrix f20932p = new Matrix();

    /* JADX INFO: renamed from: g0.e$a */
    static final class a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f20933r = new a();

        a() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(((C) obj).r());
            return A.f21846a;
        }
    }

    public C1355e(B b10, m mVar) {
        this.f20917a = b10;
        this.f20918b = mVar;
    }

    private final void b() {
        if (this.f20918b.a()) {
            this.f20927k.f(C.a(this.f20931o));
            this.f20917a.n(this.f20931o);
            AbstractC0862f.a(this.f20932p, this.f20931o);
            m mVar = this.f20918b;
            CursorAnchorInfo.Builder builder = this.f20930n;
            y yVar = this.f20926j;
            n.e(yVar);
            n.e(null);
            n.e(null);
            Matrix matrix = this.f20932p;
            i iVar = this.f20928l;
            n.e(iVar);
            i iVar2 = this.f20929m;
            n.e(iVar2);
            mVar.b(AbstractC1354d.b(builder, yVar, null, null, matrix, iVar, iVar2, this.f20922f, this.f20923g, this.f20924h, this.f20925i));
            this.f20921e = false;
        }
    }

    public final void a(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        synchronized (this.f20919c) {
            try {
                this.f20922f = z11;
                this.f20923g = z12;
                this.f20924h = z13;
                this.f20925i = z14;
                if (z9) {
                    this.f20921e = true;
                    if (this.f20926j != null) {
                        b();
                    }
                }
                this.f20920d = z10;
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
