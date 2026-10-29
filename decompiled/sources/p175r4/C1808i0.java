package p175r4;

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

/* JADX INFO: renamed from: r4.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1808i0 implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f26721f = Charset.forName(Key.STRING_CHARSET_NAME);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f26722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f26723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f26724i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f26725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f26728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1850m0 f26729e = new C1850m0(this);

    static {
        c.b bVarA = c.a("key");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26722g = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("value");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26723h = bVarA2.b(c1731b1.b()).a();
        f26724i = new d() { // from class: r4.h0
            @Override // U4.d
            public final void a(Object obj, Object obj2) {
                C1808i0.i((Map.Entry) obj, (e) obj2);
            }
        };
    }

    C1808i0(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.f26725a = outputStream;
        this.f26726b = map;
        this.f26727c = map2;
        this.f26728d = dVar;
    }

    static /* synthetic */ void i(Map.Entry entry, e eVar) {
        eVar.b(f26722g, entry.getKey());
        eVar.b(f26723h, entry.getValue());
    }

    private static int j(c cVar) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) cVar.c(InterfaceC1786g0.class);
        if (interfaceC1786g0 != null) {
            return interfaceC1786g0.zza();
        }
        throw new b("Field has no @Protobuf config");
    }

    private final long k(d dVar, Object obj) throws IOException {
        C1753d0 c1753d0 = new C1753d0();
        try {
            OutputStream outputStream = this.f26725a;
            this.f26725a = c1753d0;
            try {
                dVar.a(obj, this);
                this.f26725a = outputStream;
                long jA = c1753d0.a();
                c1753d0.close();
                return jA;
            } catch (Throwable th) {
                this.f26725a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1753d0.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC1786g0 l(c cVar) {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) cVar.c(InterfaceC1786g0.class);
        if (interfaceC1786g0 != null) {
            return interfaceC1786g0;
        }
        throw new b("Field has no @Protobuf config");
    }

    private final C1808i0 m(d dVar, c cVar, Object obj, boolean z9) throws IOException {
        long jK = k(dVar, obj);
        if (z9 && jK == 0) {
            return this;
        }
        p((j(cVar) << 3) | 2);
        q(jK);
        dVar.a(obj, this);
        return this;
    }

    private final C1808i0 n(f fVar, c cVar, Object obj, boolean z9) {
        this.f26729e.a(cVar, z9);
        fVar.a(obj, this.f26729e);
        return this;
    }

    private static ByteBuffer o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i10) throws IOException {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.f26725a.write(i11);
                return;
            } else {
                this.f26725a.write(i11 | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                i10 >>>= 7;
            }
        }
    }

    private final void q(long j9) throws IOException {
        while (true) {
            int i10 = ((int) j9) & 127;
            if (((-128) & j9) == 0) {
                this.f26725a.write(i10);
                return;
            } else {
                this.f26725a.write(i10 | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                j9 >>>= 7;
            }
        }
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
        this.f26725a.write(o(8).putDouble(d10).array());
        return this;
    }

    final e d(c cVar, float f10, boolean z9) throws IOException {
        if (z9 && f10 == 0.0f) {
            return this;
        }
        p((j(cVar) << 3) | 5);
        this.f26725a.write(o(4).putFloat(f10).array());
        return this;
    }

    final e e(c cVar, Object obj, boolean z9) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    p((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f26721f);
                    p(bytes.length);
                    this.f26725a.write(bytes);
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
                    m(f26724i, cVar, (Map.Entry) it2.next(), false);
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
                    d dVar = (d) this.f26726b.get(obj.getClass());
                    if (dVar != null) {
                        m(dVar, cVar, obj, z9);
                        return this;
                    }
                    f fVar = (f) this.f26727c.get(obj.getClass());
                    if (fVar != null) {
                        n(fVar, cVar, obj, z9);
                        return this;
                    }
                    if (obj instanceof InterfaceC1764e0) {
                        f(cVar, ((InterfaceC1764e0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        f(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m(this.f26728d, cVar, obj, z9);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z9 || bArr.length != 0) {
                    p((j(cVar) << 3) | 2);
                    p(bArr.length);
                    this.f26725a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C1808i0 f(c cVar, int i10, boolean z9) throws IOException {
        if (!z9 || i10 != 0) {
            InterfaceC1786g0 interfaceC1786g0L = l(cVar);
            EnumC1775f0 enumC1775f0 = EnumC1775f0.DEFAULT;
            int iOrdinal = interfaceC1786g0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(interfaceC1786g0L.zza() << 3);
                p(i10);
                return this;
            }
            if (iOrdinal == 1) {
                p(interfaceC1786g0L.zza() << 3);
                p((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                p((interfaceC1786g0L.zza() << 3) | 5);
                this.f26725a.write(o(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final C1808i0 g(c cVar, long j9, boolean z9) throws IOException {
        if (!z9 || j9 != 0) {
            InterfaceC1786g0 interfaceC1786g0L = l(cVar);
            EnumC1775f0 enumC1775f0 = EnumC1775f0.DEFAULT;
            int iOrdinal = interfaceC1786g0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(interfaceC1786g0L.zza() << 3);
                q(j9);
                return this;
            }
            if (iOrdinal == 1) {
                p(interfaceC1786g0L.zza() << 3);
                q((j9 >> 63) ^ (j9 + j9));
                return this;
            }
            if (iOrdinal == 2) {
                p((interfaceC1786g0L.zza() << 3) | 1);
                this.f26725a.write(o(8).putLong(j9).array());
                return this;
            }
        }
        return this;
    }

    final C1808i0 h(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.f26726b.get(obj.getClass());
        if (dVar == null) {
            throw new b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
