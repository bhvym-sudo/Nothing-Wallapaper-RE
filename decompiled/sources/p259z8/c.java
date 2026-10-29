package p259z8;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC1457h;
import p159p8.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f30803q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final c f30804r = b.f23791a.b();

    public static final class a extends c implements Serializable {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        @Override // p259z8.c
        public int b() {
            return c.f30804r.b();
        }

        @Override // p259z8.c
        public int c(int i10) {
            return c.f30804r.c(i10);
        }

        private a() {
        }
    }

    public abstract int b();

    public abstract int c(int i10);
}
