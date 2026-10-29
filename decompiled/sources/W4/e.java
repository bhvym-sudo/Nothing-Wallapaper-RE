package W4;

import U4.f;
import U4.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class e implements U4.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f8667a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8668b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f8669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U4.d f8672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8673g;

    e(Writer writer, Map map, Map map2, U4.d dVar, boolean z9) {
        this.f8669c = new JsonWriter(writer);
        this.f8670d = map;
        this.f8671e = map2;
        this.f8672f = dVar;
        this.f8673g = z9;
    }

    private boolean l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e o(String str, Object obj) throws IOException {
        q();
        this.f8669c.name(str);
        if (obj != null) {
            return f(obj, false);
        }
        this.f8669c.nullValue();
        return this;
    }

    private e p(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        q();
        this.f8669c.name(str);
        return f(obj, false);
    }

    private void q() throws IOException {
        if (!this.f8668b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f8667a;
        if (eVar != null) {
            eVar.q();
            this.f8667a.f8668b = false;
            this.f8667a = null;
            this.f8669c.endObject();
        }
    }

    @Override // U4.e
    public U4.e a(U4.c cVar, long j9) {
        return h(cVar.b(), j9);
    }

    @Override // U4.e
    public U4.e b(U4.c cVar, Object obj) {
        return i(cVar.b(), obj);
    }

    public e e(long j9) throws IOException {
        q();
        this.f8669c.value(j9);
        return this;
    }

    e f(Object obj, boolean z9) {
        if (z9 && l(obj)) {
            throw new U4.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f8669c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f8669c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f8669c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), false);
                }
                this.f8669c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f8669c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new U4.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f8669c.endObject();
                return this;
            }
            U4.d dVar = (U4.d) this.f8670d.get(obj.getClass());
            if (dVar != null) {
                return n(dVar, obj, z9);
            }
            f fVar = (f) this.f8671e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return n(this.f8672f, obj, z9);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        this.f8669c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f8669c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                e(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f8669c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f8669c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                f(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                f(obj2, false);
            }
        }
        this.f8669c.endArray();
        return this;
    }

    @Override // U4.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e c(String str) throws IOException {
        q();
        this.f8669c.value(str);
        return this;
    }

    public e h(String str, long j9) throws IOException {
        q();
        this.f8669c.name(str);
        return e(j9);
    }

    public e i(String str, Object obj) {
        return this.f8673g ? p(str, obj) : o(str, obj);
    }

    @Override // U4.g
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e d(boolean z9) throws IOException {
        q();
        this.f8669c.value(z9);
        return this;
    }

    public e k(byte[] bArr) throws IOException {
        q();
        if (bArr == null) {
            this.f8669c.nullValue();
            return this;
        }
        this.f8669c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void m() {
        q();
        this.f8669c.flush();
    }

    e n(U4.d dVar, Object obj, boolean z9) throws IOException {
        if (!z9) {
            this.f8669c.beginObject();
        }
        dVar.a(obj, this);
        if (!z9) {
            this.f8669c.endObject();
        }
        return this;
    }
}
