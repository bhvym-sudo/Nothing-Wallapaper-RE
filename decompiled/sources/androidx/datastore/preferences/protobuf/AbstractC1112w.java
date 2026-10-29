package androidx.datastore.preferences.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1112w extends AbstractC1091a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1112w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends AbstractC1091a.AbstractC0384a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final AbstractC1112w f12685q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        protected AbstractC1112w f12686r;

        protected a(AbstractC1112w abstractC1112w) {
            this.f12685q = abstractC1112w;
            if (abstractC1112w.C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f12686r = s();
        }

        private static void r(Object obj, Object obj2) {
            b0.a().d(obj).a(obj, obj2);
        }

        private AbstractC1112w s() {
            return this.f12685q.I();
        }

        public final AbstractC1112w l() {
            AbstractC1112w abstractC1112wZ = z();
            if (abstractC1112wZ.A()) {
                return abstractC1112wZ;
            }
            throw AbstractC1091a.AbstractC0384a.k(abstractC1112wZ);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AbstractC1112w z() {
            if (!this.f12686r.C()) {
                return this.f12686r;
            }
            this.f12686r.D();
            return this.f12686r;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarH = c().h();
            aVarH.f12686r = z();
            return aVarH;
        }

        protected final void o() {
            if (this.f12686r.C()) {
                return;
            }
            p();
        }

        protected void p() {
            AbstractC1112w abstractC1112wS = s();
            r(abstractC1112wS, this.f12686r);
            this.f12686r = abstractC1112wS;
        }

        @Override // androidx.datastore.preferences.protobuf.Q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractC1112w c() {
            return this.f12685q;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$b */
    protected static class b extends AbstractC1092b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1112w f12687b;

        public b(AbstractC1112w abstractC1112w) {
            this.f12687b = abstractC1112w;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends AbstractC1103m {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final boolean B(AbstractC1112w abstractC1112w, boolean z9) {
        byte bByteValue = ((Byte) abstractC1112w.p(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = b0.a().d(abstractC1112w).d(abstractC1112w);
        if (z9) {
            abstractC1112w.q(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC1112w : null);
        }
        return zD;
    }

    protected static AbstractC1114y.b F(AbstractC1114y.b bVar) {
        int size = bVar.size();
        return bVar.d(size == 0 ? 10 : size * 2);
    }

    protected static Object H(P p9, String str, Object[] objArr) {
        return new d0(p9, str, objArr);
    }

    protected static AbstractC1112w J(AbstractC1112w abstractC1112w, InputStream inputStream) {
        return j(K(abstractC1112w, AbstractC1098h.g(inputStream), C1105o.b()));
    }

    static AbstractC1112w K(AbstractC1112w abstractC1112w, AbstractC1098h abstractC1098h, C1105o c1105o) throws C1115z {
        AbstractC1112w abstractC1112wI = abstractC1112w.I();
        try {
            f0 f0VarD = b0.a().d(abstractC1112wI);
            f0VarD.b(abstractC1112wI, C1099i.N(abstractC1098h), c1105o);
            f0VarD.c(abstractC1112wI);
            return abstractC1112wI;
        } catch (l0 e10) {
            throw e10.a().k(abstractC1112wI);
        } catch (C1115z e11) {
            e = e11;
            if (e.a()) {
                e = new C1115z(e);
            }
            throw e.k(abstractC1112wI);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1115z) {
                throw ((C1115z) e12.getCause());
            }
            throw new C1115z(e12).k(abstractC1112wI);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C1115z) {
                throw ((C1115z) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void L(Class cls, AbstractC1112w abstractC1112w) {
        abstractC1112w.E();
        defaultInstanceMap.put(cls, abstractC1112w);
    }

    private static AbstractC1112w j(AbstractC1112w abstractC1112w) throws C1115z {
        if (abstractC1112w == null || abstractC1112w.A()) {
            return abstractC1112w;
        }
        throw abstractC1112w.f().a().k(abstractC1112w);
    }

    private int n(f0 f0Var) {
        return f0Var == null ? b0.a().d(this).g(this) : f0Var.g(this);
    }

    protected static AbstractC1114y.b s() {
        return c0.e();
    }

    static AbstractC1112w t(Class cls) {
        AbstractC1112w abstractC1112w = defaultInstanceMap.get(cls);
        if (abstractC1112w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1112w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1112w != null) {
            return abstractC1112w;
        }
        AbstractC1112w abstractC1112wC = ((AbstractC1112w) p0.i(cls)).c();
        if (abstractC1112wC == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1112wC);
        return abstractC1112wC;
    }

    static Object y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean A() {
        return B(this, true);
    }

    boolean C() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void D() {
        b0.a().d(this).c(this);
        E();
    }

    void E() {
        this.memoizedSerializedSize &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a h() {
        return (a) p(d.NEW_BUILDER);
    }

    AbstractC1112w I() {
        return (AbstractC1112w) p(d.NEW_MUTABLE_INSTANCE);
    }

    void M(int i10) {
        this.memoizedHashCode = i10;
    }

    void N(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & SubsamplingScaleImageView.TILE_SIZE_AUTO) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1091a
    int b(f0 f0Var) {
        if (!C()) {
            if (w() != Integer.MAX_VALUE) {
                return w();
            }
            int iN = n(f0Var);
            N(iN);
            return iN;
        }
        int iN2 = n(f0Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public int d() {
        return b(null);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public void e(AbstractC1100j abstractC1100j) {
        b0.a().d(this).e(this, C1101k.P(abstractC1100j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).f(this, (AbstractC1112w) obj);
        }
        return false;
    }

    public int hashCode() {
        if (C()) {
            return m();
        }
        if (x()) {
            M(m());
        }
        return v();
    }

    Object i() {
        return p(d.BUILD_MESSAGE_INFO);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        N(SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    int m() {
        return b0.a().d(this).i(this);
    }

    protected final a o() {
        return (a) p(d.NEW_BUILDER);
    }

    protected Object p(d dVar) {
        return r(dVar, null, null);
    }

    protected Object q(d dVar, Object obj) {
        return r(dVar, obj, null);
    }

    protected abstract Object r(d dVar, Object obj, Object obj2);

    public String toString() {
        return S.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC1112w c() {
        return (AbstractC1112w) p(d.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    int w() {
        return this.memoizedSerializedSize & SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    boolean x() {
        return v() == 0;
    }
}
