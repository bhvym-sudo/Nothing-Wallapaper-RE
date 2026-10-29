package androidx.coordinatorlayout.widget;

import B0.f;
import B0.g;
import androidx.collection.P;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f12151a = new g(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f12152b = new P();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f12153c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f12154d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f12152b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f12151a.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f12151a.release(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f12152b.containsKey(obj) || !this.f12152b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f12152b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f12152b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f12152b.containsKey(obj)) {
            return;
        }
        this.f12152b.put(obj, null);
    }

    public void c() {
        int size = this.f12152b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f12152b.valueAt(i10);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f12152b.clear();
    }

    public boolean d(Object obj) {
        return this.f12152b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f12152b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f12152b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f12152b.valueAt(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f12152b.keyAt(i10));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f12153c.clear();
        this.f12154d.clear();
        int size = this.f12152b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f12152b.keyAt(i10), this.f12153c, this.f12154d);
        }
        return this.f12153c;
    }

    public boolean j(Object obj) {
        int size = this.f12152b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f12152b.valueAt(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
