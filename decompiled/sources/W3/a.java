package W3;

import K3.d;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f8652a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f8653b;

    static {
        HashMap map = new HashMap();
        f8653b = map;
        map.put(d.DEFAULT, 0);
        f8653b.put(d.VERY_LOW, 1);
        f8653b.put(d.HIGHEST, 2);
        for (d dVar : f8653b.keySet()) {
            f8652a.append(((Integer) f8653b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f8653b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f8652a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
