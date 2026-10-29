package androidx.lifecycle;

import I8.AbstractC0882h;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13334f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class[] f13335g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f13338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f13339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i1.d.c f13340e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Q a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new Q();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.n.g(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new Q(map);
            }
            ClassLoader classLoader = Q.class.getClassLoader();
            kotlin.jvm.internal.n.e(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new Q(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : Q.f13335g) {
                kotlin.jvm.internal.n.e(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public Q(Map initialState) {
        kotlin.jvm.internal.n.h(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13336a = linkedHashMap;
        this.f13337b = new LinkedHashMap();
        this.f13338c = new LinkedHashMap();
        this.f13339d = new LinkedHashMap();
        this.f13340e = new i1.d.c() { // from class: androidx.lifecycle.P
            @Override // i1.d.c
            public final Bundle saveState() {
                return Q.h(this.f13333a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle h(Q this$0) {
        kotlin.jvm.internal.n.h(this$0, "this$0");
        for (Map.Entry entry : p089i8.N.p(this$0.f13337b).entrySet()) {
            this$0.i((String) entry.getKey(), ((i1.d.c) entry.getValue()).saveState());
        }
        Set<String> setKeySet = this$0.f13336a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f13336a.get(str));
        }
        return p231x0.d.a(p079h8.v.a("keys", arrayList), p079h8.v.a("values", arrayList2));
    }

    public final boolean c(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        return this.f13336a.containsKey(key);
    }

    public final Object d(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        try {
            return this.f13336a.get(key);
        } catch (ClassCastException unused) {
            f(key);
            return null;
        }
    }

    public final I8.O e(String key, Object obj) {
        kotlin.jvm.internal.n.h(key, "key");
        Map map = this.f13339d;
        Object objA = map.get(key);
        if (objA == null) {
            if (!this.f13336a.containsKey(key)) {
                this.f13336a.put(key, obj);
            }
            objA = I8.Q.a(this.f13336a.get(key));
            this.f13339d.put(key, objA);
            map.put(key, objA);
        }
        I8.O oB = AbstractC0882h.b((I8.A) objA);
        kotlin.jvm.internal.n.f(oB, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return oB;
    }

    public final Object f(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        Object objRemove = this.f13336a.remove(key);
        androidx.appcompat.app.o.a(this.f13338c.remove(key));
        this.f13339d.remove(key);
        return objRemove;
    }

    public final i1.d.c g() {
        return this.f13340e;
    }

    public final void i(String key, Object obj) {
        kotlin.jvm.internal.n.h(key, "key");
        if (!f13334f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            kotlin.jvm.internal.n.e(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f13338c.get(key);
        H h10 = obj2 instanceof H ? (H) obj2 : null;
        if (h10 != null) {
            h10.n(obj);
        } else {
            this.f13336a.put(key, obj);
        }
        I8.A a10 = (I8.A) this.f13339d.get(key);
        if (a10 == null) {
            return;
        }
        a10.setValue(obj);
    }

    public Q() {
        this.f13336a = new LinkedHashMap();
        this.f13337b = new LinkedHashMap();
        this.f13338c = new LinkedHashMap();
        this.f13339d = new LinkedHashMap();
        this.f13340e = new i1.d.c() { // from class: androidx.lifecycle.P
            @Override // i1.d.c
            public final Bundle saveState() {
                return Q.h(this.f13333a);
            }
        };
    }
}
