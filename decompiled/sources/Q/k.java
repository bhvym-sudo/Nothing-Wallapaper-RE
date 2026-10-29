package Q;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f6524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6527e;

    public k(List list, e eVar) {
        this.f6523a = list;
        this.f6524b = eVar;
        MotionEvent motionEventC = c();
        this.f6525c = j.a(motionEventC != null ? motionEventC.getButtonState() : 0);
        MotionEvent motionEventC2 = c();
        this.f6526d = z.b(motionEventC2 != null ? motionEventC2.getMetaState() : 0);
        this.f6527e = a();
    }

    private final int a() {
        MotionEvent motionEventC = c();
        if (motionEventC == null) {
            List list = this.f6523a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t tVar = (t) list.get(i10);
                if (l.b(tVar)) {
                    return n.f6532a.e();
                }
                if (l.a(tVar)) {
                    return n.f6532a.d();
                }
            }
            return n.f6532a.c();
        }
        int actionMasked = motionEventC.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return n.f6532a.f();
                        case 9:
                            return n.f6532a.a();
                        case 10:
                            return n.f6532a.b();
                        default:
                            return n.f6532a.g();
                    }
                }
                return n.f6532a.c();
            }
            return n.f6532a.e();
        }
        return n.f6532a.d();
    }

    public final List b() {
        return this.f6523a;
    }

    public final MotionEvent c() {
        e eVar = this.f6524b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public final int d() {
        return this.f6527e;
    }

    public final void e(int i10) {
        this.f6527e = i10;
    }
}
