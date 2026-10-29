package N0;

import androidx.datastore.preferences.protobuf.AbstractC1097g;
import androidx.datastore.preferences.protobuf.AbstractC1112w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1112w implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC1112w.a implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(long j9) {
            o();
            ((h) this.f12686r).n0(j9);
            return this;
        }

        public a C(String str) {
            o();
            ((h) this.f12686r).o0(str);
            return this;
        }

        public a D(g.a aVar) {
            o();
            ((h) this.f12686r).p0((g) aVar.l());
            return this;
        }

        public a t(boolean z9) {
            o();
            ((h) this.f12686r).i0(z9);
            return this;
        }

        public a v(AbstractC1097g abstractC1097g) {
            o();
            ((h) this.f12686r).j0(abstractC1097g);
            return this;
        }

        public a w(double d10) {
            o();
            ((h) this.f12686r).k0(d10);
            return this;
        }

        public a x(float f10) {
            o();
            ((h) this.f12686r).l0(f10);
            return this;
        }

        public a y(int i10) {
            o();
            ((h) this.f12686r).m0(i10);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f5203q;

        b(int i10) {
            this.f5203q = i10;
        }

        public static b e(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1112w.L(h.class, hVar);
    }

    private h() {
    }

    public static h Z() {
        return DEFAULT_INSTANCE;
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(boolean z9) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(AbstractC1097g abstractC1097g) {
        abstractC1097g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC1097g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(long j9) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC1097g Y() {
        return this.valueCase_ == 8 ? (AbstractC1097g) this.value_ : AbstractC1097g.f12460r;
    }

    public double a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g f0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.S();
    }

    public b g0() {
        return b.e(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1112w
    protected final Object r(AbstractC1112w.d dVar, Object obj, Object obj2) {
        Y bVar;
        int i10 = e.f5191a[dVar.ordinal()];
        e eVar = null;
        switch (i10) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1112w.H(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y9 = PARSER;
                if (y9 != null) {
                    return y9;
                }
                synchronized (h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1112w.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
