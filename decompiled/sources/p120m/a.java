package p120m;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final HashMap f23074u = new HashMap();

    @Override // p120m.b
    protected b.c b(Object obj) {
        return (b.c) this.f23074u.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f23074u.containsKey(obj);
    }

    @Override // p120m.b
    public Object j(Object obj, Object obj2) {
        b.c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f23080r;
        }
        this.f23074u.put(obj, g(obj, obj2));
        return null;
    }

    @Override // p120m.b
    public Object m(Object obj) {
        Object objM = super.m(obj);
        this.f23074u.remove(obj);
        return objM;
    }

    public Map.Entry n(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f23074u.get(obj)).f23082t;
        }
        return null;
    }
}
