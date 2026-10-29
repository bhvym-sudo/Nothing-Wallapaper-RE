package p210v;

import java.util.Map;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
final class c extends b implements Map.Entry, a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i f28044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object f28045t;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f28044s = iVar;
        this.f28045t = obj2;
    }

    public void a(Object obj) {
        this.f28045t = obj;
    }

    @Override // p210v.b, java.util.Map.Entry
    public Object getValue() {
        return this.f28045t;
    }

    @Override // p210v.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.f28044s.c(getKey(), obj);
        return value;
    }
}
