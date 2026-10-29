package I5;

import android.graphics.PorterDuff;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3118a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final PorterDuff.Mode a(int i10) {
            switch (i10) {
                case 0:
                    return PorterDuff.Mode.CLEAR;
                case 1:
                    return PorterDuff.Mode.SRC;
                case 2:
                    return PorterDuff.Mode.DST;
                case 3:
                    return PorterDuff.Mode.SRC_OVER;
                case 4:
                    return PorterDuff.Mode.DST_OVER;
                case 5:
                    return PorterDuff.Mode.SRC_IN;
                case 6:
                    return PorterDuff.Mode.DST_IN;
                case 7:
                    return PorterDuff.Mode.SRC_OUT;
                case 8:
                    return PorterDuff.Mode.DST_OUT;
                case 9:
                    return PorterDuff.Mode.SRC_ATOP;
                case 10:
                    return PorterDuff.Mode.DST_ATOP;
                case 11:
                    return PorterDuff.Mode.XOR;
                case 12:
                    return PorterDuff.Mode.ADD;
                case 13:
                    return PorterDuff.Mode.MULTIPLY;
                case 14:
                    return PorterDuff.Mode.SCREEN;
                case 15:
                    return PorterDuff.Mode.OVERLAY;
                case 16:
                    return PorterDuff.Mode.DARKEN;
                case 17:
                    return PorterDuff.Mode.LIGHTEN;
                default:
                    throw new UnsupportedOperationException("Error transformed PorterDuff type for parse.");
            }
        }

        private a() {
        }
    }
}
