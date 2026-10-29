package p248y7;

import J7.i;
import android.view.ViewParent;

/* JADX INFO: renamed from: y7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2016s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f30549o = a.f30550a;

    /* JADX INFO: renamed from: y7.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f30550a = new a();

        private a() {
        }

        public final InterfaceC2016s a(ViewParent viewParent) {
            if (viewParent instanceof InterfaceC2016s) {
                return (InterfaceC2016s) viewParent;
            }
            if ((viewParent != null ? viewParent.getParent() : null) != null) {
                return a(viewParent.getParent());
            }
            return null;
        }
    }

    S1.a getClockViewFactory();

    i getLockScreenViewModel();

    void q(boolean z9, boolean z10);

    void x();
}
