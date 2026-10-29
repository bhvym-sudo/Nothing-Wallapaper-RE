package p170r;

import androidx.collection.w;
import java.util.List;

/* JADX INFO: renamed from: r.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1705t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25578a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC1717z f25579b = new a();

    /* JADX INFO: renamed from: r.t$a */
    public static final class a implements InterfaceC1717z {
        a() {
        }
    }

    public static final InterfaceC1698p a(InterfaceC1678f interfaceC1678f, AbstractC1700q abstractC1700q) {
        return new C1703s(abstractC1700q, interfaceC1678f, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(w wVar, int i10, int i11) {
        int iA = wVar.a(i10);
        wVar.j(i10, wVar.a(i11));
        wVar.j(i11, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List list, int i10, int i11) {
        Object obj = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, obj);
    }
}
