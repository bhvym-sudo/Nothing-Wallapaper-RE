package F2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f1600a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1601b = false;

    public void a() {
        ArrayList arrayList = this.f1600a;
        if (arrayList != null) {
            this.f1600a = null;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Runnable) arrayList.get(i10)).run();
            }
        }
    }

    public void b() {
        this.f1601b = true;
        a();
    }
}
