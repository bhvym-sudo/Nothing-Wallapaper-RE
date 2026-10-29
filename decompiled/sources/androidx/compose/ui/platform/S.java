package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p170r.S0;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f11775a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f11776r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p082i1.d f11777s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f11778t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z9, p082i1.d dVar, String str) {
            super(0);
            this.f11776r = z9;
            this.f11777s = dVar;
            this.f11778t = str;
        }

        public final void a() {
            if (this.f11776r) {
                this.f11777s.j(this.f11778t);
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f11779r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(Object obj) {
            return Boolean.valueOf(S.f(obj));
        }
    }

    public static final P b(View view, p082i1.f fVar) {
        Object parent = view.getParent();
        kotlin.jvm.internal.n.f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C.g.f470H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, fVar);
    }

    public static final P c(String str, p082i1.f fVar) {
        boolean z9;
        String str2 = p250z.b.class.getSimpleName() + ':' + str;
        p082i1.d savedStateRegistry = fVar.getSavedStateRegistry();
        Bundle bundleB = savedStateRegistry.b(str2);
        final p250z.b bVarA = p250z.d.a(bundleB != null ? h(bundleB) : null, b.f11779r);
        try {
            savedStateRegistry.h(str2, new i1.d.c() { // from class: androidx.compose.ui.platform.Q
                @Override // i1.d.c
                public final Bundle saveState() {
                    return S.d(bVarA);
                }
            });
            z9 = true;
        } catch (IllegalArgumentException unused) {
            z9 = false;
        }
        return new P(bVarA, new a(z9, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(p250z.b bVar) {
        return g(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof A.q) {
            A.q qVar = (A.q) obj;
            if (qVar.a() != S0.e() && qVar.a() != S0.g() && qVar.a() != S0.f()) {
                return false;
            }
            Object value = qVar.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof p079h8.e) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f11775a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    private static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.n.f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
