package p009a8;

import java.util.ArrayList;
import p029c8.a;

/* JADX INFO: loaded from: classes2.dex */
public interface c {
    static boolean b(c cVar) {
        a aVar;
        ArrayList arrayList;
        if (cVar == null) {
            return false;
        }
        if (1 != cVar.a()) {
            return 2 == cVar.a() && (arrayList = (aVar = (a) cVar).f15244b) != null && arrayList.size() >= 1 && ((p029c8.c) aVar.f15244b.get(0)).f15249b != null && ((p029c8.c) aVar.f15244b.get(0)).f15249b.size() >= 1 && ((e) ((p029c8.c) aVar.f15244b.get(0)).f15249b.get(0)).f9961a != null;
        }
        p019b8.a aVar2 = (p019b8.a) cVar;
        ArrayList arrayList2 = aVar2.f14985b;
        return (arrayList2 == null || arrayList2.size() < 1 || ((e) aVar2.f14985b.get(0)).f9961a == null) ? false : true;
    }

    int a();

    int c();
}
