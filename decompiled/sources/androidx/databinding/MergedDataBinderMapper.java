package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set f12351a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f12352b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f12353c = new CopyOnWriteArrayList();

    private boolean e() {
        boolean z9 = false;
        for (String str : this.f12353c) {
            try {
                Class<?> cls = Class.forName(str);
                if (d.class.isAssignableFrom(cls)) {
                    d((d) cls.newInstance());
                    this.f12353c.remove(str);
                    z9 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z9;
    }

    @Override // androidx.databinding.d
    public g b(e eVar, View view, int i10) {
        Iterator it = this.f12352b.iterator();
        while (it.hasNext()) {
            g gVarB = ((d) it.next()).b(eVar, view, i10);
            if (gVarB != null) {
                return gVarB;
            }
        }
        if (e()) {
            return b(eVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.d
    public g c(e eVar, View[] viewArr, int i10) {
        Iterator it = this.f12352b.iterator();
        while (it.hasNext()) {
            g gVarC = ((d) it.next()).c(eVar, viewArr, i10);
            if (gVarC != null) {
                return gVarC;
            }
        }
        if (e()) {
            return c(eVar, viewArr, i10);
        }
        return null;
    }

    public void d(d dVar) {
        if (this.f12351a.add(dVar.getClass())) {
            this.f12352b.add(dVar);
            Iterator it = dVar.a().iterator();
            while (it.hasNext()) {
                d((d) it.next());
            }
        }
    }
}
