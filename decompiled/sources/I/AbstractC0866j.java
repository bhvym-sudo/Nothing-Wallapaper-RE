package I;

import android.graphics.Path;

/* JADX INFO: renamed from: I.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0866j {

    /* JADX INFO: renamed from: I.j$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2703a;

        static {
            int[] iArr = new int[H.b.values().length];
            try {
                iArr[H.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2703a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final H a() {
        return new C0865i(null, 1, 0 == true ? 1 : 0);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction d(H.b bVar) {
        int i10 = a.f2703a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new p079h8.m();
    }
}
