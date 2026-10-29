package J2;

import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f3530a = new l() { // from class: J2.b
        @Override // p219v8.l
        public final Object f(Object obj) {
            return c.b((K2.b) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(K2.b bVar) {
        n.h(bVar, "<this>");
        return "Unknown message: " + bVar;
    }
}
