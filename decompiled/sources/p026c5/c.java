package p026c5;

import Y4.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15228a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f15229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f15230b;

        public a(Class cls, b bVar) {
            this.f15229a = cls;
            this.f15230b = bVar;
        }

        final b a() {
            return this.f15230b;
        }

        final Class b() {
            return this.f15229a;
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f15228a.put(aVar.b(), aVar.a());
        }
    }
}
