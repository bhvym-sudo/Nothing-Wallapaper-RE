package Q;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.r f6503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f6504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6505c;

    public e(androidx.collection.r rVar, v vVar) {
        this.f6503a = rVar;
        this.f6504b = vVar;
    }

    public final boolean a(long j9) {
        Object obj;
        List listB = this.f6504b.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i10);
            if (s.b(((w) obj).d(), j9)) {
                break;
            }
            i10++;
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar.a();
        }
        return false;
    }

    public final androidx.collection.r b() {
        return this.f6503a;
    }

    public final MotionEvent c() {
        return this.f6504b.a();
    }

    public final boolean d() {
        return this.f6505c;
    }
}
