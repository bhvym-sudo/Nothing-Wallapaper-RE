package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1455f implements C8.c, InterfaceC1454e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f22793r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map f22794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final HashMap f22795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final HashMap f22796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final HashMap f22797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f22798w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Class f22799q;

    /* JADX INFO: renamed from: kotlin.jvm.internal.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            n.h(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C1455f.f22797v.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C1455f.f22797v.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            n.h(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) C1455f.f22798w.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C1455f.f22798w.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                n.e(simpleName);
                String strK0 = E8.i.K0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strK0 != null) {
                    return strK0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                n.e(simpleName);
                return E8.i.J0(simpleName, '$', null, 2, null);
            }
            n.e(simpleName);
            return E8.i.K0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            n.h(jClass, "jClass");
            Map map = C1455f.f22794s;
            n.f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return I.i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = p209u8.a.b(p209u8.a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List listN = AbstractC1444s.n(p219v8.a.class, p219v8.l.class, p219v8.p.class, p219v8.q.class, p219v8.r.class, p219v8.s.class, p219v8.t.class, p219v8.u.class, p219v8.v.class, p219v8.w.class, p219v8.b.class, p219v8.c.class, p219v8.d.class, p219v8.e.class, p219v8.f.class, p219v8.g.class, p219v8.h.class, p219v8.i.class, p219v8.j.class, p219v8.k.class, p219v8.m.class, p219v8.n.class, p219v8.o.class);
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(listN, 10));
        int i10 = 0;
        for (Object obj : listN) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            arrayList.add(p079h8.v.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f22794s = N.n(arrayList);
        HashMap map = new HashMap();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f22795t = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f22796u = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        n.g(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            n.e(str);
            sb.append(E8.i.M0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            p079h8.o oVarA = p079h8.v.a(sb.toString(), str + ".Companion");
            map3.put(oVarA.c(), oVarA.d());
        }
        for (Map.Entry entry : f22794s.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f22797v = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(N.d(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            n.e(str2);
            linkedHashMap.put(key, E8.i.M0(str2, '.', null, 2, null));
        }
        f22798w = linkedHashMap;
    }

    public C1455f(Class jClass) {
        n.h(jClass, "jClass");
        this.f22799q = jClass;
    }

    @Override // C8.c
    public String a() {
        return f22793r.a(e());
    }

    @Override // C8.c
    public String b() {
        return f22793r.b(e());
    }

    @Override // C8.c
    public boolean d(Object obj) {
        return f22793r.c(obj, e());
    }

    @Override // kotlin.jvm.internal.InterfaceC1454e
    public Class e() {
        return this.f22799q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1455f) && n.d(p209u8.a.b(this), p209u8.a.b((C8.c) obj));
    }

    public int hashCode() {
        return p209u8.a.b(this).hashCode();
    }

    public String toString() {
        return e() + " (Kotlin reflection is not available)";
    }
}
