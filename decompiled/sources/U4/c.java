package U4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7842b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f7844b = null;

        b(String str) {
            this.f7843a = str;
        }

        public c a() {
            return new c(this.f7843a, this.f7844b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f7844b)));
        }

        public b b(Annotation annotation) {
            if (this.f7844b == null) {
                this.f7844b = new HashMap();
            }
            this.f7844b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f7841a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f7842b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7841a.equals(cVar.f7841a) && this.f7842b.equals(cVar.f7842b);
    }

    public int hashCode() {
        return (this.f7841a.hashCode() * 31) + this.f7842b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f7841a + ", properties=" + this.f7842b.values() + "}";
    }

    private c(String str, Map map) {
        this.f7841a = str;
        this.f7842b = map;
    }
}
