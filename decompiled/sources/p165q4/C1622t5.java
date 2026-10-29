package p165q4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: q4.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1622t5 implements InterfaceC1602q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f24792a;

    public C1622t5(Context context, AbstractC1615s5 abstractC1615s5) {
        ArrayList arrayList = new ArrayList();
        this.f24792a = arrayList;
        if (abstractC1615s5.c()) {
            arrayList.add(new D5(context, abstractC1615s5));
        }
    }

    @Override // p165q4.InterfaceC1602q5
    public final void a(InterfaceC1595p5 interfaceC1595p5) {
        Iterator it = this.f24792a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1602q5) it.next()).a(interfaceC1595p5);
        }
    }
}
