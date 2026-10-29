package T3;

import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: renamed from: T3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0950d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC0950d f7655a = a().f(10485760).d(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION).b(10000).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: T3.d$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC0950d a();

        abstract a b(int i10);

        abstract a c(long j9);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j9);
    }

    AbstractC0950d() {
    }

    static a a() {
        return new C0947a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
