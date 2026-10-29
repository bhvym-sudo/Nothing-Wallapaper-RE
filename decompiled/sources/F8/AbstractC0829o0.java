package F8;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: F8.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0829o0 extends I implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f1890s = new a(null);

    /* JADX INFO: renamed from: F8.o0$a */
    public static final class a extends p129m8.b {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC0829o0 d(m8.i.b bVar) {
            if (bVar instanceof AbstractC0829o0) {
                return (AbstractC0829o0) bVar;
            }
            return null;
        }

        private a() {
            super(I.f1816r, new p219v8.l() { // from class: F8.n0
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return AbstractC0829o0.a.d((m8.i.b) obj);
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();
}
