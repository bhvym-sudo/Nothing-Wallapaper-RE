package p015b4;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C1021a;
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
public final class D extends Fragment implements InterfaceC1186f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final WeakHashMap f14888t = new WeakHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f14889q = Collections.synchronizedMap(new C1021a());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14890r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bundle f14891s;

    public static D c(Activity activity) {
        D d10;
        WeakHashMap weakHashMap = f14888t;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (d10 = (D) weakReference.get()) != null) {
            return d10;
        }
        try {
            D d11 = (D) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (d11 == null || d11.isRemoving()) {
                d11 = new D();
                activity.getFragmentManager().beginTransaction().add(d11, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(d11));
            return d11;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // p015b4.InterfaceC1186f
    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f14889q.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f14889q.put(str, lifecycleCallback);
        if (this.f14890r > 0) {
            new e(Looper.getMainLooper()).post(new C(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f14889q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f14889q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14890r = 1;
        this.f14891s = bundle;
        for (Map.Entry entry : this.f14889q.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f14890r = 5;
        Iterator it = this.f14889q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f14890r = 3;
        Iterator it = this.f14889q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f14889q.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f14890r = 2;
        Iterator it = this.f14889q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f14890r = 4;
        Iterator it = this.f14889q.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // p015b4.InterfaceC1186f
    public final LifecycleCallback w(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f14889q.get(str));
    }

    @Override // p015b4.InterfaceC1186f
    public final Activity z() {
        return getActivity();
    }
}
