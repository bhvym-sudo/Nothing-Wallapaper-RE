package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f12545a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f12546b = AbstractC1094d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f12547c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f12548d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f12549e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f12550f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f12551g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f12552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f12553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f12554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f12555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f12556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f12557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f12558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f12559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f12560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f12561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f12562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f12563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f12564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f12565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f12566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f12567w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j9) {
            return p0.f12567w ? p0.q(obj, j9) : p0.r(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j9) {
            return Double.longBitsToDouble(g(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j9) {
            return Float.intBitsToFloat(f(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j9, boolean z9) {
            if (p0.f12567w) {
                p0.F(obj, j9, z9);
            } else {
                p0.G(obj, j9, z9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j9, byte b10) {
            if (p0.f12567w) {
                p0.I(obj, j9, b10);
            } else {
                p0.J(obj, j9, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j9, double d10) {
            o(obj, j9, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j9, float f10) {
            n(obj, j9, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j9) {
            return p0.f12567w ? p0.q(obj, j9) : p0.r(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j9) {
            return Double.longBitsToDouble(g(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j9) {
            return Float.intBitsToFloat(f(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j9, boolean z9) {
            if (p0.f12567w) {
                p0.F(obj, j9, z9);
            } else {
                p0.G(obj, j9, z9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j9, byte b10) {
            if (p0.f12567w) {
                p0.I(obj, j9, b10);
            } else {
                p0.J(obj, j9, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j9, double d10) {
            o(obj, j9, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j9, float f10) {
            n(obj, j9, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j9) {
            return this.f12568a.getBoolean(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double d(Object obj, long j9) {
            return this.f12568a.getDouble(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float e(Object obj, long j9) {
            return this.f12568a.getFloat(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void j(Object obj, long j9, boolean z9) {
            this.f12568a.putBoolean(obj, j9, z9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j9, byte b10) {
            this.f12568a.putByte(obj, j9, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j9, double d10) {
            this.f12568a.putDouble(obj, j9, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j9, float f10) {
            this.f12568a.putFloat(obj, j9, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f12568a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f12568a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f12568a;

        e(Unsafe unsafe) {
            this.f12568a = unsafe;
        }

        public final int a(Class cls) {
            return this.f12568a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f12568a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j9);

        public abstract double d(Object obj, long j9);

        public abstract float e(Object obj, long j9);

        public final int f(Object obj, long j9) {
            return this.f12568a.getInt(obj, j9);
        }

        public final long g(Object obj, long j9) {
            return this.f12568a.getLong(obj, j9);
        }

        public final Object h(Object obj, long j9) {
            return this.f12568a.getObject(obj, j9);
        }

        public final long i(Field field) {
            return this.f12568a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j9, boolean z9);

        public abstract void k(Object obj, long j9, byte b10);

        public abstract void l(Object obj, long j9, double d10);

        public abstract void m(Object obj, long j9, float f10);

        public final void n(Object obj, long j9, int i10) {
            this.f12568a.putInt(obj, j9, i10);
        }

        public final void o(Object obj, long j9, long j10) {
            this.f12568a.putLong(obj, j9, j10);
        }

        public final void p(Object obj, long j9, Object obj2) {
            this.f12568a.putObject(obj, j9, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f12568a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f12568a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p0.l() != null;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }
    }

    static {
        long j9 = j(byte[].class);
        f12552h = j9;
        f12553i = j(boolean[].class);
        f12554j = k(boolean[].class);
        f12555k = j(int[].class);
        f12556l = k(int[].class);
        f12557m = j(long[].class);
        f12558n = k(long[].class);
        f12559o = j(float[].class);
        f12560p = k(float[].class);
        f12561q = j(double[].class);
        f12562r = k(double[].class);
        f12563s = j(Object[].class);
        f12564t = k(Object[].class);
        f12565u = o(l());
        f12566v = (int) (j9 & 7);
        f12567w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f12551g;
    }

    static boolean C() {
        return f12550f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j9, boolean z9) {
        f12549e.j(obj, j9, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j9, boolean z9) {
        I(obj, j9, z9 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j9, boolean z9) {
        J(obj, j9, z9 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j9, byte b10) {
        f12549e.k(bArr, f12552h + j9, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j9, byte b10) {
        long j10 = (-4) & j9;
        int iW = w(obj, j10);
        int i10 = ((~((int) j9)) & 3) << 3;
        M(obj, j10, ((255 & b10) << i10) | (iW & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j9, byte b10) {
        long j10 = (-4) & j9;
        int i10 = (((int) j9) & 3) << 3;
        M(obj, j10, ((255 & b10) << i10) | (w(obj, j10) & (~(255 << i10))));
    }

    static void K(Object obj, long j9, double d10) {
        f12549e.l(obj, j9, d10);
    }

    static void L(Object obj, long j9, float f10) {
        f12549e.m(obj, j9, f10);
    }

    static void M(Object obj, long j9, int i10) {
        f12549e.n(obj, j9, i10);
    }

    static void N(Object obj, long j9, long j10) {
        f12549e.o(obj, j9, j10);
    }

    static void O(Object obj, long j9, Object obj2) {
        f12549e.p(obj, j9, obj2);
    }

    private static boolean P() {
        e eVar = f12549e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f12549e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f12545a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f12551g) {
            return f12549e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f12551g) {
            return f12549e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (AbstractC1094d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class cls) {
        if (!AbstractC1094d.c()) {
            return false;
        }
        try {
            Class cls2 = f12546b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f12549e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j9) {
        return f12549e.c(obj, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j9) {
        return s(obj, j9) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j9) {
        return t(obj, j9) != 0;
    }

    private static byte s(Object obj, long j9) {
        return (byte) ((w(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j9) {
        return (byte) ((w(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j9) {
        return f12549e.d(obj, j9);
    }

    static float v(Object obj, long j9) {
        return f12549e.e(obj, j9);
    }

    static int w(Object obj, long j9) {
        return f12549e.f(obj, j9);
    }

    static long x(Object obj, long j9) {
        return f12549e.g(obj, j9);
    }

    private static e y() {
        Unsafe unsafe = f12545a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1094d.c()) {
            return new d(unsafe);
        }
        if (f12547c) {
            return new c(unsafe);
        }
        if (f12548d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j9) {
        return f12549e.h(obj, j9);
    }
}
