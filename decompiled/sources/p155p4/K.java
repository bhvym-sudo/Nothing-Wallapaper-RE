package p155p4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f23703a;

    public K(Context context, J j9) {
        ArrayList arrayList = new ArrayList();
        this.f23703a = arrayList;
        if (j9.c()) {
            arrayList.add(new U(context, j9));
        }
    }
}
