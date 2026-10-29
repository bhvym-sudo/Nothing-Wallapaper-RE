package p142o1;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0596a f23329s = new C0596a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f23330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object[] f23331r;

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    public static final class C0596a {
        public /* synthetic */ C0596a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.x0(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.a0(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.C(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.C(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.P(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.P(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.P(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.P(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.r(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.P(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            n.h(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        private C0596a() {
        }
    }

    public a(String query, Object[] objArr) {
        n.h(query, "query");
        this.f23330q = query;
        this.f23331r = objArr;
    }

    @Override // p142o1.j
    public String a() {
        return this.f23330q;
    }

    @Override // p142o1.j
    public void b(i statement) {
        n.h(statement, "statement");
        f23329s.b(statement, this.f23331r);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        n.h(query, "query");
    }
}
