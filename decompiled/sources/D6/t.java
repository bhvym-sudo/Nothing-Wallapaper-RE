package D6;

import android.graphics.Bitmap;
import android.graphics.Point;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1125h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Point f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Point f1127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p167q6.b f1129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p079h8.h f1130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p079h8.h f1131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p079h8.h f1132g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1133a;

        static {
            int[] iArr = new int[C6.a.values().length];
            try {
                iArr[C6.a.Blur.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6.a.Setter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6.a.Depth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1133a = iArr;
        }
    }

    public t(Point viewSize, Point screenSize, boolean z9) {
        kotlin.jvm.internal.n.h(viewSize, "viewSize");
        kotlin.jvm.internal.n.h(screenSize, "screenSize");
        this.f1126a = viewSize;
        this.f1127b = screenSize;
        this.f1128c = z9;
        this.f1129d = new p167q6.b(this);
        this.f1130e = p079h8.i.b(new p219v8.a() { // from class: D6.q
            @Override // p219v8.a
            public final Object invoke() {
                return t.j(this.f1122q);
            }
        });
        this.f1131f = p079h8.i.b(new p219v8.a() { // from class: D6.r
            @Override // p219v8.a
            public final Object invoke() {
                return t.e(this.f1123q);
            }
        });
        this.f1132g = p079h8.i.b(new p219v8.a() { // from class: D6.s
            @Override // p219v8.a
            public final Object invoke() {
                return t.d(this.f1124q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap d(t tVar) {
        return G6.f.d(tVar.f1127b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap e(t tVar) {
        return tVar.f1128c ? G6.f.d(tVar.f1126a) : G6.f.c(tVar.f1126a);
    }

    private final Bitmap g() {
        return (Bitmap) this.f1132g.getValue();
    }

    private final Bitmap h() {
        return (Bitmap) this.f1131f.getValue();
    }

    private final Bitmap i() {
        return (Bitmap) this.f1130e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap j(t tVar) {
        return tVar.f1128c ? G6.f.d(tVar.f1126a) : G6.f.c(tVar.f1126a);
    }

    public final C6.i f(int i10, int i11, C6.a type) {
        Bitmap bitmapG;
        kotlin.jvm.internal.n.h(type, "type");
        int i12 = b.f1133a[type.ordinal()];
        if (i12 == 1) {
            this.f1129d.a("get: reuse blurBitmapCache");
            bitmapG = g();
        } else if (i12 == 2) {
            this.f1129d.a("get: reuse setterBitmapCache");
            bitmapG = i();
        } else {
            if (i12 != 3) {
                throw new p079h8.m();
            }
            this.f1129d.a("get: reuse depthBitmapCache");
            bitmapG = h();
        }
        return new C6.i(new Point(i10, i11), bitmapG);
    }
}
