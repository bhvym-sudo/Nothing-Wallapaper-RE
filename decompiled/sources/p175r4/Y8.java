package p175r4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y8 implements V8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f26383a;

    public Y8(Context context, X8 x9) {
        ArrayList arrayList = new ArrayList();
        this.f26383a = arrayList;
        if (x9.c()) {
            arrayList.add(new n9(context, x9));
        }
    }

    @Override // p175r4.V8
    public final void a(U8 u9) {
        Iterator it = this.f26383a.iterator();
        while (it.hasNext()) {
            ((V8) it.next()).a(u9);
        }
    }
}
