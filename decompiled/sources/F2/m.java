package F2;

import android.util.FloatProperty;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FloatProperty f1576g = new a("value");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c[] f1577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f1578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Object f1580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FloatProperty f1581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f1582f;

    class a extends FloatProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c cVar) {
            return Float.valueOf(cVar.f1585c);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(c cVar, float f10) {
            cVar.c(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    public interface b {
        float a(float f10, float f11);
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f1584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1585c;

        c(int i10, float f10) {
            this.f1583a = i10;
            this.f1584b = f10;
            this.f1585c = f10;
        }

        public float b() {
            return this.f1585c;
        }

        public void c(float f10) {
            if (m.this.f1579c != this.f1583a) {
                m.this.f1578b = this.f1584b;
                for (c cVar : m.this.f1577a) {
                    if (cVar.f1583a != this.f1583a) {
                        m mVar = m.this;
                        mVar.f1578b = mVar.f1582f.a(m.this.f1578b, cVar.f1585c);
                    }
                }
                m.this.f1579c = this.f1583a;
            }
            float fA = m.this.f1582f.a(m.this.f1578b, f10);
            this.f1585c = f10;
            m.this.g(fA);
        }

        public String toString() {
            return String.valueOf(this.f1585c);
        }
    }

    public m(Object obj, FloatProperty floatProperty, int i10, b bVar) {
        this(obj, floatProperty, i10, bVar, 0.0f);
    }

    protected void g(float f10) {
        this.f1581e.set(this.f1580d, Float.valueOf(f10));
    }

    public c h(int i10) {
        return this.f1577a[i10];
    }

    public String toString() {
        return Arrays.deepToString(this.f1577a);
    }

    public m(Object obj, FloatProperty floatProperty, int i10, b bVar, float f10) {
        this.f1578b = 0.0f;
        this.f1579c = -1;
        this.f1580d = obj;
        this.f1581e = floatProperty;
        this.f1582f = bVar;
        this.f1577a = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1577a[i11] = new c(i11, f10);
        }
    }
}
