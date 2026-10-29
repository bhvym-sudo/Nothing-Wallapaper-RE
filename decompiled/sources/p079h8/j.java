package p079h8;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21854a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21854a = iArr;
        }
    }

    public static h a(l mode, p219v8.a initializer) {
        n.h(mode, "mode");
        n.h(initializer, "initializer");
        int i10 = a.f21854a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            AbstractC1457h abstractC1457h = null;
            return new t(initializer, abstractC1457h, i11, abstractC1457h);
        }
        if (i10 == 2) {
            return new s(initializer);
        }
        if (i10 == 3) {
            return new B(initializer);
        }
        throw new m();
    }

    public static h b(p219v8.a initializer) {
        n.h(initializer, "initializer");
        AbstractC1457h abstractC1457h = null;
        return new t(initializer, abstractC1457h, 2, abstractC1457h);
    }
}
