package p030d;

import D8.k;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f19273h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19274a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19275b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19276c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f19277d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f19278e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f19279f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f19280g = new Bundle();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p030d.b f19281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p040e.a f19282b;

        public a(p030d.b callback, p040e.a contract) {
            n.h(callback, "callback");
            n.h(contract, "contract");
            this.f19281a = callback;
            this.f19282b = contract;
        }

        public final p030d.b a() {
            return this.f19281a;
        }

        public final p040e.a b() {
            return this.f19282b;
        }
    }

    private static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1157q f19283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f19284b;

        public c(AbstractC1157q lifecycle) {
            n.h(lifecycle, "lifecycle");
            this.f19283a = lifecycle;
            this.f19284b = new ArrayList();
        }

        public final void a(InterfaceC1160u observer) {
            n.h(observer, "observer");
            this.f19283a.a(observer);
            this.f19284b.add(observer);
        }

        public final void b() {
            Iterator it = this.f19284b.iterator();
            while (it.hasNext()) {
                this.f19283a.d((InterfaceC1160u) it.next());
            }
            this.f19284b.clear();
        }
    }

    static final class d extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f19285r = new d();

        d() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(p259z8.c.f30803q.c(2147418112) + ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
        }
    }

    /* JADX INFO: renamed from: d.e$e, reason: collision with other inner class name */
    public static final class C0517e extends p030d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p040e.a f19288c;

        C0517e(String str, p040e.a aVar) {
            this.f19287b = str;
            this.f19288c = aVar;
        }

        @Override // p030d.c
        public p040e.a a() {
            return this.f19288c;
        }

        @Override // p030d.c
        public void c(Object obj, p161q0.c cVar) throws Exception {
            Object obj2 = e.this.f19275b.get(this.f19287b);
            p040e.a aVar = this.f19288c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f19277d.add(this.f19287b);
                try {
                    e.this.i(iIntValue, this.f19288c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f19277d.remove(this.f19287b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p030d.c
        public void d() {
            e.this.p(this.f19287b);
        }
    }

    public static final class f extends p030d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p040e.a f19291c;

        f(String str, p040e.a aVar) {
            this.f19290b = str;
            this.f19291c = aVar;
        }

        @Override // p030d.c
        public p040e.a a() {
            return this.f19291c;
        }

        @Override // p030d.c
        public void c(Object obj, p161q0.c cVar) throws Exception {
            Object obj2 = e.this.f19275b.get(this.f19290b);
            p040e.a aVar = this.f19291c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f19277d.add(this.f19290b);
                try {
                    e.this.i(iIntValue, this.f19291c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f19277d.remove(this.f19290b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p030d.c
        public void d() {
            e.this.p(this.f19290b);
        }
    }

    private final void d(int i10, String str) {
        this.f19274a.put(Integer.valueOf(i10), str);
        this.f19275b.put(str, Integer.valueOf(i10));
    }

    private final void g(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f19277d.contains(str)) {
            this.f19279f.remove(str);
            this.f19280g.putParcelable(str, new p030d.a(i10, intent));
        } else {
            aVar.a().a(aVar.b().c(i10, intent));
            this.f19277d.remove(str);
        }
    }

    private final int h() {
        for (Number number : k.i(d.f19285r)) {
            if (!this.f19274a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(e eVar, String str, p030d.b bVar, p040e.a aVar, InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
        n.h(interfaceC1163x, "<anonymous parameter 0>");
        n.h(event, "event");
        if (AbstractC1157q.a.ON_START != event) {
            if (AbstractC1157q.a.ON_STOP == event) {
                eVar.f19278e.remove(str);
                return;
            } else {
                if (AbstractC1157q.a.ON_DESTROY == event) {
                    eVar.p(str);
                    return;
                }
                return;
            }
        }
        eVar.f19278e.put(str, new a(bVar, aVar));
        if (eVar.f19279f.containsKey(str)) {
            Object obj = eVar.f19279f.get(str);
            eVar.f19279f.remove(str);
            bVar.a(obj);
        }
        p030d.a aVar2 = (p030d.a) p231x0.c.a(eVar.f19280g, str, p030d.a.class);
        if (aVar2 != null) {
            eVar.f19280g.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
    }

    private final void o(String str) {
        if (((Integer) this.f19275b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = (String) this.f19274a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, (a) this.f19278e.get(str));
        return true;
    }

    public final boolean f(int i10, Object obj) {
        String str = (String) this.f19274a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f19278e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f19280g.remove(str);
            this.f19279f.put(str, obj);
            return true;
        }
        p030d.b bVarA = aVar.a();
        n.f(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f19277d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public abstract void i(int i10, p040e.a aVar, Object obj, p161q0.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f19277d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f19280g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f19275b.containsKey(str)) {
                Integer num = (Integer) this.f19275b.remove(str);
                if (!this.f19280g.containsKey(str)) {
                    I.c(this.f19274a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            n.g(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            n.g(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        n.h(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f19275b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f19275b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f19277d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f19280g));
    }

    public final p030d.c l(final String key, InterfaceC1163x lifecycleOwner, final p040e.a contract, final p030d.b callback) {
        n.h(key, "key");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(contract, "contract");
        n.h(callback, "callback");
        AbstractC1157q lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().e(AbstractC1157q.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f19276c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC1160u() { // from class: d.d
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                e.n(this.f19269q, key, callback, contract, interfaceC1163x, aVar);
            }
        });
        this.f19276c.put(key, cVar);
        return new C0517e(key, contract);
    }

    public final p030d.c m(String key, p040e.a contract, p030d.b callback) {
        n.h(key, "key");
        n.h(contract, "contract");
        n.h(callback, "callback");
        o(key);
        this.f19278e.put(key, new a(callback, contract));
        if (this.f19279f.containsKey(key)) {
            Object obj = this.f19279f.get(key);
            this.f19279f.remove(key);
            callback.a(obj);
        }
        p030d.a aVar = (p030d.a) p231x0.c.a(this.f19280g, key, p030d.a.class);
        if (aVar != null) {
            this.f19280g.remove(key);
            callback.a(contract.c(aVar.b(), aVar.a()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer num;
        n.h(key, "key");
        if (!this.f19277d.contains(key) && (num = (Integer) this.f19275b.remove(key)) != null) {
            this.f19274a.remove(num);
        }
        this.f19278e.remove(key);
        if (this.f19279f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f19279f.get(key));
            this.f19279f.remove(key);
        }
        if (this.f19280g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((p030d.a) p231x0.c.a(this.f19280g, key, p030d.a.class)));
            this.f19280g.remove(key);
        }
        c cVar = (c) this.f19276c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f19276c.remove(key);
        }
    }
}
