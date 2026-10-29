package P0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.H;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements P0.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f5979m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f5980n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f5981o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f5982p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f5983q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f5984r = new l(Key.ROTATION);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f5985s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f5986t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f5987u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f5988v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f5989w = new C0203b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f5990x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f5991y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f5992z = new e("scrollY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final P0.c f5997e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f5993a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f5994b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f5995c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f5998f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f5999g = Float.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f6000h = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6001i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f6003k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f6004l = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f5996d = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6002j = 1.0f;

    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: P0.b$b, reason: collision with other inner class name */
    static class C0203b extends s {
        C0203b(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return H.G(view);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            H.C0(view, f10);
        }
    }

    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    class f extends P0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P0.d f6005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, P0.d dVar) {
            super(str);
            this.f6005b = dVar;
        }

        @Override // P0.c
        public float a(Object obj) {
            return this.f6005b.a();
        }

        @Override // P0.c
        public void b(Object obj, float f10) {
            this.f6005b.b(f10);
        }
    }

    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return H.D(view);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            H.A0(view, f10);
        }
    }

    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // P0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // P0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f6007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f6008b;

        p() {
        }
    }

    public interface q {
        void a(b bVar, boolean z9, float f10, float f11);
    }

    public interface r {
        void b(b bVar, float f10, float f11);
    }

    public static abstract class s extends P0.c {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    b(P0.d dVar) {
        this.f5997e = new f("FloatValueHolder", dVar);
    }

    private void c(boolean z9) {
        this.f5998f = false;
        P0.a.d().g(this);
        this.f6001i = 0L;
        this.f5995c = false;
        for (int i10 = 0; i10 < this.f6003k.size(); i10++) {
            if (this.f6003k.get(i10) != null) {
                ((q) this.f6003k.get(i10)).a(this, z9, this.f5994b, this.f5993a);
            }
        }
        g(this.f6003k);
    }

    private float d() {
        return this.f5997e.a(this.f5996d);
    }

    private static void g(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void p() {
        if (this.f5998f) {
            return;
        }
        this.f5998f = true;
        if (!this.f5995c) {
            this.f5994b = d();
        }
        float f10 = this.f5994b;
        if (f10 > this.f5999g || f10 < this.f6000h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        P0.a.d().a(this, 0L);
    }

    public b a(q qVar) {
        if (!this.f6003k.contains(qVar)) {
            this.f6003k.add(qVar);
        }
        return this;
    }

    public b b(r rVar) {
        if (f()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f6004l.contains(rVar)) {
            this.f6004l.add(rVar);
        }
        return this;
    }

    @Override // P0.a.b
    public boolean doAnimationFrame(long j9) {
        long j10 = this.f6001i;
        if (j10 == 0) {
            this.f6001i = j9;
            k(this.f5994b);
            return false;
        }
        this.f6001i = j9;
        boolean zQ = q(j9 - j10);
        float fMin = Math.min(this.f5994b, this.f5999g);
        this.f5994b = fMin;
        float fMax = Math.max(fMin, this.f6000h);
        this.f5994b = fMax;
        k(fMax);
        if (zQ) {
            c(false);
        }
        return zQ;
    }

    float e() {
        return this.f6002j * 0.75f;
    }

    public boolean f() {
        return this.f5998f;
    }

    public b h(float f10) {
        this.f5999g = f10;
        return this;
    }

    public b i(float f10) {
        this.f6000h = f10;
        return this;
    }

    public b j(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f6002j = f10;
        n(f10 * 0.75f);
        return this;
    }

    void k(float f10) {
        this.f5997e.b(this.f5996d, f10);
        for (int i10 = 0; i10 < this.f6004l.size(); i10++) {
            if (this.f6004l.get(i10) != null) {
                ((r) this.f6004l.get(i10)).b(this, this.f5994b, this.f5993a);
            }
        }
        g(this.f6004l);
    }

    public b l(float f10) {
        this.f5994b = f10;
        this.f5995c = true;
        return this;
    }

    public b m(float f10) {
        this.f5993a = f10;
        return this;
    }

    abstract void n(float f10);

    public void o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f5998f) {
            return;
        }
        p();
    }

    abstract boolean q(long j9);
}
