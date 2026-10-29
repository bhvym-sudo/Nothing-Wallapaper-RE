package p015b4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C1021a;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p145o4.e;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractComponentCallbacksC1132q implements InterfaceC1186f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final WeakHashMap f14895t = new WeakHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f14896q = Collections.synchronizedMap(new C1021a());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14897r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bundle f14898s;

    public static F f0(AbstractActivityC1136v abstractActivityC1136v) {
        F f10;
        WeakHashMap weakHashMap = f14895t;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC1136v);
        if (weakReference != null && (f10 = (F) weakReference.get()) != null) {
            return f10;
        }
        try {
            F f11 = (F) abstractActivityC1136v.o0().k0("SupportLifecycleFragmentImpl");
            if (f11 == null || f11.isRemoving()) {
                f11 = new F();
                abstractActivityC1136v.o0().p().e(f11, "SupportLifecycleFragmentImpl").j();
            }
            weakHashMap.put(abstractActivityC1136v, new WeakReference(f11));
            return f11;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // p015b4.InterfaceC1186f
    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f14896q.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f14896q.put(str, lifecycleCallback);
        if (this.f14897r > 0) {
            new e(Looper.getMainLooper()).post(new E(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f14896q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f14896q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14897r = 1;
        this.f14898s = bundle;
        for (Map.Entry entry : this.f14896q.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onDestroy() {
        super.onDestroy();
        this.f14897r = 5;
        Iterator it = this.f14896q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onResume() {
        super.onResume();
        this.f14897r = 3;
        Iterator it = this.f14896q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f14896q.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onStart() {
        super.onStart();
        this.f14897r = 2;
        Iterator it = this.f14896q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onStop() {
        super.onStop();
        this.f14897r = 4;
        Iterator it = this.f14896q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // p015b4.InterfaceC1186f
    public final LifecycleCallback w(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f14896q.get(str));
    }

    @Override // p015b4.InterfaceC1186f
    public final /* synthetic */ Activity z() {
        return getActivity();
    }
}
