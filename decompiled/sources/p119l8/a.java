package p119l8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: l8.a$a, reason: collision with other inner class name */
    public static final class C0591a extends Thread {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p219v8.a f23073q;

        C0591a(p219v8.a aVar) {
            this.f23073q = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f23073q.invoke();
        }
    }

    public static final Thread a(boolean z9, boolean z10, ClassLoader classLoader, String str, int i10, p219v8.a block) {
        n.h(block, "block");
        C0591a c0591a = new C0591a(block);
        if (z10) {
            c0591a.setDaemon(true);
        }
        if (i10 > 0) {
            c0591a.setPriority(i10);
        }
        if (str != null) {
            c0591a.setName(str);
        }
        if (classLoader != null) {
            c0591a.setContextClassLoader(classLoader);
        }
        if (z9) {
            c0591a.start();
        }
        return c0591a;
    }

    public static /* synthetic */ Thread b(boolean z9, boolean z10, ClassLoader classLoader, String str, int i10, p219v8.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z9 = true;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z9, z10, classLoader, str2, i12, aVar);
    }
}
