package J;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: J.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0894a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f3396b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0894a f3397c = new C0117a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0894a f3398d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC0894a f3399e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f3400a;

    /* JADX INFO: renamed from: J.a$a, reason: collision with other inner class name */
    public static final class C0117a extends AbstractC0894a {
        C0117a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: J.a$b */
    public static final class b extends AbstractC0894a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: J.a$c */
    public static final class c extends AbstractC0894a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: J.a$d */
    public static final class d {
        public /* synthetic */ d(AbstractC1457h abstractC1457h) {
            this();
        }

        public final AbstractC0894a a() {
            return AbstractC0894a.f3397c;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC0894a(float[] fArr, AbstractC1457h abstractC1457h) {
        this(fArr);
    }

    public final float[] b() {
        return this.f3400a;
    }

    private AbstractC0894a(float[] fArr) {
        this.f3400a = fArr;
    }
}
