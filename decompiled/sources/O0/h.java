package O0;

import L0.A;
import L0.C0927d;
import androidx.datastore.preferences.protobuf.AbstractC1097g;
import androidx.datastore.preferences.protobuf.AbstractC1112w;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import p079h8.m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class h implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5745a = new h();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5746a;

        static {
            int[] iArr = new int[N0.h.b.values().length];
            try {
                iArr[N0.h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N0.h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[N0.h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[N0.h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[N0.h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[N0.h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[N0.h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5746a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, N0.h hVar, c cVar) throws C0927d {
        N0.h.b bVarG0 = hVar.g0();
        switch (bVarG0 == null ? -1 : a.f5746a[bVarG0.ordinal()]) {
            case -1:
                throw new C0927d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new m();
            case 1:
                cVar.i(i.a(str), Boolean.valueOf(hVar.X()));
                return;
            case 2:
                cVar.i(i.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.i(i.c(str), Double.valueOf(hVar.a0()));
                return;
            case 4:
                cVar.i(i.e(str), Integer.valueOf(hVar.c0()));
                return;
            case 5:
                cVar.i(i.f(str), Long.valueOf(hVar.d0()));
                return;
            case 6:
                f.a aVarG = i.g(str);
                String strE0 = hVar.e0();
                n.g(strE0, "value.string");
                cVar.i(aVarG, strE0);
                return;
            case 7:
                f.a aVarH = i.h(str);
                List listT = hVar.f0().T();
                n.g(listT, "value.stringSet.stringsList");
                cVar.i(aVarH, AbstractC1444s.w0(listT));
                return;
            case 8:
                f.a aVarB = i.b(str);
                byte[] bArrT = hVar.Y().t();
                n.g(bArrT, "value.bytes.toByteArray()");
                cVar.i(aVarB, bArrT);
                return;
            case 9:
                throw new C0927d("Value not set.", null, 2, null);
        }
    }

    private final N0.h f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC1112w abstractC1112wL = N0.h.h0().t(((Boolean) obj).booleanValue()).l();
            n.g(abstractC1112wL, "newBuilder().setBoolean(value).build()");
            return (N0.h) abstractC1112wL;
        }
        if (obj instanceof Float) {
            AbstractC1112w abstractC1112wL2 = N0.h.h0().x(((Number) obj).floatValue()).l();
            n.g(abstractC1112wL2, "newBuilder().setFloat(value).build()");
            return (N0.h) abstractC1112wL2;
        }
        if (obj instanceof Double) {
            AbstractC1112w abstractC1112wL3 = N0.h.h0().w(((Number) obj).doubleValue()).l();
            n.g(abstractC1112wL3, "newBuilder().setDouble(value).build()");
            return (N0.h) abstractC1112wL3;
        }
        if (obj instanceof Integer) {
            AbstractC1112w abstractC1112wL4 = N0.h.h0().y(((Number) obj).intValue()).l();
            n.g(abstractC1112wL4, "newBuilder().setInteger(value).build()");
            return (N0.h) abstractC1112wL4;
        }
        if (obj instanceof Long) {
            AbstractC1112w abstractC1112wL5 = N0.h.h0().A(((Number) obj).longValue()).l();
            n.g(abstractC1112wL5, "newBuilder().setLong(value).build()");
            return (N0.h) abstractC1112wL5;
        }
        if (obj instanceof String) {
            AbstractC1112w abstractC1112wL6 = N0.h.h0().C((String) obj).l();
            n.g(abstractC1112wL6, "newBuilder().setString(value).build()");
            return (N0.h) abstractC1112wL6;
        }
        if (obj instanceof Set) {
            N0.h.a aVarH0 = N0.h.h0();
            N0.g.a aVarU = N0.g.U();
            n.f(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC1112w abstractC1112wL7 = aVarH0.D(aVarU.t((Set) obj)).l();
            n.g(abstractC1112wL7, "newBuilder()\n           …                 .build()");
            return (N0.h) abstractC1112wL7;
        }
        if (obj instanceof byte[]) {
            AbstractC1112w abstractC1112wL8 = N0.h.h0().v(AbstractC1097g.g((byte[]) obj)).l();
            n.g(abstractC1112wL8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (N0.h) abstractC1112wL8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // L0.A
    public Object c(InputStream inputStream, p129m8.e eVar) throws C0927d {
        N0.f fVarA = N0.d.f5190a.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map mapR = fVarA.R();
        n.g(mapR, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapR.entrySet()) {
            String name = (String) entry.getKey();
            N0.h value = (N0.h) entry.getValue();
            h hVar = f5745a;
            n.g(name, "name");
            n.g(value, "value");
            hVar.d(name, value, cVarB);
        }
        return cVarB.d();
    }

    @Override // L0.A
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a() {
        return g.a();
    }

    @Override // L0.A
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object b(f fVar, OutputStream outputStream, p129m8.e eVar) {
        Map mapA = fVar.a();
        N0.f.a aVarU = N0.f.U();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarU.t(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((N0.f) aVarU.l()).g(outputStream);
        return p079h8.A.f21846a;
    }
}
