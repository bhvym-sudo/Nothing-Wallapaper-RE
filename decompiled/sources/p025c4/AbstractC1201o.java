package p025c4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: c4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1201o {

    /* JADX INFO: renamed from: c4.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f15211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f15212b;

        /* synthetic */ a(Object obj, P p9) {
            AbstractC1202p.i(obj);
            this.f15212b = obj;
            this.f15211a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List list = this.f15211a;
            AbstractC1202p.i(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f15212b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f15211a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f15211a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
