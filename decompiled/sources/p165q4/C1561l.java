package p165q4;

import U4.b;
import U4.c;
import U4.d;
import U4.e;
import U4.f;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: q4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1561l implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f24626f = Charset.forName(Key.STRING_CHARSET_NAME);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f24627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f24628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f24629i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f24630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f24632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f24633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1589p f24634e = new C1589p(this);

    static {
        c.b bVarA = c.a("key");
        C1519f c1519f = new C1519f();
        c1519f.a(1);
        f24627g = bVarA.b(c1519f.b()).a();
        c.b bVarA2 = c.a("value");
        C1519f c1519f2 = new C1519f();
        c1519f2.a(2);
        f24628h = bVarA2.b(c1519f2.b()).a();
        f24629i = new d() { // from class: q4.k
            @Override // U4.d
            public final void a(Object obj, Object obj2) {
                C1561l.i((Map.Entry) obj, (e) obj2);
            }
        };
    }

    C1561l(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.f24630a = outputStream;
        this.f24631b = map;
        this.f24632c = map2;
        this.f24633d = dVar;
    }

    static /* synthetic */ void i(Map.Entry entry, e eVar) {
        eVar.b(f24627g, entry.getKey());
        eVar.b(f24628h, entry.getValue());
    }

    private static int j(c cVar) {
        InterfaceC1547j interfaceC1547j = (InterfaceC1547j) cVar.c(InterfaceC1547j.class);
        if (interfaceC1547j != null) {
            return interfaceC1547j.zza();
        }
        throw new b("Field has no @Protobuf config");
    }

    private final long k(d dVar, Object obj) throws IOException {
        C1526g c1526g = new C1526g();
        try {
            OutputStream outputStream = this.f24630a;
            this.f24630a = c1526g;
            try {
                dVar.a(obj, this);
                this.f24630a = outputStream;
                long jA = c1526g.a();
                c1526g.close();
                return jA;
            } catch (Throwable th) {
                this.f24630a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1526g.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC1547j l(c cVar) {
        InterfaceC1547j interfaceC1547j = (InterfaceC1547j) cVar.c(InterfaceC1547j.class);
        if (interfaceC1547j != null) {
            return interfaceC1547j;
        }
        throw new b("Field has no @Protobuf config");
    }

    private final C1561l m(d dVar, c cVar, Object obj, boolean z9) throws IOException {
        long jK = k(dVar, obj);
        if (z9 && jK == 0) {
            return this;
        }
        p((j(cVar) << 3) | 2);
        q(jK);
        dVar.a(obj, this);
        return this;
    }

    private final C1561l n(f fVar, c cVar, Object obj, boolean z9) {
        this.f24634e.a(cVar, z9);
        fVar.a(obj, this.f24634e);
        return this;
    }

    private static ByteBuffer o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f24630a.write((i10 & 127) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
            i10 >>>= 7;
        }
        this.f24630a.write(i10 & 127);
    }

    private final void q(long j9) throws IOException {
        while (((-128) & j9) != 0) {
            this.f24630a.write((((int) j9) & 127) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
            j9 >>>= 7;
        }
        this.f24630a.write(((int) j9) & 127);
    }

    @Override // U4.e
    public final /* synthetic */ e a(c cVar, long j9) throws IOException {
        g(cVar, j9, true);
        return this;
    }

    @Override // U4.e
    public final e b(c cVar, Object obj) throws IOException {
        e(cVar, obj, true);
        return this;
    }

    final e c(c cVar, double d10, boolean z9) throws IOException {
        if (z9 && d10 == 0.0d) {
            return this;
        }
        p((j(cVar) << 3) | 1);
        this.f24630a.write(o(8).putDouble(d10).array());
        return this;
    }

    final e d(c cVar, float f10, boolean z9) throws IOException {
        if (z9 && f10 == 0.0f) {
            return this;
        }
        p((j(cVar) << 3) | 5);
        this.f24630a.write(o(4).putFloat(f10).array());
        return this;
    }

    final e e(c cVar, Object obj, boolean z9) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    p((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f24626f);
                    p(bytes.length);
                    this.f24630a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m(f24629i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    c(cVar, ((Double) obj).doubleValue(), z9);
                    return this;
                }
                if (obj instanceof Float) {
                    d(cVar, ((Float) obj).floatValue(), z9);
                    return this;
                }
                if (obj instanceof Number) {
                    g(cVar, ((Number) obj).longValue(), z9);
                    return this;
                }
                if (obj instanceof Boolean) {
                    f(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    d dVar = (d) this.f24631b.get(obj.getClass());
                    if (dVar != null) {
                        m(dVar, cVar, obj, z9);
                        return this;
                    }
                    f fVar = (f) this.f24632c.get(obj.getClass());
                    if (fVar != null) {
                        n(fVar, cVar, obj, z9);
                        return this;
                    }
                    if (obj instanceof InterfaceC1533h) {
                        f(cVar, ((InterfaceC1533h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        f(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m(this.f24633d, cVar, obj, z9);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z9 || bArr.length != 0) {
                    p((j(cVar) << 3) | 2);
                    p(bArr.length);
                    this.f24630a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C1561l f(c cVar, int i10, boolean z9) throws IOException {
        if (!z9 || i10 != 0) {
            InterfaceC1547j interfaceC1547jL = l(cVar);
            EnumC1540i enumC1540i = EnumC1540i.DEFAULT;
            int iOrdinal = interfaceC1547jL.zzb().ordinal();
            if (iOrdinal == 0) {
                p(interfaceC1547jL.zza() << 3);
                p(i10);
                return this;
            }
            if (iOrdinal == 1) {
                p(interfaceC1547jL.zza() << 3);
                p((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                p((interfaceC1547jL.zza() << 3) | 5);
                this.f24630a.write(o(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final C1561l g(c cVar, long j9, boolean z9) throws IOException {
        if (!z9 || j9 != 0) {
            InterfaceC1547j interfaceC1547jL = l(cVar);
            EnumC1540i enumC1540i = EnumC1540i.DEFAULT;
            int iOrdinal = interfaceC1547jL.zzb().ordinal();
            if (iOrdinal == 0) {
                p(interfaceC1547jL.zza() << 3);
                q(j9);
                return this;
            }
            if (iOrdinal == 1) {
                p(interfaceC1547jL.zza() << 3);
                q((j9 >> 63) ^ (j9 + j9));
                return this;
            }
            if (iOrdinal == 2) {
                p((interfaceC1547jL.zza() << 3) | 1);
                this.f24630a.write(o(8).putLong(j9).array());
                return this;
            }
        }
        return this;
    }

    final C1561l h(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.f24631b.get(obj.getClass());
        if (dVar == null) {
            throw new b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
