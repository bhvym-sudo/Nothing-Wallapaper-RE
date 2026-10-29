package p175r4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
