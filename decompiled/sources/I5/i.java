package I5;

import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3122a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final TextUtils.TruncateAt a(int i10) {
            if (i10 == 0) {
                return TextUtils.TruncateAt.START;
            }
            if (i10 == 1) {
                return TextUtils.TruncateAt.MIDDLE;
            }
            if (i10 == 2) {
                return TextUtils.TruncateAt.END;
            }
            if (i10 == 3) {
                return TextUtils.TruncateAt.MARQUEE;
            }
            throw new UnsupportedOperationException("Error transformed TruncateAt type for parse.");
        }

        private a() {
        }
    }
}
