package N0;

import androidx.datastore.preferences.protobuf.AbstractC1112w;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1112w implements Q {
    private static final f DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J preferences_ = J.i();

    public static final class a extends AbstractC1112w.a implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a t(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            o();
            ((f) this.f12686r).Q().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final I f5192a = I.d(r0.b.f12576A, "", r0.b.f12578C, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1112w.L(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map Q() {
        return S();
    }

    private J S() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private J T() {
        return this.preferences_;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static f V(InputStream inputStream) {
        return (f) AbstractC1112w.J(DEFAULT_INSTANCE, inputStream);
    }

    public Map R() {
        return Collections.unmodifiableMap(T());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1112w
    protected final Object r(AbstractC1112w.d dVar, Object obj, Object obj2) {
        Y bVar;
        int i10 = e.f5191a[dVar.ordinal()];
        e eVar = null;
        switch (i10) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1112w.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f5192a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y9 = PARSER;
                if (y9 != null) {
                    return y9;
                }
                synchronized (f.class) {
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
