package W;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f8411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0969k f8412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8413c;

    public H(B b10, C0969k c0969k, List list) {
        this.f8411a = b10;
        this.f8412b = c0969k;
        this.f8413c = list;
    }

    private final boolean b(B b10) {
        Object obj;
        B bY = b10.Y();
        Object obj2 = null;
        B.e eVarI = bY != null ? bY.I() : null;
        if (b10.c() || (b10.Z() != Integer.MAX_VALUE && bY != null && bY.c())) {
            if (b10.P()) {
                List list = this.f8413c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i10);
                    L.a aVar = (L.a) obj;
                    if (kotlin.jvm.internal.n.d(aVar.a(), b10) && !aVar.c()) {
                        break;
                    }
                    i10++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (b10.P()) {
                return this.f8412b.d(b10) || b10.I() == B.e.LookaheadMeasuring || (bY != null && bY.P()) || ((bY != null && bY.K()) || eVarI == B.e.Measuring);
            }
            if (b10.H()) {
                return this.f8412b.d(b10) || bY == null || bY.P() || bY.H() || eVarI == B.e.Measuring || eVarI == B.e.LayingOut;
            }
        }
        if (kotlin.jvm.internal.n.d(b10.w0(), Boolean.TRUE)) {
            if (b10.K()) {
                List list2 = this.f8413c;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj3 = list2.get(i11);
                    L.a aVar2 = (L.a) obj3;
                    if (kotlin.jvm.internal.n.d(aVar2.a(), b10) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (b10.K()) {
                return this.f8412b.e(b10, true) || (bY != null && bY.K()) || eVarI == B.e.LookaheadMeasuring || (bY != null && bY.P() && kotlin.jvm.internal.n.d(b10.M(), b10));
            }
            if (b10.J() && !this.f8412b.e(b10, true) && bY != null && !bY.K() && !bY.J() && eVarI != B.e.LookaheadMeasuring && eVarI != B.e.LookaheadLayingOut && (!bY.H() || !kotlin.jvm.internal.n.d(b10.M(), b10))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(B b10) {
        if (!b(b10)) {
            return false;
        }
        List listX = b10.x();
        int size = listX.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c((B) listX.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        kotlin.jvm.internal.n.g(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.n.g(sb, "append('\\n')");
        e(this, sb, this.f8411a, 0);
        return sb.toString();
    }

    private static final void e(H h10, StringBuilder sb, B b10, int i10) {
        String strF = h10.f(b10);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append("..");
            }
            sb.append(strF);
            kotlin.jvm.internal.n.g(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.n.g(sb, "append('\\n')");
            i10++;
        }
        List listX = b10.x();
        int size = listX.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(h10, sb, (B) listX.get(i12), i10);
        }
    }

    private final String f(B b10) {
        StringBuilder sb = new StringBuilder();
        sb.append(b10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(b10.I());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!b10.c()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + b10.R() + ']');
        if (!b(b10)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void a() {
        if (c(this.f8411a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
