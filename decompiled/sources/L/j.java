package L;

import I.C0865i;
import I.H;
import android.graphics.Outline;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f4266a = new j();

    private j() {
    }

    public final void a(Outline outline, H h10) {
        if (!(h10 instanceof C0865i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0865i) h10).a());
    }
}
