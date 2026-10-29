package p250z;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p089i8.AbstractC1444s;
import p089i8.N;
import p219v8.a;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f30564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f30566c;

    public c(Map map, l lVar) {
        Map mapR;
        this.f30564a = lVar;
        this.f30565b = (map == null || (mapR = N.r(map)) == null) ? new LinkedHashMap() : mapR;
        this.f30566c = new LinkedHashMap();
    }

    @Override // p250z.b
    public Map a() {
        Map mapR = N.r(this.f30565b);
        for (Map.Entry entry : this.f30566c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!b(objInvoke)) {
                        throw new IllegalStateException(a.a(objInvoke).toString());
                    }
                    mapR.put(str, AbstractC1444s.h(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = ((a) list.get(i10)).invoke();
                    if (objInvoke2 != null && !b(objInvoke2)) {
                        throw new IllegalStateException(a.a(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapR.put(str, arrayList);
            }
        }
        return mapR;
    }

    public boolean b(Object obj) {
        return ((Boolean) this.f30564a.f(obj)).booleanValue();
    }
}
