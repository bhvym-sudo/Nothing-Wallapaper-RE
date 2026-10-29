package N0;

import androidx.datastore.preferences.protobuf.AbstractC1091a;
import androidx.datastore.preferences.protobuf.AbstractC1112w;
import androidx.datastore.preferences.protobuf.AbstractC1114y;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1112w implements Q {
    private static final g DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1114y.b strings_ = AbstractC1112w.s();

    public static final class a extends AbstractC1112w.a implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a t(Iterable iterable) {
            o();
            ((g) this.f12686r).Q(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1112w.L(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(Iterable iterable) {
        R();
        AbstractC1091a.a(iterable, this.strings_);
    }

    private void R() {
        AbstractC1114y.b bVar = this.strings_;
        if (bVar.l()) {
            return;
        }
        this.strings_ = AbstractC1112w.F(bVar);
    }

    public static g S() {
        return DEFAULT_INSTANCE;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public List T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1112w
    protected final Object r(AbstractC1112w.d dVar, Object obj, Object obj2) {
        Y bVar;
        int i10 = e.f5191a[dVar.ordinal()];
        e eVar = null;
        switch (i10) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1112w.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y9 = PARSER;
                if (y9 != null) {
                    return y9;
                }
                synchronized (g.class) {
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
