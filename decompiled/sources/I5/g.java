package I5;

import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3120a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final ImageView.ScaleType a(int i10) {
            switch (i10) {
                case 0:
                    return ImageView.ScaleType.MATRIX;
                case 1:
                    return ImageView.ScaleType.FIT_XY;
                case 2:
                    return ImageView.ScaleType.FIT_START;
                case 3:
                    return ImageView.ScaleType.FIT_CENTER;
                case 4:
                    return ImageView.ScaleType.FIT_END;
                case 5:
                    return ImageView.ScaleType.CENTER;
                case 6:
                    return ImageView.ScaleType.CENTER_CROP;
                case 7:
                    return ImageView.ScaleType.CENTER_INSIDE;
                default:
                    throw new UnsupportedOperationException("Error transformed scale type for parse.");
            }
        }

        private a() {
        }
    }
}
